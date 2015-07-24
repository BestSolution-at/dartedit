/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getReturnVals <em>Return Vals</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject
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
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getRequest_Documentation()
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
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getRequest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.Request#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getRequest_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Return Vals</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.dart.service.spec.dartServiceSpec.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Vals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Vals</em>' containment reference list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getRequest_ReturnVals()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getReturnVals();

} // Request
