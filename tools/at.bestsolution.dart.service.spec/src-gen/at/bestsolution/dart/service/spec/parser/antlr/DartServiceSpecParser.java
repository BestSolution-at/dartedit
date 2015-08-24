/*
 * generated by Xtext
 */
package at.bestsolution.dart.service.spec.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.bestsolution.dart.service.spec.services.DartServiceSpecGrammarAccess;

public class DartServiceSpecParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DartServiceSpecGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected at.bestsolution.dart.service.spec.parser.antlr.internal.InternalDartServiceSpecParser createParser(XtextTokenStream stream) {
		return new at.bestsolution.dart.service.spec.parser.antlr.internal.InternalDartServiceSpecParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ServiceDefs";
	}
	
	public DartServiceSpecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DartServiceSpecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}