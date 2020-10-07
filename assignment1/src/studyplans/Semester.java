/**
 */
package studyplans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplans.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link studyplans.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplans.Semester#getOpenSlots <em>Open Slots</em>}</li>
 *   <li>{@link studyplans.Semester#getCredits <em>Credits</em>}</li>
 *   <li>{@link studyplans.Semester#getInProgramme <em>In Programme</em>}</li>
 * </ul>
 *
 * @see studyplans.StudyplansPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterNumberMatchesPositionInList'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see studyplans.StudyplansPackage#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link studyplans.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyplans.AvailableCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see studyplans.StudyplansPackage#getSemester_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AvailableCourse> getCourses();

	/**
	 * Returns the value of the '<em><b>Open Slots</b></em>' containment reference list.
	 * The list contents are of type {@link studyplans.OpenSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Slots</em>' containment reference list.
	 * @see studyplans.StudyplansPackage#getSemester_OpenSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpenSlot> getOpenSlots();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see studyplans.StudyplansPackage#getSemester_Credits()
	 * @model default="30" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Returns the value of the '<em><b>In Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyplans.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Programme</em>' container reference.
	 * @see #setInProgramme(Programme)
	 * @see studyplans.StudyplansPackage#getSemester_InProgramme()
	 * @see studyplans.Programme#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Programme getInProgramme();

	/**
	 * Sets the value of the '{@link studyplans.Semester#getInProgramme <em>In Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Programme</em>' container reference.
	 * @see #getInProgramme()
	 * @generated
	 */
	void setInProgramme(Programme value);

} // Semester
