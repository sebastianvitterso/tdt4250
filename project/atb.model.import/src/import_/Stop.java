/**
 */
package import_;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.Stop#getDestination <em>Destination</em>}</li>
 *   <li>{@link import_.Stop#getBusstopID <em>Busstop ID</em>}</li>
 *   <li>{@link import_.Stop#getTime <em>Time</em>}</li>
 *   <li>{@link import_.Stop#getAimedDepartureTime <em>Aimed Departure Time</em>}</li>
 *   <li>{@link import_.Stop#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 *   <li>{@link import_.Stop#isRealtime <em>Realtime</em>}</li>
 *   <li>{@link import_.Stop#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link import_.Stop#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see import_.ImportPackage#getStop_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link import_.Stop#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Busstop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busstop ID</em>' attribute.
	 * @see #setBusstopID(String)
	 * @see import_.ImportPackage#getStop_BusstopID()
	 * @model
	 * @generated
	 */
	String getBusstopID();

	/**
	 * Sets the value of the '{@link import_.Stop#getBusstopID <em>Busstop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busstop ID</em>' attribute.
	 * @see #getBusstopID()
	 * @generated
	 */
	void setBusstopID(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see import_.ImportPackage#getStop_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link import_.Stop#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Aimed Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aimed Departure Time</em>' attribute.
	 * @see #setAimedDepartureTime(Date)
	 * @see import_.ImportPackage#getStop_AimedDepartureTime()
	 * @model
	 * @generated
	 */
	Date getAimedDepartureTime();

	/**
	 * Sets the value of the '{@link import_.Stop#getAimedDepartureTime <em>Aimed Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aimed Departure Time</em>' attribute.
	 * @see #getAimedDepartureTime()
	 * @generated
	 */
	void setAimedDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Expected Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Departure Time</em>' attribute.
	 * @see #setExpectedDepartureTime(Date)
	 * @see import_.ImportPackage#getStop_ExpectedDepartureTime()
	 * @model
	 * @generated
	 */
	Date getExpectedDepartureTime();

	/**
	 * Sets the value of the '{@link import_.Stop#getExpectedDepartureTime <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Departure Time</em>' attribute.
	 * @see #getExpectedDepartureTime()
	 * @generated
	 */
	void setExpectedDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Realtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtime</em>' attribute.
	 * @see #setRealtime(boolean)
	 * @see import_.ImportPackage#getStop_Realtime()
	 * @model
	 * @generated
	 */
	boolean isRealtime();

	/**
	 * Sets the value of the '{@link import_.Stop#isRealtime <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realtime</em>' attribute.
	 * @see #isRealtime()
	 * @generated
	 */
	void setRealtime(boolean value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see import_.ImportPackage#getStop_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link import_.Stop#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see import_.ImportPackage#getStop_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link import_.Stop#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // Stop
