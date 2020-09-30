/**
 */
package studyplans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplans.AvailableCourse#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link studyplans.AvailableCourse#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link studyplans.AvailableCourse#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyplans.StudyplansPackage#getAvailableCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryAloneInGroup'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 mandatoryAloneInGroup='aql:self-&gt;select(a | a.mandatory).eContainer().eContents()-&gt;select( c | c.groupId = self.groupId and c != self)-&gt;size() = 0'"
 * @generated
 */
public interface AvailableCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see studyplans.StudyplansPackage#getAvailableCourse_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link studyplans.AvailableCourse#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see studyplans.StudyplansPackage#getAvailableCourse_GroupId()
	 * @model required="true"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link studyplans.AvailableCourse#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see studyplans.StudyplansPackage#getAvailableCourse_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyplans.AvailableCourse#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // AvailableCourse
