/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.ForLoopExpression#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ForLoopExpression#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ForLoopExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getForLoopExpression()
 * @model
 * @generated
 */
public interface ForLoopExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Declared Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Param</em>' containment reference.
   * @see #setDeclaredParam(Parameter)
   * @see ee.xtext.haxe.haxe.HaxePackage#getForLoopExpression_DeclaredParam()
   * @model containment="true"
   * @generated
   */
  Parameter getDeclaredParam();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ForLoopExpression#getDeclaredParam <em>Declared Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Param</em>' containment reference.
   * @see #getDeclaredParam()
   * @generated
   */
  void setDeclaredParam(Parameter value);

  /**
   * Returns the value of the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Expression</em>' containment reference.
   * @see #setForExpression(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getForLoopExpression_ForExpression()
   * @model containment="true"
   * @generated
   */
  Expression getForExpression();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ForLoopExpression#getForExpression <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Expression</em>' containment reference.
   * @see #getForExpression()
   * @generated
   */
  void setForExpression(Expression value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getForLoopExpression_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ForLoopExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // ForLoopExpression
