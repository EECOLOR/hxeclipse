/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.SwitchExpression#getSwitch <em>Switch</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.SwitchExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.SwitchExpression#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getSwitchExpression()
 * @model
 * @generated
 */
public interface SwitchExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' containment reference.
   * @see #setSwitch(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getSwitchExpression_Switch()
   * @model containment="true"
   * @generated
   */
  Expression getSwitch();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.SwitchExpression#getSwitch <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' containment reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(Expression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.CasePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getSwitchExpression_Cases()
   * @model containment="true"
   * @generated
   */
  EList<CasePart> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getSwitchExpression_Default()
   * @model containment="true"
   * @generated
   */
  Expression getDefault();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.SwitchExpression#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Expression value);

} // SwitchExpression
