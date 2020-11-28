/**
 */
package import_;

import org.eclipse.emf.common.util.EList;
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
	 * Returns the value of the '<em><b>Quays</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Quay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quays</em>' containment reference list.
	 * @see import_.ImportPackage#getContainer_Quays()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quay> getQuays();

	/**
	 * Returns the value of the '<em><b>Realtimes</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Realtime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtimes</em>' containment reference list.
	 * @see import_.ImportPackage#getContainer_Realtimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realtime> getRealtimes();

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Trip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' containment reference list.
	 * @see import_.ImportPackage#getContainer_Trips()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trip> getTrips();

} // Container
