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
 * A representation of the model object '<em><b>Case Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.CasePart#getCases <em>Cases</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.CasePart#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getCasePart()
 * @model
 * @generated
 */
public interface CasePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link ee.xtext.haxe.haxe.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see ee.xtext.haxe.haxe.HaxePackage#getCasePart_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getCases();

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(CasePartExpressions)
   * @see ee.xtext.haxe.haxe.HaxePackage#getCasePart_Then()
   * @model containment="true"
   * @generated
   */
  CasePartExpressions getThen();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.CasePart#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(CasePartExpressions value);

} // CasePart
