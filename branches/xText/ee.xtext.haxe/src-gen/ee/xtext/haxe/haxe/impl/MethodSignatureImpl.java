/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.MethodSignature;
import ee.xtext.haxe.haxe.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.MethodSignatureImpl#getArgumentTypes <em>Argument Types</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.MethodSignatureImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodSignatureImpl extends ReferenceImpl implements MethodSignature
{
  /**
   * The cached value of the '{@link #getArgumentTypes() <em>Argument Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentTypes()
   * @generated
   * @ordered
   */
  protected EList<Reference> argumentTypes;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Reference returnType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodSignatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HaxePackage.Literals.METHOD_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getArgumentTypes()
  {
    if (argumentTypes == null)
    {
      argumentTypes = new EObjectContainmentEList<Reference>(Reference.class, this, HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES);
    }
    return argumentTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(Reference newReturnType, NotificationChain msgs)
  {
    Reference oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.METHOD_SIGNATURE__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Reference newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.METHOD_SIGNATURE__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.METHOD_SIGNATURE__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.METHOD_SIGNATURE__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES:
        return ((InternalEList<?>)getArgumentTypes()).basicRemove(otherEnd, msgs);
      case HaxePackage.METHOD_SIGNATURE__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES:
        return getArgumentTypes();
      case HaxePackage.METHOD_SIGNATURE__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES:
        getArgumentTypes().clear();
        getArgumentTypes().addAll((Collection<? extends Reference>)newValue);
        return;
      case HaxePackage.METHOD_SIGNATURE__RETURN_TYPE:
        setReturnType((Reference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES:
        getArgumentTypes().clear();
        return;
      case HaxePackage.METHOD_SIGNATURE__RETURN_TYPE:
        setReturnType((Reference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HaxePackage.METHOD_SIGNATURE__ARGUMENT_TYPES:
        return argumentTypes != null && !argumentTypes.isEmpty();
      case HaxePackage.METHOD_SIGNATURE__RETURN_TYPE:
        return returnType != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodSignatureImpl
