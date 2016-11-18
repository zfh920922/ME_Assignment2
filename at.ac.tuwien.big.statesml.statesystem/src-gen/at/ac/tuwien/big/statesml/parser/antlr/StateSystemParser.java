/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.statesml.parser.antlr;

import at.ac.tuwien.big.statesml.parser.antlr.internal.InternalStateSystemParser;
import at.ac.tuwien.big.statesml.services.StateSystemGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class StateSystemParser extends AbstractAntlrParser {

	@Inject
	private StateSystemGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStateSystemParser createParser(XtextTokenStream stream) {
		return new InternalStateSystemParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "StateSystem";
	}

	public StateSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StateSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
