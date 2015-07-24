/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec.impl;

import at.bestsolution.dart.service.spec.dartServiceSpec.Attribute;
import at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage;
import at.bestsolution.dart.service.spec.dartServiceSpec.Request;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.RequestImpl#getReturnVals <em>Return Vals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request
{
  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected EList<String> documentation;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getReturnVals() <em>Return Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVals()
   * @generated
   * @ordered
   */
  protected EList<Attribute> returnVals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DartServiceSpecPackage.Literals.REQUEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDocumentation()
  {
    if (documentation == null)
    {
      documentation = new EDataTypeEList<String>(String.class, this, DartServiceSpecPackage.REQUEST__DOCUMENTATION);
    }
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DartServiceSpecPackage.REQUEST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DartServiceSpecPackage.REQUEST__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getReturnVals()
  {
    if (returnVals == null)
    {
      returnVals = new EObjectContainmentEList<Attribute>(Attribute.class, this, DartServiceSpecPackage.REQUEST__RETURN_VALS);
    }
    return returnVals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DartServiceSpecPackage.REQUEST__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case DartServiceSpecPackage.REQUEST__RETURN_VALS:
        return ((InternalEList<?>)getReturnVals()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DartServiceSpecPackage.REQUEST__DOCUMENTATION:
        return getDocumentation();
      case DartServiceSpecPackage.REQUEST__NAME:
        return getName();
      case DartServiceSpecPackage.REQUEST__ATTRIBUTES:
        return getAttributes();
      case DartServiceSpecPackage.REQUEST__RETURN_VALS:
        return getReturnVals();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DartServiceSpecPackage.REQUEST__DOCUMENTATION:
        getDocumentation().clear();
        getDocumentation().addAll((Collection<? extends String>)newValue);
        return;
      case DartServiceSpecPackage.REQUEST__NAME:
        setName((String)newValue);
        return;
      case DartServiceSpecPackage.REQUEST__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case DartServiceSpecPackage.REQUEST__RETURN_VALS:
        getReturnVals().clear();
        getReturnVals().addAll((Collection<? extends Attribute>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DartServiceSpecPackage.REQUEST__DOCUMENTATION:
        getDocumentation().clear();
        return;
      case DartServiceSpecPackage.REQUEST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DartServiceSpecPackage.REQUEST__ATTRIBUTES:
        getAttributes().clear();
        return;
      case DartServiceSpecPackage.REQUEST__RETURN_VALS:
        getReturnVals().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DartServiceSpecPackage.REQUEST__DOCUMENTATION:
        return documentation != null && !documentation.isEmpty();
      case DartServiceSpecPackage.REQUEST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DartServiceSpecPackage.REQUEST__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case DartServiceSpecPackage.REQUEST__RETURN_VALS:
        return returnVals != null && !returnVals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RequestImpl
