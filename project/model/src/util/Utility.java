package util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Utility {

	public static String getData(String url) throws IOException {
		return new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
	}
	
	public static void main(String[] args) {
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
		
		JSONArray connectedQuays = new JSONArray(); 
		for (String lineId : lineIds) {
			try {
				String line = getData("https://bartebuss-prod.appspot.com/_ah/api/unified/v1/trip/" + lineId);
				connectedQuays.put(new JSONObject(line));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done with those calls in " + (System.currentTimeMillis() - startTime)/1000f  + " seconds");
		
		System.out.println(connectedQuays);
		

	}

}
