/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.ArrayAccess;
import ee.xtext.haxe.haxe.ArrayAssignment;
import ee.xtext.haxe.haxe.ArrayLiteral;
import ee.xtext.haxe.haxe.Assignment;
import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.BreakExpression;
import ee.xtext.haxe.haxe.CasePart;
import ee.xtext.haxe.haxe.CasePartExpressions;
import ee.xtext.haxe.haxe.CastExpression;
import ee.xtext.haxe.haxe.CatchClause;
import ee.xtext.haxe.haxe.ClassConstructor;
import ee.xtext.haxe.haxe.ClassMethodReference;
import ee.xtext.haxe.haxe.ClassProperty;
import ee.xtext.haxe.haxe.ConstructorCall;
import ee.xtext.haxe.haxe.DoWhileExpression;
import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.ExternClass;
import ee.xtext.haxe.haxe.ExternClassConstructor;
import ee.xtext.haxe.haxe.ExternClassProperty;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.GetterSetter;
import ee.xtext.haxe.haxe.GetterSetterLiteral;
import ee.xtext.haxe.haxe.HaxeFactory;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.IfExpression;
import ee.xtext.haxe.haxe.Import;
import ee.xtext.haxe.haxe.Interface;
import ee.xtext.haxe.haxe.InterfaceProperty;
import ee.xtext.haxe.haxe.MemberFeatureCall;
import ee.xtext.haxe.haxe.Metadata;
import ee.xtext.haxe.haxe.Method;
import ee.xtext.haxe.haxe.MethodModifier;
import ee.xtext.haxe.haxe.MethodSignature;
import ee.xtext.haxe.haxe.Modifier;
import ee.xtext.haxe.haxe.NullLiteral;
import ee.xtext.haxe.haxe.NumberLiteral;
import ee.xtext.haxe.haxe.ObjectElement;
import ee.xtext.haxe.haxe.ObjectLiteral;
import ee.xtext.haxe.haxe.Operation;
import ee.xtext.haxe.haxe.Parameter;
import ee.xtext.haxe.haxe.ParameterizedTypeReference;
import ee.xtext.haxe.haxe.PostIncrementOperation;
import ee.xtext.haxe.haxe.PreIncrementOperation;
import ee.xtext.haxe.haxe.PropertyModifier;
import ee.xtext.haxe.haxe.Reference;
import ee.xtext.haxe.haxe.RegularExpressionLiteral;
import ee.xtext.haxe.haxe.ReturnExpression;
import ee.xtext.haxe.haxe.StringLiteral;
import ee.xtext.haxe.haxe.SwitchExpression;
import ee.xtext.haxe.haxe.ThrowExpression;
import ee.xtext.haxe.haxe.TryCatchExpression;
import ee.xtext.haxe.haxe.Type;
import ee.xtext.haxe.haxe.TypeParameter;
import ee.xtext.haxe.haxe.TypeParameters;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.Typedef;
import ee.xtext.haxe.haxe.TypedefProperty;
import ee.xtext.haxe.haxe.TypedefType;
import ee.xtext.haxe.haxe.TypedefTypeProperty;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.UntypedExpression;
import ee.xtext.haxe.haxe.Using;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
import ee.xtext.haxe.haxe.Visibility;
import ee.xtext.haxe.haxe.WhileExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HaxeFactoryImpl extends EFactoryImpl implements HaxeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HaxeFactory init()
  {
    try
    {
      HaxeFactory theHaxeFactory = (HaxeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.ee/haxe/Haxe"); 
      if (theHaxeFactory != null)
      {
        return theHaxeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HaxeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HaxeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HaxePackage.PACKAGE: return createPackage();
      case HaxePackage.IMPORT: return createImport();
      case HaxePackage.USING: return createUsing();
      case HaxePackage.TYPE: return createType();
      case HaxePackage.CLASS: return createClass();
      case HaxePackage.INTERFACE: return createInterface();
      case HaxePackage.TYPEDEF: return createTypedef();
      case HaxePackage.ENUM: return createEnum();
      case HaxePackage.EXTERN_CLASS: return createExternClass();
      case HaxePackage.TYPE_PARAMETERS: return createTypeParameters();
      case HaxePackage.TYPE_PARAMETER: return createTypeParameter();
      case HaxePackage.TYPE_REFERENCE: return createTypeReference();
      case HaxePackage.REFERENCE: return createReference();
      case HaxePackage.TYPEDEF_TYPE_PROPERTY: return createTypedefTypeProperty();
      case HaxePackage.METADATA: return createMetadata();
      case HaxePackage.EXPRESSION: return createExpression();
      case HaxePackage.METHOD_MODIFIER: return createMethodModifier();
      case HaxePackage.PROPERTY_MODIFIER: return createPropertyModifier();
      case HaxePackage.PARAMETER: return createParameter();
      case HaxePackage.CLASS_CONSTRUCTOR: return createClassConstructor();
      case HaxePackage.CLASS_PROPERTY: return createClassProperty();
      case HaxePackage.METHOD: return createMethod();
      case HaxePackage.INTERFACE_PROPERTY: return createInterfaceProperty();
      case HaxePackage.TYPEDEF_PROPERTY: return createTypedefProperty();
      case HaxePackage.ENUM_CONSTRUCTOR: return createEnumConstructor();
      case HaxePackage.EXTERN_CLASS_CONSTRUCTOR: return createExternClassConstructor();
      case HaxePackage.EXTERN_CLASS_PROPERTY: return createExternClassProperty();
      case HaxePackage.GETTER_SETTER: return createGetterSetter();
      case HaxePackage.CLASS_METHOD_REFERENCE: return createClassMethodReference();
      case HaxePackage.GETTER_SETTER_LITERAL: return createGetterSetterLiteral();
      case HaxePackage.FEATURE: return createFeature();
      case HaxePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case HaxePackage.CATCH_CLAUSE: return createCatchClause();
      case HaxePackage.CASE_PART: return createCasePart();
      case HaxePackage.CASE_PART_EXPRESSIONS: return createCasePartExpressions();
      case HaxePackage.OBJECT_ELEMENT: return createObjectElement();
      case HaxePackage.METHOD_SIGNATURE: return createMethodSignature();
      case HaxePackage.PARAMETERIZED_TYPE_REFERENCE: return createParameterizedTypeReference();
      case HaxePackage.TYPEDEF_TYPE: return createTypedefType();
      case HaxePackage.MODIFIER: return createModifier();
      case HaxePackage.CAST_EXPRESSION: return createCastExpression();
      case HaxePackage.UNTYPED_EXPRESSION: return createUntypedExpression();
      case HaxePackage.IF_EXPRESSION: return createIfExpression();
      case HaxePackage.ASSIGNMENT: return createAssignment();
      case HaxePackage.OPERATION: return createOperation();
      case HaxePackage.UNARY_OPERATION: return createUnaryOperation();
      case HaxePackage.PRE_INCREMENT_OPERATION: return createPreIncrementOperation();
      case HaxePackage.POST_INCREMENT_OPERATION: return createPostIncrementOperation();
      case HaxePackage.ARRAY_ASSIGNMENT: return createArrayAssignment();
      case HaxePackage.MEMBER_FEATURE_CALL: return createMemberFeatureCall();
      case HaxePackage.ARRAY_ACCESS: return createArrayAccess();
      case HaxePackage.BLOCK_EXPRESSION: return createBlockExpression();
      case HaxePackage.VARIABLE_DECLARATIONS: return createVariableDeclarations();
      case HaxePackage.FUNCTION_EXPRESSION: return createFunctionExpression();
      case HaxePackage.FEATURE_CALL: return createFeatureCall();
      case HaxePackage.CONSTRUCTOR_CALL: return createConstructorCall();
      case HaxePackage.WHILE_EXPRESSION: return createWhileExpression();
      case HaxePackage.DO_WHILE_EXPRESSION: return createDoWhileExpression();
      case HaxePackage.FOR_LOOP_EXPRESSION: return createForLoopExpression();
      case HaxePackage.TRY_CATCH_EXPRESSION: return createTryCatchExpression();
      case HaxePackage.SWITCH_EXPRESSION: return createSwitchExpression();
      case HaxePackage.RETURN_EXPRESSION: return createReturnExpression();
      case HaxePackage.BREAK_EXPRESSION: return createBreakExpression();
      case HaxePackage.THROW_EXPRESSION: return createThrowExpression();
      case HaxePackage.NULL_LITERAL: return createNullLiteral();
      case HaxePackage.NUMBER_LITERAL: return createNumberLiteral();
      case HaxePackage.STRING_LITERAL: return createStringLiteral();
      case HaxePackage.REGULAR_EXPRESSION_LITERAL: return createRegularExpressionLiteral();
      case HaxePackage.ARRAY_LITERAL: return createArrayLiteral();
      case HaxePackage.OBJECT_LITERAL: return createObjectLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HaxePackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HaxePackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ee.xtext.haxe.haxe.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Using createUsing()
  {
    UsingImpl using = new UsingImpl();
    return using;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ee.xtext.haxe.haxe.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typedef createTypedef()
  {
    TypedefImpl typedef = new TypedefImpl();
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ee.xtext.haxe.haxe.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternClass createExternClass()
  {
    ExternClassImpl externClass = new ExternClassImpl();
    return externClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameters createTypeParameters()
  {
    TypeParametersImpl typeParameters = new TypeParametersImpl();
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameter createTypeParameter()
  {
    TypeParameterImpl typeParameter = new TypeParameterImpl();
    return typeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefTypeProperty createTypedefTypeProperty()
  {
    TypedefTypePropertyImpl typedefTypeProperty = new TypedefTypePropertyImpl();
    return typedefTypeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata createMetadata()
  {
    MetadataImpl metadata = new MetadataImpl();
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodModifier createMethodModifier()
  {
    MethodModifierImpl methodModifier = new MethodModifierImpl();
    return methodModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyModifier createPropertyModifier()
  {
    PropertyModifierImpl propertyModifier = new PropertyModifierImpl();
    return propertyModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassConstructor createClassConstructor()
  {
    ClassConstructorImpl classConstructor = new ClassConstructorImpl();
    return classConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassProperty createClassProperty()
  {
    ClassPropertyImpl classProperty = new ClassPropertyImpl();
    return classProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceProperty createInterfaceProperty()
  {
    InterfacePropertyImpl interfaceProperty = new InterfacePropertyImpl();
    return interfaceProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefProperty createTypedefProperty()
  {
    TypedefPropertyImpl typedefProperty = new TypedefPropertyImpl();
    return typedefProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumConstructor createEnumConstructor()
  {
    EnumConstructorImpl enumConstructor = new EnumConstructorImpl();
    return enumConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternClassConstructor createExternClassConstructor()
  {
    ExternClassConstructorImpl externClassConstructor = new ExternClassConstructorImpl();
    return externClassConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternClassProperty createExternClassProperty()
  {
    ExternClassPropertyImpl externClassProperty = new ExternClassPropertyImpl();
    return externClassProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetterSetter createGetterSetter()
  {
    GetterSetterImpl getterSetter = new GetterSetterImpl();
    return getterSetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMethodReference createClassMethodReference()
  {
    ClassMethodReferenceImpl classMethodReference = new ClassMethodReferenceImpl();
    return classMethodReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetterSetterLiteral createGetterSetterLiteral()
  {
    GetterSetterLiteralImpl getterSetterLiteral = new GetterSetterLiteralImpl();
    return getterSetterLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchClause createCatchClause()
  {
    CatchClauseImpl catchClause = new CatchClauseImpl();
    return catchClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CasePart createCasePart()
  {
    CasePartImpl casePart = new CasePartImpl();
    return casePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CasePartExpressions createCasePartExpressions()
  {
    CasePartExpressionsImpl casePartExpressions = new CasePartExpressionsImpl();
    return casePartExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectElement createObjectElement()
  {
    ObjectElementImpl objectElement = new ObjectElementImpl();
    return objectElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodSignature createMethodSignature()
  {
    MethodSignatureImpl methodSignature = new MethodSignatureImpl();
    return methodSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterizedTypeReference createParameterizedTypeReference()
  {
    ParameterizedTypeReferenceImpl parameterizedTypeReference = new ParameterizedTypeReferenceImpl();
    return parameterizedTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefType createTypedefType()
  {
    TypedefTypeImpl typedefType = new TypedefTypeImpl();
    return typedefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UntypedExpression createUntypedExpression()
  {
    UntypedExpressionImpl untypedExpression = new UntypedExpressionImpl();
    return untypedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression createIfExpression()
  {
    IfExpressionImpl ifExpression = new IfExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreIncrementOperation createPreIncrementOperation()
  {
    PreIncrementOperationImpl preIncrementOperation = new PreIncrementOperationImpl();
    return preIncrementOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostIncrementOperation createPostIncrementOperation()
  {
    PostIncrementOperationImpl postIncrementOperation = new PostIncrementOperationImpl();
    return postIncrementOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAssignment createArrayAssignment()
  {
    ArrayAssignmentImpl arrayAssignment = new ArrayAssignmentImpl();
    return arrayAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberFeatureCall createMemberFeatureCall()
  {
    MemberFeatureCallImpl memberFeatureCall = new MemberFeatureCallImpl();
    return memberFeatureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockExpression createBlockExpression()
  {
    BlockExpressionImpl blockExpression = new BlockExpressionImpl();
    return blockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarations createVariableDeclarations()
  {
    VariableDeclarationsImpl variableDeclarations = new VariableDeclarationsImpl();
    return variableDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression createFunctionExpression()
  {
    FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
    return functionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCall createFeatureCall()
  {
    FeatureCallImpl featureCall = new FeatureCallImpl();
    return featureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorCall createConstructorCall()
  {
    ConstructorCallImpl constructorCall = new ConstructorCallImpl();
    return constructorCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileExpression createWhileExpression()
  {
    WhileExpressionImpl whileExpression = new WhileExpressionImpl();
    return whileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhileExpression createDoWhileExpression()
  {
    DoWhileExpressionImpl doWhileExpression = new DoWhileExpressionImpl();
    return doWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoopExpression createForLoopExpression()
  {
    ForLoopExpressionImpl forLoopExpression = new ForLoopExpressionImpl();
    return forLoopExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryCatchExpression createTryCatchExpression()
  {
    TryCatchExpressionImpl tryCatchExpression = new TryCatchExpressionImpl();
    return tryCatchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchExpression createSwitchExpression()
  {
    SwitchExpressionImpl switchExpression = new SwitchExpressionImpl();
    return switchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnExpression createReturnExpression()
  {
    ReturnExpressionImpl returnExpression = new ReturnExpressionImpl();
    return returnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakExpression createBreakExpression()
  {
    BreakExpressionImpl breakExpression = new BreakExpressionImpl();
    return breakExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowExpression createThrowExpression()
  {
    ThrowExpressionImpl throwExpression = new ThrowExpressionImpl();
    return throwExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularExpressionLiteral createRegularExpressionLiteral()
  {
    RegularExpressionLiteralImpl regularExpressionLiteral = new RegularExpressionLiteralImpl();
    return regularExpressionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLiteral createArrayLiteral()
  {
    ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectLiteral createObjectLiteral()
  {
    ObjectLiteralImpl objectLiteral = new ObjectLiteralImpl();
    return objectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HaxePackage getHaxePackage()
  {
    return (HaxePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HaxePackage getPackage()
  {
    return HaxePackage.eINSTANCE;
  }

} //HaxeFactoryImpl
