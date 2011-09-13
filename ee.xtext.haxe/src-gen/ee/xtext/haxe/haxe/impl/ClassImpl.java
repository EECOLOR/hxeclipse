/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.ClassOrInterfaceReference;
import ee.xtext.haxe.haxe.Constructor;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.TypeParameters;
import ee.xtext.haxe.haxe.TypeReference;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getConstructor <em>Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassOrInterfaceImpl implements ee.xtext.haxe.haxe.Class
{
  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected TypeParameters typeParameters;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected TypeReference extends_;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<ClassOrInterfaceReference> implements_;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected Constructor constructor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return HaxePackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameters getTypeParameters()
  {
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeParameters(TypeParameters newTypeParameters, NotificationChain msgs)
  {
    TypeParameters oldTypeParameters = typeParameters;
    typeParameters = newTypeParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__TYPE_PARAMETERS, oldTypeParameters, newTypeParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeParameters(TypeParameters newTypeParameters)
  {
    if (newTypeParameters != typeParameters)
    {
      NotificationChain msgs = null;
      if (typeParameters != null)
        msgs = ((InternalEObject)typeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__TYPE_PARAMETERS, null, msgs);
      if (newTypeParameters != null)
        msgs = ((InternalEObject)newTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__TYPE_PARAMETERS, null, msgs);
      msgs = basicSetTypeParameters(newTypeParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__TYPE_PARAMETERS, newTypeParameters, newTypeParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(TypeReference newExtends, NotificationChain msgs)
  {
    TypeReference oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(TypeReference newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassOrInterfaceReference> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EObjectContainmentEList<ClassOrInterfaceReference>(ClassOrInterfaceReference.class, this, HaxePackage.CLASS__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor getConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstructor(Constructor newConstructor, NotificationChain msgs)
  {
    Constructor oldConstructor = constructor;
    constructor = newConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__CONSTRUCTOR, oldConstructor, newConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructor(Constructor newConstructor)
  {
    if (newConstructor != constructor)
    {
      NotificationChain msgs = null;
      if (constructor != null)
        msgs = ((InternalEObject)constructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__CONSTRUCTOR, null, msgs);
      if (newConstructor != null)
        msgs = ((InternalEObject)newConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__CONSTRUCTOR, null, msgs);
      msgs = basicSetConstructor(newConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__CONSTRUCTOR, newConstructor, newConstructor));
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
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return basicSetTypeParameters(null, msgs);
      case HaxePackage.CLASS__EXTENDS:
        return basicSetExtends(null, msgs);
      case HaxePackage.CLASS__IMPLEMENTS:
        return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
      case HaxePackage.CLASS__CONSTRUCTOR:
        return basicSetConstructor(null, msgs);
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
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return getTypeParameters();
      case HaxePackage.CLASS__EXTENDS:
        return getExtends();
      case HaxePackage.CLASS__IMPLEMENTS:
        return getImplements();
      case HaxePackage.CLASS__CONSTRUCTOR:
        return getConstructor();
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
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)newValue);
        return;
      case HaxePackage.CLASS__EXTENDS:
        setExtends((TypeReference)newValue);
        return;
      case HaxePackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends ClassOrInterfaceReference>)newValue);
        return;
      case HaxePackage.CLASS__CONSTRUCTOR:
        setConstructor((Constructor)newValue);
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
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)null);
        return;
      case HaxePackage.CLASS__EXTENDS:
        setExtends((TypeReference)null);
        return;
      case HaxePackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        return;
      case HaxePackage.CLASS__CONSTRUCTOR:
        setConstructor((Constructor)null);
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
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return typeParameters != null;
      case HaxePackage.CLASS__EXTENDS:
        return extends_ != null;
      case HaxePackage.CLASS__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case HaxePackage.CLASS__CONSTRUCTOR:
        return constructor != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
