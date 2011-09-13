/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ee.xtext.haxe.haxe.HaxeFactory
 * @model kind="package"
 * @generated
 */
public interface HaxePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "haxe";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.ee/haxe/Haxe";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "haxe";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HaxePackage eINSTANCE = ee.xtext.haxe.haxe.impl.HaxePackageImpl.init();

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.PackageImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Using</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__USING = 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__CLASSES = 3;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__INTERFACES = 4;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENUMS = 5;

  /**
   * The feature id for the '<em><b>Typedefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TYPEDEFS = 6;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ImportImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.UsingImpl <em>Using</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.UsingImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUsing()
   * @generated
   */
  int USING = 2;

  /**
   * The feature id for the '<em><b>Imported Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING__IMPORTED_CLASS = 0;

  /**
   * The number of structural features of the '<em>Using</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassOrInterfaceImpl <em>Class Or Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassOrInterfaceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassOrInterface()
   * @generated
   */
  int CLASS_OR_INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE__PRIVATE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE__MEMBERS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Or Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClass_()
   * @generated
   */
  int CLASS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = CLASS_OR_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PRIVATE = CLASS_OR_INTERFACE__PRIVATE;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = CLASS_OR_INTERFACE__MEMBERS;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPE_PARAMETERS = CLASS_OR_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EXTENDS = CLASS_OR_INTERFACE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IMPLEMENTS = CLASS_OR_INTERFACE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CONSTRUCTOR = CLASS_OR_INTERFACE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = CLASS_OR_INTERFACE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassMemberImpl <em>Class Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassMemberImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassMember()
   * @generated
   */
  int CLASS_MEMBER = 6;

  /**
   * The number of structural features of the '<em>Class Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.InterfaceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = CLASS_OR_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__PRIVATE = CLASS_OR_INTERFACE__PRIVATE;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = CLASS_OR_INTERFACE__MEMBERS;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__IMPLEMENTS = CLASS_OR_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = CLASS_OR_INTERFACE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.EnumImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnum()
   * @generated
   */
  int ENUM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__PRIVATE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__MEMBERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.EnumConstructorImpl <em>Enum Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.EnumConstructorImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnumConstructor()
   * @generated
   */
  int ENUM_CONSTRUCTOR = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Enum Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypedefImpl <em>Typedef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypedefImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedef()
   * @generated
   */
  int TYPEDEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__PRIVATE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__EXTENDS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__MEMBERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Typedef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassOrInterfaceReferenceImpl <em>Class Or Interface Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassOrInterfaceReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassOrInterfaceReference()
   * @generated
   */
  int CLASS_OR_INTERFACE_REFERENCE = 12;

  /**
   * The number of structural features of the '<em>Class Or Interface Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__TYPE = CLASS_OR_INTERFACE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__ARGUMENTS = CLASS_OR_INTERFACE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = CLASS_OR_INTERFACE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FeatureImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.VariableDeclarationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__EXPRESSION = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl <em>Variable Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableMemberDeclaration()
   * @generated
   */
  int VARIABLE_MEMBER_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__NAME = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__MODIFIED = CLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__GETTER = CLASS_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__SETTER = CLASS_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__TYPE = CLASS_MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION__EXPRESSION = CLASS_MEMBER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Variable Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MEMBER_DECLARATION_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl <em>Function Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFunctionMemberDeclaration()
   * @generated
   */
  int FUNCTION_MEMBER_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION__NAME = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION__MODIFIED = CLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION__PARAMETERS = CLASS_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION__RETURN_TYPE = CLASS_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION__BODY = CLASS_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MEMBER_DECLARATION_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ConstructorImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 16;

  /**
   * The feature id for the '<em><b>Modified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__MODIFIED = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__BODY = 2;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FormalParameterImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFormalParameter()
   * @generated
   */
  int FORMAL_PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__OPTIONAL = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__TYPE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formal Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ModifierImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 19;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__FINAL = 1;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__DYNAMIC = 2;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__OVERRIDE = 3;

  /**
   * The feature id for the '<em><b>Inline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__INLINE = 4;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__VISIBILITY = 5;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeParametersImpl <em>Type Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeParametersImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeParameters()
   * @generated
   */
  int TYPE_PARAMETERS = 20;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Type Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeParameterImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeParameter()
   * @generated
   */
  int TYPE_PARAMETER = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER__CONSTRAINTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 22;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.CatchClauseImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCatchClause()
   * @generated
   */
  int CATCH_CLAUSE = 23;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSE__DECLARED_PARAM = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Catch Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.CasePartImpl <em>Case Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.CasePartImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCasePart()
   * @generated
   */
  int CASE_PART = 24;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART__CASES = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART__THEN = 1;

  /**
   * The number of structural features of the '<em>Case Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ObjectElementImpl <em>Object Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ObjectElementImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getObjectElement()
   * @generated
   */
  int OBJECT_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ELEMENT__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ELEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Object Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.AssignmentImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 26;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assignable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ASSIGNABLE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.OperationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.UnaryOperationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUnaryOperation()
   * @generated
   */
  int UNARY_OPERATION = 28;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.PreIncrementOperationImpl <em>Pre Increment Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.PreIncrementOperationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPreIncrementOperation()
   * @generated
   */
  int PRE_INCREMENT_OPERATION = 29;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INCREMENT_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INCREMENT_OPERATION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pre Increment Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INCREMENT_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.PostIncrementOperationImpl <em>Post Increment Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.PostIncrementOperationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPostIncrementOperation()
   * @generated
   */
  int POST_INCREMENT_OPERATION = 30;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_INCREMENT_OPERATION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_INCREMENT_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Post Increment Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_INCREMENT_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ArrayAssignmentImpl <em>Array Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ArrayAssignmentImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayAssignment()
   * @generated
   */
  int ARRAY_ASSIGNMENT = 31;

  /**
   * The feature id for the '<em><b>Assigname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ASSIGNMENT__ASSIGNAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ASSIGNMENT__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ASSIGNMENT__VALUE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Array Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.MemberFeatureCallImpl <em>Member Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.MemberFeatureCallImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMemberFeatureCall()
   * @generated
   */
  int MEMBER_FEATURE_CALL = 32;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_CALL__TARGET = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_CALL__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Member Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ArrayAccessImpl <em>Array Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ArrayAccessImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayAccess()
   * @generated
   */
  int ARRAY_ACCESS = 33;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__TARGET = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__EXPLICIT_OPERATION_CALL = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Array Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.BlockExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBlockExpression()
   * @generated
   */
  int BLOCK_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_EXPRESSION__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.VariableDeclarationsImpl <em>Variable Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.VariableDeclarationsImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableDeclarations()
   * @generated
   */
  int VARIABLE_DECLARATIONS = 35;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATIONS__DECLARATIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATIONS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.IfExpressionImpl <em>If Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.IfExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getIfExpression()
   * @generated
   */
  int IF_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__IF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__THEN = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.WhileExpressionImpl <em>While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.WhileExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getWhileExpression()
   * @generated
   */
  int WHILE_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__PREDICATE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.DoWhileExpressionImpl <em>Do While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.DoWhileExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getDoWhileExpression()
   * @generated
   */
  int DO_WHILE_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_EXPRESSION__PREDICATE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do While Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl <em>For Loop Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getForLoopExpression()
   * @generated
   */
  int FOR_LOOP_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_EXPRESSION__DECLARED_PARAM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_EXPRESSION__FOR_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Loop Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ReturnExpressionImpl <em>Return Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ReturnExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getReturnExpression()
   * @generated
   */
  int RETURN_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.BreakExpressionImpl <em>Break Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.BreakExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBreakExpression()
   * @generated
   */
  int BREAK_EXPRESSION = 41;

  /**
   * The number of structural features of the '<em>Break Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ThrowExpressionImpl <em>Throw Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ThrowExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getThrowExpression()
   * @generated
   */
  int THROW_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Throw Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl <em>Try Catch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTryCatchExpression()
   * @generated
   */
  int TRY_CATCH_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH_EXPRESSION__CATCH_CLAUSES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Try Catch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.SwitchExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getSwitchExpression()
   * @generated
   */
  int SWITCH_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__SWITCH = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__DEFAULT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FunctionExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__RETURN_TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ThisExpressionImpl <em>This Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ThisExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getThisExpression()
   * @generated
   */
  int THIS_EXPRESSION = 46;

  /**
   * The number of structural features of the '<em>This Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.SuperExpressionImpl <em>Super Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.SuperExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getSuperExpression()
   * @generated
   */
  int SUPER_EXPRESSION = 47;

  /**
   * The number of structural features of the '<em>Super Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FeatureCallImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 48;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__EXPLICIT_OPERATION_CALL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ConstructorCallImpl <em>Constructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ConstructorCallImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getConstructorCall()
   * @generated
   */
  int CONSTRUCTOR_CALL = 49;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_CALL__CONSTRUCTOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.BooleanLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 50;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__IS_TRUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.NullLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 51;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.IntLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 52;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FloatLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.StringLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.RegularExpressionLiteralImpl <em>Regular Expression Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.RegularExpressionLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getRegularExpressionLiteral()
   * @generated
   */
  int REGULAR_EXPRESSION_LITERAL = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_EXPRESSION_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Regular Expression Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_EXPRESSION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ArrayLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 56;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ObjectLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getObjectLiteral()
   * @generated
   */
  int OBJECT_LITERAL = 57;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.Visibility
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 58;


  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see ee.xtext.haxe.haxe.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see ee.xtext.haxe.haxe.Package#getImports()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getUsing <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Using</em>'.
   * @see ee.xtext.haxe.haxe.Package#getUsing()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Using();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see ee.xtext.haxe.haxe.Package#getClasses()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see ee.xtext.haxe.haxe.Package#getInterfaces()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see ee.xtext.haxe.haxe.Package#getEnums()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Enums();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getTypedefs <em>Typedefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedefs</em>'.
   * @see ee.xtext.haxe.haxe.Package#getTypedefs()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Typedefs();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see ee.xtext.haxe.haxe.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see ee.xtext.haxe.haxe.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using</em>'.
   * @see ee.xtext.haxe.haxe.Using
   * @generated
   */
  EClass getUsing();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Using#getImportedClass <em>Imported Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Class</em>'.
   * @see ee.xtext.haxe.haxe.Using#getImportedClass()
   * @see #getUsing()
   * @generated
   */
  EAttribute getUsing_ImportedClass();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassOrInterface <em>Class Or Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Or Interface</em>'.
   * @see ee.xtext.haxe.haxe.ClassOrInterface
   * @generated
   */
  EClass getClassOrInterface();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ClassOrInterface#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see ee.xtext.haxe.haxe.ClassOrInterface#isPrivate()
   * @see #getClassOrInterface()
   * @generated
   */
  EAttribute getClassOrInterface_Private();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ClassOrInterface#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see ee.xtext.haxe.haxe.ClassOrInterface#getMembers()
   * @see #getClassOrInterface()
   * @generated
   */
  EReference getClassOrInterface_Members();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see ee.xtext.haxe.haxe.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Class#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Class#getTypeParameters()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Class#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see ee.xtext.haxe.haxe.Class#getExtends()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Class#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see ee.xtext.haxe.haxe.Class#getImplements()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Implements();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Class#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see ee.xtext.haxe.haxe.Class#getConstructor()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Constructor();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member</em>'.
   * @see ee.xtext.haxe.haxe.ClassMember
   * @generated
   */
  EClass getClassMember();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see ee.xtext.haxe.haxe.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Interface#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getImplements()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Implements();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see ee.xtext.haxe.haxe.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Enum#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see ee.xtext.haxe.haxe.Enum#isPrivate()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Private();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Enum#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getTypeParameters()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_TypeParameters();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Enum#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getMembers()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Members();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.EnumConstructor <em>Enum Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Constructor</em>'.
   * @see ee.xtext.haxe.haxe.EnumConstructor
   * @generated
   */
  EClass getEnumConstructor();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.EnumConstructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.EnumConstructor#getName()
   * @see #getEnumConstructor()
   * @generated
   */
  EAttribute getEnumConstructor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.EnumConstructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.EnumConstructor#getParameters()
   * @see #getEnumConstructor()
   * @generated
   */
  EReference getEnumConstructor_Parameters();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Typedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef</em>'.
   * @see ee.xtext.haxe.haxe.Typedef
   * @generated
   */
  EClass getTypedef();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Typedef#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#isPrivate()
   * @see #getTypedef()
   * @generated
   */
  EAttribute getTypedef_Private();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Typedef#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getExtends()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Typedef#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getMembers()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Members();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see ee.xtext.haxe.haxe.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.TypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.TypeReference#getType()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Type();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.TypeReference#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.TypeReference#getArguments()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassOrInterfaceReference <em>Class Or Interface Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Or Interface Reference</em>'.
   * @see ee.xtext.haxe.haxe.ClassOrInterfaceReference
   * @generated
   */
  EClass getClassOrInterfaceReference();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see ee.xtext.haxe.haxe.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.VariableDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.VariableDeclaration#getExpression()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration <em>Variable Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Member Declaration</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration
   * @generated
   */
  EClass getVariableMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getModified <em>Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modified</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration#getModified()
   * @see #getVariableMemberDeclaration()
   * @generated
   */
  EReference getVariableMemberDeclaration_Modified();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Getter</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration#getGetter()
   * @see #getVariableMemberDeclaration()
   * @generated
   */
  EReference getVariableMemberDeclaration_Getter();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Setter</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration#getSetter()
   * @see #getVariableMemberDeclaration()
   * @generated
   */
  EReference getVariableMemberDeclaration_Setter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration#getType()
   * @see #getVariableMemberDeclaration()
   * @generated
   */
  EReference getVariableMemberDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration#getExpression()
   * @see #getVariableMemberDeclaration()
   * @generated
   */
  EReference getVariableMemberDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration <em>Function Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Member Declaration</em>'.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration
   * @generated
   */
  EClass getFunctionMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getModified <em>Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modified</em>'.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration#getModified()
   * @see #getFunctionMemberDeclaration()
   * @generated
   */
  EReference getFunctionMemberDeclaration_Modified();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration#getParameters()
   * @see #getFunctionMemberDeclaration()
   * @generated
   */
  EReference getFunctionMemberDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration#getReturnType()
   * @see #getFunctionMemberDeclaration()
   * @generated
   */
  EReference getFunctionMemberDeclaration_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration#getBody()
   * @see #getFunctionMemberDeclaration()
   * @generated
   */
  EReference getFunctionMemberDeclaration_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see ee.xtext.haxe.haxe.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Constructor#getModified <em>Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modified</em>'.
   * @see ee.xtext.haxe.haxe.Constructor#getModified()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Modified();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Constructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Constructor#getParameters()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Constructor#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.Constructor#getBody()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter</em>'.
   * @see ee.xtext.haxe.haxe.FormalParameter
   * @generated
   */
  EClass getFormalParameter();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.FormalParameter#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see ee.xtext.haxe.haxe.FormalParameter#isOptional()
   * @see #getFormalParameter()
   * @generated
   */
  EAttribute getFormalParameter_Optional();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FormalParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.FormalParameter#getType()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FormalParameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see ee.xtext.haxe.haxe.FormalParameter#getDefaultValue()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_DefaultValue();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see ee.xtext.haxe.haxe.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#isStatic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#isFinal()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Final();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#isDynamic <em>Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#isDynamic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Dynamic();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#isOverride()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Override();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#isInline <em>Inline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inline</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#isInline()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Inline();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Modifier#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Modifier#getVisibility()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Visibility();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.TypeParameters
   * @generated
   */
  EClass getTypeParameters();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.TypeParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.TypeParameters#getParameters()
   * @see #getTypeParameters()
   * @generated
   */
  EReference getTypeParameters_Parameters();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parameter</em>'.
   * @see ee.xtext.haxe.haxe.TypeParameter
   * @generated
   */
  EClass getTypeParameter();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.TypeParameter#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see ee.xtext.haxe.haxe.TypeParameter#getConstraints()
   * @see #getTypeParameter()
   * @generated
   */
  EReference getTypeParameter_Constraints();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.CatchClause <em>Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Catch Clause</em>'.
   * @see ee.xtext.haxe.haxe.CatchClause
   * @generated
   */
  EClass getCatchClause();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.CatchClause#getDeclaredParam <em>Declared Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declared Param</em>'.
   * @see ee.xtext.haxe.haxe.CatchClause#getDeclaredParam()
   * @see #getCatchClause()
   * @generated
   */
  EReference getCatchClause_DeclaredParam();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.CatchClause#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.CatchClause#getExpression()
   * @see #getCatchClause()
   * @generated
   */
  EReference getCatchClause_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.CasePart <em>Case Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Part</em>'.
   * @see ee.xtext.haxe.haxe.CasePart
   * @generated
   */
  EClass getCasePart();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.CasePart#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see ee.xtext.haxe.haxe.CasePart#getCases()
   * @see #getCasePart()
   * @generated
   */
  EReference getCasePart_Cases();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.CasePart#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see ee.xtext.haxe.haxe.CasePart#getThen()
   * @see #getCasePart()
   * @generated
   */
  EReference getCasePart_Then();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ObjectElement <em>Object Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Element</em>'.
   * @see ee.xtext.haxe.haxe.ObjectElement
   * @generated
   */
  EClass getObjectElement();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ObjectElement#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see ee.xtext.haxe.haxe.ObjectElement#getKey()
   * @see #getObjectElement()
   * @generated
   */
  EAttribute getObjectElement_Key();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ObjectElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.ObjectElement#getValue()
   * @see #getObjectElement()
   * @generated
   */
  EReference getObjectElement_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see ee.xtext.haxe.haxe.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.Assignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.Assignment#getFeature()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Assignment#getAssignable <em>Assignable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignable</em>'.
   * @see ee.xtext.haxe.haxe.Assignment#getAssignable()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Assignable();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see ee.xtext.haxe.haxe.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see ee.xtext.haxe.haxe.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Operation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.Operation#getFeature()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see ee.xtext.haxe.haxe.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operation</em>'.
   * @see ee.xtext.haxe.haxe.UnaryOperation
   * @generated
   */
  EClass getUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.UnaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.UnaryOperation#getFeature()
   * @see #getUnaryOperation()
   * @generated
   */
  EAttribute getUnaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.UnaryOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see ee.xtext.haxe.haxe.UnaryOperation#getOperand()
   * @see #getUnaryOperation()
   * @generated
   */
  EReference getUnaryOperation_Operand();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.PreIncrementOperation <em>Pre Increment Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Increment Operation</em>'.
   * @see ee.xtext.haxe.haxe.PreIncrementOperation
   * @generated
   */
  EClass getPreIncrementOperation();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.PreIncrementOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.PreIncrementOperation#getFeature()
   * @see #getPreIncrementOperation()
   * @generated
   */
  EAttribute getPreIncrementOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.PreIncrementOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see ee.xtext.haxe.haxe.PreIncrementOperation#getOperand()
   * @see #getPreIncrementOperation()
   * @generated
   */
  EReference getPreIncrementOperation_Operand();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.PostIncrementOperation <em>Post Increment Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Increment Operation</em>'.
   * @see ee.xtext.haxe.haxe.PostIncrementOperation
   * @generated
   */
  EClass getPostIncrementOperation();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.PostIncrementOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see ee.xtext.haxe.haxe.PostIncrementOperation#getOperand()
   * @see #getPostIncrementOperation()
   * @generated
   */
  EReference getPostIncrementOperation_Operand();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.PostIncrementOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.PostIncrementOperation#getFeature()
   * @see #getPostIncrementOperation()
   * @generated
   */
  EAttribute getPostIncrementOperation_Feature();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ArrayAssignment <em>Array Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Assignment</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAssignment
   * @generated
   */
  EClass getArrayAssignment();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ArrayAssignment#getAssigname <em>Assigname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigname</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAssignment#getAssigname()
   * @see #getArrayAssignment()
   * @generated
   */
  EReference getArrayAssignment_Assigname();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ArrayAssignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAssignment#getFeature()
   * @see #getArrayAssignment()
   * @generated
   */
  EReference getArrayAssignment_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ArrayAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAssignment#getValue()
   * @see #getArrayAssignment()
   * @generated
   */
  EReference getArrayAssignment_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.MemberFeatureCall <em>Member Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Feature Call</em>'.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall
   * @generated
   */
  EClass getMemberFeatureCall();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.MemberFeatureCall#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall#getTarget()
   * @see #getMemberFeatureCall()
   * @generated
   */
  EReference getMemberFeatureCall_Target();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.MemberFeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall#getFeature()
   * @see #getMemberFeatureCall()
   * @generated
   */
  EReference getMemberFeatureCall_Feature();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.MemberFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall#isExplicitOperationCall()
   * @see #getMemberFeatureCall()
   * @generated
   */
  EAttribute getMemberFeatureCall_ExplicitOperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.MemberFeatureCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall#getArguments()
   * @see #getMemberFeatureCall()
   * @generated
   */
  EReference getMemberFeatureCall_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Access</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAccess
   * @generated
   */
  EClass getArrayAccess();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ArrayAccess#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAccess#getTarget()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Target();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ArrayAccess#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAccess#getFeature()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Feature();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ArrayAccess#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAccess#isExplicitOperationCall()
   * @see #getArrayAccess()
   * @generated
   */
  EAttribute getArrayAccess_ExplicitOperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ArrayAccess#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.ArrayAccess#getArguments()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.BlockExpression <em>Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Expression</em>'.
   * @see ee.xtext.haxe.haxe.BlockExpression
   * @generated
   */
  EClass getBlockExpression();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.BlockExpression#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see ee.xtext.haxe.haxe.BlockExpression#getExpressions()
   * @see #getBlockExpression()
   * @generated
   */
  EReference getBlockExpression_Expressions();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.VariableDeclarations <em>Variable Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declarations</em>'.
   * @see ee.xtext.haxe.haxe.VariableDeclarations
   * @generated
   */
  EClass getVariableDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.VariableDeclarations#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see ee.xtext.haxe.haxe.VariableDeclarations#getDeclarations()
   * @see #getVariableDeclarations()
   * @generated
   */
  EReference getVariableDeclarations_Declarations();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Expression</em>'.
   * @see ee.xtext.haxe.haxe.IfExpression
   * @generated
   */
  EClass getIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.IfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see ee.xtext.haxe.haxe.IfExpression#getIf()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.IfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see ee.xtext.haxe.haxe.IfExpression#getThen()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.IfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see ee.xtext.haxe.haxe.IfExpression#getElse()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Else();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.WhileExpression <em>While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Expression</em>'.
   * @see ee.xtext.haxe.haxe.WhileExpression
   * @generated
   */
  EClass getWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.WhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see ee.xtext.haxe.haxe.WhileExpression#getPredicate()
   * @see #getWhileExpression()
   * @generated
   */
  EReference getWhileExpression_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.WhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.WhileExpression#getBody()
   * @see #getWhileExpression()
   * @generated
   */
  EReference getWhileExpression_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.DoWhileExpression <em>Do While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do While Expression</em>'.
   * @see ee.xtext.haxe.haxe.DoWhileExpression
   * @generated
   */
  EClass getDoWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.DoWhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.DoWhileExpression#getBody()
   * @see #getDoWhileExpression()
   * @generated
   */
  EReference getDoWhileExpression_Body();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.DoWhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see ee.xtext.haxe.haxe.DoWhileExpression#getPredicate()
   * @see #getDoWhileExpression()
   * @generated
   */
  EReference getDoWhileExpression_Predicate();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ForLoopExpression <em>For Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop Expression</em>'.
   * @see ee.xtext.haxe.haxe.ForLoopExpression
   * @generated
   */
  EClass getForLoopExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ForLoopExpression#getDeclaredParam <em>Declared Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declared Param</em>'.
   * @see ee.xtext.haxe.haxe.ForLoopExpression#getDeclaredParam()
   * @see #getForLoopExpression()
   * @generated
   */
  EReference getForLoopExpression_DeclaredParam();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ForLoopExpression#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see ee.xtext.haxe.haxe.ForLoopExpression#getForExpression()
   * @see #getForLoopExpression()
   * @generated
   */
  EReference getForLoopExpression_ForExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ForLoopExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.ForLoopExpression#getBody()
   * @see #getForLoopExpression()
   * @generated
   */
  EReference getForLoopExpression_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ReturnExpression <em>Return Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Expression</em>'.
   * @see ee.xtext.haxe.haxe.ReturnExpression
   * @generated
   */
  EClass getReturnExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ReturnExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.ReturnExpression#getExpression()
   * @see #getReturnExpression()
   * @generated
   */
  EReference getReturnExpression_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.BreakExpression <em>Break Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Expression</em>'.
   * @see ee.xtext.haxe.haxe.BreakExpression
   * @generated
   */
  EClass getBreakExpression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ThrowExpression <em>Throw Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw Expression</em>'.
   * @see ee.xtext.haxe.haxe.ThrowExpression
   * @generated
   */
  EClass getThrowExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ThrowExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.ThrowExpression#getExpression()
   * @see #getThrowExpression()
   * @generated
   */
  EReference getThrowExpression_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TryCatchExpression <em>Try Catch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Catch Expression</em>'.
   * @see ee.xtext.haxe.haxe.TryCatchExpression
   * @generated
   */
  EClass getTryCatchExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TryCatchExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.TryCatchExpression#getExpression()
   * @see #getTryCatchExpression()
   * @generated
   */
  EReference getTryCatchExpression_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.TryCatchExpression#getCatchClauses <em>Catch Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch Clauses</em>'.
   * @see ee.xtext.haxe.haxe.TryCatchExpression#getCatchClauses()
   * @see #getTryCatchExpression()
   * @generated
   */
  EReference getTryCatchExpression_CatchClauses();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.SwitchExpression <em>Switch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Expression</em>'.
   * @see ee.xtext.haxe.haxe.SwitchExpression
   * @generated
   */
  EClass getSwitchExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.SwitchExpression#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see ee.xtext.haxe.haxe.SwitchExpression#getSwitch()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.SwitchExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see ee.xtext.haxe.haxe.SwitchExpression#getCases()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.SwitchExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see ee.xtext.haxe.haxe.SwitchExpression#getDefault()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Default();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Expression</em>'.
   * @see ee.xtext.haxe.haxe.FunctionExpression
   * @generated
   */
  EClass getFunctionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.FunctionExpression#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.FunctionExpression#getParameters()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FunctionExpression#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.FunctionExpression#getReturnType()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.FunctionExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.FunctionExpression#getBody()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Expression</em>'.
   * @see ee.xtext.haxe.haxe.ThisExpression
   * @generated
   */
  EClass getThisExpression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.SuperExpression <em>Super Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Expression</em>'.
   * @see ee.xtext.haxe.haxe.SuperExpression
   * @generated
   */
  EClass getSuperExpression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Call</em>'.
   * @see ee.xtext.haxe.haxe.FeatureCall
   * @generated
   */
  EClass getFeatureCall();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.FeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see ee.xtext.haxe.haxe.FeatureCall#getFeature()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Feature();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.FeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
   * @see ee.xtext.haxe.haxe.FeatureCall#isExplicitOperationCall()
   * @see #getFeatureCall()
   * @generated
   */
  EAttribute getFeatureCall_ExplicitOperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.FeatureCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.FeatureCall#getArguments()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ConstructorCall <em>Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Call</em>'.
   * @see ee.xtext.haxe.haxe.ConstructorCall
   * @generated
   */
  EClass getConstructorCall();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ConstructorCall#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see ee.xtext.haxe.haxe.ConstructorCall#getConstructor()
   * @see #getConstructorCall()
   * @generated
   */
  EReference getConstructorCall_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ConstructorCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.ConstructorCall#getArguments()
   * @see #getConstructorCall()
   * @generated
   */
  EReference getConstructorCall_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see ee.xtext.haxe.haxe.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.BooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see ee.xtext.haxe.haxe.BooleanLiteral#isIsTrue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see ee.xtext.haxe.haxe.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see ee.xtext.haxe.haxe.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see ee.xtext.haxe.haxe.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see ee.xtext.haxe.haxe.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.RegularExpressionLiteral <em>Regular Expression Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Expression Literal</em>'.
   * @see ee.xtext.haxe.haxe.RegularExpressionLiteral
   * @generated
   */
  EClass getRegularExpressionLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.RegularExpressionLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.RegularExpressionLiteral#getValue()
   * @see #getRegularExpressionLiteral()
   * @generated
   */
  EAttribute getRegularExpressionLiteral_Value();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Literal</em>'.
   * @see ee.xtext.haxe.haxe.ArrayLiteral
   * @generated
   */
  EClass getArrayLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ArrayLiteral#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see ee.xtext.haxe.haxe.ArrayLiteral#getElements()
   * @see #getArrayLiteral()
   * @generated
   */
  EReference getArrayLiteral_Elements();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ObjectLiteral <em>Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Literal</em>'.
   * @see ee.xtext.haxe.haxe.ObjectLiteral
   * @generated
   */
  EClass getObjectLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ObjectLiteral#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see ee.xtext.haxe.haxe.ObjectLiteral#getElements()
   * @see #getObjectLiteral()
   * @generated
   */
  EReference getObjectLiteral_Elements();

  /**
   * Returns the meta object for enum '{@link ee.xtext.haxe.haxe.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HaxeFactory getHaxeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.PackageImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__IMPORTS = eINSTANCE.getPackage_Imports();

    /**
     * The meta object literal for the '<em><b>Using</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__USING = eINSTANCE.getPackage_Using();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__INTERFACES = eINSTANCE.getPackage_Interfaces();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENUMS = eINSTANCE.getPackage_Enums();

    /**
     * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__TYPEDEFS = eINSTANCE.getPackage_Typedefs();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ImportImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.UsingImpl <em>Using</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.UsingImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUsing()
     * @generated
     */
    EClass USING = eINSTANCE.getUsing();

    /**
     * The meta object literal for the '<em><b>Imported Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING__IMPORTED_CLASS = eINSTANCE.getUsing_ImportedClass();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypeImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassOrInterfaceImpl <em>Class Or Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassOrInterfaceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassOrInterface()
     * @generated
     */
    EClass CLASS_OR_INTERFACE = eINSTANCE.getClassOrInterface();

    /**
     * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OR_INTERFACE__PRIVATE = eINSTANCE.getClassOrInterface_Private();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OR_INTERFACE__MEMBERS = eINSTANCE.getClassOrInterface_Members();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__TYPE_PARAMETERS = eINSTANCE.getClass_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__CONSTRUCTOR = eINSTANCE.getClass_Constructor();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassMemberImpl <em>Class Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassMemberImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassMember()
     * @generated
     */
    EClass CLASS_MEMBER = eINSTANCE.getClassMember();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.InterfaceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__IMPLEMENTS = eINSTANCE.getInterface_Implements();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.EnumImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__PRIVATE = eINSTANCE.getEnum_Private();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__TYPE_PARAMETERS = eINSTANCE.getEnum_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__MEMBERS = eINSTANCE.getEnum_Members();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.EnumConstructorImpl <em>Enum Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.EnumConstructorImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnumConstructor()
     * @generated
     */
    EClass ENUM_CONSTRUCTOR = eINSTANCE.getEnumConstructor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_CONSTRUCTOR__NAME = eINSTANCE.getEnumConstructor_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONSTRUCTOR__PARAMETERS = eINSTANCE.getEnumConstructor_Parameters();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypedefImpl <em>Typedef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypedefImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedef()
     * @generated
     */
    EClass TYPEDEF = eINSTANCE.getTypedef();

    /**
     * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF__PRIVATE = eINSTANCE.getTypedef_Private();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__EXTENDS = eINSTANCE.getTypedef_Extends();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__MEMBERS = eINSTANCE.getTypedef_Members();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypeReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__TYPE = eINSTANCE.getTypeReference_Type();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__ARGUMENTS = eINSTANCE.getTypeReference_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassOrInterfaceReferenceImpl <em>Class Or Interface Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassOrInterfaceReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassOrInterfaceReference()
     * @generated
     */
    EClass CLASS_OR_INTERFACE_REFERENCE = eINSTANCE.getClassOrInterfaceReference();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.VariableDeclarationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__EXPRESSION = eINSTANCE.getVariableDeclaration_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl <em>Variable Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.VariableMemberDeclarationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableMemberDeclaration()
     * @generated
     */
    EClass VARIABLE_MEMBER_DECLARATION = eINSTANCE.getVariableMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_MEMBER_DECLARATION__MODIFIED = eINSTANCE.getVariableMemberDeclaration_Modified();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_MEMBER_DECLARATION__GETTER = eINSTANCE.getVariableMemberDeclaration_Getter();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_MEMBER_DECLARATION__SETTER = eINSTANCE.getVariableMemberDeclaration_Setter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_MEMBER_DECLARATION__TYPE = eINSTANCE.getVariableMemberDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_MEMBER_DECLARATION__EXPRESSION = eINSTANCE.getVariableMemberDeclaration_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl <em>Function Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FunctionMemberDeclarationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFunctionMemberDeclaration()
     * @generated
     */
    EClass FUNCTION_MEMBER_DECLARATION = eINSTANCE.getFunctionMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MEMBER_DECLARATION__MODIFIED = eINSTANCE.getFunctionMemberDeclaration_Modified();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MEMBER_DECLARATION__PARAMETERS = eINSTANCE.getFunctionMemberDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MEMBER_DECLARATION__RETURN_TYPE = eINSTANCE.getFunctionMemberDeclaration_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MEMBER_DECLARATION__BODY = eINSTANCE.getFunctionMemberDeclaration_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ConstructorImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__MODIFIED = eINSTANCE.getConstructor_Modified();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FeatureImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FormalParameterImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFormalParameter()
     * @generated
     */
    EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAL_PARAMETER__OPTIONAL = eINSTANCE.getFormalParameter_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER__TYPE = eINSTANCE.getFormalParameter_Type();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER__DEFAULT_VALUE = eINSTANCE.getFormalParameter_DefaultValue();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ModifierImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__FINAL = eINSTANCE.getModifier_Final();

    /**
     * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__DYNAMIC = eINSTANCE.getModifier_Dynamic();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__OVERRIDE = eINSTANCE.getModifier_Override();

    /**
     * The meta object literal for the '<em><b>Inline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__INLINE = eINSTANCE.getModifier_Inline();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__VISIBILITY = eINSTANCE.getModifier_Visibility();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypeParametersImpl <em>Type Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypeParametersImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeParameters()
     * @generated
     */
    EClass TYPE_PARAMETERS = eINSTANCE.getTypeParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PARAMETERS__PARAMETERS = eINSTANCE.getTypeParameters_Parameters();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypeParameterImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeParameter()
     * @generated
     */
    EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PARAMETER__CONSTRAINTS = eINSTANCE.getTypeParameter_Constraints();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.CatchClauseImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCatchClause()
     * @generated
     */
    EClass CATCH_CLAUSE = eINSTANCE.getCatchClause();

    /**
     * The meta object literal for the '<em><b>Declared Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_CLAUSE__DECLARED_PARAM = eINSTANCE.getCatchClause_DeclaredParam();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_CLAUSE__EXPRESSION = eINSTANCE.getCatchClause_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.CasePartImpl <em>Case Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.CasePartImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCasePart()
     * @generated
     */
    EClass CASE_PART = eINSTANCE.getCasePart();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_PART__CASES = eINSTANCE.getCasePart_Cases();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_PART__THEN = eINSTANCE.getCasePart_Then();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ObjectElementImpl <em>Object Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ObjectElementImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getObjectElement()
     * @generated
     */
    EClass OBJECT_ELEMENT = eINSTANCE.getObjectElement();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_ELEMENT__KEY = eINSTANCE.getObjectElement_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ELEMENT__VALUE = eINSTANCE.getObjectElement_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.AssignmentImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '<em><b>Assignable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__ASSIGNABLE = eINSTANCE.getAssignment_Assignable();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.OperationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__FEATURE = eINSTANCE.getOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.UnaryOperationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUnaryOperation()
     * @generated
     */
    EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OPERATION__FEATURE = eINSTANCE.getUnaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATION__OPERAND = eINSTANCE.getUnaryOperation_Operand();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.PreIncrementOperationImpl <em>Pre Increment Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.PreIncrementOperationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPreIncrementOperation()
     * @generated
     */
    EClass PRE_INCREMENT_OPERATION = eINSTANCE.getPreIncrementOperation();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_INCREMENT_OPERATION__FEATURE = eINSTANCE.getPreIncrementOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_INCREMENT_OPERATION__OPERAND = eINSTANCE.getPreIncrementOperation_Operand();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.PostIncrementOperationImpl <em>Post Increment Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.PostIncrementOperationImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPostIncrementOperation()
     * @generated
     */
    EClass POST_INCREMENT_OPERATION = eINSTANCE.getPostIncrementOperation();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_INCREMENT_OPERATION__OPERAND = eINSTANCE.getPostIncrementOperation_Operand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_INCREMENT_OPERATION__FEATURE = eINSTANCE.getPostIncrementOperation_Feature();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ArrayAssignmentImpl <em>Array Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ArrayAssignmentImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayAssignment()
     * @generated
     */
    EClass ARRAY_ASSIGNMENT = eINSTANCE.getArrayAssignment();

    /**
     * The meta object literal for the '<em><b>Assigname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ASSIGNMENT__ASSIGNAME = eINSTANCE.getArrayAssignment_Assigname();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ASSIGNMENT__FEATURE = eINSTANCE.getArrayAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ASSIGNMENT__VALUE = eINSTANCE.getArrayAssignment_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.MemberFeatureCallImpl <em>Member Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.MemberFeatureCallImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMemberFeatureCall()
     * @generated
     */
    EClass MEMBER_FEATURE_CALL = eINSTANCE.getMemberFeatureCall();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_FEATURE_CALL__TARGET = eINSTANCE.getMemberFeatureCall_Target();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_FEATURE_CALL__FEATURE = eINSTANCE.getMemberFeatureCall_Feature();

    /**
     * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL = eINSTANCE.getMemberFeatureCall_ExplicitOperationCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_FEATURE_CALL__ARGUMENTS = eINSTANCE.getMemberFeatureCall_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ArrayAccessImpl <em>Array Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ArrayAccessImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayAccess()
     * @generated
     */
    EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__TARGET = eINSTANCE.getArrayAccess_Target();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__FEATURE = eINSTANCE.getArrayAccess_Feature();

    /**
     * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ACCESS__EXPLICIT_OPERATION_CALL = eINSTANCE.getArrayAccess_ExplicitOperationCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__ARGUMENTS = eINSTANCE.getArrayAccess_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.BlockExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBlockExpression()
     * @generated
     */
    EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_EXPRESSION__EXPRESSIONS = eINSTANCE.getBlockExpression_Expressions();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.VariableDeclarationsImpl <em>Variable Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.VariableDeclarationsImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableDeclarations()
     * @generated
     */
    EClass VARIABLE_DECLARATIONS = eINSTANCE.getVariableDeclarations();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATIONS__DECLARATIONS = eINSTANCE.getVariableDeclarations_Declarations();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.IfExpressionImpl <em>If Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.IfExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getIfExpression()
     * @generated
     */
    EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__IF = eINSTANCE.getIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__THEN = eINSTANCE.getIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__ELSE = eINSTANCE.getIfExpression_Else();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.WhileExpressionImpl <em>While Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.WhileExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getWhileExpression()
     * @generated
     */
    EClass WHILE_EXPRESSION = eINSTANCE.getWhileExpression();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__PREDICATE = eINSTANCE.getWhileExpression_Predicate();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__BODY = eINSTANCE.getWhileExpression_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.DoWhileExpressionImpl <em>Do While Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.DoWhileExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getDoWhileExpression()
     * @generated
     */
    EClass DO_WHILE_EXPRESSION = eINSTANCE.getDoWhileExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE_EXPRESSION__BODY = eINSTANCE.getDoWhileExpression_Body();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE_EXPRESSION__PREDICATE = eINSTANCE.getDoWhileExpression_Predicate();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl <em>For Loop Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ForLoopExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getForLoopExpression()
     * @generated
     */
    EClass FOR_LOOP_EXPRESSION = eINSTANCE.getForLoopExpression();

    /**
     * The meta object literal for the '<em><b>Declared Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_EXPRESSION__DECLARED_PARAM = eINSTANCE.getForLoopExpression_DeclaredParam();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getForLoopExpression_ForExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP_EXPRESSION__BODY = eINSTANCE.getForLoopExpression_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ReturnExpressionImpl <em>Return Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ReturnExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getReturnExpression()
     * @generated
     */
    EClass RETURN_EXPRESSION = eINSTANCE.getReturnExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_EXPRESSION__EXPRESSION = eINSTANCE.getReturnExpression_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.BreakExpressionImpl <em>Break Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.BreakExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBreakExpression()
     * @generated
     */
    EClass BREAK_EXPRESSION = eINSTANCE.getBreakExpression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ThrowExpressionImpl <em>Throw Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ThrowExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getThrowExpression()
     * @generated
     */
    EClass THROW_EXPRESSION = eINSTANCE.getThrowExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROW_EXPRESSION__EXPRESSION = eINSTANCE.getThrowExpression_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl <em>Try Catch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTryCatchExpression()
     * @generated
     */
    EClass TRY_CATCH_EXPRESSION = eINSTANCE.getTryCatchExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH_EXPRESSION__EXPRESSION = eINSTANCE.getTryCatchExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH_EXPRESSION__CATCH_CLAUSES = eINSTANCE.getTryCatchExpression_CatchClauses();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.SwitchExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getSwitchExpression()
     * @generated
     */
    EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__SWITCH = eINSTANCE.getSwitchExpression_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__DEFAULT = eINSTANCE.getSwitchExpression_Default();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FunctionExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFunctionExpression()
     * @generated
     */
    EClass FUNCTION_EXPRESSION = eINSTANCE.getFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__PARAMETERS = eINSTANCE.getFunctionExpression_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__RETURN_TYPE = eINSTANCE.getFunctionExpression_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__BODY = eINSTANCE.getFunctionExpression_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ThisExpressionImpl <em>This Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ThisExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getThisExpression()
     * @generated
     */
    EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.SuperExpressionImpl <em>Super Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.SuperExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getSuperExpression()
     * @generated
     */
    EClass SUPER_EXPRESSION = eINSTANCE.getSuperExpression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FeatureCallImpl <em>Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FeatureCallImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeatureCall()
     * @generated
     */
    EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__FEATURE = eINSTANCE.getFeatureCall_Feature();

    /**
     * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_CALL__EXPLICIT_OPERATION_CALL = eINSTANCE.getFeatureCall_ExplicitOperationCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__ARGUMENTS = eINSTANCE.getFeatureCall_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ConstructorCallImpl <em>Constructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ConstructorCallImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getConstructorCall()
     * @generated
     */
    EClass CONSTRUCTOR_CALL = eINSTANCE.getConstructorCall();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getConstructorCall_Constructor();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getConstructorCall_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.BooleanLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.NullLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.IntLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.FloatLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.StringLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.RegularExpressionLiteralImpl <em>Regular Expression Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.RegularExpressionLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getRegularExpressionLiteral()
     * @generated
     */
    EClass REGULAR_EXPRESSION_LITERAL = eINSTANCE.getRegularExpressionLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_EXPRESSION_LITERAL__VALUE = eINSTANCE.getRegularExpressionLiteral_Value();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ArrayLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getArrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__ELEMENTS = eINSTANCE.getArrayLiteral_Elements();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ObjectLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getObjectLiteral()
     * @generated
     */
    EClass OBJECT_LITERAL = eINSTANCE.getObjectLiteral();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_LITERAL__ELEMENTS = eINSTANCE.getObjectLiteral_Elements();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.Visibility
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

  }

} //HaxePackage
