/**
 */
package import_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.Registration#getName <em>Name</em>}</li>
 *   <li>{@link import_.Registration#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link import_.Registration#getFrom <em>From</em>}</li>
 *   <li>{@link import_.Registration#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see import_.ImportPackage#getRegistration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link import_.Registration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(Integer)
	 * @see import_.ImportPackage#getRegistration_PhoneNumber()
	 * @model dataType="import_.phoneNumber"
	 * @generated
	 */
	Integer getPhoneNumber();

	/**
	 * Sets the value of the '{@link import_.Registration#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Quay)
	 * @see import_.ImportPackage#getRegistration_From()
	 * @model
	 * @generated
	 */
	Quay getFrom();

	/**
	 * Sets the value of the '{@link import_.Registration#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Quay value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Quay)
	 * @see import_.ImportPackage#getRegistration_To()
	 * @model
	 * @generated
	 */
	Quay getTo();

	/**
	 * Sets the value of the '{@link import_.Registration#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Quay value);

} // Registration
