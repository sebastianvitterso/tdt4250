/**
 */
package studyplans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplans.OpenSlot#getLevel <em>Level</em>}</li>
 *   <li>{@link studyplans.OpenSlot#getFields <em>Fields</em>}</li>
 *   <li>{@link studyplans.OpenSlot#isFromField <em>From Field</em>}</li>
 *   <li>{@link studyplans.OpenSlot#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see studyplans.StudyplansPackage#getOpenSlot()
 * @model
 * @generated
 */
public interface OpenSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see studyplans.StudyplansPackage#getOpenSlot_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link studyplans.OpenSlot#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link studyplans.Field}.
	 * The literals are from the enumeration {@link studyplans.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see studyplans.Field
	 * @see studyplans.StudyplansPackage#getOpenSlot_Fields()
	 * @model
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>From Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Field</em>' attribute.
	 * @see #setFromField(boolean)
	 * @see studyplans.StudyplansPackage#getOpenSlot_FromField()
	 * @model
	 * @generated
	 */
	boolean isFromField();

	/**
	 * Sets the value of the '{@link studyplans.OpenSlot#isFromField <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Field</em>' attribute.
	 * @see #isFromField()
	 * @generated
	 */
	void setFromField(boolean value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see studyplans.StudyplansPackage#getOpenSlot_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link studyplans.OpenSlot#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

} // OpenSlot
