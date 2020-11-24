package util;

import java.net.URL;
import java.util.Scanner;

public class Utility {

	public static String getData(String url) throws Exception {
		return new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
	}
	
	public static void main(String[] args) {
		String prinsenP2 = "https://bartebuss.no/NSR:Quay:71181";
		
		
	}

}
