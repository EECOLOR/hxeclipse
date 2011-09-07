/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.IntLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getIntLiteral()
 * @model
 * @generated
 */
public interface IntLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see ee.xtext.haxe.haxe.HaxePackage#getIntLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.IntLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntLiteral
