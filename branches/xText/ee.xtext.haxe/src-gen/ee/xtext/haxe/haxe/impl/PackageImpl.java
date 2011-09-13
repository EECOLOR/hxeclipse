/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Import;
import ee.xtext.haxe.haxe.Interface;
import ee.xtext.haxe.haxe.Typedef;
import ee.xtext.haxe.haxe.Using;

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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link ee.xtext.haxe.haxe.impl.PackageImpl#getTypedefs <em>Typedefs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements ee.xtext.haxe.haxe.Package
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getUsing() <em>Using</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsing()
   * @generated
   * @ordered
   */
  protected EList<Using> using;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<ee.xtext.haxe.haxe.Class> classes;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnums()
   * @generated
   * @ordered
   */
  protected EList<ee.xtext.haxe.haxe.Enum> enums;

  /**
   * The cached value of the '{@link #getTypedefs() <em>Typedefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedefs()
   * @generated
   * @ordered
   */
  protected EList<Typedef> typedefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return HaxePackage.Literals.PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HaxePackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, HaxePackage.PACKAGE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using> getUsing()
  {
    if (using == null)
    {
      using = new EObjectContainmentEList<Using>(Using.class, this, HaxePackage.PACKAGE__USING);
    }
    return using;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ee.xtext.haxe.haxe.Class> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<ee.xtext.haxe.haxe.Class>(ee.xtext.haxe.haxe.Class.class, this, HaxePackage.PACKAGE__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, HaxePackage.PACKAGE__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ee.xtext.haxe.haxe.Enum> getEnums()
  {
    if (enums == null)
    {
      enums = new EObjectContainmentEList<ee.xtext.haxe.haxe.Enum>(ee.xtext.haxe.haxe.Enum.class, this, HaxePackage.PACKAGE__ENUMS);
    }
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Typedef> getTypedefs()
  {
    if (typedefs == null)
    {
      typedefs = new EObjectContainmentEList<Typedef>(Typedef.class, this, HaxePackage.PACKAGE__TYPEDEFS);
    }
    return typedefs;
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
      case HaxePackage.PACKAGE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case HaxePackage.PACKAGE__USING:
        return ((InternalEList<?>)getUsing()).basicRemove(otherEnd, msgs);
      case HaxePackage.PACKAGE__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case HaxePackage.PACKAGE__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case HaxePackage.PACKAGE__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case HaxePackage.PACKAGE__TYPEDEFS:
        return ((InternalEList<?>)getTypedefs()).basicRemove(otherEnd, msgs);
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
      case HaxePackage.PACKAGE__NAME:
        return getName();
      case HaxePackage.PACKAGE__IMPORTS:
        return getImports();
      case HaxePackage.PACKAGE__USING:
        return getUsing();
      case HaxePackage.PACKAGE__CLASSES:
        return getClasses();
      case HaxePackage.PACKAGE__INTERFACES:
        return getInterfaces();
      case HaxePackage.PACKAGE__ENUMS:
        return getEnums();
      case HaxePackage.PACKAGE__TYPEDEFS:
        return getTypedefs();
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
      case HaxePackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case HaxePackage.PACKAGE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case HaxePackage.PACKAGE__USING:
        getUsing().clear();
        getUsing().addAll((Collection<? extends Using>)newValue);
        return;
      case HaxePackage.PACKAGE__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends ee.xtext.haxe.haxe.Class>)newValue);
        return;
      case HaxePackage.PACKAGE__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
        return;
      case HaxePackage.PACKAGE__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends ee.xtext.haxe.haxe.Enum>)newValue);
        return;
      case HaxePackage.PACKAGE__TYPEDEFS:
        getTypedefs().clear();
        getTypedefs().addAll((Collection<? extends Typedef>)newValue);
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
      case HaxePackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HaxePackage.PACKAGE__IMPORTS:
        getImports().clear();
        return;
      case HaxePackage.PACKAGE__USING:
        getUsing().clear();
        return;
      case HaxePackage.PACKAGE__CLASSES:
        getClasses().clear();
        return;
      case HaxePackage.PACKAGE__INTERFACES:
        getInterfaces().clear();
        return;
      case HaxePackage.PACKAGE__ENUMS:
        getEnums().clear();
        return;
      case HaxePackage.PACKAGE__TYPEDEFS:
        getTypedefs().clear();
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
      case HaxePackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HaxePackage.PACKAGE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case HaxePackage.PACKAGE__USING:
        return using != null && !using.isEmpty();
      case HaxePackage.PACKAGE__CLASSES:
        return classes != null && !classes.isEmpty();
      case HaxePackage.PACKAGE__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case HaxePackage.PACKAGE__ENUMS:
        return enums != null && !enums.isEmpty();
      case HaxePackage.PACKAGE__TYPEDEFS:
        return typedefs != null && !typedefs.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
