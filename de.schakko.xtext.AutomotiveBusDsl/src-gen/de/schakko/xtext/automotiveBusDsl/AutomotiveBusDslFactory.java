/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage
 * @generated
 */
public interface AutomotiveBusDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AutomotiveBusDslFactory eINSTANCE = de.schakko.xtext.automotiveBusDsl.impl.AutomotiveBusDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Vehicle Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vehicle Type</em>'.
   * @generated
   */
  VehicleType createVehicleType();

  /**
   * Returns a new object of class '<em>Bussystem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bussystem</em>'.
   * @generated
   */
  Bussystem createBussystem();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Message Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Type</em>'.
   * @generated
   */
  MessageType createMessageType();

  /**
   * Returns a new object of class '<em>Message Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Instance</em>'.
   * @generated
   */
  MessageInstance createMessageInstance();

  /**
   * Returns a new object of class '<em>Message Field Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Field Type</em>'.
   * @generated
   */
  MessageFieldType createMessageFieldType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AutomotiveBusDslPackage getAutomotiveBusDslPackage();

} //AutomotiveBusDslFactory
