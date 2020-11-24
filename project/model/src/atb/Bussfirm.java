/**
 */
package atb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bussfirm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atb.Bussfirm#getName <em>Name</em>}</li>
 *   <li>{@link atb.Bussfirm#getBusstops <em>Busstops</em>}</li>
 *   <li>{@link atb.Bussfirm#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link atb.Bussfirm#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @see atb.AtbPackage#getBussfirm()
 * @model
 * @generated
 */
public interface Bussfirm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atb.AtbPackage#getBussfirm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atb.Bussfirm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Busstops</b></em>' containment reference list.
	 * The list contents are of type {@link atb.Busstop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busstops</em>' containment reference list.
	 * @see atb.AtbPackage#getBussfirm_Busstops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Busstop> getBusstops();

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link atb.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' containment reference list.
	 * @see atb.AtbPackage#getBussfirm_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Passenger> getPassengers();

	/**
	 * Returns the value of the '<em><b>Registrations</b></em>' containment reference list.
	 * The list contents are of type {@link atb.Registration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrations</em>' containment reference list.
	 * @see atb.AtbPackage#getBussfirm_Registrations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Registration> getRegistrations();

} // Bussfirm
