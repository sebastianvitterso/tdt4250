/**
 */
package studyplans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplans.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link studyplans.Programme#getName <em>Name</em>}</li>
 *   <li>{@link studyplans.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyplans.Programme#getSpecializationOf <em>Specialization Of</em>}</li>
 *   <li>{@link studyplans.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplans.Programme#getInUniversity <em>In University</em>}</li>
 * </ul>
 *
 * @see studyplans.StudyplansPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyplans.StudyplansPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyplans.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyplans.StudyplansPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyplans.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link studyplans.Programme}.
	 * It is bidirectional and its opposite is '{@link studyplans.Programme#getSpecializationOf <em>Specialization Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see studyplans.StudyplansPackage#getProgramme_Specializations()
	 * @see studyplans.Programme#getSpecializationOf
	 * @model opposite="specializationOf"
	 * @generated
	 */
	EList<Programme> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Specialization Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link studyplans.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Of</em>' reference.
	 * @see #setSpecializationOf(Programme)
	 * @see studyplans.StudyplansPackage#getProgramme_SpecializationOf()
	 * @see studyplans.Programme#getSpecializations
	 * @model opposite="specializations"
	 * @generated
	 */
	Programme getSpecializationOf();

	/**
	 * Sets the value of the '{@link studyplans.Programme#getSpecializationOf <em>Specialization Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization Of</em>' reference.
	 * @see #getSpecializationOf()
	 * @generated
	 */
	void setSpecializationOf(Programme value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplans.Semester}.
	 * It is bidirectional and its opposite is '{@link studyplans.Semester#getInProgramme <em>In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplans.StudyplansPackage#getProgramme_Semesters()
	 * @see studyplans.Semester#getInProgramme
	 * @model opposite="inProgramme" containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>In University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyplans.University#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In University</em>' container reference.
	 * @see #setInUniversity(University)
	 * @see studyplans.StudyplansPackage#getProgramme_InUniversity()
	 * @see studyplans.University#getProgrammes
	 * @model opposite="programmes" transient="false"
	 * @generated
	 */
	University getInUniversity();

	/**
	 * Sets the value of the '{@link studyplans.Programme#getInUniversity <em>In University</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In University</em>' container reference.
	 * @see #getInUniversity()
	 * @generated
	 */
	void setInUniversity(University value);

} // Programme
