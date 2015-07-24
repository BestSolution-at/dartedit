/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage
 * @generated
 */
public interface DartServiceSpecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DartServiceSpecFactory eINSTANCE = at.bestsolution.dart.service.spec.dartServiceSpec.impl.DartServiceSpecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Service Defs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Defs</em>'.
   * @generated
   */
  ServiceDefs createServiceDefs();

  /**
   * Returns a new object of class '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Element</em>'.
   * @generated
   */
  DomainElement createDomainElement();

  /**
   * Returns a new object of class '<em>Enum Val</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Val</em>'.
   * @generated
   */
  EnumVal createEnumVal();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Generic Type Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Type Argument</em>'.
   * @generated
   */
  GenericTypeArgument createGenericTypeArgument();

  /**
   * Returns a new object of class '<em>Service Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Def</em>'.
   * @generated
   */
  ServiceDef createServiceDef();

  /**
   * Returns a new object of class '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request</em>'.
   * @generated
   */
  Request createRequest();

  /**
   * Returns a new object of class '<em>Notification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Notification</em>'.
   * @generated
   */
  Notification createNotification();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DartServiceSpecPackage getDartServiceSpecPackage();

} //DartServiceSpecFactory
