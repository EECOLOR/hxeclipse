/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Typedef#isPrivate <em>Private</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Typedef#getExtends <em>Extends</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Typedef#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends Type
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getTypedef_Private()
   * @model
   * @generated
   */
  boolean isPrivate();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Typedef#isPrivate <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Private</em>' attribute.
   * @see #isPrivate()
   * @generated
   */
  void setPrivate(boolean value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(TypeReference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getTypedef_Extends()
   * @model containment="true"
   * @generated
   */
  TypeReference getExtends();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Typedef#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(TypeReference value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.ClassMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getTypedef_Members()
   * @model containment="true"
   * @generated
   */
  EList<ClassMember> getMembers();

} // Typedef
