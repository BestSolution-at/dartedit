/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getArguments <em>Arguments</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#isList <em>List</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getGenericTypeArgument()
 * @model
 * @generated
 */
public interface GenericTypeArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DomainElement)
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getGenericTypeArgument_Type()
   * @model
   * @generated
   */
  DomainElement getType();

  /**
   * Sets the value of the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DomainElement value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getGenericTypeArgument_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<GenericTypeArgument> getArguments();

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage#getGenericTypeArgument_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

} // GenericTypeArgument
