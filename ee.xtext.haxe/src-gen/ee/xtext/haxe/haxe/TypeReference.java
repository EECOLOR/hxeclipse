/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.TypeReference#getType <em>Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.TypeReference#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends ClassOrInterfaceReference
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see ee.xtext.haxe.haxe.HaxePackage#getTypeReference_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.TypeReference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.TypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getTypeReference_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<TypeReference> getArguments();

} // TypeReference
