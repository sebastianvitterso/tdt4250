/**
 */
package studyplans.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplans.Programme;
import studyplans.StudyplansFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammeTest extends TestCase {

	/**
	 * The fixture for this Programme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Programme fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammeTest.class);
	}

	/**
	 * Constructs a new Programme test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Programme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Programme fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Programme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Programme getFixture() {
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
		setFixture(StudyplansFactory.eINSTANCE.createProgramme());
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

} //ProgrammeTest
