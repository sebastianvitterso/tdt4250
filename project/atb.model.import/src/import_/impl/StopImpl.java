/**
 */
package import_.impl;

import import_.ImportPackage;
import import_.Quay;
import import_.Stop;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.StopImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getBusstopID <em>Busstop ID</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getTime <em>Time</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getAimedDepartureTime <em>Aimed Departure Time</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 *   <li>{@link import_.impl.StopImpl#isRealtime <em>Realtime</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link import_.impl.StopImpl#getQuay <em>Quay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopImpl extends MinimalEObjectImpl.Container implements Stop {
	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusstopID() <em>Busstop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusstopID()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSSTOP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusstopID() <em>Busstop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusstopID()
	 * @generated
	 * @ordered
	 */
	protected String busstopID = BUSSTOP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAimedDepartureTime() <em>Aimed Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date AIMED_DEPARTURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAimedDepartureTime() <em>Aimed Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected Date aimedDepartureTime = AIMED_DEPARTURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedDepartureTime() <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_DEPARTURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedDepartureTime() <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected Date expectedDepartureTime = EXPECTED_DEPARTURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRealtime() <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealtime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REALTIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRealtime() <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealtime()
	 * @generated
	 * @ordered
	 */
	protected boolean realtime = REALTIME_EDEFAULT;

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
	 * The cached value of the '{@link #getQuay() <em>Quay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuay()
	 * @generated
	 * @ordered
	 */
	protected Quay quay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusstopID() {
		return busstopID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusstopID(String newBusstopID) {
		String oldBusstopID = busstopID;
		busstopID = newBusstopID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__BUSSTOP_ID, oldBusstopID, busstopID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAimedDepartureTime() {
		return aimedDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAimedDepartureTime(Date newAimedDepartureTime) {
		Date oldAimedDepartureTime = aimedDepartureTime;
		aimedDepartureTime = newAimedDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__AIMED_DEPARTURE_TIME, oldAimedDepartureTime, aimedDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpectedDepartureTime() {
		return expectedDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedDepartureTime(Date newExpectedDepartureTime) {
		Date oldExpectedDepartureTime = expectedDepartureTime;
		expectedDepartureTime = newExpectedDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__EXPECTED_DEPARTURE_TIME, oldExpectedDepartureTime, expectedDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRealtime() {
		return realtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtime(boolean newRealtime) {
		boolean oldRealtime = realtime;
		realtime = newRealtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__REALTIME, oldRealtime, realtime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__LONGITUDE, oldLongitude, longitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quay getQuay() {
		if (quay != null && quay.eIsProxy()) {
			InternalEObject oldQuay = (InternalEObject)quay;
			quay = (Quay)eResolveProxy(oldQuay);
			if (quay != oldQuay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImportPackage.STOP__QUAY, oldQuay, quay));
			}
		}
		return quay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quay basicGetQuay() {
		return quay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuay(Quay newQuay) {
		Quay oldQuay = quay;
		quay = newQuay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP__QUAY, oldQuay, quay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportPackage.STOP__DESTINATION:
				return getDestination();
			case ImportPackage.STOP__BUSSTOP_ID:
				return getBusstopID();
			case ImportPackage.STOP__TIME:
				return getTime();
			case ImportPackage.STOP__AIMED_DEPARTURE_TIME:
				return getAimedDepartureTime();
			case ImportPackage.STOP__EXPECTED_DEPARTURE_TIME:
				return getExpectedDepartureTime();
			case ImportPackage.STOP__REALTIME:
				return isRealtime();
			case ImportPackage.STOP__LONGITUDE:
				return getLongitude();
			case ImportPackage.STOP__LATITUDE:
				return getLatitude();
			case ImportPackage.STOP__QUAY:
				if (resolve) return getQuay();
				return basicGetQuay();
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
			case ImportPackage.STOP__DESTINATION:
				setDestination((String)newValue);
				return;
			case ImportPackage.STOP__BUSSTOP_ID:
				setBusstopID((String)newValue);
				return;
			case ImportPackage.STOP__TIME:
				setTime((String)newValue);
				return;
			case ImportPackage.STOP__AIMED_DEPARTURE_TIME:
				setAimedDepartureTime((Date)newValue);
				return;
			case ImportPackage.STOP__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime((Date)newValue);
				return;
			case ImportPackage.STOP__REALTIME:
				setRealtime((Boolean)newValue);
				return;
			case ImportPackage.STOP__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case ImportPackage.STOP__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case ImportPackage.STOP__QUAY:
				setQuay((Quay)newValue);
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
			case ImportPackage.STOP__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case ImportPackage.STOP__BUSSTOP_ID:
				setBusstopID(BUSSTOP_ID_EDEFAULT);
				return;
			case ImportPackage.STOP__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ImportPackage.STOP__AIMED_DEPARTURE_TIME:
				setAimedDepartureTime(AIMED_DEPARTURE_TIME_EDEFAULT);
				return;
			case ImportPackage.STOP__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime(EXPECTED_DEPARTURE_TIME_EDEFAULT);
				return;
			case ImportPackage.STOP__REALTIME:
				setRealtime(REALTIME_EDEFAULT);
				return;
			case ImportPackage.STOP__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case ImportPackage.STOP__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case ImportPackage.STOP__QUAY:
				setQuay((Quay)null);
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
			case ImportPackage.STOP__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case ImportPackage.STOP__BUSSTOP_ID:
				return BUSSTOP_ID_EDEFAULT == null ? busstopID != null : !BUSSTOP_ID_EDEFAULT.equals(busstopID);
			case ImportPackage.STOP__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ImportPackage.STOP__AIMED_DEPARTURE_TIME:
				return AIMED_DEPARTURE_TIME_EDEFAULT == null ? aimedDepartureTime != null : !AIMED_DEPARTURE_TIME_EDEFAULT.equals(aimedDepartureTime);
			case ImportPackage.STOP__EXPECTED_DEPARTURE_TIME:
				return EXPECTED_DEPARTURE_TIME_EDEFAULT == null ? expectedDepartureTime != null : !EXPECTED_DEPARTURE_TIME_EDEFAULT.equals(expectedDepartureTime);
			case ImportPackage.STOP__REALTIME:
				return realtime != REALTIME_EDEFAULT;
			case ImportPackage.STOP__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case ImportPackage.STOP__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case ImportPackage.STOP__QUAY:
				return quay != null;
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
		result.append(" (destination: ");
		result.append(destination);
		result.append(", busstopID: ");
		result.append(busstopID);
		result.append(", time: ");
		result.append(time);
		result.append(", aimedDepartureTime: ");
		result.append(aimedDepartureTime);
		result.append(", expectedDepartureTime: ");
		result.append(expectedDepartureTime);
		result.append(", realtime: ");
		result.append(realtime);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //StopImpl
