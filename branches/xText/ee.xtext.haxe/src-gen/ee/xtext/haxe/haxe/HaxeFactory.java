/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ee.xtext.haxe.haxe.HaxePackage
 * @generated
 */
public interface HaxeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HaxeFactory eINSTANCE = ee.xtext.haxe.haxe.impl.HaxeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using</em>'.
   * @generated
   */
  Using createUsing();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Typedef</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef</em>'.
   * @generated
   */
  Typedef createTypedef();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Extern Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Class</em>'.
   * @generated
   */
  ExternClass createExternClass();

  /**
   * Returns a new object of class '<em>Type Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Parameters</em>'.
   * @generated
   */
  TypeParameters createTypeParameters();

  /**
   * Returns a new object of class '<em>Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Parameter</em>'.
   * @generated
   */
  TypeParameter createTypeParameter();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Typedef Type Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Type Property</em>'.
   * @generated
   */
  TypedefTypeProperty createTypedefTypeProperty();

  /**
   * Returns a new object of class '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata</em>'.
   * @generated
   */
  Metadata createMetadata();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Method Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Modifier</em>'.
   * @generated
   */
  MethodModifier createMethodModifier();

  /**
   * Returns a new object of class '<em>Property Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Modifier</em>'.
   * @generated
   */
  PropertyModifier createPropertyModifier();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Class Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Constructor</em>'.
   * @generated
   */
  ClassConstructor createClassConstructor();

  /**
   * Returns a new object of class '<em>Class Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Property</em>'.
   * @generated
   */
  ClassProperty createClassProperty();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Interface Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Property</em>'.
   * @generated
   */
  InterfaceProperty createInterfaceProperty();

  /**
   * Returns a new object of class '<em>Typedef Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Property</em>'.
   * @generated
   */
  TypedefProperty createTypedefProperty();

  /**
   * Returns a new object of class '<em>Enum Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Constructor</em>'.
   * @generated
   */
  EnumConstructor createEnumConstructor();

  /**
   * Returns a new object of class '<em>Extern Class Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Class Constructor</em>'.
   * @generated
   */
  ExternClassConstructor createExternClassConstructor();

  /**
   * Returns a new object of class '<em>Extern Class Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Class Property</em>'.
   * @generated
   */
  ExternClassProperty createExternClassProperty();

  /**
   * Returns a new object of class '<em>Getter Setter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Getter Setter</em>'.
   * @generated
   */
  GetterSetter createGetterSetter();

  /**
   * Returns a new object of class '<em>Class Method Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Method Reference</em>'.
   * @generated
   */
  ClassMethodReference createClassMethodReference();

  /**
   * Returns a new object of class '<em>Getter Setter Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Getter Setter Literal</em>'.
   * @generated
   */
  GetterSetterLiteral createGetterSetterLiteral();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Catch Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Catch Clause</em>'.
   * @generated
   */
  CatchClause createCatchClause();

  /**
   * Returns a new object of class '<em>Case Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Part</em>'.
   * @generated
   */
  CasePart createCasePart();

  /**
   * Returns a new object of class '<em>Case Part Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Part Expressions</em>'.
   * @generated
   */
  CasePartExpressions createCasePartExpressions();

  /**
   * Returns a new object of class '<em>Object Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Element</em>'.
   * @generated
   */
  ObjectElement createObjectElement();

  /**
   * Returns a new object of class '<em>Method Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Signature</em>'.
   * @generated
   */
  MethodSignature createMethodSignature();

  /**
   * Returns a new object of class '<em>Parameterized Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameterized Type Reference</em>'.
   * @generated
   */
  ParameterizedTypeReference createParameterizedTypeReference();

  /**
   * Returns a new object of class '<em>Typedef Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Type</em>'.
   * @generated
   */
  TypedefType createTypedefType();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  CastExpression createCastExpression();

  /**
   * Returns a new object of class '<em>Untyped Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Untyped Expression</em>'.
   * @generated
   */
  UntypedExpression createUntypedExpression();

  /**
   * Returns a new object of class '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Expression</em>'.
   * @generated
   */
  IfExpression createIfExpression();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operation</em>'.
   * @generated
   */
  UnaryOperation createUnaryOperation();

  /**
   * Returns a new object of class '<em>Pre Increment Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Increment Operation</em>'.
   * @generated
   */
  PreIncrementOperation createPreIncrementOperation();

  /**
   * Returns a new object of class '<em>Post Increment Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Increment Operation</em>'.
   * @generated
   */
  PostIncrementOperation createPostIncrementOperation();

  /**
   * Returns a new object of class '<em>Array Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Assignment</em>'.
   * @generated
   */
  ArrayAssignment createArrayAssignment();

  /**
   * Returns a new object of class '<em>Member Feature Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Feature Call</em>'.
   * @generated
   */
  MemberFeatureCall createMemberFeatureCall();

  /**
   * Returns a new object of class '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Access</em>'.
   * @generated
   */
  ArrayAccess createArrayAccess();

  /**
   * Returns a new object of class '<em>Block Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Expression</em>'.
   * @generated
   */
  BlockExpression createBlockExpression();

  /**
   * Returns a new object of class '<em>Variable Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declarations</em>'.
   * @generated
   */
  VariableDeclarations createVariableDeclarations();

  /**
   * Returns a new object of class '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Expression</em>'.
   * @generated
   */
  FunctionExpression createFunctionExpression();

  /**
   * Returns a new object of class '<em>Feature Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Call</em>'.
   * @generated
   */
  FeatureCall createFeatureCall();

  /**
   * Returns a new object of class '<em>Constructor Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Call</em>'.
   * @generated
   */
  ConstructorCall createConstructorCall();

  /**
   * Returns a new object of class '<em>While Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Expression</em>'.
   * @generated
   */
  WhileExpression createWhileExpression();

  /**
   * Returns a new object of class '<em>Do While Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Expression</em>'.
   * @generated
   */
  DoWhileExpression createDoWhileExpression();

  /**
   * Returns a new object of class '<em>For Loop Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Loop Expression</em>'.
   * @generated
   */
  ForLoopExpression createForLoopExpression();

  /**
   * Returns a new object of class '<em>Try Catch Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try Catch Expression</em>'.
   * @generated
   */
  TryCatchExpression createTryCatchExpression();

  /**
   * Returns a new object of class '<em>Switch Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Expression</em>'.
   * @generated
   */
  SwitchExpression createSwitchExpression();

  /**
   * Returns a new object of class '<em>Return Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Expression</em>'.
   * @generated
   */
  ReturnExpression createReturnExpression();

  /**
   * Returns a new object of class '<em>Break Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Expression</em>'.
   * @generated
   */
  BreakExpression createBreakExpression();

  /**
   * Returns a new object of class '<em>Throw Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throw Expression</em>'.
   * @generated
   */
  ThrowExpression createThrowExpression();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Regular Expression Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regular Expression Literal</em>'.
   * @generated
   */
  RegularExpressionLiteral createRegularExpressionLiteral();

  /**
   * Returns a new object of class '<em>Array Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Literal</em>'.
   * @generated
   */
  ArrayLiteral createArrayLiteral();

  /**
   * Returns a new object of class '<em>Object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Literal</em>'.
   * @generated
   */
  ObjectLiteral createObjectLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HaxePackage getHaxePackage();

} //HaxeFactory
