package atb.diagram.v2;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import import_.Departure;
import import_.Quay;
import import_.Stop;
import import_.Trip;


/**
 * The services class used by VSM.
 */
public class Services {
	
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	public static Quay fromQuay = null;
	public static Quay toQuay = null;
	public static Departure clickedDeparture = null;
	
    public String getQuayLabel(EObject self) {
    	if(self instanceof Quay) {
    		Quay quay = (Quay) self;
    		return quay.getName() + " - " + getDirection(quay.getCompassBearing());
    	}
    	return "Failed";
    }
    
    public EObject setFromQuay(EObject self) {
    	Quay quay = (Quay) self;
    	fromQuay = quay;
        return quay;
    }
    public EObject getFromQuay(EObject self) {
    	return fromQuay;
    }
    
    public EObject setToQuay(EObject self) {
		toQuay = ((Stop) self).getQuay().get(0);
        return toQuay;
    }
    public EObject getToQuay(EObject self) {
    	return toQuay;
    }
    
    public EObject setDeparture(EObject self) {
    	Departure dep = (Departure) self;
    	clickedDeparture = dep;
        return dep;
    }
    public EObject getTripInClickedDeparture(EObject self) {
    	return clickedDeparture.getTrip().get(0);
    }
    
    public String getDirection(float bearing) {
    	if (bearing < 45 || bearing >= 315) {
    		return "N";
    	} else if (bearing < 135) {
    		return "E";
    	} else if (bearing < 225) {
    		return "S";
    	} else if (bearing < 315) {
    		return "W";
    	}
    	return "";
    }
    
}
