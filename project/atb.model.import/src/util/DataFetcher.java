package util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
		System.out.println("Begin.");
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
		
		List<String> urls = lineIds.stream().map(str -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/trip/" + str).collect(Collectors.toList());
		
		final long SLEEP_TIME = 20; // if we don't sleep, or the sleep time is too short, the requests might not go through.
		List<String> lineJsonStrings = getDataParallell(urls, SLEEP_TIME);
		List<JSONObject> lines = new ArrayList<>();
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, got " + lineJsonStrings.size() + " responses");
		
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
				
			}
		}

		System.out.println("\nBeginning stop-place requests, there are " + quays.size() + " of them");
		startTime = System.currentTimeMillis();
		
		List<String> stopPlaceUrls = quays.stream()
				.map(quay -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/stopSearch/" + quay.getString("busstopID"))
				.collect(Collectors.toList());
		
		List<JSONObject> stopPlaces = getDataParallell(stopPlaceUrls, SLEEP_TIME).stream()
				.map(jsonString -> new JSONObject(jsonString))
				.map(stopPlace -> {
					stopPlace.put("id", stopPlace.getJSONArray("items").getJSONObject(0).getString("stopPlaceId"));
					stopPlace.put("quays", stopPlace.getJSONArray("items"));
					return stopPlace;
				})
				.collect(Collectors.toList());
		
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, got " + stopPlaces.size() + " responses");
		
		
		System.out.println(stopPlaces.get(0));
		
		List<JSONObject> trips = lines.stream()
				.map(trip -> {
					List<JSONObject> stops = new ArrayList<>();
					
					trip.getJSONArray("stops")
							.forEach(stopObject -> {
								JSONObject stop = (JSONObject) stopObject;
								stop.put("$ref", stop.getString("busstopID"));
								stops.add(stop);
							});
					
					trip.put("stops", new JSONArray(stops));
					return trip;
				})
				.collect(Collectors.toList());
		
		System.out.println(trips.get(0));
		
		JSONObject container = new JSONObject();
		container.put("stopPlaces", new JSONArray(stopPlaces));
		container.put("trips", new JSONArray(trips));
		
		return container;
		
	}

}
