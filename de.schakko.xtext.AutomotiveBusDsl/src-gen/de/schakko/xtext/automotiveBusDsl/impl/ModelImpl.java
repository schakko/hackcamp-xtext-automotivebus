/**
 */
package de.schakko.xtext.automotiveBusDsl.impl;

import de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage;
import de.schakko.xtext.automotiveBusDsl.Bussystem;
import de.schakko.xtext.automotiveBusDsl.Component;
import de.schakko.xtext.automotiveBusDsl.MessageType;
import de.schakko.xtext.automotiveBusDsl.Model;
import de.schakko.xtext.automotiveBusDsl.VehicleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl#getBusses <em>Busses</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getBusses() <em>Busses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusses()
   * @generated
   * @ordered
   */
  protected EList<Bussystem> busses;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<MessageType> messages;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVehicles()
   * @generated
   * @ordered
   */
  protected EList<VehicleType> vehicles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AutomotiveBusDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Bussystem> getBusses()
  {
    if (busses == null)
    {
      busses = new EObjectContainmentEList<Bussystem>(Bussystem.class, this, AutomotiveBusDslPackage.MODEL__BUSSES);
    }
    return busses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageType> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<MessageType>(MessageType.class, this, AutomotiveBusDslPackage.MODEL__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, AutomotiveBusDslPackage.MODEL__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VehicleType> getVehicles()
  {
    if (vehicles == null)
    {
      vehicles = new EObjectContainmentEList<VehicleType>(VehicleType.class, this, AutomotiveBusDslPackage.MODEL__VEHICLES);
    }
    return vehicles;
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
      case AutomotiveBusDslPackage.MODEL__BUSSES:
        return ((InternalEList<?>)getBusses()).basicRemove(otherEnd, msgs);
      case AutomotiveBusDslPackage.MODEL__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case AutomotiveBusDslPackage.MODEL__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case AutomotiveBusDslPackage.MODEL__VEHICLES:
        return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
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
      case AutomotiveBusDslPackage.MODEL__BUSSES:
        return getBusses();
      case AutomotiveBusDslPackage.MODEL__MESSAGES:
        return getMessages();
      case AutomotiveBusDslPackage.MODEL__COMPONENTS:
        return getComponents();
      case AutomotiveBusDslPackage.MODEL__VEHICLES:
        return getVehicles();
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
      case AutomotiveBusDslPackage.MODEL__BUSSES:
        getBusses().clear();
        getBusses().addAll((Collection<? extends Bussystem>)newValue);
        return;
      case AutomotiveBusDslPackage.MODEL__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends MessageType>)newValue);
        return;
      case AutomotiveBusDslPackage.MODEL__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case AutomotiveBusDslPackage.MODEL__VEHICLES:
        getVehicles().clear();
        getVehicles().addAll((Collection<? extends VehicleType>)newValue);
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
      case AutomotiveBusDslPackage.MODEL__BUSSES:
        getBusses().clear();
        return;
      case AutomotiveBusDslPackage.MODEL__MESSAGES:
        getMessages().clear();
        return;
      case AutomotiveBusDslPackage.MODEL__COMPONENTS:
        getComponents().clear();
        return;
      case AutomotiveBusDslPackage.MODEL__VEHICLES:
        getVehicles().clear();
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
      case AutomotiveBusDslPackage.MODEL__BUSSES:
        return busses != null && !busses.isEmpty();
      case AutomotiveBusDslPackage.MODEL__MESSAGES:
        return messages != null && !messages.isEmpty();
      case AutomotiveBusDslPackage.MODEL__COMPONENTS:
        return components != null && !components.isEmpty();
      case AutomotiveBusDslPackage.MODEL__VEHICLES:
        return vehicles != null && !vehicles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
