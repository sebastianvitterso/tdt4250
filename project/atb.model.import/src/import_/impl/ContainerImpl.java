/**
 */
package import_.impl;

import import_.ImportPackage;
import import_.Realtime;
import import_.StopPlace;
import import_.Trip;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.ContainerImpl#getStopPlaces <em>Stop Places</em>}</li>
 *   <li>{@link import_.impl.ContainerImpl#getRealtimes <em>Realtimes</em>}</li>
 *   <li>{@link import_.impl.ContainerImpl#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements import_.Container {
	/**
	 * The cached value of the '{@link #getStopPlaces() <em>Stop Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<StopPlace> stopPlaces;

	/**
	 * The cached value of the '{@link #getRealtimes() <em>Realtimes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimes()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtime> realtimes;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trips;

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
	public EList<StopPlace> getStopPlaces() {
		if (stopPlaces == null) {
			stopPlaces = new EObjectContainmentEList<StopPlace>(StopPlace.class, this, ImportPackage.CONTAINER__STOP_PLACES);
		}
		return stopPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtime> getRealtimes() {
		if (realtimes == null) {
			realtimes = new EObjectContainmentEList<Realtime>(Realtime.class, this, ImportPackage.CONTAINER__REALTIMES);
		}
		return realtimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectContainmentEList<Trip>(Trip.class, this, ImportPackage.CONTAINER__TRIPS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImportPackage.CONTAINER__STOP_PLACES:
				return ((InternalEList<?>)getStopPlaces()).basicRemove(otherEnd, msgs);
			case ImportPackage.CONTAINER__REALTIMES:
				return ((InternalEList<?>)getRealtimes()).basicRemove(otherEnd, msgs);
			case ImportPackage.CONTAINER__TRIPS:
				return ((InternalEList<?>)getTrips()).basicRemove(otherEnd, msgs);
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
			case ImportPackage.CONTAINER__STOP_PLACES:
				return getStopPlaces();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImportPackage.CONTAINER__STOP_PLACES:
				getStopPlaces().clear();
				getStopPlaces().addAll((Collection<? extends StopPlace>)newValue);
				return;
			case ImportPackage.CONTAINER__REALTIMES:
				getRealtimes().clear();
				getRealtimes().addAll((Collection<? extends Realtime>)newValue);
				return;
			case ImportPackage.CONTAINER__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends Trip>)newValue);
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
			case ImportPackage.CONTAINER__STOP_PLACES:
				getStopPlaces().clear();
				return;
			case ImportPackage.CONTAINER__REALTIMES:
				getRealtimes().clear();
				return;
			case ImportPackage.CONTAINER__TRIPS:
				getTrips().clear();
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
			case ImportPackage.CONTAINER__STOP_PLACES:
				return stopPlaces != null && !stopPlaces.isEmpty();
			case ImportPackage.CONTAINER__REALTIMES:
				return realtimes != null && !realtimes.isEmpty();
			case ImportPackage.CONTAINER__TRIPS:
				return trips != null && !trips.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
