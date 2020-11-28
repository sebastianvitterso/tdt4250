package util;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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

import import_.Container;
import import_.Departure;
import import_.ImportFactory;
import import_.ImportPackage;
import import_.Realtime;

import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;


public class Utility {
	
	public static void main(String[] args) {
		JSONObject container = DataFetcher.getBusStops();
		parseJsonToXmi(container);
	}
	
	public static void parseJsonToXmi(JSONObject object) {
		try {
			object.put("eClass", "platform:/plugin/atb/model/import.ecore#//Container");
			
			Container container = (Container)loadEObjectFromStringThroughFile(object.toString(), ImportPackage.eINSTANCE);
			
			saveEObjectToXmi(container);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static EObject loadEObjectFromString(String model, EPackage ePackage) throws IOException { 
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new JsonResourceFactory());
	    Resource resource = resourceSet.createResource(URI.createURI("*.extension"));
	    InputStream stream = new ByteArrayInputStream(model.getBytes(StandardCharsets.UTF_8));
		resource.load(stream, null);
	    
	    return resource.getContents().get(0);
	}
	
	private static EObject loadEObjectFromStringThroughFile(String model, EPackage ePackage) throws IOException { 
		saveToFile(model);
		return loadEObjectFromFile(ePackage);
	}
	
	private static EObject loadEObjectFromFile(EPackage ePackage) throws IOException { 
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    Resource resource = resourceSet.getResource(URI.createFileURI("src/util/data.json"), true);
		
	    return resource.getContents().get(0);
	}
	
	private static void saveEObjectToXmi(EObject eObject) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource
				  (URI.createFileURI("src/util/data.xmi"));
		resource.getContents().add(eObject);
		
		resource.save(null);
	}
	
	private static void saveToFile(String string) throws IOException {
		FileWriter file = new FileWriter("src/util/data.json", StandardCharsets.UTF_8);
		file.write(string);
		file.close();
	}

}
