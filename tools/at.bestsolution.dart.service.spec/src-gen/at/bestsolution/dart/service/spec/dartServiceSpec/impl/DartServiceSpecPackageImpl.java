/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec.impl;

import at.bestsolution.dart.service.spec.dartServiceSpec.Attribute;
import at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecFactory;
import at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage;
import at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement;
import at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal;
import at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument;
import at.bestsolution.dart.service.spec.dartServiceSpec.Notification;
import at.bestsolution.dart.service.spec.dartServiceSpec.Request;
import at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef;
import at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DartServiceSpecPackageImpl extends EPackageImpl implements DartServiceSpecPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceDefsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumValEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericTypeArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notificationEClass = null;

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
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DartServiceSpecPackageImpl()
  {
    super(eNS_URI, DartServiceSpecFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DartServiceSpecPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DartServiceSpecPackage init()
  {
    if (isInited) return (DartServiceSpecPackage)EPackage.Registry.INSTANCE.getEPackage(DartServiceSpecPackage.eNS_URI);

    // Obtain or create and register package
    DartServiceSpecPackageImpl theDartServiceSpecPackage = (DartServiceSpecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DartServiceSpecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DartServiceSpecPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDartServiceSpecPackage.createPackageContents();

    // Initialize created meta-data
    theDartServiceSpecPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDartServiceSpecPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DartServiceSpecPackage.eNS_URI, theDartServiceSpecPackage);
    return theDartServiceSpecPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceDefs()
  {
    return serviceDefsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceDefs_PackageName()
  {
    return (EAttribute)serviceDefsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDefs_DomainElements()
  {
    return (EReference)serviceDefsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDefs_ServiceDefs()
  {
    return (EReference)serviceDefsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainElement()
  {
    return domainElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainElement_Doc()
  {
    return (EAttribute)domainElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainElement_Name()
  {
    return (EAttribute)domainElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainElement_Cust()
  {
    return (EAttribute)domainElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainElement_SuperType()
  {
    return (EReference)domainElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainElement_Attributes()
  {
    return (EReference)domainElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainElement_EnumValues()
  {
    return (EReference)domainElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainElement_RealType()
  {
    return (EAttribute)domainElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumVal()
  {
    return enumValEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumVal_Doc()
  {
    return (EAttribute)enumValEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumVal_Name()
  {
    return (EAttribute)enumValEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Documentation()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Optional()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Value()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericTypeArgument()
  {
    return genericTypeArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericTypeArgument_Type()
  {
    return (EReference)genericTypeArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericTypeArgument_Arguments()
  {
    return (EReference)genericTypeArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericTypeArgument_List()
  {
    return (EAttribute)genericTypeArgumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceDef()
  {
    return serviceDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceDef_Documentation()
  {
    return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceDef_Name()
  {
    return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDef_Requests()
  {
    return (EReference)serviceDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDef_Notifications()
  {
    return (EReference)serviceDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequest()
  {
    return requestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Documentation()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Name()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_Attributes()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_ReturnVals()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotification()
  {
    return notificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotification_Documentation()
  {
    return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotification_Name()
  {
    return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotification_Attributes()
  {
    return (EReference)notificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DartServiceSpecFactory getDartServiceSpecFactory()
  {
    return (DartServiceSpecFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    serviceDefsEClass = createEClass(SERVICE_DEFS);
    createEAttribute(serviceDefsEClass, SERVICE_DEFS__PACKAGE_NAME);
    createEReference(serviceDefsEClass, SERVICE_DEFS__DOMAIN_ELEMENTS);
    createEReference(serviceDefsEClass, SERVICE_DEFS__SERVICE_DEFS);

    domainElementEClass = createEClass(DOMAIN_ELEMENT);
    createEAttribute(domainElementEClass, DOMAIN_ELEMENT__DOC);
    createEAttribute(domainElementEClass, DOMAIN_ELEMENT__NAME);
    createEAttribute(domainElementEClass, DOMAIN_ELEMENT__CUST);
    createEReference(domainElementEClass, DOMAIN_ELEMENT__SUPER_TYPE);
    createEReference(domainElementEClass, DOMAIN_ELEMENT__ATTRIBUTES);
    createEReference(domainElementEClass, DOMAIN_ELEMENT__ENUM_VALUES);
    createEAttribute(domainElementEClass, DOMAIN_ELEMENT__REAL_TYPE);

    enumValEClass = createEClass(ENUM_VAL);
    createEAttribute(enumValEClass, ENUM_VAL__DOC);
    createEAttribute(enumValEClass, ENUM_VAL__NAME);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__DOCUMENTATION);
    createEAttribute(attributeEClass, ATTRIBUTE__OPTIONAL);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

    genericTypeArgumentEClass = createEClass(GENERIC_TYPE_ARGUMENT);
    createEReference(genericTypeArgumentEClass, GENERIC_TYPE_ARGUMENT__TYPE);
    createEReference(genericTypeArgumentEClass, GENERIC_TYPE_ARGUMENT__ARGUMENTS);
    createEAttribute(genericTypeArgumentEClass, GENERIC_TYPE_ARGUMENT__LIST);

    serviceDefEClass = createEClass(SERVICE_DEF);
    createEAttribute(serviceDefEClass, SERVICE_DEF__DOCUMENTATION);
    createEAttribute(serviceDefEClass, SERVICE_DEF__NAME);
    createEReference(serviceDefEClass, SERVICE_DEF__REQUESTS);
    createEReference(serviceDefEClass, SERVICE_DEF__NOTIFICATIONS);

    requestEClass = createEClass(REQUEST);
    createEAttribute(requestEClass, REQUEST__DOCUMENTATION);
    createEAttribute(requestEClass, REQUEST__NAME);
    createEReference(requestEClass, REQUEST__ATTRIBUTES);
    createEReference(requestEClass, REQUEST__RETURN_VALS);

    notificationEClass = createEClass(NOTIFICATION);
    createEAttribute(notificationEClass, NOTIFICATION__DOCUMENTATION);
    createEAttribute(notificationEClass, NOTIFICATION__NAME);
    createEReference(notificationEClass, NOTIFICATION__ATTRIBUTES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(serviceDefsEClass, ServiceDefs.class, "ServiceDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceDefs_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, ServiceDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDefs_DomainElements(), this.getDomainElement(), null, "domainElements", null, 0, -1, ServiceDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDefs_ServiceDefs(), this.getServiceDef(), null, "serviceDefs", null, 0, -1, ServiceDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainElement_Doc(), ecorePackage.getEString(), "doc", null, 0, -1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainElement_Cust(), ecorePackage.getEBoolean(), "cust", null, 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainElement_SuperType(), this.getDomainElement(), null, "superType", null, 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainElement_EnumValues(), this.getEnumVal(), null, "enumValues", null, 0, -1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainElement_RealType(), ecorePackage.getEString(), "realType", null, 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumValEClass, EnumVal.class, "EnumVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumVal_Doc(), ecorePackage.getEString(), "doc", null, 0, -1, EnumVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumVal_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Documentation(), ecorePackage.getEString(), "documentation", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Type(), this.getGenericTypeArgument(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericTypeArgumentEClass, GenericTypeArgument.class, "GenericTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericTypeArgument_Type(), this.getDomainElement(), null, "type", null, 0, 1, GenericTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericTypeArgument_Arguments(), this.getGenericTypeArgument(), null, "arguments", null, 0, -1, GenericTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenericTypeArgument_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, GenericTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceDefEClass, ServiceDef.class, "ServiceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceDef_Documentation(), ecorePackage.getEString(), "documentation", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDef_Requests(), this.getRequest(), null, "requests", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDef_Notifications(), this.getNotification(), null, "notifications", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequest_Documentation(), ecorePackage.getEString(), "documentation", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequest_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequest_ReturnVals(), this.getAttribute(), null, "returnVals", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotification_Documentation(), ecorePackage.getEString(), "documentation", null, 0, -1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNotification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNotification_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DartServiceSpecPackageImpl
