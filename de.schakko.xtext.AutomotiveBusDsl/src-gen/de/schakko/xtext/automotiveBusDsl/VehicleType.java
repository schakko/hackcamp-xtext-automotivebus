/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.VehicleType#getName <em>Name</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.VehicleType#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getVehicleType()
 * @model
 * @generated
 */
public interface VehicleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getVehicleType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.VehicleType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getVehicleType_Components()
   * @model
   * @generated
   */
  EList<Component> getComponents();

} // VehicleType
