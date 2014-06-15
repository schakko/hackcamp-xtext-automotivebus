/**
 */
package de.schakko.xtext.automotiveBusDsl.impl;

import de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage;
import de.schakko.xtext.automotiveBusDsl.MessageFieldType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFieldTypeImpl extends MinimalEObjectImpl.Container implements MessageFieldType
{
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
   * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected boolean isRequired = IS_REQUIRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageFieldTypeImpl()
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
    return AutomotiveBusDslPackage.Literals.MESSAGE_FIELD_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRequired()
  {
    return isRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRequired(boolean newIsRequired)
  {
    boolean oldIsRequired = isRequired;
    isRequired = newIsRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__IS_REQUIRED, oldIsRequired, isRequired));
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
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__NAME:
        return getName();
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__IS_REQUIRED:
        return isIsRequired();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__NAME:
        setName((String)newValue);
        return;
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__IS_REQUIRED:
        setIsRequired((Boolean)newValue);
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
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__IS_REQUIRED:
        setIsRequired(IS_REQUIRED_EDEFAULT);
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
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE__IS_REQUIRED:
        return isRequired != IS_REQUIRED_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", isRequired: ");
    result.append(isRequired);
    result.append(')');
    return result.toString();
  }

} //MessageFieldTypeImpl
