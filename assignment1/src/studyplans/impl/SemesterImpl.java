/**
 */
package studyplans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplans.AvailableCourse;
import studyplans.OpenSlot;
import studyplans.Semester;
import studyplans.StudyplansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplans.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link studyplans.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplans.impl.SemesterImpl#getOpenSlots <em>Open Slots</em>}</li>
 *   <li>{@link studyplans.impl.SemesterImpl#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailableCourse> courses;

	/**
	 * The cached value of the '{@link #getOpenSlots() <em>Open Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenSlot> openSlots;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplansPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvailableCourse> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<AvailableCourse>(AvailableCourse.class, this, StudyplansPackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenSlot> getOpenSlots() {
		if (openSlots == null) {
			openSlots = new EObjectContainmentEList<OpenSlot>(OpenSlot.class, this, StudyplansPackage.SEMESTER__OPEN_SLOTS);
		}
		return openSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getCredits() {
		float sum = 0;
		for (AvailableCourse availableCourse : getCourses()) {
			sum += availableCourse.getCourse().getCredits();
		}
		for (OpenSlot openSlot : getOpenSlots()) {
			sum += openSlot.getCredits();
		}
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplansPackage.SEMESTER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyplansPackage.SEMESTER__OPEN_SLOTS:
				return ((InternalEList<?>)getOpenSlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplansPackage.SEMESTER__NUMBER:
				return getNumber();
			case StudyplansPackage.SEMESTER__COURSES:
				return getCourses();
			case StudyplansPackage.SEMESTER__OPEN_SLOTS:
				return getOpenSlots();
			case StudyplansPackage.SEMESTER__CREDITS:
				return getCredits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyplansPackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case StudyplansPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends AvailableCourse>)newValue);
				return;
			case StudyplansPackage.SEMESTER__OPEN_SLOTS:
				getOpenSlots().clear();
				getOpenSlots().addAll((Collection<? extends OpenSlot>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyplansPackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case StudyplansPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case StudyplansPackage.SEMESTER__OPEN_SLOTS:
				getOpenSlots().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyplansPackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case StudyplansPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyplansPackage.SEMESTER__OPEN_SLOTS:
				return openSlots != null && !openSlots.isEmpty();
			case StudyplansPackage.SEMESTER__CREDITS:
				return getCredits() != CREDITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl