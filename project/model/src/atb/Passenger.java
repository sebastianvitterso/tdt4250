/**
 */
package atb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Passenger#getFirstName <em>First Name</em>}</li>
 *   <li>{@link atb.Passenger#getLastName <em>Last Name</em>}</li>
 *   <li>{@link atb.Passenger#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see atb.AtbPackage#getPassenger_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link atb.Passenger#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see atb.AtbPackage#getPassenger_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link atb.Passenger#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(Integer)
	 * @see atb.AtbPackage#getPassenger_PhoneNumber()
	 * @model dataType="atb.phoneNumber"
	 * @generated
	 */
	Integer getPhoneNumber();

	/**
	 * Sets the value of the '{@link atb.Passenger#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(Integer value);

} // Passenger
