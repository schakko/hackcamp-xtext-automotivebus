/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslFactory
 * @model kind="package"
 * @generated
 */
public interface AutomotiveBusDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "automotiveBusDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.schakko.de/xtext/AutomotiveBusDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "automotiveBusDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AutomotiveBusDslPackage eINSTANCE = de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.ModelImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Busses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BUSSES = 0;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MESSAGES = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENTS = 2;

  /**
   * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VEHICLES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.VehicleTypeImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getVehicleType()
   * @generated
   */
  int VEHICLE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEHICLE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEHICLE_TYPE__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Vehicle Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEHICLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.BussystemImpl <em>Bussystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.BussystemImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getBussystem()
   * @generated
   */
  int BUSSYSTEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSSYSTEM__NAME = 0;

  /**
   * The number of structural features of the '<em>Bussystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSSYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.ComponentImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MESSAGES = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageTypeImpl <em>Message Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.MessageTypeImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageType()
   * @generated
   */
  int MESSAGE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Message Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl <em>Message Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageInstance()
   * @generated
   */
  int MESSAGE_INSTANCE = 5;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INSTANCE__MESSAGE = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INSTANCE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Bus</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INSTANCE__BUS = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INSTANCE__TARGET = 3;

  /**
   * The number of structural features of the '<em>Message Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INSTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl <em>Message Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl
   * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageFieldType()
   * @generated
   */
  int MESSAGE_FIELD_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD_TYPE__IS_REQUIRED = 1;

  /**
   * The number of structural features of the '<em>Message Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD_TYPE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.Model#getBusses <em>Busses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Busses</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Model#getBusses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Busses();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.Model#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Model#getMessages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Messages();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.Model#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Model#getComponents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Components();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.Model#getVehicles <em>Vehicles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vehicles</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Model#getVehicles()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Vehicles();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.VehicleType <em>Vehicle Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vehicle Type</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.VehicleType
   * @generated
   */
  EClass getVehicleType();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.VehicleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.VehicleType#getName()
   * @see #getVehicleType()
   * @generated
   */
  EAttribute getVehicleType_Name();

  /**
   * Returns the meta object for the reference list '{@link de.schakko.xtext.automotiveBusDsl.VehicleType#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.VehicleType#getComponents()
   * @see #getVehicleType()
   * @generated
   */
  EReference getVehicleType_Components();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.Bussystem <em>Bussystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bussystem</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Bussystem
   * @generated
   */
  EClass getBussystem();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.Bussystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Bussystem#getName()
   * @see #getBussystem()
   * @generated
   */
  EAttribute getBussystem_Name();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.Component#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.Component#getMessages()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Messages();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Type</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageType
   * @generated
   */
  EClass getMessageType();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.MessageType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageType#getName()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.schakko.xtext.automotiveBusDsl.MessageType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageType#getFields()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Fields();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance <em>Message Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Instance</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageInstance
   * @generated
   */
  EClass getMessageInstance();

  /**
   * Returns the meta object for the reference '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageInstance#getMessage()
   * @see #getMessageInstance()
   * @generated
   */
  EReference getMessageInstance_Message();

  /**
   * Returns the meta object for the attribute list '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageInstance#getParams()
   * @see #getMessageInstance()
   * @generated
   */
  EAttribute getMessageInstance_Params();

  /**
   * Returns the meta object for the reference '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getBus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bus</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageInstance#getBus()
   * @see #getMessageInstance()
   * @generated
   */
  EReference getMessageInstance_Bus();

  /**
   * Returns the meta object for the reference '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageInstance#getTarget()
   * @see #getMessageInstance()
   * @generated
   */
  EReference getMessageInstance_Target();

  /**
   * Returns the meta object for class '{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType <em>Message Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Field Type</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageFieldType
   * @generated
   */
  EClass getMessageFieldType();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageFieldType#getName()
   * @see #getMessageFieldType()
   * @generated
   */
  EAttribute getMessageFieldType_Name();

  /**
   * Returns the meta object for the attribute '{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#isIsRequired <em>Is Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Required</em>'.
   * @see de.schakko.xtext.automotiveBusDsl.MessageFieldType#isIsRequired()
   * @see #getMessageFieldType()
   * @generated
   */
  EAttribute getMessageFieldType_IsRequired();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AutomotiveBusDslFactory getAutomotiveBusDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.ModelImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Busses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BUSSES = eINSTANCE.getModel_Busses();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MESSAGES = eINSTANCE.getModel_Messages();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENTS = eINSTANCE.getModel_Components();

    /**
     * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VEHICLES = eINSTANCE.getModel_Vehicles();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.VehicleTypeImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getVehicleType()
     * @generated
     */
    EClass VEHICLE_TYPE = eINSTANCE.getVehicleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VEHICLE_TYPE__NAME = eINSTANCE.getVehicleType_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VEHICLE_TYPE__COMPONENTS = eINSTANCE.getVehicleType_Components();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.BussystemImpl <em>Bussystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.BussystemImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getBussystem()
     * @generated
     */
    EClass BUSSYSTEM = eINSTANCE.getBussystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSSYSTEM__NAME = eINSTANCE.getBussystem_Name();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.ComponentImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__MESSAGES = eINSTANCE.getComponent_Messages();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageTypeImpl <em>Message Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.MessageTypeImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageType()
     * @generated
     */
    EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_TYPE__NAME = eINSTANCE.getMessageType_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_TYPE__FIELDS = eINSTANCE.getMessageType_Fields();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl <em>Message Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.MessageInstanceImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageInstance()
     * @generated
     */
    EClass MESSAGE_INSTANCE = eINSTANCE.getMessageInstance();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_INSTANCE__MESSAGE = eINSTANCE.getMessageInstance_Message();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_INSTANCE__PARAMS = eINSTANCE.getMessageInstance_Params();

    /**
     * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_INSTANCE__BUS = eINSTANCE.getMessageInstance_Bus();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_INSTANCE__TARGET = eINSTANCE.getMessageInstance_Target();

    /**
     * The meta object literal for the '{@link de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl <em>Message Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.schakko.xtext.automotiveBusDsl.impl.MessageFieldTypeImpl
     * @see de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslPackageImpl#getMessageFieldType()
     * @generated
     */
    EClass MESSAGE_FIELD_TYPE = eINSTANCE.getMessageFieldType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_FIELD_TYPE__NAME = eINSTANCE.getMessageFieldType_Name();

    /**
     * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_FIELD_TYPE__IS_REQUIRED = eINSTANCE.getMessageFieldType_IsRequired();

  }

} //AutomotiveBusDslPackage
