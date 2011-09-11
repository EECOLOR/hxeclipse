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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEX", "RULE_STRING", "RULE_REGULAR_EXPRESSION", "RULE_EFLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'class'", "'{'", "'}'", "'<'", "','", "'>'", "'.'", "'super'", "'this'", "':'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'||'", "'&&'", "'...'", "'=='", "'!='", "'>='", "'<='", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'['", "']'", "'('", "')'", "'var'", "'function'", "'if'", "'else'", "'while'", "'do'", "'for'", "'in'", "'return'", "'break'", "'continue'", "'throw'", "'try'", "'catch'", "'switch'", "'default'", "'case'", "'new'", "'false'", "'true'", "'null'"
    };
    public static final int RULE_REGULAR_EXPRESSION=8;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
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
    public static final int RULE_HEX=6;
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
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__84=84;
    public static final int RULE_EFLOAT=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalHaxeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHaxeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[286+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalHaxeParser.tokenNames; }
    public String getGrammarFileName() { return "../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private HaxeGrammarAccess grammarAccess;
     	
        public InternalHaxeParser(TokenStream input, HaxeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Package";	
       	}
       	
       	@Override
       	protected HaxeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:74:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;
        int entryRulePackage_StartIndex = input.index();
        EObject iv_rulePackage = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:75:2: (iv_rulePackage= rulePackage EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:76:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage88);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage98); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRulePackage_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:83:1: rulePackage returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;
        int rulePackage_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_classes_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:86:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:87:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:87:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:87:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass ) )*
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:87:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:87:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackage136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:91:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:92:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:92:1: (lv_name_1_0= ruleQualifiedName )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:93:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage157);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPackageRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackage169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:113:3: ( (lv_classes_3_0= ruleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:114:1: (lv_classes_3_0= ruleClass )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:114:1: (lv_classes_3_0= ruleClass )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:115:3: lv_classes_3_0= ruleClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClass_in_rulePackage192);
            	    lv_classes_3_0=ruleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_3_0, 
            	              		"Class");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
            if ( state.backtracking>0 ) { memoize(input, 2, rulePackage_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClass"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:141:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;
        int entryRuleClass_StartIndex = input.index();
        EObject iv_ruleClass = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:142:2: (iv_ruleClass= ruleClass EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:143:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass231);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass241); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleClass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:150:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_members_3_0= ruleClassMember ) )+ otherlv_4= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;
        int ruleClass_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:153:28: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_members_3_0= ruleClassMember ) )+ otherlv_4= '}' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:154:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_members_3_0= ruleClassMember ) )+ otherlv_4= '}' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:154:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_members_3_0= ruleClassMember ) )+ otherlv_4= '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:154:3: otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_members_3_0= ruleClassMember ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleClass278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:158:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:159:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:159:1: (lv_name_1_0= ruleQualifiedName )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:160:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass299);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleClass311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:180:1: ( (lv_members_3_0= ruleClassMember ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=64 && LA3_0<=65)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:181:1: (lv_members_3_0= ruleClassMember )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:181:1: (lv_members_3_0= ruleClassMember )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:182:3: lv_members_3_0= ruleClassMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersClassMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClassMember_in_ruleClass332);
            	    lv_members_3_0=ruleClassMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_3_0, 
            	              		"ClassMember");
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleClass345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleClass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleClassMember"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:210:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;
        int entryRuleClassMember_StartIndex = input.index();
        EObject iv_ruleClassMember = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:211:2: (iv_ruleClassMember= ruleClassMember EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:212:2: iv_ruleClassMember= ruleClassMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassMemberRule()); 
            }
            pushFollow(FOLLOW_ruleClassMember_in_entryRuleClassMember381);
            iv_ruleClassMember=ruleClassMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMember391); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleClassMember_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:219:1: ruleClassMember returns [EObject current=null] : (this_FunctionMemberDeclaration_0= ruleFunctionMemberDeclaration | this_VariableMemberDeclaration_1= ruleVariableMemberDeclaration ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;
        int ruleClassMember_StartIndex = input.index();
        EObject this_FunctionMemberDeclaration_0 = null;

        EObject this_VariableMemberDeclaration_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:222:28: ( (this_FunctionMemberDeclaration_0= ruleFunctionMemberDeclaration | this_VariableMemberDeclaration_1= ruleVariableMemberDeclaration ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:223:1: (this_FunctionMemberDeclaration_0= ruleFunctionMemberDeclaration | this_VariableMemberDeclaration_1= ruleVariableMemberDeclaration )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:223:1: (this_FunctionMemberDeclaration_0= ruleFunctionMemberDeclaration | this_VariableMemberDeclaration_1= ruleVariableMemberDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==65) ) {
                alt4=1;
            }
            else if ( (LA4_0==64) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:224:2: this_FunctionMemberDeclaration_0= ruleFunctionMemberDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassMemberAccess().getFunctionMemberDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionMemberDeclaration_in_ruleClassMember441);
                    this_FunctionMemberDeclaration_0=ruleFunctionMemberDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionMemberDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:237:2: this_VariableMemberDeclaration_1= ruleVariableMemberDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassMemberAccess().getVariableMemberDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableMemberDeclaration_in_ruleClassMember471);
                    this_VariableMemberDeclaration_1=ruleVariableMemberDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableMemberDeclaration_1; 
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleClassMember_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleTypeReference"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:256:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeReference_StartIndex = input.index();
        EObject iv_ruleTypeReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:257:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:258:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference506);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleTypeReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:265:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;
        int ruleTypeReference_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:268:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:269:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:269:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:269:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:269:2: ( ( ruleQualifiedName ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:270:1: ( ruleQualifiedName )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:270:1: ( ruleQualifiedName )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:271:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeReference568);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:287:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:287:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:287:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:287:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTypeReference589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:292:2: ( (lv_arguments_2_0= ruleTypeReference ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:293:1: (lv_arguments_2_0= ruleTypeReference )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:293:1: (lv_arguments_2_0= ruleTypeReference )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:294:3: lv_arguments_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getArgumentsTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleTypeReference611);
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

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:310:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:310:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTypeReference624); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:314:1: ( (lv_arguments_4_0= ruleTypeReference ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:315:1: (lv_arguments_4_0= ruleTypeReference )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:315:1: (lv_arguments_4_0= ruleTypeReference )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:316:3: lv_arguments_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getArgumentsTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeReference_in_ruleTypeReference645);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleTypeReference659); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleTypeReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:344:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;
        int entryRuleQualifiedName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:345:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:346:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName698);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleQualifiedName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:353:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleQualifiedName_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:356:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:357:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:357:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:358:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName756);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:368:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:369:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName775); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName797);
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleQualifiedName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:393:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;
        int entryRuleValidID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:394:2: (iv_ruleValidID= ruleValidID EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:395:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID845);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleValidID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:402:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleValidID_StartIndex = input.index();
        Token this_ID_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:405:28: (this_ID_0= RULE_ID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:406:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID895); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleValidID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleFeatureID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:421:1: entryRuleFeatureID returns [String current=null] : iv_ruleFeatureID= ruleFeatureID EOF ;
    public final String entryRuleFeatureID() throws RecognitionException {
        String current = null;
        int entryRuleFeatureID_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFeatureID = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:422:2: (iv_ruleFeatureID= ruleFeatureID EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:423:2: iv_ruleFeatureID= ruleFeatureID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureID_in_entryRuleFeatureID940);
            iv_ruleFeatureID=ruleFeatureID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureID951); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleFeatureID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureID"


    // $ANTLR start "ruleFeatureID"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:430:1: ruleFeatureID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' | kw= 'this' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFeatureID_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:433:28: ( (this_ValidID_0= ruleValidID | kw= 'super' | kw= 'this' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:434:1: (this_ValidID_0= ruleValidID | kw= 'super' | kw= 'this' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:434:1: (this_ValidID_0= ruleValidID | kw= 'super' | kw= 'this' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:435:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureID998);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:447:2: kw= 'super'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFeatureID1022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureIDAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:454:2: kw= 'this'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleFeatureID1041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureIDAccess().getThisKeyword_2()); 
                          
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleFeatureID_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFeatureID"


    // $ANTLR start "entryRuleFormalParameter"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:469:1: entryRuleFormalParameter returns [EObject current=null] : iv_ruleFormalParameter= ruleFormalParameter EOF ;
    public final EObject entryRuleFormalParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleFormalParameter_StartIndex = input.index();
        EObject iv_ruleFormalParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:470:2: (iv_ruleFormalParameter= ruleFormalParameter EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:471:2: iv_ruleFormalParameter= ruleFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFormalParameter_in_entryRuleFormalParameter1083);
            iv_ruleFormalParameter=ruleFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParameter1093); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalParameter"


    // $ANTLR start "ruleFormalParameter"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:478:1: ruleFormalParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleFormalParameter() throws RecognitionException {
        EObject current = null;
        int ruleFormalParameter_StartIndex = input.index();
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:481:28: ( ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:482:1: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:482:1: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:482:2: ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:482:2: ( (lv_name_0_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:483:1: (lv_name_0_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:483:1: (lv_name_0_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:484:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalParameterAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFormalParameter1139);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:500:2: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:500:4: otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFormalParameter1152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFormalParameterAccess().getColonKeyword_1_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:504:1: ( (lv_type_2_0= ruleTypeReference ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:505:1: (lv_type_2_0= ruleTypeReference )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:505:1: (lv_type_2_0= ruleTypeReference )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:506:3: lv_type_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormalParameterAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleFormalParameter1173);
                    lv_type_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"TypeReference");
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFormalParameter"


    // $ANTLR start "entryRuleExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:530:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:531:2: (iv_ruleExpression= ruleExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:532:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1211);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1221); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:539:1: ruleExpression returns [EObject current=null] : (this_Assignment_0= ruleAssignment (otherlv_1= ';' )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:542:28: ( (this_Assignment_0= ruleAssignment (otherlv_1= ';' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:543:1: (this_Assignment_0= ruleAssignment (otherlv_1= ';' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:543:1: (this_Assignment_0= ruleAssignment (otherlv_1= ';' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:544:2: this_Assignment_0= ruleAssignment (otherlv_1= ';' )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression1271);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Assignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:555:1: (otherlv_1= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred12_InternalHaxe()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:555:3: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleExpression1283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getSemicolonKeyword_1());
                          
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:567:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignment_StartIndex = input.index();
        EObject iv_ruleAssignment = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:568:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:569:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1321);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:576:1: ruleAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;
        int ruleAssignment_StartIndex = input.index();
        EObject lv_value_3_0 = null;

        EObject this_OrExpression_4 = null;

        AntlrDatatypeRuleToken lv_feature_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:579:28: ( ( ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:1: ( ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:1: ( ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) ) | (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_ID && LA12_1<=RULE_EFLOAT)||LA12_1==15||(LA12_1>=17 && LA12_1<=25)||(LA12_1>=27 && LA12_1<=70)||(LA12_1>=72 && LA12_1<=84)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==26) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==26) ) {
                    alt12=1;
                }
                else if ( (LA12_2==EOF||(LA12_2>=RULE_ID && LA12_2<=RULE_EFLOAT)||LA12_2==15||(LA12_2>=17 && LA12_2<=25)||(LA12_2>=27 && LA12_2<=70)||(LA12_2>=72 && LA12_2<=84)) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==EOF||(LA12_3>=RULE_ID && LA12_3<=RULE_EFLOAT)||LA12_3==15||(LA12_3>=17 && LA12_3<=25)||(LA12_3>=27 && LA12_3<=70)||(LA12_3>=72 && LA12_3<=84)) ) {
                    alt12=2;
                }
                else if ( (LA12_3==26) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_STRING:
            case RULE_REGULAR_EXPRESSION:
            case RULE_EFLOAT:
            case 17:
            case 22:
            case 52:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 62:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 78:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt12=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:2: ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:2: ( () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:3: () ( ( ruleFeatureID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleAssignment ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:580:3: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:581:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAssignmentAccess().getAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:589:2: ( ( ruleFeatureID ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:590:1: ( ruleFeatureID )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:590:1: ( ruleFeatureID )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:591:3: ruleFeatureID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureFeatureCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureID_in_ruleAssignment1396);
                    ruleFeatureID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleAssignment1415);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:618:1: ( (lv_value_3_0= ruleAssignment ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:619:1: (lv_value_3_0= ruleAssignment )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:619:1: (lv_value_3_0= ruleAssignment )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:620:3: lv_value_3_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleAssignment1435);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:637:6: (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:637:6: (this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )? )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:638:2: this_OrExpression_4= ruleOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleAssignment1468);
                    this_OrExpression_4=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:6: ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:7: () ( (lv_feature_6_0= ruleOpMultiAssign ) )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:7: ()
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:655:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getAssignmentAccess().getOperationLeftAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:663:2: ( (lv_feature_6_0= ruleOpMultiAssign ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:664:1: (lv_feature_6_0= ruleOpMultiAssign )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:664:1: (lv_feature_6_0= ruleOpMultiAssign )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:665:3: lv_feature_6_0= ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureOpMultiAssignParserRuleCall_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleAssignment1520);
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

                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:681:4: ( (lv_right_7_0= ruleAssignment ) )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:682:1: (lv_right_7_0= ruleAssignment )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:682:1: (lv_right_7_0= ruleAssignment )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:683:3: lv_right_7_0= ruleAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAssignment_in_ruleAssignment1543);
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleAssignment_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:707:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;
        int entryRuleOpSingleAssign_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:708:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:709:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1583);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleOpSingleAssign_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:716:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpSingleAssign_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:719:28: (kw= '=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:721:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign1631); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleOpSingleAssign_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:734:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;
        int entryRuleOpMultiAssign_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:735:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:736:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1671);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1682); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleOpMultiAssign_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:743:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpMultiAssign_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:746:28: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:747:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:747:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '>>>=' )
            int alt13=11;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            case 31:
                {
                alt13=5;
                }
                break;
            case 32:
                {
                alt13=6;
                }
                break;
            case 33:
                {
                alt13=7;
                }
                break;
            case 34:
                {
                alt13=8;
                }
                break;
            case 35:
                {
                alt13=9;
                }
                break;
            case 36:
                {
                alt13=10;
                }
                break;
            case 37:
                {
                alt13=11;
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:748:2: kw= '+='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign1720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:755:2: kw= '-='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign1739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:762:2: kw= '*='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpMultiAssign1758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:769:2: kw= '/='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMultiAssign1777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:776:2: kw= '%='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMultiAssign1796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:783:2: kw= '&='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMultiAssign1815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAmpersandEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:790:2: kw= '|='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMultiAssign1834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getVerticalLineEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:797:2: kw= '^='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMultiAssign1853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getCircumflexAccentEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:804:2: kw= '<<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMultiAssign1872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignLessThanSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:811:2: kw= '>>='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMultiAssign1891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:818:2: kw= '>>>='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMultiAssign1910); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleOpMultiAssign_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleOrExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:831:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleOrExpression_StartIndex = input.index();
        EObject iv_ruleOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:832:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:833:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1950);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:840:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleOrExpression_StartIndex = input.index();
        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:843:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:844:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:844:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:845:2: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2010);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred27_InternalHaxe()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:6: ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:7: () ( (lv_feature_2_0= ruleOpOr ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:862:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:870:2: ( (lv_feature_2_0= ruleOpOr ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:871:1: (lv_feature_2_0= ruleOpOr )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:871:1: (lv_feature_2_0= ruleOpOr )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:872:3: lv_feature_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getFeatureOpOrParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleOrExpression2062);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:888:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:889:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:889:1: (lv_right_3_0= ruleAndExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:890:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2085);
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:914:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;
        int entryRuleOpOr_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:915:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:916:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2124);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2135); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleOpOr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:923:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpOr_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:926:28: (kw= '||' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:928:2: kw= '||'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOr2172); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleOpOr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleAndExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:941:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAndExpression_StartIndex = input.index();
        EObject iv_ruleAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:942:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:943:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2211);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2221); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:950:1: ruleAndExpression returns [EObject current=null] : (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleAndExpression_StartIndex = input.index();
        EObject this_OtherOperatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:953:28: ( (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:954:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:954:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:955:2: this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression2271);
            this_OtherOperatorExpression_0=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred29_InternalHaxe()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:6: ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:7: () ( (lv_feature_2_0= ruleOpAnd ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:972:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:980:2: ( (lv_feature_2_0= ruleOpAnd ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:981:1: (lv_feature_2_0= ruleOpAnd )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:981:1: (lv_feature_2_0= ruleOpAnd )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:982:3: lv_feature_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getFeatureOpAndParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleAndExpression2323);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:998:4: ( (lv_right_3_0= ruleOtherOperatorExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:999:1: (lv_right_3_0= ruleOtherOperatorExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:999:1: (lv_right_3_0= ruleOtherOperatorExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1000:3: lv_right_3_0= ruleOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightOtherOperatorExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression2346);
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
            	    break loop15;
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1024:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;
        int entryRuleOpAnd_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1025:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1026:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2385);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2396); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleOpAnd_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1033:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpAnd_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1036:28: (kw= '&&' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1038:2: kw= '&&'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAnd2433); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleOpAnd_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleOtherOperatorExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1051:1: entryRuleOtherOperatorExpression returns [EObject current=null] : iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF ;
    public final EObject entryRuleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleOtherOperatorExpression_StartIndex = input.index();
        EObject iv_ruleOtherOperatorExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1052:2: (iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1053:2: iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression2472);
            iv_ruleOtherOperatorExpression=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherOperatorExpression2482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleOtherOperatorExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherOperatorExpression"


    // $ANTLR start "ruleOtherOperatorExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1060:1: ruleOtherOperatorExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* ) ;
    public final EObject ruleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;
        int ruleOtherOperatorExpression_StartIndex = input.index();
        EObject this_CompareExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1063:28: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1064:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1065:2: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getCompareExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression2532);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred31_InternalHaxe()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:6: ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:7: () ( (lv_feature_2_0= ruleOpOther ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1082:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOtherOperatorExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1090:2: ( (lv_feature_2_0= ruleOpOther ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1091:1: (lv_feature_2_0= ruleOpOther )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1091:1: (lv_feature_2_0= ruleOpOther )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1092:3: lv_feature_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getFeatureOpOtherParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression2584);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1108:4: ( (lv_right_3_0= ruleCompareExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1109:1: (lv_right_3_0= ruleCompareExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1109:1: (lv_right_3_0= ruleCompareExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1110:3: lv_right_3_0= ruleCompareExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getRightCompareExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression2607);
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleOtherOperatorExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1134:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;
        int entryRuleOpOther_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1135:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1136:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2646);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2657); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleOpOther_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1143:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '...' ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpOther_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1146:28: (kw= '...' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1148:2: kw= '...'
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther2694); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleOpOther_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleCompareExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1161:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleCompareExpression_StartIndex = input.index();
        EObject iv_ruleCompareExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1162:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1163:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2733);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression2743); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleCompareExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1170:1: ruleCompareExpression returns [EObject current=null] : (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;
        int ruleCompareExpression_StartIndex = input.index();
        EObject this_BitwiseExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1173:28: ( (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1174:1: (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1174:1: (this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1175:2: this_BitwiseExpression_0= ruleBitwiseExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExpressionAccess().getBitwiseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression2793);
            this_BitwiseExpression_0=ruleBitwiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:1: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA17_7 = input.LA(2);

                    if ( (synpred33_InternalHaxe()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:6: ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:7: () ( (lv_feature_2_0= ruleOpCompare ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1192:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCompareExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1200:2: ( (lv_feature_2_0= ruleOpCompare ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1201:1: (lv_feature_2_0= ruleOpCompare )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1201:1: (lv_feature_2_0= ruleOpCompare )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1202:3: lv_feature_2_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleCompareExpression2845);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1218:4: ( (lv_right_3_0= ruleBitwiseExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1219:1: (lv_right_3_0= ruleBitwiseExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1219:1: (lv_right_3_0= ruleBitwiseExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1220:3: lv_right_3_0= ruleBitwiseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBitwiseExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression2868);
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleCompareExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1244:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;
        int entryRuleOpCompare_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1245:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1246:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2907);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2918); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleOpCompare_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1253:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpCompare_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1256:28: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1257:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1257:1: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 21:
                {
                alt18=5;
                }
                break;
            case 19:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1258:2: kw= '=='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare2956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1265:2: kw= '!='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare2975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1272:2: kw= '>='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpCompare2994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1279:2: kw= '<='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpCompare3013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1286:2: kw= '>'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpCompare3032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1293:2: kw= '<'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpCompare3051); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleOpCompare_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleBitwiseExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1306:1: entryRuleBitwiseExpression returns [EObject current=null] : iv_ruleBitwiseExpression= ruleBitwiseExpression EOF ;
    public final EObject entryRuleBitwiseExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1307:2: (iv_ruleBitwiseExpression= ruleBitwiseExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1308:2: iv_ruleBitwiseExpression= ruleBitwiseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseExpression_in_entryRuleBitwiseExpression3091);
            iv_ruleBitwiseExpression=ruleBitwiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseExpression3101); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleBitwiseExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseExpression"


    // $ANTLR start "ruleBitwiseExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1315:1: ruleBitwiseExpression returns [EObject current=null] : (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* ) ;
    public final EObject ruleBitwiseExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseExpression_StartIndex = input.index();
        EObject this_BitshiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1318:28: ( (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1319:1: (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1319:1: (this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1320:2: this_BitshiftExpression_0= ruleBitshiftExpression ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getBitshiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression3151);
            this_BitshiftExpression_0=ruleBitshiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitshiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:1: ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred40_InternalHaxe()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred40_InternalHaxe()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred40_InternalHaxe()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:3: ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:6: ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:7: () ( (lv_feature_2_0= ruleOpBitwise ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1337:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1345:2: ( (lv_feature_2_0= ruleOpBitwise ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1346:1: (lv_feature_2_0= ruleOpBitwise )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1346:1: (lv_feature_2_0= ruleOpBitwise )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1347:3: lv_feature_2_0= ruleOpBitwise
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getFeatureOpBitwiseParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpBitwise_in_ruleBitwiseExpression3203);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1363:4: ( (lv_right_3_0= ruleBitshiftExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1364:1: (lv_right_3_0= ruleBitshiftExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1364:1: (lv_right_3_0= ruleBitshiftExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1365:3: lv_right_3_0= ruleBitshiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getRightBitshiftExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression3226);
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleBitwiseExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseExpression"


    // $ANTLR start "entryRuleOpBitwise"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1389:1: entryRuleOpBitwise returns [String current=null] : iv_ruleOpBitwise= ruleOpBitwise EOF ;
    public final String entryRuleOpBitwise() throws RecognitionException {
        String current = null;
        int entryRuleOpBitwise_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpBitwise = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1390:2: (iv_ruleOpBitwise= ruleOpBitwise EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1391:2: iv_ruleOpBitwise= ruleOpBitwise EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpBitwiseRule()); 
            }
            pushFollow(FOLLOW_ruleOpBitwise_in_entryRuleOpBitwise3265);
            iv_ruleOpBitwise=ruleOpBitwise();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpBitwise.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpBitwise3276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleOpBitwise_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpBitwise"


    // $ANTLR start "ruleOpBitwise"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1398:1: ruleOpBitwise returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '&' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleOpBitwise() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpBitwise_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1401:28: ( (kw= '|' | kw= '&' | kw= '^' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1402:1: (kw= '|' | kw= '&' | kw= '^' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1402:1: (kw= '|' | kw= '&' | kw= '^' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1403:2: kw= '|'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpBitwise3314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitwiseAccess().getVerticalLineKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1410:2: kw= '&'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpBitwise3333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitwiseAccess().getAmpersandKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1417:2: kw= '^'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpBitwise3352); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleOpBitwise_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpBitwise"


    // $ANTLR start "entryRuleBitshiftExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1430:1: entryRuleBitshiftExpression returns [EObject current=null] : iv_ruleBitshiftExpression= ruleBitshiftExpression EOF ;
    public final EObject entryRuleBitshiftExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitshiftExpression_StartIndex = input.index();
        EObject iv_ruleBitshiftExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1431:2: (iv_ruleBitshiftExpression= ruleBitshiftExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1432:2: iv_ruleBitshiftExpression= ruleBitshiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitshiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitshiftExpression_in_entryRuleBitshiftExpression3392);
            iv_ruleBitshiftExpression=ruleBitshiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitshiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitshiftExpression3402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleBitshiftExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitshiftExpression"


    // $ANTLR start "ruleBitshiftExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1439:1: ruleBitshiftExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleBitshiftExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitshiftExpression_StartIndex = input.index();
        EObject this_AddExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1442:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1443:1: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1443:1: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1444:2: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getAddExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleBitshiftExpression3452);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:1: ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred44_InternalHaxe()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred44_InternalHaxe()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred44_InternalHaxe()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:3: ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:6: ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:7: () ( (lv_feature_2_0= ruleOpBitshift ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1461:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitshiftExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1469:2: ( (lv_feature_2_0= ruleOpBitshift ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1470:1: (lv_feature_2_0= ruleOpBitshift )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1470:1: (lv_feature_2_0= ruleOpBitshift )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1471:3: lv_feature_2_0= ruleOpBitshift
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getFeatureOpBitshiftParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpBitshift_in_ruleBitshiftExpression3504);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1487:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1488:1: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1488:1: (lv_right_3_0= ruleAddExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1489:3: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddExpression_in_ruleBitshiftExpression3527);
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
            	    break loop21;
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleBitshiftExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitshiftExpression"


    // $ANTLR start "entryRuleOpBitshift"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1513:1: entryRuleOpBitshift returns [String current=null] : iv_ruleOpBitshift= ruleOpBitshift EOF ;
    public final String entryRuleOpBitshift() throws RecognitionException {
        String current = null;
        int entryRuleOpBitshift_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpBitshift = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1514:2: (iv_ruleOpBitshift= ruleOpBitshift EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1515:2: iv_ruleOpBitshift= ruleOpBitshift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpBitshiftRule()); 
            }
            pushFollow(FOLLOW_ruleOpBitshift_in_entryRuleOpBitshift3566);
            iv_ruleOpBitshift=ruleOpBitshift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpBitshift.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpBitshift3577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleOpBitshift_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpBitshift"


    // $ANTLR start "ruleOpBitshift"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1522:1: ruleOpBitshift returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<<' | kw= '>>' | kw= '>>>' ) ;
    public final AntlrDatatypeRuleToken ruleOpBitshift() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpBitshift_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1525:28: ( (kw= '<<' | kw= '>>' | kw= '>>>' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1526:1: (kw= '<<' | kw= '>>' | kw= '>>>' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1526:1: (kw= '<<' | kw= '>>' | kw= '>>>' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 50:
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1527:2: kw= '<<'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpBitshift3615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitshiftAccess().getLessThanSignLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1534:2: kw= '>>'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpBitshift3634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpBitshiftAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1541:2: kw= '>>>'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpBitshift3653); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleOpBitshift_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpBitshift"


    // $ANTLR start "entryRuleAddExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1554:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAddExpression_StartIndex = input.index();
        EObject iv_ruleAddExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1555:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1556:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression3693);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression3703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1563:1: ruleAddExpression returns [EObject current=null] : (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;
        int ruleAddExpression_StartIndex = input.index();
        EObject this_SubtractExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1566:28: ( (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1567:1: (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1567:1: (this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1568:2: this_SubtractExpression_0= ruleSubtractExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubtractExpression_in_ruleAddExpression3753);
            this_SubtractExpression_0=ruleSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==51) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred48_InternalHaxe()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:6: ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:7: () ( (lv_feature_2_0= ruleOpAdd ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1585:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAddExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1593:2: ( (lv_feature_2_0= ruleOpAdd ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1594:1: (lv_feature_2_0= ruleOpAdd )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1594:1: (lv_feature_2_0= ruleOpAdd )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1595:3: lv_feature_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getFeatureOpAddParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleAddExpression3805);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1611:4: ( (lv_right_3_0= ruleSubtractExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1612:1: (lv_right_3_0= ruleSubtractExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1612:1: (lv_right_3_0= ruleSubtractExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1613:3: lv_right_3_0= ruleSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSubtractExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubtractExpression_in_ruleAddExpression3828);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleAddExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1637:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;
        int entryRuleOpAdd_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1638:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1639:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3867);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3878); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleOpAdd_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1646:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpAdd_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1649:28: (kw= '+' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1651:2: kw= '+'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleOpAdd3915); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleOpAdd_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleSubtractExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1664:1: entryRuleSubtractExpression returns [EObject current=null] : iv_ruleSubtractExpression= ruleSubtractExpression EOF ;
    public final EObject entryRuleSubtractExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSubtractExpression_StartIndex = input.index();
        EObject iv_ruleSubtractExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1665:2: (iv_ruleSubtractExpression= ruleSubtractExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1666:2: iv_ruleSubtractExpression= ruleSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubtractExpression_in_entryRuleSubtractExpression3954);
            iv_ruleSubtractExpression=ruleSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtractExpression3964); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleSubtractExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtractExpression"


    // $ANTLR start "ruleSubtractExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1673:1: ruleSubtractExpression returns [EObject current=null] : (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* ) ;
    public final EObject ruleSubtractExpression() throws RecognitionException {
        EObject current = null;
        int ruleSubtractExpression_StartIndex = input.index();
        EObject this_MultiplyExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1676:28: ( (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1677:1: (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1677:1: (this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1678:2: this_MultiplyExpression_0= ruleMultiplyExpression ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubtractExpressionAccess().getMultiplyExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression4014);
            this_MultiplyExpression_0=ruleMultiplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplyExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:1: ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred50_InternalHaxe()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:3: ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:6: ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:7: () ( (lv_feature_2_0= ruleOpSubtract ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1695:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSubtractExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1703:2: ( (lv_feature_2_0= ruleOpSubtract ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1704:1: (lv_feature_2_0= ruleOpSubtract )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1704:1: (lv_feature_2_0= ruleOpSubtract )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1705:3: lv_feature_2_0= ruleOpSubtract
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getFeatureOpSubtractParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpSubtract_in_ruleSubtractExpression4066);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1721:4: ( (lv_right_3_0= ruleMultiplyExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1722:1: (lv_right_3_0= ruleMultiplyExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1722:1: (lv_right_3_0= ruleMultiplyExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1723:3: lv_right_3_0= ruleMultiplyExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getRightMultiplyExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression4089);
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
            	    break loop24;
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleSubtractExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubtractExpression"


    // $ANTLR start "entryRuleOpSubtract"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1747:1: entryRuleOpSubtract returns [String current=null] : iv_ruleOpSubtract= ruleOpSubtract EOF ;
    public final String entryRuleOpSubtract() throws RecognitionException {
        String current = null;
        int entryRuleOpSubtract_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpSubtract = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1748:2: (iv_ruleOpSubtract= ruleOpSubtract EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1749:2: iv_ruleOpSubtract= ruleOpSubtract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSubtractRule()); 
            }
            pushFollow(FOLLOW_ruleOpSubtract_in_entryRuleOpSubtract4128);
            iv_ruleOpSubtract=ruleOpSubtract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSubtract.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSubtract4139); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleOpSubtract_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSubtract"


    // $ANTLR start "ruleOpSubtract"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1756:1: ruleOpSubtract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleOpSubtract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpSubtract_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1759:28: (kw= '-' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1761:2: kw= '-'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleOpSubtract4176); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleOpSubtract_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpSubtract"


    // $ANTLR start "entryRuleMultiplyExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1774:1: entryRuleMultiplyExpression returns [EObject current=null] : iv_ruleMultiplyExpression= ruleMultiplyExpression EOF ;
    public final EObject entryRuleMultiplyExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultiplyExpression_StartIndex = input.index();
        EObject iv_ruleMultiplyExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1775:2: (iv_ruleMultiplyExpression= ruleMultiplyExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1776:2: iv_ruleMultiplyExpression= ruleMultiplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplyExpression_in_entryRuleMultiplyExpression4215);
            iv_ruleMultiplyExpression=ruleMultiplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplyExpression4225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleMultiplyExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplyExpression"


    // $ANTLR start "ruleMultiplyExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1783:1: ruleMultiplyExpression returns [EObject current=null] : (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* ) ;
    public final EObject ruleMultiplyExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultiplyExpression_StartIndex = input.index();
        EObject this_DivideExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1786:28: ( (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1787:1: (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1787:1: (this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1788:2: this_DivideExpression_0= ruleDivideExpression ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression4275);
            this_DivideExpression_0=ruleDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:1: ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred52_InternalHaxe()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:3: ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:6: ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:7: () ( (lv_feature_2_0= ruleOpMultiply ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1805:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplyExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1813:2: ( (lv_feature_2_0= ruleOpMultiply ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1814:1: (lv_feature_2_0= ruleOpMultiply )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1814:1: (lv_feature_2_0= ruleOpMultiply )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1815:3: lv_feature_2_0= ruleOpMultiply
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getFeatureOpMultiplyParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMultiply_in_ruleMultiplyExpression4327);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1831:4: ( (lv_right_3_0= ruleDivideExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1832:1: (lv_right_3_0= ruleDivideExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1832:1: (lv_right_3_0= ruleDivideExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1833:3: lv_right_3_0= ruleDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getRightDivideExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression4350);
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
            	    break loop25;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleMultiplyExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultiplyExpression"


    // $ANTLR start "entryRuleOpMultiply"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1857:1: entryRuleOpMultiply returns [String current=null] : iv_ruleOpMultiply= ruleOpMultiply EOF ;
    public final String entryRuleOpMultiply() throws RecognitionException {
        String current = null;
        int entryRuleOpMultiply_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpMultiply = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1858:2: (iv_ruleOpMultiply= ruleOpMultiply EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1859:2: iv_ruleOpMultiply= ruleOpMultiply EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiplyRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiply_in_entryRuleOpMultiply4389);
            iv_ruleOpMultiply=ruleOpMultiply();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiply.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiply4400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleOpMultiply_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiply"


    // $ANTLR start "ruleOpMultiply"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1866:1: ruleOpMultiply returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleOpMultiply() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpMultiply_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1869:28: (kw= '*' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1871:2: kw= '*'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleOpMultiply4437); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleOpMultiply_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiply"


    // $ANTLR start "entryRuleDivideExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1884:1: entryRuleDivideExpression returns [EObject current=null] : iv_ruleDivideExpression= ruleDivideExpression EOF ;
    public final EObject entryRuleDivideExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDivideExpression_StartIndex = input.index();
        EObject iv_ruleDivideExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1885:2: (iv_ruleDivideExpression= ruleDivideExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1886:2: iv_ruleDivideExpression= ruleDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivideExpression_in_entryRuleDivideExpression4476);
            iv_ruleDivideExpression=ruleDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivideExpression4486); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleDivideExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDivideExpression"


    // $ANTLR start "ruleDivideExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1893:1: ruleDivideExpression returns [EObject current=null] : (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* ) ;
    public final EObject ruleDivideExpression() throws RecognitionException {
        EObject current = null;
        int ruleDivideExpression_StartIndex = input.index();
        EObject this_ModuloExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1896:28: ( (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1897:1: (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1897:1: (this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1898:2: this_ModuloExpression_0= ruleModuloExpression ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivideExpressionAccess().getModuloExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleModuloExpression_in_ruleDivideExpression4536);
            this_ModuloExpression_0=ruleModuloExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModuloExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:1: ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred54_InternalHaxe()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:3: ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:6: ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:7: () ( (lv_feature_2_0= ruleOpDivide ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1915:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDivideExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1923:2: ( (lv_feature_2_0= ruleOpDivide ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1924:1: (lv_feature_2_0= ruleOpDivide )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1924:1: (lv_feature_2_0= ruleOpDivide )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1925:3: lv_feature_2_0= ruleOpDivide
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getFeatureOpDivideParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpDivide_in_ruleDivideExpression4588);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1941:4: ( (lv_right_3_0= ruleModuloExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1942:1: (lv_right_3_0= ruleModuloExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1942:1: (lv_right_3_0= ruleModuloExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1943:3: lv_right_3_0= ruleModuloExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getRightModuloExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModuloExpression_in_ruleDivideExpression4611);
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
            	    break loop26;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleDivideExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDivideExpression"


    // $ANTLR start "entryRuleOpDivide"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1967:1: entryRuleOpDivide returns [String current=null] : iv_ruleOpDivide= ruleOpDivide EOF ;
    public final String entryRuleOpDivide() throws RecognitionException {
        String current = null;
        int entryRuleOpDivide_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpDivide = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1968:2: (iv_ruleOpDivide= ruleOpDivide EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1969:2: iv_ruleOpDivide= ruleOpDivide EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpDivideRule()); 
            }
            pushFollow(FOLLOW_ruleOpDivide_in_entryRuleOpDivide4650);
            iv_ruleOpDivide=ruleOpDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpDivide.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDivide4661); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleOpDivide_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpDivide"


    // $ANTLR start "ruleOpDivide"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1976:1: ruleOpDivide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken ruleOpDivide() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpDivide_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1979:28: (kw= '/' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1981:2: kw= '/'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleOpDivide4698); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleOpDivide_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpDivide"


    // $ANTLR start "entryRuleModuloExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1994:1: entryRuleModuloExpression returns [EObject current=null] : iv_ruleModuloExpression= ruleModuloExpression EOF ;
    public final EObject entryRuleModuloExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleModuloExpression_StartIndex = input.index();
        EObject iv_ruleModuloExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1995:2: (iv_ruleModuloExpression= ruleModuloExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1996:2: iv_ruleModuloExpression= ruleModuloExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModuloExpression_in_entryRuleModuloExpression4737);
            iv_ruleModuloExpression=ruleModuloExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuloExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuloExpression4747); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleModuloExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModuloExpression"


    // $ANTLR start "ruleModuloExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2003:1: ruleModuloExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject ruleModuloExpression() throws RecognitionException {
        EObject current = null;
        int ruleModuloExpression_StartIndex = input.index();
        EObject this_UnaryOperation_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2006:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2007:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2007:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2008:2: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModuloExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleModuloExpression4797);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:1: ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==55) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred56_InternalHaxe()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:3: ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:6: ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:7: () ( (lv_feature_2_0= ruleOpModulo ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:7: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2025:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getModuloExpressionAccess().getOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2033:2: ( (lv_feature_2_0= ruleOpModulo ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2034:1: (lv_feature_2_0= ruleOpModulo )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2034:1: (lv_feature_2_0= ruleOpModulo )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2035:3: lv_feature_2_0= ruleOpModulo
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getFeatureOpModuloParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpModulo_in_ruleModuloExpression4849);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2051:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2052:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2052:1: (lv_right_3_0= ruleUnaryOperation )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2053:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleModuloExpression4872);
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
            	    break loop27;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleModuloExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModuloExpression"


    // $ANTLR start "entryRuleOpModulo"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2077:1: entryRuleOpModulo returns [String current=null] : iv_ruleOpModulo= ruleOpModulo EOF ;
    public final String entryRuleOpModulo() throws RecognitionException {
        String current = null;
        int entryRuleOpModulo_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpModulo = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2078:2: (iv_ruleOpModulo= ruleOpModulo EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2079:2: iv_ruleOpModulo= ruleOpModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpModuloRule()); 
            }
            pushFollow(FOLLOW_ruleOpModulo_in_entryRuleOpModulo4911);
            iv_ruleOpModulo=ruleOpModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpModulo.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpModulo4922); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleOpModulo_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpModulo"


    // $ANTLR start "ruleOpModulo"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2086:1: ruleOpModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '%' ;
    public final AntlrDatatypeRuleToken ruleOpModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpModulo_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2089:28: (kw= '%' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2091:2: kw= '%'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleOpModulo4959); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleOpModulo_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpModulo"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2104:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;
        int entryRuleUnaryOperation_StartIndex = input.index();
        EObject iv_ruleUnaryOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2105:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2106:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4998);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation5008); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleUnaryOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2113:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;
        int ruleUnaryOperation_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PreIncrementOperation_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2116:28: ( ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) ) | this_PreIncrementOperation_3= rulePreIncrementOperation )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52||(LA28_0>=56 && LA28_0<=57)) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_EFLOAT)||LA28_0==17||(LA28_0>=22 && LA28_0<=24)||(LA28_0>=58 && LA28_0<=60)||LA28_0==62||(LA28_0>=65 && LA28_0<=66)||(LA28_0>=68 && LA28_0<=70)||(LA28_0>=72 && LA28_0<=76)||LA28_0==78||(LA28_0>=81 && LA28_0<=84)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:3: () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePreIncrementOperation ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2117:3: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2118:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2126:2: ( (lv_feature_1_0= ruleOpUnary ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2127:1: (lv_feature_1_0= ruleOpUnary )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2127:1: (lv_feature_1_0= ruleOpUnary )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2128:3: lv_feature_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleUnaryOperation5067);
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

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2144:2: ( (lv_operand_2_0= rulePreIncrementOperation ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2145:1: (lv_operand_2_0= rulePreIncrementOperation )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2145:1: (lv_operand_2_0= rulePreIncrementOperation )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2146:3: lv_operand_2_0= rulePreIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandPreIncrementOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation5088);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2164:2: this_PreIncrementOperation_3= rulePreIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getPreIncrementOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation5120);
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleUnaryOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2183:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;
        int entryRuleOpUnary_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2184:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2185:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5156);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5167); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleOpUnary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2192:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpUnary_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2195:28: ( (kw= '!' | kw= '-' | kw= '~' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2196:1: (kw= '!' | kw= '-' | kw= '~' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2196:1: (kw= '!' | kw= '-' | kw= '~' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt29=1;
                }
                break;
            case 52:
                {
                alt29=2;
                }
                break;
            case 57:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2197:2: kw= '!'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOpUnary5205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2204:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOpUnary5224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2211:2: kw= '~'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOpUnary5243); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleOpUnary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRulePreIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2224:1: entryRulePreIncrementOperation returns [EObject current=null] : iv_rulePreIncrementOperation= rulePreIncrementOperation EOF ;
    public final EObject entryRulePreIncrementOperation() throws RecognitionException {
        EObject current = null;
        int entryRulePreIncrementOperation_StartIndex = input.index();
        EObject iv_rulePreIncrementOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2225:2: (iv_rulePreIncrementOperation= rulePreIncrementOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2226:2: iv_rulePreIncrementOperation= rulePreIncrementOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreIncrementOperationRule()); 
            }
            pushFollow(FOLLOW_rulePreIncrementOperation_in_entryRulePreIncrementOperation5283);
            iv_rulePreIncrementOperation=rulePreIncrementOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreIncrementOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreIncrementOperation5293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRulePreIncrementOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePreIncrementOperation"


    // $ANTLR start "rulePreIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2233:1: rulePreIncrementOperation returns [EObject current=null] : ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation ) ;
    public final EObject rulePreIncrementOperation() throws RecognitionException {
        EObject current = null;
        int rulePreIncrementOperation_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PostIncrementOperation_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2236:28: ( ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2237:1: ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2237:1: ( ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) ) | this_PostIncrementOperation_3= rulePostIncrementOperation )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=58 && LA30_0<=59)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_EFLOAT)||LA30_0==17||(LA30_0>=22 && LA30_0<=24)||LA30_0==60||LA30_0==62||(LA30_0>=65 && LA30_0<=66)||(LA30_0>=68 && LA30_0<=70)||(LA30_0>=72 && LA30_0<=76)||LA30_0==78||(LA30_0>=81 && LA30_0<=84)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2237:2: ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2237:2: ( ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2237:3: ( ( () ( ( ruleOpIncrement ) ) ( ( rulePostIncrementOperation ) ) ) )=> ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2246:6: ( () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2246:7: () ( (lv_feature_1_0= ruleOpIncrement ) ) ( (lv_operand_2_0= rulePostIncrementOperation ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2246:7: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2247:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPreIncrementOperationAccess().getPreIncrementOperationAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2255:2: ( (lv_feature_1_0= ruleOpIncrement ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2256:1: (lv_feature_1_0= ruleOpIncrement )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2256:1: (lv_feature_1_0= ruleOpIncrement )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2257:3: lv_feature_1_0= ruleOpIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpIncrement_in_rulePreIncrementOperation5379);
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

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2273:2: ( (lv_operand_2_0= rulePostIncrementOperation ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2274:1: (lv_operand_2_0= rulePostIncrementOperation )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2274:1: (lv_operand_2_0= rulePostIncrementOperation )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2275:3: lv_operand_2_0= rulePostIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getOperandPostIncrementOperationParserRuleCall_0_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation5400);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2293:2: this_PostIncrementOperation_3= rulePostIncrementOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPreIncrementOperationAccess().getPostIncrementOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation5433);
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
            if ( state.backtracking>0 ) { memoize(input, 74, rulePreIncrementOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePreIncrementOperation"


    // $ANTLR start "entryRulePostIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2312:1: entryRulePostIncrementOperation returns [EObject current=null] : iv_rulePostIncrementOperation= rulePostIncrementOperation EOF ;
    public final EObject entryRulePostIncrementOperation() throws RecognitionException {
        EObject current = null;
        int entryRulePostIncrementOperation_StartIndex = input.index();
        EObject iv_rulePostIncrementOperation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2313:2: (iv_rulePostIncrementOperation= rulePostIncrementOperation EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2314:2: iv_rulePostIncrementOperation= rulePostIncrementOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostIncrementOperationRule()); 
            }
            pushFollow(FOLLOW_rulePostIncrementOperation_in_entryRulePostIncrementOperation5468);
            iv_rulePostIncrementOperation=rulePostIncrementOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostIncrementOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostIncrementOperation5478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRulePostIncrementOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostIncrementOperation"


    // $ANTLR start "rulePostIncrementOperation"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2321:1: rulePostIncrementOperation returns [EObject current=null] : ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall ) ;
    public final EObject rulePostIncrementOperation() throws RecognitionException {
        EObject current = null;
        int rulePostIncrementOperation_StartIndex = input.index();
        EObject lv_operand_1_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject this_MemberFeatureCall_3 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2324:28: ( ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:3: ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:6: ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:7: () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:7: ()
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2335:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostIncrementOperationAccess().getPostIncrementOperationAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2343:2: ( (lv_operand_1_0= ruleMemberFeatureCall ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2344:1: (lv_operand_1_0= ruleMemberFeatureCall )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2344:1: (lv_operand_1_0= ruleMemberFeatureCall )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2345:3: lv_operand_1_0= ruleMemberFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getOperandMemberFeatureCallParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation5564);
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

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2361:2: ( (lv_feature_2_0= ruleOpIncrement ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2362:1: (lv_feature_2_0= ruleOpIncrement )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2362:1: (lv_feature_2_0= ruleOpIncrement )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2363:3: lv_feature_2_0= ruleOpIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpIncrement_in_rulePostIncrementOperation5585);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2381:2: this_MemberFeatureCall_3= ruleMemberFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getMemberFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation5618);
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
            if ( state.backtracking>0 ) { memoize(input, 76, rulePostIncrementOperation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostIncrementOperation"


    // $ANTLR start "entryRuleOpIncrement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2400:1: entryRuleOpIncrement returns [String current=null] : iv_ruleOpIncrement= ruleOpIncrement EOF ;
    public final String entryRuleOpIncrement() throws RecognitionException {
        String current = null;
        int entryRuleOpIncrement_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOpIncrement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2401:2: (iv_ruleOpIncrement= ruleOpIncrement EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2402:2: iv_ruleOpIncrement= ruleOpIncrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpIncrementRule()); 
            }
            pushFollow(FOLLOW_ruleOpIncrement_in_entryRuleOpIncrement5654);
            iv_ruleOpIncrement=ruleOpIncrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpIncrement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpIncrement5665); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleOpIncrement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOpIncrement"


    // $ANTLR start "ruleOpIncrement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2409:1: ruleOpIncrement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleOpIncrement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOpIncrement_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2412:28: ( (kw= '++' | kw= '--' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2413:1: (kw= '++' | kw= '--' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2413:1: (kw= '++' | kw= '--' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            else if ( (LA32_0==59) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2414:2: kw= '++'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOpIncrement5703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpIncrementAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2421:2: kw= '--'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOpIncrement5722); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleOpIncrement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOpIncrement"


    // $ANTLR start "entryRuleMemberFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2434:1: entryRuleMemberFeatureCall returns [EObject current=null] : iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF ;
    public final EObject entryRuleMemberFeatureCall() throws RecognitionException {
        EObject current = null;
        int entryRuleMemberFeatureCall_StartIndex = input.index();
        EObject iv_ruleMemberFeatureCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2435:2: (iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2436:2: iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall5762);
            iv_ruleMemberFeatureCall=ruleMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberFeatureCall5772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleMemberFeatureCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberFeatureCall"


    // $ANTLR start "ruleMemberFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2443:1: ruleMemberFeatureCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )* ) ;
    public final EObject ruleMemberFeatureCall() throws RecognitionException {
        EObject current = null;
        int ruleMemberFeatureCall_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token lv_explicitOperationCall_15_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_explicitOperationCall_24_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_feature_8_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_arguments_16_0 = null;

        EObject lv_arguments_18_0 = null;

        EObject lv_feature_22_0 = null;

        EObject lv_arguments_25_0 = null;

        EObject lv_arguments_27_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2446:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2447:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2447:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2448:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall5822);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:1: ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) | ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) | ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )*
            loop39:
            do {
                int alt39=5;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred66_InternalHaxe()) ) {
                        alt39=1;
                    }
                    else if ( (synpred74_InternalHaxe()) ) {
                        alt39=3;
                    }


                }
                else if ( (LA39_0==60) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred68_InternalHaxe()) ) {
                        alt39=2;
                    }
                    else if ( (synpred80_InternalHaxe()) ) {
                        alt39=4;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:2: ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:2: ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:3: ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:3: ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:4: ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:25: ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:26: () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:26: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2466:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMemberFeatureCall5874); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2478:1: ( ( ruleFeatureID ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2479:1: ( ruleFeatureID )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2479:1: ( ruleFeatureID )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2480:3: ruleFeatureID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureFeatureCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureID_in_ruleMemberFeatureCall5901);
            	    ruleFeatureID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall5920);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2507:3: ( (lv_value_5_0= ruleAssignment ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2508:1: (lv_value_5_0= ruleAssignment )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2508:1: (lv_value_5_0= ruleAssignment )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2509:3: lv_value_5_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleMemberFeatureCall5942);
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
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:6: ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:6: ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:7: ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:7: ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:8: ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:24: ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:25: () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:25: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2534:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getArrayAssignmentAssignameAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_7=(Token)match(input,60,FOLLOW_60_in_ruleMemberFeatureCall6003); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMemberFeatureCallAccess().getLeftSquareBracketKeyword_1_1_0_0_1());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2546:1: ( (lv_feature_8_0= ruleExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2547:1: (lv_feature_8_0= ruleExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2547:1: (lv_feature_8_0= ruleExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2548:3: lv_feature_8_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureExpressionParserRuleCall_1_1_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6024);
            	    lv_feature_8_0=ruleExpression();

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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleMemberFeatureCall6036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMemberFeatureCallAccess().getRightSquareBracketKeyword_1_1_0_0_3());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_1_0_0_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall6055);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2579:3: ( (lv_value_11_0= ruleAssignment ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2580:1: (lv_value_11_0= ruleAssignment )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2580:1: (lv_value_11_0= ruleAssignment )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2581:3: lv_value_11_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleMemberFeatureCall6077);
            	    lv_value_11_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_11_0, 
            	              		"Assignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:6: ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:6: ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:7: ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )?
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:7: ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:8: ( ( () '.' ) )=> ( () otherlv_13= '.' )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:5: ( () otherlv_13= '.' )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:6: () otherlv_13= '.'
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:6: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2601:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getMemberFeatureCallTargetAction_1_2_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleMemberFeatureCall6123); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_2_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2613:3: ( ( ruleFeatureID ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2614:1: ( ruleFeatureID )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2614:1: ( ruleFeatureID )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2615:3: ruleFeatureID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureFeatureCrossReference_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureID_in_ruleMemberFeatureCall6152);
            	    ruleFeatureID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')'
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:4: ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' )
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2638:1: (lv_explicitOperationCall_15_0= '(' )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2639:3: lv_explicitOperationCall_15_0= '('
            	            {
            	            lv_explicitOperationCall_15_0=(Token)match(input,62,FOLLOW_62_in_ruleMemberFeatureCall6186); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_15_0, grammarAccess.getMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_2_2_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:2: ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )?
            	            int alt34=2;
            	            int LA34_0 = input.LA(1);

            	            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_EFLOAT)||LA34_0==17||(LA34_0>=22 && LA34_0<=24)||LA34_0==52||(LA34_0>=56 && LA34_0<=60)||LA34_0==62||(LA34_0>=65 && LA34_0<=66)||(LA34_0>=68 && LA34_0<=70)||(LA34_0>=72 && LA34_0<=76)||LA34_0==78||(LA34_0>=81 && LA34_0<=84)) ) {
            	                alt34=1;
            	            }
            	            switch (alt34) {
            	                case 1 :
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2654:3: lv_arguments_16_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6221);
            	                    lv_arguments_16_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"arguments",
            	                              		lv_arguments_16_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:2: (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==20) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:4: otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleMemberFeatureCall6234); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_17, grammarAccess.getMemberFeatureCallAccess().getCommaKeyword_1_2_2_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2674:1: ( (lv_arguments_18_0= ruleExpression ) )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
            	                    	    {
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2676:3: lv_arguments_18_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6255);
            	                    	    lv_arguments_18_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"arguments",
            	                    	              		lv_arguments_18_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_19=(Token)match(input,63,FOLLOW_63_in_ruleMemberFeatureCall6271); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_19, grammarAccess.getMemberFeatureCallAccess().getRightParenthesisKeyword_1_2_2_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:6: ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:6: ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:7: ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )?
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:7: ( ( () )=> () )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:8: ( () )=> ()
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2698:5: ()
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2699:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getArrayAccessTargetAction_1_3_0_0(),
            	                  current);
            	          
            	    }

            	    }


            	    }

            	    otherlv_21=(Token)match(input,60,FOLLOW_60_in_ruleMemberFeatureCall6313); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMemberFeatureCallAccess().getLeftSquareBracketKeyword_1_3_1());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2711:1: ( (lv_feature_22_0= ruleExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2712:1: (lv_feature_22_0= ruleExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2712:1: (lv_feature_22_0= ruleExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2713:3: lv_feature_22_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureExpressionParserRuleCall_1_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6334);
            	    lv_feature_22_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_22_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_23=(Token)match(input,61,FOLLOW_61_in_ruleMemberFeatureCall6346); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMemberFeatureCallAccess().getRightSquareBracketKeyword_1_3_3());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:1: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )?
            	    int alt38=2;
            	    alt38 = dfa38.predict(input);
            	    switch (alt38) {
            	        case 1 :
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')'
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:3: ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' )
            	            {
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2740:1: (lv_explicitOperationCall_24_0= '(' )
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2741:3: lv_explicitOperationCall_24_0= '('
            	            {
            	            lv_explicitOperationCall_24_0=(Token)match(input,62,FOLLOW_62_in_ruleMemberFeatureCall6380); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_24_0, grammarAccess.getMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_3_4_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:2: ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )?
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_EFLOAT)||LA37_0==17||(LA37_0>=22 && LA37_0<=24)||LA37_0==52||(LA37_0>=56 && LA37_0<=60)||LA37_0==62||(LA37_0>=65 && LA37_0<=66)||(LA37_0>=68 && LA37_0<=70)||(LA37_0>=72 && LA37_0<=76)||LA37_0==78||(LA37_0>=81 && LA37_0<=84)) ) {
            	                alt37=1;
            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
            	                    {
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2756:3: lv_arguments_25_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6415);
            	                    lv_arguments_25_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"arguments",
            	                              		lv_arguments_25_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:2: (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
            	                    loop36:
            	                    do {
            	                        int alt36=2;
            	                        int LA36_0 = input.LA(1);

            	                        if ( (LA36_0==20) ) {
            	                            alt36=1;
            	                        }


            	                        switch (alt36) {
            	                    	case 1 :
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:4: otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_26=(Token)match(input,20,FOLLOW_20_in_ruleMemberFeatureCall6428); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_26, grammarAccess.getMemberFeatureCallAccess().getCommaKeyword_1_3_4_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2776:1: ( (lv_arguments_27_0= ruleExpression ) )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
            	                    	    {
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
            	                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2778:3: lv_arguments_27_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall6449);
            	                    	    lv_arguments_27_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"arguments",
            	                    	              		lv_arguments_27_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop36;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_28=(Token)match(input,63,FOLLOW_63_in_ruleMemberFeatureCall6465); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_28, grammarAccess.getMemberFeatureCallAccess().getRightParenthesisKeyword_1_3_4_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleMemberFeatureCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMemberFeatureCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2806:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePrimaryExpression_StartIndex = input.index();
        EObject iv_rulePrimaryExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2807:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2808:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6506);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression6516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2815:1: rulePrimaryExpression returns [EObject current=null] : (this_BlockExpression_0= ruleBlockExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_IfExpression_2= ruleIfExpression | this_WhileExpression_3= ruleWhileExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_ForLoopExpression_5= ruleForLoopExpression | this_ReturnExpression_6= ruleReturnExpression | this_BreakExpression_7= ruleBreakExpression | this_ContinueExpression_8= ruleContinueExpression | this_ThrowExpression_9= ruleThrowExpression | this_TryCatchExpression_10= ruleTryCatchExpression | this_SwitchExpression_11= ruleSwitchExpression | this_FunctionExpression_12= ruleFunctionExpression | this_FeatureCall_13= ruleFeatureCall | this_ConstructorCall_14= ruleConstructorCall | this_Literal_15= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int rulePrimaryExpression_StartIndex = input.index();
        EObject this_BlockExpression_0 = null;

        EObject this_ParenthesizedExpression_1 = null;

        EObject this_IfExpression_2 = null;

        EObject this_WhileExpression_3 = null;

        EObject this_DoWhileExpression_4 = null;

        EObject this_ForLoopExpression_5 = null;

        EObject this_ReturnExpression_6 = null;

        EObject this_BreakExpression_7 = null;

        EObject this_ContinueExpression_8 = null;

        EObject this_ThrowExpression_9 = null;

        EObject this_TryCatchExpression_10 = null;

        EObject this_SwitchExpression_11 = null;

        EObject this_FunctionExpression_12 = null;

        EObject this_FeatureCall_13 = null;

        EObject this_ConstructorCall_14 = null;

        EObject this_Literal_15 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2818:28: ( (this_BlockExpression_0= ruleBlockExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_IfExpression_2= ruleIfExpression | this_WhileExpression_3= ruleWhileExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_ForLoopExpression_5= ruleForLoopExpression | this_ReturnExpression_6= ruleReturnExpression | this_BreakExpression_7= ruleBreakExpression | this_ContinueExpression_8= ruleContinueExpression | this_ThrowExpression_9= ruleThrowExpression | this_TryCatchExpression_10= ruleTryCatchExpression | this_SwitchExpression_11= ruleSwitchExpression | this_FunctionExpression_12= ruleFunctionExpression | this_FeatureCall_13= ruleFeatureCall | this_ConstructorCall_14= ruleConstructorCall | this_Literal_15= ruleLiteral ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2819:1: (this_BlockExpression_0= ruleBlockExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_IfExpression_2= ruleIfExpression | this_WhileExpression_3= ruleWhileExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_ForLoopExpression_5= ruleForLoopExpression | this_ReturnExpression_6= ruleReturnExpression | this_BreakExpression_7= ruleBreakExpression | this_ContinueExpression_8= ruleContinueExpression | this_ThrowExpression_9= ruleThrowExpression | this_TryCatchExpression_10= ruleTryCatchExpression | this_SwitchExpression_11= ruleSwitchExpression | this_FunctionExpression_12= ruleFunctionExpression | this_FeatureCall_13= ruleFeatureCall | this_ConstructorCall_14= ruleConstructorCall | this_Literal_15= ruleLiteral )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2819:1: (this_BlockExpression_0= ruleBlockExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_IfExpression_2= ruleIfExpression | this_WhileExpression_3= ruleWhileExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_ForLoopExpression_5= ruleForLoopExpression | this_ReturnExpression_6= ruleReturnExpression | this_BreakExpression_7= ruleBreakExpression | this_ContinueExpression_8= ruleContinueExpression | this_ThrowExpression_9= ruleThrowExpression | this_TryCatchExpression_10= ruleTryCatchExpression | this_SwitchExpression_11= ruleSwitchExpression | this_FunctionExpression_12= ruleFunctionExpression | this_FeatureCall_13= ruleFeatureCall | this_ConstructorCall_14= ruleConstructorCall | this_Literal_15= ruleLiteral )
            int alt40=16;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2820:2: this_BlockExpression_0= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockExpression_in_rulePrimaryExpression6566);
                    this_BlockExpression_0=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BlockExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2833:2: this_ParenthesizedExpression_1= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression6596);
                    this_ParenthesizedExpression_1=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2846:2: this_IfExpression_2= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpression_in_rulePrimaryExpression6626);
                    this_IfExpression_2=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2859:2: this_WhileExpression_3= ruleWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWhileExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileExpression_in_rulePrimaryExpression6656);
                    this_WhileExpression_3=ruleWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2872:2: this_DoWhileExpression_4= ruleDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDoWhileExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoWhileExpression_in_rulePrimaryExpression6686);
                    this_DoWhileExpression_4=ruleDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoWhileExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2885:2: this_ForLoopExpression_5= ruleForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getForLoopExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForLoopExpression_in_rulePrimaryExpression6716);
                    this_ForLoopExpression_5=ruleForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForLoopExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2898:2: this_ReturnExpression_6= ruleReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReturnExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnExpression_in_rulePrimaryExpression6746);
                    this_ReturnExpression_6=ruleReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2911:2: this_BreakExpression_7= ruleBreakExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBreakExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakExpression_in_rulePrimaryExpression6776);
                    this_BreakExpression_7=ruleBreakExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2924:2: this_ContinueExpression_8= ruleContinueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getContinueExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueExpression_in_rulePrimaryExpression6806);
                    this_ContinueExpression_8=ruleContinueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2937:2: this_ThrowExpression_9= ruleThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThrowExpression_in_rulePrimaryExpression6836);
                    this_ThrowExpression_9=ruleThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2950:2: this_TryCatchExpression_10= ruleTryCatchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTryCatchExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryCatchExpression_in_rulePrimaryExpression6866);
                    this_TryCatchExpression_10=ruleTryCatchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TryCatchExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2963:2: this_SwitchExpression_11= ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSwitchExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchExpression_in_rulePrimaryExpression6896);
                    this_SwitchExpression_11=ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2976:2: this_FunctionExpression_12= ruleFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionExpression_in_rulePrimaryExpression6926);
                    this_FunctionExpression_12=ruleFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2989:2: this_FeatureCall_13= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression6956);
                    this_FeatureCall_13=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3002:2: this_ConstructorCall_14= ruleConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstructorCallParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructorCall_in_rulePrimaryExpression6986);
                    this_ConstructorCall_14=ruleConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstructorCall_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 16 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3015:2: this_Literal_15= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression7016);
                    this_Literal_15=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_15; 
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
            if ( state.backtracking>0 ) { memoize(input, 82, rulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3034:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBlockExpression_StartIndex = input.index();
        EObject iv_ruleBlockExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3035:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3036:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression7051);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression7061); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleBlockExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3043:1: ruleBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;
        int ruleBlockExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3046:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3047:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3047:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3047:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3047:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3048:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBlockExpression7110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3060:1: ( ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_EFLOAT)||LA42_0==17||(LA42_0>=22 && LA42_0<=24)||LA42_0==52||(LA42_0>=56 && LA42_0<=60)||LA42_0==62||(LA42_0>=64 && LA42_0<=66)||(LA42_0>=68 && LA42_0<=70)||(LA42_0>=72 && LA42_0<=76)||LA42_0==78||(LA42_0>=81 && LA42_0<=84)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3060:2: ( (lv_expressions_2_0= ruleExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3060:2: ( (lv_expressions_2_0= ruleExpressionInsideBlock ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:1: (lv_expressions_2_0= ruleExpressionInsideBlock )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3061:1: (lv_expressions_2_0= ruleExpressionInsideBlock )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3062:3: lv_expressions_2_0= ruleExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionInsideBlock_in_ruleBlockExpression7132);
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

            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3078:2: (otherlv_3= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==15) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3078:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBlockExpression7145); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBlockExpression7161); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleBlockExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleExpressionInsideBlock"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3094:1: entryRuleExpressionInsideBlock returns [EObject current=null] : iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF ;
    public final EObject entryRuleExpressionInsideBlock() throws RecognitionException {
        EObject current = null;
        int entryRuleExpressionInsideBlock_StartIndex = input.index();
        EObject iv_ruleExpressionInsideBlock = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3095:2: (iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3096:2: iv_ruleExpressionInsideBlock= ruleExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionInsideBlock_in_entryRuleExpressionInsideBlock7197);
            iv_ruleExpressionInsideBlock=ruleExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionInsideBlock7207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleExpressionInsideBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionInsideBlock"


    // $ANTLR start "ruleExpressionInsideBlock"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3103:1: ruleExpressionInsideBlock returns [EObject current=null] : (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression ) ;
    public final EObject ruleExpressionInsideBlock() throws RecognitionException {
        EObject current = null;
        int ruleExpressionInsideBlock_StartIndex = input.index();
        EObject this_VariableDeclarations_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3106:28: ( (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3107:1: (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3107:1: (this_VariableDeclarations_0= ruleVariableDeclarations | this_Expression_1= ruleExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_EFLOAT)||LA43_0==17||(LA43_0>=22 && LA43_0<=24)||LA43_0==52||(LA43_0>=56 && LA43_0<=60)||LA43_0==62||(LA43_0>=65 && LA43_0<=66)||(LA43_0>=68 && LA43_0<=70)||(LA43_0>=72 && LA43_0<=76)||LA43_0==78||(LA43_0>=81 && LA43_0<=84)) ) {
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3108:2: this_VariableDeclarations_0= ruleVariableDeclarations
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionInsideBlockAccess().getVariableDeclarationsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarations_in_ruleExpressionInsideBlock7257);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3121:2: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionInsideBlockAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionInsideBlock7287);
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleExpressionInsideBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpressionInsideBlock"


    // $ANTLR start "entryRuleVariableDeclarations"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3140:1: entryRuleVariableDeclarations returns [EObject current=null] : iv_ruleVariableDeclarations= ruleVariableDeclarations EOF ;
    public final EObject entryRuleVariableDeclarations() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclarations_StartIndex = input.index();
        EObject iv_ruleVariableDeclarations = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3141:2: (iv_ruleVariableDeclarations= ruleVariableDeclarations EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3142:2: iv_ruleVariableDeclarations= ruleVariableDeclarations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationsRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarations_in_entryRuleVariableDeclarations7322);
            iv_ruleVariableDeclarations=ruleVariableDeclarations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarations7332); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleVariableDeclarations_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarations"


    // $ANTLR start "ruleVariableDeclarations"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3149:1: ruleVariableDeclarations returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleVariableDeclarations() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclarations_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3152:28: ( ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3153:1: ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3153:1: ( () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3153:2: () otherlv_1= 'var' ( (lv_declarations_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )*
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3153:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3154:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationsAccess().getVariableDeclarationsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleVariableDeclarations7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationsAccess().getVarKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3166:1: ( (lv_declarations_2_0= ruleVariableDeclaration ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3167:1: (lv_declarations_2_0= ruleVariableDeclaration )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3167:1: (lv_declarations_2_0= ruleVariableDeclaration )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3168:3: lv_declarations_2_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationsAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations7402);
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

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3184:2: (otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==20) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3184:4: otherlv_3= ',' ( (lv_declarations_4_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariableDeclarations7415); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationsAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3188:1: ( (lv_declarations_4_0= ruleVariableDeclaration ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3189:1: (lv_declarations_4_0= ruleVariableDeclaration )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3189:1: (lv_declarations_4_0= ruleVariableDeclaration )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3190:3: lv_declarations_4_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationsAccess().getDeclarationsVariableDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations7436);
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
            	    break loop44;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleVariableDeclarations_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarations"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3214:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclaration_StartIndex = input.index();
        EObject iv_ruleVariableDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3215:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3216:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration7474);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration7484); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3223:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclaration_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3226:28: ( ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3227:1: ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3227:1: ( () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3227:2: () ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )? (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3227:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3228:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3236:2: ( (lv_name_1_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3237:1: (lv_name_1_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3237:1: (lv_name_1_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3238:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleVariableDeclaration7542);
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

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3254:2: (otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3254:4: otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleVariableDeclaration7555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getColonKeyword_2_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3258:1: ( (lv_type_3_0= ruleTypeReference ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3259:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3259:1: (lv_type_3_0= ruleTypeReference )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3260:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleVariableDeclaration7576);
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

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3276:4: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3276:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleVariableDeclaration7591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3280:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3281:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3281:1: (lv_expression_5_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3282:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration7612);
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableMemberDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3306:1: entryRuleVariableMemberDeclaration returns [EObject current=null] : iv_ruleVariableMemberDeclaration= ruleVariableMemberDeclaration EOF ;
    public final EObject entryRuleVariableMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableMemberDeclaration_StartIndex = input.index();
        EObject iv_ruleVariableMemberDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3307:2: (iv_ruleVariableMemberDeclaration= ruleVariableMemberDeclaration EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3308:2: iv_ruleVariableMemberDeclaration= ruleVariableMemberDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableMemberDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableMemberDeclaration_in_entryRuleVariableMemberDeclaration7650);
            iv_ruleVariableMemberDeclaration=ruleVariableMemberDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableMemberDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableMemberDeclaration7660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleVariableMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableMemberDeclaration"


    // $ANTLR start "ruleVariableMemberDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3315:1: ruleVariableMemberDeclaration returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeReference ) ) (otherlv_5= ';' )? ) ;
    public final EObject ruleVariableMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleVariableMemberDeclaration_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3318:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeReference ) ) (otherlv_5= ';' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3319:1: ( () otherlv_1= 'var' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeReference ) ) (otherlv_5= ';' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3319:1: ( () otherlv_1= 'var' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeReference ) ) (otherlv_5= ';' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3319:2: () otherlv_1= 'var' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeReference ) ) (otherlv_5= ';' )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3319:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3320:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableMemberDeclarationAccess().getVariableMemberDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleVariableMemberDeclaration7709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableMemberDeclarationAccess().getVarKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3332:1: ( (lv_name_2_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3333:1: (lv_name_2_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3333:1: (lv_name_2_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3334:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableMemberDeclarationAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleVariableMemberDeclaration7730);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableMemberDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleVariableMemberDeclaration7742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableMemberDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3354:1: ( (lv_type_4_0= ruleTypeReference ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3355:1: (lv_type_4_0= ruleTypeReference )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3355:1: (lv_type_4_0= ruleTypeReference )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3356:3: lv_type_4_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableMemberDeclarationAccess().getTypeTypeReferenceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleVariableMemberDeclaration7763);
            lv_type_4_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableMemberDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3372:2: (otherlv_5= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3372:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleVariableMemberDeclaration7776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableMemberDeclarationAccess().getSemicolonKeyword_5());
                          
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleVariableMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableMemberDeclaration"


    // $ANTLR start "entryRuleFunctionMemberDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3384:1: entryRuleFunctionMemberDeclaration returns [EObject current=null] : iv_ruleFunctionMemberDeclaration= ruleFunctionMemberDeclaration EOF ;
    public final EObject entryRuleFunctionMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionMemberDeclaration_StartIndex = input.index();
        EObject iv_ruleFunctionMemberDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3385:2: (iv_ruleFunctionMemberDeclaration= ruleFunctionMemberDeclaration EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3386:2: iv_ruleFunctionMemberDeclaration= ruleFunctionMemberDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionMemberDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionMemberDeclaration_in_entryRuleFunctionMemberDeclaration7814);
            iv_ruleFunctionMemberDeclaration=ruleFunctionMemberDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionMemberDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionMemberDeclaration7824); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleFunctionMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionMemberDeclaration"


    // $ANTLR start "ruleFunctionMemberDeclaration"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3393:1: ruleFunctionMemberDeclaration returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_10_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleFunctionMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleFunctionMemberDeclaration_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3396:28: ( ( () otherlv_1= 'function' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_10_0= ruleBlockExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3397:1: ( () otherlv_1= 'function' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_10_0= ruleBlockExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3397:1: ( () otherlv_1= 'function' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_10_0= ruleBlockExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3397:2: () otherlv_1= 'function' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_10_0= ruleBlockExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3397:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3398:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionMemberDeclarationAccess().getFunctionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleFunctionMemberDeclaration7873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionMemberDeclarationAccess().getFunctionKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3410:1: ( (lv_name_2_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3411:1: (lv_name_2_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3411:1: (lv_name_2_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3412:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemberDeclarationAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFunctionMemberDeclaration7894);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionMemberDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleFunctionMemberDeclaration7906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionMemberDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3432:1: ( ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3432:2: ( (lv_parameters_4_0= ruleFormalParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )*
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3432:2: ( (lv_parameters_4_0= ruleFormalParameter ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3433:1: (lv_parameters_4_0= ruleFormalParameter )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3433:1: (lv_parameters_4_0= ruleFormalParameter )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3434:3: lv_parameters_4_0= ruleFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionMemberDeclarationAccess().getParametersFormalParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalParameter_in_ruleFunctionMemberDeclaration7928);
                    lv_parameters_4_0=ruleFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionMemberDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"FormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3450:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==20) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3450:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleFormalParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleFunctionMemberDeclaration7941); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionMemberDeclarationAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3454:1: ( (lv_parameters_6_0= ruleFormalParameter ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3455:1: (lv_parameters_6_0= ruleFormalParameter )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3455:1: (lv_parameters_6_0= ruleFormalParameter )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3456:3: lv_parameters_6_0= ruleFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionMemberDeclarationAccess().getParametersFormalParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFormalParameter_in_ruleFunctionMemberDeclaration7962);
                    	    lv_parameters_6_0=ruleFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionMemberDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"FormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleFunctionMemberDeclaration7978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionMemberDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3476:1: (otherlv_8= ':' ( ( ruleQualifiedName ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3476:3: otherlv_8= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleFunctionMemberDeclaration7991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionMemberDeclarationAccess().getColonKeyword_6_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3480:1: ( ( ruleQualifiedName ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3481:1: ( ruleQualifiedName )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3481:1: ( ruleQualifiedName )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3482:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionMemberDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionMemberDeclarationAccess().getReturnTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionMemberDeclaration8018);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3498:4: ( (lv_body_10_0= ruleBlockExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3499:1: (lv_body_10_0= ruleBlockExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3499:1: (lv_body_10_0= ruleBlockExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3500:3: lv_body_10_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionMemberDeclarationAccess().getBodyBlockExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_ruleFunctionMemberDeclaration8041);
            lv_body_10_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionMemberDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_10_0, 
                      		"BlockExpression");
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleFunctionMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionMemberDeclaration"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3524:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleParenthesizedExpression_StartIndex = input.index();
        EObject iv_ruleParenthesizedExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3525:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3526:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression8077);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression8087); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleParenthesizedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3533:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;
        int ruleParenthesizedExpression_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3536:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3537:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3537:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3537:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleParenthesizedExpression8124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression8149);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleParenthesizedExpression8160); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleParenthesizedExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleIfExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3565:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleIfExpression_StartIndex = input.index();
        EObject iv_ruleIfExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3566:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3567:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression8196);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression8206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleIfExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3574:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;
        int ruleIfExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3577:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3578:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3578:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3578:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3578:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3579:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleIfExpression8255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleIfExpression8267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3595:1: ( (lv_if_3_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3596:1: (lv_if_3_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3596:1: (lv_if_3_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3597:3: lv_if_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression8288);
            lv_if_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleIfExpression8300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3617:1: ( (lv_then_5_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3618:1: (lv_then_5_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3618:1: (lv_then_5_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3619:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression8321);
            lv_then_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==67) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred107_InternalHaxe()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleIfExpression8342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3640:2: ( (lv_else_7_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3641:1: (lv_else_7_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3641:1: (lv_else_7_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3642:3: lv_else_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression8364);
                    lv_else_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleIfExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleWhileExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3666:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleWhileExpression_StartIndex = input.index();
        EObject iv_ruleWhileExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3667:2: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3668:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression8402);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileExpression8412); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleWhileExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileExpression"


    // $ANTLR start "ruleWhileExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3675:1: ruleWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleExpression ) ) ) ;
    public final EObject ruleWhileExpression() throws RecognitionException {
        EObject current = null;
        int ruleWhileExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3678:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3679:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3679:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3679:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3679:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3680:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWhileExpressionAccess().getWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleWhileExpression8461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleWhileExpression8473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3696:1: ( (lv_predicate_3_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3697:1: (lv_predicate_3_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3697:1: (lv_predicate_3_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3698:3: lv_predicate_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getPredicateExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileExpression8494);
            lv_predicate_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleWhileExpression8506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3718:1: ( (lv_body_5_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3719:1: (lv_body_5_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3719:1: (lv_body_5_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3720:3: lv_body_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getBodyExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileExpression8527);
            lv_body_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleWhileExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhileExpression"


    // $ANTLR start "entryRuleDoWhileExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3744:1: entryRuleDoWhileExpression returns [EObject current=null] : iv_ruleDoWhileExpression= ruleDoWhileExpression EOF ;
    public final EObject entryRuleDoWhileExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleDoWhileExpression_StartIndex = input.index();
        EObject iv_ruleDoWhileExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3745:2: (iv_ruleDoWhileExpression= ruleDoWhileExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3746:2: iv_ruleDoWhileExpression= ruleDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDoWhileExpression_in_entryRuleDoWhileExpression8563);
            iv_ruleDoWhileExpression=ruleDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhileExpression8573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleDoWhileExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDoWhileExpression"


    // $ANTLR start "ruleDoWhileExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3753:1: ruleDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleDoWhileExpression() throws RecognitionException {
        EObject current = null;
        int ruleDoWhileExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3756:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3757:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3757:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleExpression ) ) otherlv_6= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3757:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3757:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3758:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDoWhileExpressionAccess().getDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleDoWhileExpression8622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3770:1: ( (lv_body_2_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3771:1: (lv_body_2_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3771:1: (lv_body_2_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3772:3: lv_body_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDoWhileExpression8643);
            lv_body_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleDoWhileExpression8655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleDoWhileExpression8667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3796:1: ( (lv_predicate_5_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3797:1: (lv_predicate_5_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3797:1: (lv_predicate_5_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3798:3: lv_predicate_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileExpressionAccess().getPredicateExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDoWhileExpression8688);
            lv_predicate_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleDoWhileExpression8700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleDoWhileExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDoWhileExpression"


    // $ANTLR start "entryRuleForLoopExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3826:1: entryRuleForLoopExpression returns [EObject current=null] : iv_ruleForLoopExpression= ruleForLoopExpression EOF ;
    public final EObject entryRuleForLoopExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleForLoopExpression_StartIndex = input.index();
        EObject iv_ruleForLoopExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3827:2: (iv_ruleForLoopExpression= ruleForLoopExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3828:2: iv_ruleForLoopExpression= ruleForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForLoopExpression_in_entryRuleForLoopExpression8736);
            iv_ruleForLoopExpression=ruleForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForLoopExpression8746); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleForLoopExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoopExpression"


    // $ANTLR start "ruleForLoopExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3835:1: ruleForLoopExpression returns [EObject current=null] : ( () ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ( (lv_body_7_0= ruleExpression ) ) ) ;
    public final EObject ruleForLoopExpression() throws RecognitionException {
        EObject current = null;
        int ruleForLoopExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3838:28: ( ( () ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ( (lv_body_7_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3839:1: ( () ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ( (lv_body_7_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3839:1: ( () ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ( (lv_body_7_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3839:2: () ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ( (lv_body_7_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3839:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3840:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForLoopExpressionAccess().getForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3848:2: ( ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3848:3: ( ( 'for' '(' ( ( ruleFormalParameter ) ) 'in' ( ( ruleExpression ) ) ')' ) )=> (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3860:5: (otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3860:7: otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleFormalParameter ) ) otherlv_4= 'in' ( (lv_forExpression_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleForLoopExpression8836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForLoopExpressionAccess().getForKeyword_1_0_0());
                  
            }
            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleForLoopExpression8848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForLoopExpressionAccess().getLeftParenthesisKeyword_1_0_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3868:1: ( (lv_declaredParam_3_0= ruleFormalParameter ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3869:1: (lv_declaredParam_3_0= ruleFormalParameter )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3869:1: (lv_declaredParam_3_0= ruleFormalParameter )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3870:3: lv_declaredParam_3_0= ruleFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopExpressionAccess().getDeclaredParamFormalParameterParserRuleCall_1_0_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalParameter_in_ruleForLoopExpression8869);
            lv_declaredParam_3_0=ruleFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"FormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleForLoopExpression8881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForLoopExpressionAccess().getInKeyword_1_0_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3890:1: ( (lv_forExpression_5_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3891:1: (lv_forExpression_5_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3891:1: (lv_forExpression_5_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3892:3: lv_forExpression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopExpressionAccess().getForExpressionExpressionParserRuleCall_1_0_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForLoopExpression8902);
            lv_forExpression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleForLoopExpression8914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForLoopExpressionAccess().getRightParenthesisKeyword_1_0_5());
                  
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3912:3: ( (lv_body_7_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3913:1: (lv_body_7_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3913:1: (lv_body_7_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3914:3: lv_body_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForLoopExpression8937);
            lv_body_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleForLoopExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForLoopExpression"


    // $ANTLR start "entryRuleReturnExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3938:1: entryRuleReturnExpression returns [EObject current=null] : iv_ruleReturnExpression= ruleReturnExpression EOF ;
    public final EObject entryRuleReturnExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleReturnExpression_StartIndex = input.index();
        EObject iv_ruleReturnExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3939:2: (iv_ruleReturnExpression= ruleReturnExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3940:2: iv_ruleReturnExpression= ruleReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleReturnExpression_in_entryRuleReturnExpression8973);
            iv_ruleReturnExpression=ruleReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnExpression8983); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleReturnExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnExpression"


    // $ANTLR start "ruleReturnExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3947:1: ruleReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )? ) ;
    public final EObject ruleReturnExpression() throws RecognitionException {
        EObject current = null;
        int ruleReturnExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3950:28: ( ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3951:1: ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3951:1: ( () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3951:2: () otherlv_1= 'return' ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3951:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3952:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnExpressionAccess().getReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleReturnExpression9032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3964:1: ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3964:2: ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3969:1: (lv_expression_2_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3970:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnExpression9063);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleReturnExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReturnExpression"


    // $ANTLR start "entryRuleBreakExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3994:1: entryRuleBreakExpression returns [EObject current=null] : iv_ruleBreakExpression= ruleBreakExpression EOF ;
    public final EObject entryRuleBreakExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBreakExpression_StartIndex = input.index();
        EObject iv_ruleBreakExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3995:2: (iv_ruleBreakExpression= ruleBreakExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3996:2: iv_ruleBreakExpression= ruleBreakExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBreakExpression_in_entryRuleBreakExpression9100);
            iv_ruleBreakExpression=ruleBreakExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakExpression9110); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleBreakExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakExpression"


    // $ANTLR start "ruleBreakExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4003:1: ruleBreakExpression returns [EObject current=null] : ( () otherlv_1= 'break' ) ;
    public final EObject ruleBreakExpression() throws RecognitionException {
        EObject current = null;
        int ruleBreakExpression_StartIndex = input.index();
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4006:28: ( ( () otherlv_1= 'break' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4007:1: ( () otherlv_1= 'break' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4007:1: ( () otherlv_1= 'break' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4007:2: () otherlv_1= 'break'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4007:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4008:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakExpressionAccess().getBreakExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleBreakExpression9159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakExpressionAccess().getBreakKeyword_1());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleBreakExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreakExpression"


    // $ANTLR start "entryRuleContinueExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4028:1: entryRuleContinueExpression returns [EObject current=null] : iv_ruleContinueExpression= ruleContinueExpression EOF ;
    public final EObject entryRuleContinueExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleContinueExpression_StartIndex = input.index();
        EObject iv_ruleContinueExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4029:2: (iv_ruleContinueExpression= ruleContinueExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4030:2: iv_ruleContinueExpression= ruleContinueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleContinueExpression_in_entryRuleContinueExpression9195);
            iv_ruleContinueExpression=ruleContinueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueExpression9205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleContinueExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueExpression"


    // $ANTLR start "ruleContinueExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4037:1: ruleContinueExpression returns [EObject current=null] : ( () otherlv_1= 'continue' ) ;
    public final EObject ruleContinueExpression() throws RecognitionException {
        EObject current = null;
        int ruleContinueExpression_StartIndex = input.index();
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4040:28: ( ( () otherlv_1= 'continue' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4041:1: ( () otherlv_1= 'continue' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4041:1: ( () otherlv_1= 'continue' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4041:2: () otherlv_1= 'continue'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4041:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4042:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueExpressionAccess().getBreakExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleContinueExpression9254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueExpressionAccess().getContinueKeyword_1());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleContinueExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleContinueExpression"


    // $ANTLR start "entryRuleThrowExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4062:1: entryRuleThrowExpression returns [EObject current=null] : iv_ruleThrowExpression= ruleThrowExpression EOF ;
    public final EObject entryRuleThrowExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleThrowExpression_StartIndex = input.index();
        EObject iv_ruleThrowExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4063:2: (iv_ruleThrowExpression= ruleThrowExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4064:2: iv_ruleThrowExpression= ruleThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleThrowExpression_in_entryRuleThrowExpression9290);
            iv_ruleThrowExpression=ruleThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrowExpression9300); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleThrowExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleThrowExpression"


    // $ANTLR start "ruleThrowExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4071:1: ruleThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleThrowExpression() throws RecognitionException {
        EObject current = null;
        int ruleThrowExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4074:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4075:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4075:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4075:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4075:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4076:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getThrowExpressionAccess().getThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleThrowExpression9349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4088:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4089:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4089:1: (lv_expression_2_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4090:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getThrowExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleThrowExpression9370);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleThrowExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleThrowExpression"


    // $ANTLR start "entryRuleTryCatchExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4114:1: entryRuleTryCatchExpression returns [EObject current=null] : iv_ruleTryCatchExpression= ruleTryCatchExpression EOF ;
    public final EObject entryRuleTryCatchExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTryCatchExpression_StartIndex = input.index();
        EObject iv_ruleTryCatchExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4115:2: (iv_ruleTryCatchExpression= ruleTryCatchExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4116:2: iv_ruleTryCatchExpression= ruleTryCatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryCatchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTryCatchExpression_in_entryRuleTryCatchExpression9406);
            iv_ruleTryCatchExpression=ruleTryCatchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryCatchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryCatchExpression9416); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleTryCatchExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTryCatchExpression"


    // $ANTLR start "ruleTryCatchExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4123:1: ruleTryCatchExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleExpression ) ) ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+ ) ;
    public final EObject ruleTryCatchExpression() throws RecognitionException {
        EObject current = null;
        int ruleTryCatchExpression_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4126:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleExpression ) ) ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+ ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4127:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleExpression ) ) ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+ )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4127:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleExpression ) ) ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+ )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4127:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleExpression ) ) ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4127:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4128:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTryCatchExpressionAccess().getTryCatchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleTryCatchExpression9465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTryCatchExpressionAccess().getTryKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4140:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4141:1: (lv_expression_2_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4141:1: (lv_expression_2_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4142:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTryCatchExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTryCatchExpression9486);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTryCatchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4158:2: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==77) ) {
                    int LA53_2 = input.LA(2);

                    if ( (synpred110_InternalHaxe()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4158:3: ( 'catch' )=> (lv_catchClauses_3_0= ruleCatchClause )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4160:1: (lv_catchClauses_3_0= ruleCatchClause )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4161:3: lv_catchClauses_3_0= ruleCatchClause
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryCatchExpressionAccess().getCatchClausesCatchClauseParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCatchClause_in_ruleTryCatchExpression9514);
            	    lv_catchClauses_3_0=ruleCatchClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTryCatchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catchClauses",
            	              		lv_catchClauses_3_0, 
            	              		"CatchClause");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleTryCatchExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTryCatchExpression"


    // $ANTLR start "entryRuleCatchClause"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4185:1: entryRuleCatchClause returns [EObject current=null] : iv_ruleCatchClause= ruleCatchClause EOF ;
    public final EObject entryRuleCatchClause() throws RecognitionException {
        EObject current = null;
        int entryRuleCatchClause_StartIndex = input.index();
        EObject iv_ruleCatchClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4186:2: (iv_ruleCatchClause= ruleCatchClause EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4187:2: iv_ruleCatchClause= ruleCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleCatchClause_in_entryRuleCatchClause9551);
            iv_ruleCatchClause=ruleCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCatchClause9561); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, entryRuleCatchClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCatchClause"


    // $ANTLR start "ruleCatchClause"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4194:1: ruleCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleCatchClause() throws RecognitionException {
        EObject current = null;
        int ruleCatchClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4197:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4198:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4198:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4198:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4198:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4198:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleCatchClause9606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleCatchClause9619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4207:1: ( (lv_declaredParam_2_0= ruleFormalParameter ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4208:1: (lv_declaredParam_2_0= ruleFormalParameter )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4208:1: (lv_declaredParam_2_0= ruleFormalParameter )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4209:3: lv_declaredParam_2_0= ruleFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCatchClauseAccess().getDeclaredParamFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalParameter_in_ruleCatchClause9640);
            lv_declaredParam_2_0=ruleFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleCatchClause9652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4229:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4230:1: (lv_expression_4_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4230:1: (lv_expression_4_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4231:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCatchClauseAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCatchClause9673);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 116, ruleCatchClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCatchClause"


    // $ANTLR start "entryRuleSwitchExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4255:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleSwitchExpression_StartIndex = input.index();
        EObject iv_ruleSwitchExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4256:2: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4257:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression9709);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchExpression9719); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, entryRuleSwitchExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4264:1: ruleSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_switch_2_0= ruleExpression ) ) otherlv_3= '{' ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+ (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSwitchExpression() throws RecognitionException {
        EObject current = null;
        int ruleSwitchExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_switch_2_0 = null;

        EObject lv_cases_4_0 = null;

        EObject lv_default_7_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4267:28: ( ( () otherlv_1= 'switch' ( (lv_switch_2_0= ruleExpression ) ) otherlv_3= '{' ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+ (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )? otherlv_8= '}' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4268:1: ( () otherlv_1= 'switch' ( (lv_switch_2_0= ruleExpression ) ) otherlv_3= '{' ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+ (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )? otherlv_8= '}' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4268:1: ( () otherlv_1= 'switch' ( (lv_switch_2_0= ruleExpression ) ) otherlv_3= '{' ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+ (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )? otherlv_8= '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4268:2: () otherlv_1= 'switch' ( (lv_switch_2_0= ruleExpression ) ) otherlv_3= '{' ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+ (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )? otherlv_8= '}'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4268:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4269:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchExpressionAccess().getSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleSwitchExpression9768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4281:1: ( (lv_switch_2_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4282:1: (lv_switch_2_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4282:1: (lv_switch_2_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4283:3: lv_switch_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getSwitchExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression9789);
            lv_switch_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSwitchExpression9801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4303:1: ( ( 'case' )=> (lv_cases_4_0= ruleCasePart ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==80) && (synpred112_InternalHaxe())) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4303:2: ( 'case' )=> (lv_cases_4_0= ruleCasePart )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4305:1: (lv_cases_4_0= ruleCasePart )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4306:3: lv_cases_4_0= ruleCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCasesCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCasePart_in_ruleSwitchExpression9829);
            	    lv_cases_4_0=ruleCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_4_0, 
            	              		"CasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4322:3: (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==79) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4322:5: otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleSwitchExpression9843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleSwitchExpression9855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4330:1: ( (lv_default_7_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4331:1: (lv_default_7_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4331:1: (lv_default_7_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4332:3: lv_default_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression9876);
                    lv_default_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSwitchExpression9890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleSwitchExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleCasePart"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4360:1: entryRuleCasePart returns [EObject current=null] : iv_ruleCasePart= ruleCasePart EOF ;
    public final EObject entryRuleCasePart() throws RecognitionException {
        EObject current = null;
        int entryRuleCasePart_StartIndex = input.index();
        EObject iv_ruleCasePart = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4361:2: (iv_ruleCasePart= ruleCasePart EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4362:2: iv_ruleCasePart= ruleCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleCasePart_in_entryRuleCasePart9926);
            iv_ruleCasePart=ruleCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCasePart9936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, entryRuleCasePart_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCasePart"


    // $ANTLR start "ruleCasePart"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4369:1: ruleCasePart returns [EObject current=null] : ( ( ( 'case' )=>otherlv_0= 'case' ) ( (lv_cases_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )? otherlv_4= ':' ( (lv_then_5_0= ruleExpression ) ) ) ;
    public final EObject ruleCasePart() throws RecognitionException {
        EObject current = null;
        int ruleCasePart_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cases_1_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_then_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4372:28: ( ( ( ( 'case' )=>otherlv_0= 'case' ) ( (lv_cases_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )? otherlv_4= ':' ( (lv_then_5_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4373:1: ( ( ( 'case' )=>otherlv_0= 'case' ) ( (lv_cases_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )? otherlv_4= ':' ( (lv_then_5_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4373:1: ( ( ( 'case' )=>otherlv_0= 'case' ) ( (lv_cases_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )? otherlv_4= ':' ( (lv_then_5_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4373:2: ( ( 'case' )=>otherlv_0= 'case' ) ( (lv_cases_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )? otherlv_4= ':' ( (lv_then_5_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4373:2: ( ( 'case' )=>otherlv_0= 'case' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4373:3: ( 'case' )=>otherlv_0= 'case'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleCasePart9981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCasePartAccess().getCaseKeyword_0());
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4378:2: ( (lv_cases_1_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4379:1: (lv_cases_1_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4379:1: (lv_cases_1_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4380:3: lv_cases_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCasePartAccess().getCasesExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCasePart10003);
            lv_cases_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCasePartRule());
              	        }
                     		add(
                     			current, 
                     			"cases",
                      		lv_cases_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4396:2: (otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4396:4: otherlv_2= ',' ( (lv_cases_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCasePart10016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCasePartAccess().getCommaKeyword_2_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4400:1: ( (lv_cases_3_0= ruleExpression ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4401:1: (lv_cases_3_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4401:1: (lv_cases_3_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4402:3: lv_cases_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCasePartAccess().getCasesExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCasePart10037);
                    lv_cases_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCasePartRule());
                      	        }
                             		add(
                             			current, 
                             			"cases",
                              		lv_cases_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCasePart10051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCasePartAccess().getColonKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4422:1: ( (lv_then_5_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4423:1: (lv_then_5_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4423:1: (lv_then_5_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4424:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCasePartAccess().getThenExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCasePart10072);
            lv_then_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleCasePart_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCasePart"


    // $ANTLR start "entryRuleFunctionExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4448:1: entryRuleFunctionExpression returns [EObject current=null] : iv_ruleFunctionExpression= ruleFunctionExpression EOF ;
    public final EObject entryRuleFunctionExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionExpression_StartIndex = input.index();
        EObject iv_ruleFunctionExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4449:2: (iv_ruleFunctionExpression= ruleFunctionExpression EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4450:2: iv_ruleFunctionExpression= ruleFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression10108);
            iv_ruleFunctionExpression=ruleFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionExpression10118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, entryRuleFunctionExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionExpression"


    // $ANTLR start "ruleFunctionExpression"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4457:1: ruleFunctionExpression returns [EObject current=null] : ( () otherlv_1= 'function' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_9_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleFunctionExpression() throws RecognitionException {
        EObject current = null;
        int ruleFunctionExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4460:28: ( ( () otherlv_1= 'function' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_9_0= ruleBlockExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4461:1: ( () otherlv_1= 'function' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_9_0= ruleBlockExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4461:1: ( () otherlv_1= 'function' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_9_0= ruleBlockExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4461:2: () otherlv_1= 'function' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? ( (lv_body_9_0= ruleBlockExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4461:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4462:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionExpressionAccess().getFunctionExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleFunctionExpression10167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionExpressionAccess().getFunctionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleFunctionExpression10179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4478:1: ( ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4478:2: ( (lv_parameters_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )*
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4478:2: ( (lv_parameters_3_0= ruleFormalParameter ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4479:1: (lv_parameters_3_0= ruleFormalParameter )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4479:1: (lv_parameters_3_0= ruleFormalParameter )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4480:3: lv_parameters_3_0= ruleFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getParametersFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalParameter_in_ruleFunctionExpression10201);
                    lv_parameters_3_0=ruleFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"FormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4496:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==20) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4496:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleFunctionExpression10214); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4500:1: ( (lv_parameters_5_0= ruleFormalParameter ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4501:1: (lv_parameters_5_0= ruleFormalParameter )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4501:1: (lv_parameters_5_0= ruleFormalParameter )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4502:3: lv_parameters_5_0= ruleFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getParametersFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFormalParameter_in_ruleFunctionExpression10235);
                    	    lv_parameters_5_0=ruleFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"FormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleFunctionExpression10251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4522:1: (otherlv_7= ':' ( ( ruleQualifiedName ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4522:3: otherlv_7= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleFunctionExpression10264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionExpressionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4526:1: ( ( ruleQualifiedName ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4527:1: ( ruleQualifiedName )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4527:1: ( ruleQualifiedName )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4528:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getReturnTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionExpression10291);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4544:4: ( (lv_body_9_0= ruleBlockExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4545:1: (lv_body_9_0= ruleBlockExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4545:1: (lv_body_9_0= ruleBlockExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4546:3: lv_body_9_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getBodyBlockExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockExpression_in_ruleFunctionExpression10314);
            lv_body_9_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"BlockExpression");
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleFunctionExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4574:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;
        int entryRuleFeatureCall_StartIndex = input.index();
        EObject iv_ruleFeatureCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4575:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4576:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall10354);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall10364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, entryRuleFeatureCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4583:1: ruleFeatureCall returns [EObject current=null] : ( () ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;
        int ruleFeatureCall_StartIndex = input.index();
        Token lv_explicitOperationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4586:28: ( ( () ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )? ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4587:1: ( () ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4587:1: ( () ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4587:2: () ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4587:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4588:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeatureCallAccess().getFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4596:2: ( ( ruleFeatureID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4597:1: ( ruleFeatureID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4597:1: ( ruleFeatureID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4598:3: ruleFeatureID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getFeatureFeatureCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureID_in_ruleFeatureCall10428);
            ruleFeatureID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:4: ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4621:1: (lv_explicitOperationCall_2_0= '(' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4622:3: lv_explicitOperationCall_2_0= '('
                    {
                    lv_explicitOperationCall_2_0=(Token)match(input,62,FOLLOW_62_in_ruleFeatureCall10462); if (state.failed) return current;
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

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4635:2: ( (lv_arguments_3_0= ruleExpression ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_EFLOAT)||LA60_0==17||(LA60_0>=22 && LA60_0<=24)||LA60_0==52||(LA60_0>=56 && LA60_0<=60)||LA60_0==62||(LA60_0>=65 && LA60_0<=66)||(LA60_0>=68 && LA60_0<=70)||(LA60_0>=72 && LA60_0<=76)||LA60_0==78||(LA60_0>=81 && LA60_0<=84)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4636:1: (lv_arguments_3_0= ruleExpression )
                            {
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4636:1: (lv_arguments_3_0= ruleExpression )
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4637:3: lv_arguments_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10496);
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
                            break;

                    }

                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4653:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==20) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4653:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleFeatureCall10510); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4657:1: ( (lv_arguments_5_0= ruleExpression ) )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4658:1: (lv_arguments_5_0= ruleExpression )
                    	    {
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4658:1: (lv_arguments_5_0= ruleExpression )
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4659:3: lv_arguments_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10531);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleFeatureCall10545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_2_3());
                          
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
            if ( state.backtracking>0 ) { memoize(input, 124, ruleFeatureCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleConstructorCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4687:1: entryRuleConstructorCall returns [EObject current=null] : iv_ruleConstructorCall= ruleConstructorCall EOF ;
    public final EObject entryRuleConstructorCall() throws RecognitionException {
        EObject current = null;
        int entryRuleConstructorCall_StartIndex = input.index();
        EObject iv_ruleConstructorCall = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4688:2: (iv_ruleConstructorCall= ruleConstructorCall EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4689:2: iv_ruleConstructorCall= ruleConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleConstructorCall_in_entryRuleConstructorCall10583);
            iv_ruleConstructorCall=ruleConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorCall10593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, entryRuleConstructorCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructorCall"


    // $ANTLR start "ruleConstructorCall"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4696:1: ruleConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleConstructorCall() throws RecognitionException {
        EObject current = null;
        int ruleConstructorCall_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4699:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* otherlv_7= ')' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4700:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* otherlv_7= ')' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4700:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* otherlv_7= ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4700:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* otherlv_7= ')'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4700:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4701:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstructorCallAccess().getConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleConstructorCall10642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4713:1: ( ( ruleQualifiedName ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4714:1: ( ruleQualifiedName )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4714:1: ( ruleQualifiedName )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4715:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorCallAccess().getConstructorTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConstructorCall10669);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleConstructorCall10681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstructorCallAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4735:1: ( (lv_arguments_4_0= ruleExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_EFLOAT)||LA63_0==17||(LA63_0>=22 && LA63_0<=24)||LA63_0==52||(LA63_0>=56 && LA63_0<=60)||LA63_0==62||(LA63_0>=65 && LA63_0<=66)||(LA63_0>=68 && LA63_0<=70)||(LA63_0>=72 && LA63_0<=76)||LA63_0==78||(LA63_0>=81 && LA63_0<=84)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4736:1: (lv_arguments_4_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4736:1: (lv_arguments_4_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4737:3: lv_arguments_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorCallAccess().getArgumentsExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConstructorCall10702);
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
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4753:3: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==20) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4753:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleConstructorCall10716); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getConstructorCallAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4757:1: ( (lv_arguments_6_0= ruleExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4758:1: (lv_arguments_6_0= ruleExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4758:1: (lv_arguments_6_0= ruleExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4759:3: lv_arguments_6_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructorCallAccess().getArgumentsExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleConstructorCall10737);
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
            	    break loop64;
                }
            } while (true);

            otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleConstructorCall10751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConstructorCallAccess().getRightParenthesisKeyword_6());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 126, ruleConstructorCall_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConstructorCall"


    // $ANTLR start "entryRuleLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4787:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleLiteral_StartIndex = input.index();
        EObject iv_ruleLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4788:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4789:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral10787);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral10797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, entryRuleLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4796:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NullLiteral_1= ruleNullLiteral | this_StringLiteral_2= ruleStringLiteral | this_FloatLiteral_3= ruleFloatLiteral | this_IntLiteral_4= ruleIntLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral | this_ObjectLiteral_7= ruleObjectLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;
        int ruleLiteral_StartIndex = input.index();
        EObject this_BooleanLiteral_0 = null;

        EObject this_NullLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_FloatLiteral_3 = null;

        EObject this_IntLiteral_4 = null;

        EObject this_RegularExpressionLiteral_5 = null;

        EObject this_ArrayLiteral_6 = null;

        EObject this_ObjectLiteral_7 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4799:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NullLiteral_1= ruleNullLiteral | this_StringLiteral_2= ruleStringLiteral | this_FloatLiteral_3= ruleFloatLiteral | this_IntLiteral_4= ruleIntLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral | this_ObjectLiteral_7= ruleObjectLiteral ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4800:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NullLiteral_1= ruleNullLiteral | this_StringLiteral_2= ruleStringLiteral | this_FloatLiteral_3= ruleFloatLiteral | this_IntLiteral_4= ruleIntLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral | this_ObjectLiteral_7= ruleObjectLiteral )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4800:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NullLiteral_1= ruleNullLiteral | this_StringLiteral_2= ruleStringLiteral | this_FloatLiteral_3= ruleFloatLiteral | this_IntLiteral_4= ruleIntLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral | this_ObjectLiteral_7= ruleObjectLiteral )
            int alt65=8;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4801:2: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral10847);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4814:2: this_NullLiteral_1= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral10877);
                    this_NullLiteral_1=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4827:2: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral10907);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4840:2: this_FloatLiteral_3= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral10937);
                    this_FloatLiteral_3=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4853:2: this_IntLiteral_4= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral10967);
                    this_IntLiteral_4=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4866:2: this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRegularExpressionLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularExpressionLiteral_in_ruleLiteral10997);
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4879:2: this_ArrayLiteral_6= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral11027);
                    this_ArrayLiteral_6=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4892:2: this_ObjectLiteral_7= ruleObjectLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getObjectLiteralParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectLiteral_in_ruleLiteral11057);
                    this_ObjectLiteral_7=ruleObjectLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectLiteral_7; 
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
            if ( state.backtracking>0 ) { memoize(input, 128, ruleLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4911:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleBooleanLiteral_StartIndex = input.index();
        EObject iv_ruleBooleanLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4912:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4913:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11092);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral11102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, entryRuleBooleanLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4920:1: ruleBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;
        int ruleBooleanLiteral_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4923:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4924:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4924:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4924:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4924:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4925:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4933:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            else if ( (LA66_0==83) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4933:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleBooleanLiteral11152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4938:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4938:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4939:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4939:1: (lv_isTrue_2_0= 'true' )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4940:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,83,FOLLOW_83_in_ruleBooleanLiteral11176); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 130, ruleBooleanLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4961:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleNullLiteral_StartIndex = input.index();
        EObject iv_ruleNullLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4962:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4963:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11226);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral11236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, entryRuleNullLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4970:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;
        int ruleNullLiteral_StartIndex = input.index();
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4973:28: ( ( () otherlv_1= 'null' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4974:1: ( () otherlv_1= 'null' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4974:1: ( () otherlv_1= 'null' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4974:2: () otherlv_1= 'null'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4974:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4975:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleNullLiteral11285); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 132, ruleNullLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4995:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleIntLiteral_StartIndex = input.index();
        EObject iv_ruleIntLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4996:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4997:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11321);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral11331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, entryRuleIntLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5004:1: ruleIntLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;
        int ruleIntLiteral_StartIndex = input.index();
        Token lv_value_1_0=null;
        Token this_HEX_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5007:28: ( ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5008:1: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5008:1: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5008:2: () ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5008:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5009:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5017:2: ( ( (lv_value_1_0= RULE_INT ) ) | this_HEX_2= RULE_HEX )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_HEX) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5017:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5017:3: ( (lv_value_1_0= RULE_INT ) )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5018:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5018:1: (lv_value_1_0= RULE_INT )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5019:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral11386); if (state.failed) return current;
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
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5036:6: this_HEX_2= RULE_HEX
                    {
                    this_HEX_2=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleIntLiteral11408); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 134, ruleIntLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5048:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleFloatLiteral_StartIndex = input.index();
        EObject iv_ruleFloatLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5049:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5050:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral11444);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral11454); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, entryRuleFloatLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5057:1: ruleFloatLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleFloat ) ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;
        int ruleFloatLiteral_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5060:28: ( ( () ( (lv_value_1_0= ruleFloat ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5061:1: ( () ( (lv_value_1_0= ruleFloat ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5061:1: ( () ( (lv_value_1_0= ruleFloat ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5061:2: () ( (lv_value_1_0= ruleFloat ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5061:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5062:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatLiteralAccess().getFloatLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5070:2: ( (lv_value_1_0= ruleFloat ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5071:1: (lv_value_1_0= ruleFloat )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5071:1: (lv_value_1_0= ruleFloat )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5072:3: lv_value_1_0= ruleFloat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueFloatParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloat_in_ruleFloatLiteral11512);
            lv_value_1_0=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFloatLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Float");
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
            if ( state.backtracking>0 ) { memoize(input, 136, ruleFloatLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5096:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleStringLiteral_StartIndex = input.index();
        EObject iv_ruleStringLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5097:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5098:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11548);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, entryRuleStringLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5105:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;
        int ruleStringLiteral_StartIndex = input.index();
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5108:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5109:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5109:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5109:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5109:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5110:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5118:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5119:1: (lv_value_1_0= RULE_STRING )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5119:1: (lv_value_1_0= RULE_STRING )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5120:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11612); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 138, ruleStringLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleRegularExpressionLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5144:1: entryRuleRegularExpressionLiteral returns [EObject current=null] : iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF ;
    public final EObject entryRuleRegularExpressionLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleRegularExpressionLiteral_StartIndex = input.index();
        EObject iv_ruleRegularExpressionLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5145:2: (iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5146:2: iv_ruleRegularExpressionLiteral= ruleRegularExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRegularExpressionLiteral_in_entryRuleRegularExpressionLiteral11653);
            iv_ruleRegularExpressionLiteral=ruleRegularExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularExpressionLiteral11663); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, entryRuleRegularExpressionLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularExpressionLiteral"


    // $ANTLR start "ruleRegularExpressionLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5153:1: ruleRegularExpressionLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) ) ;
    public final EObject ruleRegularExpressionLiteral() throws RecognitionException {
        EObject current = null;
        int ruleRegularExpressionLiteral_StartIndex = input.index();
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5156:28: ( ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5157:1: ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5157:1: ( () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5157:2: () ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5157:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5158:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegularExpressionLiteralAccess().getRegularExpressionLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5166:2: ( (lv_value_1_0= RULE_REGULAR_EXPRESSION ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5167:1: (lv_value_1_0= RULE_REGULAR_EXPRESSION )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5167:1: (lv_value_1_0= RULE_REGULAR_EXPRESSION )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5168:3: lv_value_1_0= RULE_REGULAR_EXPRESSION
            {
            lv_value_1_0=(Token)match(input,RULE_REGULAR_EXPRESSION,FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleRegularExpressionLiteral11717); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 140, ruleRegularExpressionLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRegularExpressionLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5192:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleArrayLiteral_StartIndex = input.index();
        EObject iv_ruleArrayLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5193:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5194:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral11758);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral11768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, entryRuleArrayLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5201:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;
        int ruleArrayLiteral_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5204:28: ( ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5205:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5205:1: ( () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5205:2: () otherlv_1= '[' ( (lv_elements_2_0= ruleExpression ) )? (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* otherlv_5= ']'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5205:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5206:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleArrayLiteral11817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5218:1: ( (lv_elements_2_0= ruleExpression ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_EFLOAT)||LA68_0==17||(LA68_0>=22 && LA68_0<=24)||LA68_0==52||(LA68_0>=56 && LA68_0<=60)||LA68_0==62||(LA68_0>=65 && LA68_0<=66)||(LA68_0>=68 && LA68_0<=70)||(LA68_0>=72 && LA68_0<=76)||LA68_0==78||(LA68_0>=81 && LA68_0<=84)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5219:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5219:1: (lv_elements_2_0= ruleExpression )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5220:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getElementsExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral11838);
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

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5236:3: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==20) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5236:5: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleArrayLiteral11852); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5240:1: ( (lv_elements_4_0= ruleExpression ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5241:1: (lv_elements_4_0= ruleExpression )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5241:1: (lv_elements_4_0= ruleExpression )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5242:3: lv_elements_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getElementsExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral11873);
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
            	    break loop69;
                }
            } while (true);

            otherlv_5=(Token)match(input,61,FOLLOW_61_in_ruleArrayLiteral11887); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 142, ruleArrayLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleObjectLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5270:1: entryRuleObjectLiteral returns [EObject current=null] : iv_ruleObjectLiteral= ruleObjectLiteral EOF ;
    public final EObject entryRuleObjectLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleObjectLiteral_StartIndex = input.index();
        EObject iv_ruleObjectLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5271:2: (iv_ruleObjectLiteral= ruleObjectLiteral EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5272:2: iv_ruleObjectLiteral= ruleObjectLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleObjectLiteral_in_entryRuleObjectLiteral11923);
            iv_ruleObjectLiteral=ruleObjectLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectLiteral11933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, entryRuleObjectLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectLiteral"


    // $ANTLR start "ruleObjectLiteral"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5279:1: ruleObjectLiteral returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_elements_2_0= ruleObjectElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjectLiteral() throws RecognitionException {
        EObject current = null;
        int ruleObjectLiteral_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5282:28: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleObjectElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )* otherlv_5= '}' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5283:1: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleObjectElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )* otherlv_5= '}' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5283:1: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleObjectElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )* otherlv_5= '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5283:2: () otherlv_1= '{' ( (lv_elements_2_0= ruleObjectElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )* otherlv_5= '}'
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5283:2: ()
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5284:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getObjectLiteralAccess().getObjectLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleObjectLiteral11982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObjectLiteralAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5296:1: ( (lv_elements_2_0= ruleObjectElement ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5297:1: (lv_elements_2_0= ruleObjectElement )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5297:1: (lv_elements_2_0= ruleObjectElement )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5298:3: lv_elements_2_0= ruleObjectElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectLiteralAccess().getElementsObjectElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleObjectElement_in_ruleObjectLiteral12003);
            lv_elements_2_0=ruleObjectElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectLiteralRule());
              	        }
                     		add(
                     			current, 
                     			"elements",
                      		lv_elements_2_0, 
                      		"ObjectElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5314:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==20) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5314:4: otherlv_3= ',' ( (lv_elements_4_0= ruleObjectElement ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleObjectLiteral12016); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getObjectLiteralAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5318:1: ( (lv_elements_4_0= ruleObjectElement ) )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5319:1: (lv_elements_4_0= ruleObjectElement )
            	    {
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5319:1: (lv_elements_4_0= ruleObjectElement )
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5320:3: lv_elements_4_0= ruleObjectElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObjectLiteralAccess().getElementsObjectElementParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleObjectElement_in_ruleObjectLiteral12037);
            	    lv_elements_4_0=ruleObjectElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getObjectLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
            	              		"ObjectElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleObjectLiteral12051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getObjectLiteralAccess().getRightCurlyBracketKeyword_4());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 144, ruleObjectLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleObjectLiteral"


    // $ANTLR start "entryRuleObjectElement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5348:1: entryRuleObjectElement returns [EObject current=null] : iv_ruleObjectElement= ruleObjectElement EOF ;
    public final EObject entryRuleObjectElement() throws RecognitionException {
        EObject current = null;
        int entryRuleObjectElement_StartIndex = input.index();
        EObject iv_ruleObjectElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5349:2: (iv_ruleObjectElement= ruleObjectElement EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5350:2: iv_ruleObjectElement= ruleObjectElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectElementRule()); 
            }
            pushFollow(FOLLOW_ruleObjectElement_in_entryRuleObjectElement12087);
            iv_ruleObjectElement=ruleObjectElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectElement12097); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, entryRuleObjectElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectElement"


    // $ANTLR start "ruleObjectElement"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5357:1: ruleObjectElement returns [EObject current=null] : ( ( (lv_key_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleObjectElement() throws RecognitionException {
        EObject current = null;
        int ruleObjectElement_StartIndex = input.index();
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5360:28: ( ( ( (lv_key_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5361:1: ( ( (lv_key_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5361:1: ( ( (lv_key_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5361:2: ( (lv_key_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5361:2: ( (lv_key_0_0= ruleValidID ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5362:1: (lv_key_0_0= ruleValidID )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5362:1: (lv_key_0_0= ruleValidID )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5363:3: lv_key_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectElementAccess().getKeyValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleObjectElement12143);
            lv_key_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectElementRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleObjectElement12155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObjectElementAccess().getColonKeyword_1());
                  
            }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5383:1: ( (lv_value_2_0= ruleExpression ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5384:1: (lv_value_2_0= ruleExpression )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5384:1: (lv_value_2_0= ruleExpression )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5385:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectElementAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleObjectElement12176);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObjectElementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
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
            if ( state.backtracking>0 ) { memoize(input, 146, ruleObjectElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleObjectElement"


    // $ANTLR start "entryRuleFloat"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5409:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;
        int entryRuleFloat_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloat = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5413:2: (iv_ruleFloat= ruleFloat EOF )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5414:2: iv_ruleFloat= ruleFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatRule()); 
            }
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat12219);
            iv_ruleFloat=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat12230); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 147, entryRuleFloat_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5424:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EFLOAT_0= RULE_EFLOAT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloat_StartIndex = input.index();
        Token this_EFLOAT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return current; }
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5428:28: ( (this_EFLOAT_0= RULE_EFLOAT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '.' this_INT_5= RULE_INT ) ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5429:1: (this_EFLOAT_0= RULE_EFLOAT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '.' this_INT_5= RULE_INT ) )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5429:1: (this_EFLOAT_0= RULE_EFLOAT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) | (kw= '.' this_INT_5= RULE_INT ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_EFLOAT:
                {
                alt71=1;
                }
                break;
            case RULE_INT:
                {
                alt71=2;
                }
                break;
            case 22:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5429:6: this_EFLOAT_0= RULE_EFLOAT
                    {
                    this_EFLOAT_0=(Token)match(input,RULE_EFLOAT,FOLLOW_RULE_EFLOAT_in_ruleFloat12274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EFLOAT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EFLOAT_0, grammarAccess.getFloatAccess().getEFLOATTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5437:6: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5437:6: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5437:11: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat12301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFloat12319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat12334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5458:6: (kw= '.' this_INT_5= RULE_INT )
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5458:6: (kw= '.' this_INT_5= RULE_INT )
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:5459:2: kw= '.' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFloat12360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_2_0()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat12375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2_1()); 
                          
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
            if ( state.backtracking>0 ) { memoize(input, 148, ruleFloat_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFloat"

    // $ANTLR start synpred12_InternalHaxe
    public final void synpred12_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_1=null;

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:555:3: (otherlv_1= ';' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:555:3: otherlv_1= ';'
        {
        otherlv_1=(Token)match(input,15,FOLLOW_15_in_synpred12_InternalHaxe1283); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalHaxe

    // $ANTLR start synpred15_InternalHaxe
    public final void synpred15_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_6_0 = null;

        EObject lv_right_7_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:2: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:649:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:6: ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:7: () ( (lv_feature_6_0= ruleOpMultiAssign ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:654:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:655:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:663:2: ( (lv_feature_6_0= ruleOpMultiAssign ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:664:1: (lv_feature_6_0= ruleOpMultiAssign )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:664:1: (lv_feature_6_0= ruleOpMultiAssign )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:665:3: lv_feature_6_0= ruleOpMultiAssign
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureOpMultiAssignParserRuleCall_1_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred15_InternalHaxe1520);
        lv_feature_6_0=ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:681:4: ( (lv_right_7_0= ruleAssignment ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:682:1: (lv_right_7_0= ruleAssignment )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:682:1: (lv_right_7_0= ruleAssignment )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:683:3: lv_right_7_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred15_InternalHaxe1543);
        lv_right_7_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalHaxe

    // $ANTLR start synpred27_InternalHaxe
    public final void synpred27_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:2: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:856:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:6: ( () ( (lv_feature_2_0= ruleOpOr ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:7: () ( (lv_feature_2_0= ruleOpOr ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:861:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:862:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:870:2: ( (lv_feature_2_0= ruleOpOr ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:871:1: (lv_feature_2_0= ruleOpOr )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:871:1: (lv_feature_2_0= ruleOpOr )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:872:3: lv_feature_2_0= ruleOpOr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOrExpressionAccess().getFeatureOpOrParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpOr_in_synpred27_InternalHaxe2062);
        lv_feature_2_0=ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:888:4: ( (lv_right_3_0= ruleAndExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:889:1: (lv_right_3_0= ruleAndExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:889:1: (lv_right_3_0= ruleAndExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:890:3: lv_right_3_0= ruleAndExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAndExpression_in_synpred27_InternalHaxe2085);
        lv_right_3_0=ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHaxe

    // $ANTLR start synpred29_InternalHaxe
    public final void synpred29_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:2: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_right_3_0= ruleOtherOperatorExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:966:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:6: ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:7: () ( (lv_feature_2_0= ruleOpAnd ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:971:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:972:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:980:2: ( (lv_feature_2_0= ruleOpAnd ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:981:1: (lv_feature_2_0= ruleOpAnd )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:981:1: (lv_feature_2_0= ruleOpAnd )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:982:3: lv_feature_2_0= ruleOpAnd
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAndExpressionAccess().getFeatureOpAndParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpAnd_in_synpred29_InternalHaxe2323);
        lv_feature_2_0=ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:998:4: ( (lv_right_3_0= ruleOtherOperatorExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:999:1: (lv_right_3_0= ruleOtherOperatorExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:999:1: (lv_right_3_0= ruleOtherOperatorExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1000:3: lv_right_3_0= ruleOtherOperatorExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightOtherOperatorExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOtherOperatorExpression_in_synpred29_InternalHaxe2346);
        lv_right_3_0=ruleOtherOperatorExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalHaxe

    // $ANTLR start synpred31_InternalHaxe
    public final void synpred31_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:2: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_right_3_0= ruleCompareExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1076:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:6: ( () ( (lv_feature_2_0= ruleOpOther ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:7: () ( (lv_feature_2_0= ruleOpOther ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1081:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1082:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1090:2: ( (lv_feature_2_0= ruleOpOther ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1091:1: (lv_feature_2_0= ruleOpOther )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1091:1: (lv_feature_2_0= ruleOpOther )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1092:3: lv_feature_2_0= ruleOpOther
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getFeatureOpOtherParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpOther_in_synpred31_InternalHaxe2584);
        lv_feature_2_0=ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1108:4: ( (lv_right_3_0= ruleCompareExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1109:1: (lv_right_3_0= ruleCompareExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1109:1: (lv_right_3_0= ruleCompareExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1110:3: lv_right_3_0= ruleCompareExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getRightCompareExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareExpression_in_synpred31_InternalHaxe2607);
        lv_right_3_0=ruleCompareExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHaxe

    // $ANTLR start synpred33_InternalHaxe
    public final void synpred33_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:2: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_right_3_0= ruleBitwiseExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1186:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:6: ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:7: () ( (lv_feature_2_0= ruleOpCompare ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1191:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1192:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1200:2: ( (lv_feature_2_0= ruleOpCompare ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1201:1: (lv_feature_2_0= ruleOpCompare )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1201:1: (lv_feature_2_0= ruleOpCompare )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1202:3: lv_feature_2_0= ruleOpCompare
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpCompare_in_synpred33_InternalHaxe2845);
        lv_feature_2_0=ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1218:4: ( (lv_right_3_0= ruleBitwiseExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1219:1: (lv_right_3_0= ruleBitwiseExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1219:1: (lv_right_3_0= ruleBitwiseExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1220:3: lv_right_3_0= ruleBitwiseExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBitwiseExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleBitwiseExpression_in_synpred33_InternalHaxe2868);
        lv_right_3_0=ruleBitwiseExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalHaxe

    // $ANTLR start synpred40_InternalHaxe
    public final void synpred40_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:2: ( ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) ) ( (lv_right_3_0= ruleBitshiftExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:2: ( ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1331:3: ( ( () ( ( ruleOpBitwise ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:6: ( () ( (lv_feature_2_0= ruleOpBitwise ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:7: () ( (lv_feature_2_0= ruleOpBitwise ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1336:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1337:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1345:2: ( (lv_feature_2_0= ruleOpBitwise ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1346:1: (lv_feature_2_0= ruleOpBitwise )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1346:1: (lv_feature_2_0= ruleOpBitwise )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1347:3: lv_feature_2_0= ruleOpBitwise
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getFeatureOpBitwiseParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpBitwise_in_synpred40_InternalHaxe3203);
        lv_feature_2_0=ruleOpBitwise();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1363:4: ( (lv_right_3_0= ruleBitshiftExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1364:1: (lv_right_3_0= ruleBitshiftExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1364:1: (lv_right_3_0= ruleBitshiftExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1365:3: lv_right_3_0= ruleBitshiftExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitwiseExpressionAccess().getRightBitshiftExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleBitshiftExpression_in_synpred40_InternalHaxe3226);
        lv_right_3_0=ruleBitshiftExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40_InternalHaxe

    // $ANTLR start synpred44_InternalHaxe
    public final void synpred44_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:2: ( ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:2: ( ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1455:3: ( ( () ( ( ruleOpBitshift ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:6: ( () ( (lv_feature_2_0= ruleOpBitshift ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:7: () ( (lv_feature_2_0= ruleOpBitshift ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1460:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1461:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1469:2: ( (lv_feature_2_0= ruleOpBitshift ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1470:1: (lv_feature_2_0= ruleOpBitshift )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1470:1: (lv_feature_2_0= ruleOpBitshift )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1471:3: lv_feature_2_0= ruleOpBitshift
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getFeatureOpBitshiftParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpBitshift_in_synpred44_InternalHaxe3504);
        lv_feature_2_0=ruleOpBitshift();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1487:4: ( (lv_right_3_0= ruleAddExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1488:1: (lv_right_3_0= ruleAddExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1488:1: (lv_right_3_0= ruleAddExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1489:3: lv_right_3_0= ruleAddExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitshiftExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAddExpression_in_synpred44_InternalHaxe3527);
        lv_right_3_0=ruleAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred44_InternalHaxe

    // $ANTLR start synpred48_InternalHaxe
    public final void synpred48_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:2: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_right_3_0= ruleSubtractExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1579:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:6: ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:7: () ( (lv_feature_2_0= ruleOpAdd ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1584:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1585:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1593:2: ( (lv_feature_2_0= ruleOpAdd ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1594:1: (lv_feature_2_0= ruleOpAdd )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1594:1: (lv_feature_2_0= ruleOpAdd )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1595:3: lv_feature_2_0= ruleOpAdd
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAddExpressionAccess().getFeatureOpAddParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpAdd_in_synpred48_InternalHaxe3805);
        lv_feature_2_0=ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1611:4: ( (lv_right_3_0= ruleSubtractExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1612:1: (lv_right_3_0= ruleSubtractExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1612:1: (lv_right_3_0= ruleSubtractExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1613:3: lv_right_3_0= ruleSubtractExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSubtractExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubtractExpression_in_synpred48_InternalHaxe3828);
        lv_right_3_0=ruleSubtractExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred48_InternalHaxe

    // $ANTLR start synpred50_InternalHaxe
    public final void synpred50_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:2: ( ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) ) ( (lv_right_3_0= ruleMultiplyExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:2: ( ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1689:3: ( ( () ( ( ruleOpSubtract ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:6: ( () ( (lv_feature_2_0= ruleOpSubtract ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:7: () ( (lv_feature_2_0= ruleOpSubtract ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1694:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1695:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1703:2: ( (lv_feature_2_0= ruleOpSubtract ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1704:1: (lv_feature_2_0= ruleOpSubtract )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1704:1: (lv_feature_2_0= ruleOpSubtract )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1705:3: lv_feature_2_0= ruleOpSubtract
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getFeatureOpSubtractParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpSubtract_in_synpred50_InternalHaxe4066);
        lv_feature_2_0=ruleOpSubtract();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1721:4: ( (lv_right_3_0= ruleMultiplyExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1722:1: (lv_right_3_0= ruleMultiplyExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1722:1: (lv_right_3_0= ruleMultiplyExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1723:3: lv_right_3_0= ruleMultiplyExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubtractExpressionAccess().getRightMultiplyExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplyExpression_in_synpred50_InternalHaxe4089);
        lv_right_3_0=ruleMultiplyExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50_InternalHaxe

    // $ANTLR start synpred52_InternalHaxe
    public final void synpred52_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:2: ( ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) ) ( (lv_right_3_0= ruleDivideExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:2: ( ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1799:3: ( ( () ( ( ruleOpMultiply ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:6: ( () ( (lv_feature_2_0= ruleOpMultiply ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:7: () ( (lv_feature_2_0= ruleOpMultiply ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1804:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1805:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1813:2: ( (lv_feature_2_0= ruleOpMultiply ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1814:1: (lv_feature_2_0= ruleOpMultiply )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1814:1: (lv_feature_2_0= ruleOpMultiply )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1815:3: lv_feature_2_0= ruleOpMultiply
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getFeatureOpMultiplyParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpMultiply_in_synpred52_InternalHaxe4327);
        lv_feature_2_0=ruleOpMultiply();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1831:4: ( (lv_right_3_0= ruleDivideExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1832:1: (lv_right_3_0= ruleDivideExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1832:1: (lv_right_3_0= ruleDivideExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1833:3: lv_right_3_0= ruleDivideExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplyExpressionAccess().getRightDivideExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDivideExpression_in_synpred52_InternalHaxe4350);
        lv_right_3_0=ruleDivideExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred52_InternalHaxe

    // $ANTLR start synpred54_InternalHaxe
    public final void synpred54_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:2: ( ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) ) ( (lv_right_3_0= ruleModuloExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:2: ( ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1909:3: ( ( () ( ( ruleOpDivide ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:6: ( () ( (lv_feature_2_0= ruleOpDivide ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:7: () ( (lv_feature_2_0= ruleOpDivide ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1914:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1915:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1923:2: ( (lv_feature_2_0= ruleOpDivide ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1924:1: (lv_feature_2_0= ruleOpDivide )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1924:1: (lv_feature_2_0= ruleOpDivide )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1925:3: lv_feature_2_0= ruleOpDivide
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getFeatureOpDivideParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpDivide_in_synpred54_InternalHaxe4588);
        lv_feature_2_0=ruleOpDivide();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1941:4: ( (lv_right_3_0= ruleModuloExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1942:1: (lv_right_3_0= ruleModuloExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1942:1: (lv_right_3_0= ruleModuloExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1943:3: lv_right_3_0= ruleModuloExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDivideExpressionAccess().getRightModuloExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleModuloExpression_in_synpred54_InternalHaxe4611);
        lv_right_3_0=ruleModuloExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred54_InternalHaxe

    // $ANTLR start synpred56_InternalHaxe
    public final void synpred56_InternalHaxe_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:2: ( ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:2: ( ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2019:3: ( ( () ( ( ruleOpModulo ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:6: ( () ( (lv_feature_2_0= ruleOpModulo ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:7: () ( (lv_feature_2_0= ruleOpModulo ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2024:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2025:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2033:2: ( (lv_feature_2_0= ruleOpModulo ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2034:1: (lv_feature_2_0= ruleOpModulo )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2034:1: (lv_feature_2_0= ruleOpModulo )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2035:3: lv_feature_2_0= ruleOpModulo
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getFeatureOpModuloParserRuleCall_1_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpModulo_in_synpred56_InternalHaxe4849);
        lv_feature_2_0=ruleOpModulo();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2051:4: ( (lv_right_3_0= ruleUnaryOperation ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2052:1: (lv_right_3_0= ruleUnaryOperation )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2052:1: (lv_right_3_0= ruleUnaryOperation )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2053:3: lv_right_3_0= ruleUnaryOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModuloExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleUnaryOperation_in_synpred56_InternalHaxe4872);
        lv_right_3_0=ruleUnaryOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred56_InternalHaxe

    // $ANTLR start synpred63_InternalHaxe
    public final void synpred63_InternalHaxe_fragment() throws RecognitionException {   
        EObject lv_operand_1_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:2: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:2: ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2325:3: ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:6: ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:7: () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2334:7: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2335:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2343:2: ( (lv_operand_1_0= ruleMemberFeatureCall ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2344:1: (lv_operand_1_0= ruleMemberFeatureCall )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2344:1: (lv_operand_1_0= ruleMemberFeatureCall )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2345:3: lv_operand_1_0= ruleMemberFeatureCall
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getOperandMemberFeatureCallParserRuleCall_0_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMemberFeatureCall_in_synpred63_InternalHaxe5564);
        lv_operand_1_0=ruleMemberFeatureCall();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2361:2: ( (lv_feature_2_0= ruleOpIncrement ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2362:1: (lv_feature_2_0= ruleOpIncrement )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2362:1: (lv_feature_2_0= ruleOpIncrement )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2363:3: lv_feature_2_0= ruleOpIncrement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPostIncrementOperationAccess().getFeatureOpIncrementParserRuleCall_0_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOpIncrement_in_synpred63_InternalHaxe5585);
        lv_feature_2_0=ruleOpIncrement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred63_InternalHaxe

    // $ANTLR start synpred66_InternalHaxe
    public final void synpred66_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_value_5_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:2: ( ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:2: ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:2: ( ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:3: ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleAssignment ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:3: ( ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2459:4: ( ( () '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:25: ( () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:26: () otherlv_2= '.' ( ( ruleFeatureID ) ) ruleOpSingleAssign
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2465:26: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2466:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,22,FOLLOW_22_in_synpred66_InternalHaxe5874); if (state.failed) return ;
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2478:1: ( ( ruleFeatureID ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2479:1: ( ruleFeatureID )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2479:1: ( ruleFeatureID )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2480:3: ruleFeatureID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleFeatureID_in_synpred66_InternalHaxe5901);
        ruleFeatureID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred66_InternalHaxe5920);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2507:3: ( (lv_value_5_0= ruleAssignment ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2508:1: (lv_value_5_0= ruleAssignment )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2508:1: (lv_value_5_0= ruleAssignment )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2509:3: lv_value_5_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred66_InternalHaxe5942);
        lv_value_5_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalHaxe

    // $ANTLR start synpred68_InternalHaxe
    public final void synpred68_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_feature_8_0 = null;

        EObject lv_value_11_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:6: ( ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:6: ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:6: ( ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:7: ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) ) ( (lv_value_11_0= ruleAssignment ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:7: ( ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2526:8: ( ( () '[' ( ( ruleExpression ) ) ']' ruleOpSingleAssign ) )=> ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:24: ( () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:25: () otherlv_7= '[' ( (lv_feature_8_0= ruleExpression ) ) otherlv_9= ']' ruleOpSingleAssign
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2533:25: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2534:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_7=(Token)match(input,60,FOLLOW_60_in_synpred68_InternalHaxe6003); if (state.failed) return ;
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2546:1: ( (lv_feature_8_0= ruleExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2547:1: (lv_feature_8_0= ruleExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2547:1: (lv_feature_8_0= ruleExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2548:3: lv_feature_8_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureExpressionParserRuleCall_1_1_0_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred68_InternalHaxe6024);
        lv_feature_8_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,61,FOLLOW_61_in_synpred68_InternalHaxe6036); if (state.failed) return ;
        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred68_InternalHaxe6055);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2579:3: ( (lv_value_11_0= ruleAssignment ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2580:1: (lv_value_11_0= ruleAssignment )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2580:1: (lv_value_11_0= ruleAssignment )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2581:3: lv_value_11_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getValueAssignmentParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred68_InternalHaxe6077);
        lv_value_11_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred68_InternalHaxe

    // $ANTLR start synpred73_InternalHaxe
    public final void synpred73_InternalHaxe_fragment() throws RecognitionException {   
        Token lv_explicitOperationCall_15_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_arguments_16_0 = null;

        EObject lv_arguments_18_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')'
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:4: ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2638:1: (lv_explicitOperationCall_15_0= '(' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2639:3: lv_explicitOperationCall_15_0= '('
        {
        lv_explicitOperationCall_15_0=(Token)match(input,62,FOLLOW_62_in_synpred73_InternalHaxe6186); if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:2: ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_EFLOAT)||LA75_0==17||(LA75_0>=22 && LA75_0<=24)||LA75_0==52||(LA75_0>=56 && LA75_0<=60)||LA75_0==62||(LA75_0>=65 && LA75_0<=66)||(LA75_0>=68 && LA75_0<=70)||(LA75_0>=72 && LA75_0<=76)||LA75_0==78||(LA75_0>=81 && LA75_0<=84)) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2654:3: lv_arguments_16_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred73_InternalHaxe6221);
                lv_arguments_16_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:2: (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
                loop74:
                do {
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==20) ) {
                        alt74=1;
                    }


                    switch (alt74) {
                	case 1 :
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:4: otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) )
                	    {
                	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_synpred73_InternalHaxe6234); if (state.failed) return ;
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2674:1: ( (lv_arguments_18_0= ruleExpression ) )
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
                	    {
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2676:3: lv_arguments_18_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred73_InternalHaxe6255);
                	    lv_arguments_18_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop74;
                    }
                } while (true);


                }
                break;

        }

        otherlv_19=(Token)match(input,63,FOLLOW_63_in_synpred73_InternalHaxe6271); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalHaxe

    // $ANTLR start synpred74_InternalHaxe
    public final void synpred74_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token lv_explicitOperationCall_15_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_arguments_16_0 = null;

        EObject lv_arguments_18_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:6: ( ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:6: ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:6: ( ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )? )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:7: ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) ) ( ( ruleFeatureID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )?
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:7: ( ( ( () '.' ) )=> ( () otherlv_13= '.' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2598:8: ( ( () '.' ) )=> ( () otherlv_13= '.' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:5: ( () otherlv_13= '.' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:6: () otherlv_13= '.'
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2600:6: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2601:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_13=(Token)match(input,22,FOLLOW_22_in_synpred74_InternalHaxe6123); if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2613:3: ( ( ruleFeatureID ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2614:1: ( ruleFeatureID )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2614:1: ( ruleFeatureID )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2615:3: ruleFeatureID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FOLLOW_ruleFeatureID_in_synpred74_InternalHaxe6152);
        ruleFeatureID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==62) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')'
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2631:4: ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' )
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2638:1: (lv_explicitOperationCall_15_0= '(' )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2639:3: lv_explicitOperationCall_15_0= '('
                {
                lv_explicitOperationCall_15_0=(Token)match(input,62,FOLLOW_62_in_synpred74_InternalHaxe6186); if (state.failed) return ;

                }


                }

                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:2: ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )?
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_EFLOAT)||LA77_0==17||(LA77_0>=22 && LA77_0<=24)||LA77_0==52||(LA77_0>=56 && LA77_0<=60)||LA77_0==62||(LA77_0>=65 && LA77_0<=66)||(LA77_0>=68 && LA77_0<=70)||(LA77_0>=72 && LA77_0<=76)||LA77_0==78||(LA77_0>=81 && LA77_0<=84)) ) {
                    alt77=1;
                }
                switch (alt77) {
                    case 1 :
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
                        {
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2652:3: ( (lv_arguments_16_0= ruleExpression ) )
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
                        {
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2653:1: (lv_arguments_16_0= ruleExpression )
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2654:3: lv_arguments_16_0= ruleExpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_0_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleExpression_in_synpred74_InternalHaxe6221);
                        lv_arguments_16_0=ruleExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:2: (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )*
                        loop76:
                        do {
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==20) ) {
                                alt76=1;
                            }


                            switch (alt76) {
                        	case 1 :
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2670:4: otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) )
                        	    {
                        	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_synpred74_InternalHaxe6234); if (state.failed) return ;
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2674:1: ( (lv_arguments_18_0= ruleExpression ) )
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
                        	    {
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2675:1: (lv_arguments_18_0= ruleExpression )
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2676:3: lv_arguments_18_0= ruleExpression
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_2_2_1_1_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FOLLOW_ruleExpression_in_synpred74_InternalHaxe6255);
                        	    lv_arguments_18_0=ruleExpression();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop76;
                            }
                        } while (true);


                        }
                        break;

                }

                otherlv_19=(Token)match(input,63,FOLLOW_63_in_synpred74_InternalHaxe6271); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred74_InternalHaxe

    // $ANTLR start synpred79_InternalHaxe
    public final void synpred79_InternalHaxe_fragment() throws RecognitionException {   
        Token lv_explicitOperationCall_24_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_arguments_25_0 = null;

        EObject lv_arguments_27_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')'
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:3: ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2740:1: (lv_explicitOperationCall_24_0= '(' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2741:3: lv_explicitOperationCall_24_0= '('
        {
        lv_explicitOperationCall_24_0=(Token)match(input,62,FOLLOW_62_in_synpred79_InternalHaxe6380); if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:2: ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_EFLOAT)||LA81_0==17||(LA81_0>=22 && LA81_0<=24)||LA81_0==52||(LA81_0>=56 && LA81_0<=60)||LA81_0==62||(LA81_0>=65 && LA81_0<=66)||(LA81_0>=68 && LA81_0<=70)||(LA81_0>=72 && LA81_0<=76)||LA81_0==78||(LA81_0>=81 && LA81_0<=84)) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2756:3: lv_arguments_25_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred79_InternalHaxe6415);
                lv_arguments_25_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:2: (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==20) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:4: otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) )
                	    {
                	    otherlv_26=(Token)match(input,20,FOLLOW_20_in_synpred79_InternalHaxe6428); if (state.failed) return ;
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2776:1: ( (lv_arguments_27_0= ruleExpression ) )
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
                	    {
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
                	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2778:3: lv_arguments_27_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred79_InternalHaxe6449);
                	    lv_arguments_27_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop80;
                    }
                } while (true);


                }
                break;

        }

        otherlv_28=(Token)match(input,63,FOLLOW_63_in_synpred79_InternalHaxe6465); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalHaxe

    // $ANTLR start synpred80_InternalHaxe
    public final void synpred80_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_explicitOperationCall_24_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_feature_22_0 = null;

        EObject lv_arguments_25_0 = null;

        EObject lv_arguments_27_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:6: ( ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:6: ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:6: ( ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )? )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:7: ( ( () )=> () ) otherlv_21= '[' ( (lv_feature_22_0= ruleExpression ) ) otherlv_23= ']' ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )?
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:7: ( ( () )=> () )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2697:8: ( () )=> ()
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2698:5: ()
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2699:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }


        }

        otherlv_21=(Token)match(input,60,FOLLOW_60_in_synpred80_InternalHaxe6313); if (state.failed) return ;
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2711:1: ( (lv_feature_22_0= ruleExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2712:1: (lv_feature_22_0= ruleExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2712:1: (lv_feature_22_0= ruleExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2713:3: lv_feature_22_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureExpressionParserRuleCall_1_3_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred80_InternalHaxe6334);
        lv_feature_22_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_23=(Token)match(input,61,FOLLOW_61_in_synpred80_InternalHaxe6346); if (state.failed) return ;
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:1: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==62) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')'
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:2: ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2733:3: ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' )
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2740:1: (lv_explicitOperationCall_24_0= '(' )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2741:3: lv_explicitOperationCall_24_0= '('
                {
                lv_explicitOperationCall_24_0=(Token)match(input,62,FOLLOW_62_in_synpred80_InternalHaxe6380); if (state.failed) return ;

                }


                }

                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:2: ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_EFLOAT)||LA83_0==17||(LA83_0>=22 && LA83_0<=24)||LA83_0==52||(LA83_0>=56 && LA83_0<=60)||LA83_0==62||(LA83_0>=65 && LA83_0<=66)||(LA83_0>=68 && LA83_0<=70)||(LA83_0>=72 && LA83_0<=76)||LA83_0==78||(LA83_0>=81 && LA83_0<=84)) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
                        {
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2754:3: ( (lv_arguments_25_0= ruleExpression ) )
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
                        {
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2755:1: (lv_arguments_25_0= ruleExpression )
                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2756:3: lv_arguments_25_0= ruleExpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_0_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleExpression_in_synpred80_InternalHaxe6415);
                        lv_arguments_25_0=ruleExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:2: (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )*
                        loop82:
                        do {
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==20) ) {
                                alt82=1;
                            }


                            switch (alt82) {
                        	case 1 :
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2772:4: otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) )
                        	    {
                        	    otherlv_26=(Token)match(input,20,FOLLOW_20_in_synpred80_InternalHaxe6428); if (state.failed) return ;
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2776:1: ( (lv_arguments_27_0= ruleExpression ) )
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
                        	    {
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2777:1: (lv_arguments_27_0= ruleExpression )
                        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:2778:3: lv_arguments_27_0= ruleExpression
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_3_4_1_1_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FOLLOW_ruleExpression_in_synpred80_InternalHaxe6449);
                        	    lv_arguments_27_0=ruleExpression();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop82;
                            }
                        } while (true);


                        }
                        break;

                }

                otherlv_28=(Token)match(input,63,FOLLOW_63_in_synpred80_InternalHaxe6465); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred80_InternalHaxe

    // $ANTLR start synpred107_InternalHaxe
    public final void synpred107_InternalHaxe_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_else_7_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:3: ( ( 'else' )=>otherlv_6= 'else' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3635:4: ( 'else' )=>otherlv_6= 'else'
        {
        otherlv_6=(Token)match(input,67,FOLLOW_67_in_synpred107_InternalHaxe8342); if (state.failed) return ;

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3640:2: ( (lv_else_7_0= ruleExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3641:1: (lv_else_7_0= ruleExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3641:1: (lv_else_7_0= ruleExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3642:3: lv_else_7_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred107_InternalHaxe8364);
        lv_else_7_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred107_InternalHaxe

    // $ANTLR start synpred109_InternalHaxe
    public final void synpred109_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3964:2: ( ( ruleExpression ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3965:1: ( ruleExpression )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3965:1: ( ruleExpression )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3966:1: ruleExpression
        {
        pushFollow(FOLLOW_ruleExpression_in_synpred109_InternalHaxe9046);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred109_InternalHaxe

    // $ANTLR start synpred110_InternalHaxe
    public final void synpred110_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4158:3: ( 'catch' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4158:5: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred110_InternalHaxe9498); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_InternalHaxe

    // $ANTLR start synpred112_InternalHaxe
    public final void synpred112_InternalHaxe_fragment() throws RecognitionException {   
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4303:2: ( 'case' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4303:4: 'case'
        {
        match(input,80,FOLLOW_80_in_synpred112_InternalHaxe9813); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalHaxe

    // $ANTLR start synpred122_InternalHaxe
    public final void synpred122_InternalHaxe_fragment() throws RecognitionException {   
        Token lv_explicitOperationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4614:4: ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' )
        {
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4621:1: (lv_explicitOperationCall_2_0= '(' )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4622:3: lv_explicitOperationCall_2_0= '('
        {
        lv_explicitOperationCall_2_0=(Token)match(input,62,FOLLOW_62_in_synpred122_InternalHaxe10462); if (state.failed) return ;

        }


        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4635:2: ( (lv_arguments_3_0= ruleExpression ) )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( ((LA88_0>=RULE_ID && LA88_0<=RULE_EFLOAT)||LA88_0==17||(LA88_0>=22 && LA88_0<=24)||LA88_0==52||(LA88_0>=56 && LA88_0<=60)||LA88_0==62||(LA88_0>=65 && LA88_0<=66)||(LA88_0>=68 && LA88_0<=70)||(LA88_0>=72 && LA88_0<=76)||LA88_0==78||(LA88_0>=81 && LA88_0<=84)) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4636:1: (lv_arguments_3_0= ruleExpression )
                {
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4636:1: (lv_arguments_3_0= ruleExpression )
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4637:3: lv_arguments_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred122_InternalHaxe10496);
                lv_arguments_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4653:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==20) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4653:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_synpred122_InternalHaxe10510); if (state.failed) return ;
        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4657:1: ( (lv_arguments_5_0= ruleExpression ) )
        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4658:1: (lv_arguments_5_0= ruleExpression )
        	    {
        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4658:1: (lv_arguments_5_0= ruleExpression )
        	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4659:3: lv_arguments_5_0= ruleExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleExpression_in_synpred122_InternalHaxe10531);
        	    lv_arguments_5_0=ruleExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop89;
            }
        } while (true);

        otherlv_6=(Token)match(input,63,FOLLOW_63_in_synpred122_InternalHaxe10545); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_InternalHaxe

    // $ANTLR start synpred128_InternalHaxe
    public final void synpred128_InternalHaxe_fragment() throws RecognitionException {   
        EObject this_FloatLiteral_3 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4840:2: (this_FloatLiteral_3= ruleFloatLiteral )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4840:2: this_FloatLiteral_3= ruleFloatLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFloatLiteral_in_synpred128_InternalHaxe10937);
        this_FloatLiteral_3=ruleFloatLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred128_InternalHaxe

    // $ANTLR start synpred129_InternalHaxe
    public final void synpred129_InternalHaxe_fragment() throws RecognitionException {   
        EObject this_IntLiteral_4 = null;


        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4853:2: (this_IntLiteral_4= ruleIntLiteral )
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:4853:2: this_IntLiteral_4= ruleIntLiteral
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntLiteral_in_synpred129_InternalHaxe10967);
        this_IntLiteral_4=ruleIntLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_InternalHaxe

    // Delegated rules

    public final boolean synpred31_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalHaxe_fragment(); // can never throw exception
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
    public final boolean synpred79_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred56_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_InternalHaxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_InternalHaxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA11_eotS =
        "\16\uffff";
    static final String DFA11_eofS =
        "\1\14\15\uffff";
    static final String DFA11_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA11_maxS =
        "\1\124\13\0\2\uffff";
    static final String DFA11_acceptS =
        "\14\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\1\uffff\1\1\1\6\1\3\1\0\1\11\1\10\1\4\1\2\1\7\1\12\1\5\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\6\14\5\uffff\1\14\1\uffff\11\14\1\uffff\1\1\1\2\1\3\1\4\1"+
            "\5\1\6\1\7\1\10\1\11\1\12\1\13\41\14\1\uffff\15\14",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "649:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( (lv_feature_6_0= ruleOpMultiAssign ) ) ) ) ( (lv_right_7_0= ruleAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHaxe()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\36\uffff";
    static final String DFA31_eofS =
        "\36\uffff";
    static final String DFA31_minS =
        "\1\4\33\0\2\uffff";
    static final String DFA31_maxS =
        "\1\124\33\0\2\uffff";
    static final String DFA31_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\2\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\16\1\27\1\31\1\25\1\32\1\26\7\uffff\1\1\4\uffff\1\30\1\17"+
            "\1\20\43\uffff\1\33\1\uffff\1\2\2\uffff\1\15\1\3\1\uffff\1\4"+
            "\1\5\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff\1\14\2\uffff"+
            "\1\21\1\22\1\23\1\24",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2325:1: ( ( ( ( () ( ( ruleMemberFeatureCall ) ) ( ( ruleOpIncrement ) ) ) )=> ( () ( (lv_operand_1_0= ruleMemberFeatureCall ) ) ( (lv_feature_2_0= ruleOpIncrement ) ) ) ) | this_MemberFeatureCall_3= ruleMemberFeatureCall )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalHaxe()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\114\uffff";
    static final String DFA35_eofS =
        "\1\2\113\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA35_maxS =
        "\1\124\1\0\112\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA35_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\11\2\1\uffff\43\2\1\1\10\2\1\uffff"+
            "\15\2",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2631:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_15_0= '(' ) ) ( ( (lv_arguments_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_arguments_18_0= ruleExpression ) ) )* )? otherlv_19= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\114\uffff";
    static final String DFA38_eofS =
        "\1\2\113\uffff";
    static final String DFA38_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA38_maxS =
        "\1\124\1\0\112\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA38_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\11\2\1\uffff\43\2\1\1\10\2\1\uffff"+
            "\15\2",
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2733:1: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_24_0= '(' ) ) ( ( (lv_arguments_25_0= ruleExpression ) ) (otherlv_26= ',' ( (lv_arguments_27_0= ruleExpression ) ) )* )? otherlv_28= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\23\uffff";
    static final String DFA40_eofS =
        "\23\uffff";
    static final String DFA40_minS =
        "\2\4\17\uffff\1\4\1\uffff";
    static final String DFA40_maxS =
        "\2\124\17\uffff\1\124\1\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\uffff\1\1";
    static final String DFA40_specialS =
        "\23\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\16\5\20\7\uffff\1\1\4\uffff\1\20\2\16\43\uffff\1\20\1\uffff"+
            "\1\2\2\uffff\1\15\1\3\1\uffff\1\4\1\5\1\6\1\uffff\1\7\1\10\1"+
            "\11\1\12\1\13\1\uffff\1\14\2\uffff\1\17\3\20",
            "\1\21\5\22\7\uffff\2\22\3\uffff\3\22\33\uffff\1\22\3\uffff"+
            "\5\22\1\uffff\1\22\1\uffff\3\22\1\uffff\3\22\1\uffff\5\22\1"+
            "\uffff\1\22\2\uffff\4\22",
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
            "\6\22\5\uffff\1\22\1\uffff\3\22\1\uffff\4\22\1\20\43\22\1"+
            "\uffff\1\22\1\uffff\3\22\1\uffff\3\22\1\uffff\5\22\1\uffff\1"+
            "\22\2\uffff\4\22",
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
            return "2819:1: (this_BlockExpression_0= ruleBlockExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_IfExpression_2= ruleIfExpression | this_WhileExpression_3= ruleWhileExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_ForLoopExpression_5= ruleForLoopExpression | this_ReturnExpression_6= ruleReturnExpression | this_BreakExpression_7= ruleBreakExpression | this_ContinueExpression_8= ruleContinueExpression | this_ThrowExpression_9= ruleThrowExpression | this_TryCatchExpression_10= ruleTryCatchExpression | this_SwitchExpression_11= ruleSwitchExpression | this_FunctionExpression_12= ruleFunctionExpression | this_FeatureCall_13= ruleFeatureCall | this_ConstructorCall_14= ruleConstructorCall | this_Literal_15= ruleLiteral )";
        }
    }
    static final String DFA52_eotS =
        "\114\uffff";
    static final String DFA52_eofS =
        "\1\41\113\uffff";
    static final String DFA52_minS =
        "\1\4\40\0\53\uffff";
    static final String DFA52_maxS =
        "\1\124\40\0\53\uffff";
    static final String DFA52_acceptS =
        "\41\uffff\1\2\51\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\53\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\1\34\1\36\1\32\1\37\1\33\5\uffff\1\41\1\uffff\1\11\4\41"+
            "\1\35\1\2\1\3\1\41\1\uffff\31\41\1\5\3\41\1\4\1\6\1\7\1\10\1"+
            "\40\1\41\1\12\2\41\1\25\1\13\1\41\1\14\1\15\1\16\1\uffff\1\17"+
            "\1\20\1\21\1\22\1\23\1\41\1\24\2\41\1\26\1\27\1\30\1\31",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3964:1: ( ( ( ruleExpression ) )=> (lv_expression_2_0= ruleExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_4 = input.LA(1);

                         
                        int index52_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_5 = input.LA(1);

                         
                        int index52_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_11 = input.LA(1);

                         
                        int index52_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA52_12 = input.LA(1);

                         
                        int index52_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA52_13 = input.LA(1);

                         
                        int index52_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA52_14 = input.LA(1);

                         
                        int index52_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA52_15 = input.LA(1);

                         
                        int index52_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA52_16 = input.LA(1);

                         
                        int index52_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA52_17 = input.LA(1);

                         
                        int index52_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA52_18 = input.LA(1);

                         
                        int index52_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA52_19 = input.LA(1);

                         
                        int index52_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA52_20 = input.LA(1);

                         
                        int index52_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA52_21 = input.LA(1);

                         
                        int index52_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA52_22 = input.LA(1);

                         
                        int index52_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA52_23 = input.LA(1);

                         
                        int index52_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA52_24 = input.LA(1);

                         
                        int index52_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA52_25 = input.LA(1);

                         
                        int index52_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA52_26 = input.LA(1);

                         
                        int index52_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA52_27 = input.LA(1);

                         
                        int index52_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA52_28 = input.LA(1);

                         
                        int index52_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA52_29 = input.LA(1);

                         
                        int index52_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA52_30 = input.LA(1);

                         
                        int index52_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA52_31 = input.LA(1);

                         
                        int index52_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA52_32 = input.LA(1);

                         
                        int index52_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index52_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\114\uffff";
    static final String DFA62_eofS =
        "\1\2\113\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\112\uffff";
    static final String DFA62_maxS =
        "\1\124\1\0\112\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\110\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\112\uffff}>";
    static final String[] DFA62_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\11\2\1\uffff\43\2\1\1\10\2\1\uffff"+
            "\15\2",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "4614:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_2_0= '(' ) ) ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_InternalHaxe()) ) {s = 75;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\14\uffff";
    static final String DFA65_eofS =
        "\5\uffff\1\6\6\uffff";
    static final String DFA65_minS =
        "\1\5\4\uffff\1\4\4\uffff\1\4\1\0";
    static final String DFA65_maxS =
        "\1\124\4\uffff\1\124\4\uffff\1\30\1\0";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\2\uffff";
    static final String DFA65_specialS =
        "\13\uffff\1\0}>";
    static final String[] DFA65_transitionS = {
            "\1\5\1\6\1\3\1\7\1\4\7\uffff\1\11\4\uffff\1\4\45\uffff\1\10"+
            "\25\uffff\2\1\1\2",
            "",
            "",
            "",
            "",
            "\6\6\5\uffff\1\6\1\uffff\5\6\1\12\3\6\1\uffff\54\6\1\uffff"+
            "\15\6",
            "",
            "",
            "",
            "",
            "\1\6\1\13\21\uffff\2\6",
            "\1\uffff"
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "4800:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NullLiteral_1= ruleNullLiteral | this_StringLiteral_2= ruleStringLiteral | this_FloatLiteral_3= ruleFloatLiteral | this_IntLiteral_4= ruleIntLiteral | this_RegularExpressionLiteral_5= ruleRegularExpressionLiteral | this_ArrayLiteral_6= ruleArrayLiteral | this_ObjectLiteral_7= ruleObjectLiteral )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalHaxe()) ) {s = 4;}

                        else if ( (synpred129_InternalHaxe()) ) {s = 6;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackage136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage169 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleClass_in_rulePackage192 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleClass278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClass311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleClassMember_in_ruleClass332 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_18_in_ruleClass345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMember_in_entryRuleClassMember381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMember391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemberDeclaration_in_ruleClassMember441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableMemberDeclaration_in_ruleClassMember471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeReference568 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTypeReference589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleTypeReference611 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTypeReference624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleTypeReference645 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleTypeReference659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName756 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName797 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureID_in_entryRuleFeatureID940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureID951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureID998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureID1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFeatureID1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_entryRuleFormalParameter1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParameter1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFormalParameter1139 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFormalParameter1152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleFormalParameter1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression1271 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExpression1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureID_in_ruleAssignment1396 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleAssignment1415 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignment1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAssignment1468 = new BitSet(new long[]{0x0000003FF8000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleAssignment1520 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignment1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpMultiAssign1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMultiAssign1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMultiAssign1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMultiAssign1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMultiAssign1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMultiAssign1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMultiAssign1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMultiAssign1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMultiAssign1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2010 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleOrExpression2062 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2085 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOr2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression2271 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleAndExpression2323 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleAndExpression2346 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAnd2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression2472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherOperatorExpression2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression2532 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression2584 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleOtherOperatorExpression2607 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression2793 = new BitSet(new long[]{0x00001E0000280002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleCompareExpression2845 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_ruleCompareExpression2868 = new BitSet(new long[]{0x00001E0000280002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpCompare2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpCompare3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpCompare3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpCompare3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_entryRuleBitwiseExpression3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseExpression3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression3151 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_ruleBitwiseExpression3203 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_ruleBitwiseExpression3226 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_entryRuleOpBitwise3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpBitwise3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpBitwise3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpBitwise3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpBitwise3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_entryRuleBitshiftExpression3392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitshiftExpression3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleBitshiftExpression3452 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_ruleBitshiftExpression3504 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleBitshiftExpression3527 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_entryRuleOpBitshift3566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpBitshift3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpBitshift3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpBitshift3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpBitshift3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_ruleAddExpression3753 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleAddExpression3805 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_ruleAddExpression3828 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpAdd3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_entryRuleSubtractExpression3954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtractExpression3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression4014 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_ruleSubtractExpression4066 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_ruleSubtractExpression4089 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_entryRuleOpSubtract4128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSubtract4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpSubtract4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_entryRuleMultiplyExpression4215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplyExpression4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression4275 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_ruleMultiplyExpression4327 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_ruleMultiplyExpression4350 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_entryRuleOpMultiply4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiply4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOpMultiply4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_entryRuleDivideExpression4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivideExpression4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_ruleDivideExpression4536 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_ruleDivideExpression4588 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_ruleDivideExpression4611 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_entryRuleOpDivide4650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDivide4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOpDivide4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_entryRuleModuloExpression4737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuloExpression4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleModuloExpression4797 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_ruleModuloExpression4849 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleModuloExpression4872 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_entryRuleOpModulo4911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpModulo4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOpModulo4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleUnaryOperation5067 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_ruleUnaryOperation5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpUnary5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpUnary5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpUnary5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementOperation_in_entryRulePreIncrementOperation5283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreIncrementOperation5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_rulePreIncrementOperation5379 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_rulePreIncrementOperation5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementOperation_in_entryRulePostIncrementOperation5468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostIncrementOperation5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation5564 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_rulePostIncrementOperation5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_rulePostIncrementOperation5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_entryRuleOpIncrement5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpIncrement5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOpIncrement5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOpIncrement5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall5762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberFeatureCall5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall5822 = new BitSet(new long[]{0x1000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMemberFeatureCall5874 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_ruleFeatureID_in_ruleMemberFeatureCall5901 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall5920 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleMemberFeatureCall5942 = new BitSet(new long[]{0x1000000000400002L});
    public static final BitSet FOLLOW_60_in_ruleMemberFeatureCall6003 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6024 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleMemberFeatureCall6036 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleMemberFeatureCall6055 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleMemberFeatureCall6077 = new BitSet(new long[]{0x1000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMemberFeatureCall6123 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_ruleFeatureID_in_ruleMemberFeatureCall6152 = new BitSet(new long[]{0x5000000000400002L});
    public static final BitSet FOLLOW_62_in_ruleMemberFeatureCall6186 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6221 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMemberFeatureCall6234 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6255 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleMemberFeatureCall6271 = new BitSet(new long[]{0x1000000000400002L});
    public static final BitSet FOLLOW_60_in_ruleMemberFeatureCall6313 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6334 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleMemberFeatureCall6346 = new BitSet(new long[]{0x5000000000400002L});
    public static final BitSet FOLLOW_62_in_ruleMemberFeatureCall6380 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6415 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMemberFeatureCall6428 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall6449 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleMemberFeatureCall6465 = new BitSet(new long[]{0x1000000000400002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_rulePrimaryExpression6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_rulePrimaryExpression6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_rulePrimaryExpression6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileExpression_in_rulePrimaryExpression6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoopExpression_in_rulePrimaryExpression6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnExpression_in_rulePrimaryExpression6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakExpression_in_rulePrimaryExpression6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueExpression_in_rulePrimaryExpression6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowExpression_in_rulePrimaryExpression6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryCatchExpression_in_rulePrimaryExpression6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_rulePrimaryExpression6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_rulePrimaryExpression6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorCall_in_rulePrimaryExpression6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression7051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBlockExpression7110 = new BitSet(new long[]{0x5F10000001C603F0L,0x00000000001E5F77L});
    public static final BitSet FOLLOW_ruleExpressionInsideBlock_in_ruleBlockExpression7132 = new BitSet(new long[]{0x5F10000001C683F0L,0x00000000001E5F77L});
    public static final BitSet FOLLOW_15_in_ruleBlockExpression7145 = new BitSet(new long[]{0x5F10000001C603F0L,0x00000000001E5F77L});
    public static final BitSet FOLLOW_18_in_ruleBlockExpression7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionInsideBlock_in_entryRuleExpressionInsideBlock7197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionInsideBlock7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarations_in_ruleExpressionInsideBlock7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionInsideBlock7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarations_in_entryRuleVariableDeclarations7322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarations7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVariableDeclarations7381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations7402 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVariableDeclarations7415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDeclarations7436 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration7474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVariableDeclaration7542 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleVariableDeclaration7555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleVariableDeclaration7576 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleVariableDeclaration7591 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableMemberDeclaration_in_entryRuleVariableMemberDeclaration7650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableMemberDeclaration7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVariableMemberDeclaration7709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleVariableMemberDeclaration7730 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariableMemberDeclaration7742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleVariableMemberDeclaration7763 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleVariableMemberDeclaration7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionMemberDeclaration_in_entryRuleFunctionMemberDeclaration7814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionMemberDeclaration7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFunctionMemberDeclaration7873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFunctionMemberDeclaration7894 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleFunctionMemberDeclaration7906 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleFunctionMemberDeclaration7928 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionMemberDeclaration7941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleFunctionMemberDeclaration7962 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleFunctionMemberDeclaration7978 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionMemberDeclaration7991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionMemberDeclaration8018 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleFunctionMemberDeclaration8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression8077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleParenthesizedExpression8124 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression8149 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleParenthesizedExpression8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIfExpression8255 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleIfExpression8267 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression8288 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleIfExpression8300 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression8321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleIfExpression8342 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression8402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileExpression8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleWhileExpression8461 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleWhileExpression8473 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileExpression8494 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleWhileExpression8506 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileExpression8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhileExpression_in_entryRuleDoWhileExpression8563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileExpression8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDoWhileExpression8622 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileExpression8643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDoWhileExpression8655 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleDoWhileExpression8667 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileExpression8688 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDoWhileExpression8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoopExpression_in_entryRuleForLoopExpression8736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForLoopExpression8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleForLoopExpression8836 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleForLoopExpression8848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleForLoopExpression8869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleForLoopExpression8881 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopExpression8902 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleForLoopExpression8914 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopExpression8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnExpression_in_entryRuleReturnExpression8973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnExpression8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleReturnExpression9032 = new BitSet(new long[]{0x5F10000001C203F2L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnExpression9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakExpression_in_entryRuleBreakExpression9100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakExpression9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBreakExpression9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueExpression_in_entryRuleContinueExpression9195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueExpression9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleContinueExpression9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowExpression_in_entryRuleThrowExpression9290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrowExpression9300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleThrowExpression9349 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleThrowExpression9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryCatchExpression_in_entryRuleTryCatchExpression9406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryCatchExpression9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTryCatchExpression9465 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTryCatchExpression9486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleCatchClause_in_ruleTryCatchExpression9514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleCatchClause_in_entryRuleCatchClause9551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCatchClause9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCatchClause9606 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCatchClause9619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleCatchClause9640 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCatchClause9652 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCatchClause9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression9709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchExpression9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSwitchExpression9768 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression9789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSwitchExpression9801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCasePart_in_ruleSwitchExpression9829 = new BitSet(new long[]{0x0000000000040000L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleSwitchExpression9843 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSwitchExpression9855 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression9876 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitchExpression9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCasePart_in_entryRuleCasePart9926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCasePart9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCasePart9981 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCasePart10003 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleCasePart10016 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCasePart10037 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCasePart10051 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCasePart10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression10108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionExpression10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFunctionExpression10167 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleFunctionExpression10179 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleFunctionExpression10201 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionExpression10214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalParameter_in_ruleFunctionExpression10235 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleFunctionExpression10251 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionExpression10264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionExpression10291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleFunctionExpression10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall10354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureID_in_ruleFeatureCall10428 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleFeatureCall10462 = new BitSet(new long[]{0xDF10000001D203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10496 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFeatureCall10510 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10531 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleFeatureCall10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorCall_in_entryRuleConstructorCall10583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorCall10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleConstructorCall10642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConstructorCall10669 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleConstructorCall10681 = new BitSet(new long[]{0xDF10000001D203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorCall10702 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructorCall10716 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorCall10737 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleConstructorCall10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral10787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpressionLiteral_in_ruleLiteral10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectLiteral_in_ruleLiteral11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBooleanLiteral11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleBooleanLiteral11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral11236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleNullLiteral11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleIntLiteral11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral11444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleFloatLiteral11512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpressionLiteral_in_entryRuleRegularExpressionLiteral11653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularExpressionLiteral11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleRegularExpressionLiteral11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral11758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleArrayLiteral11817 = new BitSet(new long[]{0x7F10000001D203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral11838 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayLiteral11852 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral11873 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_61_in_ruleArrayLiteral11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectLiteral_in_entryRuleObjectLiteral11923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectLiteral11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleObjectLiteral11982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectElement_in_ruleObjectLiteral12003 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20_in_ruleObjectLiteral12016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectElement_in_ruleObjectLiteral12037 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleObjectLiteral12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectElement_in_entryRuleObjectElement12087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectElement12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleObjectElement12143 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectElement12155 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleObjectElement12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat12219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat12230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EFLOAT_in_ruleFloat12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat12301 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFloat12319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFloat12360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat12375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred12_InternalHaxe1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred15_InternalHaxe1520 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred15_InternalHaxe1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred27_InternalHaxe2062 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAndExpression_in_synpred27_InternalHaxe2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred29_InternalHaxe2323 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_synpred29_InternalHaxe2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred31_InternalHaxe2584 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_synpred31_InternalHaxe2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred33_InternalHaxe2845 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleBitwiseExpression_in_synpred33_InternalHaxe2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpBitwise_in_synpred40_InternalHaxe3203 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleBitshiftExpression_in_synpred40_InternalHaxe3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpBitshift_in_synpred44_InternalHaxe3504 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAddExpression_in_synpred44_InternalHaxe3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred48_InternalHaxe3805 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleSubtractExpression_in_synpred48_InternalHaxe3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSubtract_in_synpred50_InternalHaxe4066 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleMultiplyExpression_in_synpred50_InternalHaxe4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiply_in_synpred52_InternalHaxe4327 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleDivideExpression_in_synpred52_InternalHaxe4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDivide_in_synpred54_InternalHaxe4588 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleModuloExpression_in_synpred54_InternalHaxe4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpModulo_in_synpred56_InternalHaxe4849 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_synpred56_InternalHaxe4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_synpred63_InternalHaxe5564 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleOpIncrement_in_synpred63_InternalHaxe5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred66_InternalHaxe5874 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_ruleFeatureID_in_synpred66_InternalHaxe5901 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred66_InternalHaxe5920 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred66_InternalHaxe5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred68_InternalHaxe6003 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred68_InternalHaxe6024 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred68_InternalHaxe6036 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred68_InternalHaxe6055 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred68_InternalHaxe6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred73_InternalHaxe6186 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred73_InternalHaxe6221 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred73_InternalHaxe6234 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred73_InternalHaxe6255 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_synpred73_InternalHaxe6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred74_InternalHaxe6123 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_ruleFeatureID_in_synpred74_InternalHaxe6152 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred74_InternalHaxe6186 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred74_InternalHaxe6221 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred74_InternalHaxe6234 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred74_InternalHaxe6255 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_synpred74_InternalHaxe6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred79_InternalHaxe6380 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred79_InternalHaxe6415 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred79_InternalHaxe6428 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred79_InternalHaxe6449 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_synpred79_InternalHaxe6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred80_InternalHaxe6313 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred80_InternalHaxe6334 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred80_InternalHaxe6346 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred80_InternalHaxe6380 = new BitSet(new long[]{0xDF10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred80_InternalHaxe6415 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred80_InternalHaxe6428 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred80_InternalHaxe6449 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_synpred80_InternalHaxe6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred107_InternalHaxe8342 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred107_InternalHaxe8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred109_InternalHaxe9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred110_InternalHaxe9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_synpred112_InternalHaxe9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred122_InternalHaxe10462 = new BitSet(new long[]{0xDF10000001D203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred122_InternalHaxe10496 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred122_InternalHaxe10510 = new BitSet(new long[]{0x5F10000001C203F0L,0x00000000001E5F76L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred122_InternalHaxe10531 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_63_in_synpred122_InternalHaxe10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_synpred128_InternalHaxe10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_synpred129_InternalHaxe10967 = new BitSet(new long[]{0x0000000000000002L});

}