/**
 */
package atb;

import java.util.Date;

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
 *   <li>{@link atb.Registration#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link atb.Registration#getFrom <em>From</em>}</li>
 *   <li>{@link atb.Registration#getTo <em>To</em>}</li>
 *   <li>{@link atb.Registration#getDeparture <em>Departure</em>}</li>
 *   <li>{@link atb.Registration#getFromTime <em>From Time</em>}</li>
 *   <li>{@link atb.Registration#getToTime <em>To Time</em>}</li>
 *   <li>{@link atb.Registration#getLine <em>Line</em>}</li>
 *   <li>{@link atb.Registration#isInfected <em>Infected</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' reference.
	 * @see #setPassenger(Passenger)
	 * @see atb.AtbPackage#getRegistration_Passenger()
	 * @model required="true"
	 * @generated
	 */
	Passenger getPassenger();

	/**
	 * Sets the value of the '{@link atb.Registration#getPassenger <em>Passenger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger</em>' reference.
	 * @see #getPassenger()
	 * @generated
	 */
	void setPassenger(Passenger value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Busstops)
	 * @see atb.AtbPackage#getRegistration_From()
	 * @model
	 * @generated
	 */
	Busstops getFrom();

	/**
	 * Sets the value of the '{@link atb.Registration#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Busstops value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Busstops)
	 * @see atb.AtbPackage#getRegistration_To()
	 * @model
	 * @generated
	 */
	Busstops getTo();

	/**
	 * Sets the value of the '{@link atb.Registration#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Busstops value);

	/**
	 * Returns the value of the '<em><b>Departure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure</em>' reference.
	 * @see #setDeparture(Departure)
	 * @see atb.AtbPackage#getRegistration_Departure()
	 * @model
	 * @generated
	 */
	Departure getDeparture();

	/**
	 * Sets the value of the '{@link atb.Registration#getDeparture <em>Departure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure</em>' reference.
	 * @see #getDeparture()
	 * @generated
	 */
	void setDeparture(Departure value);

	/**
	 * Returns the value of the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Time</em>' attribute.
	 * @see #setFromTime(Date)
	 * @see atb.AtbPackage#getRegistration_FromTime()
	 * @model
	 * @generated
	 */
	Date getFromTime();

	/**
	 * Sets the value of the '{@link atb.Registration#getFromTime <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time</em>' attribute.
	 * @see #getFromTime()
	 * @generated
	 */
	void setFromTime(Date value);

	/**
	 * Returns the value of the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Time</em>' attribute.
	 * @see #setToTime(Date)
	 * @see atb.AtbPackage#getRegistration_ToTime()
	 * @model
	 * @generated
	 */
	Date getToTime();

	/**
	 * Sets the value of the '{@link atb.Registration#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(Date value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see atb.AtbPackage#getRegistration_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link atb.Registration#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Infected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infected</em>' attribute.
	 * @see #setInfected(boolean)
	 * @see atb.AtbPackage#getRegistration_Infected()
	 * @model
	 * @generated
	 */
	boolean isInfected();

	/**
	 * Sets the value of the '{@link atb.Registration#isInfected <em>Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infected</em>' attribute.
	 * @see #isInfected()
	 * @generated
	 */
	void setInfected(boolean value);

} // Registration
