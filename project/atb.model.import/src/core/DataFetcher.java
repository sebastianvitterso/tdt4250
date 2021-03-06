package core;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataFetcher {
	
	private static ExecutorService executor = Executors.newCachedThreadPool();

	public static void main(String[] args) {
		getBusStops();
	}

	public static String getData(String url) throws IOException {
		Scanner s = new Scanner(new URL(url).openStream(), "UTF-8");
		String str = s.useDelimiter("\\A").next();
		s.close();
		return str;
	}
	
	public static Callable<String> callableGetData(String url) {
		return () -> {
			try {
				return getData(url);
			} catch (IOException e) {
				System.err.println("Request failed. URL: " + url);
				return null;
			}
		};
	}
	
	public static List<String> getDataParallell(List<String> urls, long sleepTime) {
		List<Future<String>> futures = new ArrayList<>();
		urls.stream().forEach(str -> {
			futures.add(executor.submit(callableGetData(str)));
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {}
		});
		
		List<String> data = new ArrayList<>();
		futures.stream().forEach(future -> {
			try {
				String result = future.get();
				if(result != null) {
					data.add(result);
				}
			} catch (InterruptedException | ExecutionException e) {
				System.err.println("Execution stopped.");
			}
		});
		return data;
	}
		
	
	public static JSONObject getBusStops() {
		long startTime = System.currentTimeMillis();
		String prinsenP1 = "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/realtime/NSR:Quay:71184";
		String prinsenP2 = "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/realtime/NSR:Quay:71181";
		JSONObject prinsenP1Json = null;
		JSONObject prinsenP2Json = null;
		try {
			prinsenP1Json = new JSONObject(getData(prinsenP1));
			prinsenP2Json = new JSONObject(getData(prinsenP2));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		JSONArray prinsenP1Lines = prinsenP1Json.getJSONArray("departureForecasts");
		JSONArray prinsenP2Lines = prinsenP2Json.getJSONArray("departureForecasts");
		List<String> lineIds = new ArrayList<String>();
		for(int i = 0; i < prinsenP1Lines.length(); i++) {
			JSONObject line = prinsenP1Lines.getJSONObject(i);
			lineIds.add(line.getString("tripId"));
		}
		for(int i = 0; i < prinsenP2Lines.length(); i++) {
			JSONObject line = prinsenP2Lines.getJSONObject(i);
			lineIds.add(line.getString("tripId"));
		}
		System.out.println("Done with initial call in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, now awaits " + lineIds.size() + " subsequent calls");
		startTime = System.currentTimeMillis();
		List<JSONObject> quays = new ArrayList<>();
		Set<String> quayIds = new HashSet<>();
		
		List<String> urls = lineIds.stream()
				.map(str -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/trip/" + str)
//				.limit(10)
				.collect(Collectors.toList());
		
		Set<String> tripIds = new HashSet<>(lineIds.stream()
//					.limit(10)
					.collect(Collectors.toList()
				)); // for lookup, later.
		
		final long SLEEP_TIME = 20; // if we don't sleep, or the sleep time is too short, the requests might not go through.
		List<String> lineJsonStrings = getDataParallell(urls, SLEEP_TIME);
		List<JSONObject> lines = new ArrayList<>();
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, got " + lineJsonStrings.size() + " responses");
		
		List<JSONObject> quayEdges = new ArrayList<>();
		
		for (String lineJsonString : lineJsonStrings) {
			JSONObject line = new JSONObject(lineJsonString);
			lines.add(line);
			JSONArray stops = line.getJSONArray("stops");
			for (int i = 0; i < stops.length(); i++) {
				JSONObject currentQuay = stops.getJSONObject(i);
				
				//check uniqueness
				if(!quayIds.contains(currentQuay.getString("busstopID"))) {
					quayIds.add(currentQuay.getString("busstopID"));
					quays.add(currentQuay);
				}
				
				if(i > 0) {
					JSONObject edge = new JSONObject();
					edge.put("from", stops.getJSONObject(i-1).getString("busstopID"));
					edge.put("to", stops.getJSONObject(i).getString("busstopID"));
					quayEdges.add(edge);
				}
				
			}
		}
		
		quayIds.clear();
		
		System.out.println("\nBeginning stop-place requests, there are " + quays.size() + " of them");
		startTime = System.currentTimeMillis();
		
		List<String> stopPlaceUrls = quays.stream()
				.map(quay -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/stopSearch/" + quay.getString("busstopID"))
				.collect(Collectors.toList());
		
		Map<String, String> quayIdToStopPlaceId = new HashMap<String,String>();
		
		Set<String> stopPlaceIds = new HashSet<String>();
		List<JSONObject> stopPlaces = getDataParallell(stopPlaceUrls, SLEEP_TIME).stream()
				.map(jsonString -> new JSONObject(jsonString))
				.map(stopPlace -> {
					stopPlace.put("quays", stopPlace.getJSONArray("items"));
					stopPlace.remove("items");
					stopPlace.put("id", stopPlace.getJSONArray("quays").getJSONObject(0).getString("stopPlaceId").replace(":", ""));
					
					stopPlace.getJSONArray("quays")
							.forEach(quayObj -> {
								JSONObject quay = (JSONObject) quayObj;
								quayIdToStopPlaceId.put(quay.getString("id"), stopPlace.getString("id"));
							});
					
					return stopPlace;
				})
				.filter(stopPlace -> {
					if(!stopPlaceIds.contains(stopPlace.getString("id"))) {
						stopPlaceIds.add(stopPlace.getString("id"));
						return true;
					}
					return false;
				})
				.collect(Collectors.toList());
		
		
		
		
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, got " + stopPlaces.size() + " responses");
		
		List<JSONObject> stopPlaceEdges = quayEdges.stream()
				.map(quayEdge -> {
					JSONObject edge = new JSONObject();
					edge.put("from", quayIdToStopPlaceId.get(quayEdge.get("from")));
					edge.put("to", quayIdToStopPlaceId.get(quayEdge.get("to")));
					return edge;
				})
				.collect(Collectors.toList());
		
		
		
		List<JSONObject> trips = lines.stream()
				.map(trip -> {
					List<JSONObject> stops = new ArrayList<>();
					List<String> stopNames = new ArrayList<>();
					trip.getJSONArray("stops")
							.forEach(stopObject -> {
								JSONObject stop = (JSONObject) stopObject;
								JSONObject quayRef = new JSONObject();
								quayRef.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//Quay");
								quayRef.put("$ref", ((JSONObject) stopObject).getString("busstopID").replace(":", ""));
								JSONArray arr = new JSONArray();
								arr.put(quayRef);
								stop.put("quay", arr);
								stop.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//Stop");
								stops.add(stop);
								stopNames.add(stop.getString("destination"));
							});
					trip.put("stops", new JSONArray(stops));
					String tripLine = trip.getString("tripID");
					trip.put("tripID", trip.getString("tripID").replace(":", "").replace("_", ""));
					if(stopNames.size() > 0) {
						trip.put("destination", stopNames.get(stopNames.size() - 1));
					}
					try {
						trip.put("line", Integer.parseInt(List.of(List.of(tripLine.split(":")).get(2).split("_")).get(0)));
					} catch (Exception e) {}
					return trip;
				})
				.collect(Collectors.toList());
		
		//Sorry for the mess!
		
		Map<String, JSONArray> neighbourMap = new HashMap<String, JSONArray>();
		Map<String, Set<String>> neighbourMapSet = new HashMap<String, Set<String>>();
		
		for (JSONObject stopPlaceEdge : stopPlaceEdges) {
			String from = stopPlaceEdge.getString("from");
			String to = stopPlaceEdge.getString("to");
			
			if(!neighbourMap.containsKey(from)) {
				neighbourMap.put(from, new JSONArray());
				neighbourMapSet.put(from, new HashSet<>());
			}
			if(!neighbourMapSet.get(from).contains(to)) {
				JSONObject neighbourFromTo = new JSONObject();
				neighbourFromTo.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//StopPlace");
				neighbourFromTo.put("$ref", to);
				neighbourMap.get(from).put(neighbourFromTo);	
				neighbourMapSet.get(from).add(to);
			}
			
			if(!neighbourMap.containsKey(to)) {
				neighbourMap.put(to, new JSONArray());
				neighbourMapSet.put(to, new HashSet<>());
			}
			if(!neighbourMapSet.get(to).contains(from)) {
				JSONObject neighbourToFrom = new JSONObject();
				neighbourToFrom.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//StopPlace");
				neighbourToFrom.put("$ref", from);
				neighbourMap.get(to).put(neighbourToFrom);	
				neighbourMapSet.get(to).add(from);
			}
		}
		
		
		stopPlaces = stopPlaces.stream()
				.map(stopPlace -> {
					stopPlace.put("neighbours", neighbourMap.get(stopPlace.getString("id")));
					JSONArray stopPlaceQuays = new JSONArray();
					stopPlace.getJSONArray("quays").forEach(quayObj -> {
						JSONObject quay = (JSONObject) quayObj;
						quay.put("id", quay.getString("id").replace(":", ""));
						if(!quayIds.contains(quay.getString("id"))) {
							quayIds.add(quay.getString("id"));
							stopPlaceQuays.put(quay);
						}
					});
					stopPlace.put("quays", stopPlaceQuays);
					return stopPlace;
				})
				.collect(Collectors.toList());
		
		
		// Get all the departures. RIP API. 
		// https://bartebuss-prod.appspot.com/_ah/api/unified/v1/realtime/NSR:Quay:71184
		System.out.println("About to get the departures for " + quays.size() + " quays!");
		startTime = System.currentTimeMillis();
		
		
		List<String> departureUrls = quays.stream()
				.map(quay -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/realtime/" + quay.getString("busstopID"))
				.collect(Collectors.toList());
		List<JSONObject> realtimes = getDataParallell(departureUrls, SLEEP_TIME).stream()
				.map(str -> new JSONObject(str))
				.collect(Collectors.toList());
		
		
		System.out.println("Got " + realtimes.size() + " departure-lists, after " + (System.currentTimeMillis() - startTime) / 1000 + " seconds!");
		
		Map<String, List<JSONObject>> quayDepartures = new HashMap<String, List<JSONObject>>();
		
		realtimes.stream()
			.forEach(realtime -> {
				String quayId = realtime.getString("busStopID").replace(":", "");
				if(!quayDepartures.containsKey(quayId)) {
					quayDepartures.put(quayId, new ArrayList<>());
				}
				
				List<JSONObject> objDepartures = new ArrayList<>();
				if(realtime.has("departureForecasts")) {
					realtime.getJSONArray("departureForecasts").forEach(depObj -> {
						JSONObject departure = (JSONObject) depObj;
						if(tripIds.contains(departure.getString("tripId"))) {
							JSONObject tripRef = new JSONObject();
							tripRef.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//Trip");
							tripRef.put("$ref", departure.getString("tripId").replace(":", "").replace("_", ""));
							JSONArray arr = new JSONArray();
							arr.put(tripRef);
							departure.put("trip", arr);
							quayDepartures.get(quayId).add(departure);
						}
					});
				}
			});
		
		stopPlaces.stream()
			.map(stopPlace -> {
				JSONArray stopPlaceQuays = new JSONArray();
				stopPlace.getJSONArray("quays").forEach(quayObj -> {
					JSONObject quay = (JSONObject) quayObj;
					quay.put("departureForecasts", new JSONArray(quayDepartures.get(quay.getString("id"))));
					stopPlaceQuays.put(quay);
				});
				stopPlace.put("quays", stopPlaceQuays);
				
				return stopPlace;
			})
			.collect(Collectors.toList());
		
//		System.out.println(stopPlaces.get(0).getJSONArray("quays").getJSONObject(0));
		
		
		JSONObject container = new JSONObject();
		container.put("stopPlaces", new JSONArray(stopPlaces));
		container.put("trips", new JSONArray(trips));
		container.put("realtimes", new JSONArray(realtimes));
		
		return container;
		
	}

}
