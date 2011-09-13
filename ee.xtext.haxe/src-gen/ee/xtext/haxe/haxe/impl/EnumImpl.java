/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.TypeParameters;

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
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.EnumImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumImpl extends TypeImpl implements ee.xtext.haxe.haxe.Enum
{
  /**
   * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected static final boolean PRIVATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected boolean private_ = PRIVATE_EDEFAULT;

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
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<EnumConstructor> members;

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
  public boolean isPrivate()
  {
    return private_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivate(boolean newPrivate)
  {
    boolean oldPrivate = private_;
    private_ = newPrivate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.ENUM__PRIVATE, oldPrivate, private_));
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
  public EList<EnumConstructor> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<EnumConstructor>(EnumConstructor.class, this, HaxePackage.ENUM__MEMBERS);
    }
    return members;
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
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return basicSetTypeParameters(null, msgs);
      case HaxePackage.ENUM__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case HaxePackage.ENUM__PRIVATE:
        return isPrivate();
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return getTypeParameters();
      case HaxePackage.ENUM__MEMBERS:
        return getMembers();
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
      case HaxePackage.ENUM__PRIVATE:
        setPrivate((Boolean)newValue);
        return;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)newValue);
        return;
      case HaxePackage.ENUM__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends EnumConstructor>)newValue);
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
      case HaxePackage.ENUM__PRIVATE:
        setPrivate(PRIVATE_EDEFAULT);
        return;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        setTypeParameters((TypeParameters)null);
        return;
      case HaxePackage.ENUM__MEMBERS:
        getMembers().clear();
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
      case HaxePackage.ENUM__PRIVATE:
        return private_ != PRIVATE_EDEFAULT;
      case HaxePackage.ENUM__TYPE_PARAMETERS:
        return typeParameters != null;
      case HaxePackage.ENUM__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (private: ");
    result.append(private_);
    result.append(')');
    return result.toString();
  }

} //EnumImpl
