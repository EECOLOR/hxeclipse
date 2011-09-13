/**
 * <copyright>
 * </copyright>
 *

 */
package ee.xtext.haxe.haxe.util;

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
import ee.xtext.haxe.haxe.ClassOrInterface;
import ee.xtext.haxe.haxe.ClassOrInterfaceReference;
import ee.xtext.haxe.haxe.Constructor;
import ee.xtext.haxe.haxe.ConstructorCall;
import ee.xtext.haxe.haxe.DoWhileExpression;
import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.FloatLiteral;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FormalParameter;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.FunctionMemberDeclaration;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.IfExpression;
import ee.xtext.haxe.haxe.Import;
import ee.xtext.haxe.haxe.IntLiteral;
import ee.xtext.haxe.haxe.Interface;
import ee.xtext.haxe.haxe.MemberFeatureCall;
import ee.xtext.haxe.haxe.Modifier;
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
import ee.xtext.haxe.haxe.TypeParameter;
import ee.xtext.haxe.haxe.TypeParameters;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.Typedef;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.Using;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
import ee.xtext.haxe.haxe.VariableMemberDeclaration;
import ee.xtext.haxe.haxe.WhileExpression;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ee.xtext.haxe.haxe.HaxePackage
 * @generated
 */
public class HaxeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HaxePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HaxeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HaxePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HaxeSwitch<Adapter> modelSwitch =
    new HaxeSwitch<Adapter>()
    {
      @Override
      public Adapter casePackage(ee.xtext.haxe.haxe.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseUsing(Using object)
      {
        return createUsingAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseClassOrInterface(ClassOrInterface object)
      {
        return createClassOrInterfaceAdapter();
      }
      @Override
      public Adapter caseClass(ee.xtext.haxe.haxe.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseClassMember(ClassMember object)
      {
        return createClassMemberAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseEnum(ee.xtext.haxe.haxe.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEnumConstructor(EnumConstructor object)
      {
        return createEnumConstructorAdapter();
      }
      @Override
      public Adapter caseTypedef(Typedef object)
      {
        return createTypedefAdapter();
      }
      @Override
      public Adapter caseTypeReference(TypeReference object)
      {
        return createTypeReferenceAdapter();
      }
      @Override
      public Adapter caseClassOrInterfaceReference(ClassOrInterfaceReference object)
      {
        return createClassOrInterfaceReferenceAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableMemberDeclaration(VariableMemberDeclaration object)
      {
        return createVariableMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseFunctionMemberDeclaration(FunctionMemberDeclaration object)
      {
        return createFunctionMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseFormalParameter(FormalParameter object)
      {
        return createFormalParameterAdapter();
      }
      @Override
      public Adapter caseModifier(Modifier object)
      {
        return createModifierAdapter();
      }
      @Override
      public Adapter caseTypeParameters(TypeParameters object)
      {
        return createTypeParametersAdapter();
      }
      @Override
      public Adapter caseTypeParameter(TypeParameter object)
      {
        return createTypeParameterAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCatchClause(CatchClause object)
      {
        return createCatchClauseAdapter();
      }
      @Override
      public Adapter caseCasePart(CasePart object)
      {
        return createCasePartAdapter();
      }
      @Override
      public Adapter caseObjectElement(ObjectElement object)
      {
        return createObjectElementAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseUnaryOperation(UnaryOperation object)
      {
        return createUnaryOperationAdapter();
      }
      @Override
      public Adapter casePreIncrementOperation(PreIncrementOperation object)
      {
        return createPreIncrementOperationAdapter();
      }
      @Override
      public Adapter casePostIncrementOperation(PostIncrementOperation object)
      {
        return createPostIncrementOperationAdapter();
      }
      @Override
      public Adapter caseArrayAssignment(ArrayAssignment object)
      {
        return createArrayAssignmentAdapter();
      }
      @Override
      public Adapter caseMemberFeatureCall(MemberFeatureCall object)
      {
        return createMemberFeatureCallAdapter();
      }
      @Override
      public Adapter caseArrayAccess(ArrayAccess object)
      {
        return createArrayAccessAdapter();
      }
      @Override
      public Adapter caseBlockExpression(BlockExpression object)
      {
        return createBlockExpressionAdapter();
      }
      @Override
      public Adapter caseVariableDeclarations(VariableDeclarations object)
      {
        return createVariableDeclarationsAdapter();
      }
      @Override
      public Adapter caseIfExpression(IfExpression object)
      {
        return createIfExpressionAdapter();
      }
      @Override
      public Adapter caseWhileExpression(WhileExpression object)
      {
        return createWhileExpressionAdapter();
      }
      @Override
      public Adapter caseDoWhileExpression(DoWhileExpression object)
      {
        return createDoWhileExpressionAdapter();
      }
      @Override
      public Adapter caseForLoopExpression(ForLoopExpression object)
      {
        return createForLoopExpressionAdapter();
      }
      @Override
      public Adapter caseReturnExpression(ReturnExpression object)
      {
        return createReturnExpressionAdapter();
      }
      @Override
      public Adapter caseBreakExpression(BreakExpression object)
      {
        return createBreakExpressionAdapter();
      }
      @Override
      public Adapter caseThrowExpression(ThrowExpression object)
      {
        return createThrowExpressionAdapter();
      }
      @Override
      public Adapter caseTryCatchExpression(TryCatchExpression object)
      {
        return createTryCatchExpressionAdapter();
      }
      @Override
      public Adapter caseSwitchExpression(SwitchExpression object)
      {
        return createSwitchExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionExpression(FunctionExpression object)
      {
        return createFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseThisExpression(ThisExpression object)
      {
        return createThisExpressionAdapter();
      }
      @Override
      public Adapter caseSuperExpression(SuperExpression object)
      {
        return createSuperExpressionAdapter();
      }
      @Override
      public Adapter caseFeatureCall(FeatureCall object)
      {
        return createFeatureCallAdapter();
      }
      @Override
      public Adapter caseConstructorCall(ConstructorCall object)
      {
        return createConstructorCallAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseFloatLiteral(FloatLiteral object)
      {
        return createFloatLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseRegularExpressionLiteral(RegularExpressionLiteral object)
      {
        return createRegularExpressionLiteralAdapter();
      }
      @Override
      public Adapter caseArrayLiteral(ArrayLiteral object)
      {
        return createArrayLiteralAdapter();
      }
      @Override
      public Adapter caseObjectLiteral(ObjectLiteral object)
      {
        return createObjectLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Using
   * @generated
   */
  public Adapter createUsingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ClassOrInterface <em>Class Or Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ClassOrInterface
   * @generated
   */
  public Adapter createClassOrInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ClassMember
   * @generated
   */
  public Adapter createClassMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.EnumConstructor <em>Enum Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.EnumConstructor
   * @generated
   */
  public Adapter createEnumConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Typedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Typedef
   * @generated
   */
  public Adapter createTypedefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.TypeReference
   * @generated
   */
  public Adapter createTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ClassOrInterfaceReference <em>Class Or Interface Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ClassOrInterfaceReference
   * @generated
   */
  public Adapter createClassOrInterfaceReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.VariableMemberDeclaration <em>Variable Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.VariableMemberDeclaration
   * @generated
   */
  public Adapter createVariableMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.FunctionMemberDeclaration <em>Function Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.FunctionMemberDeclaration
   * @generated
   */
  public Adapter createFunctionMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.FormalParameter
   * @generated
   */
  public Adapter createFormalParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Modifier
   * @generated
   */
  public Adapter createModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.TypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.TypeParameters
   * @generated
   */
  public Adapter createTypeParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.TypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.TypeParameter
   * @generated
   */
  public Adapter createTypeParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.CatchClause <em>Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.CatchClause
   * @generated
   */
  public Adapter createCatchClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.CasePart <em>Case Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.CasePart
   * @generated
   */
  public Adapter createCasePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ObjectElement <em>Object Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ObjectElement
   * @generated
   */
  public Adapter createObjectElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.UnaryOperation
   * @generated
   */
  public Adapter createUnaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.PreIncrementOperation <em>Pre Increment Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.PreIncrementOperation
   * @generated
   */
  public Adapter createPreIncrementOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.PostIncrementOperation <em>Post Increment Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.PostIncrementOperation
   * @generated
   */
  public Adapter createPostIncrementOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ArrayAssignment <em>Array Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ArrayAssignment
   * @generated
   */
  public Adapter createArrayAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.MemberFeatureCall <em>Member Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.MemberFeatureCall
   * @generated
   */
  public Adapter createMemberFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ArrayAccess
   * @generated
   */
  public Adapter createArrayAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.BlockExpression <em>Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.BlockExpression
   * @generated
   */
  public Adapter createBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.VariableDeclarations <em>Variable Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.VariableDeclarations
   * @generated
   */
  public Adapter createVariableDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.IfExpression
   * @generated
   */
  public Adapter createIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.WhileExpression <em>While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.WhileExpression
   * @generated
   */
  public Adapter createWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.DoWhileExpression <em>Do While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.DoWhileExpression
   * @generated
   */
  public Adapter createDoWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ForLoopExpression <em>For Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ForLoopExpression
   * @generated
   */
  public Adapter createForLoopExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ReturnExpression <em>Return Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ReturnExpression
   * @generated
   */
  public Adapter createReturnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.BreakExpression <em>Break Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.BreakExpression
   * @generated
   */
  public Adapter createBreakExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ThrowExpression <em>Throw Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ThrowExpression
   * @generated
   */
  public Adapter createThrowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.TryCatchExpression <em>Try Catch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.TryCatchExpression
   * @generated
   */
  public Adapter createTryCatchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.SwitchExpression <em>Switch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.SwitchExpression
   * @generated
   */
  public Adapter createSwitchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.FunctionExpression
   * @generated
   */
  public Adapter createFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ThisExpression
   * @generated
   */
  public Adapter createThisExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.SuperExpression <em>Super Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.SuperExpression
   * @generated
   */
  public Adapter createSuperExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.FeatureCall
   * @generated
   */
  public Adapter createFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ConstructorCall <em>Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ConstructorCall
   * @generated
   */
  public Adapter createConstructorCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.FloatLiteral
   * @generated
   */
  public Adapter createFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.RegularExpressionLiteral <em>Regular Expression Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.RegularExpressionLiteral
   * @generated
   */
  public Adapter createRegularExpressionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ArrayLiteral
   * @generated
   */
  public Adapter createArrayLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ee.xtext.haxe.haxe.ObjectLiteral <em>Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ee.xtext.haxe.haxe.ObjectLiteral
   * @generated
   */
  public Adapter createObjectLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HaxeAdapterFactory
