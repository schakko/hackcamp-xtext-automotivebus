/**
 */
package de.schakko.xtext.automotiveBusDsl.impl;

import de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage;
import de.schakko.xtext.automotiveBusDsl.Bussystem;
import de.schakko.xtext.automotiveBusDsl.Component;
import de.schakko.xtext.automotiveBusDsl.MessageInstance;
import de.schakko.xtext.automotiveBusDsl.MessageType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInstanceImpl extends MinimalEObjectImpl.Container implements MessageInstance
{
  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected MessageType message;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBus()
   * @generated
   * @ordered
   */
  protected Bussystem bus;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Component target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageInstanceImpl()
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
    return AutomotiveBusDslPackage.Literals.MESSAGE_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType getMessage()
  {
    if (message != null && message.eIsProxy())
    {
      InternalEObject oldMessage = (InternalEObject)message;
      message = (MessageType)eResolveProxy(oldMessage);
      if (message != oldMessage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE, oldMessage, message));
      }
    }
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType basicGetMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(MessageType newMessage)
  {
    MessageType oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, AutomotiveBusDslPackage.MESSAGE_INSTANCE__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bussystem getBus()
  {
    if (bus != null && bus.eIsProxy())
    {
      InternalEObject oldBus = (InternalEObject)bus;
      bus = (Bussystem)eResolveProxy(oldBus);
      if (bus != oldBus)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS, oldBus, bus));
      }
    }
    return bus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bussystem basicGetBus()
  {
    return bus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBus(Bussystem newBus)
  {
    Bussystem oldBus = bus;
    bus = newBus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS, oldBus, bus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Component)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Component newTarget)
  {
    Component oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET, oldTarget, target));
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
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE:
        if (resolve) return getMessage();
        return basicGetMessage();
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__PARAMS:
        return getParams();
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS:
        if (resolve) return getBus();
        return basicGetBus();
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE:
        setMessage((MessageType)newValue);
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS:
        setBus((Bussystem)newValue);
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET:
        setTarget((Component)newValue);
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
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE:
        setMessage((MessageType)null);
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__PARAMS:
        getParams().clear();
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS:
        setBus((Bussystem)null);
        return;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET:
        setTarget((Component)null);
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
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__MESSAGE:
        return message != null;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__PARAMS:
        return params != null && !params.isEmpty();
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__BUS:
        return bus != null;
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE__TARGET:
        return target != null;
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
    result.append(" (params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //MessageInstanceImpl
