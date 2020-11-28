/**
 */
package import_;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.Realtime#getBusStopID <em>Bus Stop ID</em>}</li>
 *   <li>{@link import_.Realtime#getBusStopName <em>Bus Stop Name</em>}</li>
 *   <li>{@link import_.Realtime#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link import_.Realtime#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link import_.Realtime#getDepartureForecasts <em>Departure Forecasts</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getRealtime()
 * @model
 * @generated
 */
public interface Realtime extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Stop ID</em>' attribute.
	 * @see #setBusStopID(String)
	 * @see import_.ImportPackage#getRealtime_BusStopID()
	 * @model id="true"
	 * @generated
	 */
	String getBusStopID();

	/**
	 * Sets the value of the '{@link import_.Realtime#getBusStopID <em>Bus Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Stop ID</em>' attribute.
	 * @see #getBusStopID()
	 * @generated
	 */
	void setBusStopID(String value);

	/**
	 * Returns the value of the '<em><b>Bus Stop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Stop Name</em>' attribute.
	 * @see #setBusStopName(String)
	 * @see import_.ImportPackage#getRealtime_BusStopName()
	 * @model
	 * @generated
	 */
	String getBusStopName();

	/**
	 * Sets the value of the '{@link import_.Realtime#getBusStopName <em>Bus Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Stop Name</em>' attribute.
	 * @see #getBusStopName()
	 * @generated
	 */
	void setBusStopName(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see import_.ImportPackage#getRealtime_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link import_.Realtime#getLongitude <em>Longitude</em>}' attribute.
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
	 * @see import_.ImportPackage#getRealtime_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link import_.Realtime#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Departure Forecasts</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Departure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Forecasts</em>' containment reference list.
	 * @see import_.ImportPackage#getRealtime_DepartureForecasts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departure> getDepartureForecasts();

} // Realtime
