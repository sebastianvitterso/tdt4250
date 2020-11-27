package util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import import_.ImportFactory;
import import_.ImportPackage;
import import_.Realtime;

import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;


public class Utility {

	public static String getData(String url) throws IOException {
		return new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
	}
	
	public static void main(String[] args) {
		getBusStops();
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
		
//		Realtime prinsen = ImportFactory.eINSTANCE.createRealtime();
//		prinsen.setBusStopID(prinsenP1Json.get("busStopID").toString());
//		prinsen.setBusStopName(prinsenP1Json.get("busStopName").toString());
//		prinsen.setLongitude((float)prinsenP1Json.get("longitude"));
//		prinsen.setLatitude((float)prinsenP1Json.get("latitude"));
//		System.out.println(prinsen);
		
		try {
			EObject test = loadEObjectFromString(getData(prinsenP1), ImportPackage.eINSTANCE);
			System.out.println(test);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		JSONArray prinsenP1Lines = prinsenP1Json.getJSONArray("departureForecasts");
//		JSONArray prinsenP2Lines = prinsenP2Json.getJSONArray("departureForecasts");
//		List<String> lineIds = new ArrayList<String>();
//		for(int i = 0; i < prinsenP1Lines.length(); i++) {
//			JSONObject line = prinsenP1Lines.getJSONObject(i);
//			lineIds.add(line.getString("tripId"));
//		}
//		for(int i = 0; i < prinsenP2Lines.length(); i++) {
//			JSONObject line = prinsenP2Lines.getJSONObject(i);
//			lineIds.add(line.getString("tripId"));
//		}
//		System.out.println("Done with initial call in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds, now awaits " + lineIds.size() + " subsequent calls");
//		
//		JSONArray connectedQuays = new JSONArray(); 
//		for (String lineId : lineIds) {
//			try {
//				String line = getData("https://bartebuss-prod.appspot.com/_ah/api/unified/v1/trip/" + lineId);
//				connectedQuays.put(new JSONObject(line));
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds");
//		
//		System.out.println(connectedQuays.length());
	}
	
	private static EObject loadEObjectFromString(String model, EPackage ePackage) throws IOException { 
	    ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new JsonResourceFactory());

	    resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
	    Resource resource = resourceSet.createResource(URI.createURI("*.extension"));
	    InputStream stream = new ByteArrayInputStream(model.getBytes(StandardCharsets.UTF_8));
	    resource.load(stream, null);

	    return resource.getContents().get(0);
	}

}
