/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#isPrivate <em>Private</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type
{
  /**
   * Returns the value of the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private</em>' attribute.
   * @see #setPrivate(boolean)
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Private()
   * @model
   * @generated
   */
  boolean isPrivate();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Enum#isPrivate <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Private</em>' attribute.
   * @see #isPrivate()
   * @generated
   */
  void setPrivate(boolean value);

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference.
   * @see #setTypeParameters(TypeParameters)
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_TypeParameters()
   * @model containment="true"
   * @generated
   */
  TypeParameters getTypeParameters();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Enum#getTypeParameters <em>Type Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Parameters</em>' containment reference.
   * @see #getTypeParameters()
   * @generated
   */
  void setTypeParameters(TypeParameters value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.EnumConstructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Members()
   * @model containment="true"
   * @generated
   */
  EList<EnumConstructor> getMembers();

} // Enum
