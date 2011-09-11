/*
* generated by Xtext
*/
package ee.xtext.haxe.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ee.xtext.haxe.services.HaxeGrammarAccess;

public class HaxeParser extends AbstractContentAssistParser {
	
	@Inject
	private HaxeGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ee.xtext.haxe.ui.contentassist.antlr.internal.InternalHaxeParser createParser() {
		ee.xtext.haxe.ui.contentassist.antlr.internal.InternalHaxeParser result = new ee.xtext.haxe.ui.contentassist.antlr.internal.InternalHaxeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getClassMemberAccess().getAlternatives(), "rule__ClassMember__Alternatives");
					put(grammarAccess.getFeatureIDAccess().getAlternatives(), "rule__FeatureID__Alternatives");
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getAssignmentAccess().getAlternatives(), "rule__Assignment__Alternatives");
					put(grammarAccess.getOpMultiAssignAccess().getAlternatives(), "rule__OpMultiAssign__Alternatives");
					put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
					put(grammarAccess.getOpBitwiseAccess().getAlternatives(), "rule__OpBitwise__Alternatives");
					put(grammarAccess.getOpBitshiftAccess().getAlternatives(), "rule__OpBitshift__Alternatives");
					put(grammarAccess.getUnaryOperationAccess().getAlternatives(), "rule__UnaryOperation__Alternatives");
					put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
					put(grammarAccess.getPreIncrementOperationAccess().getAlternatives(), "rule__PreIncrementOperation__Alternatives");
					put(grammarAccess.getPostIncrementOperationAccess().getAlternatives(), "rule__PostIncrementOperation__Alternatives");
					put(grammarAccess.getOpIncrementAccess().getAlternatives(), "rule__OpIncrement__Alternatives");
					put(grammarAccess.getMemberFeatureCallAccess().getAlternatives_1(), "rule__MemberFeatureCall__Alternatives_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getExpressionInsideBlockAccess().getAlternatives(), "rule__ExpressionInsideBlock__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
					put(grammarAccess.getIntLiteralAccess().getAlternatives_1(), "rule__IntLiteral__Alternatives_1");
					put(grammarAccess.getFloatAccess().getAlternatives(), "rule__Float__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_0(), "rule__Package__Group_0__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getTypeReferenceAccess().getGroup(), "rule__TypeReference__Group__0");
					put(grammarAccess.getTypeReferenceAccess().getGroup_1(), "rule__TypeReference__Group_1__0");
					put(grammarAccess.getTypeReferenceAccess().getGroup_1_2(), "rule__TypeReference__Group_1_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getFormalParameterAccess().getGroup(), "rule__FormalParameter__Group__0");
					put(grammarAccess.getFormalParameterAccess().getGroup_1(), "rule__FormalParameter__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_0(), "rule__Assignment__Group_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_1(), "rule__Assignment__Group_1_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_1_0(), "rule__Assignment__Group_1_1_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_1_0_0(), "rule__Assignment__Group_1_1_0_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0(), "rule__OrExpression__Group_1_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0_0(), "rule__OrExpression__Group_1_0_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0(), "rule__AndExpression__Group_1_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0_0(), "rule__AndExpression__Group_1_0_0__0");
					put(grammarAccess.getOtherOperatorExpressionAccess().getGroup(), "rule__OtherOperatorExpression__Group__0");
					put(grammarAccess.getOtherOperatorExpressionAccess().getGroup_1(), "rule__OtherOperatorExpression__Group_1__0");
					put(grammarAccess.getOtherOperatorExpressionAccess().getGroup_1_0(), "rule__OtherOperatorExpression__Group_1_0__0");
					put(grammarAccess.getOtherOperatorExpressionAccess().getGroup_1_0_0(), "rule__OtherOperatorExpression__Group_1_0_0__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup(), "rule__CompareExpression__Group__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1(), "rule__CompareExpression__Group_1__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1_0(), "rule__CompareExpression__Group_1_0__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0(), "rule__CompareExpression__Group_1_0_0__0");
					put(grammarAccess.getBitwiseExpressionAccess().getGroup(), "rule__BitwiseExpression__Group__0");
					put(grammarAccess.getBitwiseExpressionAccess().getGroup_1(), "rule__BitwiseExpression__Group_1__0");
					put(grammarAccess.getBitwiseExpressionAccess().getGroup_1_0(), "rule__BitwiseExpression__Group_1_0__0");
					put(grammarAccess.getBitwiseExpressionAccess().getGroup_1_0_0(), "rule__BitwiseExpression__Group_1_0_0__0");
					put(grammarAccess.getBitshiftExpressionAccess().getGroup(), "rule__BitshiftExpression__Group__0");
					put(grammarAccess.getBitshiftExpressionAccess().getGroup_1(), "rule__BitshiftExpression__Group_1__0");
					put(grammarAccess.getBitshiftExpressionAccess().getGroup_1_0(), "rule__BitshiftExpression__Group_1_0__0");
					put(grammarAccess.getBitshiftExpressionAccess().getGroup_1_0_0(), "rule__BitshiftExpression__Group_1_0_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup(), "rule__AddExpression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1(), "rule__AddExpression__Group_1__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0(), "rule__AddExpression__Group_1_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_0(), "rule__AddExpression__Group_1_0_0__0");
					put(grammarAccess.getSubtractExpressionAccess().getGroup(), "rule__SubtractExpression__Group__0");
					put(grammarAccess.getSubtractExpressionAccess().getGroup_1(), "rule__SubtractExpression__Group_1__0");
					put(grammarAccess.getSubtractExpressionAccess().getGroup_1_0(), "rule__SubtractExpression__Group_1_0__0");
					put(grammarAccess.getSubtractExpressionAccess().getGroup_1_0_0(), "rule__SubtractExpression__Group_1_0_0__0");
					put(grammarAccess.getMultiplyExpressionAccess().getGroup(), "rule__MultiplyExpression__Group__0");
					put(grammarAccess.getMultiplyExpressionAccess().getGroup_1(), "rule__MultiplyExpression__Group_1__0");
					put(grammarAccess.getMultiplyExpressionAccess().getGroup_1_0(), "rule__MultiplyExpression__Group_1_0__0");
					put(grammarAccess.getMultiplyExpressionAccess().getGroup_1_0_0(), "rule__MultiplyExpression__Group_1_0_0__0");
					put(grammarAccess.getDivideExpressionAccess().getGroup(), "rule__DivideExpression__Group__0");
					put(grammarAccess.getDivideExpressionAccess().getGroup_1(), "rule__DivideExpression__Group_1__0");
					put(grammarAccess.getDivideExpressionAccess().getGroup_1_0(), "rule__DivideExpression__Group_1_0__0");
					put(grammarAccess.getDivideExpressionAccess().getGroup_1_0_0(), "rule__DivideExpression__Group_1_0_0__0");
					put(grammarAccess.getModuloExpressionAccess().getGroup(), "rule__ModuloExpression__Group__0");
					put(grammarAccess.getModuloExpressionAccess().getGroup_1(), "rule__ModuloExpression__Group_1__0");
					put(grammarAccess.getModuloExpressionAccess().getGroup_1_0(), "rule__ModuloExpression__Group_1_0__0");
					put(grammarAccess.getModuloExpressionAccess().getGroup_1_0_0(), "rule__ModuloExpression__Group_1_0_0__0");
					put(grammarAccess.getUnaryOperationAccess().getGroup_0(), "rule__UnaryOperation__Group_0__0");
					put(grammarAccess.getPreIncrementOperationAccess().getGroup_0(), "rule__PreIncrementOperation__Group_0__0");
					put(grammarAccess.getPreIncrementOperationAccess().getGroup_0_0(), "rule__PreIncrementOperation__Group_0_0__0");
					put(grammarAccess.getPostIncrementOperationAccess().getGroup_0(), "rule__PostIncrementOperation__Group_0__0");
					put(grammarAccess.getPostIncrementOperationAccess().getGroup_0_0(), "rule__PostIncrementOperation__Group_0_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup(), "rule__MemberFeatureCall__Group__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_0(), "rule__MemberFeatureCall__Group_1_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_0_0(), "rule__MemberFeatureCall__Group_1_0_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_0_0_0(), "rule__MemberFeatureCall__Group_1_0_0_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_1(), "rule__MemberFeatureCall__Group_1_1__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_1_0(), "rule__MemberFeatureCall__Group_1_1_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_1_0_0(), "rule__MemberFeatureCall__Group_1_1_0_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2(), "rule__MemberFeatureCall__Group_1_2__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2_0(), "rule__MemberFeatureCall__Group_1_2_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2_0_0(), "rule__MemberFeatureCall__Group_1_2_0_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2_2(), "rule__MemberFeatureCall__Group_1_2_2__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2_2_1(), "rule__MemberFeatureCall__Group_1_2_2_1__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_2_2_1_1(), "rule__MemberFeatureCall__Group_1_2_2_1_1__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_3(), "rule__MemberFeatureCall__Group_1_3__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_3_0(), "rule__MemberFeatureCall__Group_1_3_0__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_3_4(), "rule__MemberFeatureCall__Group_1_3_4__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_3_4_1(), "rule__MemberFeatureCall__Group_1_3_4_1__0");
					put(grammarAccess.getMemberFeatureCallAccess().getGroup_1_3_4_1_1(), "rule__MemberFeatureCall__Group_1_3_4_1_1__0");
					put(grammarAccess.getBlockExpressionAccess().getGroup(), "rule__BlockExpression__Group__0");
					put(grammarAccess.getBlockExpressionAccess().getGroup_2(), "rule__BlockExpression__Group_2__0");
					put(grammarAccess.getVariableDeclarationsAccess().getGroup(), "rule__VariableDeclarations__Group__0");
					put(grammarAccess.getVariableDeclarationsAccess().getGroup_3(), "rule__VariableDeclarations__Group_3__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_2(), "rule__VariableDeclaration__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3(), "rule__VariableDeclaration__Group_3__0");
					put(grammarAccess.getVariableMemberDeclarationAccess().getGroup(), "rule__VariableMemberDeclaration__Group__0");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getGroup(), "rule__FunctionMemberDeclaration__Group__0");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getGroup_4(), "rule__FunctionMemberDeclaration__Group_4__0");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getGroup_4_1(), "rule__FunctionMemberDeclaration__Group_4_1__0");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getGroup_6(), "rule__FunctionMemberDeclaration__Group_6__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup_6(), "rule__IfExpression__Group_6__0");
					put(grammarAccess.getWhileExpressionAccess().getGroup(), "rule__WhileExpression__Group__0");
					put(grammarAccess.getDoWhileExpressionAccess().getGroup(), "rule__DoWhileExpression__Group__0");
					put(grammarAccess.getForLoopExpressionAccess().getGroup(), "rule__ForLoopExpression__Group__0");
					put(grammarAccess.getForLoopExpressionAccess().getGroup_1(), "rule__ForLoopExpression__Group_1__0");
					put(grammarAccess.getForLoopExpressionAccess().getGroup_1_0(), "rule__ForLoopExpression__Group_1_0__0");
					put(grammarAccess.getReturnExpressionAccess().getGroup(), "rule__ReturnExpression__Group__0");
					put(grammarAccess.getBreakExpressionAccess().getGroup(), "rule__BreakExpression__Group__0");
					put(grammarAccess.getContinueExpressionAccess().getGroup(), "rule__ContinueExpression__Group__0");
					put(grammarAccess.getThrowExpressionAccess().getGroup(), "rule__ThrowExpression__Group__0");
					put(grammarAccess.getTryCatchExpressionAccess().getGroup(), "rule__TryCatchExpression__Group__0");
					put(grammarAccess.getCatchClauseAccess().getGroup(), "rule__CatchClause__Group__0");
					put(grammarAccess.getSwitchExpressionAccess().getGroup(), "rule__SwitchExpression__Group__0");
					put(grammarAccess.getSwitchExpressionAccess().getGroup_5(), "rule__SwitchExpression__Group_5__0");
					put(grammarAccess.getCasePartAccess().getGroup(), "rule__CasePart__Group__0");
					put(grammarAccess.getCasePartAccess().getGroup_2(), "rule__CasePart__Group_2__0");
					put(grammarAccess.getFunctionExpressionAccess().getGroup(), "rule__FunctionExpression__Group__0");
					put(grammarAccess.getFunctionExpressionAccess().getGroup_3(), "rule__FunctionExpression__Group_3__0");
					put(grammarAccess.getFunctionExpressionAccess().getGroup_3_1(), "rule__FunctionExpression__Group_3_1__0");
					put(grammarAccess.getFunctionExpressionAccess().getGroup_5(), "rule__FunctionExpression__Group_5__0");
					put(grammarAccess.getThisExpressionAccess().getGroup(), "rule__ThisExpression__Group__0");
					put(grammarAccess.getSuperExpressionAccess().getGroup(), "rule__SuperExpression__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup(), "rule__FeatureCall__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_2(), "rule__FeatureCall__Group_2__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_2_2(), "rule__FeatureCall__Group_2_2__0");
					put(grammarAccess.getConstructorCallAccess().getGroup(), "rule__ConstructorCall__Group__0");
					put(grammarAccess.getConstructorCallAccess().getGroup_5(), "rule__ConstructorCall__Group_5__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getIntLiteralAccess().getGroup(), "rule__IntLiteral__Group__0");
					put(grammarAccess.getFloatLiteralAccess().getGroup(), "rule__FloatLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getRegularExpressionLiteralAccess().getGroup(), "rule__RegularExpressionLiteral__Group__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup(), "rule__ArrayLiteral__Group__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup_3(), "rule__ArrayLiteral__Group_3__0");
					put(grammarAccess.getObjectLiteralAccess().getGroup(), "rule__ObjectLiteral__Group__0");
					put(grammarAccess.getObjectLiteralAccess().getGroup_3(), "rule__ObjectLiteral__Group_3__0");
					put(grammarAccess.getObjectElementAccess().getGroup(), "rule__ObjectElement__Group__0");
					put(grammarAccess.getFloatAccess().getGroup_1(), "rule__Float__Group_1__0");
					put(grammarAccess.getFloatAccess().getGroup_2(), "rule__Float__Group_2__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_0_1(), "rule__Package__NameAssignment_0_1");
					put(grammarAccess.getPackageAccess().getClassesAssignment_1(), "rule__Package__ClassesAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getClassAccess().getMembersAssignment_3(), "rule__Class__MembersAssignment_3");
					put(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0(), "rule__TypeReference__TypeAssignment_0");
					put(grammarAccess.getTypeReferenceAccess().getArgumentsAssignment_1_1(), "rule__TypeReference__ArgumentsAssignment_1_1");
					put(grammarAccess.getTypeReferenceAccess().getArgumentsAssignment_1_2_1(), "rule__TypeReference__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getFormalParameterAccess().getNameAssignment_0(), "rule__FormalParameter__NameAssignment_0");
					put(grammarAccess.getFormalParameterAccess().getTypeAssignment_1_1(), "rule__FormalParameter__TypeAssignment_1_1");
					put(grammarAccess.getAssignmentAccess().getFeatureAssignment_0_1(), "rule__Assignment__FeatureAssignment_0_1");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_0_3(), "rule__Assignment__ValueAssignment_0_3");
					put(grammarAccess.getAssignmentAccess().getFeatureAssignment_1_1_0_0_1(), "rule__Assignment__FeatureAssignment_1_1_0_0_1");
					put(grammarAccess.getAssignmentAccess().getRightAssignment_1_1_1(), "rule__Assignment__RightAssignment_1_1_1");
					put(grammarAccess.getOrExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__OrExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1(), "rule__OrExpression__RightAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__AndExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1(), "rule__AndExpression__RightAssignment_1_1");
					put(grammarAccess.getOtherOperatorExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__OtherOperatorExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getOtherOperatorExpressionAccess().getRightAssignment_1_1(), "rule__OtherOperatorExpression__RightAssignment_1_1");
					put(grammarAccess.getCompareExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__CompareExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1(), "rule__CompareExpression__RightAssignment_1_1");
					put(grammarAccess.getBitwiseExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__BitwiseExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getBitwiseExpressionAccess().getRightAssignment_1_1(), "rule__BitwiseExpression__RightAssignment_1_1");
					put(grammarAccess.getBitshiftExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__BitshiftExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getBitshiftExpressionAccess().getRightAssignment_1_1(), "rule__BitshiftExpression__RightAssignment_1_1");
					put(grammarAccess.getAddExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__AddExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1(), "rule__AddExpression__RightAssignment_1_1");
					put(grammarAccess.getSubtractExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__SubtractExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getSubtractExpressionAccess().getRightAssignment_1_1(), "rule__SubtractExpression__RightAssignment_1_1");
					put(grammarAccess.getMultiplyExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__MultiplyExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getMultiplyExpressionAccess().getRightAssignment_1_1(), "rule__MultiplyExpression__RightAssignment_1_1");
					put(grammarAccess.getDivideExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__DivideExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getDivideExpressionAccess().getRightAssignment_1_1(), "rule__DivideExpression__RightAssignment_1_1");
					put(grammarAccess.getModuloExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__ModuloExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getModuloExpressionAccess().getRightAssignment_1_1(), "rule__ModuloExpression__RightAssignment_1_1");
					put(grammarAccess.getUnaryOperationAccess().getFeatureAssignment_0_1(), "rule__UnaryOperation__FeatureAssignment_0_1");
					put(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2(), "rule__UnaryOperation__OperandAssignment_0_2");
					put(grammarAccess.getPreIncrementOperationAccess().getFeatureAssignment_0_0_1(), "rule__PreIncrementOperation__FeatureAssignment_0_0_1");
					put(grammarAccess.getPreIncrementOperationAccess().getOperandAssignment_0_0_2(), "rule__PreIncrementOperation__OperandAssignment_0_0_2");
					put(grammarAccess.getPostIncrementOperationAccess().getOperandAssignment_0_0_1(), "rule__PostIncrementOperation__OperandAssignment_0_0_1");
					put(grammarAccess.getPostIncrementOperationAccess().getFeatureAssignment_0_0_2(), "rule__PostIncrementOperation__FeatureAssignment_0_0_2");
					put(grammarAccess.getMemberFeatureCallAccess().getFeatureAssignment_1_0_0_0_2(), "rule__MemberFeatureCall__FeatureAssignment_1_0_0_0_2");
					put(grammarAccess.getMemberFeatureCallAccess().getValueAssignment_1_0_1(), "rule__MemberFeatureCall__ValueAssignment_1_0_1");
					put(grammarAccess.getMemberFeatureCallAccess().getFeatureAssignment_1_1_0_0_2(), "rule__MemberFeatureCall__FeatureAssignment_1_1_0_0_2");
					put(grammarAccess.getMemberFeatureCallAccess().getValueAssignment_1_1_1(), "rule__MemberFeatureCall__ValueAssignment_1_1_1");
					put(grammarAccess.getMemberFeatureCallAccess().getFeatureAssignment_1_2_1(), "rule__MemberFeatureCall__FeatureAssignment_1_2_1");
					put(grammarAccess.getMemberFeatureCallAccess().getExplicitOperationCallAssignment_1_2_2_0(), "rule__MemberFeatureCall__ExplicitOperationCallAssignment_1_2_2_0");
					put(grammarAccess.getMemberFeatureCallAccess().getArgumentsAssignment_1_2_2_1_0(), "rule__MemberFeatureCall__ArgumentsAssignment_1_2_2_1_0");
					put(grammarAccess.getMemberFeatureCallAccess().getArgumentsAssignment_1_2_2_1_1_1(), "rule__MemberFeatureCall__ArgumentsAssignment_1_2_2_1_1_1");
					put(grammarAccess.getMemberFeatureCallAccess().getFeatureAssignment_1_3_2(), "rule__MemberFeatureCall__FeatureAssignment_1_3_2");
					put(grammarAccess.getMemberFeatureCallAccess().getExplicitOperationCallAssignment_1_3_4_0(), "rule__MemberFeatureCall__ExplicitOperationCallAssignment_1_3_4_0");
					put(grammarAccess.getMemberFeatureCallAccess().getArgumentsAssignment_1_3_4_1_0(), "rule__MemberFeatureCall__ArgumentsAssignment_1_3_4_1_0");
					put(grammarAccess.getMemberFeatureCallAccess().getArgumentsAssignment_1_3_4_1_1_1(), "rule__MemberFeatureCall__ArgumentsAssignment_1_3_4_1_1_1");
					put(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_2_0(), "rule__BlockExpression__ExpressionsAssignment_2_0");
					put(grammarAccess.getVariableDeclarationsAccess().getDeclarationsAssignment_2(), "rule__VariableDeclarations__DeclarationsAssignment_2");
					put(grammarAccess.getVariableDeclarationsAccess().getDeclarationsAssignment_3_1(), "rule__VariableDeclarations__DeclarationsAssignment_3_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1(), "rule__VariableDeclaration__TypeAssignment_2_1");
					put(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3_1(), "rule__VariableDeclaration__ExpressionAssignment_3_1");
					put(grammarAccess.getVariableMemberDeclarationAccess().getNameAssignment_2(), "rule__VariableMemberDeclaration__NameAssignment_2");
					put(grammarAccess.getVariableMemberDeclarationAccess().getTypeAssignment_4(), "rule__VariableMemberDeclaration__TypeAssignment_4");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getNameAssignment_2(), "rule__FunctionMemberDeclaration__NameAssignment_2");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getParametersAssignment_4_0(), "rule__FunctionMemberDeclaration__ParametersAssignment_4_0");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getParametersAssignment_4_1_1(), "rule__FunctionMemberDeclaration__ParametersAssignment_4_1_1");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getReturnTypeAssignment_6_1(), "rule__FunctionMemberDeclaration__ReturnTypeAssignment_6_1");
					put(grammarAccess.getFunctionMemberDeclarationAccess().getBodyAssignment_7(), "rule__FunctionMemberDeclaration__BodyAssignment_7");
					put(grammarAccess.getIfExpressionAccess().getIfAssignment_3(), "rule__IfExpression__IfAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getThenAssignment_5(), "rule__IfExpression__ThenAssignment_5");
					put(grammarAccess.getIfExpressionAccess().getElseAssignment_6_1(), "rule__IfExpression__ElseAssignment_6_1");
					put(grammarAccess.getWhileExpressionAccess().getPredicateAssignment_3(), "rule__WhileExpression__PredicateAssignment_3");
					put(grammarAccess.getWhileExpressionAccess().getBodyAssignment_5(), "rule__WhileExpression__BodyAssignment_5");
					put(grammarAccess.getDoWhileExpressionAccess().getBodyAssignment_2(), "rule__DoWhileExpression__BodyAssignment_2");
					put(grammarAccess.getDoWhileExpressionAccess().getPredicateAssignment_5(), "rule__DoWhileExpression__PredicateAssignment_5");
					put(grammarAccess.getForLoopExpressionAccess().getDeclaredParamAssignment_1_0_2(), "rule__ForLoopExpression__DeclaredParamAssignment_1_0_2");
					put(grammarAccess.getForLoopExpressionAccess().getForExpressionAssignment_1_0_4(), "rule__ForLoopExpression__ForExpressionAssignment_1_0_4");
					put(grammarAccess.getForLoopExpressionAccess().getBodyAssignment_2(), "rule__ForLoopExpression__BodyAssignment_2");
					put(grammarAccess.getReturnExpressionAccess().getExpressionAssignment_2(), "rule__ReturnExpression__ExpressionAssignment_2");
					put(grammarAccess.getThrowExpressionAccess().getExpressionAssignment_2(), "rule__ThrowExpression__ExpressionAssignment_2");
					put(grammarAccess.getTryCatchExpressionAccess().getExpressionAssignment_2(), "rule__TryCatchExpression__ExpressionAssignment_2");
					put(grammarAccess.getTryCatchExpressionAccess().getCatchClausesAssignment_3(), "rule__TryCatchExpression__CatchClausesAssignment_3");
					put(grammarAccess.getCatchClauseAccess().getDeclaredParamAssignment_2(), "rule__CatchClause__DeclaredParamAssignment_2");
					put(grammarAccess.getCatchClauseAccess().getExpressionAssignment_4(), "rule__CatchClause__ExpressionAssignment_4");
					put(grammarAccess.getSwitchExpressionAccess().getSwitchAssignment_2(), "rule__SwitchExpression__SwitchAssignment_2");
					put(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_4(), "rule__SwitchExpression__CasesAssignment_4");
					put(grammarAccess.getSwitchExpressionAccess().getDefaultAssignment_5_2(), "rule__SwitchExpression__DefaultAssignment_5_2");
					put(grammarAccess.getCasePartAccess().getCasesAssignment_1(), "rule__CasePart__CasesAssignment_1");
					put(grammarAccess.getCasePartAccess().getCasesAssignment_2_1(), "rule__CasePart__CasesAssignment_2_1");
					put(grammarAccess.getCasePartAccess().getThenAssignment_4(), "rule__CasePart__ThenAssignment_4");
					put(grammarAccess.getFunctionExpressionAccess().getParametersAssignment_3_0(), "rule__FunctionExpression__ParametersAssignment_3_0");
					put(grammarAccess.getFunctionExpressionAccess().getParametersAssignment_3_1_1(), "rule__FunctionExpression__ParametersAssignment_3_1_1");
					put(grammarAccess.getFunctionExpressionAccess().getReturnTypeAssignment_5_1(), "rule__FunctionExpression__ReturnTypeAssignment_5_1");
					put(grammarAccess.getFunctionExpressionAccess().getBodyAssignment_6(), "rule__FunctionExpression__BodyAssignment_6");
					put(grammarAccess.getFeatureCallAccess().getFeatureAssignment_1(), "rule__FeatureCall__FeatureAssignment_1");
					put(grammarAccess.getFeatureCallAccess().getExplicitOperationCallAssignment_2_0(), "rule__FeatureCall__ExplicitOperationCallAssignment_2_0");
					put(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_1(), "rule__FeatureCall__ArgumentsAssignment_2_1");
					put(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_2_1(), "rule__FeatureCall__ArgumentsAssignment_2_2_1");
					put(grammarAccess.getConstructorCallAccess().getConstructorAssignment_2(), "rule__ConstructorCall__ConstructorAssignment_2");
					put(grammarAccess.getConstructorCallAccess().getArgumentsAssignment_4(), "rule__ConstructorCall__ArgumentsAssignment_4");
					put(grammarAccess.getConstructorCallAccess().getArgumentsAssignment_5_1(), "rule__ConstructorCall__ArgumentsAssignment_5_1");
					put(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1(), "rule__BooleanLiteral__IsTrueAssignment_1_1");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment_1_0(), "rule__IntLiteral__ValueAssignment_1_0");
					put(grammarAccess.getFloatLiteralAccess().getValueAssignment_1(), "rule__FloatLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
					put(grammarAccess.getRegularExpressionLiteralAccess().getValueAssignment_1(), "rule__RegularExpressionLiteral__ValueAssignment_1");
					put(grammarAccess.getArrayLiteralAccess().getElementsAssignment_2(), "rule__ArrayLiteral__ElementsAssignment_2");
					put(grammarAccess.getArrayLiteralAccess().getElementsAssignment_3_1(), "rule__ArrayLiteral__ElementsAssignment_3_1");
					put(grammarAccess.getObjectLiteralAccess().getElementsAssignment_2(), "rule__ObjectLiteral__ElementsAssignment_2");
					put(grammarAccess.getObjectLiteralAccess().getElementsAssignment_3_1(), "rule__ObjectLiteral__ElementsAssignment_3_1");
					put(grammarAccess.getObjectElementAccess().getKeyAssignment_0(), "rule__ObjectElement__KeyAssignment_0");
					put(grammarAccess.getObjectElementAccess().getValueAssignment_2(), "rule__ObjectElement__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ee.xtext.haxe.ui.contentassist.antlr.internal.InternalHaxeParser typedParser = (ee.xtext.haxe.ui.contentassist.antlr.internal.InternalHaxeParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HaxeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HaxeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
