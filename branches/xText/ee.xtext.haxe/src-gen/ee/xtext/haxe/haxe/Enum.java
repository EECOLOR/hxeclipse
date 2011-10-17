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
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getExtern <em>Extern</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Enum#getConstructors <em>Constructors</em>}</li>
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
   * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata</em>' containment reference.
   * @see #setMetadata(Metadata)
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Metadata()
   * @model containment="true"
   * @generated
   */
  Metadata getMetadata();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Enum#getMetadata <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata</em>' containment reference.
   * @see #getMetadata()
   * @generated
   */
  void setMetadata(Metadata value);

  /**
   * Returns the value of the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extern</em>' attribute.
   * @see #setExtern(String)
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Extern()
   * @model
   * @generated
   */
  String getExtern();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Enum#getExtern <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extern</em>' attribute.
   * @see #getExtern()
   * @generated
   */
  void setExtern(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link ee.xtext.haxe.haxe.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see ee.xtext.haxe.haxe.Visibility
   * @see #setVisibility(Visibility)
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Enum#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see ee.xtext.haxe.haxe.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

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
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.EnumConstructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getEnum_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<EnumConstructor> getConstructors();

} // Enum
