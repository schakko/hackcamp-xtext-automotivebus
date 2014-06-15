/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Component#getName <em>Name</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.Component#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
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
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link de.schakko.xtext.automotiveBusDsl.MessageInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getComponent_Messages()
   * @model containment="true"
   * @generated
   */
  EList<MessageInstance> getMessages();

} // Component
