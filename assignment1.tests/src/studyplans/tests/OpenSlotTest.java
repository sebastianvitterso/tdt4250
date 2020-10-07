/**
 */
package studyplans.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplans.OpenSlot;
import studyplans.StudyplansFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Open Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenSlotTest extends TestCase {

	/**
	 * The fixture for this Open Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenSlot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpenSlotTest.class);
	}

	/**
	 * Constructs a new Open Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSlotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Open Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OpenSlot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Open Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenSlot getFixture() {
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
		setFixture(StudyplansFactory.eINSTANCE.createOpenSlot());
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

} //OpenSlotTest
