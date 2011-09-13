/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getModified <em>Modified</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getGetter <em>Getter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getSetter <em>Setter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration()
 * @model
 * @generated
 */
public interface VariableMemberDeclaration extends ClassMember, Feature
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration_Modified()
   * @model containment="true"
   * @generated
   */
  Modifier getModified();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getModified <em>Modified</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modified</em>' containment reference.
   * @see #getModified()
   * @generated
   */
  void setModified(Modifier value);

  /**
   * Returns the value of the '<em><b>Getter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getter</em>' reference.
   * @see #setGetter(FunctionMemberDeclaration)
   * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration_Getter()
   * @model
   * @generated
   */
  FunctionMemberDeclaration getGetter();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getGetter <em>Getter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getter</em>' reference.
   * @see #getGetter()
   * @generated
   */
  void setGetter(FunctionMemberDeclaration value);

  /**
   * Returns the value of the '<em><b>Setter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setter</em>' reference.
   * @see #setSetter(FunctionMemberDeclaration)
   * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration_Setter()
   * @model
   * @generated
   */
  FunctionMemberDeclaration getSetter();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getSetter <em>Setter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Setter</em>' reference.
   * @see #getSetter()
   * @generated
   */
  void setSetter(FunctionMemberDeclaration value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getVariableMemberDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // VariableMemberDeclaration
