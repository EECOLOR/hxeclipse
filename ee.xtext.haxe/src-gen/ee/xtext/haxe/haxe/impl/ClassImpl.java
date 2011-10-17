/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.ClassConstructor;
import ee.xtext.haxe.haxe.ClassProperty;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Metadata;
import ee.xtext.haxe.haxe.Method;
import ee.xtext.haxe.haxe.Reference;
import ee.xtext.haxe.haxe.TypeParameters;
import ee.xtext.haxe.haxe.Visibility;

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
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements ee.xtext.haxe.haxe.Class
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
  protected Reference extends_;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<Reference> implements_;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected ClassConstructor constructor;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ClassProperty> properties;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__METADATA, oldMetadata, newMetadata);
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
        msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__METADATA, null, msgs);
      if (newMetadata != null)
        msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.CLASS__METADATA, null, msgs);
      msgs = basicSetMetadata(newMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__METADATA, newMetadata, newMetadata));
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
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.CLASS__VISIBILITY, oldVisibility, visibility));
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
  public Reference getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(Reference newExtends, NotificationChain msgs)
  {
    Reference oldExtends = extends_;
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
  public void setExtends(Reference newExtends)
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
  public EList<Reference> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EObjectContainmentEList<Reference>(Reference.class, this, HaxePackage.CLASS__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassConstructor getConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstructor(ClassConstructor newConstructor, NotificationChain msgs)
  {
    ClassConstructor oldConstructor = constructor;
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
  public void setConstructor(ClassConstructor newConstructor)
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
  public EList<ClassProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ClassProperty>(ClassProperty.class, this, HaxePackage.CLASS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, HaxePackage.CLASS__METHODS);
    }
    return methods;
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
      case HaxePackage.CLASS__METADATA:
        return basicSetMetadata(null, msgs);
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return basicSetTypeParameters(null, msgs);
      case HaxePackage.CLASS__EXTENDS:
        return basicSetExtends(null, msgs);
      case HaxePackage.CLASS__IMPLEMENTS:
        return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
      case HaxePackage.CLASS__CONSTRUCTOR:
        return basicSetConstructor(null, msgs);
      case HaxePackage.CLASS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case HaxePackage.CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case HaxePackage.CLASS__METADATA:
        return getMetadata();
      case HaxePackage.CLASS__VISIBILITY:
        return getVisibility();
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return getTypeParameters();
      case HaxePackage.CLASS__EXTENDS:
        return getExtends();
      case HaxePackage.CLASS__IMPLEMENTS:
        return getImplements();
      case HaxePackage.CLASS__CONSTRUCTOR:
        return getConstructor();
      case HaxePackage.CLASS__PROPERTIES:
        return getProperties();
      case HaxePackage.CLASS__METHODS:
        return getMethods();
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
      case HaxePackage.CLASS__METADATA:
        setMetadata((Metadata)newValue);
        return;
      case HaxePackage.CLASS__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)newValue);
        return;
      case HaxePackage.CLASS__EXTENDS:
        setExtends((Reference)newValue);
        return;
      case HaxePackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends Reference>)newValue);
        return;
      case HaxePackage.CLASS__CONSTRUCTOR:
        setConstructor((ClassConstructor)newValue);
        return;
      case HaxePackage.CLASS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ClassProperty>)newValue);
        return;
      case HaxePackage.CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
      case HaxePackage.CLASS__METADATA:
        setMetadata((Metadata)null);
        return;
      case HaxePackage.CLASS__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)null);
        return;
      case HaxePackage.CLASS__EXTENDS:
        setExtends((Reference)null);
        return;
      case HaxePackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        return;
      case HaxePackage.CLASS__CONSTRUCTOR:
        setConstructor((ClassConstructor)null);
        return;
      case HaxePackage.CLASS__PROPERTIES:
        getProperties().clear();
        return;
      case HaxePackage.CLASS__METHODS:
        getMethods().clear();
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
      case HaxePackage.CLASS__METADATA:
        return metadata != null;
      case HaxePackage.CLASS__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case HaxePackage.CLASS__TYPE_PARAMETERS:
        return typeParameters != null;
      case HaxePackage.CLASS__EXTENDS:
        return extends_ != null;
      case HaxePackage.CLASS__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case HaxePackage.CLASS__CONSTRUCTOR:
        return constructor != null;
      case HaxePackage.CLASS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case HaxePackage.CLASS__METHODS:
        return methods != null && !methods.isEmpty();
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

} //ClassImpl
