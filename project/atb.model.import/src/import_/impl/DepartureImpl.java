/**
 */
package import_.impl;

import import_.Departure;
import import_.ImportPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.DepartureImpl#getLine <em>Line</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getDestinationDisplay <em>Destination Display</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getOriginRef <em>Origin Ref</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getDestinationRef <em>Destination Ref</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getRegisteredDepartureTime <em>Registered Departure Time</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#isIsRealTime <em>Is Real Time</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getTripId <em>Trip Id</em>}</li>
 *   <li>{@link import_.impl.DepartureImpl#getGroupMapKey <em>Group Map Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartureImpl extends MinimalEObjectImpl.Container implements Departure {
	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected String line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationDisplay() <em>Destination Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationDisplay() <em>Destination Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDisplay()
	 * @generated
	 * @ordered
	 */
	protected String destinationDisplay = DESTINATION_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginRef() <em>Origin Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginRef() <em>Origin Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRef()
	 * @generated
	 * @ordered
	 */
	protected String originRef = ORIGIN_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginName() <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginName() <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName()
	 * @generated
	 * @ordered
	 */
	protected String originName = ORIGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationRef() <em>Destination Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationRef() <em>Destination Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRef()
	 * @generated
	 * @ordered
	 */
	protected String destinationRef = DESTINATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected String destinationName = DESTINATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisteredDepartureTime() <em>Registered Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date REGISTERED_DEPARTURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisteredDepartureTime() <em>Registered Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected Date registeredDepartureTime = REGISTERED_DEPARTURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduledDepartureTime() <em>Scheduled Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULED_DEPARTURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledDepartureTime() <em>Scheduled Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected Date scheduledDepartureTime = SCHEDULED_DEPARTURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRealTime() <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRealTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REAL_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRealTime() <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRealTime()
	 * @generated
	 * @ordered
	 */
	protected boolean isRealTime = IS_REAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripId() <em>Trip Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripId() <em>Trip Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripId()
	 * @generated
	 * @ordered
	 */
	protected String tripId = TRIP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupMapKey() <em>Group Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupMapKey() <em>Group Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMapKey()
	 * @generated
	 * @ordered
	 */
	protected String groupMapKey = GROUP_MAP_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.DEPARTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(String newLine) {
		String oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationDisplay() {
		return destinationDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationDisplay(String newDestinationDisplay) {
		String oldDestinationDisplay = destinationDisplay;
		destinationDisplay = newDestinationDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__DESTINATION_DISPLAY, oldDestinationDisplay, destinationDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginRef() {
		return originRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginRef(String newOriginRef) {
		String oldOriginRef = originRef;
		originRef = newOriginRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__ORIGIN_REF, oldOriginRef, originRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginName() {
		return originName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginName(String newOriginName) {
		String oldOriginName = originName;
		originName = newOriginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__ORIGIN_NAME, oldOriginName, originName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationRef() {
		return destinationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationRef(String newDestinationRef) {
		String oldDestinationRef = destinationRef;
		destinationRef = newDestinationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__DESTINATION_REF, oldDestinationRef, destinationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationName(String newDestinationName) {
		String oldDestinationName = destinationName;
		destinationName = newDestinationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__DESTINATION_NAME, oldDestinationName, destinationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRegisteredDepartureTime() {
		return registeredDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredDepartureTime(Date newRegisteredDepartureTime) {
		Date oldRegisteredDepartureTime = registeredDepartureTime;
		registeredDepartureTime = newRegisteredDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME, oldRegisteredDepartureTime, registeredDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScheduledDepartureTime() {
		return scheduledDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDepartureTime(Date newScheduledDepartureTime) {
		Date oldScheduledDepartureTime = scheduledDepartureTime;
		scheduledDepartureTime = newScheduledDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME, oldScheduledDepartureTime, scheduledDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRealTime() {
		return isRealTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRealTime(boolean newIsRealTime) {
		boolean oldIsRealTime = isRealTime;
		isRealTime = newIsRealTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__IS_REAL_TIME, oldIsRealTime, isRealTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTripId() {
		return tripId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripId(String newTripId) {
		String oldTripId = tripId;
		tripId = newTripId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__TRIP_ID, oldTripId, tripId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupMapKey() {
		return groupMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupMapKey(String newGroupMapKey) {
		String oldGroupMapKey = groupMapKey;
		groupMapKey = newGroupMapKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.DEPARTURE__GROUP_MAP_KEY, oldGroupMapKey, groupMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportPackage.DEPARTURE__LINE:
				return getLine();
			case ImportPackage.DEPARTURE__DESTINATION_DISPLAY:
				return getDestinationDisplay();
			case ImportPackage.DEPARTURE__ORIGIN_REF:
				return getOriginRef();
			case ImportPackage.DEPARTURE__ORIGIN_NAME:
				return getOriginName();
			case ImportPackage.DEPARTURE__DESTINATION_REF:
				return getDestinationRef();
			case ImportPackage.DEPARTURE__DESTINATION_NAME:
				return getDestinationName();
			case ImportPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				return getRegisteredDepartureTime();
			case ImportPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				return getScheduledDepartureTime();
			case ImportPackage.DEPARTURE__IS_REAL_TIME:
				return isIsRealTime();
			case ImportPackage.DEPARTURE__TRIP_ID:
				return getTripId();
			case ImportPackage.DEPARTURE__GROUP_MAP_KEY:
				return getGroupMapKey();
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
			case ImportPackage.DEPARTURE__LINE:
				setLine((String)newValue);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_DISPLAY:
				setDestinationDisplay((String)newValue);
				return;
			case ImportPackage.DEPARTURE__ORIGIN_REF:
				setOriginRef((String)newValue);
				return;
			case ImportPackage.DEPARTURE__ORIGIN_NAME:
				setOriginName((String)newValue);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_REF:
				setDestinationRef((String)newValue);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_NAME:
				setDestinationName((String)newValue);
				return;
			case ImportPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				setRegisteredDepartureTime((Date)newValue);
				return;
			case ImportPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime((Date)newValue);
				return;
			case ImportPackage.DEPARTURE__IS_REAL_TIME:
				setIsRealTime((Boolean)newValue);
				return;
			case ImportPackage.DEPARTURE__TRIP_ID:
				setTripId((String)newValue);
				return;
			case ImportPackage.DEPARTURE__GROUP_MAP_KEY:
				setGroupMapKey((String)newValue);
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
			case ImportPackage.DEPARTURE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_DISPLAY:
				setDestinationDisplay(DESTINATION_DISPLAY_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__ORIGIN_REF:
				setOriginRef(ORIGIN_REF_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__ORIGIN_NAME:
				setOriginName(ORIGIN_NAME_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_REF:
				setDestinationRef(DESTINATION_REF_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__DESTINATION_NAME:
				setDestinationName(DESTINATION_NAME_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				setRegisteredDepartureTime(REGISTERED_DEPARTURE_TIME_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime(SCHEDULED_DEPARTURE_TIME_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__IS_REAL_TIME:
				setIsRealTime(IS_REAL_TIME_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__TRIP_ID:
				setTripId(TRIP_ID_EDEFAULT);
				return;
			case ImportPackage.DEPARTURE__GROUP_MAP_KEY:
				setGroupMapKey(GROUP_MAP_KEY_EDEFAULT);
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
			case ImportPackage.DEPARTURE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case ImportPackage.DEPARTURE__DESTINATION_DISPLAY:
				return DESTINATION_DISPLAY_EDEFAULT == null ? destinationDisplay != null : !DESTINATION_DISPLAY_EDEFAULT.equals(destinationDisplay);
			case ImportPackage.DEPARTURE__ORIGIN_REF:
				return ORIGIN_REF_EDEFAULT == null ? originRef != null : !ORIGIN_REF_EDEFAULT.equals(originRef);
			case ImportPackage.DEPARTURE__ORIGIN_NAME:
				return ORIGIN_NAME_EDEFAULT == null ? originName != null : !ORIGIN_NAME_EDEFAULT.equals(originName);
			case ImportPackage.DEPARTURE__DESTINATION_REF:
				return DESTINATION_REF_EDEFAULT == null ? destinationRef != null : !DESTINATION_REF_EDEFAULT.equals(destinationRef);
			case ImportPackage.DEPARTURE__DESTINATION_NAME:
				return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
			case ImportPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				return REGISTERED_DEPARTURE_TIME_EDEFAULT == null ? registeredDepartureTime != null : !REGISTERED_DEPARTURE_TIME_EDEFAULT.equals(registeredDepartureTime);
			case ImportPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				return SCHEDULED_DEPARTURE_TIME_EDEFAULT == null ? scheduledDepartureTime != null : !SCHEDULED_DEPARTURE_TIME_EDEFAULT.equals(scheduledDepartureTime);
			case ImportPackage.DEPARTURE__IS_REAL_TIME:
				return isRealTime != IS_REAL_TIME_EDEFAULT;
			case ImportPackage.DEPARTURE__TRIP_ID:
				return TRIP_ID_EDEFAULT == null ? tripId != null : !TRIP_ID_EDEFAULT.equals(tripId);
			case ImportPackage.DEPARTURE__GROUP_MAP_KEY:
				return GROUP_MAP_KEY_EDEFAULT == null ? groupMapKey != null : !GROUP_MAP_KEY_EDEFAULT.equals(groupMapKey);
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
		result.append(" (line: ");
		result.append(line);
		result.append(", destinationDisplay: ");
		result.append(destinationDisplay);
		result.append(", originRef: ");
		result.append(originRef);
		result.append(", originName: ");
		result.append(originName);
		result.append(", destinationRef: ");
		result.append(destinationRef);
		result.append(", destinationName: ");
		result.append(destinationName);
		result.append(", registeredDepartureTime: ");
		result.append(registeredDepartureTime);
		result.append(", scheduledDepartureTime: ");
		result.append(scheduledDepartureTime);
		result.append(", isRealTime: ");
		result.append(isRealTime);
		result.append(", tripId: ");
		result.append(tripId);
		result.append(", groupMapKey: ");
		result.append(groupMapKey);
		result.append(')');
		return result.toString();
	}

} //DepartureImpl
