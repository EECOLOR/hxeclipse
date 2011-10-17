/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.MethodSignature#getArgumentTypes <em>Argument Types</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.MethodSignature#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getMethodSignature()
 * @model
 * @generated
 */
public interface MethodSignature extends Reference
{
  /**
   * Returns the value of the '<em><b>Argument Types</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument Types</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getMethodSignature_ArgumentTypes()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getArgumentTypes();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(Reference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getMethodSignature_ReturnType()
   * @model containment="true"
   * @generated
   */
  Reference getReturnType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.MethodSignature#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Reference value);

} // MethodSignature
