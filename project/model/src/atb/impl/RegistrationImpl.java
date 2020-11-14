/**
 */
package atb.impl;

import atb.AtbPackage;
import atb.Busstops;
import atb.Departure;
import atb.Passenger;
import atb.Registration;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atb.impl.RegistrationImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getTo <em>To</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getDeparture <em>Departure</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getToTime <em>To Time</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#getLine <em>Line</em>}</li>
 *   <li>{@link atb.impl.RegistrationImpl#isInfected <em>Infected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationImpl extends MinimalEObjectImpl.Container implements Registration {
	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected Passenger passenger;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Busstops from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Busstops to;

	/**
	 * The cached value of the '{@link #getDeparture() <em>Departure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture()
	 * @generated
	 * @ordered
	 */
	protected Departure departure;

	/**
	 * The default value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected Date fromTime = FROM_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected Date toTime = TO_TIME_EDEFAULT;

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
	 * The default value of the '{@link #isInfected() <em>Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfected() <em>Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfected()
	 * @generated
	 * @ordered
	 */
	protected boolean infected = INFECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtbPackage.Literals.REGISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger getPassenger() {
		if (passenger != null && passenger.eIsProxy()) {
			InternalEObject oldPassenger = (InternalEObject)passenger;
			passenger = (Passenger)eResolveProxy(oldPassenger);
			if (passenger != oldPassenger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.REGISTRATION__PASSENGER, oldPassenger, passenger));
			}
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger basicGetPassenger() {
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassenger(Passenger newPassenger) {
		Passenger oldPassenger = passenger;
		passenger = newPassenger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__PASSENGER, oldPassenger, passenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Busstops)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.REGISTRATION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Busstops newFrom) {
		Busstops oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Busstops)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.REGISTRATION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busstops basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Busstops newTo) {
		Busstops oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departure getDeparture() {
		if (departure != null && departure.eIsProxy()) {
			InternalEObject oldDeparture = (InternalEObject)departure;
			departure = (Departure)eResolveProxy(oldDeparture);
			if (departure != oldDeparture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtbPackage.REGISTRATION__DEPARTURE, oldDeparture, departure));
			}
		}
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departure basicGetDeparture() {
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeparture(Departure newDeparture) {
		Departure oldDeparture = departure;
		departure = newDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__DEPARTURE, oldDeparture, departure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromTime() {
		return fromTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTime(Date newFromTime) {
		Date oldFromTime = fromTime;
		fromTime = newFromTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__FROM_TIME, oldFromTime, fromTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToTime() {
		return toTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTime(Date newToTime) {
		Date oldToTime = toTime;
		toTime = newToTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__TO_TIME, oldToTime, toTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfected() {
		return infected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfected(boolean newInfected) {
		boolean oldInfected = infected;
		infected = newInfected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtbPackage.REGISTRATION__INFECTED, oldInfected, infected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtbPackage.REGISTRATION__PASSENGER:
				if (resolve) return getPassenger();
				return basicGetPassenger();
			case AtbPackage.REGISTRATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case AtbPackage.REGISTRATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case AtbPackage.REGISTRATION__DEPARTURE:
				if (resolve) return getDeparture();
				return basicGetDeparture();
			case AtbPackage.REGISTRATION__FROM_TIME:
				return getFromTime();
			case AtbPackage.REGISTRATION__TO_TIME:
				return getToTime();
			case AtbPackage.REGISTRATION__LINE:
				return getLine();
			case AtbPackage.REGISTRATION__INFECTED:
				return isInfected();
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
			case AtbPackage.REGISTRATION__PASSENGER:
				setPassenger((Passenger)newValue);
				return;
			case AtbPackage.REGISTRATION__FROM:
				setFrom((Busstops)newValue);
				return;
			case AtbPackage.REGISTRATION__TO:
				setTo((Busstops)newValue);
				return;
			case AtbPackage.REGISTRATION__DEPARTURE:
				setDeparture((Departure)newValue);
				return;
			case AtbPackage.REGISTRATION__FROM_TIME:
				setFromTime((Date)newValue);
				return;
			case AtbPackage.REGISTRATION__TO_TIME:
				setToTime((Date)newValue);
				return;
			case AtbPackage.REGISTRATION__LINE:
				setLine((Integer)newValue);
				return;
			case AtbPackage.REGISTRATION__INFECTED:
				setInfected((Boolean)newValue);
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
			case AtbPackage.REGISTRATION__PASSENGER:
				setPassenger((Passenger)null);
				return;
			case AtbPackage.REGISTRATION__FROM:
				setFrom((Busstops)null);
				return;
			case AtbPackage.REGISTRATION__TO:
				setTo((Busstops)null);
				return;
			case AtbPackage.REGISTRATION__DEPARTURE:
				setDeparture((Departure)null);
				return;
			case AtbPackage.REGISTRATION__FROM_TIME:
				setFromTime(FROM_TIME_EDEFAULT);
				return;
			case AtbPackage.REGISTRATION__TO_TIME:
				setToTime(TO_TIME_EDEFAULT);
				return;
			case AtbPackage.REGISTRATION__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case AtbPackage.REGISTRATION__INFECTED:
				setInfected(INFECTED_EDEFAULT);
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
			case AtbPackage.REGISTRATION__PASSENGER:
				return passenger != null;
			case AtbPackage.REGISTRATION__FROM:
				return from != null;
			case AtbPackage.REGISTRATION__TO:
				return to != null;
			case AtbPackage.REGISTRATION__DEPARTURE:
				return departure != null;
			case AtbPackage.REGISTRATION__FROM_TIME:
				return FROM_TIME_EDEFAULT == null ? fromTime != null : !FROM_TIME_EDEFAULT.equals(fromTime);
			case AtbPackage.REGISTRATION__TO_TIME:
				return TO_TIME_EDEFAULT == null ? toTime != null : !TO_TIME_EDEFAULT.equals(toTime);
			case AtbPackage.REGISTRATION__LINE:
				return line != LINE_EDEFAULT;
			case AtbPackage.REGISTRATION__INFECTED:
				return infected != INFECTED_EDEFAULT;
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
		result.append(" (fromTime: ");
		result.append(fromTime);
		result.append(", toTime: ");
		result.append(toTime);
		result.append(", line: ");
		result.append(line);
		result.append(", infected: ");
		result.append(infected);
		result.append(')');
		return result.toString();
	}

} //RegistrationImpl
