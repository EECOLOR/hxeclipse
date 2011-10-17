package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import ee.xtext.haxe.haxe.ExternClass;
import ee.xtext.haxe.haxe.ExternClassConstructor;
import ee.xtext.haxe.haxe.ExternClassProperty;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.GetterSetterLiteral;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.IfExpression;
import ee.xtext.haxe.haxe.Import;
import ee.xtext.haxe.haxe.Interface;
import ee.xtext.haxe.haxe.InterfaceProperty;
import ee.xtext.haxe.haxe.MemberFeatureCall;
import ee.xtext.haxe.haxe.Metadata;
import ee.xtext.haxe.haxe.Method;
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
import ee.xtext.haxe.haxe.RegularExpressionLiteral;
import ee.xtext.haxe.haxe.ReturnExpression;
import ee.xtext.haxe.haxe.StringLiteral;
import ee.xtext.haxe.haxe.SwitchExpression;
import ee.xtext.haxe.haxe.ThrowExpression;
import ee.xtext.haxe.haxe.TryCatchExpression;
import ee.xtext.haxe.haxe.TypeParameter;
import ee.xtext.haxe.haxe.TypeParameters;
import ee.xtext.haxe.haxe.Typedef;
import ee.xtext.haxe.haxe.TypedefProperty;
import ee.xtext.haxe.haxe.TypedefType;
import ee.xtext.haxe.haxe.TypedefTypeProperty;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.UntypedExpression;
import ee.xtext.haxe.haxe.Using;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
import ee.xtext.haxe.haxe.WhileExpression;
import ee.xtext.haxe.services.HaxeGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractHaxeSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected HaxeGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HaxePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HaxePackage.ARRAY_ACCESS:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_MemberFeatureCall(context, (ArrayAccess) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ARRAY_ASSIGNMENT:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_MemberFeatureCall(context, (ArrayAssignment) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ARRAY_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ASSIGNMENT:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.BLOCK_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBlockExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_BlockExpression(context, (BlockExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.BREAK_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBreakExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getContinueExpressionRule() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Expression(context, (BreakExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CASE_PART:
				if(context == grammarAccess.getCasePartRule()) {
					sequence_CasePart(context, (CasePart) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CASE_PART_EXPRESSIONS:
				if(context == grammarAccess.getCasePartExpressionsRule()) {
					sequence_CasePartExpressions(context, (CasePartExpressions) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CAST_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Expression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CATCH_CLAUSE:
				if(context == grammarAccess.getCatchClauseRule()) {
					sequence_CatchClause(context, (CatchClause) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class(context, (ee.xtext.haxe.haxe.Class) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CLASS_CONSTRUCTOR:
				if(context == grammarAccess.getClassConstructorRule()) {
					sequence_ClassConstructor(context, (ClassConstructor) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CLASS_METHOD_REFERENCE:
				if(context == grammarAccess.getClassMethodReferenceRule() ||
				   context == grammarAccess.getGetterSetterRule()) {
					sequence_ClassMethodReference(context, (ClassMethodReference) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CLASS_PROPERTY:
				if(context == grammarAccess.getClassPropertyRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_ClassProperty(context, (ClassProperty) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CONSTRUCTOR_CALL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getConstructorCallRule() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ConstructorCall(context, (ConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.DO_WHILE_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDoWhileExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_DoWhileExpression(context, (DoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Enum(context, (ee.xtext.haxe.haxe.Enum) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ENUM_CONSTRUCTOR:
				if(context == grammarAccess.getEnumConstructorRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_EnumConstructor(context, (EnumConstructor) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.EXTERN_CLASS:
				if(context == grammarAccess.getExternClassRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ExternClass(context, (ExternClass) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.EXTERN_CLASS_CONSTRUCTOR:
				if(context == grammarAccess.getExternClassConstructorRule()) {
					sequence_ExternClassConstructor(context, (ExternClassConstructor) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.EXTERN_CLASS_PROPERTY:
				if(context == grammarAccess.getExternClassPropertyRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_ExternClassProperty(context, (ExternClassProperty) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FEATURE_CALL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getForLoopExpressionRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ForLoopExpression(context, (ForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getFunctionExpressionRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_FunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.GETTER_SETTER_LITERAL:
				if(context == grammarAccess.getGetterSetterRule() ||
				   context == grammarAccess.getGetterSetterLiteralRule()) {
					sequence_GetterSetterLiteral(context, (GetterSetterLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.IF_EXPRESSION:
				if(context == grammarAccess.getIfExpressionRule()) {
					sequence_IfExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_PrimaryExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule()) {
					sequence_ShortIfExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.INTERFACE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getInterfaceRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.INTERFACE_PROPERTY:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getInterfacePropertyRule()) {
					sequence_InterfaceProperty(context, (InterfaceProperty) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.MEMBER_FEATURE_CALL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_MemberFeatureCall(context, (MemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.METADATA:
				if(context == grammarAccess.getMetadataRule()) {
					sequence_Metadata(context, (Metadata) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.METHOD:
				if(context == grammarAccess.getClassMethodRule()) {
					sequence_ClassMethod(context, (Method) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExternClassMethodRule()) {
					sequence_ExternClassMethod(context, (Method) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Method) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInterfaceMethodRule()) {
					sequence_InterfaceMethod(context, (Method) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedefMethodRule()) {
					sequence_TypedefMethod(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.METHOD_SIGNATURE:
				if(context == grammarAccess.getMethodSignatureRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_MethodSignature(context, (MethodSignature) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.MODIFIER:
				if(context == grammarAccess.getMethodModifierRule()) {
					sequence_MethodModifier(context, (Modifier) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyModifierRule()) {
					sequence_PropertyModifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.NULL_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNullLiteralRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Expression(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMetadataExpressionRule() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OBJECT_ELEMENT:
				if(context == grammarAccess.getObjectElementRule()) {
					sequence_ObjectElement(context, (ObjectElement) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OBJECT_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getObjectLiteralRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ObjectLiteral(context, (ObjectLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OPERATION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_DivideExpression(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (ee.xtext.haxe.haxe.Package) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PARAMETER:
				if(context == grammarAccess.getOptionalParameterRule()) {
					sequence_OptionalParameter(context, (Parameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getMethodSignatureRule() ||
				   context == grammarAccess.getMethodSignatureAccess().getMethodSignatureArgumentTypesAction_1_0_0_0() ||
				   context == grammarAccess.getParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_ParameterizedTypeReference(context, (ParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.POST_INCREMENT_OPERATION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_PostIncrementOperation(context, (PostIncrementOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PRE_INCREMENT_OPERATION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_PreIncrementOperation(context, (PreIncrementOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.REGULAR_EXPRESSION_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMetadataExpressionRule() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRegularExpressionLiteralRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_RegularExpressionLiteral(context, (RegularExpressionLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.RETURN_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getReturnExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ReturnExpression(context, (ReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.STRING_LITERAL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMetadataExpressionRule() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.SWITCH_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSwitchExpressionRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_SwitchExpression(context, (SwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.THROW_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getThrowExpressionRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ThrowExpression(context, (ThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TRY_CATCH_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTryCatchExpressionRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_TryCatchExpression(context, (TryCatchExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPE_PARAMETER:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeParameterRule()) {
					sequence_TypeParameter(context, (TypeParameter) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPE_PARAMETERS:
				if(context == grammarAccess.getTypeParametersRule()) {
					sequence_TypeParameters(context, (TypeParameters) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPEDEF:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypedefRule()) {
					sequence_Typedef(context, (Typedef) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPEDEF_PROPERTY:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypedefPropertyRule()) {
					sequence_TypedefProperty(context, (TypedefProperty) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPEDEF_TYPE:
				if(context == grammarAccess.getTypeReferenceRule() ||
				   context == grammarAccess.getTypedefTypeRule()) {
					sequence_TypedefType(context, (TypedefType) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPEDEF_TYPE_PROPERTY:
				if(context == grammarAccess.getTypedefTypePropertyRule()) {
					sequence_TypedefTypeProperty(context, (TypedefTypeProperty) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.UNARY_OPERATION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.UNTYPED_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Expression(context, (UntypedExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.USING:
				if(context == grammarAccess.getUsingRule()) {
					sequence_Using(context, (Using) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_DECLARATIONS:
				if(context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getVariableDeclarationsRule()) {
					sequence_VariableDeclarations(context, (VariableDeclarations) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.WHILE_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionRule() ||
				   context == grammarAccess.getShortIfExpressionAccess().getIfExpressionIfAction_1_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getWhileExpressionRule()) {
					sequence_WhileExpression(context, (WhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elements+=Expression? elements+=Expression*)
	 *
	 * Features:
	 *    elements[0, *]
	 */
	protected void sequence_ArrayLiteral(EObject context, ArrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature=[Feature|FeatureID] value=Assignment) | 
	 *         (assignable=MemberFeatureCall_Assignment_1_0_0_0_0 feature=[Feature|FeatureID] value=Assignment)
	 *     )
	 *
	 * Features:
	 *    feature[0, 2]
	 *    value[0, 2]
	 *    assignable[0, 1]
	 *         EXCLUDE_IF_UNSET feature
	 *         MANDATORY_IF_SET feature
	 *         EXCLUDE_IF_UNSET value
	 *         MANDATORY_IF_SET value
	 *         EXCLUDE_IF_SET feature
	 *         EXCLUDE_IF_SET value
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=ExpressionInsideBlock*)
	 *
	 * Features:
	 *    expressions[0, *]
	 */
	protected void sequence_BlockExpression(EObject context, BlockExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=ExpressionInsideBlock*)
	 *
	 * Features:
	 *    expressions[0, *]
	 */
	protected void sequence_CasePartExpressions(EObject context, CasePartExpressions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Expression cases+=Expression? then=CasePartExpressions)
	 *
	 * Features:
	 *    cases[1, 2]
	 *    then[1, 1]
	 */
	protected void sequence_CasePart(EObject context, CasePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=Parameter expression=Expression)
	 *
	 * Features:
	 *    declaredParam[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_CatchClause(EObject context, CatchClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__DECLARED_PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__DECLARED_PARAM));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCatchClauseAccess().getDeclaredParamParameterParserRuleCall_2_0(), semanticObject.getDeclaredParam());
		feeder.accept(grammarAccess.getCatchClauseAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         visibility=Visibility? 
	 *         (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *         returnType=TypeReference? 
	 *         body=BlockExpression
	 *     )
	 *
	 * Features:
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    body[1, 1]
	 */
	protected void sequence_ClassConstructor(EObject context, ClassConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=[Method|ValidID]
	 *
	 * Features:
	 *    reference[1, 1]
	 */
	protected void sequence_ClassMethodReference(EObject context, ClassMethodReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.CLASS_METHOD_REFERENCE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.CLASS_METHOD_REFERENCE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassMethodReferenceAccess().getReferenceMethodValidIDParserRuleCall_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         modifier=MethodModifier 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *         returnType=TypeReference? 
	 *         untyped?='untyped'? 
	 *         body=BlockExpression
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    modifier[1, 1]
	 *    typeParameters[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    untyped[0, 1]
	 *    body[1, 1]
	 */
	protected void sequence_ClassMethod(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         modifier=PropertyModifier 
	 *         name=ValidID 
	 *         (getter=GetterSetter setter=GetterSetter)? 
	 *         type=TypeReference? 
	 *         expression=Expression?
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    modifier[1, 1]
	 *    getter[0, 1]
	 *         EXCLUDE_IF_UNSET setter
	 *         MANDATORY_IF_SET setter
	 *    setter[0, 1]
	 *         EXCLUDE_IF_UNSET getter
	 *         MANDATORY_IF_SET getter
	 *    type[0, 1]
	 *    expression[0, 1]
	 */
	protected void sequence_ClassProperty(EObject context, ClassProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         ((extends=ParameterizedTypeReference | implements+=ParameterizedTypeReference) implements+=ParameterizedTypeReference*)? 
	 *         constructor=ClassConstructor? 
	 *         (properties+=ClassProperty | methods+=ClassMethod)*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    typeParameters[0, 1]
	 *    extends[0, 1]
	 *         EXCLUDE_IF_SET implements
	 *    implements[0, *]
	 *    constructor[0, 1]
	 *    properties[0, *]
	 *    methods[0, *]
	 */
	protected void sequence_Class(EObject context, ee.xtext.haxe.haxe.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constructor=ParameterizedTypeReference arguments+=Expression? arguments+=Expression*)
	 *
	 * Features:
	 *    constructor[1, 1]
	 *    arguments[0, *]
	 */
	protected void sequence_ConstructorCall(EObject context, ConstructorCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=DivideExpression_Operation_1_0_0_0 feature=OpDivide right=ModuloExpression) | 
	 *         (left=ModuloExpression_Operation_1_0_0_0 feature=OpModulo right=UnaryOperation) | 
	 *         (left=MultiplyExpression_Operation_1_0_0_0 feature=OpMultiply right=DivideExpression) | 
	 *         (left=SubtractExpression_Operation_1_0_0_0 feature=OpSubtract right=MultiplyExpression) | 
	 *         (left=AddExpression_Operation_1_0_0_0 feature=OpAdd right=SubtractExpression) | 
	 *         (left=BitshiftExpression_Operation_1_0_0 feature=OpBitshift right=AddExpression) | 
	 *         (left=BitwiseExpression_Operation_1_0_0_0 feature=OpBitwise right=BitshiftExpression) | 
	 *         (left=CompareExpression_Operation_1_0_0 feature=OpCompare right=BitwiseExpression) | 
	 *         (left=OtherOperatorExpression_Operation_1_0_0_0 feature=OpOther right=CompareExpression) | 
	 *         (left=AndExpression_Operation_1_0_0_0 feature=OpAnd right=OtherOperatorExpression) | 
	 *         (left=OrExpression_Operation_1_0_0_0 feature=OpOr right=AndExpression) | 
	 *         (left=Assignment_Operation_1_1_0_0 feature=OpMultiAssign right=Assignment)
	 *     )
	 *
	 * Features:
	 *    left[0, 12]
	 *    feature[0, 12]
	 *    right[0, 12]
	 */
	protected void sequence_DivideExpression(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=Expression predicate=Expression)
	 *
	 * Features:
	 *    body[1, 1]
	 *    predicate[1, 1]
	 */
	protected void sequence_DoWhileExpression(EObject context, DoWhileExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.DO_WHILE_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.DO_WHILE_EXPRESSION__BODY));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.DO_WHILE_EXPRESSION__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.DO_WHILE_EXPRESSION__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoWhileExpressionAccess().getBodyExpressionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getDoWhileExpressionAccess().getPredicateExpressionParserRuleCall_5_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metadata=Metadata? name=ValidID (parameters+=OptionalParameter parameters+=OptionalParameter*)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    parameters[0, *]
	 */
	protected void sequence_EnumConstructor(EObject context, EnumConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         extern='extern'? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         constructors+=EnumConstructor*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    extern[0, 1]
	 *    visibility[0, 1]
	 *    typeParameters[0, 1]
	 *    constructors[0, *]
	 */
	protected void sequence_Enum(EObject context, ee.xtext.haxe.haxe.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BreakExpression}
	 *
	 * Features:
	 */
	protected void sequence_Expression(EObject context, BreakExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=Expression | (target=Expression type=TypeReference))
	 *
	 * Features:
	 *    target[0, 2]
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET target
	 *         MANDATORY_IF_SET target
	 *         EXCLUDE_IF_SET target
	 */
	protected void sequence_Expression(EObject context, CastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 *
	 * Features:
	 */
	protected void sequence_Expression(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=Expression
	 *
	 * Features:
	 *    target[1, 1]
	 */
	protected void sequence_Expression(EObject context, UntypedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.UNTYPED_EXPRESSION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.UNTYPED_EXPRESSION__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getTargetExpressionParserRuleCall_2_2_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metadata=Metadata? visibility=Visibility? (parameters+=OptionalParameter parameters+=OptionalParameter*)? returnType=TypeReference?)
	 *
	 * Features:
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 */
	protected void sequence_ExternClassConstructor(EObject context, ExternClassConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         modifier=MethodModifier 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *         returnType=TypeReference? 
	 *         body=BlockExpression?
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    modifier[1, 1]
	 *    typeParameters[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    body[0, 1]
	 */
	protected void sequence_ExternClassMethod(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         modifier=PropertyModifier 
	 *         name=ValidID 
	 *         (getter=GetterSetter setter=GetterSetter)? 
	 *         type=TypeReference? 
	 *         expression=Expression?
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    modifier[1, 1]
	 *    getter[0, 1]
	 *         EXCLUDE_IF_UNSET setter
	 *         MANDATORY_IF_SET setter
	 *    setter[0, 1]
	 *         EXCLUDE_IF_UNSET getter
	 *         MANDATORY_IF_SET getter
	 *    type[0, 1]
	 *    expression[0, 1]
	 */
	protected void sequence_ExternClassProperty(EObject context, ExternClassProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         ((extends=ParameterizedTypeReference | implements+=ParameterizedTypeReference) implements+=ParameterizedTypeReference*)? 
	 *         constructor=ExternClassConstructor? 
	 *         properties+=ExternClassProperty* 
	 *         methods+=ExternClassMethod*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    typeParameters[0, 1]
	 *    extends[0, 1]
	 *         EXCLUDE_IF_SET implements
	 *    implements[0, *]
	 *    constructor[0, 1]
	 *    properties[0, *]
	 *    methods[0, *]
	 */
	protected void sequence_ExternClass(EObject context, ExternClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|FeatureID] (explicitOperationCall?='(' arguments+=Expression? arguments+=Expression*)?)
	 *
	 * Features:
	 *    feature[1, 1]
	 *    explicitOperationCall[0, 1]
	 *         MANDATORY_IF_SET arguments
	 *         MANDATORY_IF_SET arguments
	 *    arguments[0, *]
	 *         EXCLUDE_IF_UNSET explicitOperationCall
	 */
	protected void sequence_FeatureCall(EObject context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             metadata=Metadata? 
	 *             modifier=MethodModifier 
	 *             name=ValidID 
	 *             typeParameters=TypeParameters? 
	 *             (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *             returnType=TypeReference? 
	 *             untyped?='untyped'? 
	 *             body=BlockExpression
	 *         ) | 
	 *         (
	 *             metadata=Metadata? 
	 *             name=ValidID 
	 *             typeParameters=TypeParameters? 
	 *             (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *             returnType=TypeReference?
	 *         ) | 
	 *         (
	 *             metadata=Metadata? 
	 *             visibility=Visibility? 
	 *             name=ValidID 
	 *             typeParameters=TypeParameters? 
	 *             (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *             returnType=TypeReference?
	 *         ) | 
	 *         (
	 *             metadata=Metadata? 
	 *             modifier=MethodModifier 
	 *             name=ValidID 
	 *             typeParameters=TypeParameters? 
	 *             (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *             returnType=TypeReference? 
	 *             body=BlockExpression?
	 *         )
	 *     )
	 *
	 * Features:
	 *    name[0, 4]
	 *    metadata[0, 4]
	 *    modifier[0, 2]
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET visibility
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *    typeParameters[0, 4]
	 *    parameters[0, *]
	 *    returnType[0, 4]
	 *    untyped[0, 1]
	 *         EXCLUDE_IF_UNSET modifier
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET body
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET visibility
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET modifier
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET body
	 *    body[0, 2]
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET visibility
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *    visibility[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET modifier
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET untyped
	 *         EXCLUDE_IF_SET body
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET metadata
	 *         EXCLUDE_IF_SET modifier
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET typeParameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET parameters
	 *         EXCLUDE_IF_SET returnType
	 *         EXCLUDE_IF_SET body
	 */
	protected void sequence_Feature(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=Parameter forExpression=Expression body=Expression)
	 *
	 * Features:
	 *    declaredParam[1, 1]
	 *    forExpression[1, 1]
	 *    body[1, 1]
	 */
	protected void sequence_ForLoopExpression(EObject context, ForLoopExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__DECLARED_PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__DECLARED_PARAM));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__FOR_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__FOR_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.FOR_LOOP_EXPRESSION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getDeclaredParamParameterParserRuleCall_1_0_2_0(), semanticObject.getDeclaredParam());
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getForExpressionExpressionParserRuleCall_1_0_4_0(), semanticObject.getForExpression());
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getBodyExpressionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=OptionalParameter parameters+=OptionalParameter*)? returnType=TypeReference? body=BlockExpression)
	 *
	 * Features:
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    body[1, 1]
	 */
	protected void sequence_FunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='default' | value='null' | value='dynamic' | value='never')
	 *
	 * Features:
	 *    value[0, 4]
	 */
	protected void sequence_GetterSetterLiteral(EObject context, GetterSetterLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=Expression then=Expression else=Expression?)
	 *
	 * Features:
	 *    if[1, 1]
	 *    then[1, 1]
	 *    else[0, 1]
	 */
	protected void sequence_IfExpression(EObject context, IfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 *
	 * Features:
	 *    importedNamespace[1, 1]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *         returnType=TypeReference?
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    typeParameters[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 */
	protected void sequence_InterfaceMethod(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metadata=Metadata? name=ValidID (getter=GetterSetter setter=GetterSetter)? type=TypeReference)
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    getter[0, 1]
	 *         EXCLUDE_IF_UNSET setter
	 *         MANDATORY_IF_SET setter
	 *    setter[0, 1]
	 *         EXCLUDE_IF_UNSET getter
	 *         MANDATORY_IF_SET getter
	 *    type[1, 1]
	 */
	protected void sequence_InterfaceProperty(EObject context, InterfaceProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         extern='extern'? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         (implements+=ParameterizedTypeReference implements+=ParameterizedTypeReference*)? 
	 *         (properties+=InterfaceProperty | methods+=InterfaceMethod)*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    extern[0, 1]
	 *    visibility[0, 1]
	 *    typeParameters[0, 1]
	 *    implements[0, *]
	 *    properties[0, *]
	 *    methods[0, *]
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=MemberFeatureCall_ArrayAccess_1_3_0_0 feature=Expression (explicitOperationCall?='(' (arguments+=Expression arguments+=Expression*)?)?)
	 *
	 * Features:
	 *    target[1, 1]
	 *    feature[1, 1]
	 *    explicitOperationCall[0, 1]
	 *         MANDATORY_IF_SET arguments
	 *         MANDATORY_IF_SET arguments
	 *    arguments[0, *]
	 *         EXCLUDE_IF_UNSET explicitOperationCall
	 */
	protected void sequence_MemberFeatureCall(EObject context, ArrayAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assigname=MemberFeatureCall_ArrayAssignment_1_1_0_0_0 feature=Expression value=Assignment)
	 *
	 * Features:
	 *    assigname[1, 1]
	 *    feature[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_MemberFeatureCall(EObject context, ArrayAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__ASSIGNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__ASSIGNAME));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__FEATURE));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.ARRAY_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0(), semanticObject.getAssigname());
		feeder.accept(grammarAccess.getMemberFeatureCallAccess().getFeatureExpressionParserRuleCall_1_1_0_0_2_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         target=MemberFeatureCall_MemberFeatureCall_1_2_0_0_0 
	 *         feature=[Feature|FeatureID] 
	 *         (explicitOperationCall?='(' (arguments+=Expression arguments+=Expression*)?)?
	 *     )
	 *
	 * Features:
	 *    target[1, 1]
	 *    feature[1, 1]
	 *    explicitOperationCall[0, 1]
	 *         MANDATORY_IF_SET arguments
	 *         MANDATORY_IF_SET arguments
	 *    arguments[0, *]
	 *         EXCLUDE_IF_UNSET explicitOperationCall
	 */
	protected void sequence_MemberFeatureCall(EObject context, MemberFeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (compiler?=':' name=ValidID body=MetadataExpression?)
	 *
	 * Features:
	 *    compiler[1, 1]
	 *    name[1, 1]
	 *    body[0, 1]
	 */
	protected void sequence_Metadata(EObject context, Metadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?='static'? 
	 *         final?='final'? 
	 *         dynamic?='dynamic'? 
	 *         override?='override'? 
	 *         inline?='inline'? 
	 *         visibility=Visibility?
	 *     )
	 *
	 * Features:
	 *    static[0, 1]
	 *    final[0, 1]
	 *    dynamic[0, 1]
	 *    override[0, 1]
	 *    inline[0, 1]
	 *    visibility[0, 1]
	 */
	protected void sequence_MethodModifier(EObject context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (argumentTypes+=MethodSignature_MethodSignature_1_0_0_0 argumentTypes+=ParameterizedTypeReference* returnType=ParameterizedTypeReference) | 
	 *         (argumentTypes+=MethodSignature_MethodSignature_1_0_0_0 returnType=ParameterizedTypeReference)
	 *     )
	 *
	 * Features:
	 *    argumentTypes[0, *]
	 *         EXCLUDE_IF_SET returnType
	 *    returnType[0, 2]
	 *         EXCLUDE_IF_UNSET argumentTypes
	 *         MANDATORY_IF_SET argumentTypes
	 *         EXCLUDE_IF_SET argumentTypes
	 *         EXCLUDE_IF_SET argumentTypes
	 */
	protected void sequence_MethodSignature(EObject context, MethodSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=ValidID value=Expression)
	 *
	 * Features:
	 *    key[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ObjectElement(EObject context, ObjectElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.OBJECT_ELEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.OBJECT_ELEMENT__KEY));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.OBJECT_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.OBJECT_ELEMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectElementAccess().getKeyValidIDParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getObjectElementAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=ObjectElement elements+=ObjectElement*)
	 *
	 * Features:
	 *    elements[1, *]
	 */
	protected void sequence_ObjectLiteral(EObject context, ObjectLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='?'? name=ValidID type=TypeReference? defaultValue=Literal?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    defaultValue[0, 1]
	 *    optional[0, 1]
	 */
	protected void sequence_OptionalParameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName? 
	 *         (imports+=Import | using+=Using)* 
	 *         (classes+=Class | interfaces+=Interface | typedefs+=Typedef | enums+=Enum | externClasses+=ExternClass)*
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    imports[0, *]
	 *    using[0, *]
	 *    classes[0, *]
	 *    interfaces[0, *]
	 *    typedefs[0, *]
	 *    enums[0, *]
	 *    externClasses[0, *]
	 */
	protected void sequence_Package(EObject context, ee.xtext.haxe.haxe.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=TypeReference? defaultValue=Literal?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    defaultValue[0, 1]
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] (arguments+=TypeReference arguments+=TypeReference*)?)
	 *
	 * Features:
	 *    type[1, 1]
	 *    arguments[0, *]
	 */
	protected void sequence_ParameterizedTypeReference(EObject context, ParameterizedTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operand=MemberFeatureCall feature=OpIncrement)
	 *
	 * Features:
	 *    operand[1, 1]
	 *    feature[1, 1]
	 */
	protected void sequence_PostIncrementOperation(EObject context, PostIncrementOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.POST_INCREMENT_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.POST_INCREMENT_OPERATION__OPERAND));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.POST_INCREMENT_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.POST_INCREMENT_OPERATION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPostIncrementOperationAccess().getOperandMemberFeatureCallParserRuleCall_0_0_1_0(), semanticObject.getOperand());
		feeder.accept(grammarAccess.getPostIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_2_0(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=OpIncrement operand=PostIncrementOperation)
	 *
	 * Features:
	 *    feature[1, 1]
	 *    operand[1, 1]
	 */
	protected void sequence_PreIncrementOperation(EObject context, PreIncrementOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.PRE_INCREMENT_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.PRE_INCREMENT_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.PRE_INCREMENT_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.PRE_INCREMENT_OPERATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getPreIncrementOperationAccess().getOperandPostIncrementOperationParserRuleCall_0_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((if=ShortIfExpression_IfExpression_1_0_0 then=Expression else=Expression) | (if=Expression then=Expression else=Expression?))
	 *
	 * Features:
	 *    if[0, 2]
	 *    then[0, 2]
	 *    else[0, 2]
	 */
	protected void sequence_PrimaryExpression(EObject context, IfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static'? visibility=Visibility?)
	 *
	 * Features:
	 *    static[0, 1]
	 *    visibility[0, 1]
	 */
	protected void sequence_PropertyModifier(EObject context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=REGULAR_EXPRESSION
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_RegularExpressionLiteral(EObject context, RegularExpressionLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.REGULAR_EXPRESSION_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.REGULAR_EXPRESSION_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegularExpressionLiteralAccess().getValueREGULAR_EXPRESSIONTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 *
	 * Features:
	 *    expression[0, 1]
	 */
	protected void sequence_ReturnExpression(EObject context, ReturnExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((if=ShortIfExpression_IfExpression_1_0_0 then=Expression else=Expression) | (if=Expression then=Expression else=Expression?))
	 *
	 * Features:
	 *    if[0, 2]
	 *    then[0, 2]
	 *    else[0, 2]
	 */
	protected void sequence_ShortIfExpression(EObject context, IfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switch=Expression cases+=CasePart+ default=CasePartExpressions?)
	 *
	 * Features:
	 *    switch[1, 1]
	 *    cases[1, *]
	 *    default[0, 1]
	 */
	protected void sequence_SwitchExpression(EObject context, SwitchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_ThrowExpression(EObject context, ThrowExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.THROW_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.THROW_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThrowExpressionAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression catchClauses+=CatchClause+)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    catchClauses[1, *]
	 */
	protected void sequence_TryCatchExpression(EObject context, TryCatchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (constraints+=ParameterizedTypeReference constraints+=ParameterizedTypeReference*)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    constraints[0, *]
	 */
	protected void sequence_TypeParameter(EObject context, TypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=TypeParameter parameters+=TypeParameter*)
	 *
	 * Features:
	 *    parameters[1, *]
	 */
	protected void sequence_TypeParameters(EObject context, TypeParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         (parameters+=OptionalParameter parameters+=OptionalParameter*)? 
	 *         returnType=TypeReference?
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    typeParameters[0, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    visibility[0, 1]
	 */
	protected void sequence_TypedefMethod(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metadata=Metadata? visibility=Visibility? name=ValidID (getter=GetterSetter setter=GetterSetter)? type=TypeReference?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    getter[0, 1]
	 *         EXCLUDE_IF_UNSET setter
	 *         MANDATORY_IF_SET setter
	 *    setter[0, 1]
	 *         EXCLUDE_IF_UNSET getter
	 *         MANDATORY_IF_SET getter
	 *    type[0, 1]
	 */
	protected void sequence_TypedefProperty(EObject context, TypedefProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=TypeReference)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_TypedefTypeProperty(EObject context, TypedefTypeProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.TYPEDEF_TYPE_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.TYPEDEF_TYPE_PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.TYPEDEF_TYPE_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.TYPEDEF_TYPE_PROPERTY__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedefTypePropertyAccess().getNameValidIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypedefTypePropertyAccess().getTypeTypeReferenceParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (properties+=TypedefTypeProperty properties+=TypedefTypeProperty*)
	 *
	 * Features:
	 *    properties[1, *]
	 */
	protected void sequence_TypedefType(EObject context, TypedefType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         metadata=Metadata? 
	 *         visibility=Visibility? 
	 *         name=ValidID 
	 *         typeParameters=TypeParameters? 
	 *         ((extends=ParameterizedTypeReference? (properties+=TypedefProperty | methods+=TypedefMethod)*) | type=ParameterizedTypeReference)
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    metadata[0, 1]
	 *    visibility[0, 1]
	 *    typeParameters[0, 1]
	 *    extends[0, 1]
	 *         EXCLUDE_IF_SET type
	 *    properties[0, *]
	 *         EXCLUDE_IF_SET type
	 *    methods[0, *]
	 *         EXCLUDE_IF_SET type
	 *    type[0, 1]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET properties
	 *         EXCLUDE_IF_SET methods
	 */
	protected void sequence_Typedef(EObject context, Typedef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=OpUnary operand=PreIncrementOperation)
	 *
	 * Features:
	 *    feature[1, 1]
	 *    operand[1, 1]
	 */
	protected void sequence_UnaryOperation(EObject context, UnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.UNARY_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.UNARY_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.UNARY_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.UNARY_OPERATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getUnaryOperationAccess().getOperandPreIncrementOperationParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedClass=QualifiedName
	 *
	 * Features:
	 *    importedClass[1, 1]
	 */
	protected void sequence_Using(EObject context, Using semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.USING__IMPORTED_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.USING__IMPORTED_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsingAccess().getImportedClassQualifiedNameParserRuleCall_1_0(), semanticObject.getImportedClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=TypeReference? expression=Expression?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    expression[0, 1]
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=VariableDeclaration declarations+=VariableDeclaration*)
	 *
	 * Features:
	 *    declarations[1, *]
	 */
	protected void sequence_VariableDeclarations(EObject context, VariableDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Expression body=Expression)
	 *
	 * Features:
	 *    predicate[1, 1]
	 *    body[1, 1]
	 */
	protected void sequence_WhileExpression(EObject context, WhileExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.WHILE_EXPRESSION__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.WHILE_EXPRESSION__PREDICATE));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.WHILE_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.WHILE_EXPRESSION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileExpressionAccess().getPredicateExpressionParserRuleCall_3_0(), semanticObject.getPredicate());
		feeder.accept(grammarAccess.getWhileExpressionAccess().getBodyExpressionParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
}
