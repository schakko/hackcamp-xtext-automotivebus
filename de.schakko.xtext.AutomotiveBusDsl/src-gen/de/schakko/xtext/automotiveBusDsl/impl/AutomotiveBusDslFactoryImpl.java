/**
 */
package de.schakko.xtext.automotiveBusDsl.impl;

import de.schakko.xtext.automotiveBusDsl.*;

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
public class AutomotiveBusDslFactoryImpl extends EFactoryImpl implements AutomotiveBusDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AutomotiveBusDslFactory init()
  {
    try
    {
      AutomotiveBusDslFactory theAutomotiveBusDslFactory = (AutomotiveBusDslFactory)EPackage.Registry.INSTANCE.getEFactory(AutomotiveBusDslPackage.eNS_URI);
      if (theAutomotiveBusDslFactory != null)
      {
        return theAutomotiveBusDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AutomotiveBusDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomotiveBusDslFactoryImpl()
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
      case AutomotiveBusDslPackage.MODEL: return createModel();
      case AutomotiveBusDslPackage.VEHICLE_TYPE: return createVehicleType();
      case AutomotiveBusDslPackage.BUSSYSTEM: return createBussystem();
      case AutomotiveBusDslPackage.COMPONENT: return createComponent();
      case AutomotiveBusDslPackage.MESSAGE_TYPE: return createMessageType();
      case AutomotiveBusDslPackage.MESSAGE_INSTANCE: return createMessageInstance();
      case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE: return createMessageFieldType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VehicleType createVehicleType()
  {
    VehicleTypeImpl vehicleType = new VehicleTypeImpl();
    return vehicleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bussystem createBussystem()
  {
    BussystemImpl bussystem = new BussystemImpl();
    return bussystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType createMessageType()
  {
    MessageTypeImpl messageType = new MessageTypeImpl();
    return messageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageInstance createMessageInstance()
  {
    MessageInstanceImpl messageInstance = new MessageInstanceImpl();
    return messageInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageFieldType createMessageFieldType()
  {
    MessageFieldTypeImpl messageFieldType = new MessageFieldTypeImpl();
    return messageFieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutomotiveBusDslPackage getAutomotiveBusDslPackage()
  {
    return (AutomotiveBusDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AutomotiveBusDslPackage getPackage()
  {
    return AutomotiveBusDslPackage.eINSTANCE;
  }

} //AutomotiveBusDslFactoryImpl
