/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Class Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClassConstructor#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClassConstructor#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClassConstructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.ExternClassConstructor#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getExternClassConstructor()
 * @model
 * @generated
 */
public interface ExternClassConstructor extends EObject
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClassConstructor_Metadata()
   * @model containment="true"
   * @generated
   */
  Metadata getMetadata();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getMetadata <em>Metadata</em>}' containment reference.
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClassConstructor_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see ee.xtext.haxe.haxe.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClassConstructor_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypeReference)
   * @see ee.xtext.haxe.haxe.HaxePackage#getExternClassConstructor_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeReference getReturnType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeReference value);

} // ExternClassConstructor
