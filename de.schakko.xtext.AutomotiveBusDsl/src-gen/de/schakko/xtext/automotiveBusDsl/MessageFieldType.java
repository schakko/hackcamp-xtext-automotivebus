/**
 */
package de.schakko.xtext.automotiveBusDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#getName <em>Name</em>}</li>
 *   <li>{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageFieldType()
 * @model
 * @generated
 */
public interface MessageFieldType extends EObject
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
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageFieldType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Required</em>' attribute.
   * @see #setIsRequired(boolean)
   * @see de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage#getMessageFieldType_IsRequired()
   * @model
   * @generated
   */
  boolean isIsRequired();

  /**
   * Sets the value of the '{@link de.schakko.xtext.automotiveBusDsl.MessageFieldType#isIsRequired <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Required</em>' attribute.
   * @see #isIsRequired()
   * @generated
   */
  void setIsRequired(boolean value);

} // MessageFieldType
