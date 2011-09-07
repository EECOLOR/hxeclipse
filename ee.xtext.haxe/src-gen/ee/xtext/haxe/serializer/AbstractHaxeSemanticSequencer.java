package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import ee.xtext.haxe.haxe.ArrayLiteral;
import ee.xtext.haxe.haxe.Assignment;
import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.BooleanLiteral;
import ee.xtext.haxe.haxe.ConstructorCall;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.File;
import ee.xtext.haxe.haxe.FloatLiteral;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.IntLiteral;
import ee.xtext.haxe.haxe.MemberFeatureCall;
import ee.xtext.haxe.haxe.NullLiteral;
import ee.xtext.haxe.haxe.Operation;
import ee.xtext.haxe.haxe.PostIncrementOperation;
import ee.xtext.haxe.haxe.PreIncrementOperation;
import ee.xtext.haxe.haxe.RegularExpressionLiteral;
import ee.xtext.haxe.haxe.StringLiteral;
import ee.xtext.haxe.haxe.TypeReference;
import ee.xtext.haxe.haxe.UnaryOperation;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getBooleanLiteralRule()) {
					sequence_BooleanLiteral_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getConstructorCallRule()) {
					sequence_ConstructorCall_ConstructorCall(context, (ConstructorCall) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getFeatureCallRule()) {
					sequence_FeatureCall_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.FILE:
				if(context == grammarAccess.getFileRule()) {
					sequence_File_File(context, (File) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getFloatLiteralRule()) {
					sequence_FloatLiteral_FloatLiteral(context, (FloatLiteral) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_Expression_NullLiteral(context, (NullLiteral) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_DivideExpression_Operation(context, (Operation) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getRegularExpressionLiteralRule()) {
					sequence_RegularExpressionLiteral_RegularExpressionLiteral(context, (RegularExpressionLiteral) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral_StringLiteral(context, (StringLiteral) semanticObject); 
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
				   context == grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getExpressionInsideBlockRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_UnaryOperation_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case HaxePackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getFeatureRule()) {
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
	 *     ((feature=[Feature|IdOrSuper] value=Assignment) | (assignable=MemberFeatureCall_Assignment_1_0_0_0_0 feature=[Feature|ValidID] value=Assignment))
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
	 *     (constructor=QualifiedName (arguments+=Expression arguments+=Expression*)?)
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
	 *     {NullLiteral}
	 *
	 * Features:
	 */
	protected void sequence_Expression_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|IdOrSuper] (explicitOperationCall?='(' (arguments+=Expression arguments+=Expression*)?)?)
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
	 *     blockExpression+=BlockExpression*
	 *
	 * Features:
	 *    blockExpression[0, *]
	 */
	protected void sequence_File_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
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
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (
	 *         target=MemberFeatureCall_MemberFeatureCall_1_1_0_0_0 
	 *         feature=ValidID 
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
	 *     (type=QualifiedName (arguments+=TypeReference arguments+=TypeReference*)?)
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
}
