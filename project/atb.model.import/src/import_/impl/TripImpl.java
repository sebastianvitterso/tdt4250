/**
 */
package import_.impl;

import import_.ImportPackage;
import import_.Quay;
import import_.Trip;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.TripImpl#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link import_.impl.TripImpl#getDate <em>Date</em>}</li>
 *   <li>{@link import_.impl.TripImpl#getLine <em>Line</em>}</li>
 *   <li>{@link import_.impl.TripImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link import_.impl.TripImpl#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripImpl extends MinimalEObjectImpl.Container implements Trip {
	/**
	 * The default value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected String tripID = TRIP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<Quay> stops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.TRIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTripID() {
		return tripID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripID(String newTripID) {
		String oldTripID = tripID;
		tripID = newTripID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.TRIP__TRIP_ID, oldTripID, tripID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.TRIP__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.TRIP__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.TRIP__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quay> getStops() {
		if (stops == null) {
			stops = new EObjectResolvingEList<Quay>(Quay.class, this, ImportPackage.TRIP__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportPackage.TRIP__TRIP_ID:
				return getTripID();
			case ImportPackage.TRIP__DATE:
				return getDate();
			case ImportPackage.TRIP__LINE:
				return getLine();
			case ImportPackage.TRIP__DESTINATION:
				return getDestination();
			case ImportPackage.TRIP__STOPS:
				return getStops();
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
			case ImportPackage.TRIP__TRIP_ID:
				setTripID((String)newValue);
				return;
			case ImportPackage.TRIP__DATE:
				setDate((String)newValue);
				return;
			case ImportPackage.TRIP__LINE:
				setLine((String)newValue);
				return;
			case ImportPackage.TRIP__DESTINATION:
				setDestination((String)newValue);
				return;
			case ImportPackage.TRIP__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends Quay>)newValue);
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
			case ImportPackage.TRIP__TRIP_ID:
				setTripID(TRIP_ID_EDEFAULT);
				return;
			case ImportPackage.TRIP__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ImportPackage.TRIP__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case ImportPackage.TRIP__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case ImportPackage.TRIP__STOPS:
				getStops().clear();
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
			case ImportPackage.TRIP__TRIP_ID:
				return TRIP_ID_EDEFAULT == null ? tripID != null : !TRIP_ID_EDEFAULT.equals(tripID);
			case ImportPackage.TRIP__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ImportPackage.TRIP__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case ImportPackage.TRIP__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case ImportPackage.TRIP__STOPS:
				return stops != null && !stops.isEmpty();
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
		result.append(" (tripID: ");
		result.append(tripID);
		result.append(", date: ");
		result.append(date);
		result.append(", line: ");
		result.append(line);
		result.append(", destination: ");
		result.append(destination);
		result.append(')');
		return result.toString();
	}

} //TripImpl
