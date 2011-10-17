/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.GetterSetter;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Metadata;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.TypedefProperty;
import ee.xtext.haxe.haxe.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typedef Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedefPropertyImpl extends FeatureImpl implements TypedefProperty
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
   * The cached value of the '{@link #getGetter() <em>Getter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetter()
   * @generated
   * @ordered
   */
  protected GetterSetter getter;

  /**
   * The cached value of the '{@link #getSetter() <em>Setter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetter()
   * @generated
   * @ordered
   */
  protected GetterSetter setter;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeReference type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedefPropertyImpl()
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
    return HaxePackage.Literals.TYPEDEF_PROPERTY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__METADATA, oldMetadata, newMetadata);
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
        msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__METADATA, null, msgs);
      if (newMetadata != null)
        msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__METADATA, null, msgs);
      msgs = basicSetMetadata(newMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__METADATA, newMetadata, newMetadata));
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
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetterSetter getGetter()
  {
    return getter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetter(GetterSetter newGetter, NotificationChain msgs)
  {
    GetterSetter oldGetter = getter;
    getter = newGetter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__GETTER, oldGetter, newGetter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetter(GetterSetter newGetter)
  {
    if (newGetter != getter)
    {
      NotificationChain msgs = null;
      if (getter != null)
        msgs = ((InternalEObject)getter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__GETTER, null, msgs);
      if (newGetter != null)
        msgs = ((InternalEObject)newGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__GETTER, null, msgs);
      msgs = basicSetGetter(newGetter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__GETTER, newGetter, newGetter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetterSetter getSetter()
  {
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetter(GetterSetter newSetter, NotificationChain msgs)
  {
    GetterSetter oldSetter = setter;
    setter = newSetter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__SETTER, oldSetter, newSetter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetter(GetterSetter newSetter)
  {
    if (newSetter != setter)
    {
      NotificationChain msgs = null;
      if (setter != null)
        msgs = ((InternalEObject)setter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__SETTER, null, msgs);
      if (newSetter != null)
        msgs = ((InternalEObject)newSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__SETTER, null, msgs);
      msgs = basicSetSetter(newSetter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__SETTER, newSetter, newSetter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs)
  {
    TypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.TYPEDEF_PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.TYPEDEF_PROPERTY__TYPE, newType, newType));
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
      case HaxePackage.TYPEDEF_PROPERTY__METADATA:
        return basicSetMetadata(null, msgs);
      case HaxePackage.TYPEDEF_PROPERTY__GETTER:
        return basicSetGetter(null, msgs);
      case HaxePackage.TYPEDEF_PROPERTY__SETTER:
        return basicSetSetter(null, msgs);
      case HaxePackage.TYPEDEF_PROPERTY__TYPE:
        return basicSetType(null, msgs);
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
      case HaxePackage.TYPEDEF_PROPERTY__METADATA:
        return getMetadata();
      case HaxePackage.TYPEDEF_PROPERTY__VISIBILITY:
        return getVisibility();
      case HaxePackage.TYPEDEF_PROPERTY__GETTER:
        return getGetter();
      case HaxePackage.TYPEDEF_PROPERTY__SETTER:
        return getSetter();
      case HaxePackage.TYPEDEF_PROPERTY__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HaxePackage.TYPEDEF_PROPERTY__METADATA:
        setMetadata((Metadata)newValue);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__GETTER:
        setGetter((GetterSetter)newValue);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__SETTER:
        setSetter((GetterSetter)newValue);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__TYPE:
        setType((TypeReference)newValue);
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
      case HaxePackage.TYPEDEF_PROPERTY__METADATA:
        setMetadata((Metadata)null);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__GETTER:
        setGetter((GetterSetter)null);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__SETTER:
        setSetter((GetterSetter)null);
        return;
      case HaxePackage.TYPEDEF_PROPERTY__TYPE:
        setType((TypeReference)null);
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
      case HaxePackage.TYPEDEF_PROPERTY__METADATA:
        return metadata != null;
      case HaxePackage.TYPEDEF_PROPERTY__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case HaxePackage.TYPEDEF_PROPERTY__GETTER:
        return getter != null;
      case HaxePackage.TYPEDEF_PROPERTY__SETTER:
        return setter != null;
      case HaxePackage.TYPEDEF_PROPERTY__TYPE:
        return type != null;
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

} //TypedefPropertyImpl
