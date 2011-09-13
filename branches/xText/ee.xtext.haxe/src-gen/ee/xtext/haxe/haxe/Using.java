/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.Using#getImportedClass <em>Imported Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getUsing()
 * @model
 * @generated
 */
public interface Using extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Class</em>' attribute.
   * @see #setImportedClass(String)
   * @see ee.xtext.haxe.haxe.HaxePackage#getUsing_ImportedClass()
   * @model
   * @generated
   */
  String getImportedClass();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.Using#getImportedClass <em>Imported Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Class</em>' attribute.
   * @see #getImportedClass()
   * @generated
   */
  void setImportedClass(String value);

} // Using
