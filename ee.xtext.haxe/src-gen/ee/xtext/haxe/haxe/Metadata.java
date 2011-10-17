/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Metadata#isCompiler <em>Compiler</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Metadata#getName <em>Name</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Metadata#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject
{
  /**
   * Returns the value of the '<em><b>Compiler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compiler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compiler</em>' attribute.
   * @see #setCompiler(boolean)
   * @see ee.xtext.haxe.haxe.HaxePackage#getMetadata_Compiler()
   * @model
   * @generated
   */
  boolean isCompiler();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Metadata#isCompiler <em>Compiler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler</em>' attribute.
   * @see #isCompiler()
   * @generated
   */
  void setCompiler(boolean value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getMetadata_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Metadata#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getMetadata_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Metadata#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // Metadata
