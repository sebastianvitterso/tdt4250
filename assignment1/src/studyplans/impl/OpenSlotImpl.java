/**
 */
package studyplans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import studyplans.Field;
import studyplans.OpenSlot;
import studyplans.StudyplansPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplans.impl.OpenSlotImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link studyplans.impl.OpenSlotImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link studyplans.impl.OpenSlotImpl#isFromField <em>From Field</em>}</li>
 *   <li>{@link studyplans.impl.OpenSlotImpl#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenSlotImpl extends MinimalEObjectImpl.Container implements OpenSlot {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #isFromField() <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFromField() <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromField()
	 * @generated
	 * @ordered
	 */
	protected boolean fromField = FROM_FIELD_EDEFAULT;

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
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplansPackage.Literals.OPEN_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.OPEN_SLOT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EDataTypeUniqueEList<Field>(Field.class, this, StudyplansPackage.OPEN_SLOT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromField() {
		return fromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromField(boolean newFromField) {
		boolean oldFromField = fromField;
		fromField = newFromField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.OPEN_SLOT__FROM_FIELD, oldFromField, fromField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplansPackage.OPEN_SLOT__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplansPackage.OPEN_SLOT__LEVEL:
				return getLevel();
			case StudyplansPackage.OPEN_SLOT__FIELDS:
				return getFields();
			case StudyplansPackage.OPEN_SLOT__FROM_FIELD:
				return isFromField();
			case StudyplansPackage.OPEN_SLOT__CREDITS:
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
			case StudyplansPackage.OPEN_SLOT__LEVEL:
				setLevel((Integer)newValue);
				return;
			case StudyplansPackage.OPEN_SLOT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case StudyplansPackage.OPEN_SLOT__FROM_FIELD:
				setFromField((Boolean)newValue);
				return;
			case StudyplansPackage.OPEN_SLOT__CREDITS:
				setCredits((Float)newValue);
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
			case StudyplansPackage.OPEN_SLOT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyplansPackage.OPEN_SLOT__FIELDS:
				getFields().clear();
				return;
			case StudyplansPackage.OPEN_SLOT__FROM_FIELD:
				setFromField(FROM_FIELD_EDEFAULT);
				return;
			case StudyplansPackage.OPEN_SLOT__CREDITS:
				setCredits(CREDITS_EDEFAULT);
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
			case StudyplansPackage.OPEN_SLOT__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StudyplansPackage.OPEN_SLOT__FIELDS:
				return fields != null && !fields.isEmpty();
			case StudyplansPackage.OPEN_SLOT__FROM_FIELD:
				return fromField != FROM_FIELD_EDEFAULT;
			case StudyplansPackage.OPEN_SLOT__CREDITS:
				return credits != CREDITS_EDEFAULT;
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
		result.append(" (level: ");
		result.append(level);
		result.append(", fields: ");
		result.append(fields);
		result.append(", fromField: ");
		result.append(fromField);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //OpenSlotImpl
