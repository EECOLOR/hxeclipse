/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Constructor#getModified <em>Modified</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Constructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Constructor#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Modified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modified</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modified</em>' containment reference.
   * @see #setModified(Modifier)
   * @see ee.xtext.haxe.haxe.HaxePackage#getConstructor_Modified()
   * @model containment="true"
   * @generated
   */
  Modifier getModified();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Constructor#getModified <em>Modified</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modified</em>' containment reference.
   * @see #getModified()
   * @generated
   */
  void setModified(Modifier value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.FormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getConstructor_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<FormalParameter> getParameters();

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getConstructor_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Constructor#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // Constructor
