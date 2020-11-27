/**
 */
package import_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.Container#getQuays <em>Quays</em>}</li>
 *   <li>{@link import_.Container#getRealtimes <em>Realtimes</em>}</li>
 *   <li>{@link import_.Container#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Quays</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quays</em>' containment reference.
	 * @see #setQuays(Quay)
	 * @see import_.ImportPackage#getContainer_Quays()
	 * @model containment="true"
	 * @generated
	 */
	Quay getQuays();

	/**
	 * Sets the value of the '{@link import_.Container#getQuays <em>Quays</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quays</em>' containment reference.
	 * @see #getQuays()
	 * @generated
	 */
	void setQuays(Quay value);

	/**
	 * Returns the value of the '<em><b>Realtimes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtimes</em>' containment reference.
	 * @see #setRealtimes(Realtime)
	 * @see import_.ImportPackage#getContainer_Realtimes()
	 * @model containment="true"
	 * @generated
	 */
	Realtime getRealtimes();

	/**
	 * Sets the value of the '{@link import_.Container#getRealtimes <em>Realtimes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realtimes</em>' containment reference.
	 * @see #getRealtimes()
	 * @generated
	 */
	void setRealtimes(Realtime value);

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' containment reference.
	 * @see #setTrips(Trip)
	 * @see import_.ImportPackage#getContainer_Trips()
	 * @model containment="true"
	 * @generated
	 */
	Trip getTrips();

	/**
	 * Sets the value of the '{@link import_.Container#getTrips <em>Trips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trips</em>' containment reference.
	 * @see #getTrips()
	 * @generated
	 */
	void setTrips(Trip value);

} // Container
