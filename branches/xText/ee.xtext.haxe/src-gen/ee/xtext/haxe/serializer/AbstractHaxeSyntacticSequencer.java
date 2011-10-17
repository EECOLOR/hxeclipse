package ee.xtext.haxe.serializer;

import com.google.inject.Inject;
import ee.xtext.haxe.services.HaxeGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractHaxeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HaxeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_CasePartExpressions_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_ClassConstructor_SemicolonKeyword_10_q;
	protected AbstractElementAlias match_ClassMethod_SemicolonKeyword_11_q;
	protected AbstractElementAlias match_ClassProperty_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_EnumConstructor_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ExternClassConstructor_SemicolonKeyword_9_q;
	protected AbstractElementAlias match_ExternClassMethod_SemicolonKeyword_10_q;
	protected AbstractElementAlias match_ExternClassProperty_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_IfExpression_SemicolonKeyword_6_0_0_q;
	protected AbstractElementAlias match_InterfaceMethod_SemicolonKeyword_8_q;
	protected AbstractElementAlias match_InterfaceProperty_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Metadata___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__q;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_ParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_TypedefMethod_SemicolonKeyword_9_q;
	protected AbstractElementAlias match_TypedefProperty_SemicolonKeyword_6_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HaxeGrammarAccess) access;
		match_BlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_CasePartExpressions_SemicolonKeyword_1_1_q = new TokenAlias(true, false, grammarAccess.getCasePartExpressionsAccess().getSemicolonKeyword_1_1());
		match_ClassConstructor_SemicolonKeyword_10_q = new TokenAlias(true, false, grammarAccess.getClassConstructorAccess().getSemicolonKeyword_10());
		match_ClassMethod_SemicolonKeyword_11_q = new TokenAlias(true, false, grammarAccess.getClassMethodAccess().getSemicolonKeyword_11());
		match_ClassProperty_SemicolonKeyword_7_q = new TokenAlias(true, false, grammarAccess.getClassPropertyAccess().getSemicolonKeyword_7());
		match_EnumConstructor_SemicolonKeyword_3_q = new TokenAlias(true, false, grammarAccess.getEnumConstructorAccess().getSemicolonKeyword_3());
		match_ExternClassConstructor_SemicolonKeyword_9_q = new TokenAlias(true, false, grammarAccess.getExternClassConstructorAccess().getSemicolonKeyword_9());
		match_ExternClassMethod_SemicolonKeyword_10_q = new TokenAlias(true, false, grammarAccess.getExternClassMethodAccess().getSemicolonKeyword_10());
		match_ExternClassProperty_SemicolonKeyword_7_q = new TokenAlias(true, false, grammarAccess.getExternClassPropertyAccess().getSemicolonKeyword_7());
		match_IfExpression_SemicolonKeyword_6_0_0_q = new TokenAlias(true, false, grammarAccess.getIfExpressionAccess().getSemicolonKeyword_6_0_0());
		match_InterfaceMethod_SemicolonKeyword_8_q = new TokenAlias(true, false, grammarAccess.getInterfaceMethodAccess().getSemicolonKeyword_8());
		match_InterfaceProperty_SemicolonKeyword_6_q = new TokenAlias(true, false, grammarAccess.getInterfacePropertyAccess().getSemicolonKeyword_6());
		match_Metadata___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getMetadataAccess().getLeftParenthesisKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getMetadataAccess().getRightParenthesisKeyword_3_0_2()));
		match_ParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_ParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(false, true, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_TypedefMethod_SemicolonKeyword_9_q = new TokenAlias(true, false, grammarAccess.getTypedefMethodAccess().getSemicolonKeyword_9());
		match_TypedefProperty_SemicolonKeyword_6_q = new TokenAlias(true, false, grammarAccess.getTypedefPropertyAccess().getSemicolonKeyword_6());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_BlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CasePartExpressions_SemicolonKeyword_1_1_q.equals(syntax))
				emit_CasePartExpressions_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassConstructor_SemicolonKeyword_10_q.equals(syntax))
				emit_ClassConstructor_SemicolonKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassMethod_SemicolonKeyword_11_q.equals(syntax))
				emit_ClassMethod_SemicolonKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassProperty_SemicolonKeyword_7_q.equals(syntax))
				emit_ClassProperty_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumConstructor_SemicolonKeyword_3_q.equals(syntax))
				emit_EnumConstructor_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternClassConstructor_SemicolonKeyword_9_q.equals(syntax))
				emit_ExternClassConstructor_SemicolonKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternClassMethod_SemicolonKeyword_10_q.equals(syntax))
				emit_ExternClassMethod_SemicolonKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternClassProperty_SemicolonKeyword_7_q.equals(syntax))
				emit_ExternClassProperty_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfExpression_SemicolonKeyword_6_0_0_q.equals(syntax))
				emit_IfExpression_SemicolonKeyword_6_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceMethod_SemicolonKeyword_8_q.equals(syntax))
				emit_InterfaceMethod_SemicolonKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceProperty_SemicolonKeyword_6_q.equals(syntax))
				emit_InterfaceProperty_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Metadata___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__q.equals(syntax))
				emit_Metadata___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_ParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_ParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypedefMethod_SemicolonKeyword_9_q.equals(syntax))
				emit_TypedefMethod_SemicolonKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypedefProperty_SemicolonKeyword_6_q.equals(syntax))
				emit_TypedefProperty_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_CasePartExpressions_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ClassConstructor_SemicolonKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ClassMethod_SemicolonKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ClassProperty_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_EnumConstructor_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ExternClassConstructor_SemicolonKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ExternClassMethod_SemicolonKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ExternClassProperty_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_IfExpression_SemicolonKeyword_6_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_InterfaceMethod_SemicolonKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_InterfaceProperty_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Metadata___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_ParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_ParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TypedefMethod_SemicolonKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TypedefProperty_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
