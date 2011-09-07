/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.impl;

import ee.xtext.haxe.haxe.*;

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
      case HaxePackage.FILE: return createFile();
      case HaxePackage.TYPE_REFERENCE: return createTypeReference();
      case HaxePackage.EXPRESSION: return createExpression();
      case HaxePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case HaxePackage.FEATURE: return createFeature();
      case HaxePackage.XEXPRESSION: return createXExpression();
      case HaxePackage.ASSIGNMENT: return createAssignment();
      case HaxePackage.OPERATION: return createOperation();
      case HaxePackage.UNARY_OPERATION: return createUnaryOperation();
      case HaxePackage.PRE_INCREMENT_OPERATION: return createPreIncrementOperation();
      case HaxePackage.POST_INCREMENT_OPERATION: return createPostIncrementOperation();
      case HaxePackage.MEMBER_FEATURE_CALL: return createMemberFeatureCall();
      case HaxePackage.BLOCK_EXPRESSION: return createBlockExpression();
      case HaxePackage.VARIABLE_DECLARATIONS: return createVariableDeclarations();
      case HaxePackage.FEATURE_CALL: return createFeatureCall();
      case HaxePackage.CONSTRUCTOR_CALL: return createConstructorCall();
      case HaxePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case HaxePackage.NULL_LITERAL: return createNullLiteral();
      case HaxePackage.INT_LITERAL: return createIntLiteral();
      case HaxePackage.FLOAT_LITERAL: return createFloatLiteral();
      case HaxePackage.STRING_LITERAL: return createStringLiteral();
      case HaxePackage.REGULAR_EXPRESSION_LITERAL: return createRegularExpressionLiteral();
      case HaxePackage.ARRAY_LITERAL: return createArrayLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
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
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
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
