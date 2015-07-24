/**
 */
package at.bestsolution.dart.service.spec.dartServiceSpec.impl;

import at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage;
import at.bestsolution.dart.service.spec.dartServiceSpec.Notification;
import at.bestsolution.dart.service.spec.dartServiceSpec.Request;
import at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link at.bestsolution.dart.service.spec.dartServiceSpec.impl.ServiceDefImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefImpl extends MinimalEObjectImpl.Container implements ServiceDef
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
   * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequests()
   * @generated
   * @ordered
   */
  protected EList<Request> requests;

  /**
   * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotifications()
   * @generated
   * @ordered
   */
  protected EList<Notification> notifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceDefImpl()
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
    return DartServiceSpecPackage.Literals.SERVICE_DEF;
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
      documentation = new EDataTypeEList<String>(String.class, this, DartServiceSpecPackage.SERVICE_DEF__DOCUMENTATION);
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
      eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, DartServiceSpecPackage.SERVICE_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Request> getRequests()
  {
    if (requests == null)
    {
      requests = new EObjectContainmentEList<Request>(Request.class, this, DartServiceSpecPackage.SERVICE_DEF__REQUESTS);
    }
    return requests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Notification> getNotifications()
  {
    if (notifications == null)
    {
      notifications = new EObjectContainmentEList<Notification>(Notification.class, this, DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS);
    }
    return notifications;
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
      case DartServiceSpecPackage.SERVICE_DEF__REQUESTS:
        return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
      case DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS:
        return ((InternalEList<?>)getNotifications()).basicRemove(otherEnd, msgs);
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
      case DartServiceSpecPackage.SERVICE_DEF__DOCUMENTATION:
        return getDocumentation();
      case DartServiceSpecPackage.SERVICE_DEF__NAME:
        return getName();
      case DartServiceSpecPackage.SERVICE_DEF__REQUESTS:
        return getRequests();
      case DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS:
        return getNotifications();
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
      case DartServiceSpecPackage.SERVICE_DEF__DOCUMENTATION:
        getDocumentation().clear();
        getDocumentation().addAll((Collection<? extends String>)newValue);
        return;
      case DartServiceSpecPackage.SERVICE_DEF__NAME:
        setName((String)newValue);
        return;
      case DartServiceSpecPackage.SERVICE_DEF__REQUESTS:
        getRequests().clear();
        getRequests().addAll((Collection<? extends Request>)newValue);
        return;
      case DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS:
        getNotifications().clear();
        getNotifications().addAll((Collection<? extends Notification>)newValue);
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
      case DartServiceSpecPackage.SERVICE_DEF__DOCUMENTATION:
        getDocumentation().clear();
        return;
      case DartServiceSpecPackage.SERVICE_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DartServiceSpecPackage.SERVICE_DEF__REQUESTS:
        getRequests().clear();
        return;
      case DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS:
        getNotifications().clear();
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
      case DartServiceSpecPackage.SERVICE_DEF__DOCUMENTATION:
        return documentation != null && !documentation.isEmpty();
      case DartServiceSpecPackage.SERVICE_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DartServiceSpecPackage.SERVICE_DEF__REQUESTS:
        return requests != null && !requests.isEmpty();
      case DartServiceSpecPackage.SERVICE_DEF__NOTIFICATIONS:
        return notifications != null && !notifications.isEmpty();
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

} //ServiceDefImpl
