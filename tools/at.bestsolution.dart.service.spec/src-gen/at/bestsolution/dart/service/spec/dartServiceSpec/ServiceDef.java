/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getRequests <em>Requests</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getServiceDef()
 * @model
 * @generated
 */
public interface ServiceDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getServiceDef_Documentation()
   * @model unique="false"
   * @generated
   */
  EList<String> getDocumentation();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getServiceDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.dart.service.spec.dartServiceSpec.Request}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requests</em>' containment reference list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getServiceDef_Requests()
   * @model containment="true"
   * @generated
   */
  EList<Request> getRequests();

  /**
   * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.dart.service.spec.dartServiceSpec.Notification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notifications</em>' containment reference list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getServiceDef_Notifications()
   * @model containment="true"
   * @generated
   */
  EList<Notification> getNotifications();

} // ServiceDef
