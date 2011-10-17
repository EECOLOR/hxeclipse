/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Metadata;
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
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getExtern <em>Extern</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumImpl extends TypeImpl implements ee.xtext.haxe.haxe.Enum
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
   * The default value of the '{@link #getExtern() <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtern()
   * @generated
   * @ordered
   */
  protected static final String EXTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtern() <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtern()
   * @generated
   * @ordered
   */
  protected String extern = EXTERN_EDEFAULT;

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
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<EnumConstructor> constructors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumImpl()
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
    return HaxePackage.Literals.ENUM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__METADATA, oldMetadata, newMetadata);
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
        msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.ENUM__METADATA, null, msgs);
      if (newMetadata != null)
        msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.ENUM__METADATA, null, msgs);
      msgs = basicSetMetadata(newMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__METADATA, newMetadata, newMetadata));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtern()
  {
    return extern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtern(String newExtern)
  {
    String oldExtern = extern;
    extern = newExtern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__EXTERN, oldExtern, extern));
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
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__VISIBILITY, oldVisibility, visibility));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__TYPE_PARAMETERS, oldTypeParameters, newTypeParameters);
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
        msgs = ((InternalEObject)typeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.ENUM__TYPE_PARAMETERS, null, msgs);
      if (newTypeParameters != null)
        msgs = ((InternalEObject)newTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.ENUM__TYPE_PARAMETERS, null, msgs);
      msgs = basicSetTypeParameters(newTypeParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__TYPE_PARAMETERS, newTypeParameters, newTypeParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumConstructor> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<EnumConstructor>(EnumConstructor.class, this, HaxePackage.ENUM__CONSTRUCTORS);
    }
    return constructors;
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
      case HaxePackage.ENUM__METADATA:
        return basicSetMetadata(null, msgs);
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return basicSetTypeParameters(null, msgs);
      case HaxePackage.ENUM__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
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
      case HaxePackage.ENUM__METADATA:
        return getMetadata();
      case HaxePackage.ENUM__EXTERN:
        return getExtern();
      case HaxePackage.ENUM__VISIBILITY:
        return getVisibility();
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return getTypeParameters();
      case HaxePackage.ENUM__CONSTRUCTORS:
        return getConstructors();
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
      case HaxePackage.ENUM__METADATA:
        setMetadata((Metadata)newValue);
        return;
      case HaxePackage.ENUM__EXTERN:
        setExtern((String)newValue);
        return;
      case HaxePackage.ENUM__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)newValue);
        return;
      case HaxePackage.ENUM__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends EnumConstructor>)newValue);
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
      case HaxePackage.ENUM__METADATA:
        setMetadata((Metadata)null);
        return;
      case HaxePackage.ENUM__EXTERN:
        setExtern(EXTERN_EDEFAULT);
        return;
      case HaxePackage.ENUM__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)null);
        return;
      case HaxePackage.ENUM__CONSTRUCTORS:
        getConstructors().clear();
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
      case HaxePackage.ENUM__METADATA:
        return metadata != null;
      case HaxePackage.ENUM__EXTERN:
        return EXTERN_EDEFAULT == null ? extern != null : !EXTERN_EDEFAULT.equals(extern);
      case HaxePackage.ENUM__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return typeParameters != null;
      case HaxePackage.ENUM__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
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
    result.append(" (extern: ");
    result.append(extern);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(')');
    return result.toString();
  }

} //EnumImpl
