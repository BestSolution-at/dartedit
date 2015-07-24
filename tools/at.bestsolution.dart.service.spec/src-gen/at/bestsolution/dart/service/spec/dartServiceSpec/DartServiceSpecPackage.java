/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecFactory
 * @model kind="package"
 * @generated
 */
public interface DartServiceSpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dartServiceSpec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/dart/service/spec/DartServiceSpec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dartServiceSpec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DartServiceSpecPackage eINSTANCE = at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefsImpl <em>Service Defs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefsImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getServiceDefs()
   * @generated
   */
  int SERVICE_DEFS = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Domain Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__DOMAIN_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Service Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS__SERVICE_DEFS = 2;

  /**
   * The number of structural features of the '<em>Service Defs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEFS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.DomainElementImpl <em>Domain Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DomainElementImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getDomainElement()
   * @generated
   */
  int DOMAIN_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Cust</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__CUST = 2;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__SUPER_TYPE = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__ENUM_VALUES = 5;

  /**
   * The feature id for the '<em><b>Real Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT__REAL_TYPE = 6;

  /**
   * The number of structural features of the '<em>Domain Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.EnumValImpl <em>Enum Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.EnumValImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getEnumVal()
   * @generated
   */
  int ENUM_VAL = 2;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL__NAME = 1;

  /**
   * The number of structural features of the '<em>Enum Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.AttributeImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.GenericTypeArgumentImpl <em>Generic Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.GenericTypeArgumentImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getGenericTypeArgument()
   * @generated
   */
  int GENERIC_TYPE_ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__ARGUMENTS = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT__LIST = 2;

  /**
   * The number of structural features of the '<em>Generic Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_ARGUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl <em>Service Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getServiceDef()
   * @generated
   */
  int SERVICE_DEF = 5;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEF__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEF__REQUESTS = 2;

  /**
   * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEF__NOTIFICATIONS = 3;

  /**
   * The number of structural features of the '<em>Service Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DEF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getRequest()
   * @generated
   */
  int REQUEST = 6;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__NAME = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Return Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__RETURN_VALS = 3;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.NotificationImpl <em>Notification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.NotificationImpl
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getNotification()
   * @generated
   */
  int NOTIFICATION = 7;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Notification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs <em>Service Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Defs</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs
   * @generated
   */
  EClass getServiceDefs();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getPackageName()
   * @see #getServiceDefs()
   * @generated
   */
  EAttribute getServiceDefs_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getDomainElements <em>Domain Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Elements</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getDomainElements()
   * @see #getServiceDefs()
   * @generated
   */
  EReference getServiceDefs_DomainElements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getServiceDefs <em>Service Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Defs</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs#getServiceDefs()
   * @see #getServiceDefs()
   * @generated
   */
  EReference getServiceDefs_ServiceDefs();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Element</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement
   * @generated
   */
  EClass getDomainElement();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getDoc()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Doc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getName()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#isCust <em>Cust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cust</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#isCust()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_Cust();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getSuperType()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getAttributes()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getEnumValues <em>Enum Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Values</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getEnumValues()
   * @see #getDomainElement()
   * @generated
   */
  EReference getDomainElement_EnumValues();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getRealType <em>Real Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real Type</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement#getRealType()
   * @see #getDomainElement()
   * @generated
   */
  EAttribute getDomainElement_RealType();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal <em>Enum Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Val</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal
   * @generated
   */
  EClass getEnumVal();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal#getDoc()
   * @see #getEnumVal()
   * @generated
   */
  EAttribute getEnumVal_Doc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal#getName()
   * @see #getEnumVal()
   * @generated
   */
  EAttribute getEnumVal_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getDocumentation()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#isOptional()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Optional();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument <em>Generic Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Type Argument</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument
   * @generated
   */
  EClass getGenericTypeArgument();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getType()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EReference getGenericTypeArgument_Type();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getArguments()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EReference getGenericTypeArgument_Arguments();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#isList()
   * @see #getGenericTypeArgument()
   * @generated
   */
  EAttribute getGenericTypeArgument_List();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef <em>Service Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Def</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef
   * @generated
   */
  EClass getServiceDef();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getDocumentation()
   * @see #getServiceDef()
   * @generated
   */
  EAttribute getServiceDef_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getName()
   * @see #getServiceDef()
   * @generated
   */
  EAttribute getServiceDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getRequests <em>Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requests</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getRequests()
   * @see #getServiceDef()
   * @generated
   */
  EReference getServiceDef_Requests();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getNotifications <em>Notifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notifications</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getNotifications()
   * @see #getServiceDef()
   * @generated
   */
  EReference getServiceDef_Notifications();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Request
   * @generated
   */
  EClass getRequest();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Request#getDocumentation()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Request#getName()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Request#getAttributes()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getReturnVals <em>Return Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Return Vals</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Request#getReturnVals()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_ReturnVals();

  /**
   * Returns the meta object for class '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Notification <em>Notification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Notification
   * @generated
   */
  EClass getNotification();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Documentation</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getDocumentation()
   * @see #getNotification()
   * @generated
   */
  EAttribute getNotification_Documentation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getName()
   * @see #getNotification()
   * @generated
   */
  EAttribute getNotification_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.Notification#getAttributes()
   * @see #getNotification()
   * @generated
   */
  EReference getNotification_Attributes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DartServiceSpecFactory getDartServiceSpecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefsImpl <em>Service Defs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefsImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getServiceDefs()
     * @generated
     */
    EClass SERVICE_DEFS = eINSTANCE.getServiceDefs();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_DEFS__PACKAGE_NAME = eINSTANCE.getServiceDefs_PackageName();

    /**
     * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEFS__DOMAIN_ELEMENTS = eINSTANCE.getServiceDefs_DomainElements();

    /**
     * The meta object literal for the '<em><b>Service Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEFS__SERVICE_DEFS = eINSTANCE.getServiceDefs_ServiceDefs();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.DomainElementImpl <em>Domain Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DomainElementImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getDomainElement()
     * @generated
     */
    EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__DOC = eINSTANCE.getDomainElement_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__NAME = eINSTANCE.getDomainElement_Name();

    /**
     * The meta object literal for the '<em><b>Cust</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__CUST = eINSTANCE.getDomainElement_Cust();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__SUPER_TYPE = eINSTANCE.getDomainElement_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__ATTRIBUTES = eINSTANCE.getDomainElement_Attributes();

    /**
     * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ELEMENT__ENUM_VALUES = eINSTANCE.getDomainElement_EnumValues();

    /**
     * The meta object literal for the '<em><b>Real Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ELEMENT__REAL_TYPE = eINSTANCE.getDomainElement_RealType();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.EnumValImpl <em>Enum Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.EnumValImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getEnumVal()
     * @generated
     */
    EClass ENUM_VAL = eINSTANCE.getEnumVal();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VAL__DOC = eINSTANCE.getEnumVal_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VAL__NAME = eINSTANCE.getEnumVal_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.AttributeImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DOCUMENTATION = eINSTANCE.getAttribute_Documentation();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPTIONAL = eINSTANCE.getAttribute_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.GenericTypeArgumentImpl <em>Generic Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.GenericTypeArgumentImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getGenericTypeArgument()
     * @generated
     */
    EClass GENERIC_TYPE_ARGUMENT = eINSTANCE.getGenericTypeArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE_ARGUMENT__TYPE = eINSTANCE.getGenericTypeArgument_Type();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE_ARGUMENT__ARGUMENTS = eINSTANCE.getGenericTypeArgument_Arguments();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_TYPE_ARGUMENT__LIST = eINSTANCE.getGenericTypeArgument_List();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl <em>Service Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getServiceDef()
     * @generated
     */
    EClass SERVICE_DEF = eINSTANCE.getServiceDef();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_DEF__DOCUMENTATION = eINSTANCE.getServiceDef_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_DEF__NAME = eINSTANCE.getServiceDef_Name();

    /**
     * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEF__REQUESTS = eINSTANCE.getServiceDef_Requests();

    /**
     * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DEF__NOTIFICATIONS = eINSTANCE.getServiceDef_Notifications();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getRequest()
     * @generated
     */
    EClass REQUEST = eINSTANCE.getRequest();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__DOCUMENTATION = eINSTANCE.getRequest_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__NAME = eINSTANCE.getRequest_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__ATTRIBUTES = eINSTANCE.getRequest_Attributes();

    /**
     * The meta object literal for the '<em><b>Return Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__RETURN_VALS = eINSTANCE.getRequest_ReturnVals();

    /**
     * The meta object literal for the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.NotificationImpl <em>Notification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.NotificationImpl
     * @see at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecPackageImpl#getNotification()
     * @generated
     */
    EClass NOTIFICATION = eINSTANCE.getNotification();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFICATION__DOCUMENTATION = eINSTANCE.getNotification_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTIFICATION__ATTRIBUTES = eINSTANCE.getNotification_Attributes();

  }

} //DartServiceSpecPackage
