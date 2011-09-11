/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.ArrayAssignment#getAssigname <em>Assigname</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ArrayAssignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ArrayAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getArrayAssignment()
 * @model
 * @generated
 */
public interface ArrayAssignment extends Expression
{
  /**
   * Returns the value of the '<em><b>Assigname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigname</em>' containment reference.
   * @see #setAssigname(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getArrayAssignment_Assigname()
   * @model containment="true"
   * @generated
   */
  Expression getAssigname();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ArrayAssignment#getAssigname <em>Assigname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigname</em>' containment reference.
   * @see #getAssigname()
   * @generated
   */
  void setAssigname(Expression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getArrayAssignment_Feature()
   * @model containment="true"
   * @generated
   */
  Expression getFeature();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ArrayAssignment#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Expression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getArrayAssignment_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ArrayAssignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // ArrayAssignment
