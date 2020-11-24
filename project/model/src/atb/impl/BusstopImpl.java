/**
 */
package atb.impl;

import atb.AtbPackage;
import atb.Busstop;
import atb.Departure;

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
 * An implementation of the model object '<em><b>Busstop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atb.impl.BusstopImpl#getName <em>Name</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#getStopId <em>Stop Id</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}</li>
 *   <li>{@link atb.impl.BusstopImpl#getDepartures <em>Departures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusstopImpl extends MinimalEObjectImpl.Container implements Busstop {
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
	 * The default value of the '{@link #getStopId() <em>Stop Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopId()
	 * @generated
	 * @ordered
	 */
	protected static final int STOP_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStopId() <em>Stop Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopId()
	 * @generated
	 * @ordered
	 */
	protected int stopId = STOP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected int nodeId = NODE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isIsGoingTowardsCentrum() <em>Is Going Towards Centrum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGoingTowardsCentrum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GOING_TOWARDS_CENTRUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGoingTowardsCentrum() <em>Is Going Towards Centrum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGoingTowardsCentrum()
	 * @generated
	 * @ordered
	 */
	protected boolean isGoingTowardsCentrum = IS_GOING_TOWARDS_CENTRUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartures() <em>Departures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartures()
	 * @generated
	 * @ordered
	 */
	protected EList<Departure> departures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusstopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtbPackage.Literals.BUSSTOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStopId() {
		return stopId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopId(int newStopId) {
		int oldStopId = stopId;
		stopId = newStopId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__STOP_ID, oldStopId, stopId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(int newNodeId) {
		int oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__NODE_ID, oldNodeId, nodeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__LONGITUDE, oldLongitude, longitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGoingTowardsCentrum() {
		return isGoingTowardsCentrum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGoingTowardsCentrum(boolean newIsGoingTowardsCentrum) {
		boolean oldIsGoingTowardsCentrum = isGoingTowardsCentrum;
		isGoingTowardsCentrum = newIsGoingTowardsCentrum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.BUSSTOP__IS_GOING_TOWARDS_CENTRUM, oldIsGoingTowardsCentrum, isGoingTowardsCentrum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departure> getDepartures() {
		if (departures == null) {
			departures = new EObjectContainmentEList<Departure>(Departure.class, this, AtbPackage.BUSSTOP__DEPARTURES);
		}
		return departures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtbPackage.BUSSTOP__DEPARTURES:
				return ((InternalEList<?>)getDepartures()).basicRemove(otherEnd, msgs);
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
			case AtbPackage.BUSSTOP__NAME:
				return getName();
			case AtbPackage.BUSSTOP__STOP_ID:
				return getStopId();
			case AtbPackage.BUSSTOP__NODE_ID:
				return getNodeId();
			case AtbPackage.BUSSTOP__LONGITUDE:
				return getLongitude();
			case AtbPackage.BUSSTOP__LATITUDE:
				return getLatitude();
			case AtbPackage.BUSSTOP__IS_GOING_TOWARDS_CENTRUM:
				return isIsGoingTowardsCentrum();
			case AtbPackage.BUSSTOP__DEPARTURES:
				return getDepartures();
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
			case AtbPackage.BUSSTOP__NAME:
				setName((String)newValue);
				return;
			case AtbPackage.BUSSTOP__STOP_ID:
				setStopId((Integer)newValue);
				return;
			case AtbPackage.BUSSTOP__NODE_ID:
				setNodeId((Integer)newValue);
				return;
			case AtbPackage.BUSSTOP__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case AtbPackage.BUSSTOP__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case AtbPackage.BUSSTOP__IS_GOING_TOWARDS_CENTRUM:
				setIsGoingTowardsCentrum((Boolean)newValue);
				return;
			case AtbPackage.BUSSTOP__DEPARTURES:
				getDepartures().clear();
				getDepartures().addAll((Collection<? extends Departure>)newValue);
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
			case AtbPackage.BUSSTOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__STOP_ID:
				setStopId(STOP_ID_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__IS_GOING_TOWARDS_CENTRUM:
				setIsGoingTowardsCentrum(IS_GOING_TOWARDS_CENTRUM_EDEFAULT);
				return;
			case AtbPackage.BUSSTOP__DEPARTURES:
				getDepartures().clear();
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
			case AtbPackage.BUSSTOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AtbPackage.BUSSTOP__STOP_ID:
				return stopId != STOP_ID_EDEFAULT;
			case AtbPackage.BUSSTOP__NODE_ID:
				return nodeId != NODE_ID_EDEFAULT;
			case AtbPackage.BUSSTOP__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case AtbPackage.BUSSTOP__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case AtbPackage.BUSSTOP__IS_GOING_TOWARDS_CENTRUM:
				return isGoingTowardsCentrum != IS_GOING_TOWARDS_CENTRUM_EDEFAULT;
			case AtbPackage.BUSSTOP__DEPARTURES:
				return departures != null && !departures.isEmpty();
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
		result.append(", stopId: ");
		result.append(stopId);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", isGoingTowardsCentrum: ");
		result.append(isGoingTowardsCentrum);
		result.append(')');
		return result.toString();
	}

} //BusstopImpl
