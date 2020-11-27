/**
 */
package import_;

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
 *   <li>{@link import_.Departure#getLine <em>Line</em>}</li>
 *   <li>{@link import_.Departure#getDestinationDisplay <em>Destination Display</em>}</li>
 *   <li>{@link import_.Departure#getOriginRef <em>Origin Ref</em>}</li>
 *   <li>{@link import_.Departure#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link import_.Departure#getDestinationRef <em>Destination Ref</em>}</li>
 *   <li>{@link import_.Departure#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link import_.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}</li>
 *   <li>{@link import_.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 *   <li>{@link import_.Departure#isIsRealTime <em>Is Real Time</em>}</li>
 *   <li>{@link import_.Departure#getTripId <em>Trip Id</em>}</li>
 *   <li>{@link import_.Departure#getGroupMapKey <em>Group Map Key</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getDeparture()
 * @model
 * @generated
 */
public interface Departure extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see import_.ImportPackage#getDeparture_Line()
	 * @model
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link import_.Departure#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

	/**
	 * Returns the value of the '<em><b>Destination Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Display</em>' attribute.
	 * @see #setDestinationDisplay(String)
	 * @see import_.ImportPackage#getDeparture_DestinationDisplay()
	 * @model
	 * @generated
	 */
	String getDestinationDisplay();

	/**
	 * Sets the value of the '{@link import_.Departure#getDestinationDisplay <em>Destination Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Display</em>' attribute.
	 * @see #getDestinationDisplay()
	 * @generated
	 */
	void setDestinationDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Origin Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Ref</em>' attribute.
	 * @see #setOriginRef(String)
	 * @see import_.ImportPackage#getDeparture_OriginRef()
	 * @model
	 * @generated
	 */
	String getOriginRef();

	/**
	 * Sets the value of the '{@link import_.Departure#getOriginRef <em>Origin Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Ref</em>' attribute.
	 * @see #getOriginRef()
	 * @generated
	 */
	void setOriginRef(String value);

	/**
	 * Returns the value of the '<em><b>Origin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Name</em>' attribute.
	 * @see #setOriginName(String)
	 * @see import_.ImportPackage#getDeparture_OriginName()
	 * @model
	 * @generated
	 */
	String getOriginName();

	/**
	 * Sets the value of the '{@link import_.Departure#getOriginName <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Name</em>' attribute.
	 * @see #getOriginName()
	 * @generated
	 */
	void setOriginName(String value);

	/**
	 * Returns the value of the '<em><b>Destination Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Ref</em>' attribute.
	 * @see #setDestinationRef(String)
	 * @see import_.ImportPackage#getDeparture_DestinationRef()
	 * @model
	 * @generated
	 */
	String getDestinationRef();

	/**
	 * Sets the value of the '{@link import_.Departure#getDestinationRef <em>Destination Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Ref</em>' attribute.
	 * @see #getDestinationRef()
	 * @generated
	 */
	void setDestinationRef(String value);

	/**
	 * Returns the value of the '<em><b>Destination Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Name</em>' attribute.
	 * @see #setDestinationName(String)
	 * @see import_.ImportPackage#getDeparture_DestinationName()
	 * @model
	 * @generated
	 */
	String getDestinationName();

	/**
	 * Sets the value of the '{@link import_.Departure#getDestinationName <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Name</em>' attribute.
	 * @see #getDestinationName()
	 * @generated
	 */
	void setDestinationName(String value);

	/**
	 * Returns the value of the '<em><b>Registered Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Departure Time</em>' attribute.
	 * @see #setRegisteredDepartureTime(Date)
	 * @see import_.ImportPackage#getDeparture_RegisteredDepartureTime()
	 * @model
	 * @generated
	 */
	Date getRegisteredDepartureTime();

	/**
	 * Sets the value of the '{@link import_.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}' attribute.
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
	 * @see import_.ImportPackage#getDeparture_ScheduledDepartureTime()
	 * @model
	 * @generated
	 */
	Date getScheduledDepartureTime();

	/**
	 * Sets the value of the '{@link import_.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Departure Time</em>' attribute.
	 * @see #getScheduledDepartureTime()
	 * @generated
	 */
	void setScheduledDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Is Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Real Time</em>' attribute.
	 * @see #setIsRealTime(boolean)
	 * @see import_.ImportPackage#getDeparture_IsRealTime()
	 * @model
	 * @generated
	 */
	boolean isIsRealTime();

	/**
	 * Sets the value of the '{@link import_.Departure#isIsRealTime <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Real Time</em>' attribute.
	 * @see #isIsRealTime()
	 * @generated
	 */
	void setIsRealTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Trip Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Id</em>' attribute.
	 * @see #setTripId(String)
	 * @see import_.ImportPackage#getDeparture_TripId()
	 * @model
	 * @generated
	 */
	String getTripId();

	/**
	 * Sets the value of the '{@link import_.Departure#getTripId <em>Trip Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Id</em>' attribute.
	 * @see #getTripId()
	 * @generated
	 */
	void setTripId(String value);

	/**
	 * Returns the value of the '<em><b>Group Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Map Key</em>' attribute.
	 * @see #setGroupMapKey(String)
	 * @see import_.ImportPackage#getDeparture_GroupMapKey()
	 * @model
	 * @generated
	 */
	String getGroupMapKey();

	/**
	 * Sets the value of the '{@link import_.Departure#getGroupMapKey <em>Group Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Map Key</em>' attribute.
	 * @see #getGroupMapKey()
	 * @generated
	 */
	void setGroupMapKey(String value);

} // Departure
