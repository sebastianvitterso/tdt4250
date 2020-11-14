/**
 */
package atb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atb.AtbFactory
 * @model kind="package"
 * @generated
 */
public interface AtbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/atb/model/atb.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtbPackage eINSTANCE = atb.impl.AtbPackageImpl.init();

	/**
	 * The meta object id for the '{@link atb.impl.AtbImpl <em>Atb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atb.impl.AtbImpl
	 * @see atb.impl.AtbPackageImpl#getAtb()
	 * @generated
	 */
	int ATB = 0;

	/**
	 * The feature id for the '<em><b>Busstops</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATB__BUSSTOPS = 0;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATB__PASSENGERS = 1;

	/**
	 * The feature id for the '<em><b>Registrations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATB__REGISTRATIONS = 2;

	/**
	 * The number of structural features of the '<em>Atb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atb.impl.BusstopsImpl <em>Busstops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atb.impl.BusstopsImpl
	 * @see atb.impl.AtbPackageImpl#getBusstops()
	 * @generated
	 */
	int BUSSTOPS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stop Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__STOP_ID = 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__NODE_ID = 2;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__LONGITUDE = 3;

	/**
	 * The feature id for the '<em><b>Langitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__LANGITUDE = 4;

	/**
	 * The feature id for the '<em><b>Is Going Towards Centrum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__IS_GOING_TOWARDS_CENTRUM = 5;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS__DEPARTURES = 6;

	/**
	 * The number of structural features of the '<em>Busstops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Busstops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSTOPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atb.impl.DepartureImpl <em>Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atb.impl.DepartureImpl
	 * @see atb.impl.AtbPackageImpl#getDeparture()
	 * @generated
	 */
	int DEPARTURE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__LINE = 0;

	/**
	 * The feature id for the '<em><b>Registered Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__REGISTERED_DEPARTURE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Scheduled Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__SCHEDULED_DEPARTURE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Destination Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION_STOP = 4;

	/**
	 * The number of structural features of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atb.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atb.impl.PassengerImpl
	 * @see atb.impl.AtbPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PHONE_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atb.impl.RegistrationImpl <em>Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atb.impl.RegistrationImpl
	 * @see atb.impl.AtbPackageImpl#getRegistration()
	 * @generated
	 */
	int REGISTRATION = 4;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__PASSENGER = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__TO = 2;

	/**
	 * The feature id for the '<em><b>Departure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__DEPARTURE = 3;

	/**
	 * The feature id for the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__FROM_TIME = 4;

	/**
	 * The feature id for the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__TO_TIME = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__LINE = 6;

	/**
	 * The feature id for the '<em><b>Infected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__INFECTED = 7;

	/**
	 * The number of structural features of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>phone Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see atb.impl.AtbPackageImpl#getphoneNumber()
	 * @generated
	 */
	int PHONE_NUMBER = 5;


	/**
	 * Returns the meta object for class '{@link atb.Atb <em>Atb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atb</em>'.
	 * @see atb.Atb
	 * @generated
	 */
	EClass getAtb();

	/**
	 * Returns the meta object for the reference '{@link atb.Atb#getBusstops <em>Busstops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Busstops</em>'.
	 * @see atb.Atb#getBusstops()
	 * @see #getAtb()
	 * @generated
	 */
	EReference getAtb_Busstops();

	/**
	 * Returns the meta object for the reference '{@link atb.Atb#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passengers</em>'.
	 * @see atb.Atb#getPassengers()
	 * @see #getAtb()
	 * @generated
	 */
	EReference getAtb_Passengers();

	/**
	 * Returns the meta object for the reference '{@link atb.Atb#getRegistrations <em>Registrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registrations</em>'.
	 * @see atb.Atb#getRegistrations()
	 * @see #getAtb()
	 * @generated
	 */
	EReference getAtb_Registrations();

	/**
	 * Returns the meta object for class '{@link atb.Busstops <em>Busstops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busstops</em>'.
	 * @see atb.Busstops
	 * @generated
	 */
	EClass getBusstops();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atb.Busstops#getName()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_Name();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#getStopId <em>Stop Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Id</em>'.
	 * @see atb.Busstops#getStopId()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_StopId();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see atb.Busstops#getNodeId()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see atb.Busstops#getLongitude()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#getLangitude <em>Langitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langitude</em>'.
	 * @see atb.Busstops#getLangitude()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_Langitude();

	/**
	 * Returns the meta object for the attribute '{@link atb.Busstops#isIsGoingTowardsCentrum <em>Is Going Towards Centrum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Going Towards Centrum</em>'.
	 * @see atb.Busstops#isIsGoingTowardsCentrum()
	 * @see #getBusstops()
	 * @generated
	 */
	EAttribute getBusstops_IsGoingTowardsCentrum();

	/**
	 * Returns the meta object for the reference list '{@link atb.Busstops#getDepartures <em>Departures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Departures</em>'.
	 * @see atb.Busstops#getDepartures()
	 * @see #getBusstops()
	 * @generated
	 */
	EReference getBusstops_Departures();

	/**
	 * Returns the meta object for class '{@link atb.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departure</em>'.
	 * @see atb.Departure
	 * @generated
	 */
	EClass getDeparture();

	/**
	 * Returns the meta object for the attribute '{@link atb.Departure#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see atb.Departure#getLine()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_Line();

	/**
	 * Returns the meta object for the attribute '{@link atb.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered Departure Time</em>'.
	 * @see atb.Departure#getRegisteredDepartureTime()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_RegisteredDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link atb.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Departure Time</em>'.
	 * @see atb.Departure#getScheduledDepartureTime()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_ScheduledDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link atb.Departure#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see atb.Departure#getDestination()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_Destination();

	/**
	 * Returns the meta object for the reference '{@link atb.Departure#getDestinationStop <em>Destination Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Stop</em>'.
	 * @see atb.Departure#getDestinationStop()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_DestinationStop();

	/**
	 * Returns the meta object for class '{@link atb.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see atb.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link atb.Passenger#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see atb.Passenger#getFirstName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link atb.Passenger#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see atb.Passenger#getLastName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_LastName();

	/**
	 * Returns the meta object for the attribute '{@link atb.Passenger#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see atb.Passenger#getPhoneNumber()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PhoneNumber();

	/**
	 * Returns the meta object for class '{@link atb.Registration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration</em>'.
	 * @see atb.Registration
	 * @generated
	 */
	EClass getRegistration();

	/**
	 * Returns the meta object for the reference '{@link atb.Registration#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger</em>'.
	 * @see atb.Registration#getPassenger()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_Passenger();

	/**
	 * Returns the meta object for the reference '{@link atb.Registration#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see atb.Registration#getFrom()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_From();

	/**
	 * Returns the meta object for the reference '{@link atb.Registration#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see atb.Registration#getTo()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_To();

	/**
	 * Returns the meta object for the reference '{@link atb.Registration#getDeparture <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departure</em>'.
	 * @see atb.Registration#getDeparture()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_Departure();

	/**
	 * Returns the meta object for the attribute '{@link atb.Registration#getFromTime <em>From Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Time</em>'.
	 * @see atb.Registration#getFromTime()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_FromTime();

	/**
	 * Returns the meta object for the attribute '{@link atb.Registration#getToTime <em>To Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Time</em>'.
	 * @see atb.Registration#getToTime()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_ToTime();

	/**
	 * Returns the meta object for the attribute '{@link atb.Registration#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see atb.Registration#getLine()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_Line();

	/**
	 * Returns the meta object for the attribute '{@link atb.Registration#isInfected <em>Infected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infected</em>'.
	 * @see atb.Registration#isInfected()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_Infected();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>phone Number</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="pattern='[0-9]{8}'"
	 * @generated
	 */
	EDataType getphoneNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtbFactory getAtbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atb.impl.AtbImpl <em>Atb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atb.impl.AtbImpl
		 * @see atb.impl.AtbPackageImpl#getAtb()
		 * @generated
		 */
		EClass ATB = eINSTANCE.getAtb();

		/**
		 * The meta object literal for the '<em><b>Busstops</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATB__BUSSTOPS = eINSTANCE.getAtb_Busstops();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATB__PASSENGERS = eINSTANCE.getAtb_Passengers();

		/**
		 * The meta object literal for the '<em><b>Registrations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATB__REGISTRATIONS = eINSTANCE.getAtb_Registrations();

		/**
		 * The meta object literal for the '{@link atb.impl.BusstopsImpl <em>Busstops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atb.impl.BusstopsImpl
		 * @see atb.impl.AtbPackageImpl#getBusstops()
		 * @generated
		 */
		EClass BUSSTOPS = eINSTANCE.getBusstops();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__NAME = eINSTANCE.getBusstops_Name();

		/**
		 * The meta object literal for the '<em><b>Stop Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__STOP_ID = eINSTANCE.getBusstops_StopId();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__NODE_ID = eINSTANCE.getBusstops_NodeId();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__LONGITUDE = eINSTANCE.getBusstops_Longitude();

		/**
		 * The meta object literal for the '<em><b>Langitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__LANGITUDE = eINSTANCE.getBusstops_Langitude();

		/**
		 * The meta object literal for the '<em><b>Is Going Towards Centrum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSTOPS__IS_GOING_TOWARDS_CENTRUM = eINSTANCE.getBusstops_IsGoingTowardsCentrum();

		/**
		 * The meta object literal for the '<em><b>Departures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSSTOPS__DEPARTURES = eINSTANCE.getBusstops_Departures();

		/**
		 * The meta object literal for the '{@link atb.impl.DepartureImpl <em>Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atb.impl.DepartureImpl
		 * @see atb.impl.AtbPackageImpl#getDeparture()
		 * @generated
		 */
		EClass DEPARTURE = eINSTANCE.getDeparture();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__LINE = eINSTANCE.getDeparture_Line();

		/**
		 * The meta object literal for the '<em><b>Registered Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__REGISTERED_DEPARTURE_TIME = eINSTANCE.getDeparture_RegisteredDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Scheduled Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__SCHEDULED_DEPARTURE_TIME = eINSTANCE.getDeparture_ScheduledDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__DESTINATION = eINSTANCE.getDeparture_Destination();

		/**
		 * The meta object literal for the '<em><b>Destination Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTURE__DESTINATION_STOP = eINSTANCE.getDeparture_DestinationStop();

		/**
		 * The meta object literal for the '{@link atb.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atb.impl.PassengerImpl
		 * @see atb.impl.AtbPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__FIRST_NAME = eINSTANCE.getPassenger_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__LAST_NAME = eINSTANCE.getPassenger_LastName();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PHONE_NUMBER = eINSTANCE.getPassenger_PhoneNumber();

		/**
		 * The meta object literal for the '{@link atb.impl.RegistrationImpl <em>Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atb.impl.RegistrationImpl
		 * @see atb.impl.AtbPackageImpl#getRegistration()
		 * @generated
		 */
		EClass REGISTRATION = eINSTANCE.getRegistration();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__PASSENGER = eINSTANCE.getRegistration_Passenger();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__FROM = eINSTANCE.getRegistration_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__TO = eINSTANCE.getRegistration_To();

		/**
		 * The meta object literal for the '<em><b>Departure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__DEPARTURE = eINSTANCE.getRegistration_Departure();

		/**
		 * The meta object literal for the '<em><b>From Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__FROM_TIME = eINSTANCE.getRegistration_FromTime();

		/**
		 * The meta object literal for the '<em><b>To Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__TO_TIME = eINSTANCE.getRegistration_ToTime();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__LINE = eINSTANCE.getRegistration_Line();

		/**
		 * The meta object literal for the '<em><b>Infected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__INFECTED = eINSTANCE.getRegistration_Infected();

		/**
		 * The meta object literal for the '<em>phone Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see atb.impl.AtbPackageImpl#getphoneNumber()
		 * @generated
		 */
		EDataType PHONE_NUMBER = eINSTANCE.getphoneNumber();

	}

} //AtbPackage
