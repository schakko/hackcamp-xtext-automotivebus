/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getMessage <em>Message</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getParams <em>Params</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getBus <em>Bus</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageInstance()
 * @model
 * @generated
 */
public interface MessageInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference.
   * @see #setMessage(MessageType)
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageInstance_Message()
   * @model
   * @generated
   */
  MessageType getMessage();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(MessageType value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageInstance_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

  /**
   * Returns the value of the '<em><b>Bus</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bus</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bus</em>' reference.
   * @see #setBus(Bussystem)
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageInstance_Bus()
   * @model
   * @generated
   */
  Bussystem getBus();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getBus <em>Bus</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bus</em>' reference.
   * @see #getBus()
   * @generated
   */
  void setBus(Bussystem value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Component)
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageInstance_Target()
   * @model
   * @generated
   */
  Component getTarget();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.MessageInstance#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Component value);

} // MessageInstance
