/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FormalParameter;
import ee.xtext.haxe.haxe.HaxePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopExpressionImpl extends ExpressionImpl implements ForLoopExpression
{
  /**
   * The cached value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParam()
   * @generated
   * @ordered
   */
  protected FormalParameter declaredParam;

  /**
   * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForExpression()
   * @generated
   * @ordered
   */
  protected Expression forExpression;

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
  protected ForLoopExpressionImpl()
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
    return HaxePackage.Literals.FOR_LOOP_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParameter getDeclaredParam()
  {
    return declaredParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredParam(FormalParameter newDeclaredParam, NotificationChain msgs)
  {
    FormalParameter oldDeclaredParam = declaredParam;
    declaredParam = newDeclaredParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM, oldDeclaredParam, newDeclaredParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredParam(FormalParameter newDeclaredParam)
  {
    if (newDeclaredParam != declaredParam)
    {
      NotificationChain msgs = null;
      if (declaredParam != null)
        msgs = ((InternalEObject)declaredParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM, null, msgs);
      if (newDeclaredParam != null)
        msgs = ((InternalEObject)newDeclaredParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM, null, msgs);
      msgs = basicSetDeclaredParam(newDeclaredParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM, newDeclaredParam, newDeclaredParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getForExpression()
  {
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForExpression(Expression newForExpression, NotificationChain msgs)
  {
    Expression oldForExpression = forExpression;
    forExpression = newForExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION, oldForExpression, newForExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForExpression(Expression newForExpression)
  {
    if (newForExpression != forExpression)
    {
      NotificationChain msgs = null;
      if (forExpression != null)
        msgs = ((InternalEObject)forExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
      if (newForExpression != null)
        msgs = ((InternalEObject)newForExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
      msgs = basicSetForExpression(newForExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION, newForExpression, newForExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HaxePackage.FOR_LOOP_EXPRESSION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.FOR_LOOP_EXPRESSION__BODY, newBody, newBody));
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
      case HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM:
        return basicSetDeclaredParam(null, msgs);
      case HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return basicSetForExpression(null, msgs);
      case HaxePackage.FOR_LOOP_EXPRESSION__BODY:
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
      case HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM:
        return getDeclaredParam();
      case HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return getForExpression();
      case HaxePackage.FOR_LOOP_EXPRESSION__BODY:
        return getBody();
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
      case HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam((FormalParameter)newValue);
        return;
      case HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        setForExpression((Expression)newValue);
        return;
      case HaxePackage.FOR_LOOP_EXPRESSION__BODY:
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
      case HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam((FormalParameter)null);
        return;
      case HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        setForExpression((Expression)null);
        return;
      case HaxePackage.FOR_LOOP_EXPRESSION__BODY:
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
      case HaxePackage.FOR_LOOP_EXPRESSION__DECLARED_PARAM:
        return declaredParam != null;
      case HaxePackage.FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return forExpression != null;
      case HaxePackage.FOR_LOOP_EXPRESSION__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //ForLoopExpressionImpl
