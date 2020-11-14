/**
 */
package atb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Atb#getBusstops <em>Busstops</em>}</li>
 *   <li>{@link atb.Atb#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link atb.Atb#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getAtb()
 * @model
 * @generated
 */
public interface Atb extends EObject {
	/**
	 * Returns the value of the '<em><b>Busstops</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busstops</em>' reference.
	 * @see #setBusstops(Busstops)
	 * @see atb.AtbPackage#getAtb_Busstops()
	 * @model
	 * @generated
	 */
	Busstops getBusstops();

	/**
	 * Sets the value of the '{@link atb.Atb#getBusstops <em>Busstops</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busstops</em>' reference.
	 * @see #getBusstops()
	 * @generated
	 */
	void setBusstops(Busstops value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' reference.
	 * @see #setPassengers(Passenger)
	 * @see atb.AtbPackage#getAtb_Passengers()
	 * @model
	 * @generated
	 */
	Passenger getPassengers();

	/**
	 * Sets the value of the '{@link atb.Atb#getPassengers <em>Passengers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers</em>' reference.
	 * @see #getPassengers()
	 * @generated
	 */
	void setPassengers(Passenger value);

	/**
	 * Returns the value of the '<em><b>Registrations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrations</em>' reference.
	 * @see #setRegistrations(Registration)
	 * @see atb.AtbPackage#getAtb_Registrations()
	 * @model
	 * @generated
	 */
	Registration getRegistrations();

	/**
	 * Sets the value of the '{@link atb.Atb#getRegistrations <em>Registrations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrations</em>' reference.
	 * @see #getRegistrations()
	 * @generated
	 */
	void setRegistrations(Registration value);

} // Atb
