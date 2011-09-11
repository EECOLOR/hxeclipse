/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.IfExpression#getIf <em>If</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.IfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.IfExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getIfExpression_If()
   * @model containment="true"
   * @generated
   */
  Expression getIf();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.IfExpression#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(Expression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getIfExpression_Then()
   * @model containment="true"
   * @generated
   */
  Expression getThen();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.IfExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Expression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getIfExpression_Else()
   * @model containment="true"
   * @generated
   */
  Expression getElse();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.IfExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Expression value);

} // IfExpression
