/**
 */
package studyplans.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyplans.AvailableCourse;
import studyplans.Course;
import studyplans.Semester;
import studyplans.StudyplansFactory;
import studyplans.University;
import studyplans.impl.AvailableCourseImpl;
import studyplans.impl.CourseImpl;
import studyplans.impl.UniversityImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link studyplans.Semester#getCredits() <em>Credits</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterTest extends TestCase {

	/**
	 * The fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterTest.class);
	}

	/**
	 * Constructs a new Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester getFixture() {
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
		setFixture(StudyplansFactory.eINSTANCE.createSemester());
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

	/**
	 * Tests the '{@link studyplans.Semester#getCredits() <em>Credits</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException 
	 * @see studyplans.Semester#getCredits()
	 * @generated NOT
	 */
	public void testGetCredits() throws IOException {
		
		Course course = new CourseImpl();
		course.setCredits(7.5f);
		
		AvailableCourse avCourse = new AvailableCourseImpl();
		avCourse.setCourse(course);
		
		fixture.getCourses().add(avCourse);
		
		
		assertEquals(7.5f, fixture.getCredits(), 0);
	}

} //SemesterTest
