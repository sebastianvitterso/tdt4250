/**
 */
package studyplans.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import studyplans.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyplans.StudyplansPackage
 * @generated
 */
public class StudyplansValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyplansValidator INSTANCE = new StudyplansValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyplans";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyplansValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyplansPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyplansPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyplansPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyplansPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyplansPackage.AVAILABLE_COURSE:
				return validateAvailableCourse((AvailableCourse)value, diagnostics, context);
			case StudyplansPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyplansPackage.OPEN_SLOT:
				return validateOpenSlot((OpenSlot)value, diagnostics, context);
			case StudyplansPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case StudyplansPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_semesterNumberMatchesPositionInList(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the semesterNumberMatchesPositionInList constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_semesterNumberMatchesPositionInList(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		boolean numberMatchesIndex = ((Programme) semester.eContainer()).getSemesters().indexOf(semester) == semester.getNumber();
		
		if (numberMatchesIndex) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "semesterNumberMatchesPositionInList", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailableCourse(AvailableCourse availableCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(availableCourse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(availableCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateAvailableCourse_mandatoryAloneInGroup(availableCourse, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mandatoryAloneInGroup constraint of '<em>Available Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AVAILABLE_COURSE__MANDATORY_ALONE_IN_GROUP__EEXPRESSION = "aql:self->select(a | a.mandatory).eContainer().eContents()->select( c | c.groupId = self.groupId and c != self)->size() = 0";

	/**
	 * Validates the mandatoryAloneInGroup constraint of '<em>Available Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailableCourse_mandatoryAloneInGroup(AvailableCourse availableCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplansPackage.Literals.AVAILABLE_COURSE,
				 availableCourse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "mandatoryAloneInGroup",
				 AVAILABLE_COURSE__MANDATORY_ALONE_IN_GROUP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenSlot(OpenSlot openSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(openSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCode_Pattern(courseCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCode_Pattern
	 */
	public static final  PatternMatcher [][] COURSE_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z]{2,3}[0-9]{4}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode_Pattern(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(StudyplansPackage.Literals.COURSE_CODE, courseCode, COURSE_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyplansValidator
