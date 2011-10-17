/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.ExternClassConstructor;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Metadata;
import ee.xtext.haxe.haxe.Parameter;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extern Class Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternClassConstructorImpl extends MinimalEObjectImpl.Container implements ExternClassConstructor
{
  /**
   * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadata()
   * @generated
   * @ordered
   */
  protected Metadata metadata;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PRIVATE;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility = VISIBILITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected TypeReference returnType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternClassConstructorImpl()
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
    return HaxePackage.Literals.EXTERN_CLASS_CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata getMetadata()
  {
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs)
  {
    Metadata oldMetadata = metadata;
    metadata = newMetadata;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA, oldMetadata, newMetadata);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetadata(Metadata newMetadata)
  {
    if (newMetadata != metadata)
    {
      NotificationChain msgs = null;
      if (metadata != null)
        msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA, null, msgs);
      if (newMetadata != null)
        msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA, null, msgs);
      msgs = basicSetMetadata(newMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA, newMetadata, newMetadata));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs)
  {
    TypeReference oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(TypeReference newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE, newReturnType, newReturnType));
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
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA:
        return basicSetMetadata(null, msgs);
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE:
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
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA:
        return getMetadata();
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__VISIBILITY:
        return getVisibility();
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS:
        return getParameters();
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE:
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
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA:
        setMetadata((Metadata)newValue);
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE:
        setReturnType((TypeReference)newValue);
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
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA:
        setMetadata((Metadata)null);
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        return;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE:
        setReturnType((TypeReference)null);
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
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__METADATA:
        return metadata != null;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE:
        return returnType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (visibility: ");
    result.append(visibility);
    result.append(')');
    return result.toString();
  }

} //ExternClassConstructorImpl
