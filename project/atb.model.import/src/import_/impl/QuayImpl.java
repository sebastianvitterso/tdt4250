/**
 */
package import_.impl;

import import_.Departure;
import import_.ImportPackage;
import import_.Quay;
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
 * An implementation of the model object '<em><b>Quay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.QuayImpl#getId <em>Id</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getStopPlaceId <em>Stop Place Id</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getName <em>Name</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getX <em>X</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getY <em>Y</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getCompassBearing <em>Compass Bearing</em>}</li>
 *   <li>{@link import_.impl.QuayImpl#getDepartureForecasts <em>Departure Forecasts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuayImpl extends MinimalEObjectImpl.Container implements Quay {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopPlaceId() <em>Stop Place Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPlaceId()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_PLACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopPlaceId() <em>Stop Place Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPlaceId()
	 * @generated
	 * @ordered
	 */
	protected String stopPlaceId = STOP_PLACE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompassBearing() <em>Compass Bearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompassBearing()
	 * @generated
	 * @ordered
	 */
	protected static final float COMPASS_BEARING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCompassBearing() <em>Compass Bearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompassBearing()
	 * @generated
	 * @ordered
	 */
	protected float compassBearing = COMPASS_BEARING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartureForecasts() <em>Departure Forecasts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureForecasts()
	 * @generated
	 * @ordered
	 */
	protected EList<Departure> departureForecasts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.QUAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopPlaceId() {
		return stopPlaceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopPlaceId(String newStopPlaceId) {
		String oldStopPlaceId = stopPlaceId;
		stopPlaceId = newStopPlaceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__STOP_PLACE_ID, oldStopPlaceId, stopPlaceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCompassBearing() {
		return compassBearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompassBearing(float newCompassBearing) {
		float oldCompassBearing = compassBearing;
		compassBearing = newCompassBearing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.QUAY__COMPASS_BEARING, oldCompassBearing, compassBearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departure> getDepartureForecasts() {
		if (departureForecasts == null) {
			departureForecasts = new EObjectContainmentEList<Departure>(Departure.class, this, ImportPackage.QUAY__DEPARTURE_FORECASTS);
		}
		return departureForecasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImportPackage.QUAY__DEPARTURE_FORECASTS:
				return ((InternalEList<?>)getDepartureForecasts()).basicRemove(otherEnd, msgs);
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
			case ImportPackage.QUAY__ID:
				return getId();
			case ImportPackage.QUAY__STOP_PLACE_ID:
				return getStopPlaceId();
			case ImportPackage.QUAY__NAME:
				return getName();
			case ImportPackage.QUAY__PLACE:
				return getPlace();
			case ImportPackage.QUAY__X:
				return getX();
			case ImportPackage.QUAY__Y:
				return getY();
			case ImportPackage.QUAY__COMPASS_BEARING:
				return getCompassBearing();
			case ImportPackage.QUAY__DEPARTURE_FORECASTS:
				return getDepartureForecasts();
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
			case ImportPackage.QUAY__ID:
				setId((String)newValue);
				return;
			case ImportPackage.QUAY__STOP_PLACE_ID:
				setStopPlaceId((String)newValue);
				return;
			case ImportPackage.QUAY__NAME:
				setName((String)newValue);
				return;
			case ImportPackage.QUAY__PLACE:
				setPlace((String)newValue);
				return;
			case ImportPackage.QUAY__X:
				setX((Float)newValue);
				return;
			case ImportPackage.QUAY__Y:
				setY((Float)newValue);
				return;
			case ImportPackage.QUAY__COMPASS_BEARING:
				setCompassBearing((Float)newValue);
				return;
			case ImportPackage.QUAY__DEPARTURE_FORECASTS:
				getDepartureForecasts().clear();
				getDepartureForecasts().addAll((Collection<? extends Departure>)newValue);
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
			case ImportPackage.QUAY__ID:
				setId(ID_EDEFAULT);
				return;
			case ImportPackage.QUAY__STOP_PLACE_ID:
				setStopPlaceId(STOP_PLACE_ID_EDEFAULT);
				return;
			case ImportPackage.QUAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImportPackage.QUAY__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case ImportPackage.QUAY__X:
				setX(X_EDEFAULT);
				return;
			case ImportPackage.QUAY__Y:
				setY(Y_EDEFAULT);
				return;
			case ImportPackage.QUAY__COMPASS_BEARING:
				setCompassBearing(COMPASS_BEARING_EDEFAULT);
				return;
			case ImportPackage.QUAY__DEPARTURE_FORECASTS:
				getDepartureForecasts().clear();
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
			case ImportPackage.QUAY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImportPackage.QUAY__STOP_PLACE_ID:
				return STOP_PLACE_ID_EDEFAULT == null ? stopPlaceId != null : !STOP_PLACE_ID_EDEFAULT.equals(stopPlaceId);
			case ImportPackage.QUAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImportPackage.QUAY__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case ImportPackage.QUAY__X:
				return x != X_EDEFAULT;
			case ImportPackage.QUAY__Y:
				return y != Y_EDEFAULT;
			case ImportPackage.QUAY__COMPASS_BEARING:
				return compassBearing != COMPASS_BEARING_EDEFAULT;
			case ImportPackage.QUAY__DEPARTURE_FORECASTS:
				return departureForecasts != null && !departureForecasts.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", stopPlaceId: ");
		result.append(stopPlaceId);
		result.append(", name: ");
		result.append(name);
		result.append(", place: ");
		result.append(place);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", compassBearing: ");
		result.append(compassBearing);
		result.append(')');
		return result.toString();
	}

} //QuayImpl
