package core;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.json.JSONObject;

import import_.ImportPackage;


public class Setup {
	
	
	public static void main(String[] args) {
		System.out.println("Begin.");
		JSONObject container = DataFetcher.getBusStops();
		System.out.println("Done fetching!");
		parseJsonToXmi(container);
		System.out.println("End.");
	}
	
	public static void parseJsonToXmi(JSONObject object) {
		try {
			object.put("eClass", "platform:/plugin/atb.model.import/model/import.ecore#//Container");
			
			EObject container = loadEObjectFromStringThroughFile(object.toString(), "src/core/data.json");
			
			saveEObjectToXmi(container, "src/core/data.xmi");
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
	
	private static EObject loadEObjectFromStringThroughFile(String model, String filePath) throws IOException { 
		saveToFile(model, filePath);
		return loadEObjectFromJson(filePath);
	}
	
	private static EObject loadEObjectFromJson(String filePath) throws IOException { 
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(ImportPackage.eINSTANCE.getNsURI(), ImportPackage.eINSTANCE);
		
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
		
	    return resource.getContents().get(0);
	}
	
	private static void saveEObjectToXmi(EObject eObject, String filePath) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource
				  (URI.createFileURI(filePath));
		resource.getContents().add(eObject);
		
		resource.save(null);
	}
	
	private static void saveToFile(String string, String filePath) throws IOException {
		FileWriter file = new FileWriter(filePath, StandardCharsets.UTF_8);
		file.write(string);
		file.close();
	}
	
	private static EObject loadEObjectFromXmi(String filePath) throws IOException { 
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(ImportPackage.eINSTANCE.getNsURI(), ImportPackage.eINSTANCE);
		
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	    Resource resource = resourceSet.getResource(URI.createFileURI("model/test.xmi"), true);
		
	    return resource.getContents().get(0);
	}
	private static void saveEObjectToJson(EObject eObject, String filePath) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
		
		Resource resource = resourceSet.createResource
				  (URI.createFileURI(filePath));
		resource.getContents().add(eObject);
		
		resource.save(null);
	}

}
