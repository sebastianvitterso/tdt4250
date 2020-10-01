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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplans.Programme;
import studyplans.Semester;
import studyplans.StudyplansPackage;
import studyplans.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getSpecializationOf <em>Specialization Of</em>}</li>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplans.impl.ProgrammeImpl#getInUniversity <em>In University</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Programme> specializations;

	/**
	 * The cached value of the '{@link #getSpecializationOf() <em>Specialization Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationOf()
	 * @generated
	 * @ordered
	 */
	protected Programme specializationOf;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplansPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programme> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectWithInverseResolvingEList<Programme>(Programme.class, this, StudyplansPackage.PROGRAMME__SPECIALIZATIONS, StudyplansPackage.PROGRAMME__SPECIALIZATION_OF);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getSpecializationOf() {
		if (specializationOf != null && specializationOf.eIsProxy()) {
			InternalEObject oldSpecializationOf = (InternalEObject)specializationOf;
			specializationOf = (Programme)eResolveProxy(oldSpecializationOf);
			if (specializationOf != oldSpecializationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplansPackage.PROGRAMME__SPECIALIZATION_OF, oldSpecializationOf, specializationOf));
			}
		}
		return specializationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetSpecializationOf() {
		return specializationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializationOf(Programme newSpecializationOf, NotificationChain msgs) {
		Programme oldSpecializationOf = specializationOf;
		specializationOf = newSpecializationOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplansPackage.PROGRAMME__SPECIALIZATION_OF, oldSpecializationOf, newSpecializationOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializationOf(Programme newSpecializationOf) {
		if (newSpecializationOf != specializationOf) {
			NotificationChain msgs = null;
			if (specializationOf != null)
				msgs = ((InternalEObject)specializationOf).eInverseRemove(this, StudyplansPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			if (newSpecializationOf != null)
				msgs = ((InternalEObject)newSpecializationOf).eInverseAdd(this, StudyplansPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetSpecializationOf(newSpecializationOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.PROGRAMME__SPECIALIZATION_OF, newSpecializationOf, newSpecializationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, StudyplansPackage.PROGRAMME__SEMESTERS, StudyplansPackage.SEMESTER__IN_PROGRAMME);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University getInUniversity() {
		if (eContainerFeatureID() != StudyplansPackage.PROGRAMME__IN_UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInUniversity(University newInUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInUniversity, StudyplansPackage.PROGRAMME__IN_UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInUniversity(University newInUniversity) {
		if (newInUniversity != eInternalContainer() || (eContainerFeatureID() != StudyplansPackage.PROGRAMME__IN_UNIVERSITY && newInUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newInUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInUniversity != null)
				msgs = ((InternalEObject)newInUniversity).eInverseAdd(this, StudyplansPackage.UNIVERSITY__PROGRAMMES, University.class, msgs);
			msgs = basicSetInUniversity(newInUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.PROGRAMME__IN_UNIVERSITY, newInUniversity, newInUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				if (specializationOf != null)
					msgs = ((InternalEObject)specializationOf).eInverseRemove(this, StudyplansPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
				return basicSetSpecializationOf((Programme)otherEnd, msgs);
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInUniversity((University)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				return basicSetSpecializationOf(null, msgs);
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				return basicSetInUniversity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, StudyplansPackage.UNIVERSITY__PROGRAMMES, University.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplansPackage.PROGRAMME__CODE:
				return getCode();
			case StudyplansPackage.PROGRAMME__NAME:
				return getName();
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				if (resolve) return getSpecializationOf();
				return basicGetSpecializationOf();
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				return getInUniversity();
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
			case StudyplansPackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case StudyplansPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Programme>)newValue);
				return;
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				setSpecializationOf((Programme)newValue);
				return;
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				setInUniversity((University)newValue);
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
			case StudyplansPackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyplansPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				setSpecializationOf((Programme)null);
				return;
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				setInUniversity((University)null);
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
			case StudyplansPackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyplansPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyplansPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyplansPackage.PROGRAMME__SPECIALIZATION_OF:
				return specializationOf != null;
			case StudyplansPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyplansPackage.PROGRAMME__IN_UNIVERSITY:
				return getInUniversity() != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
