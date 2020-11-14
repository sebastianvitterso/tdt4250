/**
 */
package atb.impl;

import atb.AtbPackage;
import atb.Busstops;
import atb.Departure;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link atb.impl.DepartureImpl#getLine <em>Line</em>}</li>
 *   <li>{@link atb.impl.DepartureImpl#getRegisteredDepartureTime <em>Registered Departure Time</em>}</li>
 *   <li>{@link atb.impl.DepartureImpl#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 *   <li>{@link atb.impl.DepartureImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link atb.impl.DepartureImpl#getDestinationStop <em>Destination Stop</em>}</li>
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
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

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
	 * The cached value of the '{@link #getDestinationStop() <em>Destination Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationStop()
	 * @generated
	 * @ordered
	 */
	protected Busstops destinationStop;

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
		return AtbPackage.Literals.DEPARTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.DEPARTURE__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME, oldRegisteredDepartureTime, registeredDepartureTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME, oldScheduledDepartureTime, scheduledDepartureTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.DEPARTURE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops getDestinationStop() {
		if (destinationStop != null && destinationStop.eIsProxy()) {
			InternalEObject oldDestinationStop = (InternalEObject)destinationStop;
			destinationStop = (Busstops)eResolveProxy(oldDestinationStop);
			if (destinationStop != oldDestinationStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.DEPARTURE__DESTINATION_STOP, oldDestinationStop, destinationStop));
			}
		}
		return destinationStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops basicGetDestinationStop() {
		return destinationStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationStop(Busstops newDestinationStop) {
		Busstops oldDestinationStop = destinationStop;
		destinationStop = newDestinationStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.DEPARTURE__DESTINATION_STOP, oldDestinationStop, destinationStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtbPackage.DEPARTURE__LINE:
				return getLine();
			case AtbPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				return getRegisteredDepartureTime();
			case AtbPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				return getScheduledDepartureTime();
			case AtbPackage.DEPARTURE__DESTINATION:
				return getDestination();
			case AtbPackage.DEPARTURE__DESTINATION_STOP:
				if (resolve) return getDestinationStop();
				return basicGetDestinationStop();
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
			case AtbPackage.DEPARTURE__LINE:
				setLine((Integer)newValue);
				return;
			case AtbPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				setRegisteredDepartureTime((Date)newValue);
				return;
			case AtbPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime((Date)newValue);
				return;
			case AtbPackage.DEPARTURE__DESTINATION:
				setDestination((String)newValue);
				return;
			case AtbPackage.DEPARTURE__DESTINATION_STOP:
				setDestinationStop((Busstops)newValue);
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
			case AtbPackage.DEPARTURE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case AtbPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				setRegisteredDepartureTime(REGISTERED_DEPARTURE_TIME_EDEFAULT);
				return;
			case AtbPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime(SCHEDULED_DEPARTURE_TIME_EDEFAULT);
				return;
			case AtbPackage.DEPARTURE__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case AtbPackage.DEPARTURE__DESTINATION_STOP:
				setDestinationStop((Busstops)null);
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
			case AtbPackage.DEPARTURE__LINE:
				return line != LINE_EDEFAULT;
			case AtbPackage.DEPARTURE__REGISTERED_DEPARTURE_TIME:
				return REGISTERED_DEPARTURE_TIME_EDEFAULT == null ? registeredDepartureTime != null : !REGISTERED_DEPARTURE_TIME_EDEFAULT.equals(registeredDepartureTime);
			case AtbPackage.DEPARTURE__SCHEDULED_DEPARTURE_TIME:
				return SCHEDULED_DEPARTURE_TIME_EDEFAULT == null ? scheduledDepartureTime != null : !SCHEDULED_DEPARTURE_TIME_EDEFAULT.equals(scheduledDepartureTime);
			case AtbPackage.DEPARTURE__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case AtbPackage.DEPARTURE__DESTINATION_STOP:
				return destinationStop != null;
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
		result.append(", registeredDepartureTime: ");
		result.append(registeredDepartureTime);
		result.append(", scheduledDepartureTime: ");
		result.append(scheduledDepartureTime);
		result.append(", destination: ");
		result.append(destination);
		result.append(')');
		return result.toString();
	}

} //DepartureImpl
