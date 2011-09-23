/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getModified <em>Modified</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getFunctionMemberDeclaration()
 * @model
 * @generated
 */
public interface FunctionMemberDeclaration extends ClassMember, Feature
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getFunctionMemberDeclaration_Modified()
   * @model containment="true"
   * @generated
   */
  Modifier getModified();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getModified <em>Modified</em>}' containment reference.
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getFunctionMemberDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<FormalParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypeReference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getFunctionMemberDeclaration_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeReference getReturnType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeReference value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getFunctionMemberDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // FunctionMemberDeclaration