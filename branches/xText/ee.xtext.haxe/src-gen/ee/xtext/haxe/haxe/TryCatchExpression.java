/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Catch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.TryCatchExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.TryCatchExpression#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getTryCatchExpression()
 * @model
 * @generated
 */
public interface TryCatchExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getTryCatchExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.TryCatchExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Catch Clauses</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.CatchClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Clauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Clauses</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getTryCatchExpression_CatchClauses()
   * @model containment="true"
   * @generated
   */
  EList<CatchClause> getCatchClauses();

} // TryCatchExpression
