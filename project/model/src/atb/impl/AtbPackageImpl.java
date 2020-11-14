/**
 */
package atb.impl;

import atb.Atb;
import atb.AtbFactory;
import atb.AtbPackage;
import atb.Busstops;
import atb.Departure;
import atb.Passenger;
import atb.Registration;

import atb.util.AtbValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtbPackageImpl extends EPackageImpl implements AtbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busstopsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phoneNumberEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see atb.AtbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtbPackageImpl() {
		super(eNS_URI, AtbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtbPackage init() {
		if (isInited) return (AtbPackage)EPackage.Registry.INSTANCE.getEPackage(AtbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtbPackageImpl theAtbPackage = registeredAtbPackage instanceof AtbPackageImpl ? (AtbPackageImpl)registeredAtbPackage : new AtbPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAtbPackage.createPackageContents();

		// Initialize created meta-data
		theAtbPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAtbPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AtbValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAtbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtbPackage.eNS_URI, theAtbPackage);
		return theAtbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtb() {
		return atbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtb_Busstops() {
		return (EReference)atbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtb_Passengers() {
		return (EReference)atbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtb_Registrations() {
		return (EReference)atbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusstops() {
		return busstopsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_Name() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_StopId() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_NodeId() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_Longitude() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_Langitude() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusstops_IsGoingTowardsCentrum() {
		return (EAttribute)busstopsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusstops_Departures() {
		return (EReference)busstopsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeparture() {
		return departureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeparture_Line() {
		return (EAttribute)departureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeparture_RegisteredDepartureTime() {
		return (EAttribute)departureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeparture_ScheduledDepartureTime() {
		return (EAttribute)departureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeparture_Destination() {
		return (EAttribute)departureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeparture_DestinationStop() {
		return (EReference)departureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassenger() {
		return passengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_FirstName() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_LastName() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PhoneNumber() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistration() {
		return registrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_Passenger() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_From() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_To() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_Departure() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_FromTime() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_ToTime() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_Line() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_Infected() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getphoneNumber() {
		return phoneNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtbFactory getAtbFactory() {
		return (AtbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		atbEClass = createEClass(ATB);
		createEReference(atbEClass, ATB__BUSSTOPS);
		createEReference(atbEClass, ATB__PASSENGERS);
		createEReference(atbEClass, ATB__REGISTRATIONS);

		busstopsEClass = createEClass(BUSSTOPS);
		createEAttribute(busstopsEClass, BUSSTOPS__NAME);
		createEAttribute(busstopsEClass, BUSSTOPS__STOP_ID);
		createEAttribute(busstopsEClass, BUSSTOPS__NODE_ID);
		createEAttribute(busstopsEClass, BUSSTOPS__LONGITUDE);
		createEAttribute(busstopsEClass, BUSSTOPS__LANGITUDE);
		createEAttribute(busstopsEClass, BUSSTOPS__IS_GOING_TOWARDS_CENTRUM);
		createEReference(busstopsEClass, BUSSTOPS__DEPARTURES);

		departureEClass = createEClass(DEPARTURE);
		createEAttribute(departureEClass, DEPARTURE__LINE);
		createEAttribute(departureEClass, DEPARTURE__REGISTERED_DEPARTURE_TIME);
		createEAttribute(departureEClass, DEPARTURE__SCHEDULED_DEPARTURE_TIME);
		createEAttribute(departureEClass, DEPARTURE__DESTINATION);
		createEReference(departureEClass, DEPARTURE__DESTINATION_STOP);

		passengerEClass = createEClass(PASSENGER);
		createEAttribute(passengerEClass, PASSENGER__FIRST_NAME);
		createEAttribute(passengerEClass, PASSENGER__LAST_NAME);
		createEAttribute(passengerEClass, PASSENGER__PHONE_NUMBER);

		registrationEClass = createEClass(REGISTRATION);
		createEReference(registrationEClass, REGISTRATION__PASSENGER);
		createEReference(registrationEClass, REGISTRATION__FROM);
		createEReference(registrationEClass, REGISTRATION__TO);
		createEReference(registrationEClass, REGISTRATION__DEPARTURE);
		createEAttribute(registrationEClass, REGISTRATION__FROM_TIME);
		createEAttribute(registrationEClass, REGISTRATION__TO_TIME);
		createEAttribute(registrationEClass, REGISTRATION__LINE);
		createEAttribute(registrationEClass, REGISTRATION__INFECTED);

		// Create data types
		phoneNumberEDataType = createEDataType(PHONE_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(atbEClass, Atb.class, "Atb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtb_Busstops(), this.getBusstops(), null, "busstops", null, 0, 1, Atb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtb_Passengers(), this.getPassenger(), null, "passengers", null, 0, 1, Atb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtb_Registrations(), this.getRegistration(), null, "registrations", null, 0, 1, Atb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busstopsEClass, Busstops.class, "Busstops", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusstops_Name(), ecorePackage.getEString(), "name", null, 1, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusstops_StopId(), ecorePackage.getEInt(), "stopId", null, 1, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusstops_NodeId(), ecorePackage.getEInt(), "nodeId", null, 1, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusstops_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusstops_Langitude(), ecorePackage.getEFloat(), "langitude", null, 0, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusstops_IsGoingTowardsCentrum(), ecorePackage.getEBoolean(), "isGoingTowardsCentrum", null, 0, 1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusstops_Departures(), this.getDeparture(), null, "departures", null, 0, -1, Busstops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departureEClass, Departure.class, "Departure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeparture_Line(), ecorePackage.getEInt(), "line", null, 1, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeparture_RegisteredDepartureTime(), ecorePackage.getEDate(), "registeredDepartureTime", null, 0, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeparture_ScheduledDepartureTime(), ecorePackage.getEDate(), "scheduledDepartureTime", null, 0, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeparture_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeparture_DestinationStop(), this.getBusstops(), null, "destinationStop", null, 0, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassenger_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PhoneNumber(), this.getphoneNumber(), "phoneNumber", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registrationEClass, Registration.class, "Registration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistration_Passenger(), this.getPassenger(), null, "passenger", null, 1, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_From(), this.getBusstops(), null, "from", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_To(), this.getBusstops(), null, "to", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_Departure(), this.getDeparture(), null, "departure", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_FromTime(), ecorePackage.getEDate(), "fromTime", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_ToTime(), ecorePackage.getEDate(), "toTime", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_Line(), ecorePackage.getEInt(), "line", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_Infected(), ecorePackage.getEBoolean(), "infected", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(phoneNumberEDataType, Integer.class, "phoneNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (phoneNumberEDataType,
		   source,
		   new String[] {
			   "pattern", "[0-9]{8}"
		   });
	}

} //AtbPackageImpl
