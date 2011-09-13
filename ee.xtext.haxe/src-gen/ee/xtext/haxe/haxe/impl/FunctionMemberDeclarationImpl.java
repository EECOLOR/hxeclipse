/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FormalParameter;
import ee.xtext.haxe.haxe.FunctionMemberDeclaration;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Modifier;
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
 * An implementation of the model object '<em><b>Function Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionMemberDeclarationImpl extends ClassMemberImpl implements FunctionMemberDeclaration
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<FormalParameter> parameters;

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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Expression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionMemberDeclarationImpl()
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
    return HaxePackage.Literals.FUNCTION_MEMBER_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED, oldModified, newModified);
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
        msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED, null, msgs);
      if (newModified != null)
        msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED, null, msgs);
      msgs = basicSetModified(newModified, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED, newModified, newModified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormalParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<FormalParameter>(FormalParameter.class, this, HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE, oldReturnType, newReturnType);
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
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs)
  {
    Expression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Expression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY, newBody, newBody));
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
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED:
        return basicSetModified(null, msgs);
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY:
        return basicSetBody(null, msgs);
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
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME:
        return getName();
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED:
        return getModified();
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS:
        return getParameters();
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE:
        return getReturnType();
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY:
        return getBody();
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
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED:
        setModified((Modifier)newValue);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends FormalParameter>)newValue);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE:
        setReturnType((TypeReference)newValue);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY:
        setBody((Expression)newValue);
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
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED:
        setModified((Modifier)null);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE:
        setReturnType((TypeReference)null);
        return;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY:
        setBody((Expression)null);
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
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__MODIFIED:
        return modified != null;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__RETURN_TYPE:
        return returnType != null;
      case HaxePackage.FUNCTION_MEMBER_DECLARATION__BODY:
        return body != null;
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
        case HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME: return HaxePackage.FEATURE__NAME;
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
        case HaxePackage.FEATURE__NAME: return HaxePackage.FUNCTION_MEMBER_DECLARATION__NAME;
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

} //FunctionMemberDeclarationImpl
