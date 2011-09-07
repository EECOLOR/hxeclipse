/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.BlockExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getBlockExpression()
 * @model
 * @generated
 */
public interface BlockExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getBlockExpression_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // BlockExpression
