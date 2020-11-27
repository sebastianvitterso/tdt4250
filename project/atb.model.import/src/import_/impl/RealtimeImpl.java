/**
 */
package import_.impl;

import import_.Departure;
import import_.ImportPackage;
import import_.Realtime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.RealtimeImpl#getBusStopID <em>Bus Stop ID</em>}</li>
 *   <li>{@link import_.impl.RealtimeImpl#getBusStopName <em>Bus Stop Name</em>}</li>
 *   <li>{@link import_.impl.RealtimeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link import_.impl.RealtimeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link import_.impl.RealtimeImpl#getDepartureForecasts <em>Departure Forecasts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealtimeImpl extends MinimalEObjectImpl.Container implements Realtime {
	/**
	 * The default value of the '{@link #getBusStopID() <em>Bus Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusStopID()
	 * @generated
	 * @ordered
	 */
	protected static final String BUS_STOP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusStopID() <em>Bus Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusStopID()
	 * @generated
	 * @ordered
	 */
	protected String busStopID = BUS_STOP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusStopName() <em>Bus Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusStopName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUS_STOP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusStopName() <em>Bus Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusStopName()
	 * @generated
	 * @ordered
	 */
	protected String busStopName = BUS_STOP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartureForecasts() <em>Departure Forecasts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureForecasts()
	 * @generated
	 * @ordered
	 */
	protected Departure departureForecasts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.REALTIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusStopID() {
		return busStopID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusStopID(String newBusStopID) {
		String oldBusStopID = busStopID;
		busStopID = newBusStopID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.REALTIME__BUS_STOP_ID, oldBusStopID, busStopID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusStopName() {
		return busStopName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusStopName(String newBusStopName) {
		String oldBusStopName = busStopName;
		busStopName = newBusStopName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.REALTIME__BUS_STOP_NAME, oldBusStopName, busStopName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.REALTIME__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.REALTIME__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departure getDepartureForecasts() {
		if (departureForecasts != null && departureForecasts.eIsProxy()) {
			InternalEObject oldDepartureForecasts = (InternalEObject)departureForecasts;
			departureForecasts = (Departure)eResolveProxy(oldDepartureForecasts);
			if (departureForecasts != oldDepartureForecasts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImportPackage.REALTIME__DEPARTURE_FORECASTS, oldDepartureForecasts, departureForecasts));
			}
		}
		return departureForecasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departure basicGetDepartureForecasts() {
		return departureForecasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureForecasts(Departure newDepartureForecasts) {
		Departure oldDepartureForecasts = departureForecasts;
		departureForecasts = newDepartureForecasts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.REALTIME__DEPARTURE_FORECASTS, oldDepartureForecasts, departureForecasts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportPackage.REALTIME__BUS_STOP_ID:
				return getBusStopID();
			case ImportPackage.REALTIME__BUS_STOP_NAME:
				return getBusStopName();
			case ImportPackage.REALTIME__LONGITUDE:
				return getLongitude();
			case ImportPackage.REALTIME__LATITUDE:
				return getLatitude();
			case ImportPackage.REALTIME__DEPARTURE_FORECASTS:
				if (resolve) return getDepartureForecasts();
				return basicGetDepartureForecasts();
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
			case ImportPackage.REALTIME__BUS_STOP_ID:
				setBusStopID((String)newValue);
				return;
			case ImportPackage.REALTIME__BUS_STOP_NAME:
				setBusStopName((String)newValue);
				return;
			case ImportPackage.REALTIME__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case ImportPackage.REALTIME__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case ImportPackage.REALTIME__DEPARTURE_FORECASTS:
				setDepartureForecasts((Departure)newValue);
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
			case ImportPackage.REALTIME__BUS_STOP_ID:
				setBusStopID(BUS_STOP_ID_EDEFAULT);
				return;
			case ImportPackage.REALTIME__BUS_STOP_NAME:
				setBusStopName(BUS_STOP_NAME_EDEFAULT);
				return;
			case ImportPackage.REALTIME__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case ImportPackage.REALTIME__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case ImportPackage.REALTIME__DEPARTURE_FORECASTS:
				setDepartureForecasts((Departure)null);
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
			case ImportPackage.REALTIME__BUS_STOP_ID:
				return BUS_STOP_ID_EDEFAULT == null ? busStopID != null : !BUS_STOP_ID_EDEFAULT.equals(busStopID);
			case ImportPackage.REALTIME__BUS_STOP_NAME:
				return BUS_STOP_NAME_EDEFAULT == null ? busStopName != null : !BUS_STOP_NAME_EDEFAULT.equals(busStopName);
			case ImportPackage.REALTIME__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case ImportPackage.REALTIME__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case ImportPackage.REALTIME__DEPARTURE_FORECASTS:
				return departureForecasts != null;
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
		result.append(" (busStopID: ");
		result.append(busStopID);
		result.append(", busStopName: ");
		result.append(busStopName);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //RealtimeImpl
