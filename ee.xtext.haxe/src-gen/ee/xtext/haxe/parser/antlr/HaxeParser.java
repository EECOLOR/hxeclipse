/*
* generated by Xtext
*/
package ee.xtext.haxe.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ee.xtext.haxe.services.HaxeGrammarAccess;

public class HaxeParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HaxeGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_CONDITIONAL_IF", "RULE_CONDITIONAL_ELSE", "RULE_CONDITIONAL_ELSE_IF", "RULE_CONDITIONAL_END");
	}
	
	@Override
	protected ee.xtext.haxe.parser.antlr.internal.InternalHaxeParser createParser(XtextTokenStream stream) {
		return new ee.xtext.haxe.parser.antlr.internal.InternalHaxeParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Package";
	}
	
	public HaxeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HaxeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
