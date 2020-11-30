/**
 */
package import_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link import_.StopPlace#getId <em>Id</em>}</li>
 *   <li>{@link import_.StopPlace#getQuays <em>Quays</em>}</li>
 *   <li>{@link import_.StopPlace#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 *
 * @see import_.ImportPackage#getStopPlace()
 * @model
 * @generated
 */
public interface StopPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see import_.ImportPackage#getStopPlace_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link import_.StopPlace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Quays</b></em>' containment reference list.
	 * The list contents are of type {@link import_.Quay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quays</em>' containment reference list.
	 * @see import_.ImportPackage#getStopPlace_Quays()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quay> getQuays();

	/**
	 * Returns the value of the '<em><b>Neighbours</b></em>' reference list.
	 * The list contents are of type {@link import_.StopPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbours</em>' reference list.
	 * @see import_.ImportPackage#getStopPlace_Neighbours()
	 * @model
	 * @generated
	 */
	EList<StopPlace> getNeighbours();

} // StopPlace
