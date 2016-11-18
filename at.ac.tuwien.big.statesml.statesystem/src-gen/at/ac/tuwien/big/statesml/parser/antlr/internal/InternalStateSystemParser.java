package at.ac.tuwien.big.statesml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.statesml.services.StateSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStateSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statesystem'", "'for'", "'{'", "'attributes'", "'}'", "'events'", "'states'", "'transitions'", "'control'", "'edges'", "'s'", "':'", "'=>'", "'divergence'", "'convergence'", "'initial'", "'terminal'", "'('", "')'", "'='", "','", "'true'", "'false'", "'.'", "'-'", "'triggerd-by'", "'IN'", "'RETURN'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalStateSystem.g:65:1: entryRuleStateSystem returns [EObject current=null] : iv_ruleStateSystem= ruleStateSystem EOF ;
    public final EObject entryRuleStateSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSystem = null;


        try {
            // InternalStateSystem.g:65:52: (iv_ruleStateSystem= ruleStateSystem EOF )
            // InternalStateSystem.g:66:2: iv_ruleStateSystem= ruleStateSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateSystem=ruleStateSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalStateSystem.g:72:1: ruleStateSystem returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleStateSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_attributes_8_0 = null;

        EObject lv_processibleEvents_12_0 = null;

        EObject lv_nodes_16_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_nodes_24_0 = null;

        EObject lv_edges_28_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalStateSystem.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalStateSystem.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            // InternalStateSystem.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalStateSystem.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?) )
            // InternalStateSystem.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getStateSystemAccess().getUnorderedGroup());
            // InternalStateSystem.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?)
            // InternalStateSystem.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+ {...}?
            {
            // InternalStateSystem.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( ( LA11_0 == 15 || LA11_0 >= 19 && LA11_0 <= 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateSystem.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) )
            	    {
            	    // InternalStateSystem.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) ) )
            	    // InternalStateSystem.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalStateSystem.g:87:105: ( ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) ) )
            	    // InternalStateSystem.g:88:5: ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 0);
            	    // InternalStateSystem.g:91:8: ({...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) ) )
            	    // InternalStateSystem.g:91:9: {...}? => (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "true");
            	    }
            	    // InternalStateSystem.g:91:18: (otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' ) )
            	    // InternalStateSystem.g:91:19: otherlv_1= 'statesystem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( ( ruleQualifiedName ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )? (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_1, grammarAccess.getStateSystemAccess().getStatesystemKeyword_0_0());
            	      							
            	    }
            	    // InternalStateSystem.g:95:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalStateSystem.g:96:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalStateSystem.g:96:9: (lv_name_2_0= RULE_ID )
            	    // InternalStateSystem.g:97:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_name_2_0, grammarAccess.getStateSystemAccess().getNameIDTerminalRuleCall_0_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getStateSystemRule());
            	      										}
            	      										setWithLastConsumed(
            	      											current,
            	      											"name",
            	      											lv_name_2_0,
            	      											"org.eclipse.xtext.common.Terminals.ID");
            	      									
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_3, grammarAccess.getStateSystemAccess().getForKeyword_0_2());
            	      							
            	    }
            	    // InternalStateSystem.g:117:8: ( ( ruleQualifiedName ) )
            	    // InternalStateSystem.g:118:9: ( ruleQualifiedName )
            	    {
            	    // InternalStateSystem.g:118:9: ( ruleQualifiedName )
            	    // InternalStateSystem.g:119:10: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getStateSystemRule());
            	      										}
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getStateSystemAccess().getSystemUnitSystemUnitCrossReference_0_3_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_5);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_5, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_0_4());
            	      							
            	    }
            	    // InternalStateSystem.g:137:8: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalStateSystem.g:138:9: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )+ otherlv_9= '}'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_6, grammarAccess.getStateSystemAccess().getAttributesKeyword_0_5_0());
            	              								
            	            }
            	            otherlv_7=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_7, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_0_5_1());
            	              								
            	            }
            	            // InternalStateSystem.g:146:9: ( (lv_attributes_8_0= ruleAttribute ) )+
            	            int cnt1=0;
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( (LA1_0==RULE_ID) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // InternalStateSystem.g:147:10: (lv_attributes_8_0= ruleAttribute )
            	            	    {
            	            	    // InternalStateSystem.g:147:10: (lv_attributes_8_0= ruleAttribute )
            	            	    // InternalStateSystem.g:148:11: lv_attributes_8_0= ruleAttribute
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      											newCompositeNode(grammarAccess.getStateSystemAccess().getAttributesAttributeParserRuleCall_0_5_2_0());
            	            	      										
            	            	    }
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_attributes_8_0=ruleAttribute();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      											if (current==null) {
            	            	      												current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	            	      											}
            	            	      											add(
            	            	      												current,
            	            	      												"attributes",
            	            	      												lv_attributes_8_0,
            	            	      												"at.ac.tuwien.big.statesml.StateSystem.Attribute");
            	            	      											afterParserOrEnumRuleCall();
            	            	      										
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt1 >= 1 ) break loop1;
            	            	    if (state.backtracking>0) {state.failed=true; return current;}
            	                        EarlyExitException eee =
            	                            new EarlyExitException(1, input);
            	                        throw eee;
            	                }
            	                cnt1++;
            	            } while (true);

            	            otherlv_9=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_9, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_0_5_3());
            	              								
            	            }

            	            }
            	            break;

            	    }

            	    // InternalStateSystem.g:170:8: (otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalStateSystem.g:171:9: otherlv_10= 'events' otherlv_11= '{' ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+ otherlv_13= '}'
            	            {
            	            otherlv_10=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_10, grammarAccess.getStateSystemAccess().getEventsKeyword_0_6_0());
            	              								
            	            }
            	            otherlv_11=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_11, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_0_6_1());
            	              								
            	            }
            	            // InternalStateSystem.g:179:9: ( (lv_processibleEvents_12_0= ruleChangeEvent ) )+
            	            int cnt3=0;
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==RULE_ID) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // InternalStateSystem.g:180:10: (lv_processibleEvents_12_0= ruleChangeEvent )
            	            	    {
            	            	    // InternalStateSystem.g:180:10: (lv_processibleEvents_12_0= ruleChangeEvent )
            	            	    // InternalStateSystem.g:181:11: lv_processibleEvents_12_0= ruleChangeEvent
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      											newCompositeNode(grammarAccess.getStateSystemAccess().getProcessibleEventsChangeEventParserRuleCall_0_6_2_0());
            	            	      										
            	            	    }
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_processibleEvents_12_0=ruleChangeEvent();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      											if (current==null) {
            	            	      												current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	            	      											}
            	            	      											add(
            	            	      												current,
            	            	      												"processibleEvents",
            	            	      												lv_processibleEvents_12_0,
            	            	      												"at.ac.tuwien.big.statesml.StateSystem.ChangeEvent");
            	            	      											afterParserOrEnumRuleCall();
            	            	      										
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt3 >= 1 ) break loop3;
            	            	    if (state.backtracking>0) {state.failed=true; return current;}
            	                        EarlyExitException eee =
            	                            new EarlyExitException(3, input);
            	                        throw eee;
            	                }
            	                cnt3++;
            	            } while (true);

            	            otherlv_13=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_13, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_0_6_3());
            	              								
            	            }

            	            }
            	            break;

            	    }

            	    // InternalStateSystem.g:203:8: (otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}' )
            	    // InternalStateSystem.g:204:9: otherlv_14= 'states' otherlv_15= '{' ( (lv_nodes_16_0= ruleNode ) )+ otherlv_17= '}'
            	    {
            	    otherlv_14=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getStateSystemAccess().getStatesKeyword_0_7_0());
            	      								
            	    }
            	    otherlv_15=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_0_7_1());
            	      								
            	    }
            	    // InternalStateSystem.g:212:9: ( (lv_nodes_16_0= ruleNode ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID||LA5_0==21) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalStateSystem.g:213:10: (lv_nodes_16_0= ruleNode )
            	    	    {
            	    	    // InternalStateSystem.g:213:10: (lv_nodes_16_0= ruleNode )
            	    	    // InternalStateSystem.g:214:11: lv_nodes_16_0= ruleNode
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getStateSystemAccess().getNodesNodeParserRuleCall_0_7_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_nodes_16_0=ruleNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      											if (current==null) {
            	    	      												current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	    	      											}
            	    	      											add(
            	    	      												current,
            	    	      												"nodes",
            	    	      												lv_nodes_16_0,
            	    	      												"at.ac.tuwien.big.statesml.StateSystem.Node");
            	    	      											afterParserOrEnumRuleCall();
            	    	      										
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    otherlv_17=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_0_7_3());
            	      								
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateSystemAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateSystem.g:242:3: ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalStateSystem.g:242:3: ({...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) ) )
            	    // InternalStateSystem.g:243:4: {...}? => ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalStateSystem.g:243:105: ( ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) ) )
            	    // InternalStateSystem.g:244:5: ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 1);
            	    // InternalStateSystem.g:247:8: ({...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' ) )
            	    // InternalStateSystem.g:247:9: {...}? => (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "true");
            	    }
            	    // InternalStateSystem.g:247:18: (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}' )
            	    // InternalStateSystem.g:247:19: otherlv_18= 'transitions' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) )+ otherlv_21= '}'
            	    {
            	    otherlv_18=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_18, grammarAccess.getStateSystemAccess().getTransitionsKeyword_1_0());
            	      							
            	    }
            	    otherlv_19=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_19, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_1_1());
            	      							
            	    }
            	    // InternalStateSystem.g:255:8: ( (lv_nodes_20_0= ruleNode ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID||LA6_0==21) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalStateSystem.g:256:9: (lv_nodes_20_0= ruleNode )
            	    	    {
            	    	    // InternalStateSystem.g:256:9: (lv_nodes_20_0= ruleNode )
            	    	    // InternalStateSystem.g:257:10: lv_nodes_20_0= ruleNode
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getStateSystemAccess().getNodesNodeParserRuleCall_1_2_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_nodes_20_0=ruleNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										if (current==null) {
            	    	      											current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	    	      										}
            	    	      										add(
            	    	      											current,
            	    	      											"nodes",
            	    	      											lv_nodes_20_0,
            	    	      											"at.ac.tuwien.big.statesml.StateSystem.Node");
            	    	      										afterParserOrEnumRuleCall();
            	    	      									
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    otherlv_21=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_21, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_1_3());
            	      							
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateSystemAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateSystem.g:284:3: ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalStateSystem.g:284:3: ({...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) ) )
            	    // InternalStateSystem.g:285:4: {...}? => ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalStateSystem.g:285:105: ( ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ) )
            	    // InternalStateSystem.g:286:5: ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStateSystemAccess().getUnorderedGroup(), 2);
            	    // InternalStateSystem.g:289:8: ({...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' ) )
            	    // InternalStateSystem.g:289:9: {...}? => ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStateSystem", "true");
            	    }
            	    // InternalStateSystem.g:289:18: ( (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}' )
            	    // InternalStateSystem.g:289:19: (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )? (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )? otherlv_30= '}'
            	    {
            	    // InternalStateSystem.g:289:19: (otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==19) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalStateSystem.g:290:9: otherlv_22= 'control' otherlv_23= '{' ( (lv_nodes_24_0= ruleControl ) )+ otherlv_25= '}'
            	            {
            	            otherlv_22=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_22, grammarAccess.getStateSystemAccess().getControlKeyword_2_0_0());
            	              								
            	            }
            	            otherlv_23=(Token)match(input,13,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_23, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_2_0_1());
            	              								
            	            }
            	            // InternalStateSystem.g:298:9: ( (lv_nodes_24_0= ruleControl ) )+
            	            int cnt7=0;
            	            loop7:
            	            do {
            	                int alt7=2;
            	                int LA7_0 = input.LA(1);

            	                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
            	                    alt7=1;
            	                }


            	                switch (alt7) {
            	            	case 1 :
            	            	    // InternalStateSystem.g:299:10: (lv_nodes_24_0= ruleControl )
            	            	    {
            	            	    // InternalStateSystem.g:299:10: (lv_nodes_24_0= ruleControl )
            	            	    // InternalStateSystem.g:300:11: lv_nodes_24_0= ruleControl
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      											newCompositeNode(grammarAccess.getStateSystemAccess().getNodesControlParserRuleCall_2_0_2_0());
            	            	      										
            	            	    }
            	            	    pushFollow(FOLLOW_14);
            	            	    lv_nodes_24_0=ruleControl();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      											if (current==null) {
            	            	      												current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	            	      											}
            	            	      											add(
            	            	      												current,
            	            	      												"nodes",
            	            	      												lv_nodes_24_0,
            	            	      												"at.ac.tuwien.big.statesml.StateSystem.Control");
            	            	      											afterParserOrEnumRuleCall();
            	            	      										
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt7 >= 1 ) break loop7;
            	            	    if (state.backtracking>0) {state.failed=true; return current;}
            	                        EarlyExitException eee =
            	                            new EarlyExitException(7, input);
            	                        throw eee;
            	                }
            	                cnt7++;
            	            } while (true);

            	            otherlv_25=(Token)match(input,15,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_25, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_2_0_3());
            	              								
            	            }

            	            }
            	            break;

            	    }

            	    // InternalStateSystem.g:322:8: (otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==20) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalStateSystem.g:323:9: otherlv_26= 'edges' otherlv_27= '{' ( (lv_edges_28_0= ruleEdge ) )+ otherlv_29= '}'
            	            {
            	            otherlv_26=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_26, grammarAccess.getStateSystemAccess().getEdgesKeyword_2_1_0());
            	              								
            	            }
            	            otherlv_27=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_27, grammarAccess.getStateSystemAccess().getLeftCurlyBracketKeyword_2_1_1());
            	              								
            	            }
            	            // InternalStateSystem.g:331:9: ( (lv_edges_28_0= ruleEdge ) )+
            	            int cnt9=0;
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==RULE_ID) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalStateSystem.g:332:10: (lv_edges_28_0= ruleEdge )
            	            	    {
            	            	    // InternalStateSystem.g:332:10: (lv_edges_28_0= ruleEdge )
            	            	    // InternalStateSystem.g:333:11: lv_edges_28_0= ruleEdge
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      											newCompositeNode(grammarAccess.getStateSystemAccess().getEdgesEdgeParserRuleCall_2_1_2_0());
            	            	      										
            	            	    }
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_edges_28_0=ruleEdge();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      											if (current==null) {
            	            	      												current = createModelElementForParent(grammarAccess.getStateSystemRule());
            	            	      											}
            	            	      											add(
            	            	      												current,
            	            	      												"edges",
            	            	      												lv_edges_28_0,
            	            	      												"at.ac.tuwien.big.statesml.StateSystem.Edge");
            	            	      											afterParserOrEnumRuleCall();
            	            	      										
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt9 >= 1 ) break loop9;
            	            	    if (state.backtracking>0) {state.failed=true; return current;}
            	                        EarlyExitException eee =
            	                            new EarlyExitException(9, input);
            	                        throw eee;
            	                }
            	                cnt9++;
            	            } while (true);

            	            otherlv_29=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(otherlv_29, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_2_1_3());
            	              								
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_30=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_30, grammarAccess.getStateSystemAccess().getRightCurlyBracketKeyword_2_2());
            	      							
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateSystemAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStateSystemAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleStateSystem", "getUnorderedGroupHelper().canLeave(grammarAccess.getStateSystemAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getStateSystemAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStateSystem"


    // $ANTLR start "entryRuleNode"
    // InternalStateSystem.g:376:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalStateSystem.g:376:45: (iv_ruleNode= ruleNode EOF )
            // InternalStateSystem.g:377:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalStateSystem.g:383:1: ruleNode returns [EObject current=null] : ( (otherlv_0= 's' this_State_1= ruleState ) | this_Transition_2= ruleTransition ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_State_1 = null;

        EObject this_Transition_2 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:389:2: ( ( (otherlv_0= 's' this_State_1= ruleState ) | this_Transition_2= ruleTransition ) )
            // InternalStateSystem.g:390:2: ( (otherlv_0= 's' this_State_1= ruleState ) | this_Transition_2= ruleTransition )
            {
            // InternalStateSystem.g:390:2: ( (otherlv_0= 's' this_State_1= ruleState ) | this_Transition_2= ruleTransition )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateSystem.g:391:3: (otherlv_0= 's' this_State_1= ruleState )
                    {
                    // InternalStateSystem.g:391:3: (otherlv_0= 's' this_State_1= ruleState )
                    // InternalStateSystem.g:392:4: otherlv_0= 's' this_State_1= ruleState
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getSKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNodeAccess().getStateParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_State_1=ruleState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_State_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:406:3: this_Transition_2= ruleTransition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Transition_2=ruleTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Transition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEdge"
    // InternalStateSystem.g:418:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalStateSystem.g:418:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalStateSystem.g:419:2: iv_ruleEdge= ruleEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdge; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalStateSystem.g:425:1: ruleEdge returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStateSystem.g:431:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) ) )
            // InternalStateSystem.g:432:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) )
            {
            // InternalStateSystem.g:432:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) ) )
            // InternalStateSystem.g:433:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) otherlv_3= '=>' ( ( ruleQualifiedName ) )
            {
            // InternalStateSystem.g:433:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==22) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalStateSystem.g:434:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalStateSystem.g:434:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalStateSystem.g:435:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalStateSystem.g:435:5: (lv_name_0_0= RULE_ID )
                    // InternalStateSystem.g:436:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEdgeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalStateSystem.g:457:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:458:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:458:4: ( ruleQualifiedName )
            // InternalStateSystem.g:459:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEdgeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeAccess().getSourceNodeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalStateSystem.g:477:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:478:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:478:4: ( ruleQualifiedName )
            // InternalStateSystem.g:479:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEdgeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEdgeAccess().getTargetNodeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleControl"
    // InternalStateSystem.g:497:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // InternalStateSystem.g:497:48: (iv_ruleControl= ruleControl EOF )
            // InternalStateSystem.g:498:2: iv_ruleControl= ruleControl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControl=ruleControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // InternalStateSystem.g:504:1: ruleControl returns [EObject current=null] : ( (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence ) | (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence ) ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectionDivergence_1 = null;

        EObject this_SelectionConvergence_3 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:510:2: ( ( (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence ) | (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence ) ) )
            // InternalStateSystem.g:511:2: ( (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence ) | (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence ) )
            {
            // InternalStateSystem.g:511:2: ( (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence ) | (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateSystem.g:512:3: (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence )
                    {
                    // InternalStateSystem.g:512:3: (otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence )
                    // InternalStateSystem.g:513:4: otherlv_0= 'divergence' this_SelectionDivergence_1= ruleSelectionDivergence
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getControlAccess().getDivergenceKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getControlAccess().getSelectionDivergenceParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectionDivergence_1=ruleSelectionDivergence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SelectionDivergence_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:527:3: (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence )
                    {
                    // InternalStateSystem.g:527:3: (otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence )
                    // InternalStateSystem.g:528:4: otherlv_2= 'convergence' this_SelectionConvergence_3= ruleSelectionConvergence
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getControlAccess().getConvergenceKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getControlAccess().getSelectionConvergenceParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectionConvergence_3=ruleSelectionConvergence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SelectionConvergence_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleSelectionConvergence"
    // InternalStateSystem.g:545:1: entryRuleSelectionConvergence returns [EObject current=null] : iv_ruleSelectionConvergence= ruleSelectionConvergence EOF ;
    public final EObject entryRuleSelectionConvergence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionConvergence = null;


        try {
            // InternalStateSystem.g:545:61: (iv_ruleSelectionConvergence= ruleSelectionConvergence EOF )
            // InternalStateSystem.g:546:2: iv_ruleSelectionConvergence= ruleSelectionConvergence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionConvergenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectionConvergence=ruleSelectionConvergence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionConvergence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectionConvergence"


    // $ANTLR start "ruleSelectionConvergence"
    // InternalStateSystem.g:552:1: ruleSelectionConvergence returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSelectionConvergence() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateSystem.g:558:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateSystem.g:559:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateSystem.g:559:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:560:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:560:3: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:561:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSelectionConvergenceAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSelectionConvergenceRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSelectionConvergence"


    // $ANTLR start "entryRuleSelectionDivergence"
    // InternalStateSystem.g:580:1: entryRuleSelectionDivergence returns [EObject current=null] : iv_ruleSelectionDivergence= ruleSelectionDivergence EOF ;
    public final EObject entryRuleSelectionDivergence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionDivergence = null;


        try {
            // InternalStateSystem.g:580:60: (iv_ruleSelectionDivergence= ruleSelectionDivergence EOF )
            // InternalStateSystem.g:581:2: iv_ruleSelectionDivergence= ruleSelectionDivergence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionDivergenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectionDivergence=ruleSelectionDivergence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionDivergence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectionDivergence"


    // $ANTLR start "ruleSelectionDivergence"
    // InternalStateSystem.g:587:1: ruleSelectionDivergence returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSelectionDivergence() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateSystem.g:593:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateSystem.g:594:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateSystem.g:594:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:595:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:595:3: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:596:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSelectionDivergenceAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSelectionDivergenceRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSelectionDivergence"


    // $ANTLR start "entryRuleState"
    // InternalStateSystem.g:615:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateSystem.g:615:46: (iv_ruleState= ruleState EOF )
            // InternalStateSystem.g:616:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateSystem.g:622:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token lv_terminal_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actionSequence_5_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:628:2: ( ( ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? ) ) )
            // InternalStateSystem.g:629:2: ( ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? ) )
            {
            // InternalStateSystem.g:629:2: ( ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalStateSystem.g:630:3: ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalStateSystem.g:630:3: ( ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalStateSystem.g:631:4: ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalStateSystem.g:631:4: ( ( (lv_initial_0_0= 'initial' ) ) | ( (lv_terminal_1_0= 'terminal' ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==27) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalStateSystem.g:632:5: ( (lv_initial_0_0= 'initial' ) )
                            {
                            // InternalStateSystem.g:632:5: ( (lv_initial_0_0= 'initial' ) )
                            // InternalStateSystem.g:633:6: (lv_initial_0_0= 'initial' )
                            {
                            // InternalStateSystem.g:633:6: (lv_initial_0_0= 'initial' )
                            // InternalStateSystem.g:634:7: lv_initial_0_0= 'initial'
                            {
                            lv_initial_0_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStateRule());
                              							}
                              							setWithLastConsumed(current, "initial", true, "initial");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalStateSystem.g:647:5: ( (lv_terminal_1_0= 'terminal' ) )
                            {
                            // InternalStateSystem.g:647:5: ( (lv_terminal_1_0= 'terminal' ) )
                            // InternalStateSystem.g:648:6: (lv_terminal_1_0= 'terminal' )
                            {
                            // InternalStateSystem.g:648:6: (lv_terminal_1_0= 'terminal' )
                            // InternalStateSystem.g:649:7: lv_terminal_1_0= 'terminal'
                            {
                            lv_terminal_1_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_terminal_1_0, grammarAccess.getStateAccess().getTerminalTerminalKeyword_0_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStateRule());
                              							}
                              							setWithLastConsumed(current, "terminal", true, "terminal");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalStateSystem.g:662:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalStateSystem.g:663:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalStateSystem.g:663:5: (lv_name_2_0= RULE_ID )
                    // InternalStateSystem.g:664:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:682:3: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? )
                    {
                    // InternalStateSystem.g:682:3: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )? )
                    // InternalStateSystem.g:683:4: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )?
                    {
                    // InternalStateSystem.g:683:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalStateSystem.g:684:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalStateSystem.g:684:5: (lv_name_3_0= RULE_ID )
                    // InternalStateSystem.g:685:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalStateSystem.g:701:4: (otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==13) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalStateSystem.g:702:5: otherlv_4= '{' ( (lv_actionSequence_5_0= ruleFunctionCall ) )* otherlv_6= '}'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalStateSystem.g:706:5: ( (lv_actionSequence_5_0= ruleFunctionCall ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalStateSystem.g:707:6: (lv_actionSequence_5_0= ruleFunctionCall )
                            	    {
                            	    // InternalStateSystem.g:707:6: (lv_actionSequence_5_0= ruleFunctionCall )
                            	    // InternalStateSystem.g:708:7: lv_actionSequence_5_0= ruleFunctionCall
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getStateAccess().getActionSequenceFunctionCallParserRuleCall_1_1_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_actionSequence_5_0=ruleFunctionCall();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getStateRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"actionSequence",
                            	      								lv_actionSequence_5_0,
                            	      								"at.ac.tuwien.big.statesml.StateSystem.FunctionCall");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalStateSystem.g:735:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalStateSystem.g:735:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalStateSystem.g:736:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalStateSystem.g:742:1: ruleFunctionCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameterValue ) )* otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:748:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameterValue ) )* otherlv_3= ')' ) )
            // InternalStateSystem.g:749:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameterValue ) )* otherlv_3= ')' )
            {
            // InternalStateSystem.g:749:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameterValue ) )* otherlv_3= ')' )
            // InternalStateSystem.g:750:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameterValue ) )* otherlv_3= ')'
            {
            // InternalStateSystem.g:750:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:751:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:751:4: ( ruleQualifiedName )
            // InternalStateSystem.g:752:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalStateSystem.g:770:3: ( (lv_parameters_2_0= ruleParameterValue ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStateSystem.g:771:4: (lv_parameters_2_0= ruleParameterValue )
            	    {
            	    // InternalStateSystem.g:771:4: (lv_parameters_2_0= ruleParameterValue )
            	    // InternalStateSystem.g:772:5: lv_parameters_2_0= ruleParameterValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterValueParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_parameters_2_0=ruleParameterValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parameters",
            	      						lv_parameters_2_0,
            	      						"at.ac.tuwien.big.statesml.StateSystem.ParameterValue");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameterValue"
    // InternalStateSystem.g:797:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalStateSystem.g:797:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalStateSystem.g:798:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalStateSystem.g:804:1: ruleParameterValue returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_valueSpecification_2_0= ruleValueSpecification ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valueSpecification_2_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:810:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_valueSpecification_2_0= ruleValueSpecification ) ) (otherlv_3= ',' )? ) )
            // InternalStateSystem.g:811:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_valueSpecification_2_0= ruleValueSpecification ) ) (otherlv_3= ',' )? )
            {
            // InternalStateSystem.g:811:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_valueSpecification_2_0= ruleValueSpecification ) ) (otherlv_3= ',' )? )
            // InternalStateSystem.g:812:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_valueSpecification_2_0= ruleValueSpecification ) ) (otherlv_3= ',' )?
            {
            // InternalStateSystem.g:812:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:813:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:813:4: ( ruleQualifiedName )
            // InternalStateSystem.g:814:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterValueRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterValueAccess().getParameterParameterCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterValueAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalStateSystem.g:832:3: ( (lv_valueSpecification_2_0= ruleValueSpecification ) )
            // InternalStateSystem.g:833:4: (lv_valueSpecification_2_0= ruleValueSpecification )
            {
            // InternalStateSystem.g:833:4: (lv_valueSpecification_2_0= ruleValueSpecification )
            // InternalStateSystem.g:834:5: lv_valueSpecification_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterValueAccess().getValueSpecificationValueSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_valueSpecification_2_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterValueRule());
              					}
              					set(
              						current,
              						"valueSpecification",
              						lv_valueSpecification_2_0,
              						"at.ac.tuwien.big.statesml.StateSystem.ValueSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStateSystem.g:851:3: (otherlv_3= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalStateSystem.g:852:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getParameterValueAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleValueSpecification"
    // InternalStateSystem.g:861:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // InternalStateSystem.g:861:59: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // InternalStateSystem.g:862:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueSpecification"


    // $ANTLR start "ruleValueSpecification"
    // InternalStateSystem.g:868:1: ruleValueSpecification returns [EObject current=null] : (this_IntegerValueSpecification_0= ruleIntegerValueSpecification | this_BooleanValueSpecification_1= ruleBooleanValueSpecification | this_StringValueSpecification_2= ruleStringValueSpecification | this_AttributeValueSpecification_3= ruleAttributeValueSpecification ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValueSpecification_0 = null;

        EObject this_BooleanValueSpecification_1 = null;

        EObject this_StringValueSpecification_2 = null;

        EObject this_AttributeValueSpecification_3 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:874:2: ( (this_IntegerValueSpecification_0= ruleIntegerValueSpecification | this_BooleanValueSpecification_1= ruleBooleanValueSpecification | this_StringValueSpecification_2= ruleStringValueSpecification | this_AttributeValueSpecification_3= ruleAttributeValueSpecification ) )
            // InternalStateSystem.g:875:2: (this_IntegerValueSpecification_0= ruleIntegerValueSpecification | this_BooleanValueSpecification_1= ruleBooleanValueSpecification | this_StringValueSpecification_2= ruleStringValueSpecification | this_AttributeValueSpecification_3= ruleAttributeValueSpecification )
            {
            // InternalStateSystem.g:875:2: (this_IntegerValueSpecification_0= ruleIntegerValueSpecification | this_BooleanValueSpecification_1= ruleBooleanValueSpecification | this_StringValueSpecification_2= ruleStringValueSpecification | this_AttributeValueSpecification_3= ruleAttributeValueSpecification )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 35:
                {
                alt21=1;
                }
                break;
            case 32:
            case 33:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalStateSystem.g:876:3: this_IntegerValueSpecification_0= ruleIntegerValueSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueSpecificationAccess().getIntegerValueSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerValueSpecification_0=ruleIntegerValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:885:3: this_BooleanValueSpecification_1= ruleBooleanValueSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueSpecificationAccess().getBooleanValueSpecificationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValueSpecification_1=ruleBooleanValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValueSpecification_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStateSystem.g:894:3: this_StringValueSpecification_2= ruleStringValueSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueSpecificationAccess().getStringValueSpecificationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValueSpecification_2=ruleStringValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValueSpecification_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStateSystem.g:903:3: this_AttributeValueSpecification_3= ruleAttributeValueSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueSpecificationAccess().getAttributeValueSpecificationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeValueSpecification_3=ruleAttributeValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeValueSpecification_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValueSpecification"


    // $ANTLR start "entryRuleAttributeValueSpecification"
    // InternalStateSystem.g:915:1: entryRuleAttributeValueSpecification returns [EObject current=null] : iv_ruleAttributeValueSpecification= ruleAttributeValueSpecification EOF ;
    public final EObject entryRuleAttributeValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueSpecification = null;


        try {
            // InternalStateSystem.g:915:68: (iv_ruleAttributeValueSpecification= ruleAttributeValueSpecification EOF )
            // InternalStateSystem.g:916:2: iv_ruleAttributeValueSpecification= ruleAttributeValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValueSpecification=ruleAttributeValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueSpecification"


    // $ANTLR start "ruleAttributeValueSpecification"
    // InternalStateSystem.g:922:1: ruleAttributeValueSpecification returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleAttributeValueSpecification() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalStateSystem.g:928:2: ( ( ( ruleQualifiedName ) ) )
            // InternalStateSystem.g:929:2: ( ( ruleQualifiedName ) )
            {
            // InternalStateSystem.g:929:2: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:930:3: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:930:3: ( ruleQualifiedName )
            // InternalStateSystem.g:931:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAttributeValueSpecificationRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAttributeValueSpecificationAccess().getAttributeAttributeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeValueSpecification"


    // $ANTLR start "entryRuleStringValueSpecification"
    // InternalStateSystem.g:948:1: entryRuleStringValueSpecification returns [EObject current=null] : iv_ruleStringValueSpecification= ruleStringValueSpecification EOF ;
    public final EObject entryRuleStringValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueSpecification = null;


        try {
            // InternalStateSystem.g:948:65: (iv_ruleStringValueSpecification= ruleStringValueSpecification EOF )
            // InternalStateSystem.g:949:2: iv_ruleStringValueSpecification= ruleStringValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValueSpecification=ruleStringValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueSpecification"


    // $ANTLR start "ruleStringValueSpecification"
    // InternalStateSystem.g:955:1: ruleStringValueSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValueSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:961:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalStateSystem.g:962:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalStateSystem.g:962:2: ( (lv_value_0_0= ruleEString ) )
            // InternalStateSystem.g:963:3: (lv_value_0_0= ruleEString )
            {
            // InternalStateSystem.g:963:3: (lv_value_0_0= ruleEString )
            // InternalStateSystem.g:964:4: lv_value_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStringValueSpecificationAccess().getValueEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStringValueSpecificationRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"at.ac.tuwien.big.statesml.StateSystem.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValueSpecification"


    // $ANTLR start "entryRuleBooleanValueSpecification"
    // InternalStateSystem.g:984:1: entryRuleBooleanValueSpecification returns [EObject current=null] : iv_ruleBooleanValueSpecification= ruleBooleanValueSpecification EOF ;
    public final EObject entryRuleBooleanValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueSpecification = null;


        try {
            // InternalStateSystem.g:984:66: (iv_ruleBooleanValueSpecification= ruleBooleanValueSpecification EOF )
            // InternalStateSystem.g:985:2: iv_ruleBooleanValueSpecification= ruleBooleanValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValueSpecification=ruleBooleanValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValueSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValueSpecification"


    // $ANTLR start "ruleBooleanValueSpecification"
    // InternalStateSystem.g:991:1: ruleBooleanValueSpecification returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanValueSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalStateSystem.g:997:2: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // InternalStateSystem.g:998:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // InternalStateSystem.g:998:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalStateSystem.g:999:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalStateSystem.g:999:3: ( (lv_value_0_0= 'true' ) )
                    // InternalStateSystem.g:1000:4: (lv_value_0_0= 'true' )
                    {
                    // InternalStateSystem.g:1000:4: (lv_value_0_0= 'true' )
                    // InternalStateSystem.g:1001:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueSpecificationAccess().getValueTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanValueSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "value", true, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:1014:3: ( (lv_value_1_0= 'false' ) )
                    {
                    // InternalStateSystem.g:1014:3: ( (lv_value_1_0= 'false' ) )
                    // InternalStateSystem.g:1015:4: (lv_value_1_0= 'false' )
                    {
                    // InternalStateSystem.g:1015:4: (lv_value_1_0= 'false' )
                    // InternalStateSystem.g:1016:5: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_1_0, grammarAccess.getBooleanValueSpecificationAccess().getValueFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanValueSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "value", true, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValueSpecification"


    // $ANTLR start "entryRuleIntegerValueSpecification"
    // InternalStateSystem.g:1032:1: entryRuleIntegerValueSpecification returns [EObject current=null] : iv_ruleIntegerValueSpecification= ruleIntegerValueSpecification EOF ;
    public final EObject entryRuleIntegerValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueSpecification = null;


        try {
            // InternalStateSystem.g:1032:66: (iv_ruleIntegerValueSpecification= ruleIntegerValueSpecification EOF )
            // InternalStateSystem.g:1033:2: iv_ruleIntegerValueSpecification= ruleIntegerValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValueSpecification=ruleIntegerValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueSpecification"


    // $ANTLR start "ruleIntegerValueSpecification"
    // InternalStateSystem.g:1039:1: ruleIntegerValueSpecification returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValueSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:1045:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalStateSystem.g:1046:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalStateSystem.g:1046:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalStateSystem.g:1047:3: (lv_value_0_0= ruleEInt )
            {
            // InternalStateSystem.g:1047:3: (lv_value_0_0= ruleEInt )
            // InternalStateSystem.g:1048:4: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIntegerValueSpecificationAccess().getValueEIntParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIntegerValueSpecificationRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"at.ac.tuwien.big.statesml.StateSystem.EInt");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueSpecification"


    // $ANTLR start "entryRuleParameter"
    // InternalStateSystem.g:1068:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalStateSystem.g:1068:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalStateSystem.g:1069:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStateSystem.g:1075:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleParameterDirectionKind ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:1081:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleParameterDirectionKind ) ) ) )
            // InternalStateSystem.g:1082:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleParameterDirectionKind ) ) )
            {
            // InternalStateSystem.g:1082:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleParameterDirectionKind ) ) )
            // InternalStateSystem.g:1083:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleParameterDirectionKind ) )
            {
            // InternalStateSystem.g:1083:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:1084:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:1084:4: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:1085:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalStateSystem.g:1101:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:1102:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:1102:4: ( ruleQualifiedName )
            // InternalStateSystem.g:1103:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeDataTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStateSystem.g:1117:3: ( (lv_direction_2_0= ruleParameterDirectionKind ) )
            // InternalStateSystem.g:1118:4: (lv_direction_2_0= ruleParameterDirectionKind )
            {
            // InternalStateSystem.g:1118:4: (lv_direction_2_0= ruleParameterDirectionKind )
            // InternalStateSystem.g:1119:5: lv_direction_2_0= ruleParameterDirectionKind
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getDirectionParameterDirectionKindEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_direction_2_0=ruleParameterDirectionKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_2_0,
              						"at.ac.tuwien.big.statesml.StateSystem.ParameterDirectionKind");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalStateSystem.g:1140:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalStateSystem.g:1140:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalStateSystem.g:1141:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalStateSystem.g:1147:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStateSystem.g:1153:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalStateSystem.g:1154:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalStateSystem.g:1154:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalStateSystem.g:1155:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalStateSystem.g:1162:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) && (synpred1_InternalStateSystem())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStateSystem.g:1163:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalStateSystem.g:1163:4: ( ( '.' )=>kw= '.' )
            	    // InternalStateSystem.g:1164:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEString"
    // InternalStateSystem.g:1183:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStateSystem.g:1183:47: (iv_ruleEString= ruleEString EOF )
            // InternalStateSystem.g:1184:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStateSystem.g:1190:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalStateSystem.g:1196:2: (this_STRING_0= RULE_STRING )
            // InternalStateSystem.g:1197:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalStateSystem.g:1207:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalStateSystem.g:1207:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalStateSystem.g:1208:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalStateSystem.g:1214:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalStateSystem.g:1220:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalStateSystem.g:1221:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalStateSystem.g:1221:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalStateSystem.g:1222:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalStateSystem.g:1222:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateSystem.g:1223:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAttribute"
    // InternalStateSystem.g:1240:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalStateSystem.g:1240:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalStateSystem.g:1241:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalStateSystem.g:1247:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStateSystem.g:1253:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalStateSystem.g:1254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalStateSystem.g:1254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalStateSystem.g:1255:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalStateSystem.g:1255:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:1256:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:1256:4: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:1257:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
              		
            }
            // InternalStateSystem.g:1277:3: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:1278:4: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:1278:4: ( ruleQualifiedName )
            // InternalStateSystem.g:1279:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleChangeEvent"
    // InternalStateSystem.g:1297:1: entryRuleChangeEvent returns [EObject current=null] : iv_ruleChangeEvent= ruleChangeEvent EOF ;
    public final EObject entryRuleChangeEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeEvent = null;


        try {
            // InternalStateSystem.g:1297:52: (iv_ruleChangeEvent= ruleChangeEvent EOF )
            // InternalStateSystem.g:1298:2: iv_ruleChangeEvent= ruleChangeEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeEvent=ruleChangeEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChangeEvent"


    // $ANTLR start "ruleChangeEvent"
    // InternalStateSystem.g:1304:1: ruleChangeEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_changeExpression_2_0= ruleChangeExpression ) ) ) ;
    public final EObject ruleChangeEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_changeExpression_2_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:1310:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_changeExpression_2_0= ruleChangeExpression ) ) ) )
            // InternalStateSystem.g:1311:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_changeExpression_2_0= ruleChangeExpression ) ) )
            {
            // InternalStateSystem.g:1311:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_changeExpression_2_0= ruleChangeExpression ) ) )
            // InternalStateSystem.g:1312:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_changeExpression_2_0= ruleChangeExpression ) )
            {
            // InternalStateSystem.g:1312:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:1313:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:1313:4: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:1314:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getChangeEventAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeEventAccess().getColonKeyword_1());
              		
            }
            // InternalStateSystem.g:1334:3: ( (lv_changeExpression_2_0= ruleChangeExpression ) )
            // InternalStateSystem.g:1335:4: (lv_changeExpression_2_0= ruleChangeExpression )
            {
            // InternalStateSystem.g:1335:4: (lv_changeExpression_2_0= ruleChangeExpression )
            // InternalStateSystem.g:1336:5: lv_changeExpression_2_0= ruleChangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeEventAccess().getChangeExpressionChangeExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_changeExpression_2_0=ruleChangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChangeEventRule());
              					}
              					set(
              						current,
              						"changeExpression",
              						lv_changeExpression_2_0,
              						"at.ac.tuwien.big.statesml.StateSystem.ChangeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeEvent"


    // $ANTLR start "entryRuleChangeExpression"
    // InternalStateSystem.g:1357:1: entryRuleChangeExpression returns [EObject current=null] : iv_ruleChangeExpression= ruleChangeExpression EOF ;
    public final EObject entryRuleChangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeExpression = null;


        try {
            // InternalStateSystem.g:1357:57: (iv_ruleChangeExpression= ruleChangeExpression EOF )
            // InternalStateSystem.g:1358:2: iv_ruleChangeExpression= ruleChangeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeExpression=ruleChangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChangeExpression"


    // $ANTLR start "ruleChangeExpression"
    // InternalStateSystem.g:1364:1: ruleChangeExpression returns [EObject current=null] : ( (lv_booleanFunctionCall_0_0= ruleFunctionCall ) ) ;
    public final EObject ruleChangeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_booleanFunctionCall_0_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:1370:2: ( ( (lv_booleanFunctionCall_0_0= ruleFunctionCall ) ) )
            // InternalStateSystem.g:1371:2: ( (lv_booleanFunctionCall_0_0= ruleFunctionCall ) )
            {
            // InternalStateSystem.g:1371:2: ( (lv_booleanFunctionCall_0_0= ruleFunctionCall ) )
            // InternalStateSystem.g:1372:3: (lv_booleanFunctionCall_0_0= ruleFunctionCall )
            {
            // InternalStateSystem.g:1372:3: (lv_booleanFunctionCall_0_0= ruleFunctionCall )
            // InternalStateSystem.g:1373:4: lv_booleanFunctionCall_0_0= ruleFunctionCall
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getChangeExpressionAccess().getBooleanFunctionCallFunctionCallParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_booleanFunctionCall_0_0=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getChangeExpressionRule());
              				}
              				set(
              					current,
              					"booleanFunctionCall",
              					lv_booleanFunctionCall_0_0,
              					"at.ac.tuwien.big.statesml.StateSystem.FunctionCall");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeExpression"


    // $ANTLR start "entryRuleTransition"
    // InternalStateSystem.g:1393:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateSystem.g:1393:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateSystem.g:1394:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateSystem.g:1400:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_trigger_2_0 = null;



        	enterRule();

        try {
            // InternalStateSystem.g:1406:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )? ) )
            // InternalStateSystem.g:1407:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )? )
            {
            // InternalStateSystem.g:1407:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )? )
            // InternalStateSystem.g:1408:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )?
            {
            // InternalStateSystem.g:1408:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateSystem.g:1409:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateSystem.g:1409:4: (lv_name_0_0= RULE_ID )
            // InternalStateSystem.g:1410:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalStateSystem.g:1426:3: (otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStateSystem.g:1427:4: otherlv_1= 'triggerd-by' ( (lv_trigger_2_0= ruleTrigger ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTriggerdByKeyword_1_0());
                      			
                    }
                    // InternalStateSystem.g:1431:4: ( (lv_trigger_2_0= ruleTrigger ) )
                    // InternalStateSystem.g:1432:5: (lv_trigger_2_0= ruleTrigger )
                    {
                    // InternalStateSystem.g:1432:5: (lv_trigger_2_0= ruleTrigger )
                    // InternalStateSystem.g:1433:6: lv_trigger_2_0= ruleTrigger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getTriggerTriggerParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_trigger_2_0=ruleTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRule());
                      						}
                      						set(
                      							current,
                      							"trigger",
                      							lv_trigger_2_0,
                      							"at.ac.tuwien.big.statesml.StateSystem.Trigger");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTrigger"
    // InternalStateSystem.g:1455:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalStateSystem.g:1455:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalStateSystem.g:1456:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalStateSystem.g:1462:1: ruleTrigger returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalStateSystem.g:1468:2: ( ( ( ruleQualifiedName ) ) )
            // InternalStateSystem.g:1469:2: ( ( ruleQualifiedName ) )
            {
            // InternalStateSystem.g:1469:2: ( ( ruleQualifiedName ) )
            // InternalStateSystem.g:1470:3: ( ruleQualifiedName )
            {
            // InternalStateSystem.g:1470:3: ( ruleQualifiedName )
            // InternalStateSystem.g:1471:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTriggerRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTriggerAccess().getEventChangeEventCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "ruleParameterDirectionKind"
    // InternalStateSystem.g:1488:1: ruleParameterDirectionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'RETURN' ) ) ;
    public final Enumerator ruleParameterDirectionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStateSystem.g:1494:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'RETURN' ) ) )
            // InternalStateSystem.g:1495:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'RETURN' ) )
            {
            // InternalStateSystem.g:1495:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'RETURN' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalStateSystem.g:1496:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalStateSystem.g:1496:3: (enumLiteral_0= 'IN' )
                    // InternalStateSystem.g:1497:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterDirectionKindAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterDirectionKindAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateSystem.g:1504:3: (enumLiteral_1= 'RETURN' )
                    {
                    // InternalStateSystem.g:1504:3: (enumLiteral_1= 'RETURN' )
                    // InternalStateSystem.g:1505:4: enumLiteral_1= 'RETURN'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterDirectionKindAccess().getRETURNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterDirectionKindAccess().getRETURNEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterDirectionKind"

    // $ANTLR start synpred1_InternalStateSystem
    public final void synpred1_InternalStateSystem_fragment() throws RecognitionException {   
        // InternalStateSystem.g:1164:5: ( '.' )
        // InternalStateSystem.g:1164:6: '.'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStateSystem

    // Delegated rules

    public final boolean synpred1_InternalStateSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStateSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C8802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000B00000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});

}
