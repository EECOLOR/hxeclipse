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
   * The feature id for the '<em><b>Typedefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TYPEDEFS = 5;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENUMS = 6;

  /**
   * The feature id for the '<em><b>Extern Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__EXTERN_CLASSES = 7;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 8;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FeatureImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 30;

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
  int TYPE__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClass_()
   * @generated
   */
  int CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__METADATA = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__VISIBILITY = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EXTENDS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IMPLEMENTS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CONSTRUCTOR = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__METHODS = TYPE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.InterfaceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__METADATA = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__EXTERN = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__VISIBILITY = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__IMPLEMENTS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__PROPERTIES = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__METHODS = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypedefImpl <em>Typedef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypedefImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedef()
   * @generated
   */
  int TYPEDEF = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__METADATA = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__VISIBILITY = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__EXTENDS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__PROPERTIES = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__METHODS = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__TYPE = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Typedef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.EnumImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnum()
   * @generated
   */
  int ENUM = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__METADATA = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__EXTERN = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__VISIBILITY = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CONSTRUCTORS = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ExternClassImpl <em>Extern Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ExternClassImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClass()
   * @generated
   */
  int EXTERN_CLASS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__METADATA = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__VISIBILITY = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__TYPE_PARAMETERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__EXTENDS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__IMPLEMENTS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__CONSTRUCTOR = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS__METHODS = TYPE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Extern Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeParametersImpl <em>Type Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeParametersImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeParameters()
   * @generated
   */
  int TYPE_PARAMETERS = 9;

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
  int TYPE_PARAMETER = 10;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypeReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 11;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 12;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypedefTypePropertyImpl <em>Typedef Type Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypedefTypePropertyImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefTypeProperty()
   * @generated
   */
  int TYPEDEF_TYPE_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_TYPE_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_TYPE_PROPERTY__TYPE = 1;

  /**
   * The number of structural features of the '<em>Typedef Type Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_TYPE_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.MetadataImpl <em>Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.MetadataImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMetadata()
   * @generated
   */
  int METADATA = 14;

  /**
   * The feature id for the '<em><b>Compiler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__COMPILER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__NAME = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__BODY = 2;

  /**
   * The number of structural features of the '<em>Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.MethodModifierImpl <em>Method Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.MethodModifierImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethodModifier()
   * @generated
   */
  int METHOD_MODIFIER = 16;

  /**
   * The number of structural features of the '<em>Method Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_MODIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.PropertyModifierImpl <em>Property Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.PropertyModifierImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPropertyModifier()
   * @generated
   */
  int PROPERTY_MODIFIER = 17;

  /**
   * The number of structural features of the '<em>Property Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MODIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ParameterImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OPTIONAL = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassConstructorImpl <em>Class Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassConstructorImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassConstructor()
   * @generated
   */
  int CLASS_CONSTRUCTOR = 19;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR__METADATA = 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR__VISIBILITY = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR__RETURN_TYPE = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR__BODY = 4;

  /**
   * The number of structural features of the '<em>Class Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTRUCTOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassPropertyImpl <em>Class Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassPropertyImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassProperty()
   * @generated
   */
  int CLASS_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__MODIFIER = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__GETTER = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__SETTER = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY__EXPRESSION = FEATURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Class Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.MethodImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethod()
   * @generated
   */
  int METHOD = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MODIFIER = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE_PARAMETERS = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Untyped</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__UNTYPED = FEATURE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = FEATURE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__VISIBILITY = FEATURE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.InterfacePropertyImpl <em>Interface Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.InterfacePropertyImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getInterfaceProperty()
   * @generated
   */
  int INTERFACE_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Getter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY__GETTER = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Setter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY__SETTER = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Interface Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl <em>Typedef Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypedefPropertyImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefProperty()
   * @generated
   */
  int TYPEDEF_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__VISIBILITY = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__GETTER = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__SETTER = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Typedef Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.EnumConstructorImpl <em>Enum Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.EnumConstructorImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getEnumConstructor()
   * @generated
   */
  int ENUM_CONSTRUCTOR = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR__PARAMETERS = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTRUCTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl <em>Extern Class Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClassConstructor()
   * @generated
   */
  int EXTERN_CLASS_CONSTRUCTOR = 25;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_CONSTRUCTOR__METADATA = 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_CONSTRUCTOR__VISIBILITY = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_CONSTRUCTOR__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE = 3;

  /**
   * The number of structural features of the '<em>Extern Class Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_CONSTRUCTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ExternClassPropertyImpl <em>Extern Class Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ExternClassPropertyImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClassProperty()
   * @generated
   */
  int EXTERN_CLASS_PROPERTY = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__METADATA = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__MODIFIER = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Getter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__GETTER = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__SETTER = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY__EXPRESSION = FEATURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Extern Class Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_CLASS_PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.GetterSetterImpl <em>Getter Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.GetterSetterImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getGetterSetter()
   * @generated
   */
  int GETTER_SETTER = 27;

  /**
   * The number of structural features of the '<em>Getter Setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETTER_SETTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ClassMethodReferenceImpl <em>Class Method Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ClassMethodReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassMethodReference()
   * @generated
   */
  int CLASS_METHOD_REFERENCE = 28;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD_REFERENCE__REFERENCE = GETTER_SETTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Method Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD_REFERENCE_FEATURE_COUNT = GETTER_SETTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.GetterSetterLiteralImpl <em>Getter Setter Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.GetterSetterLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getGetterSetterLiteral()
   * @generated
   */
  int GETTER_SETTER_LITERAL = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETTER_SETTER_LITERAL__VALUE = GETTER_SETTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Getter Setter Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETTER_SETTER_LITERAL_FEATURE_COUNT = GETTER_SETTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.VariableDeclarationImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 31;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.CatchClauseImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCatchClause()
   * @generated
   */
  int CATCH_CLAUSE = 32;

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
  int CASE_PART = 33;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.CasePartExpressionsImpl <em>Case Part Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.CasePartExpressionsImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCasePartExpressions()
   * @generated
   */
  int CASE_PART_EXPRESSIONS = 34;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART_EXPRESSIONS__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Case Part Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART_EXPRESSIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ObjectElementImpl <em>Object Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ObjectElementImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getObjectElement()
   * @generated
   */
  int OBJECT_ELEMENT = 35;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.MethodSignatureImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethodSignature()
   * @generated
   */
  int METHOD_SIGNATURE = 36;

  /**
   * The feature id for the '<em><b>Argument Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_SIGNATURE__ARGUMENT_TYPES = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_SIGNATURE__RETURN_TYPE = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_SIGNATURE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ParameterizedTypeReferenceImpl <em>Parameterized Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ParameterizedTypeReferenceImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getParameterizedTypeReference()
   * @generated
   */
  int PARAMETERIZED_TYPE_REFERENCE = 37;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_TYPE_REFERENCE__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_TYPE_REFERENCE__ARGUMENTS = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameterized Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_TYPE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TypedefTypeImpl <em>Typedef Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TypedefTypeImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefType()
   * @generated
   */
  int TYPEDEF_TYPE = 38;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_TYPE__PROPERTIES = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typedef Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ModifierImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 39;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__STATIC = METHOD_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__FINAL = METHOD_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__DYNAMIC = METHOD_MODIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__OVERRIDE = METHOD_MODIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Inline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__INLINE = METHOD_MODIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__VISIBILITY = METHOD_MODIFIER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = METHOD_MODIFIER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.CastExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TARGET = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.UntypedExpressionImpl <em>Untyped Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.UntypedExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUntypedExpression()
   * @generated
   */
  int UNTYPED_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTYPED_EXPRESSION__TARGET = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Untyped Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTYPED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.IfExpressionImpl <em>If Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.IfExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getIfExpression()
   * @generated
   */
  int IF_EXPRESSION = 42;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.AssignmentImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 43;

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
  int OPERATION = 44;

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
  int UNARY_OPERATION = 45;

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
  int PRE_INCREMENT_OPERATION = 46;

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
  int POST_INCREMENT_OPERATION = 47;

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
  int ARRAY_ASSIGNMENT = 48;

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
  int MEMBER_FEATURE_CALL = 49;

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
  int ARRAY_ACCESS = 50;

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
  int BLOCK_EXPRESSION = 51;

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
  int VARIABLE_DECLARATIONS = 52;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FunctionExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 53;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.FeatureCallImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 54;

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
  int CONSTRUCTOR_CALL = 55;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.WhileExpressionImpl <em>While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.WhileExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getWhileExpression()
   * @generated
   */
  int WHILE_EXPRESSION = 56;

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
  int DO_WHILE_EXPRESSION = 57;

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
  int FOR_LOOP_EXPRESSION = 58;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl <em>Try Catch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.TryCatchExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTryCatchExpression()
   * @generated
   */
  int TRY_CATCH_EXPRESSION = 59;

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
  int SWITCH_EXPRESSION = 60;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.ReturnExpressionImpl <em>Return Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.ReturnExpressionImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getReturnExpression()
   * @generated
   */
  int RETURN_EXPRESSION = 61;

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
  int BREAK_EXPRESSION = 62;

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
  int THROW_EXPRESSION = 63;

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
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.NullLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 64;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.NumberLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 65;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ee.xtext.haxe.haxe.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ee.xtext.haxe.haxe.impl.StringLiteralImpl
   * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 66;

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
  int REGULAR_EXPRESSION_LITERAL = 67;

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
  int ARRAY_LITERAL = 68;

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
  int OBJECT_LITERAL = 69;

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
  int VISIBILITY = 70;


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
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Package#getExternClasses <em>Extern Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extern Classes</em>'.
   * @see ee.xtext.haxe.haxe.Package#getExternClasses()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_ExternClasses();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see ee.xtext.haxe.haxe.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Class#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Class#getMetadata()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Class#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Class#getVisibility()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Visibility();

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
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Class#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see ee.xtext.haxe.haxe.Class#getProperties()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Class#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see ee.xtext.haxe.haxe.Class#getMethods()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Methods();

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
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Interface#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getMetadata()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Interface#getExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getExtern()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Extern();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Interface#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getVisibility()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Interface#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getTypeParameters()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_TypeParameters();

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
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Interface#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getProperties()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Interface#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see ee.xtext.haxe.haxe.Interface#getMethods()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Methods();

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
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Typedef#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getMetadata()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Typedef#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getVisibility()
   * @see #getTypedef()
   * @generated
   */
  EAttribute getTypedef_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Typedef#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getTypeParameters()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_TypeParameters();

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
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Typedef#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getProperties()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Typedef#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getMethods()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Methods();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Typedef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.Typedef#getType()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Type();

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
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Enum#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getMetadata()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Enum#getExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getExtern()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Extern();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Enum#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getVisibility()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Visibility();

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
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Enum#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see ee.xtext.haxe.haxe.Enum#getConstructors()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Constructors();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ExternClass <em>Extern Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Class</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass
   * @generated
   */
  EClass getExternClass();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClass#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getMetadata()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ExternClass#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getVisibility()
   * @see #getExternClass()
   * @generated
   */
  EAttribute getExternClass_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClass#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getTypeParameters()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClass#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getExtends()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ExternClass#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getImplements()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Implements();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClass#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getConstructor()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ExternClass#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getProperties()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ExternClass#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see ee.xtext.haxe.haxe.ExternClass#getMethods()
   * @see #getExternClass()
   * @generated
   */
  EReference getExternClass_Methods();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see ee.xtext.haxe.haxe.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see ee.xtext.haxe.haxe.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypedefTypeProperty <em>Typedef Type Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Type Property</em>'.
   * @see ee.xtext.haxe.haxe.TypedefTypeProperty
   * @generated
   */
  EClass getTypedefTypeProperty();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.TypedefTypeProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.TypedefTypeProperty#getName()
   * @see #getTypedefTypeProperty()
   * @generated
   */
  EAttribute getTypedefTypeProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TypedefTypeProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.TypedefTypeProperty#getType()
   * @see #getTypedefTypeProperty()
   * @generated
   */
  EReference getTypedefTypeProperty_Type();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Metadata
   * @generated
   */
  EClass getMetadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Metadata#isCompiler <em>Compiler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compiler</em>'.
   * @see ee.xtext.haxe.haxe.Metadata#isCompiler()
   * @see #getMetadata()
   * @generated
   */
  EAttribute getMetadata_Compiler();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Metadata#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ee.xtext.haxe.haxe.Metadata#getName()
   * @see #getMetadata()
   * @generated
   */
  EAttribute getMetadata_Name();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Metadata#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.Metadata#getBody()
   * @see #getMetadata()
   * @generated
   */
  EReference getMetadata_Body();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.MethodModifier <em>Method Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Modifier</em>'.
   * @see ee.xtext.haxe.haxe.MethodModifier
   * @generated
   */
  EClass getMethodModifier();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.PropertyModifier <em>Property Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Modifier</em>'.
   * @see ee.xtext.haxe.haxe.PropertyModifier
   * @generated
   */
  EClass getPropertyModifier();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see ee.xtext.haxe.haxe.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Parameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see ee.xtext.haxe.haxe.Parameter#getDefaultValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Parameter#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see ee.xtext.haxe.haxe.Parameter#isOptional()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Optional();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassConstructor <em>Class Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Constructor</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor
   * @generated
   */
  EClass getClassConstructor();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassConstructor#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor#getMetadata()
   * @see #getClassConstructor()
   * @generated
   */
  EReference getClassConstructor_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ClassConstructor#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor#getVisibility()
   * @see #getClassConstructor()
   * @generated
   */
  EAttribute getClassConstructor_Visibility();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ClassConstructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor#getParameters()
   * @see #getClassConstructor()
   * @generated
   */
  EReference getClassConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassConstructor#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor#getReturnType()
   * @see #getClassConstructor()
   * @generated
   */
  EReference getClassConstructor_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassConstructor#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.ClassConstructor#getBody()
   * @see #getClassConstructor()
   * @generated
   */
  EReference getClassConstructor_Body();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassProperty <em>Class Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Property</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty
   * @generated
   */
  EClass getClassProperty();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getMetadata()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Metadata();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getModifier()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getter</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getGetter()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Getter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Setter</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getSetter()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Setter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getType()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ClassProperty#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.ClassProperty#getExpression()
   * @see #getClassProperty()
   * @generated
   */
  EReference getClassProperty_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see ee.xtext.haxe.haxe.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Method#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.Method#getMetadata()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Metadata();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Method#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see ee.xtext.haxe.haxe.Method#getModifier()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Method#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Method#getTypeParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_TypeParameters();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Method#isUntyped <em>Untyped</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Untyped</em>'.
   * @see ee.xtext.haxe.haxe.Method#isUntyped()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Untyped();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ee.xtext.haxe.haxe.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.Method#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.Method#getVisibility()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Visibility();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.InterfaceProperty <em>Interface Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Property</em>'.
   * @see ee.xtext.haxe.haxe.InterfaceProperty
   * @generated
   */
  EClass getInterfaceProperty();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.InterfaceProperty#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.InterfaceProperty#getMetadata()
   * @see #getInterfaceProperty()
   * @generated
   */
  EReference getInterfaceProperty_Metadata();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.InterfaceProperty#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getter</em>'.
   * @see ee.xtext.haxe.haxe.InterfaceProperty#getGetter()
   * @see #getInterfaceProperty()
   * @generated
   */
  EReference getInterfaceProperty_Getter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.InterfaceProperty#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Setter</em>'.
   * @see ee.xtext.haxe.haxe.InterfaceProperty#getSetter()
   * @see #getInterfaceProperty()
   * @generated
   */
  EReference getInterfaceProperty_Setter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.InterfaceProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.InterfaceProperty#getType()
   * @see #getInterfaceProperty()
   * @generated
   */
  EReference getInterfaceProperty_Type();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypedefProperty <em>Typedef Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Property</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty
   * @generated
   */
  EClass getTypedefProperty();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TypedefProperty#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty#getMetadata()
   * @see #getTypedefProperty()
   * @generated
   */
  EReference getTypedefProperty_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.TypedefProperty#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty#getVisibility()
   * @see #getTypedefProperty()
   * @generated
   */
  EAttribute getTypedefProperty_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TypedefProperty#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getter</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty#getGetter()
   * @see #getTypedefProperty()
   * @generated
   */
  EReference getTypedefProperty_Getter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TypedefProperty#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Setter</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty#getSetter()
   * @see #getTypedefProperty()
   * @generated
   */
  EReference getTypedefProperty_Setter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.TypedefProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.TypedefProperty#getType()
   * @see #getTypedefProperty()
   * @generated
   */
  EReference getTypedefProperty_Type();

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
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.EnumConstructor#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.EnumConstructor#getMetadata()
   * @see #getEnumConstructor()
   * @generated
   */
  EReference getEnumConstructor_Metadata();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ExternClassConstructor <em>Extern Class Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Class Constructor</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassConstructor
   * @generated
   */
  EClass getExternClassConstructor();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassConstructor#getMetadata()
   * @see #getExternClassConstructor()
   * @generated
   */
  EReference getExternClassConstructor_Metadata();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassConstructor#getVisibility()
   * @see #getExternClassConstructor()
   * @generated
   */
  EAttribute getExternClassConstructor_Visibility();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassConstructor#getParameters()
   * @see #getExternClassConstructor()
   * @generated
   */
  EReference getExternClassConstructor_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassConstructor#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassConstructor#getReturnType()
   * @see #getExternClassConstructor()
   * @generated
   */
  EReference getExternClassConstructor_ReturnType();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ExternClassProperty <em>Extern Class Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Class Property</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty
   * @generated
   */
  EClass getExternClassProperty();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getMetadata()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Metadata();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getModifier()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getGetter <em>Getter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getter</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getGetter()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Getter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getSetter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Setter</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getSetter()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Setter();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getType()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.ExternClassProperty#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see ee.xtext.haxe.haxe.ExternClassProperty#getExpression()
   * @see #getExternClassProperty()
   * @generated
   */
  EReference getExternClassProperty_Expression();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.GetterSetter <em>Getter Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Getter Setter</em>'.
   * @see ee.xtext.haxe.haxe.GetterSetter
   * @generated
   */
  EClass getGetterSetter();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ClassMethodReference <em>Class Method Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Method Reference</em>'.
   * @see ee.xtext.haxe.haxe.ClassMethodReference
   * @generated
   */
  EClass getClassMethodReference();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.ClassMethodReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see ee.xtext.haxe.haxe.ClassMethodReference#getReference()
   * @see #getClassMethodReference()
   * @generated
   */
  EReference getClassMethodReference_Reference();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.GetterSetterLiteral <em>Getter Setter Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Getter Setter Literal</em>'.
   * @see ee.xtext.haxe.haxe.GetterSetterLiteral
   * @generated
   */
  EClass getGetterSetterLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.GetterSetterLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.GetterSetterLiteral#getValue()
   * @see #getGetterSetterLiteral()
   * @generated
   */
  EAttribute getGetterSetterLiteral_Value();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.CasePartExpressions <em>Case Part Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Part Expressions</em>'.
   * @see ee.xtext.haxe.haxe.CasePartExpressions
   * @generated
   */
  EClass getCasePartExpressions();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.CasePartExpressions#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see ee.xtext.haxe.haxe.CasePartExpressions#getExpressions()
   * @see #getCasePartExpressions()
   * @generated
   */
  EReference getCasePartExpressions_Expressions();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.MethodSignature <em>Method Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Signature</em>'.
   * @see ee.xtext.haxe.haxe.MethodSignature
   * @generated
   */
  EClass getMethodSignature();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.MethodSignature#getArgumentTypes <em>Argument Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument Types</em>'.
   * @see ee.xtext.haxe.haxe.MethodSignature#getArgumentTypes()
   * @see #getMethodSignature()
   * @generated
   */
  EReference getMethodSignature_ArgumentTypes();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.MethodSignature#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ee.xtext.haxe.haxe.MethodSignature#getReturnType()
   * @see #getMethodSignature()
   * @generated
   */
  EReference getMethodSignature_ReturnType();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.ParameterizedTypeReference <em>Parameterized Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterized Type Reference</em>'.
   * @see ee.xtext.haxe.haxe.ParameterizedTypeReference
   * @generated
   */
  EClass getParameterizedTypeReference();

  /**
   * Returns the meta object for the reference '{@link ee.xtext.haxe.haxe.ParameterizedTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.ParameterizedTypeReference#getType()
   * @see #getParameterizedTypeReference()
   * @generated
   */
  EReference getParameterizedTypeReference_Type();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.ParameterizedTypeReference#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see ee.xtext.haxe.haxe.ParameterizedTypeReference#getArguments()
   * @see #getParameterizedTypeReference()
   * @generated
   */
  EReference getParameterizedTypeReference_Arguments();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.TypedefType <em>Typedef Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Type</em>'.
   * @see ee.xtext.haxe.haxe.TypedefType
   * @generated
   */
  EClass getTypedefType();

  /**
   * Returns the meta object for the containment reference list '{@link ee.xtext.haxe.haxe.TypedefType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see ee.xtext.haxe.haxe.TypedefType#getProperties()
   * @see #getTypedefType()
   * @generated
   */
  EReference getTypedefType_Properties();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see ee.xtext.haxe.haxe.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.CastExpression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see ee.xtext.haxe.haxe.CastExpression#getTarget()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Target();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ee.xtext.haxe.haxe.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Type();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.UntypedExpression <em>Untyped Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Untyped Expression</em>'.
   * @see ee.xtext.haxe.haxe.UntypedExpression
   * @generated
   */
  EClass getUntypedExpression();

  /**
   * Returns the meta object for the containment reference '{@link ee.xtext.haxe.haxe.UntypedExpression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see ee.xtext.haxe.haxe.UntypedExpression#getTarget()
   * @see #getUntypedExpression()
   * @generated
   */
  EReference getUntypedExpression_Target();

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
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see ee.xtext.haxe.haxe.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link ee.xtext.haxe.haxe.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see ee.xtext.haxe.haxe.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link ee.xtext.haxe.haxe.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ee.xtext.haxe.haxe.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

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
     * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__TYPEDEFS = eINSTANCE.getPackage_Typedefs();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENUMS = eINSTANCE.getPackage_Enums();

    /**
     * The meta object literal for the '<em><b>Extern Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__EXTERN_CLASSES = eINSTANCE.getPackage_ExternClasses();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__METADATA = eINSTANCE.getClass_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__VISIBILITY = eINSTANCE.getClass_Visibility();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

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
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__METADATA = eINSTANCE.getInterface_Metadata();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__EXTERN = eINSTANCE.getInterface_Extern();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__VISIBILITY = eINSTANCE.getInterface_Visibility();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__TYPE_PARAMETERS = eINSTANCE.getInterface_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__IMPLEMENTS = eINSTANCE.getInterface_Implements();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__PROPERTIES = eINSTANCE.getInterface_Properties();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__METHODS = eINSTANCE.getInterface_Methods();

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
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__METADATA = eINSTANCE.getTypedef_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF__VISIBILITY = eINSTANCE.getTypedef_Visibility();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__TYPE_PARAMETERS = eINSTANCE.getTypedef_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__EXTENDS = eINSTANCE.getTypedef_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__PROPERTIES = eINSTANCE.getTypedef_Properties();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__METHODS = eINSTANCE.getTypedef_Methods();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__TYPE = eINSTANCE.getTypedef_Type();

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
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__METADATA = eINSTANCE.getEnum_Metadata();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__EXTERN = eINSTANCE.getEnum_Extern();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__VISIBILITY = eINSTANCE.getEnum_Visibility();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__TYPE_PARAMETERS = eINSTANCE.getEnum_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__CONSTRUCTORS = eINSTANCE.getEnum_Constructors();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ExternClassImpl <em>Extern Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ExternClassImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClass()
     * @generated
     */
    EClass EXTERN_CLASS = eINSTANCE.getExternClass();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__METADATA = eINSTANCE.getExternClass_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERN_CLASS__VISIBILITY = eINSTANCE.getExternClass_Visibility();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__TYPE_PARAMETERS = eINSTANCE.getExternClass_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__EXTENDS = eINSTANCE.getExternClass_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__IMPLEMENTS = eINSTANCE.getExternClass_Implements();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__CONSTRUCTOR = eINSTANCE.getExternClass_Constructor();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__PROPERTIES = eINSTANCE.getExternClass_Properties();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS__METHODS = eINSTANCE.getExternClass_Methods();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypeReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypedefTypePropertyImpl <em>Typedef Type Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypedefTypePropertyImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefTypeProperty()
     * @generated
     */
    EClass TYPEDEF_TYPE_PROPERTY = eINSTANCE.getTypedefTypeProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF_TYPE_PROPERTY__NAME = eINSTANCE.getTypedefTypeProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_TYPE_PROPERTY__TYPE = eINSTANCE.getTypedefTypeProperty_Type();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.MetadataImpl <em>Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.MetadataImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMetadata()
     * @generated
     */
    EClass METADATA = eINSTANCE.getMetadata();

    /**
     * The meta object literal for the '<em><b>Compiler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA__COMPILER = eINSTANCE.getMetadata_Compiler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA__NAME = eINSTANCE.getMetadata_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA__BODY = eINSTANCE.getMetadata_Body();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.MethodModifierImpl <em>Method Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.MethodModifierImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethodModifier()
     * @generated
     */
    EClass METHOD_MODIFIER = eINSTANCE.getMethodModifier();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.PropertyModifierImpl <em>Property Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.PropertyModifierImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getPropertyModifier()
     * @generated
     */
    EClass PROPERTY_MODIFIER = eINSTANCE.getPropertyModifier();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ParameterImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassConstructorImpl <em>Class Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassConstructorImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassConstructor()
     * @generated
     */
    EClass CLASS_CONSTRUCTOR = eINSTANCE.getClassConstructor();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CONSTRUCTOR__METADATA = eINSTANCE.getClassConstructor_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_CONSTRUCTOR__VISIBILITY = eINSTANCE.getClassConstructor_Visibility();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CONSTRUCTOR__PARAMETERS = eINSTANCE.getClassConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CONSTRUCTOR__RETURN_TYPE = eINSTANCE.getClassConstructor_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CONSTRUCTOR__BODY = eINSTANCE.getClassConstructor_Body();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassPropertyImpl <em>Class Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassPropertyImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassProperty()
     * @generated
     */
    EClass CLASS_PROPERTY = eINSTANCE.getClassProperty();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__METADATA = eINSTANCE.getClassProperty_Metadata();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__MODIFIER = eINSTANCE.getClassProperty_Modifier();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__GETTER = eINSTANCE.getClassProperty_Getter();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__SETTER = eINSTANCE.getClassProperty_Setter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__TYPE = eINSTANCE.getClassProperty_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_PROPERTY__EXPRESSION = eINSTANCE.getClassProperty_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.MethodImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__METADATA = eINSTANCE.getMethod_Metadata();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__MODIFIER = eINSTANCE.getMethod_Modifier();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE_PARAMETERS = eINSTANCE.getMethod_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Untyped</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__UNTYPED = eINSTANCE.getMethod_Untyped();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.InterfacePropertyImpl <em>Interface Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.InterfacePropertyImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getInterfaceProperty()
     * @generated
     */
    EClass INTERFACE_PROPERTY = eINSTANCE.getInterfaceProperty();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY__METADATA = eINSTANCE.getInterfaceProperty_Metadata();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY__GETTER = eINSTANCE.getInterfaceProperty_Getter();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY__SETTER = eINSTANCE.getInterfaceProperty_Setter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY__TYPE = eINSTANCE.getInterfaceProperty_Type();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypedefPropertyImpl <em>Typedef Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypedefPropertyImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefProperty()
     * @generated
     */
    EClass TYPEDEF_PROPERTY = eINSTANCE.getTypedefProperty();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_PROPERTY__METADATA = eINSTANCE.getTypedefProperty_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF_PROPERTY__VISIBILITY = eINSTANCE.getTypedefProperty_Visibility();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_PROPERTY__GETTER = eINSTANCE.getTypedefProperty_Getter();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_PROPERTY__SETTER = eINSTANCE.getTypedefProperty_Setter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_PROPERTY__TYPE = eINSTANCE.getTypedefProperty_Type();

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
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONSTRUCTOR__METADATA = eINSTANCE.getEnumConstructor_Metadata();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONSTRUCTOR__PARAMETERS = eINSTANCE.getEnumConstructor_Parameters();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl <em>Extern Class Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ExternClassConstructorImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClassConstructor()
     * @generated
     */
    EClass EXTERN_CLASS_CONSTRUCTOR = eINSTANCE.getExternClassConstructor();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_CONSTRUCTOR__METADATA = eINSTANCE.getExternClassConstructor_Metadata();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERN_CLASS_CONSTRUCTOR__VISIBILITY = eINSTANCE.getExternClassConstructor_Visibility();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_CONSTRUCTOR__PARAMETERS = eINSTANCE.getExternClassConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_CONSTRUCTOR__RETURN_TYPE = eINSTANCE.getExternClassConstructor_ReturnType();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ExternClassPropertyImpl <em>Extern Class Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ExternClassPropertyImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getExternClassProperty()
     * @generated
     */
    EClass EXTERN_CLASS_PROPERTY = eINSTANCE.getExternClassProperty();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__METADATA = eINSTANCE.getExternClassProperty_Metadata();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__MODIFIER = eINSTANCE.getExternClassProperty_Modifier();

    /**
     * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__GETTER = eINSTANCE.getExternClassProperty_Getter();

    /**
     * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__SETTER = eINSTANCE.getExternClassProperty_Setter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__TYPE = eINSTANCE.getExternClassProperty_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_CLASS_PROPERTY__EXPRESSION = eINSTANCE.getExternClassProperty_Expression();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.GetterSetterImpl <em>Getter Setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.GetterSetterImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getGetterSetter()
     * @generated
     */
    EClass GETTER_SETTER = eINSTANCE.getGetterSetter();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ClassMethodReferenceImpl <em>Class Method Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ClassMethodReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getClassMethodReference()
     * @generated
     */
    EClass CLASS_METHOD_REFERENCE = eINSTANCE.getClassMethodReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_METHOD_REFERENCE__REFERENCE = eINSTANCE.getClassMethodReference_Reference();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.GetterSetterLiteralImpl <em>Getter Setter Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.GetterSetterLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getGetterSetterLiteral()
     * @generated
     */
    EClass GETTER_SETTER_LITERAL = eINSTANCE.getGetterSetterLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GETTER_SETTER_LITERAL__VALUE = eINSTANCE.getGetterSetterLiteral_Value();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.CasePartExpressionsImpl <em>Case Part Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.CasePartExpressionsImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCasePartExpressions()
     * @generated
     */
    EClass CASE_PART_EXPRESSIONS = eINSTANCE.getCasePartExpressions();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_PART_EXPRESSIONS__EXPRESSIONS = eINSTANCE.getCasePartExpressions_Expressions();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.MethodSignatureImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getMethodSignature()
     * @generated
     */
    EClass METHOD_SIGNATURE = eINSTANCE.getMethodSignature();

    /**
     * The meta object literal for the '<em><b>Argument Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_SIGNATURE__ARGUMENT_TYPES = eINSTANCE.getMethodSignature_ArgumentTypes();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_SIGNATURE__RETURN_TYPE = eINSTANCE.getMethodSignature_ReturnType();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.ParameterizedTypeReferenceImpl <em>Parameterized Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.ParameterizedTypeReferenceImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getParameterizedTypeReference()
     * @generated
     */
    EClass PARAMETERIZED_TYPE_REFERENCE = eINSTANCE.getParameterizedTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_TYPE_REFERENCE__TYPE = eINSTANCE.getParameterizedTypeReference_Type();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_TYPE_REFERENCE__ARGUMENTS = eINSTANCE.getParameterizedTypeReference_Arguments();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.TypedefTypeImpl <em>Typedef Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.TypedefTypeImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getTypedefType()
     * @generated
     */
    EClass TYPEDEF_TYPE = eINSTANCE.getTypedefType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_TYPE__PROPERTIES = eINSTANCE.getTypedefType_Properties();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.CastExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TARGET = eINSTANCE.getCastExpression_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.UntypedExpressionImpl <em>Untyped Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.UntypedExpressionImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getUntypedExpression()
     * @generated
     */
    EClass UNTYPED_EXPRESSION = eINSTANCE.getUntypedExpression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTYPED_EXPRESSION__TARGET = eINSTANCE.getUntypedExpression_Target();

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
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.NullLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link ee.xtext.haxe.haxe.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ee.xtext.haxe.haxe.impl.NumberLiteralImpl
     * @see ee.xtext.haxe.haxe.impl.HaxePackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

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
