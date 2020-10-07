/**
 */
package studyplans.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplans.AvailableCourse;
import studyplans.StudyplansFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Available Course</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvailableCourseTest extends TestCase {

	/**
	 * The fixture for this Available Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableCourse fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvailableCourseTest.class);
	}

	/**
	 * Constructs a new Available Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableCourseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Available Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvailableCourse fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Available Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableCourse getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyplansFactory.eINSTANCE.createAvailableCourse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AvailableCourseTest
