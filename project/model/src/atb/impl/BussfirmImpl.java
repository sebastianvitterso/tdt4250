/**
 */
package atb.impl;

import atb.AtbPackage;
import atb.Bussfirm;
import atb.Busstop;
import atb.Passenger;
import atb.Registration;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bussfirm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atb.impl.BussfirmImpl#getName <em>Name</em>}</li>
 *   <li>{@link atb.impl.BussfirmImpl#getBusstops <em>Busstops</em>}</li>
 *   <li>{@link atb.impl.BussfirmImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link atb.impl.BussfirmImpl#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BussfirmImpl extends MinimalEObjectImpl.Container implements Bussfirm {
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
	 * The cached value of the '{@link #getBusstops() <em>Busstops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusstops()
	 * @generated
	 * @ordered
	 */
	protected EList<Busstop> busstops;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passengers;

	/**
	 * The cached value of the '{@link #getRegistrations() <em>Registrations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrations()
	 * @generated
	 * @ordered
	 */
	protected EList<Registration> registrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BussfirmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtbPackage.Literals.BUSSFIRM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSFIRM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Busstop> getBusstops() {
		if (busstops == null) {
			busstops = new EObjectContainmentEList<Busstop>(Busstop.class, this, AtbPackage.BUSSFIRM__BUSSTOPS);
		}
		return busstops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectContainmentEList<Passenger>(Passenger.class, this, AtbPackage.BUSSFIRM__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registration> getRegistrations() {
		if (registrations == null) {
			registrations = new EObjectContainmentEList<Registration>(Registration.class, this, AtbPackage.BUSSFIRM__REGISTRATIONS);
		}
		return registrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtbPackage.BUSSFIRM__BUSSTOPS:
				return ((InternalEList<?>)getBusstops()).basicRemove(otherEnd, msgs);
			case AtbPackage.BUSSFIRM__PASSENGERS:
				return ((InternalEList<?>)getPassengers()).basicRemove(otherEnd, msgs);
			case AtbPackage.BUSSFIRM__REGISTRATIONS:
				return ((InternalEList<?>)getRegistrations()).basicRemove(otherEnd, msgs);
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
			case AtbPackage.BUSSFIRM__NAME:
				return getName();
			case AtbPackage.BUSSFIRM__BUSSTOPS:
				return getBusstops();
			case AtbPackage.BUSSFIRM__PASSENGERS:
				return getPassengers();
			case AtbPackage.BUSSFIRM__REGISTRATIONS:
				return getRegistrations();
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
			case AtbPackage.BUSSFIRM__NAME:
				setName((String)newValue);
				return;
			case AtbPackage.BUSSFIRM__BUSSTOPS:
				getBusstops().clear();
				getBusstops().addAll((Collection<? extends Busstop>)newValue);
				return;
			case AtbPackage.BUSSFIRM__PASSENGERS:
				getPassengers().clear();
				getPassengers().addAll((Collection<? extends Passenger>)newValue);
				return;
			case AtbPackage.BUSSFIRM__REGISTRATIONS:
				getRegistrations().clear();
				getRegistrations().addAll((Collection<? extends Registration>)newValue);
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
			case AtbPackage.BUSSFIRM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AtbPackage.BUSSFIRM__BUSSTOPS:
				getBusstops().clear();
				return;
			case AtbPackage.BUSSFIRM__PASSENGERS:
				getPassengers().clear();
				return;
			case AtbPackage.BUSSFIRM__REGISTRATIONS:
				getRegistrations().clear();
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
			case AtbPackage.BUSSFIRM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AtbPackage.BUSSFIRM__BUSSTOPS:
				return busstops != null && !busstops.isEmpty();
			case AtbPackage.BUSSFIRM__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
			case AtbPackage.BUSSFIRM__REGISTRATIONS:
				return registrations != null && !registrations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BussfirmImpl
