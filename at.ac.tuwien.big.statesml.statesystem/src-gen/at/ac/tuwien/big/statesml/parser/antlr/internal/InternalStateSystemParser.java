package at.ac.tuwien.big.statesml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.statesml.services.StateSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statesystem'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalStateSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateSystem.g"; }



     	private StateSystemGrammarAccess grammarAccess;

        public InternalStateSystemParser(TokenStream input, StateSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateSystem";
       	}

       	@Override
       	protected StateSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateSystem"
    // InternalStateSystem.g:64:1: entryRuleStateSystem returns [EObject current=null] : iv_ruleStateSystem= ruleStateSystem EOF ;
    public final EObject entryRuleStateSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSystem = null;


        try {
            // InternalStateSystem.g:64:52: (iv_ruleStateSystem= ruleStateSystem EOF )
            // InternalStateSystem.g:65:2: iv_ruleStateSystem= ruleStateSystem EOF
            {
             newCompositeNode(grammarAccess.getStateSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateSystem=ruleStateSystem();

            state._fsp--;

             current =iv_ruleStateSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateSystem"


    // $ANTLR start "ruleStateSystem"
    // InternalStateSystem.g:71:1: ruleStateSystem returns [EObject current=null] : (otherlv_0= 'statesystem' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStateSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateSystem.g:77:2: ( (otherlv_0= 'statesystem' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateSystem.g:78:2: (otherlv_0= 'statesystem' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateSystem.g:78:2: (otherlv_0= 'statesystem' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateSystem.g:79:3: otherlv_0= 'statesystem' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateSystemAccess().getStatesystemKeyword_0());
            		
            // InternalStateSystem.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSystem.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSystem.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStateSystem.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateSystem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}