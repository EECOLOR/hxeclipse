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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.File#getBlockExpression <em>Block Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>Block Expression</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Expression</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getFile_BlockExpression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getBlockExpression();

} // File
