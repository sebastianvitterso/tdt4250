/**
 */
package atb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Busstops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Busstops#getName <em>Name</em>}</li>
 *   <li>{@link atb.Busstops#getStopId <em>Stop Id</em>}</li>
 *   <li>{@link atb.Busstops#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link atb.Busstops#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link atb.Busstops#getLangitude <em>Langitude</em>}</li>
 *   <li>{@link atb.Busstops#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}</li>
 *   <li>{@link atb.Busstops#getDepartures <em>Departures</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getBusstops()
 * @model
 * @generated
 */
public interface Busstops extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atb.AtbPackage#getBusstops_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atb.Busstops#getName <em>Name</em>}' attribute.
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
	 * @see atb.AtbPackage#getBusstops_StopId()
	 * @model required="true"
	 * @generated
	 */
	int getStopId();

	/**
	 * Sets the value of the '{@link atb.Busstops#getStopId <em>Stop Id</em>}' attribute.
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
	 * @see atb.AtbPackage#getBusstops_NodeId()
	 * @model required="true"
	 * @generated
	 */
	int getNodeId();

	/**
	 * Sets the value of the '{@link atb.Busstops#getNodeId <em>Node Id</em>}' attribute.
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
	 * @see atb.AtbPackage#getBusstops_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link atb.Busstops#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Langitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langitude</em>' attribute.
	 * @see #setLangitude(float)
	 * @see atb.AtbPackage#getBusstops_Langitude()
	 * @model
	 * @generated
	 */
	float getLangitude();

	/**
	 * Sets the value of the '{@link atb.Busstops#getLangitude <em>Langitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langitude</em>' attribute.
	 * @see #getLangitude()
	 * @generated
	 */
	void setLangitude(float value);

	/**
	 * Returns the value of the '<em><b>Is Going Towards Centrum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Going Towards Centrum</em>' attribute.
	 * @see #setIsGoingTowardsCentrum(boolean)
	 * @see atb.AtbPackage#getBusstops_IsGoingTowardsCentrum()
	 * @model
	 * @generated
	 */
	boolean isIsGoingTowardsCentrum();

	/**
	 * Sets the value of the '{@link atb.Busstops#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Going Towards Centrum</em>' attribute.
	 * @see #isIsGoingTowardsCentrum()
	 * @generated
	 */
	void setIsGoingTowardsCentrum(boolean value);

	/**
	 * Returns the value of the '<em><b>Departures</b></em>' reference list.
	 * The list contents are of type {@link atb.Departure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures</em>' reference list.
	 * @see atb.AtbPackage#getBusstops_Departures()
	 * @model
	 * @generated
	 */
	EList<Departure> getDepartures();

} // Busstops
