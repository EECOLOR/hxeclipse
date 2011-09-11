package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import ee.xtext.haxe.services.HaxeGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractHaxeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HaxeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HaxeGrammarAccess) access;
		match_BlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
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
		if(match_BlockExpression_SemicolonKeyword_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_BlockExpression_SemicolonKeyword_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(transition.getAmbiguousSyntax()))
			emit_ParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(transition.getAmbiguousSyntax()))
			emit_ParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
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
