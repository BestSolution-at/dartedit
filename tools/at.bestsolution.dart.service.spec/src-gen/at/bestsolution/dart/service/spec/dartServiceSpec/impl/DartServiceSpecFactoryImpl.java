/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec.impl;

import at.bestsolution.dart.service.spec.dartServiceSpec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DartServiceSpecFactoryImpl extends EFactoryImpl implements DartServiceSpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DartServiceSpecFactory init()
  {
    try
    {
      DartServiceSpecFactory theDartServiceSpecFactory = (DartServiceSpecFactory)EPackage.Registry.INSTANCE.getEFactory(DartServiceSpecPackage.eNS_URI);
      if (theDartServiceSpecFactory != null)
      {
        return theDartServiceSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DartServiceSpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DartServiceSpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DartServiceSpecPackage.SERVICE_DEFS: return createServiceDefs();
      case DartServiceSpecPackage.DOMAIN_ELEMENT: return createDomainElement();
      case DartServiceSpecPackage.ENUM_VAL: return createEnumVal();
      case DartServiceSpecPackage.ATTRIBUTE: return createAttribute();
      case DartServiceSpecPackage.GENERIC_TYPE_ARGUMENT: return createGenericTypeArgument();
      case DartServiceSpecPackage.SERVICE_DEF: return createServiceDef();
      case DartServiceSpecPackage.REQUEST: return createRequest();
      case DartServiceSpecPackage.NOTIFICATION: return createNotification();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDefs createServiceDefs()
  {
    ServiceDefsImpl serviceDefs = new ServiceDefsImpl();
    return serviceDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement createDomainElement()
  {
    DomainElementImpl domainElement = new DomainElementImpl();
    return domainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumVal createEnumVal()
  {
    EnumValImpl enumVal = new EnumValImpl();
    return enumVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericTypeArgument createGenericTypeArgument()
  {
    GenericTypeArgumentImpl genericTypeArgument = new GenericTypeArgumentImpl();
    return genericTypeArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDef createServiceDef()
  {
    ServiceDefImpl serviceDef = new ServiceDefImpl();
    return serviceDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Request createRequest()
  {
    RequestImpl request = new RequestImpl();
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notification createNotification()
  {
    NotificationImpl notification = new NotificationImpl();
    return notification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DartServiceSpecPackage getDartServiceSpecPackage()
  {
    return (DartServiceSpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DartServiceSpecPackage getPackage()
  {
    return DartServiceSpecPackage.eINSTANCE;
  }

} //DartServiceSpecFactoryImpl
