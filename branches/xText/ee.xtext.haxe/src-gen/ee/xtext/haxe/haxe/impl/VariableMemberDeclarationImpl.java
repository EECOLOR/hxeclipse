/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FunctionMemberDeclaration;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Modifier;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.VariableMemberDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableMemberDeclarationImpl extends ClassMemberImpl implements VariableMemberDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getModified() <em>Modified</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
  protected Modifier modified;

  /**
   * The cached value of the '{@link #getGetter() <em>Getter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetter()
   * @generated
   * @ordered
   */
  protected FunctionMemberDeclaration getter;

  /**
   * The cached value of the '{@link #getSetter() <em>Setter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetter()
   * @generated
   * @ordered
   */
  protected FunctionMemberDeclaration setter;

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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableMemberDeclarationImpl()
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
    return HaxePackage.Literals.VARIABLE_MEMBER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier getModified()
  {
    return modified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModified(Modifier newModified, NotificationChain msgs)
  {
    Modifier oldModified = modified;
    modified = newModified;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED, oldModified, newModified);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModified(Modifier newModified)
  {
    if (newModified != modified)
    {
      NotificationChain msgs = null;
      if (modified != null)
        msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED, null, msgs);
      if (newModified != null)
        msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED, null, msgs);
      msgs = basicSetModified(newModified, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED, newModified, newModified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionMemberDeclaration getGetter()
  {
    if (getter != null && getter.eIsProxy())
    {
      InternalEObject oldGetter = (InternalEObject)getter;
      getter = (FunctionMemberDeclaration)eResolveProxy(oldGetter);
      if (getter != oldGetter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER, oldGetter, getter));
      }
    }
    return getter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionMemberDeclaration basicGetGetter()
  {
    return getter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetter(FunctionMemberDeclaration newGetter)
  {
    FunctionMemberDeclaration oldGetter = getter;
    getter = newGetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER, oldGetter, getter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionMemberDeclaration getSetter()
  {
    if (setter != null && setter.eIsProxy())
    {
      InternalEObject oldSetter = (InternalEObject)setter;
      setter = (FunctionMemberDeclaration)eResolveProxy(oldSetter);
      if (setter != oldSetter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER, oldSetter, setter));
      }
    }
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionMemberDeclaration basicGetSetter()
  {
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetter(FunctionMemberDeclaration newSetter)
  {
    FunctionMemberDeclaration oldSetter = setter;
    setter = newSetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER, oldSetter, setter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION, newExpression, newExpression));
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
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED:
        return basicSetModified(null, msgs);
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME:
        return getName();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED:
        return getModified();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER:
        if (resolve) return getGetter();
        return basicGetGetter();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER:
        if (resolve) return getSetter();
        return basicGetSetter();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE:
        return getType();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION:
        return getExpression();
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
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED:
        setModified((Modifier)newValue);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER:
        setGetter((FunctionMemberDeclaration)newValue);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER:
        setSetter((FunctionMemberDeclaration)newValue);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE:
        setType((TypeReference)newValue);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED:
        setModified((Modifier)null);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER:
        setGetter((FunctionMemberDeclaration)null);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER:
        setSetter((FunctionMemberDeclaration)null);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE:
        setType((TypeReference)null);
        return;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
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
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__MODIFIED:
        return modified != null;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__GETTER:
        return getter != null;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__SETTER:
        return setter != null;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__TYPE:
        return type != null;
      case HaxePackage.VARIABLE_MEMBER_DECLARATION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Feature.class)
    {
      switch (derivedFeatureID)
      {
        case HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME: return HaxePackage.FEATURE__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Feature.class)
    {
      switch (baseFeatureID)
      {
        case HaxePackage.FEATURE__NAME: return HaxePackage.VARIABLE_MEMBER_DECLARATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableMemberDeclarationImpl
