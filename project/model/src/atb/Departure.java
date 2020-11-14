/**
 */
package atb;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Departure#getLine <em>Line</em>}</li>
 *   <li>{@link atb.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}</li>
 *   <li>{@link atb.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 *   <li>{@link atb.Departure#getDestination <em>Destination</em>}</li>
 *   <li>{@link atb.Departure#getDestinationStop <em>Destination Stop</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getDeparture()
 * @model
 * @generated
 */
public interface Departure extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see atb.AtbPackage#getDeparture_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link atb.Departure#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Registered Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Departure Time</em>' attribute.
	 * @see #setRegisteredDepartureTime(Date)
	 * @see atb.AtbPackage#getDeparture_RegisteredDepartureTime()
	 * @model
	 * @generated
	 */
	Date getRegisteredDepartureTime();

	/**
	 * Sets the value of the '{@link atb.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Departure Time</em>' attribute.
	 * @see #getRegisteredDepartureTime()
	 * @generated
	 */
	void setRegisteredDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Scheduled Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Departure Time</em>' attribute.
	 * @see #setScheduledDepartureTime(Date)
	 * @see atb.AtbPackage#getDeparture_ScheduledDepartureTime()
	 * @model
	 * @generated
	 */
	Date getScheduledDepartureTime();

	/**
	 * Sets the value of the '{@link atb.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Departure Time</em>' attribute.
	 * @see #getScheduledDepartureTime()
	 * @generated
	 */
	void setScheduledDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see atb.AtbPackage#getDeparture_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link atb.Departure#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Destination Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Stop</em>' reference.
	 * @see #setDestinationStop(Busstops)
	 * @see atb.AtbPackage#getDeparture_DestinationStop()
	 * @model
	 * @generated
	 */
	Busstops getDestinationStop();

	/**
	 * Sets the value of the '{@link atb.Departure#getDestinationStop <em>Destination Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Stop</em>' reference.
	 * @see #getDestinationStop()
	 * @generated
	 */
	void setDestinationStop(Busstops value);

} // Departure
