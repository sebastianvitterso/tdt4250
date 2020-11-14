/**
 */
package atb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see atb.AtbPackage
 * @generated
 */
public interface AtbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtbFactory eINSTANCE = atb.impl.AtbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atb</em>'.
	 * @generated
	 */
	Atb createAtb();

	/**
	 * Returns a new object of class '<em>Busstops</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Busstops</em>'.
	 * @generated
	 */
	Busstops createBusstops();

	/**
	 * Returns a new object of class '<em>Departure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departure</em>'.
	 * @generated
	 */
	Departure createDeparture();

	/**
	 * Returns a new object of class '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger</em>'.
	 * @generated
	 */
	Passenger createPassenger();

	/**
	 * Returns a new object of class '<em>Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration</em>'.
	 * @generated
	 */
	Registration createRegistration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtbPackage getAtbPackage();

} //AtbFactory
