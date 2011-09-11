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
import ee.xtext.haxe.haxe.BooleanLiteral;
import ee.xtext.haxe.haxe.BreakExpression;
import ee.xtext.haxe.haxe.CasePart;
import ee.xtext.haxe.haxe.CatchClause;
import ee.xtext.haxe.haxe.ClassMember;
import ee.xtext.haxe.haxe.ConstructorCall;
import ee.xtext.haxe.haxe.DoWhileExpression;
import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.FloatLiteral;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FormalParameter;
import ee.xtext.haxe.haxe.FunctionDeclaration;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.HaxeFactory;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.IfExpression;
import ee.xtext.haxe.haxe.IntLiteral;
import ee.xtext.haxe.haxe.MemberFeatureCall;
import ee.xtext.haxe.haxe.NullLiteral;
import ee.xtext.haxe.haxe.ObjectElement;
import ee.xtext.haxe.haxe.ObjectLiteral;
import ee.xtext.haxe.haxe.Operation;
import ee.xtext.haxe.haxe.PostIncrementOperation;
import ee.xtext.haxe.haxe.PreIncrementOperation;
import ee.xtext.haxe.haxe.RegularExpressionLiteral;
import ee.xtext.haxe.haxe.ReturnExpression;
import ee.xtext.haxe.haxe.StringLiteral;
import ee.xtext.haxe.haxe.SuperExpression;
import ee.xtext.haxe.haxe.SwitchExpression;
import ee.xtext.haxe.haxe.ThisExpression;
import ee.xtext.haxe.haxe.ThrowExpression;
import ee.xtext.haxe.haxe.TryCatchExpression;
import ee.xtext.haxe.haxe.Type;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
import ee.xtext.haxe.haxe.VariableMemberDeclaration;
import ee.xtext.haxe.haxe.WhileExpression;

import org.eclipse.emf.ecore.EClass;
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
      case HaxePackage.TYPE: return createType();
      case HaxePackage.CLASS: return createClass();
      case HaxePackage.CLASS_MEMBER: return createClassMember();
      case HaxePackage.TYPE_REFERENCE: return createTypeReference();
      case HaxePackage.FEATURE: return createFeature();
      case HaxePackage.FORMAL_PARAMETER: return createFormalParameter();
      case HaxePackage.EXPRESSION: return createExpression();
      case HaxePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case HaxePackage.VARIABLE_MEMBER_DECLARATION: return createVariableMemberDeclaration();
      case HaxePackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case HaxePackage.CATCH_CLAUSE: return createCatchClause();
      case HaxePackage.CASE_PART: return createCasePart();
      case HaxePackage.OBJECT_ELEMENT: return createObjectElement();
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
      case HaxePackage.IF_EXPRESSION: return createIfExpression();
      case HaxePackage.WHILE_EXPRESSION: return createWhileExpression();
      case HaxePackage.DO_WHILE_EXPRESSION: return createDoWhileExpression();
      case HaxePackage.FOR_LOOP_EXPRESSION: return createForLoopExpression();
      case HaxePackage.RETURN_EXPRESSION: return createReturnExpression();
      case HaxePackage.BREAK_EXPRESSION: return createBreakExpression();
      case HaxePackage.THROW_EXPRESSION: return createThrowExpression();
      case HaxePackage.TRY_CATCH_EXPRESSION: return createTryCatchExpression();
      case HaxePackage.SWITCH_EXPRESSION: return createSwitchExpression();
      case HaxePackage.FUNCTION_EXPRESSION: return createFunctionExpression();
      case HaxePackage.THIS_EXPRESSION: return createThisExpression();
      case HaxePackage.SUPER_EXPRESSION: return createSuperExpression();
      case HaxePackage.FEATURE_CALL: return createFeatureCall();
      case HaxePackage.CONSTRUCTOR_CALL: return createConstructorCall();
      case HaxePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case HaxePackage.NULL_LITERAL: return createNullLiteral();
      case HaxePackage.INT_LITERAL: return createIntLiteral();
      case HaxePackage.FLOAT_LITERAL: return createFloatLiteral();
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
  public ClassMember createClassMember()
  {
    ClassMemberImpl classMember = new ClassMemberImpl();
    return classMember;
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
  public FormalParameter createFormalParameter()
  {
    FormalParameterImpl formalParameter = new FormalParameterImpl();
    return formalParameter;
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
  public VariableMemberDeclaration createVariableMemberDeclaration()
  {
    VariableMemberDeclarationImpl variableMemberDeclaration = new VariableMemberDeclarationImpl();
    return variableMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
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
  public ThisExpression createThisExpression()
  {
    ThisExpressionImpl thisExpression = new ThisExpressionImpl();
    return thisExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperExpression createSuperExpression()
  {
    SuperExpressionImpl superExpression = new SuperExpressionImpl();
    return superExpression;
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
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
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
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
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
