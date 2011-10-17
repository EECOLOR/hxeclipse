/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.InterfaceProperty#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.InterfaceProperty#getGetter <em>Getter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.InterfaceProperty#getSetter <em>Setter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.InterfaceProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ee.xtext.haxe.haxe.HaxePackage#getInterfaceProperty()
 * @model
 * @generated
 */
public interface InterfaceProperty extends Feature
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
   * @see ee.xtext.haxe.haxe.HaxePackage#getInterfaceProperty_Metadata()
   * @model containment="true"
   * @generated
   */
  Metadata getMetadata();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.InterfaceProperty#getMetadata <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata</em>' containment reference.
   * @see #getMetadata()
   * @generated
   */
  void setMetadata(Metadata value);

  /**
   * Returns the value of the '<em><b>Getter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getter</em>' containment reference.
   * @see #setGetter(GetterSetter)
   * @see ee.xtext.haxe.haxe.HaxePackage#getInterfaceProperty_Getter()
   * @model containment="true"
   * @generated
   */
  GetterSetter getGetter();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.InterfaceProperty#getGetter <em>Getter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getter</em>' containment reference.
   * @see #getGetter()
   * @generated
   */
  void setGetter(GetterSetter value);

  /**
   * Returns the value of the '<em><b>Setter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setter</em>' containment reference.
   * @see #setSetter(GetterSetter)
   * @see ee.xtext.haxe.haxe.HaxePackage#getInterfaceProperty_Setter()
   * @model containment="true"
   * @generated
   */
  GetterSetter getSetter();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.InterfaceProperty#getSetter <em>Setter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Setter</em>' containment reference.
   * @see #getSetter()
   * @generated
   */
  void setSetter(GetterSetter value);

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
   * @see ee.xtext.haxe.haxe.HaxePackage#getInterfaceProperty_Type()
   * @model containment="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link ee.xtext.haxe.haxe.InterfaceProperty#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

} // InterfaceProperty
