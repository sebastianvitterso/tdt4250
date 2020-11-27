/**
 */
package import_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see import_.ImportFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface ImportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "import";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/atb/model/import.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "import";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImportPackage eINSTANCE = import_.impl.ImportPackageImpl.init();

	/**
	 * The meta object id for the '{@link import_.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.ContainerImpl
	 * @see import_.impl.ImportPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Quays</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__QUAYS = 0;

	/**
	 * The feature id for the '<em><b>Realtimes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REALTIMES = 1;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRIPS = 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link import_.impl.QuayImpl <em>Quay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.QuayImpl
	 * @see import_.impl.ImportPackageImpl#getQuay()
	 * @generated
	 */
	int QUAY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Stop Place Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__STOP_PLACE_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__PLACE = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__Y = 5;

	/**
	 * The feature id for the '<em><b>Compass Bearing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY__COMPASS_BEARING = 6;

	/**
	 * The number of structural features of the '<em>Quay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Quay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link import_.impl.RealtimeImpl <em>Realtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.RealtimeImpl
	 * @see import_.impl.ImportPackageImpl#getRealtime()
	 * @generated
	 */
	int REALTIME = 2;

	/**
	 * The feature id for the '<em><b>Bus Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME__BUS_STOP_ID = 0;

	/**
	 * The feature id for the '<em><b>Bus Stop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME__BUS_STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME__LATITUDE = 3;

	/**
	 * The feature id for the '<em><b>Departure Forecasts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME__DEPARTURE_FORECASTS = 4;

	/**
	 * The number of structural features of the '<em>Realtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Realtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link import_.impl.DepartureImpl <em>Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.DepartureImpl
	 * @see import_.impl.ImportPackageImpl#getDeparture()
	 * @generated
	 */
	int DEPARTURE = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__LINE = 0;

	/**
	 * The feature id for the '<em><b>Destination Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION_DISPLAY = 1;

	/**
	 * The feature id for the '<em><b>Origin Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__ORIGIN_REF = 2;

	/**
	 * The feature id for the '<em><b>Origin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__ORIGIN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Destination Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION_REF = 4;

	/**
	 * The feature id for the '<em><b>Destination Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION_NAME = 5;

	/**
	 * The feature id for the '<em><b>Registered Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__REGISTERED_DEPARTURE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Scheduled Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__SCHEDULED_DEPARTURE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Is Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__IS_REAL_TIME = 8;

	/**
	 * The feature id for the '<em><b>Trip Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__TRIP_ID = 9;

	/**
	 * The feature id for the '<em><b>Group Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__GROUP_MAP_KEY = 10;

	/**
	 * The number of structural features of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link import_.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.TripImpl
	 * @see import_.impl.ImportPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 4;

	/**
	 * The feature id for the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__TRIP_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DATE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__LINE = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__STOPS = 4;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link import_.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see import_.impl.StopImpl
	 * @see import_.impl.ImportPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 5;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__DESTINATION = 0;

	/**
	 * The feature id for the '<em><b>Busstop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__BUSSTOP_ID = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__TIME = 2;

	/**
	 * The feature id for the '<em><b>Aimed Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__AIMED_DEPARTURE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Expected Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__EXPECTED_DEPARTURE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Realtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__REALTIME = 5;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LONGITUDE = 6;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LATITUDE = 7;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link import_.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see import_.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link import_.Container#getQuays <em>Quays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quays</em>'.
	 * @see import_.Container#getQuays()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Quays();

	/**
	 * Returns the meta object for the containment reference '{@link import_.Container#getRealtimes <em>Realtimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Realtimes</em>'.
	 * @see import_.Container#getRealtimes()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Realtimes();

	/**
	 * Returns the meta object for the containment reference '{@link import_.Container#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trips</em>'.
	 * @see import_.Container#getTrips()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Trips();

	/**
	 * Returns the meta object for class '{@link import_.Quay <em>Quay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quay</em>'.
	 * @see import_.Quay
	 * @generated
	 */
	EClass getQuay();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see import_.Quay#getId()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_Id();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getStopPlaceId <em>Stop Place Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Place Id</em>'.
	 * @see import_.Quay#getStopPlaceId()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_StopPlaceId();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see import_.Quay#getName()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_Name();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see import_.Quay#getPlace()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_Place();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see import_.Quay#getX()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_X();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see import_.Quay#getY()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_Y();

	/**
	 * Returns the meta object for the attribute '{@link import_.Quay#getCompassBearing <em>Compass Bearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compass Bearing</em>'.
	 * @see import_.Quay#getCompassBearing()
	 * @see #getQuay()
	 * @generated
	 */
	EAttribute getQuay_CompassBearing();

	/**
	 * Returns the meta object for class '{@link import_.Realtime <em>Realtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime</em>'.
	 * @see import_.Realtime
	 * @generated
	 */
	EClass getRealtime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Realtime#getBusStopID <em>Bus Stop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Stop ID</em>'.
	 * @see import_.Realtime#getBusStopID()
	 * @see #getRealtime()
	 * @generated
	 */
	EAttribute getRealtime_BusStopID();

	/**
	 * Returns the meta object for the attribute '{@link import_.Realtime#getBusStopName <em>Bus Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Stop Name</em>'.
	 * @see import_.Realtime#getBusStopName()
	 * @see #getRealtime()
	 * @generated
	 */
	EAttribute getRealtime_BusStopName();

	/**
	 * Returns the meta object for the attribute '{@link import_.Realtime#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see import_.Realtime#getLongitude()
	 * @see #getRealtime()
	 * @generated
	 */
	EAttribute getRealtime_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link import_.Realtime#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see import_.Realtime#getLatitude()
	 * @see #getRealtime()
	 * @generated
	 */
	EAttribute getRealtime_Latitude();

	/**
	 * Returns the meta object for the reference '{@link import_.Realtime#getDepartureForecasts <em>Departure Forecasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departure Forecasts</em>'.
	 * @see import_.Realtime#getDepartureForecasts()
	 * @see #getRealtime()
	 * @generated
	 */
	EReference getRealtime_DepartureForecasts();

	/**
	 * Returns the meta object for class '{@link import_.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departure</em>'.
	 * @see import_.Departure
	 * @generated
	 */
	EClass getDeparture();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see import_.Departure#getLine()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_Line();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getDestinationDisplay <em>Destination Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Display</em>'.
	 * @see import_.Departure#getDestinationDisplay()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_DestinationDisplay();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getOriginRef <em>Origin Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Ref</em>'.
	 * @see import_.Departure#getOriginRef()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_OriginRef();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getOriginName <em>Origin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Name</em>'.
	 * @see import_.Departure#getOriginName()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_OriginName();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getDestinationRef <em>Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Ref</em>'.
	 * @see import_.Departure#getDestinationRef()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_DestinationRef();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getDestinationName <em>Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Name</em>'.
	 * @see import_.Departure#getDestinationName()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_DestinationName();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getRegisteredDepartureTime <em>Registered Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered Departure Time</em>'.
	 * @see import_.Departure#getRegisteredDepartureTime()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_RegisteredDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getScheduledDepartureTime <em>Scheduled Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Departure Time</em>'.
	 * @see import_.Departure#getScheduledDepartureTime()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_ScheduledDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#isIsRealTime <em>Is Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Real Time</em>'.
	 * @see import_.Departure#isIsRealTime()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_IsRealTime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getTripId <em>Trip Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip Id</em>'.
	 * @see import_.Departure#getTripId()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_TripId();

	/**
	 * Returns the meta object for the attribute '{@link import_.Departure#getGroupMapKey <em>Group Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Map Key</em>'.
	 * @see import_.Departure#getGroupMapKey()
	 * @see #getDeparture()
	 * @generated
	 */
	EAttribute getDeparture_GroupMapKey();

	/**
	 * Returns the meta object for class '{@link import_.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see import_.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link import_.Trip#getTripID <em>Trip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip ID</em>'.
	 * @see import_.Trip#getTripID()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_TripID();

	/**
	 * Returns the meta object for the attribute '{@link import_.Trip#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see import_.Trip#getDate()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Date();

	/**
	 * Returns the meta object for the attribute '{@link import_.Trip#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see import_.Trip#getLine()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Line();

	/**
	 * Returns the meta object for the attribute '{@link import_.Trip#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see import_.Trip#getDestination()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Destination();

	/**
	 * Returns the meta object for the reference '{@link import_.Trip#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stops</em>'.
	 * @see import_.Trip#getStops()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Stops();

	/**
	 * Returns the meta object for class '{@link import_.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see import_.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see import_.Stop#getDestination()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Destination();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getBusstopID <em>Busstop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busstop ID</em>'.
	 * @see import_.Stop#getBusstopID()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_BusstopID();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see import_.Stop#getTime()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Time();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getAimedDepartureTime <em>Aimed Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aimed Departure Time</em>'.
	 * @see import_.Stop#getAimedDepartureTime()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_AimedDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getExpectedDepartureTime <em>Expected Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Departure Time</em>'.
	 * @see import_.Stop#getExpectedDepartureTime()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_ExpectedDepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#isRealtime <em>Realtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realtime</em>'.
	 * @see import_.Stop#isRealtime()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Realtime();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see import_.Stop#getLongitude()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link import_.Stop#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see import_.Stop#getLatitude()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Latitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImportFactory getImportFactory();

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
		 * The meta object literal for the '{@link import_.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.ContainerImpl
		 * @see import_.impl.ImportPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Quays</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__QUAYS = eINSTANCE.getContainer_Quays();

		/**
		 * The meta object literal for the '<em><b>Realtimes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__REALTIMES = eINSTANCE.getContainer_Realtimes();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TRIPS = eINSTANCE.getContainer_Trips();

		/**
		 * The meta object literal for the '{@link import_.impl.QuayImpl <em>Quay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.QuayImpl
		 * @see import_.impl.ImportPackageImpl#getQuay()
		 * @generated
		 */
		EClass QUAY = eINSTANCE.getQuay();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__ID = eINSTANCE.getQuay_Id();

		/**
		 * The meta object literal for the '<em><b>Stop Place Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__STOP_PLACE_ID = eINSTANCE.getQuay_StopPlaceId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__NAME = eINSTANCE.getQuay_Name();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__PLACE = eINSTANCE.getQuay_Place();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__X = eINSTANCE.getQuay_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__Y = eINSTANCE.getQuay_Y();

		/**
		 * The meta object literal for the '<em><b>Compass Bearing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUAY__COMPASS_BEARING = eINSTANCE.getQuay_CompassBearing();

		/**
		 * The meta object literal for the '{@link import_.impl.RealtimeImpl <em>Realtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.RealtimeImpl
		 * @see import_.impl.ImportPackageImpl#getRealtime()
		 * @generated
		 */
		EClass REALTIME = eINSTANCE.getRealtime();

		/**
		 * The meta object literal for the '<em><b>Bus Stop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME__BUS_STOP_ID = eINSTANCE.getRealtime_BusStopID();

		/**
		 * The meta object literal for the '<em><b>Bus Stop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME__BUS_STOP_NAME = eINSTANCE.getRealtime_BusStopName();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME__LONGITUDE = eINSTANCE.getRealtime_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME__LATITUDE = eINSTANCE.getRealtime_Latitude();

		/**
		 * The meta object literal for the '<em><b>Departure Forecasts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME__DEPARTURE_FORECASTS = eINSTANCE.getRealtime_DepartureForecasts();

		/**
		 * The meta object literal for the '{@link import_.impl.DepartureImpl <em>Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.DepartureImpl
		 * @see import_.impl.ImportPackageImpl#getDeparture()
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
		 * The meta object literal for the '<em><b>Destination Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__DESTINATION_DISPLAY = eINSTANCE.getDeparture_DestinationDisplay();

		/**
		 * The meta object literal for the '<em><b>Origin Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__ORIGIN_REF = eINSTANCE.getDeparture_OriginRef();

		/**
		 * The meta object literal for the '<em><b>Origin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__ORIGIN_NAME = eINSTANCE.getDeparture_OriginName();

		/**
		 * The meta object literal for the '<em><b>Destination Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__DESTINATION_REF = eINSTANCE.getDeparture_DestinationRef();

		/**
		 * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__DESTINATION_NAME = eINSTANCE.getDeparture_DestinationName();

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
		 * The meta object literal for the '<em><b>Is Real Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__IS_REAL_TIME = eINSTANCE.getDeparture_IsRealTime();

		/**
		 * The meta object literal for the '<em><b>Trip Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__TRIP_ID = eINSTANCE.getDeparture_TripId();

		/**
		 * The meta object literal for the '<em><b>Group Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTURE__GROUP_MAP_KEY = eINSTANCE.getDeparture_GroupMapKey();

		/**
		 * The meta object literal for the '{@link import_.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.TripImpl
		 * @see import_.impl.ImportPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Trip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__TRIP_ID = eINSTANCE.getTrip_TripID();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__DATE = eINSTANCE.getTrip_Date();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__LINE = eINSTANCE.getTrip_Line();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__DESTINATION = eINSTANCE.getTrip_Destination();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__STOPS = eINSTANCE.getTrip_Stops();

		/**
		 * The meta object literal for the '{@link import_.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see import_.impl.StopImpl
		 * @see import_.impl.ImportPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__DESTINATION = eINSTANCE.getStop_Destination();

		/**
		 * The meta object literal for the '<em><b>Busstop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__BUSSTOP_ID = eINSTANCE.getStop_BusstopID();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__TIME = eINSTANCE.getStop_Time();

		/**
		 * The meta object literal for the '<em><b>Aimed Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__AIMED_DEPARTURE_TIME = eINSTANCE.getStop_AimedDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Expected Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__EXPECTED_DEPARTURE_TIME = eINSTANCE.getStop_ExpectedDepartureTime();

		/**
		 * The meta object literal for the '<em><b>Realtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__REALTIME = eINSTANCE.getStop_Realtime();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__LONGITUDE = eINSTANCE.getStop_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__LATITUDE = eINSTANCE.getStop_Latitude();

	}

} //ImportPackage
