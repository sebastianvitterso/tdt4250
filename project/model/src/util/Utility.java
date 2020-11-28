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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;


import atb.AtbFactory;
import atb.Bussfirm;
import atb.Busstop;
import atb.Busstops;

public class Utility {
	
	private static ExecutorService executor = Executors.newCachedThreadPool();

	public static String getData(String url) throws IOException {
		return new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
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
	
	public static void main(String[] args) {
		getBusStops();
//		testEmfJson1();

	}
		
	private static void testEmfJson() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
		
		Resource resource = resourceSet.createResource
				  (URI.createFileURI("src/util/data.json"));
		
		Busstops prinsens = AtbFactory.eINSTANCE.createBusstops();
		prinsens.setName("Prinsensgate");
		prinsens.setNodeId(1);
		prinsens.setStopId(1);
		System.out.println(prinsens);
		
		resource.getContents().add(prinsens);
		try {
			resource.save(null);
			System.out.println("Saved");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			resource.load(null);
			System.out.println("Load");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Busstops prinsens1 = (Busstops) resource.getContents().get(0);
		System.out.println(prinsens1);
		
	}
	
	private static void testEmfJson1() {
		ObjectMapper mapper = EMFModule.setupDefaultMapper();
		
		JsonResourceFactory factory = new JsonResourceFactory(mapper);
		mapper = factory.getMapper();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("json", factory);
		Resource resource = resourceSet.createResource
				  (URI.createFileURI("src/util/data.json"));
		
		Busstops prinsens = AtbFactory.eINSTANCE.createBusstops();
		prinsens.setName("Prinsensgate");
		prinsens.setNodeId(1);
		prinsens.setStopId(1);
		resource.getContents().add(prinsens);
		try {
			String jsonString = mapper.writeValueAsString(resource);
			JsonNode jsonNode = mapper.valueToTree(prinsens);
			String jsonString2 = mapper.writeValueAsString(prinsens);
			System.out.println(jsonString2);
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		JsonNode data = mapper.valueToTree(prinsens);
//		String json = "{ \"stopId\" : \"1\" } ";


//		try {
//			JsonNode data = mapper.readTree(json);
////			resource = mapper
////			  .reader()
////				.withAttribute(EMFContext.Attributes.RESOURCE_SET, resourceSet)
////			  .withAttribute(EMFContext.Attributes.RESOURCE_URI, "src/main/resources/data.json")
////				.forType(Resource.class)
////				.readValue(data);
//			
//			Busstops busstops = mapper.reader()
//					.withAttribute(EMFContext.Attributes.RESOURCE, resource)
//					.forType(Busstops.class)
//					.readValue(data);
//			
//			System.out.println(busstops.getName());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	
	private static void getBusStops() {
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
		JSONArray lines = new JSONArray();
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, got " + lineJsonStrings.size() + " responses");
		
		for (String lineJsonString : lineJsonStrings) {
			JSONObject line = new JSONObject(lineJsonString);
			lines.put(line);
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
		
		List<String> quaySearchUrls = quays.stream()
				.map(quay -> "https://bartebuss-prod.appspot.com/_ah/api/unified/v1/stopSearch/NSR:Quay:71184" + quay.getString("busstopID"))
				.collect(Collectors.toList());
		
//		List<String> 
		
		for(JSONObject quay : quays) {
			
		}
		
		System.out.println(quays.size());
		
		
		
		JSONObject container = new JSONObject();
		
		
		
		
		
	}

}
