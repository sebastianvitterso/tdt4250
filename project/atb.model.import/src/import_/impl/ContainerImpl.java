/**
 */
package import_.impl;

import import_.ImportPackage;
import import_.Quay;
import import_.Realtime;
import import_.Trip;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.ContainerImpl#getQuays <em>Quays</em>}</li>
 *   <li>{@link import_.impl.ContainerImpl#getRealtimes <em>Realtimes</em>}</li>
 *   <li>{@link import_.impl.ContainerImpl#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements import_.Container {
	/**
	 * The cached value of the '{@link #getQuays() <em>Quays</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuays()
	 * @generated
	 * @ordered
	 */
	protected Quay quays;

	/**
	 * The cached value of the '{@link #getRealtimes() <em>Realtimes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimes()
	 * @generated
	 * @ordered
	 */
	protected Realtime realtimes;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected Trip trips;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quay getQuays() {
		return quays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuays(Quay newQuays, NotificationChain msgs) {
		Quay oldQuays = quays;
		quays = newQuays;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__QUAYS, oldQuays, newQuays);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuays(Quay newQuays) {
		if (newQuays != quays) {
			NotificationChain msgs = null;
			if (quays != null)
				msgs = ((InternalEObject)quays).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__QUAYS, null, msgs);
			if (newQuays != null)
				msgs = ((InternalEObject)newQuays).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__QUAYS, null, msgs);
			msgs = basicSetQuays(newQuays, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__QUAYS, newQuays, newQuays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtime getRealtimes() {
		return realtimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealtimes(Realtime newRealtimes, NotificationChain msgs) {
		Realtime oldRealtimes = realtimes;
		realtimes = newRealtimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__REALTIMES, oldRealtimes, newRealtimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtimes(Realtime newRealtimes) {
		if (newRealtimes != realtimes) {
			NotificationChain msgs = null;
			if (realtimes != null)
				msgs = ((InternalEObject)realtimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__REALTIMES, null, msgs);
			if (newRealtimes != null)
				msgs = ((InternalEObject)newRealtimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__REALTIMES, null, msgs);
			msgs = basicSetRealtimes(newRealtimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__REALTIMES, newRealtimes, newRealtimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip getTrips() {
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrips(Trip newTrips, NotificationChain msgs) {
		Trip oldTrips = trips;
		trips = newTrips;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__TRIPS, oldTrips, newTrips);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrips(Trip newTrips) {
		if (newTrips != trips) {
			NotificationChain msgs = null;
			if (trips != null)
				msgs = ((InternalEObject)trips).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__TRIPS, null, msgs);
			if (newTrips != null)
				msgs = ((InternalEObject)newTrips).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportPackage.CONTAINER__TRIPS, null, msgs);
			msgs = basicSetTrips(newTrips, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.CONTAINER__TRIPS, newTrips, newTrips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImportPackage.CONTAINER__QUAYS:
				return basicSetQuays(null, msgs);
			case ImportPackage.CONTAINER__REALTIMES:
				return basicSetRealtimes(null, msgs);
			case ImportPackage.CONTAINER__TRIPS:
				return basicSetTrips(null, msgs);
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
			case ImportPackage.CONTAINER__QUAYS:
				return getQuays();
			case ImportPackage.CONTAINER__REALTIMES:
				return getRealtimes();
			case ImportPackage.CONTAINER__TRIPS:
				return getTrips();
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
			case ImportPackage.CONTAINER__QUAYS:
				setQuays((Quay)newValue);
				return;
			case ImportPackage.CONTAINER__REALTIMES:
				setRealtimes((Realtime)newValue);
				return;
			case ImportPackage.CONTAINER__TRIPS:
				setTrips((Trip)newValue);
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
			case ImportPackage.CONTAINER__QUAYS:
				setQuays((Quay)null);
				return;
			case ImportPackage.CONTAINER__REALTIMES:
				setRealtimes((Realtime)null);
				return;
			case ImportPackage.CONTAINER__TRIPS:
				setTrips((Trip)null);
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
			case ImportPackage.CONTAINER__QUAYS:
				return quays != null;
			case ImportPackage.CONTAINER__REALTIMES:
				return realtimes != null;
			case ImportPackage.CONTAINER__TRIPS:
				return trips != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
