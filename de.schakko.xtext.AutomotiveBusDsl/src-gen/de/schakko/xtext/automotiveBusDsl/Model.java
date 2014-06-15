/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Model#getBusses <em>Busses</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Model#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Model#getComponents <em>Components</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Model#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Busses</b></em>' containment reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.Bussystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Busses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Busses</em>' containment reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getModel_Busses()
   * @model containment="true"
   * @generated
   */
  EList<Bussystem> getBusses();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.MessageType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getModel_Messages()
   * @model containment="true"
   * @generated
   */
  EList<MessageType> getMessages();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.VehicleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vehicles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vehicles</em>' containment reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getModel_Vehicles()
   * @model containment="true"
   * @generated
   */
  EList<VehicleType> getVehicles();

} // Model
