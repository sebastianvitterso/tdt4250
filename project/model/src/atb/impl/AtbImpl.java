/**
 */
package atb.impl;

import atb.Atb;
import atb.AtbPackage;
import atb.Busstops;
import atb.Passenger;
import atb.Registration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atb.impl.AtbImpl#getBusstops <em>Busstops</em>}</li>
 *   <li>{@link atb.impl.AtbImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link atb.impl.AtbImpl#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtbImpl extends MinimalEObjectImpl.Container implements Atb {
	/**
	 * The cached value of the '{@link #getBusstops() <em>Busstops</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusstops()
	 * @generated
	 * @ordered
	 */
	protected Busstops busstops;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected Passenger passengers;

	/**
	 * The cached value of the '{@link #getRegistrations() <em>Registrations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrations()
	 * @generated
	 * @ordered
	 */
	protected Registration registrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtbPackage.Literals.ATB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops getBusstops() {
		if (busstops != null && busstops.eIsProxy()) {
			InternalEObject oldBusstops = (InternalEObject)busstops;
			busstops = (Busstops)eResolveProxy(oldBusstops);
			if (busstops != oldBusstops) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.ATB__BUSSTOPS, oldBusstops, busstops));
			}
		}
		return busstops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops basicGetBusstops() {
		return busstops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusstops(Busstops newBusstops) {
		Busstops oldBusstops = busstops;
		busstops = newBusstops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.ATB__BUSSTOPS, oldBusstops, busstops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger getPassengers() {
		if (passengers != null && passengers.eIsProxy()) {
			InternalEObject oldPassengers = (InternalEObject)passengers;
			passengers = (Passenger)eResolveProxy(oldPassengers);
			if (passengers != oldPassengers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.ATB__PASSENGERS, oldPassengers, passengers));
			}
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger basicGetPassengers() {
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengers(Passenger newPassengers) {
		Passenger oldPassengers = passengers;
		passengers = newPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.ATB__PASSENGERS, oldPassengers, passengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration getRegistrations() {
		if (registrations != null && registrations.eIsProxy()) {
			InternalEObject oldRegistrations = (InternalEObject)registrations;
			registrations = (Registration)eResolveProxy(oldRegistrations);
			if (registrations != oldRegistrations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.ATB__REGISTRATIONS, oldRegistrations, registrations));
			}
		}
		return registrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration basicGetRegistrations() {
		return registrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrations(Registration newRegistrations) {
		Registration oldRegistrations = registrations;
		registrations = newRegistrations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.ATB__REGISTRATIONS, oldRegistrations, registrations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtbPackage.ATB__BUSSTOPS:
				if (resolve) return getBusstops();
				return basicGetBusstops();
			case AtbPackage.ATB__PASSENGERS:
				if (resolve) return getPassengers();
				return basicGetPassengers();
			case AtbPackage.ATB__REGISTRATIONS:
				if (resolve) return getRegistrations();
				return basicGetRegistrations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtbPackage.ATB__BUSSTOPS:
				setBusstops((Busstops)newValue);
				return;
			case AtbPackage.ATB__PASSENGERS:
				setPassengers((Passenger)newValue);
				return;
			case AtbPackage.ATB__REGISTRATIONS:
				setRegistrations((Registration)newValue);
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
			case AtbPackage.ATB__BUSSTOPS:
				setBusstops((Busstops)null);
				return;
			case AtbPackage.ATB__PASSENGERS:
				setPassengers((Passenger)null);
				return;
			case AtbPackage.ATB__REGISTRATIONS:
				setRegistrations((Registration)null);
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
			case AtbPackage.ATB__BUSSTOPS:
				return busstops != null;
			case AtbPackage.ATB__PASSENGERS:
				return passengers != null;
			case AtbPackage.ATB__REGISTRATIONS:
				return registrations != null;
		}
		return super.eIsSet(featureID);
	}

} //AtbImpl
