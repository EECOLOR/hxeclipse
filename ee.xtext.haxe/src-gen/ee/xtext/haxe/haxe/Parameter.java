/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Parameter#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeReference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see ee.xtext.haxe.haxe.HaxePackage#getParameter_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValue();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Expression value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see ee.xtext.haxe.haxe.HaxePackage#getParameter_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Parameter#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

} // Parameter