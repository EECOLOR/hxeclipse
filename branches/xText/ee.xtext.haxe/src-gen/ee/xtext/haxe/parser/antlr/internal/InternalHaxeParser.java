package ee.xtext.haxe.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ee.xtext.haxe.services.HaxeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHaxeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEX", "RULE_FLOAT", "RULE_STRING", "RULE_REGULAR_EXPRESSION", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "','", "'>'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'||'", "'&&'", "'...'", "'=='", "'!='", "'>='", "'<='", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'.'", "'('", "')'", "'{'", "';'", "'}'", "'var'", "':'", "'new'", "'super'", "'false'", "'true'", "'null'", "'['", "']'"
    };
    public static final int RULE_REGULAR_EXPRESSION=8;
    public static final int RULE_ID=9;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalHaxeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHaxeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHaxeParser.tokenNames; }
    public String getGrammarFileName() { return "../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g"; }



     	private HaxeGrammarAccess grammarAccess;
     	
        public InternalHaxeParser(TokenStream input, HaxeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	}
       	
       	@Override
       	protected HaxeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFile"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:67:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:68:2: (iv_ruleFile= ruleFile EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:69:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile75);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:76:1: ruleFile returns [EObject current=null] : ( (lv_blockExpression_0_0= ruleBlockExpression ) )* ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_blockExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:79:28: ( ( (lv_blockExpression_0_0= ruleBlockExpression ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:80:1: ( (lv_blockExpression_0_0= ruleBlockExpression ) )*
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:80:1: ( (lv_blockExpression_0_0= ruleBlockExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==54) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:81:1: (lv_blockExpression_0_0= ruleBlockExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:81:1: (lv_blockExpression_0_0= ruleBlockExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:82:3: lv_blockExpression_0_0= ruleBlockExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getBlockExpressionBlockExpressionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBlockExpression_in_ruleFile130);
            	    lv_blockExpression_0_0=ruleBlockExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"blockExpression",
            	              		lv_blockExpression_0_0, 
            	              		"BlockExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTypeReference"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:106:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:107:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:108:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference166);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:115:1: ruleTypeReference returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:118:28: ( ( ( (lv_type_0_0= ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:119:1: ( ( (lv_type_0_0= ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:119:1: ( ( (lv_type_0_0= ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:119:2: ( (lv_type_0_0= ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:119:2: ( (lv_type_0_0= ruleQualifiedName ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:120:1: (lv_type_0_0= ruleQualifiedName )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:120:1: (lv_type_0_0= ruleQualifiedName )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:121:3: lv_type_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeQualifiedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeReference222);
            lv_type_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) && (synpred1_InternalHaxe())) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTypeReference243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:142:2: ( (lv_arguments_2_0= ruleTypeReference ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:143:1: (lv_arguments_2_0= ruleTypeReference )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:143:1: (lv_arguments_2_0= ruleTypeReference )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:144:3: lv_arguments_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getArgumentsTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleTypeReference265);
                    lv_arguments_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:160:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:160:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTypeReference278); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:164:1: ( (lv_arguments_4_0= ruleTypeReference ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:165:1: (lv_arguments_4_0= ruleTypeReference )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:165:1: (lv_arguments_4_0= ruleTypeReference )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:166:3: lv_arguments_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getArgumentsTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeReference_in_ruleTypeReference299);
                    	    lv_arguments_4_0=ruleTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"TypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTypeReference313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:194:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:195:2: (iv_ruleExpression= ruleExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:196:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression351);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:203:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:206:28: (this_Assignment_0= ruleAssignment )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:208:5: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression407);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Assignment_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:224:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:225:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:226:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment441);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:233:1: ruleAssignment returns [EObject current=null] : ( ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_OrExpression_4 = null;

        AntlrDatatypeRuleToken lv_feature_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:236:28: ( ( ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:1: ( ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:1: ( ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_INT && LA5_1<=RULE_ID)||(LA5_1>=14 && LA5_1<=16)||(LA5_1>=18 && LA5_1<=57)||(LA5_1>=59 && LA5_1<=65)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=RULE_INT && LA5_2<=RULE_ID)||(LA5_2>=14 && LA5_2<=16)||(LA5_2>=18 && LA5_2<=57)||(LA5_2>=59 && LA5_2<=65)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_FLOAT:
            case RULE_STRING:
            case RULE_REGULAR_EXPRESSION:
            case 43:
            case 47:
            case 48:
            case 49:
            case 50:
            case 52:
            case 54:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:2: ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:2: ( () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:3: () ( ( ruleIdOrSuper ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:3: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:238:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAssignmentAccess().getAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:243:2: ( ( ruleIdOrSuper ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:244:1: ( ruleIdOrSuper )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:244:1: ( ruleIdOrSuper )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:245:3: ruleIdOrSuper
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureFeatureCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdOrSuper_in_ruleAssignment509);
                    ruleIdOrSuper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleAssignment525);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:266:1: ( (lv_value_3_0= ruleAssignment ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:267:1: (lv_value_3_0= ruleAssignment )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:267:1: (lv_value_3_0= ruleAssignment )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:268:3: lv_value_3_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleAssignment545);
                    lv_value_3_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:285:6: (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:285:6: (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:286:5: this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleAssignment575);
                    this_OrExpression_4=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:299:6: ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:299:7: () ( (lv_feature_6_0= ruleOpMultiAssign ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:299:7: ()
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:300:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:305:2: ( (lv_feature_6_0= ruleOpMultiAssign ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:306:1: (lv_feature_6_0= ruleOpMultiAssign )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:306:1: (lv_feature_6_0= ruleOpMultiAssign )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:307:3: lv_feature_6_0= ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureOpMultiAssignParserRuleCall_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleAssignment624);
                            lv_feature_6_0=ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"feature",
                                      		lv_feature_6_0, 
                                      		"OpMultiAssign");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:323:4: ( (lv_right_7_0= ruleAssignment ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:324:1: (lv_right_7_0= ruleAssignment )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:324:1: (lv_right_7_0= ruleAssignment )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:325:3: lv_right_7_0= ruleAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAssignment_in_ruleAssignment647);
                            lv_right_7_0=ruleAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"right",
                                      		lv_right_7_0, 
                                      		"Assignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:349:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:350:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:351:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign687);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign698); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:358:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:361:28: (kw= '=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:363:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:376:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:377:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:378:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign775);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign786); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:385:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:388:28: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:389:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:389:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            case 26:
                {
                alt6=9;
                }
                break;
            case 27:
                {
                alt6=10;
                }
                break;
            case 28:
                {
                alt6=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:390:2: kw= '+='
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:397:2: kw= '-='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:404:2: kw= '*='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:411:2: kw= '/='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:418:2: kw= '%='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpMultiAssign900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:425:2: kw= '&='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAmpersandEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:432:2: kw= '|='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getVerticalLineEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:439:2: kw= '^='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpMultiAssign957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getCircumflexAccentEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:446:2: kw= '<<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpMultiAssign976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignLessThanSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:453:2: kw= '>>='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:460:2: kw= '>>>='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign1014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_10()); 
                          
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleOrExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:473:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:474:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:475:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1054);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1064); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:482:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:485:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:486:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:486:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:487:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1111);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalHaxe()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:500:6: ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:500:7: () ( (lv_feature_2_0= ruleOpOr ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:500:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:501:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:506:2: ( (lv_feature_2_0= ruleOpOr ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:507:1: (lv_feature_2_0= ruleOpOr )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:507:1: (lv_feature_2_0= ruleOpOr )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:508:3: lv_feature_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getFeatureOpOrParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleOrExpression1160);
            	    lv_feature_2_0=ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:524:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:525:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:525:1: (lv_right_3_0= ruleAndExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:526:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1183);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:550:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:551:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:552:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1222);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:559:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:562:28: (kw= '||' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:564:2: kw= '||'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOr1270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleAndExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:577:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:578:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:579:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1309);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1319); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:586:1: ruleAndExpression returns [EObject current=null] : (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OtherOperatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:589:28: ( (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:590:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:590:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:591:5: this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression1366);
            this_OtherOperatorExpression_0=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalHaxe()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:604:6: ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:604:7: () ( (lv_feature_2_0= ruleOpAnd ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:604:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:605:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:610:2: ( (lv_feature_2_0= ruleOpAnd ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:611:1: (lv_feature_2_0= ruleOpAnd )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:611:1: (lv_feature_2_0= ruleOpAnd )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:612:3: lv_feature_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getFeatureOpAndParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleAndExpression1415);
            	    lv_feature_2_0=ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:628:4: ( (lv_right_3_0= ruleOtherOperatorExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:629:1: (lv_right_3_0= ruleOtherOperatorExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:629:1: (lv_right_3_0= ruleOtherOperatorExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:630:3: lv_right_3_0= ruleOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightOtherOperatorExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression1438);
            	    lv_right_3_0=ruleOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"OtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:655:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:656:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1477);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1488); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:663:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:666:28: (kw= '&&' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:668:2: kw= '&&'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAnd1525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleOtherOperatorExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:681:1: entryRuleOtherOperatorExpression returns [EObject current=null] : iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF ;
    public final EObject entryRuleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherOperatorExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:682:2: (iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:683:2: iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression1564);
            iv_ruleOtherOperatorExpression=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherOperatorExpression1574); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherOperatorExpression"


    // $ANTLR start "ruleOtherOperatorExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:690:1: ruleOtherOperatorExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* ) ;
    public final EObject ruleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:693:28: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:694:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:694:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:695:5: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getCompareExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression1621);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred5_InternalHaxe()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:708:6: ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:708:7: () ( (lv_feature_2_0= ruleOpOther ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:708:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:709:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:714:2: ( (lv_feature_2_0= ruleOpOther ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:715:1: (lv_feature_2_0= ruleOpOther )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:715:1: (lv_feature_2_0= ruleOpOther )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:716:3: lv_feature_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getFeatureOpOtherParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression1670);
            	    lv_feature_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOther");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:732:4: ( (lv_right_3_0= ruleCompareExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:733:1: (lv_right_3_0= ruleCompareExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:733:1: (lv_right_3_0= ruleCompareExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:734:3: lv_right_3_0= ruleCompareExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getRightCompareExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression1693);
            	    lv_right_3_0=ruleCompareExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"CompareExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:758:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:759:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:760:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther1732);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther1743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:767:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '...' ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:770:28: (kw= '...' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:772:2: kw= '...'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther1780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopFullStopKeyword()); 
                  
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleCompareExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:785:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:786:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:787:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1819);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:794:1: ruleCompareExpression returns [EObject current=null] : (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:797:28: ( (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:798:1: (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:798:1: (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:799:5: this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExpressionAccess().getBitwiseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression1876);
            this_BitwiseExpression_0=ruleBitwiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:1: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 16:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA10_7 = input.LA(2);

                    if ( (synpred6_InternalHaxe()) ) {
                        alt10=1;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:812:6: ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:812:7: () ( (lv_feature_2_0= ruleOpCompare ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:812:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:813:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:818:2: ( (lv_feature_2_0= ruleOpCompare ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:819:1: (lv_feature_2_0= ruleOpCompare )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:819:1: (lv_feature_2_0= ruleOpCompare )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:820:3: lv_feature_2_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleCompareExpression1925);
            	    lv_feature_2_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:836:4: ( (lv_right_3_0= ruleBitwiseExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:837:1: (lv_right_3_0= ruleBitwiseExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:837:1: (lv_right_3_0= ruleBitwiseExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:838:3: lv_right_3_0= ruleBitwiseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBitwiseExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression1948);
            	    lv_right_3_0=ruleBitwiseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BitwiseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:862:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:863:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:864:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1987);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1998); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:871:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:874:28: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:875:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:875:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            case 16:
                {
                alt11=5;
                }
                break;
            case 14:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:876:2: kw= '=='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:883:2: kw= '!='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:890:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare2074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:897:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare2093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:904:2: kw= '>'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpCompare2112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:911:2: kw= '<'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpCompare2131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_5()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleBitwiseExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:924:1: entryRuleBitwiseExpression returns [EObject current=null] : iv_ruleBitwiseExpression= ruleBitwiseExpression EOF ;
    public final EObject entryRuleBitwiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:925:2: (iv_ruleBitwiseExpression= ruleBitwiseExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:926:2: iv_ruleBitwiseExpression= ruleBitwiseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseExpression_in_entryRuleBitwiseExpression2171);
            iv_ruleBitwiseExpression=ruleBitwiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseExpression2181); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseExpression"


    // $ANTLR start "ruleBitwiseExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:933:1: ruleBitwiseExpression returns [EObject current=null] : (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* ) ;
    public final EObject ruleBitwiseExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitshiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:936:28: ( (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:937:1: (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:937:1: (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:938:5: this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getBitshiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression2228);
            this_BitshiftExpression_0=ruleBitshiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitshiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:1: ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred7_InternalHaxe()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred7_InternalHaxe()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred7_InternalHaxe()) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:3: ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:951:6: ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:951:7: () ( (lv_feature_2_0= ruleOpBitwise ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:951:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:952:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:957:2: ( (lv_feature_2_0= ruleOpBitwise ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:958:1: (lv_feature_2_0= ruleOpBitwise )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:958:1: (lv_feature_2_0= ruleOpBitwise )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:959:3: lv_feature_2_0= ruleOpBitwise
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getFeatureOpBitwiseParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpBitwise_in_ruleBitwiseExpression2277);
            	    lv_feature_2_0=ruleOpBitwise();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpBitwise");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:975:4: ( (lv_right_3_0= ruleBitshiftExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:976:1: (lv_right_3_0= ruleBitshiftExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:976:1: (lv_right_3_0= ruleBitshiftExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:977:3: lv_right_3_0= ruleBitshiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getRightBitshiftExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression2300);
            	    lv_right_3_0=ruleBitshiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BitshiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleBitwiseExpression"


    // $ANTLR start "entryRuleOpBitwise"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1001:1: entryRuleOpBitwise returns [String current=null] : iv_ruleOpBitwise= ruleOpBitwise EOF ;
    public final String entryRuleOpBitwise() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpBitwise = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1002:2: (iv_ruleOpBitwise= ruleOpBitwise EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1003:2: iv_ruleOpBitwise= ruleOpBitwise EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpBitwiseRule()); 
            }
            pushFollow(FOLLOW_ruleOpBitwise_in_entryRuleOpBitwise2339);
            iv_ruleOpBitwise=ruleOpBitwise();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpBitwise.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpBitwise2350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpBitwise"


    // $ANTLR start "ruleOpBitwise"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1010:1: ruleOpBitwise returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '&' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleOpBitwise() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1013:28: ( (kw= '|' | kw= '&' | kw= '^' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1014:1: (kw= '|' | kw= '&' | kw= '^' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1014:1: (kw= '|' | kw= '&' | kw= '^' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1015:2: kw= '|'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpBitwise2388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitwiseAccess().getVerticalLineKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1022:2: kw= '&'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpBitwise2407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitwiseAccess().getAmpersandKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1029:2: kw= '^'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpBitwise2426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitwiseAccess().getCircumflexAccentKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpBitwise"


    // $ANTLR start "entryRuleBitshiftExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1042:1: entryRuleBitshiftExpression returns [EObject current=null] : iv_ruleBitshiftExpression= ruleBitshiftExpression EOF ;
    public final EObject entryRuleBitshiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitshiftExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1043:2: (iv_ruleBitshiftExpression= ruleBitshiftExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1044:2: iv_ruleBitshiftExpression= ruleBitshiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitshiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitshiftExpression_in_entryRuleBitshiftExpression2466);
            iv_ruleBitshiftExpression=ruleBitshiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitshiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitshiftExpression2476); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitshiftExpression"


    // $ANTLR start "ruleBitshiftExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1051:1: ruleBitshiftExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleBitshiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1054:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1055:1: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1055:1: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1056:5: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getAddExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleBitshiftExpression2523);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:1: ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred8_InternalHaxe()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred8_InternalHaxe()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred8_InternalHaxe()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:3: ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1069:6: ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1069:7: () ( (lv_feature_2_0= ruleOpBitshift ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1069:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1075:2: ( (lv_feature_2_0= ruleOpBitshift ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:1: (lv_feature_2_0= ruleOpBitshift )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:1: (lv_feature_2_0= ruleOpBitshift )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1077:3: lv_feature_2_0= ruleOpBitshift
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getFeatureOpBitshiftParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpBitshift_in_ruleBitshiftExpression2572);
            	    lv_feature_2_0=ruleOpBitshift();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitshiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpBitshift");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1093:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1094:1: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1094:1: (lv_right_3_0= ruleAddExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1095:3: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddExpression_in_ruleBitshiftExpression2595);
            	    lv_right_3_0=ruleAddExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitshiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AddExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleBitshiftExpression"


    // $ANTLR start "entryRuleOpBitshift"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1119:1: entryRuleOpBitshift returns [String current=null] : iv_ruleOpBitshift= ruleOpBitshift EOF ;
    public final String entryRuleOpBitshift() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpBitshift = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1120:2: (iv_ruleOpBitshift= ruleOpBitshift EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1121:2: iv_ruleOpBitshift= ruleOpBitshift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpBitshiftRule()); 
            }
            pushFollow(FOLLOW_ruleOpBitshift_in_entryRuleOpBitshift2634);
            iv_ruleOpBitshift=ruleOpBitshift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpBitshift.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpBitshift2645); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpBitshift"


    // $ANTLR start "ruleOpBitshift"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1128:1: ruleOpBitshift returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<<' | kw= '>>' | kw= '>>>' ) ;
    public final AntlrDatatypeRuleToken ruleOpBitshift() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1131:28: ( (kw= '<<' | kw= '>>' | kw= '>>>' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1132:1: (kw= '<<' | kw= '>>' | kw= '>>>' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1132:1: (kw= '<<' | kw= '>>' | kw= '>>>' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 41:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1133:2: kw= '<<'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpBitshift2683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitshiftAccess().getLessThanSignLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1140:2: kw= '>>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpBitshift2702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitshiftAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1147:2: kw= '>>>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpBitshift2721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitshiftAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpBitshift"


    // $ANTLR start "entryRuleAddExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1160:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1161:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1162:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression2761);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression2771); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1169:1: ruleAddExpression returns [EObject current=null] : (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubtractExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1172:28: ( (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1173:1: (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1173:1: (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1174:5: this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubtractExpression_in_ruleAddExpression2818);
            this_SubtractExpression_0=ruleSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred9_InternalHaxe()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1187:6: ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1187:7: () ( (lv_feature_2_0= ruleOpAdd ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1187:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1193:2: ( (lv_feature_2_0= ruleOpAdd ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1194:1: (lv_feature_2_0= ruleOpAdd )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1194:1: (lv_feature_2_0= ruleOpAdd )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1195:3: lv_feature_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getFeatureOpAddParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleAddExpression2867);
            	    lv_feature_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1211:4: ( (lv_right_3_0= ruleSubtractExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1212:1: (lv_right_3_0= ruleSubtractExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1212:1: (lv_right_3_0= ruleSubtractExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1213:3: lv_right_3_0= ruleSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSubtractExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubtractExpression_in_ruleAddExpression2890);
            	    lv_right_3_0=ruleSubtractExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SubtractExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1237:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1238:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1239:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2929);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2940); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1246:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1249:28: (kw= '+' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1251:2: kw= '+'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd2977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleSubtractExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1264:1: entryRuleSubtractExpression returns [EObject current=null] : iv_ruleSubtractExpression= ruleSubtractExpression EOF ;
    public final EObject entryRuleSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1265:2: (iv_ruleSubtractExpression= ruleSubtractExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1266:2: iv_ruleSubtractExpression= ruleSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtractExpression_in_entryRuleSubtractExpression3016);
            iv_ruleSubtractExpression=ruleSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtractExpression3026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubtractExpression"


    // $ANTLR start "ruleSubtractExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1273:1: ruleSubtractExpression returns [EObject current=null] : (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* ) ;
    public final EObject ruleSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplyExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1276:28: ( (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1277:1: (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1277:1: (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1278:5: this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubtractExpressionAccess().getMultiplyExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression3073);
            this_MultiplyExpression_0=ruleMultiplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplyExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:1: ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalHaxe()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:3: ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1291:6: ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1291:7: () ( (lv_feature_2_0= ruleOpSubtract ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1291:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1292:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1297:2: ( (lv_feature_2_0= ruleOpSubtract ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1298:1: (lv_feature_2_0= ruleOpSubtract )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1298:1: (lv_feature_2_0= ruleOpSubtract )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1299:3: lv_feature_2_0= ruleOpSubtract
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getFeatureOpSubtractParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpSubtract_in_ruleSubtractExpression3122);
            	    lv_feature_2_0=ruleOpSubtract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpSubtract");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1315:4: ( (lv_right_3_0= ruleMultiplyExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1316:1: (lv_right_3_0= ruleMultiplyExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1316:1: (lv_right_3_0= ruleMultiplyExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1317:3: lv_right_3_0= ruleMultiplyExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getRightMultiplyExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression3145);
            	    lv_right_3_0=ruleMultiplyExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MultiplyExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleSubtractExpression"


    // $ANTLR start "entryRuleOpSubtract"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1341:1: entryRuleOpSubtract returns [String current=null] : iv_ruleOpSubtract= ruleOpSubtract EOF ;
    public final String entryRuleOpSubtract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSubtract = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1342:2: (iv_ruleOpSubtract= ruleOpSubtract EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1343:2: iv_ruleOpSubtract= ruleOpSubtract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSubtractRule()); 
            }
            pushFollow(FOLLOW_ruleOpSubtract_in_entryRuleOpSubtract3184);
            iv_ruleOpSubtract=ruleOpSubtract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSubtract.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSubtract3195); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSubtract"


    // $ANTLR start "ruleOpSubtract"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1350:1: ruleOpSubtract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleOpSubtract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1353:28: (kw= '-' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1355:2: kw= '-'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleOpSubtract3232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSubtractAccess().getHyphenMinusKeyword()); 
                  
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
    // $ANTLR end "ruleOpSubtract"


    // $ANTLR start "entryRuleMultiplyExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1368:1: entryRuleMultiplyExpression returns [EObject current=null] : iv_ruleMultiplyExpression= ruleMultiplyExpression EOF ;
    public final EObject entryRuleMultiplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1369:2: (iv_ruleMultiplyExpression= ruleMultiplyExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1370:2: iv_ruleMultiplyExpression= ruleMultiplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplyExpression_in_entryRuleMultiplyExpression3271);
            iv_ruleMultiplyExpression=ruleMultiplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplyExpression3281); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplyExpression"


    // $ANTLR start "ruleMultiplyExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1377:1: ruleMultiplyExpression returns [EObject current=null] : (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* ) ;
    public final EObject ruleMultiplyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivideExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1380:28: ( (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1381:1: (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1381:1: (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1382:5: this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression3328);
            this_DivideExpression_0=ruleDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:1: ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalHaxe()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:3: ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1395:6: ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1395:7: () ( (lv_feature_2_0= ruleOpMultiply ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1395:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1396:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1401:2: ( (lv_feature_2_0= ruleOpMultiply ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1402:1: (lv_feature_2_0= ruleOpMultiply )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1402:1: (lv_feature_2_0= ruleOpMultiply )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1403:3: lv_feature_2_0= ruleOpMultiply
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getFeatureOpMultiplyParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMultiply_in_ruleMultiplyExpression3377);
            	    lv_feature_2_0=ruleOpMultiply();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplyExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpMultiply");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1419:4: ( (lv_right_3_0= ruleDivideExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1420:1: (lv_right_3_0= ruleDivideExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1420:1: (lv_right_3_0= ruleDivideExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1421:3: lv_right_3_0= ruleDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getRightDivideExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression3400);
            	    lv_right_3_0=ruleDivideExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplyExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"DivideExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleMultiplyExpression"


    // $ANTLR start "entryRuleOpMultiply"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1445:1: entryRuleOpMultiply returns [String current=null] : iv_ruleOpMultiply= ruleOpMultiply EOF ;
    public final String entryRuleOpMultiply() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiply = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1446:2: (iv_ruleOpMultiply= ruleOpMultiply EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1447:2: iv_ruleOpMultiply= ruleOpMultiply EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiplyRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiply_in_entryRuleOpMultiply3439);
            iv_ruleOpMultiply=ruleOpMultiply();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiply.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiply3450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiply"


    // $ANTLR start "ruleOpMultiply"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1454:1: ruleOpMultiply returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleOpMultiply() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1457:28: (kw= '*' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1459:2: kw= '*'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMultiply3487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiplyAccess().getAsteriskKeyword()); 
                  
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
    // $ANTLR end "ruleOpMultiply"


    // $ANTLR start "entryRuleDivideExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1472:1: entryRuleDivideExpression returns [EObject current=null] : iv_ruleDivideExpression= ruleDivideExpression EOF ;
    public final EObject entryRuleDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivideExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1473:2: (iv_ruleDivideExpression= ruleDivideExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1474:2: iv_ruleDivideExpression= ruleDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivideExpression_in_entryRuleDivideExpression3526);
            iv_ruleDivideExpression=ruleDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivideExpression3536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivideExpression"


    // $ANTLR start "ruleDivideExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1481:1: ruleDivideExpression returns [EObject current=null] : (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* ) ;
    public final EObject ruleDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModuloExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1484:28: ( (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1485:1: (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1485:1: (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1486:5: this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivideExpressionAccess().getModuloExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModuloExpression_in_ruleDivideExpression3583);
            this_ModuloExpression_0=ruleModuloExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModuloExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:1: ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred12_InternalHaxe()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:3: ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1499:6: ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1499:7: () ( (lv_feature_2_0= ruleOpDivide ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1499:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1500:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1505:2: ( (lv_feature_2_0= ruleOpDivide ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1506:1: (lv_feature_2_0= ruleOpDivide )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1506:1: (lv_feature_2_0= ruleOpDivide )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1507:3: lv_feature_2_0= ruleOpDivide
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getFeatureOpDivideParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpDivide_in_ruleDivideExpression3632);
            	    lv_feature_2_0=ruleOpDivide();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpDivide");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1523:4: ( (lv_right_3_0= ruleModuloExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1524:1: (lv_right_3_0= ruleModuloExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1524:1: (lv_right_3_0= ruleModuloExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1525:3: lv_right_3_0= ruleModuloExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getRightModuloExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModuloExpression_in_ruleDivideExpression3655);
            	    lv_right_3_0=ruleModuloExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ModuloExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleDivideExpression"


    // $ANTLR start "entryRuleOpDivide"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1549:1: entryRuleOpDivide returns [String current=null] : iv_ruleOpDivide= ruleOpDivide EOF ;
    public final String entryRuleOpDivide() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpDivide = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1550:2: (iv_ruleOpDivide= ruleOpDivide EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1551:2: iv_ruleOpDivide= ruleOpDivide EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpDivideRule()); 
            }
            pushFollow(FOLLOW_ruleOpDivide_in_entryRuleOpDivide3694);
            iv_ruleOpDivide=ruleOpDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpDivide.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDivide3705); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpDivide"


    // $ANTLR start "ruleOpDivide"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1558:1: ruleOpDivide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken ruleOpDivide() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1561:28: (kw= '/' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1563:2: kw= '/'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleOpDivide3742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpDivideAccess().getSolidusKeyword()); 
                  
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
    // $ANTLR end "ruleOpDivide"


    // $ANTLR start "entryRuleModuloExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1576:1: entryRuleModuloExpression returns [EObject current=null] : iv_ruleModuloExpression= ruleModuloExpression EOF ;
    public final EObject entryRuleModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuloExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1577:2: (iv_ruleModuloExpression= ruleModuloExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1578:2: iv_ruleModuloExpression= ruleModuloExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModuloExpression_in_entryRuleModuloExpression3781);
            iv_ruleModuloExpression=ruleModuloExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuloExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuloExpression3791); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuloExpression"


    // $ANTLR start "ruleModuloExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1585:1: ruleModuloExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject ruleModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1588:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1589:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1589:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1590:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModuloExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleModuloExpression3838);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:1: ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred13_InternalHaxe()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:3: ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1603:6: ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1603:7: () ( (lv_feature_2_0= ruleOpModulo ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1603:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1604:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1609:2: ( (lv_feature_2_0= ruleOpModulo ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1610:1: (lv_feature_2_0= ruleOpModulo )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1610:1: (lv_feature_2_0= ruleOpModulo )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1611:3: lv_feature_2_0= ruleOpModulo
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getFeatureOpModuloParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpModulo_in_ruleModuloExpression3887);
            	    lv_feature_2_0=ruleOpModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuloExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpModulo");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1627:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1628:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1628:1: (lv_right_3_0= ruleUnaryOperation )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1629:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleModuloExpression3910);
            	    lv_right_3_0=ruleUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuloExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"UnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleModuloExpression"


    // $ANTLR start "entryRuleOpModulo"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1653:1: entryRuleOpModulo returns [String current=null] : iv_ruleOpModulo= ruleOpModulo EOF ;
    public final String entryRuleOpModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpModulo = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1654:2: (iv_ruleOpModulo= ruleOpModulo EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1655:2: iv_ruleOpModulo= ruleOpModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpModuloRule()); 
            }
            pushFollow(FOLLOW_ruleOpModulo_in_entryRuleOpModulo3949);
            iv_ruleOpModulo=ruleOpModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpModulo.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpModulo3960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpModulo"


    // $ANTLR start "ruleOpModulo"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1662:1: ruleOpModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '%' ;
    public final AntlrDatatypeRuleToken ruleOpModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1665:28: (kw= '%' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1667:2: kw= '%'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleOpModulo3997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpModuloAccess().getPercentSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpModulo"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1680:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1681:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1682:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4036);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation4046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PreIncrementOperation_3 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1692:28: ( ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43||(LA21_0>=47 && LA21_0<=48)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_ID)||(LA21_0>=49 && LA21_0<=50)||LA21_0==52||LA21_0==54||(LA21_0>=59 && LA21_0<=64)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:3: () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1693:3: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1699:2: ( (lv_feature_1_0= ruleOpUnary ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1700:1: (lv_feature_1_0= ruleOpUnary )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1700:1: (lv_feature_1_0= ruleOpUnary )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1701:3: lv_feature_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleUnaryOperation4102);
                    lv_feature_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"OpUnary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1717:2: ( (lv_operand_2_0= rulePreIncrementOperation ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1718:1: (lv_operand_2_0= rulePreIncrementOperation )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1718:1: (lv_operand_2_0= rulePreIncrementOperation )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1719:3: lv_operand_2_0= rulePreIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandPreIncrementOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation4123);
                    lv_operand_2_0=rulePreIncrementOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"PreIncrementOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1737:5: this_PreIncrementOperation_3= rulePreIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getPreIncrementOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation4152);
                    this_PreIncrementOperation_3=rulePreIncrementOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PreIncrementOperation_3; 
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1753:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1754:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1755:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4188);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1762:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1765:28: ( (kw= '!' | kw= '-' | kw= '~' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1766:1: (kw= '!' | kw= '-' | kw= '~' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1766:1: (kw= '!' | kw= '-' | kw= '~' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 48:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1767:2: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpUnary4237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1774:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1781:2: kw= '~'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary4275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getTildeKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRulePreIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1794:1: entryRulePreIncrementOperation returns [EObject current=null] : iv_rulePreIncrementOperation= rulePreIncrementOperation EOF ;
    public final EObject entryRulePreIncrementOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreIncrementOperation = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1795:2: (iv_rulePreIncrementOperation= rulePreIncrementOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1796:2: iv_rulePreIncrementOperation= rulePreIncrementOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreIncrementOperationRule()); 
            }
            pushFollow(FOLLOW_rulePreIncrementOperation_in_entryRulePreIncrementOperation4315);
            iv_rulePreIncrementOperation=rulePreIncrementOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreIncrementOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreIncrementOperation4325); if (state.failed) return current;

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
    // $ANTLR end "entryRulePreIncrementOperation"


    // $ANTLR start "rulePreIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1803:1: rulePreIncrementOperation returns [EObject current=null] : ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation ) ;
    public final EObject rulePreIncrementOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PostIncrementOperation_3 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1806:28: ( ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:1: ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:1: ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) && (synpred14_InternalHaxe())) {
                alt23=1;
            }
            else if ( (LA23_0==50) && (synpred14_InternalHaxe())) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_ID)||LA23_0==52||LA23_0==54||(LA23_0>=59 && LA23_0<=64)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:2: ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:2: ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:3: ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1816:6: ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1816:7: () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1816:7: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1817:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPreIncrementOperationAccess().getPreIncrementOperationAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1822:2: ( (lv_feature_1_0= ruleOpIncrement ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1823:1: (lv_feature_1_0= ruleOpIncrement )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1823:1: (lv_feature_1_0= ruleOpIncrement )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1824:3: lv_feature_1_0= ruleOpIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpIncrement_in_rulePreIncrementOperation4408);
                    lv_feature_1_0=ruleOpIncrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreIncrementOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"OpIncrement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1840:2: ( (lv_operand_2_0= rulePostIncrementOperation ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1841:1: (lv_operand_2_0= rulePostIncrementOperation )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1841:1: (lv_operand_2_0= rulePostIncrementOperation )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1842:3: lv_operand_2_0= rulePostIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getOperandPostIncrementOperationParserRuleCall_0_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation4429);
                    lv_operand_2_0=rulePostIncrementOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreIncrementOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"PostIncrementOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1860:5: this_PostIncrementOperation_3= rulePostIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getPostIncrementOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation4459);
                    this_PostIncrementOperation_3=rulePostIncrementOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostIncrementOperation_3; 
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
    // $ANTLR end "rulePreIncrementOperation"


    // $ANTLR start "entryRulePostIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1876:1: entryRulePostIncrementOperation returns [EObject current=null] : iv_rulePostIncrementOperation= rulePostIncrementOperation EOF ;
    public final EObject entryRulePostIncrementOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncrementOperation = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1877:2: (iv_rulePostIncrementOperation= rulePostIncrementOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1878:2: iv_rulePostIncrementOperation= rulePostIncrementOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostIncrementOperationRule()); 
            }
            pushFollow(FOLLOW_rulePostIncrementOperation_in_entryRulePostIncrementOperation4494);
            iv_rulePostIncrementOperation=rulePostIncrementOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostIncrementOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostIncrementOperation4504); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostIncrementOperation"


    // $ANTLR start "rulePostIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1885:1: rulePostIncrementOperation returns [EObject current=null] : ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall ) ;
    public final EObject rulePostIncrementOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_1_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject this_MemberFeatureCall_3 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1888:28: ( ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:3: ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1898:6: ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1898:7: () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1898:7: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1899:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostIncrementOperationAccess().getPostIncrementOperationAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1904:2: ( (lv_operand_1_0= ruleMemberFeatureCall ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1905:1: (lv_operand_1_0= ruleMemberFeatureCall )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1905:1: (lv_operand_1_0= ruleMemberFeatureCall )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1906:3: lv_operand_1_0= ruleMemberFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getOperandMemberFeatureCallParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation4587);
                    lv_operand_1_0=ruleMemberFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostIncrementOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_1_0, 
                              		"MemberFeatureCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1922:2: ( (lv_feature_2_0= ruleOpIncrement ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1923:1: (lv_feature_2_0= ruleOpIncrement )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1923:1: (lv_feature_2_0= ruleOpIncrement )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1924:3: lv_feature_2_0= ruleOpIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpIncrement_in_rulePostIncrementOperation4608);
                    lv_feature_2_0=ruleOpIncrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostIncrementOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_2_0, 
                              		"OpIncrement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1942:5: this_MemberFeatureCall_3= ruleMemberFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getMemberFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation4638);
                    this_MemberFeatureCall_3=ruleMemberFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MemberFeatureCall_3; 
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
    // $ANTLR end "rulePostIncrementOperation"


    // $ANTLR start "entryRuleOpIncrement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1958:1: entryRuleOpIncrement returns [String current=null] : iv_ruleOpIncrement= ruleOpIncrement EOF ;
    public final String entryRuleOpIncrement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpIncrement = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1959:2: (iv_ruleOpIncrement= ruleOpIncrement EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1960:2: iv_ruleOpIncrement= ruleOpIncrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpIncrementRule()); 
            }
            pushFollow(FOLLOW_ruleOpIncrement_in_entryRuleOpIncrement4674);
            iv_ruleOpIncrement=ruleOpIncrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpIncrement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpIncrement4685); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpIncrement"


    // $ANTLR start "ruleOpIncrement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1967:1: ruleOpIncrement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleOpIncrement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1970:28: ( (kw= '++' | kw= '--' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1971:1: (kw= '++' | kw= '--' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1971:1: (kw= '++' | kw= '--' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            else if ( (LA25_0==50) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1972:2: kw= '++'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpIncrement4723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpIncrementAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1979:2: kw= '--'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpIncrement4742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpIncrementAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpIncrement"


    // $ANTLR start "entryRuleMemberFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1992:1: entryRuleMemberFeatureCall returns [EObject current=null] : iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF ;
    public final EObject entryRuleMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberFeatureCall = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1993:2: (iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1994:2: iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall4782);
            iv_ruleMemberFeatureCall=ruleMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberFeatureCall4792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMemberFeatureCall"


    // $ANTLR start "ruleMemberFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2001:1: ruleMemberFeatureCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )* ) ;
    public final EObject ruleMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_feature_8_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2004:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2005:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2005:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2006:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall4839);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==51) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred16_InternalHaxe()) ) {
                        alt29=1;
                    }
                    else if ( (synpred17_InternalHaxe()) ) {
                        alt29=2;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2020:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2020:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2020:26: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2021:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleMemberFeatureCall4888); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2030:1: ( ( ruleValidID ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2031:1: ( ruleValidID )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2031:1: ( ruleValidID )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2032:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureFeatureCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleMemberFeatureCall4911);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall4927);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2053:3: ( (lv_value_5_0= ruleAssignment ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2054:1: (lv_value_5_0= ruleAssignment )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2054:1: (lv_value_5_0= ruleAssignment )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2055:3: lv_value_5_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleMemberFeatureCall4949);
            	    lv_value_5_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"Assignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:6: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:6: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )? )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:7: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (lv_feature_8_0= ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )?
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:7: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:8: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2074:5: ( () otherlv_7= '.' )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2074:6: () otherlv_7= '.'
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2074:6: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2075:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleMemberFeatureCall4992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2084:3: ( (lv_feature_8_0= ruleValidID ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2085:1: (lv_feature_8_0= ruleValidID )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2085:1: (lv_feature_8_0= ruleValidID )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2086:3: lv_feature_8_0= ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureValidIDParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleMemberFeatureCall5015);
            	    lv_feature_8_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_8_0, 
            	              		"ValidID");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2102:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2102:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2102:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2102:4: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2109:1: (lv_explicitOperationCall_9_0= '(' )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2110:3: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,52,FOLLOW_52_in_ruleMemberFeatureCall5049); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2123:2: ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )?
            	            int alt27=2;
            	            int LA27_0 = input.LA(1);

            	            if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_ID)||LA27_0==43||(LA27_0>=47 && LA27_0<=50)||LA27_0==52||LA27_0==54||(LA27_0>=59 && LA27_0<=64)) ) {
            	                alt27=1;
            	            }
            	            switch (alt27) {
            	                case 1 :
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2123:3: ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )*
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2123:3: ( (lv_arguments_10_0= ruleExpression ) )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2124:1: (lv_arguments_10_0= ruleExpression )
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2124:1: (lv_arguments_10_0= ruleExpression )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2125:3: lv_arguments_10_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_1_2_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall5084);
            	                    lv_arguments_10_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"arguments",
            	                              		lv_arguments_10_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2141:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==15) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2141:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleMemberFeatureCall5097); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_11, grammarAccess.getMemberFeatureCallAccess().getCommaKeyword_1_1_2_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2145:1: ( (lv_arguments_12_0= ruleExpression ) )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2146:1: (lv_arguments_12_0= ruleExpression )
            	                    	    {
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2146:1: (lv_arguments_12_0= ruleExpression )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2147:3: lv_arguments_12_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_1_2_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall5118);
            	                    	    lv_arguments_12_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"arguments",
            	                    	              		lv_arguments_12_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleMemberFeatureCall5134); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_13, grammarAccess.getMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_2_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleMemberFeatureCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2175:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2176:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2177:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5175);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5185); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2184:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_BlockExpression_1= ruleBlockExpression | this_ParenthesizedExpression_2= ruleParenthesizedExpression | this_FeatureCall_3= ruleFeatureCall | this_ConstructorCall_4= ruleConstructorCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_BlockExpression_1 = null;

        EObject this_ParenthesizedExpression_2 = null;

        EObject this_FeatureCall_3 = null;

        EObject this_ConstructorCall_4 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2187:28: ( (this_Literal_0= ruleLiteral | this_BlockExpression_1= ruleBlockExpression | this_ParenthesizedExpression_2= ruleParenthesizedExpression | this_FeatureCall_3= ruleFeatureCall | this_ConstructorCall_4= ruleConstructorCall ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2188:1: (this_Literal_0= ruleLiteral | this_BlockExpression_1= ruleBlockExpression | this_ParenthesizedExpression_2= ruleParenthesizedExpression | this_FeatureCall_3= ruleFeatureCall | this_ConstructorCall_4= ruleConstructorCall )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2188:1: (this_Literal_0= ruleLiteral | this_BlockExpression_1= ruleBlockExpression | this_ParenthesizedExpression_2= ruleParenthesizedExpression | this_FeatureCall_3= ruleFeatureCall | this_ConstructorCall_4= ruleConstructorCall )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEX:
            case RULE_FLOAT:
            case RULE_STRING:
            case RULE_REGULAR_EXPRESSION:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt30=1;
                }
                break;
            case 54:
                {
                alt30=2;
                }
                break;
            case 52:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case 60:
                {
                alt30=4;
                }
                break;
            case 59:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2189:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression5232);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2199:5: this_BlockExpression_1= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockExpression_in_rulePrimaryExpression5259);
                    this_BlockExpression_1=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2209:5: this_ParenthesizedExpression_2= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression5286);
                    this_ParenthesizedExpression_2=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2219:5: this_FeatureCall_3= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression5313);
                    this_FeatureCall_3=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2229:5: this_ConstructorCall_4= ruleConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstructorCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructorCall_in_rulePrimaryExpression5340);
                    this_ConstructorCall_4=ruleConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstructorCall_4; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2245:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2246:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2247:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5375);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5385); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2254:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_IntLiteral_1= ruleIntLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_FloatLiteral_4 = null;

        EObject this_RegularExpressionLiteral_5 = null;

        EObject this_ArrayLiteral_6 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2257:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_IntLiteral_1= ruleIntLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2258:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_IntLiteral_1= ruleIntLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2258:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_IntLiteral_1= ruleIntLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_FloatLiteral_4= ruleFloatLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
                {
                alt31=2;
                }
                break;
            case 63:
                {
                alt31=3;
                }
                break;
            case RULE_STRING:
                {
                alt31=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt31=5;
                }
                break;
            case RULE_REGULAR_EXPRESSION:
                {
                alt31=6;
                }
                break;
            case 64:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2259:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5432);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2269:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral5459);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2279:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral5486);
                    this_NullLiteral_2=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2289:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5513);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2299:5: this_FloatLiteral_4= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral5540);
                    this_FloatLiteral_4=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2309:5: this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRegularExpressionLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularExpressionLiteral_in_ruleLiteral5567);
                    this_RegularExpressionLiteral_5=ruleRegularExpressionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegularExpressionLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2319:5: this_ArrayLiteral_6= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral5594);
                    this_ArrayLiteral_6=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_6; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBlockExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2335:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2336:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2337:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression5629);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression5639); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2344:1: ruleBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2347:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2348:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2348:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2348:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2348:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2349:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleBlockExpression5685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2358:1: ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_ID)||LA33_0==43||(LA33_0>=47 && LA33_0<=50)||LA33_0==52||LA33_0==54||LA33_0==57||(LA33_0>=59 && LA33_0<=64)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2358:2: ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2358:2: ( (lv_expressions_2_0= ruleExpressionInsideBlock ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2359:1: (lv_expressions_2_0= ruleExpressionInsideBlock )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2359:1: (lv_expressions_2_0= ruleExpressionInsideBlock )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2360:3: lv_expressions_2_0= ruleExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionInsideBlock_in_ruleBlockExpression5707);
            	    lv_expressions_2_0=ruleExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"ExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2376:2: (otherlv_3= ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==55) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2376:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleBlockExpression5720); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleBlockExpression5736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleExpressionInsideBlock"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2392:1: entryRuleExpressionInsideBlock returns [EObject current=null] : iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF ;
    public final EObject entryRuleExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionInsideBlock = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2393:2: (iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2394:2: iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionInsideBlock_in_entryRuleExpressionInsideBlock5772);
            iv_ruleExpressionInsideBlock=ruleExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionInsideBlock5782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionInsideBlock"


    // $ANTLR start "ruleExpressionInsideBlock"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2401:1: ruleExpressionInsideBlock returns [EObject current=null] : (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression ) ;
    public final EObject ruleExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclarations_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2404:28: ( (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2405:1: (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2405:1: (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_ID)||LA34_0==43||(LA34_0>=47 && LA34_0<=50)||LA34_0==52||LA34_0==54||(LA34_0>=59 && LA34_0<=64)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2406:5: this_VariableDeclarations_0= ruleVariableDeclarations
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionInsideBlockAccess().getVariableDeclarationsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarations_in_ruleExpressionInsideBlock5829);
                    this_VariableDeclarations_0=ruleVariableDeclarations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarations_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2416:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionInsideBlockAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionInsideBlock5856);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
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
    // $ANTLR end "ruleExpressionInsideBlock"


    // $ANTLR start "entryRuleVariableDeclarations"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2432:1: entryRuleVariableDeclarations returns [EObject current=null] : iv_ruleVariableDeclarations= ruleVariableDeclarations EOF ;
    public final EObject entryRuleVariableDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarations = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2433:2: (iv_ruleVariableDeclarations= ruleVariableDeclarations EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2434:2: iv_ruleVariableDeclarations= ruleVariableDeclarations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationsRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarations_in_entryRuleVariableDeclarations5891);
            iv_ruleVariableDeclarations=ruleVariableDeclarations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarations5901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclarations"


    // $ANTLR start "ruleVariableDeclarations"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2441:1: ruleVariableDeclarations returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleVariableDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2444:28: ( ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2445:1: ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2445:1: ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2445:2: () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )*
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2445:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2446:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationsAccess().getVariableDeclarationsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleVariableDeclarations5947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationsAccess().getVarKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2455:1: ( (lv_declarations_2_0= ruleVariableDeclaration ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2456:1: (lv_declarations_2_0= ruleVariableDeclaration )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2456:1: (lv_declarations_2_0= ruleVariableDeclaration )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2457:3: lv_declarations_2_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationsAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations5968);
            lv_declarations_2_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationsRule());
              	        }
                     		add(
                     			current, 
                     			"declarations",
                      		lv_declarations_2_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2473:2: (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2473:4: otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclarations5981); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationsAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2477:1: ( (lv_declarations_4_0= ruleVariableDeclaration ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2478:1: (lv_declarations_4_0= ruleVariableDeclaration )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2478:1: (lv_declarations_4_0= ruleVariableDeclaration )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2479:3: lv_declarations_4_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationsAccess().getDeclarationsVariableDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations6002);
            	    lv_declarations_4_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_4_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleVariableDeclarations"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2503:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2504:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2505:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration6040);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration6050); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2512:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2515:28: ( ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2516:1: ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2516:1: ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2516:2: () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2516:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2517:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2522:2: ( (lv_name_1_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2523:1: (lv_name_1_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2523:1: (lv_name_1_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2524:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleVariableDeclaration6105);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2540:2: (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2540:4: otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleVariableDeclaration6118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getColonKeyword_2_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2544:1: ( (lv_type_3_0= ruleTypeReference ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2545:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2545:1: (lv_type_3_0= ruleTypeReference )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2546:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleVariableDeclaration6139);
                    lv_type_3_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2562:4: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2562:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration6154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2566:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2567:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2567:1: (lv_expression_5_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2568:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration6175);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Expression");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2592:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2593:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2594:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression6213);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression6223); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2601:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2604:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2605:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2605:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2605:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleParenthesizedExpression6260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression6282);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleParenthesizedExpression6293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2630:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2632:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall6329);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall6339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2639:1: ruleFeatureCall returns [EObject current=null] : ( () ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token lv_explicitOperationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2642:28: ( ( () ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2643:1: ( () ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2643:1: ( () ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2643:2: () ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2643:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeatureCallAccess().getFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2649:2: ( ( ruleIdOrSuper ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2650:1: ( ruleIdOrSuper )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2650:1: ( ruleIdOrSuper )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2651:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getFeatureFeatureCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleFeatureCall6396);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2664:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2664:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2664:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2664:4: ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2671:1: (lv_explicitOperationCall_2_0= '(' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2672:3: lv_explicitOperationCall_2_0= '('
                    {
                    lv_explicitOperationCall_2_0=(Token)match(input,52,FOLLOW_52_in_ruleFeatureCall6430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_2_0, grammarAccess.getFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2685:2: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_ID)||LA39_0==43||(LA39_0>=47 && LA39_0<=50)||LA39_0==52||LA39_0==54||(LA39_0>=59 && LA39_0<=64)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2685:3: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2685:3: ( (lv_arguments_3_0= ruleExpression ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2686:1: (lv_arguments_3_0= ruleExpression )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2686:1: (lv_arguments_3_0= ruleExpression )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2687:3: lv_arguments_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall6465);
                            lv_arguments_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2703:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==15) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2703:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFeatureCall6478); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFeatureCallAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2707:1: ( (lv_arguments_5_0= ruleExpression ) )
                            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2708:1: (lv_arguments_5_0= ruleExpression )
                            	    {
                            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2708:1: (lv_arguments_5_0= ruleExpression )
                            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2709:3: lv_arguments_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall6499);
                            	    lv_arguments_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleFeatureCall6515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleConstructorCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2739:1: entryRuleConstructorCall returns [EObject current=null] : iv_ruleConstructorCall= ruleConstructorCall EOF ;
    public final EObject entryRuleConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorCall = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2740:2: (iv_ruleConstructorCall= ruleConstructorCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2741:2: iv_ruleConstructorCall= ruleConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleConstructorCall_in_entryRuleConstructorCall6555);
            iv_ruleConstructorCall=ruleConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorCall6565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructorCall"


    // $ANTLR start "ruleConstructorCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2748:1: ruleConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( (lv_constructor_2_0= ruleQualifiedName ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_constructor_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2751:28: ( ( () otherlv_1= 'new' ( (lv_constructor_2_0= ruleQualifiedName ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2752:1: ( () otherlv_1= 'new' ( (lv_constructor_2_0= ruleQualifiedName ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2752:1: ( () otherlv_1= 'new' ( (lv_constructor_2_0= ruleQualifiedName ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2752:2: () otherlv_1= 'new' ( (lv_constructor_2_0= ruleQualifiedName ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2752:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2753:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstructorCallAccess().getConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleConstructorCall6611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2762:1: ( (lv_constructor_2_0= ruleQualifiedName ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2763:1: (lv_constructor_2_0= ruleQualifiedName )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2763:1: (lv_constructor_2_0= ruleQualifiedName )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2764:3: lv_constructor_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorCallAccess().getConstructorQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConstructorCall6632);
            lv_constructor_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructorCallRule());
              	        }
                     		set(
                     			current, 
                     			"constructor",
                      		lv_constructor_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleConstructorCall6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstructorCallAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2784:1: ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_INT && LA42_0<=RULE_ID)||LA42_0==43||(LA42_0>=47 && LA42_0<=50)||LA42_0==52||LA42_0==54||(LA42_0>=59 && LA42_0<=64)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2784:2: ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )*
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2784:2: ( (lv_arguments_4_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2785:1: (lv_arguments_4_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2785:1: (lv_arguments_4_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2786:3: lv_arguments_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorCallAccess().getArgumentsExpressionParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConstructorCall6666);
                    lv_arguments_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2802:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2802:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConstructorCall6679); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getConstructorCallAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2806:1: ( (lv_arguments_6_0= ruleExpression ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2807:1: (lv_arguments_6_0= ruleExpression )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2807:1: (lv_arguments_6_0= ruleExpression )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2808:3: lv_arguments_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConstructorCallAccess().getArgumentsExpressionParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleConstructorCall6700);
                    	    lv_arguments_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_6_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleConstructorCall6716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConstructorCallAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleConstructorCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2836:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2837:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2838:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper6753);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper6764); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2845:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2848:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2849:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2849:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==60) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2850:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper6811);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2862:2: kw= 'super'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleIdOrSuper6835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2875:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2876:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2877:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6875);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6885); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2884:1: ruleBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2887:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2888:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2888:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2888:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2888:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2889:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2894:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            else if ( (LA44_0==62) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2894:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleBooleanLiteral6932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2899:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2899:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2900:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2900:1: (lv_isTrue_2_0= 'true' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2901:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,62,FOLLOW_62_in_ruleBooleanLiteral6956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2922:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2923:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2924:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7006);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral7016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2931:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2934:28: ( ( () otherlv_1= 'null' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2935:1: ( () otherlv_1= 'null' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2935:1: ( () otherlv_1= 'null' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2935:2: () otherlv_1= 'null'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2935:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleNullLiteral7062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2953:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2954:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2955:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral7098);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral7108); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2962:1: ruleIntLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token this_HEX_2=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2965:28: ( ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2966:1: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2966:1: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2966:2: () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2966:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2972:2: ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_HEX) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2972:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2972:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2973:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2973:1: (lv_value_1_0= RULE_INT )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2974:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral7160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2991:6: this_HEX_2= RULE_HEX
                    {
                    this_HEX_2=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleIntLiteral7182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_2, grammarAccess.getIntLiteralAccess().getHEXTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3003:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3004:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3005:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral7218);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral7228); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3012:1: ruleFloatLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3015:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3016:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3016:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3016:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3016:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3017:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatLiteralAccess().getFloatLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3022:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3023:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3023:1: (lv_value_1_0= RULE_FLOAT )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3024:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral7279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"FLOAT");
              	    
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3048:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3049:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3050:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7320);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7330); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3057:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3060:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3067:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3068:1: (lv_value_1_0= RULE_STRING )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3068:1: (lv_value_1_0= RULE_STRING )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3069:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleRegularExpressionLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3093:1: entryRuleRegularExpressionLiteral returns [EObject current=null] : iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF ;
    public final EObject entryRuleRegularExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularExpressionLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3094:2: (iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3095:2: iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRegularExpressionLiteral_in_entryRuleRegularExpressionLiteral7422);
            iv_ruleRegularExpressionLiteral=ruleRegularExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularExpressionLiteral7432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegularExpressionLiteral"


    // $ANTLR start "ruleRegularExpressionLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3102:1: ruleRegularExpressionLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) ) ;
    public final EObject ruleRegularExpressionLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3105:28: ( ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3106:1: ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3106:1: ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3106:2: () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3106:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3107:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegularExpressionLiteralAccess().getRegularExpressionLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3112:2: ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3113:1: (lv_value_1_0= RULE_REGULAR_EXPRESSION )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3113:1: (lv_value_1_0= RULE_REGULAR_EXPRESSION )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3114:3: lv_value_1_0= RULE_REGULAR_EXPRESSION
            {
            lv_value_1_0=(Token)match(input,RULE_REGULAR_EXPRESSION,FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleRegularExpressionLiteral7483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getRegularExpressionLiteralAccess().getValueREGULAR_EXPRESSIONTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegularExpressionLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"REGULAR_EXPRESSION");
              	    
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
    // $ANTLR end "ruleRegularExpressionLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3138:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3139:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3140:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral7524);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral7534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3147:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3150:28: ( ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3151:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3151:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3151:2: () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3151:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3152:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleArrayLiteral7580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3161:1: ( (lv_elements_2_0= ruleExpression ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_ID)||LA46_0==43||(LA46_0>=47 && LA46_0<=50)||LA46_0==52||LA46_0==54||(LA46_0>=59 && LA46_0<=64)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3162:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3162:1: (lv_elements_2_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3163:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getElementsExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral7601);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3179:3: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==15) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3179:5: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArrayLiteral7615); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3183:1: ( (lv_elements_4_0= ruleExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3184:1: (lv_elements_4_0= ruleExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3184:1: (lv_elements_4_0= ruleExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3185:3: lv_elements_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getElementsExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral7636);
            	    lv_elements_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleArrayLiteral7650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3213:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3214:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3215:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7687);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7698); if (state.failed) return current;

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
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3222:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3225:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3226:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3226:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3227:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName7745);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3237:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==51) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3238:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,51,FOLLOW_51_in_ruleQualifiedName7764); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName7786);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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


    // $ANTLR start "entryRuleValidID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3262:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3263:2: (iv_ruleValidID= ruleValidID EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3264:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID7834);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID7845); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3271:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3274:28: (this_ID_0= RULE_ID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3275:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID7884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalHaxe
    public final void synpred1_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:4: ( '<' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:137:6: '<'
        {
        match(input,14,FOLLOW_14_in_synpred1_InternalHaxe235); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalHaxe

    // $ANTLR start synpred2_InternalHaxe
    public final void synpred2_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:295:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:295:2: ( ( ruleOpMultiAssign ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:296:1: ( ruleOpMultiAssign )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:296:1: ( ruleOpMultiAssign )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:297:1: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred2_InternalHaxe594);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHaxe

    // $ANTLR start synpred3_InternalHaxe
    public final void synpred3_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:4: ( () ( ( ruleOpOr ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:5: () ( ( ruleOpOr ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:495:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:496:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:496:2: ( ( ruleOpOr ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:497:1: ( ruleOpOr )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:497:1: ( ruleOpOr )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:498:1: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred3_InternalHaxe1130);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHaxe

    // $ANTLR start synpred4_InternalHaxe
    public final void synpred4_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:4: ( () ( ( ruleOpAnd ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:5: () ( ( ruleOpAnd ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:599:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:600:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:600:2: ( ( ruleOpAnd ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:601:1: ( ruleOpAnd )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:601:1: ( ruleOpAnd )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:602:1: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred4_InternalHaxe1385);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHaxe

    // $ANTLR start synpred5_InternalHaxe
    public final void synpred5_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:4: ( () ( ( ruleOpOther ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:5: () ( ( ruleOpOther ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:703:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:704:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:704:2: ( ( ruleOpOther ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:705:1: ( ruleOpOther )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:705:1: ( ruleOpOther )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:706:1: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred5_InternalHaxe1640);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalHaxe

    // $ANTLR start synpred6_InternalHaxe
    public final void synpred6_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:3: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:4: ( () ( ( ruleOpCompare ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:4: ( () ( ( ruleOpCompare ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:5: () ( ( ruleOpCompare ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:807:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:808:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:808:2: ( ( ruleOpCompare ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:809:1: ( ruleOpCompare )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:809:1: ( ruleOpCompare )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:810:1: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHaxe1895);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHaxe

    // $ANTLR start synpred7_InternalHaxe
    public final void synpred7_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:3: ( ( () ( ( ruleOpBitwise ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:4: ( () ( ( ruleOpBitwise ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:4: ( () ( ( ruleOpBitwise ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:5: () ( ( ruleOpBitwise ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:946:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:947:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:947:2: ( ( ruleOpBitwise ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:948:1: ( ruleOpBitwise )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:948:1: ( ruleOpBitwise )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:949:1: ruleOpBitwise
        {
        pushFollow(FOLLOW_ruleOpBitwise_in_synpred7_InternalHaxe2247);
        ruleOpBitwise();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHaxe

    // $ANTLR start synpred8_InternalHaxe
    public final void synpred8_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:3: ( ( () ( ( ruleOpBitshift ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:4: ( () ( ( ruleOpBitshift ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:4: ( () ( ( ruleOpBitshift ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:5: () ( ( ruleOpBitshift ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1065:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1065:2: ( ( ruleOpBitshift ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1066:1: ( ruleOpBitshift )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1066:1: ( ruleOpBitshift )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1067:1: ruleOpBitshift
        {
        pushFollow(FOLLOW_ruleOpBitshift_in_synpred8_InternalHaxe2542);
        ruleOpBitshift();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalHaxe

    // $ANTLR start synpred9_InternalHaxe
    public final void synpred9_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:4: ( () ( ( ruleOpAdd ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:5: () ( ( ruleOpAdd ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1182:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1183:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1183:2: ( ( ruleOpAdd ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1184:1: ( ruleOpAdd )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1184:1: ( ruleOpAdd )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1185:1: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred9_InternalHaxe2837);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalHaxe

    // $ANTLR start synpred10_InternalHaxe
    public final void synpred10_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:3: ( ( () ( ( ruleOpSubtract ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:4: ( () ( ( ruleOpSubtract ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:4: ( () ( ( ruleOpSubtract ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:5: () ( ( ruleOpSubtract ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1287:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1287:2: ( ( ruleOpSubtract ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1288:1: ( ruleOpSubtract )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1288:1: ( ruleOpSubtract )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1289:1: ruleOpSubtract
        {
        pushFollow(FOLLOW_ruleOpSubtract_in_synpred10_InternalHaxe3092);
        ruleOpSubtract();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHaxe

    // $ANTLR start synpred11_InternalHaxe
    public final void synpred11_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:3: ( ( () ( ( ruleOpMultiply ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:4: ( () ( ( ruleOpMultiply ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:4: ( () ( ( ruleOpMultiply ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:5: () ( ( ruleOpMultiply ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1391:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1391:2: ( ( ruleOpMultiply ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1392:1: ( ruleOpMultiply )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1392:1: ( ruleOpMultiply )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1393:1: ruleOpMultiply
        {
        pushFollow(FOLLOW_ruleOpMultiply_in_synpred11_InternalHaxe3347);
        ruleOpMultiply();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHaxe

    // $ANTLR start synpred12_InternalHaxe
    public final void synpred12_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:3: ( ( () ( ( ruleOpDivide ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:4: ( () ( ( ruleOpDivide ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:4: ( () ( ( ruleOpDivide ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:5: () ( ( ruleOpDivide ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1494:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1495:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1495:2: ( ( ruleOpDivide ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1496:1: ( ruleOpDivide )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1496:1: ( ruleOpDivide )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1497:1: ruleOpDivide
        {
        pushFollow(FOLLOW_ruleOpDivide_in_synpred12_InternalHaxe3602);
        ruleOpDivide();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalHaxe

    // $ANTLR start synpred13_InternalHaxe
    public final void synpred13_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:3: ( ( () ( ( ruleOpModulo ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:4: ( () ( ( ruleOpModulo ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:4: ( () ( ( ruleOpModulo ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:5: () ( ( ruleOpModulo ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1598:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1599:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1599:2: ( ( ruleOpModulo ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1600:1: ( ruleOpModulo )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1600:1: ( ruleOpModulo )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1601:1: ruleOpModulo
        {
        pushFollow(FOLLOW_ruleOpModulo_in_synpred13_InternalHaxe3857);
        ruleOpModulo();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalHaxe

    // $ANTLR start synpred14_InternalHaxe
    public final void synpred14_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:3: ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:4: ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:4: ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:5: () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1807:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1808:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1808:2: ( ( ruleOpIncrement ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1809:1: ( ruleOpIncrement )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1809:1: ( ruleOpIncrement )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1810:1: ruleOpIncrement
        {
        pushFollow(FOLLOW_ruleOpIncrement_in_synpred14_InternalHaxe4369);
        ruleOpIncrement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1812:2: ( ( rulePostIncrementOperation ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1813:1: ( rulePostIncrementOperation )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1813:1: ( rulePostIncrementOperation )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1814:1: rulePostIncrementOperation
        {
        pushFollow(FOLLOW_rulePostIncrementOperation_in_synpred14_InternalHaxe4378);
        rulePostIncrementOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHaxe

    // $ANTLR start synpred15_InternalHaxe
    public final void synpred15_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:3: ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:4: ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:4: ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:5: () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1889:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1890:1: 
        {
        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1890:2: ( ( ruleMemberFeatureCall ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1891:1: ( ruleMemberFeatureCall )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1891:1: ( ruleMemberFeatureCall )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1892:1: ruleMemberFeatureCall
        {
        pushFollow(FOLLOW_ruleMemberFeatureCall_in_synpred15_InternalHaxe4548);
        ruleMemberFeatureCall();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1894:2: ( ( ruleOpIncrement ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1895:1: ( ruleOpIncrement )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1895:1: ( ruleOpIncrement )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1896:1: ruleOpIncrement
        {
        pushFollow(FOLLOW_ruleOpIncrement_in_synpred15_InternalHaxe4557);
        ruleOpIncrement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalHaxe

    // $ANTLR start synpred16_InternalHaxe
    public final void synpred16_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2014:6: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2015:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred16_InternalHaxe4856); if (state.failed) return ;
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2016:1: ( ( ruleValidID ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2017:1: ( ruleValidID )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2017:1: ( ruleValidID )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2018:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred16_InternalHaxe4865);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred16_InternalHaxe4871);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalHaxe

    // $ANTLR start synpred17_InternalHaxe
    public final void synpred17_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:8: ( ( () '.' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:9: ( () '.' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:9: ( () '.' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:10: () '.'
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2072:10: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2073:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred17_InternalHaxe4973); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHaxe

    // $ANTLR start synpred18_InternalHaxe
    public final void synpred18_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2102:4: ( ( '(' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2103:1: ( '(' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2103:1: ( '(' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2104:2: '('
        {
        match(input,52,FOLLOW_52_in_synpred18_InternalHaxe5031); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHaxe

    // $ANTLR start synpred19_InternalHaxe
    public final void synpred19_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2664:4: ( ( '(' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2665:1: ( '(' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2665:1: ( '(' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2666:2: '('
        {
        match(input,52,FOLLOW_52_in_synpred19_InternalHaxe6412); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHaxe

    // Delegated rules

    public final boolean synpred15_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\1\14\15\uffff";
    static final String DFA4_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA4_maxS =
        "\1\101\13\0\2\uffff";
    static final String DFA4_acceptS =
        "\14\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\1\uffff\1\10\1\3\1\11\1\4\1\12\1\5\1\1\1\7\1\0\1\6\1\2\2\uffff}>";
    static final String[] DFA4_transitionS = {
            "\6\14\4\uffff\3\14\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\1\12\1\13\35\14\1\uffff\7\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "294:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\21\uffff";
    static final String DFA24_eofS =
        "\21\uffff";
    static final String DFA24_minS =
        "\1\4\16\0\2\uffff";
    static final String DFA24_maxS =
        "\1\100\16\0\2\uffff";
    static final String DFA24_acceptS =
        "\17\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\1\4\1\7\1\6\1\10\1\14\52\uffff\1\13\1\uffff\1\12\4\uffff"+
            "\1\16\1\15\1\1\1\2\1\5\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1889:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA24_14 = input.LA(1);

                         
                        int index24_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\73\uffff";
    static final String DFA28_eofS =
        "\1\2\72\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\71\uffff";
    static final String DFA28_maxS =
        "\1\101\1\0\71\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\67\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\71\uffff}>";
    static final String[] DFA28_transitionS = {
            "\6\2\4\uffff\3\2\1\uffff\42\2\1\1\5\2\1\uffff\7\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "2102:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalHaxe()) ) {s = 58;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\73\uffff";
    static final String DFA40_eofS =
        "\1\2\72\uffff";
    static final String DFA40_minS =
        "\1\4\1\0\71\uffff";
    static final String DFA40_maxS =
        "\1\101\1\0\71\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\67\uffff\1\1";
    static final String DFA40_specialS =
        "\1\uffff\1\0\71\uffff}>";
    static final String[] DFA40_transitionS = {
            "\6\2\4\uffff\3\2\1\uffff\42\2\1\1\5\2\1\uffff\7\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2664:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalHaxe()) ) {s = 58;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleFile130 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeReference222 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeReference243 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleTypeReference265 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleTypeReference278 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleTypeReference299 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleTypeReference313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleAssignment509 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleAssignment525 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignment545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAssignment575 = new BitSet(new long[]{0x000000001FFC0002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleAssignment624 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignment647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpMultiAssign900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpMultiAssign957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpMultiAssign976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1111 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleOrExpression1160 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1183 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOr1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression1366 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleAndExpression1415 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression1438 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAnd1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherOperatorExpression1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression1621 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression1670 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression1693 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression1876 = new BitSet(new long[]{0x0000000F00014002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleCompareExpression1925 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression1948 = new BitSet(new long[]{0x0000000F00014002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpCompare2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpCompare2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_entryRuleBitwiseExpression2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseExpression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression2228 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_ruleBitwiseExpression2277 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression2300 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_entryRuleOpBitwise2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpBitwise2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpBitwise2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpBitwise2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpBitwise2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_entryRuleBitshiftExpression2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitshiftExpression2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleBitshiftExpression2523 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_ruleBitshiftExpression2572 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleBitshiftExpression2595 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_entryRuleOpBitshift2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpBitshift2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpBitshift2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpBitshift2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpBitshift2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_ruleAddExpression2818 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleAddExpression2867 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_ruleAddExpression2890 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_entryRuleSubtractExpression3016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtractExpression3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression3073 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_ruleSubtractExpression3122 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression3145 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_entryRuleOpSubtract3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSubtract3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpSubtract3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_entryRuleMultiplyExpression3271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplyExpression3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression3328 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_ruleMultiplyExpression3377 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression3400 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_entryRuleOpMultiply3439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiply3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMultiply3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_entryRuleDivideExpression3526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivideExpression3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_ruleDivideExpression3583 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_ruleDivideExpression3632 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_ruleDivideExpression3655 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_entryRuleOpDivide3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDivide3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpDivide3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_entryRuleModuloExpression3781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuloExpression3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleModuloExpression3838 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_ruleModuloExpression3887 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleModuloExpression3910 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_entryRuleOpModulo3949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpModulo3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpModulo3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleUnaryOperation4102 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpUnary4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_entryRulePreIncrementOperation4315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreIncrementOperation4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_rulePreIncrementOperation4408 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_entryRulePostIncrementOperation4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostIncrementOperation4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation4587 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_rulePostIncrementOperation4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_entryRuleOpIncrement4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpIncrement4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpIncrement4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpIncrement4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberFeatureCall4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall4839 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMemberFeatureCall4888 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMemberFeatureCall4911 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall4927 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleMemberFeatureCall4949 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMemberFeatureCall4992 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMemberFeatureCall5015 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMemberFeatureCall5049 = new BitSet(new long[]{0xF8778800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall5084 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMemberFeatureCall5097 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall5118 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_53_in_ruleMemberFeatureCall5134 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_rulePrimaryExpression5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorCall_in_rulePrimaryExpression5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpressionLiteral_in_ruleLiteral5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression5629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBlockExpression5685 = new BitSet(new long[]{0xFB578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionInsideBlock_in_ruleBlockExpression5707 = new BitSet(new long[]{0xFBD78800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_ruleBlockExpression5720 = new BitSet(new long[]{0xFB578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_56_in_ruleBlockExpression5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInsideBlock_in_entryRuleExpressionInsideBlock5772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionInsideBlock5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarations_in_ruleExpressionInsideBlock5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionInsideBlock5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarations_in_entryRuleVariableDeclarations5891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarations5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVariableDeclarations5947 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations5968 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclarations5981 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations6002 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration6040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVariableDeclaration6105 = new BitSet(new long[]{0x0400000000020002L});
    public static final BitSet FOLLOW_58_in_ruleVariableDeclaration6118 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleVariableDeclaration6139 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration6154 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression6213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleParenthesizedExpression6260 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression6282 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleParenthesizedExpression6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall6329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleFeatureCall6396 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFeatureCall6430 = new BitSet(new long[]{0xF8778800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall6465 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFeatureCall6478 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall6499 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_53_in_ruleFeatureCall6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorCall_in_entryRuleConstructorCall6555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorCall6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleConstructorCall6611 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConstructorCall6632 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConstructorCall6644 = new BitSet(new long[]{0xF8778800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorCall6666 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstructorCall6679 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorCall6700 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_53_in_ruleConstructorCall6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper6753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIdOrSuper6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBooleanLiteral6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanLiteral6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNullLiteral7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral7098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleIntLiteral7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral7218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpressionLiteral_in_entryRuleRegularExpressionLiteral7422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularExpressionLiteral7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleRegularExpressionLiteral7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral7524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleArrayLiteral7580 = new BitSet(new long[]{0xF8578800000083F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral7601 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArrayLiteral7615 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral7636 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleArrayLiteral7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName7745 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleQualifiedName7764 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName7786 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID7834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred1_InternalHaxe235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred2_InternalHaxe594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred3_InternalHaxe1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred4_InternalHaxe1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred5_InternalHaxe1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHaxe1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_synpred7_InternalHaxe2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_synpred8_InternalHaxe2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred9_InternalHaxe2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_synpred10_InternalHaxe3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_synpred11_InternalHaxe3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_synpred12_InternalHaxe3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_synpred13_InternalHaxe3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_synpred14_InternalHaxe4369 = new BitSet(new long[]{0xF8578800000003F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_synpred14_InternalHaxe4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_synpred15_InternalHaxe4548 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_synpred15_InternalHaxe4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalHaxe4856 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred16_InternalHaxe4865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred16_InternalHaxe4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred17_InternalHaxe4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred18_InternalHaxe5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred19_InternalHaxe6412 = new BitSet(new long[]{0x0000000000000002L});

}