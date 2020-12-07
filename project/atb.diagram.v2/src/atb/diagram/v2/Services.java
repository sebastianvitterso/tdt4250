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
    public String myService(EObject self, String arg) {
//      Quay quay = (Quay) self;
      return arg;
//      return quay.toString();
      //aql:self.name +' - ' +self.compassBearing
    }
    
}
