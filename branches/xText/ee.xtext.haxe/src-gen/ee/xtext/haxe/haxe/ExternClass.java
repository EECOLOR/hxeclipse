/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getProperties <em>Properties</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClass#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass()
 * @model
 * @generated
 */
public interface ExternClass extends Type
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Metadata()
   * @model containment="true"
   * @generated
   */
  Metadata getMetadata();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClass#getMetadata <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata</em>' containment reference.
   * @see #getMetadata()
   * @generated
   */
  void setMetadata(Metadata value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClass#getVisibility <em>Visibility</em>}' attribute.
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_TypeParameters()
   * @model containment="true"
   * @generated
   */
  TypeParameters getTypeParameters();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClass#getTypeParameters <em>Type Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Parameters</em>' containment reference.
   * @see #getTypeParameters()
   * @generated
   */
  void setTypeParameters(TypeParameters value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(Reference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Extends()
   * @model containment="true"
   * @generated
   */
  Reference getExtends();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClass#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(Reference value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Implements()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getImplements();

  /**
   * Returns the value of the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor</em>' containment reference.
   * @see #setConstructor(ExternClassConstructor)
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Constructor()
   * @model containment="true"
   * @generated
   */
  ExternClassConstructor getConstructor();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClass#getConstructor <em>Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor</em>' containment reference.
   * @see #getConstructor()
   * @generated
   */
  void setConstructor(ExternClassConstructor value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.ExternClassProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ExternClassProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClass_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // ExternClass
