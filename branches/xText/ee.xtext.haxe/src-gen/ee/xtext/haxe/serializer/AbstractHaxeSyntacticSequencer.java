package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import ee.xtext.haxe.services.HaxeGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractHaxeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HaxeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_BlockExpression_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftCurlyBracketKeyword_1_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_BlockExpression_ParenthesizedExpression_SemicolonKeyword_2_1_q_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_BlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_BooleanLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_FalseKeyword_1_0_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_NullKeyword_1_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_NullKeyword_1_RightParenthesisKeyword_2_p;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HaxeGrammarAccess) access;
		match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1()), new TokenAlias(false, false, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1()), new TokenAlias(false, false, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_BlockExpression_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftCurlyBracketKeyword_1_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()), new TokenAlias(false, false, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_BlockExpression_ParenthesizedExpression_SemicolonKeyword_2_1_q_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_BlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_BooleanLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_FalseKeyword_1_0_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getIntLiteralAccess().getHEXTerminalRuleCall_1_1()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getIntLiteralAccess().getHEXTerminalRuleCall_1_1()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_NullKeyword_1_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getNullLiteralAccess().getNullKeyword_1()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_NullKeyword_1_RightParenthesisKeyword_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getNullLiteralAccess().getNullKeyword_1()), new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()));
		match_ParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_ParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getHEXRule())
			return getHEXToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(ruleCall, node);
		return "";
	}
	
	protected String getHEXToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0x";
	}
	protected String getOpSingleAssignToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_BlockExpression_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftCurlyBracketKeyword_1_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_BlockExpression_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftCurlyBracketKeyword_1_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_BlockExpression_ParenthesizedExpression_SemicolonKeyword_2_1_q_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_BlockExpression_ParenthesizedExpression_SemicolonKeyword_2_1_q_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_BlockExpression_SemicolonKeyword_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_BlockExpression_SemicolonKeyword_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_BooleanLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_FalseKeyword_1_0_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_BooleanLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_FalseKeyword_1_0_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_NullKeyword_1_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_NullKeyword_1_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_NullKeyword_1_RightParenthesisKeyword_2_p.equals(transition.getAmbiguousSyntax()))
			emit_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_NullKeyword_1_RightParenthesisKeyword_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(transition.getAmbiguousSyntax()))
			emit_ParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(transition.getAmbiguousSyntax()))
			emit_ParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     '('* '[' ']' ')'+
	 */
	protected void emit_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ '[' ']' ')'+
	 */
	protected void emit_ArrayLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftSquareBracketKeyword_1_RightSquareBracketKeyword_4_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ '{' '}' ')'+
	 */
	protected void emit_BlockExpression_ParenthesizedExpression_LeftParenthesisKeyword_0_p_LeftCurlyBracketKeyword_1_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ';'? '}' ')'+
	 */
	protected void emit_BlockExpression_ParenthesizedExpression_SemicolonKeyword_2_1_q_RightCurlyBracketKeyword_3_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ 'false' ')'+
	 */
	protected void emit_BooleanLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_FalseKeyword_1_0_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('* HEX ')'+
	 */
	protected void emit_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ HEX ')'+
	 */
	protected void emit_IntLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_HEXTerminalRuleCall_1_1_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('* 'null' ')'+
	 */
	protected void emit_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_a_NullKeyword_1_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ 'null' ')'+
	 */
	protected void emit_NullLiteral_ParenthesizedExpression_LeftParenthesisKeyword_0_p_NullKeyword_1_RightParenthesisKeyword_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_ParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_ParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
