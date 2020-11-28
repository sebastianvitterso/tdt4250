/**
 */
package import_;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.Trip#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link import_.Trip#getDate <em>Date</em>}</li>
 *   <li>{@link import_.Trip#getLine <em>Line</em>}</li>
 *   <li>{@link import_.Trip#getDestination <em>Destination</em>}</li>
 *   <li>{@link import_.Trip#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getTrip()
 * @model
 * @generated
 */
public interface Trip extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip ID</em>' attribute.
	 * @see #setTripID(String)
	 * @see import_.ImportPackage#getTrip_TripID()
	 * @model
	 * @generated
	 */
	String getTripID();

	/**
	 * Sets the value of the '{@link import_.Trip#getTripID <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip ID</em>' attribute.
	 * @see #getTripID()
	 * @generated
	 */
	void setTripID(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see import_.ImportPackage#getTrip_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link import_.Trip#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see import_.ImportPackage#getTrip_Line()
	 * @model
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link import_.Trip#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see import_.ImportPackage#getTrip_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link import_.Trip#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see import_.ImportPackage#getTrip_Stops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stop> getStops();

} // Trip
