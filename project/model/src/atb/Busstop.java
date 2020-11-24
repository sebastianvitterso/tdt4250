/**
 */
package atb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Busstop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Busstop#getName <em>Name</em>}</li>
 *   <li>{@link atb.Busstop#getStopId <em>Stop Id</em>}</li>
 *   <li>{@link atb.Busstop#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link atb.Busstop#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link atb.Busstop#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link atb.Busstop#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}</li>
 *   <li>{@link atb.Busstop#getDepartures <em>Departures</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getBusstop()
 * @model
 * @generated
 */
public interface Busstop extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atb.AtbPackage#getBusstop_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atb.Busstop#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stop Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Id</em>' attribute.
	 * @see #setStopId(int)
	 * @see atb.AtbPackage#getBusstop_StopId()
	 * @model required="true"
	 * @generated
	 */
	int getStopId();

	/**
	 * Sets the value of the '{@link atb.Busstop#getStopId <em>Stop Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Id</em>' attribute.
	 * @see #getStopId()
	 * @generated
	 */
	void setStopId(int value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(int)
	 * @see atb.AtbPackage#getBusstop_NodeId()
	 * @model required="true"
	 * @generated
	 */
	int getNodeId();

	/**
	 * Sets the value of the '{@link atb.Busstop#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(int value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see atb.AtbPackage#getBusstop_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link atb.Busstop#getLongitude <em>Longitude</em>}' attribute.
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
	 * @see atb.AtbPackage#getBusstop_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link atb.Busstop#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Is Going Towards Centrum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Going Towards Centrum</em>' attribute.
	 * @see #setIsGoingTowardsCentrum(boolean)
	 * @see atb.AtbPackage#getBusstop_IsGoingTowardsCentrum()
	 * @model
	 * @generated
	 */
	boolean isIsGoingTowardsCentrum();

	/**
	 * Sets the value of the '{@link atb.Busstop#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Going Towards Centrum</em>' attribute.
	 * @see #isIsGoingTowardsCentrum()
	 * @generated
	 */
	void setIsGoingTowardsCentrum(boolean value);

	/**
	 * Returns the value of the '<em><b>Departures</b></em>' containment reference list.
	 * The list contents are of type {@link atb.Departure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures</em>' containment reference list.
	 * @see atb.AtbPackage#getBusstop_Departures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departure> getDepartures();

} // Busstop
