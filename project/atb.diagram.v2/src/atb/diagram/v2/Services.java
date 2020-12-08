package atb.diagram.v2;


import org.eclipse.emf.ecore.EObject;

import import_.Quay;


/**
 * The services class used by VSM.
 */
public class Services {
	
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	public static Quay fromQuay = null;
	
    public String getQuayLabel(EObject self) {
    	if(self instanceof Quay) {
    		Quay quay = (Quay) self;
    		return quay.getName() + " - " + quay.getCompassBearing();
    	}
    	return "TUST";
//		  aql:self.name +' - ' +self.compassBearing
//		  aql:self.myService('aegis')
    }
    
    public EObject setFromQuay(EObject self) {
    	Quay quay = (Quay) self;
    	fromQuay = quay;
        return quay;
    }
    public EObject getFromQuay(EObject self) {
    	return fromQuay;
    }
    
}
