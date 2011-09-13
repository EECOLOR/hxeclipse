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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getName <em>Name</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getImports <em>Imports</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getUsing <em>Using</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getEnums <em>Enums</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.Package#getTypedefs <em>Typedefs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Using</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Using}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Using</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Using</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Using()
   * @model containment="true"
   * @generated
   */
  EList<Using> getUsing();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Classes()
   * @model containment="true"
   * @generated
   */
  EList<ee.xtext.haxe.haxe.Class> getClasses();

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterfaces();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Enum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Enums()
   * @model containment="true"
   * @generated
   */
  EList<ee.xtext.haxe.haxe.Enum> getEnums();

  /**
   * Returns the value of the '<em><b>Typedefs</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Typedef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedefs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedefs</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getPackage_Typedefs()
   * @model containment="true"
   * @generated
   */
  EList<Typedef> getTypedefs();

} // Package
