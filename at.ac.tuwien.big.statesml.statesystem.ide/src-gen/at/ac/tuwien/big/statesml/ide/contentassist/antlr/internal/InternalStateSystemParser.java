package at.ac.tuwien.big.statesml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.statesml.services.StateSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStateSystemParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(StateSystemGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStateSystem"
    // InternalStateSystem.g:54:1: entryRuleStateSystem : ruleStateSystem EOF ;
    public final void entryRuleStateSystem() throws RecognitionException {
        try {
            // InternalStateSystem.g:55:1: ( ruleStateSystem EOF )
            // InternalStateSystem.g:56:1: ruleStateSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStateSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateSystem"


    // $ANTLR start "ruleStateSystem"
    // InternalStateSystem.g:63:1: ruleStateSystem : ( ( rule__StateSystem__Group__0 ) ) ;
    public final void ruleStateSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:67:2: ( ( ( rule__StateSystem__Group__0 ) ) )
            // InternalStateSystem.g:68:2: ( ( rule__StateSystem__Group__0 ) )
            {
            // InternalStateSystem.g:68:2: ( ( rule__StateSystem__Group__0 ) )
            // InternalStateSystem.g:69:3: ( rule__StateSystem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateSystemAccess().getGroup()); 
            }
            // InternalStateSystem.g:70:3: ( rule__StateSystem__Group__0 )
            // InternalStateSystem.g:70:4: rule__StateSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateSystem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateSystem"


    // $ANTLR start "rule__StateSystem__Group__0"
    // InternalStateSystem.g:78:1: rule__StateSystem__Group__0 : rule__StateSystem__Group__0__Impl rule__StateSystem__Group__1 ;
    public final void rule__StateSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:82:1: ( rule__StateSystem__Group__0__Impl rule__StateSystem__Group__1 )
            // InternalStateSystem.g:83:2: rule__StateSystem__Group__0__Impl rule__StateSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateSystem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateSystem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSystem__Group__0"


    // $ANTLR start "rule__StateSystem__Group__0__Impl"
    // InternalStateSystem.g:90:1: rule__StateSystem__Group__0__Impl : ( 'statesystem' ) ;
    public final void rule__StateSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:94:1: ( ( 'statesystem' ) )
            // InternalStateSystem.g:95:1: ( 'statesystem' )
            {
            // InternalStateSystem.g:95:1: ( 'statesystem' )
            // InternalStateSystem.g:96:2: 'statesystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateSystemAccess().getStatesystemKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateSystemAccess().getStatesystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSystem__Group__0__Impl"


    // $ANTLR start "rule__StateSystem__Group__1"
    // InternalStateSystem.g:105:1: rule__StateSystem__Group__1 : rule__StateSystem__Group__1__Impl ;
    public final void rule__StateSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:109:1: ( rule__StateSystem__Group__1__Impl )
            // InternalStateSystem.g:110:2: rule__StateSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateSystem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSystem__Group__1"


    // $ANTLR start "rule__StateSystem__Group__1__Impl"
    // InternalStateSystem.g:116:1: rule__StateSystem__Group__1__Impl : ( ( rule__StateSystem__NameAssignment_1 ) ) ;
    public final void rule__StateSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:120:1: ( ( ( rule__StateSystem__NameAssignment_1 ) ) )
            // InternalStateSystem.g:121:1: ( ( rule__StateSystem__NameAssignment_1 ) )
            {
            // InternalStateSystem.g:121:1: ( ( rule__StateSystem__NameAssignment_1 ) )
            // InternalStateSystem.g:122:2: ( rule__StateSystem__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateSystemAccess().getNameAssignment_1()); 
            }
            // InternalStateSystem.g:123:2: ( rule__StateSystem__NameAssignment_1 )
            // InternalStateSystem.g:123:3: rule__StateSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateSystem__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateSystemAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSystem__Group__1__Impl"


    // $ANTLR start "rule__StateSystem__NameAssignment_1"
    // InternalStateSystem.g:132:1: rule__StateSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateSystem.g:136:1: ( ( RULE_ID ) )
            // InternalStateSystem.g:137:2: ( RULE_ID )
            {
            // InternalStateSystem.g:137:2: ( RULE_ID )
            // InternalStateSystem.g:138:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSystem__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}