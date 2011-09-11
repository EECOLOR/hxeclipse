package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import ee.xtext.haxe.haxe.ArrayAccess;
import ee.xtext.haxe.haxe.ArrayAssignment;
import ee.xtext.haxe.haxe.ArrayLiteral;
import ee.xtext.haxe.haxe.Assignment;
import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.BooleanLiteral;
import ee.xtext.haxe.haxe.BreakExpression;
import ee.xtext.haxe.haxe.CasePart;
import ee.xtext.haxe.haxe.CatchClause;
import ee.xtext.haxe.haxe.ConstructorCall;
import ee.xtext.haxe.haxe.DoWhileExpression;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.FloatLiteral;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FormalParameter;
import ee.xtext.haxe.haxe.FunctionDeclaration;
import ee.xtext.haxe.haxe.FunctionExpression;
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
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
import ee.xtext.haxe.haxe.VariableMemberDeclaration;
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
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_MemberFeatureCall_ArrayAccess(context, (ArrayAccess) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ARRAY_ASSIGNMENT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_MemberFeatureCall_ArrayAssignment(context, (ArrayAssignment) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ARRAY_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getArrayLiteralRule()) {
					sequence_ArrayLiteral_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.ASSIGNMENT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_Assignment_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.BLOCK_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getBlockExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_BlockExpression_BlockExpression(context, (BlockExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getBooleanLiteralRule()) {
					sequence_BooleanLiteral_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.BREAK_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getBreakExpressionRule() ||
				   context == grammarAccess.getContinueExpressionRule()) {
					sequence_Expression_BreakExpression(context, (BreakExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CASE_PART:
				if(context == grammarAccess.getCasePartRule()) {
					sequence_CasePart_CasePart(context, (CasePart) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CATCH_CLAUSE:
				if(context == grammarAccess.getCatchClauseRule()) {
					sequence_CatchClause_CatchClause(context, (CatchClause) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CLASS:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getClassRule()) {
					sequence_Class_Class(context, (ee.xtext.haxe.haxe.Class) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.CONSTRUCTOR_CALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getConstructorCallRule()) {
					sequence_ConstructorCall_ConstructorCall(context, (ConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.DO_WHILE_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getDoWhileExpressionRule()) {
					sequence_DoWhileExpression_DoWhileExpression(context, (DoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FEATURE_CALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getFeatureCallRule()) {
					sequence_FeatureCall_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FLOAT_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getFloatLiteralRule()) {
					sequence_FloatLiteral_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getForLoopExpressionRule()) {
					sequence_ForLoopExpression_ForLoopExpression(context, (ForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FORMAL_PARAMETER:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFormalParameterRule()) {
					sequence_FormalParameter_FormalParameter(context, (FormalParameter) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getClassMemberRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFunctionMemberDeclarationRule()) {
					sequence_FunctionMemberDeclaration_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getFunctionExpressionRule()) {
					sequence_FunctionExpression_FunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.IF_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getIfExpressionRule()) {
					sequence_IfExpression_IfExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.INT_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getIntLiteralRule()) {
					sequence_IntLiteral_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.MEMBER_FEATURE_CALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_MemberFeatureCall_MemberFeatureCall(context, (MemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.NULL_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_Expression_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OBJECT_ELEMENT:
				if(context == grammarAccess.getObjectElementRule()) {
					sequence_ObjectElement_ObjectElement(context, (ObjectElement) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OBJECT_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getObjectLiteralRule()) {
					sequence_ObjectLiteral_ObjectLiteral(context, (ObjectLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_DivideExpression_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package_Package(context, (ee.xtext.haxe.haxe.Package) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.POST_INCREMENT_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_PostIncrementOperation_PostIncrementOperation(context, (PostIncrementOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.PRE_INCREMENT_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_PreIncrementOperation_PreIncrementOperation(context, (PreIncrementOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.REGULAR_EXPRESSION_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getRegularExpressionLiteralRule()) {
					sequence_RegularExpressionLiteral_RegularExpressionLiteral(context, (RegularExpressionLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.RETURN_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getReturnExpressionRule()) {
					sequence_ReturnExpression_ReturnExpression(context, (ReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.STRING_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.SUPER_EXPRESSION:
				if(context == grammarAccess.getSuperExpressionRule()) {
					sequence_SuperExpression_SuperExpression(context, (SuperExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.SWITCH_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getSwitchExpressionRule()) {
					sequence_SwitchExpression_SwitchExpression(context, (SwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.THIS_EXPRESSION:
				if(context == grammarAccess.getThisExpressionRule()) {
					sequence_ThisExpression_ThisExpression(context, (ThisExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.THROW_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getThrowExpressionRule()) {
					sequence_ThrowExpression_ThrowExpression(context, (ThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TRY_CATCH_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getTryCatchExpressionRule()) {
					sequence_TryCatchExpression_TryCatchExpression(context, (TryCatchExpression) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.TYPE_REFERENCE:
				if(context == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeReference_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.UNARY_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_UnaryOperation_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_DECLARATIONS:
				if(context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getVariableDeclarationsRule()) {
					sequence_VariableDeclarations_VariableDeclarations(context, (VariableDeclarations) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_MEMBER_DECLARATION:
				if(context == grammarAccess.getClassMemberRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getVariableMemberDeclarationRule()) {
					sequence_VariableMemberDeclaration_VariableMemberDeclaration(context, (VariableMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.WHILE_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitwiseExpressionRule() ||
				   context == grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBitshiftExpressionRule() ||
				   context == grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getSubtractExpressionRule() ||
				   context == grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplyExpressionRule() ||
				   context == grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDivideExpressionRule() ||
				   context == grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getModuloExpressionRule() ||
				   context == grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getPreIncrementOperationRule() ||
				   context == grammarAccess.getPostIncrementOperationRule() ||
				   context == grammarAccess.getMemberFeatureCallRule() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getWhileExpressionRule()) {
					sequence_WhileExpression_WhileExpression(context, (WhileExpression) semanticObject); 
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
	protected void sequence_ArrayLiteral_ArrayLiteral(EObject context, ArrayLiteral semanticObject) {
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
	 *    feature[2, 2]
	 *    value[2, 2]
	 *    assignable[1, 1]
	 *         EXCLUDE_IF_UNSET feature
	 *         MANDATORY_IF_SET feature
	 *         EXCLUDE_IF_UNSET value
	 *         MANDATORY_IF_SET value
	 *         EXCLUDE_IF_SET feature
	 *         EXCLUDE_IF_SET value
	 */
	protected void sequence_Assignment_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=ExpressionInsideBlock*)
	 *
	 * Features:
	 *    expressions[0, *]
	 */
	protected void sequence_BlockExpression_BlockExpression(EObject context, BlockExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 *
	 * Features:
	 *    isTrue[0, 1]
	 */
	protected void sequence_BooleanLiteral_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Expression cases+=Expression? then=Expression)
	 *
	 * Features:
	 *    cases[1, 2]
	 *    then[1, 1]
	 */
	protected void sequence_CasePart_CasePart(EObject context, CasePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=FormalParameter expression=Expression)
	 *
	 * Features:
	 *    declaredParam[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_CatchClause_CatchClause(EObject context, CatchClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__DECLARED_PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__DECLARED_PARAM));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.CATCH_CLAUSE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCatchClauseAccess().getDeclaredParamFormalParameterParserRuleCall_2_0(), semanticObject.getDeclaredParam());
		feeder.accept(grammarAccess.getCatchClauseAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName members+=ClassMember+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    members[1, *]
	 */
	protected void sequence_Class_Class(EObject context, ee.xtext.haxe.haxe.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constructor=[Type|QualifiedName] arguments+=Expression? arguments+=Expression*)
	 *
	 * Features:
	 *    constructor[1, 1]
	 *    arguments[0, *]
	 */
	protected void sequence_ConstructorCall_ConstructorCall(EObject context, ConstructorCall semanticObject) {
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
	 *         (left=BitshiftExpression_Operation_1_0_0_0 feature=OpBitshift right=AddExpression) | 
	 *         (left=BitwiseExpression_Operation_1_0_0_0 feature=OpBitwise right=BitshiftExpression) | 
	 *         (left=CompareExpression_Operation_1_0_0_0 feature=OpCompare right=BitwiseExpression) | 
	 *         (left=OtherOperatorExpression_Operation_1_0_0_0 feature=OpOther right=CompareExpression) | 
	 *         (left=AndExpression_Operation_1_0_0_0 feature=OpAnd right=OtherOperatorExpression) | 
	 *         (left=OrExpression_Operation_1_0_0_0 feature=OpOr right=AndExpression) | 
	 *         (left=Assignment_Operation_1_1_0_0_0 feature=OpMultiAssign right=Assignment)
	 *     )
	 *
	 * Features:
	 *    left[12, 12]
	 *    feature[12, 12]
	 *    right[12, 12]
	 */
	protected void sequence_DivideExpression_Operation(EObject context, Operation semanticObject) {
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
	protected void sequence_DoWhileExpression_DoWhileExpression(EObject context, DoWhileExpression semanticObject) {
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
	 *     {BreakExpression}
	 *
	 * Features:
	 */
	protected void sequence_Expression_BreakExpression(EObject context, BreakExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 *
	 * Features:
	 */
	protected void sequence_Expression_NullLiteral(EObject context, NullLiteral semanticObject) {
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
	protected void sequence_FeatureCall_FeatureCall(EObject context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Float
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_FloatLiteral_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.FLOAT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.FLOAT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFloatParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=FormalParameter forExpression=Expression body=Expression)
	 *
	 * Features:
	 *    declaredParam[1, 1]
	 *    forExpression[1, 1]
	 *    body[1, 1]
	 */
	protected void sequence_ForLoopExpression_ForLoopExpression(EObject context, ForLoopExpression semanticObject) {
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
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getDeclaredParamFormalParameterParserRuleCall_1_0_2_0(), semanticObject.getDeclaredParam());
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getForExpressionExpressionParserRuleCall_1_0_4_0(), semanticObject.getForExpression());
		feeder.accept(grammarAccess.getForLoopExpressionAccess().getBodyExpressionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=TypeReference?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 */
	protected void sequence_FormalParameter_FormalParameter(EObject context, FormalParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=FormalParameter parameters+=FormalParameter*)? returnType=[Type|QualifiedName]? body=BlockExpression)
	 *
	 * Features:
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    body[1, 1]
	 */
	protected void sequence_FunctionExpression_FunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (parameters+=FormalParameter parameters+=FormalParameter*)? returnType=[Type|QualifiedName]? body=BlockExpression)
	 *
	 * Features:
	 *    name[1, 1]
	 *    parameters[0, *]
	 *    returnType[0, 1]
	 *    body[1, 1]
	 */
	protected void sequence_FunctionMemberDeclaration_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
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
	protected void sequence_IfExpression_IfExpression(EObject context, IfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT?)
	 *
	 * Features:
	 *    value[0, 1]
	 */
	protected void sequence_IntLiteral_IntLiteral(EObject context, IntLiteral semanticObject) {
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
	protected void sequence_MemberFeatureCall_ArrayAccess(EObject context, ArrayAccess semanticObject) {
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
	protected void sequence_MemberFeatureCall_ArrayAssignment(EObject context, ArrayAssignment semanticObject) {
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
	protected void sequence_MemberFeatureCall_MemberFeatureCall(EObject context, MemberFeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ValidID value=Expression)
	 *
	 * Features:
	 *    key[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ObjectElement_ObjectElement(EObject context, ObjectElement semanticObject) {
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
	protected void sequence_ObjectLiteral_ObjectLiteral(EObject context, ObjectLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName? classes+=Class*)
	 *
	 * Features:
	 *    name[0, 1]
	 *    classes[0, *]
	 */
	protected void sequence_Package_Package(EObject context, ee.xtext.haxe.haxe.Package semanticObject) {
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
	protected void sequence_PostIncrementOperation_PostIncrementOperation(EObject context, PostIncrementOperation semanticObject) {
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
	protected void sequence_PreIncrementOperation_PreIncrementOperation(EObject context, PreIncrementOperation semanticObject) {
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
	 *     value=REGULAR_EXPRESSION
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_RegularExpressionLiteral_RegularExpressionLiteral(EObject context, RegularExpressionLiteral semanticObject) {
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
	protected void sequence_ReturnExpression_ReturnExpression(EObject context, ReturnExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_StringLiteral_StringLiteral(EObject context, StringLiteral semanticObject) {
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
	 *     {SuperExpression}
	 *
	 * Features:
	 */
	protected void sequence_SuperExpression_SuperExpression(EObject context, SuperExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switch=Expression cases+=CasePart+ default=Expression?)
	 *
	 * Features:
	 *    switch[1, 1]
	 *    cases[1, *]
	 *    default[0, 1]
	 */
	protected void sequence_SwitchExpression_SwitchExpression(EObject context, SwitchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ThisExpression}
	 *
	 * Features:
	 */
	protected void sequence_ThisExpression_ThisExpression(EObject context, ThisExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_ThrowExpression_ThrowExpression(EObject context, ThrowExpression semanticObject) {
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
	protected void sequence_TryCatchExpression_TryCatchExpression(EObject context, TryCatchExpression semanticObject) {
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
	protected void sequence_TypeReference_TypeReference(EObject context, TypeReference semanticObject) {
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
	protected void sequence_UnaryOperation_UnaryOperation(EObject context, UnaryOperation semanticObject) {
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
	 *     (name=ValidID type=TypeReference? expression=Expression?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    expression[0, 1]
	 */
	protected void sequence_VariableDeclaration_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=VariableDeclaration declarations+=VariableDeclaration*)
	 *
	 * Features:
	 *    declarations[1, *]
	 */
	protected void sequence_VariableDeclarations_VariableDeclarations(EObject context, VariableDeclarations semanticObject) {
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
	protected void sequence_VariableMemberDeclaration_VariableMemberDeclaration(EObject context, VariableMemberDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, HaxePackage.Literals.VARIABLE_MEMBER_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HaxePackage.Literals.VARIABLE_MEMBER_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableMemberDeclarationAccess().getNameValidIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableMemberDeclarationAccess().getTypeTypeReferenceParserRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Expression body=Expression)
	 *
	 * Features:
	 *    predicate[1, 1]
	 *    body[1, 1]
	 */
	protected void sequence_WhileExpression_WhileExpression(EObject context, WhileExpression semanticObject) {
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
