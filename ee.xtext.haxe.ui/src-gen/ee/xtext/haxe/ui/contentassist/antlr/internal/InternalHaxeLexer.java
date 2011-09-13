package ee.xtext.haxe.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHaxeLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=5;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_EFLOAT=6;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_REGULAR_EXPRESSION=9;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=7;
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
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
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

    public InternalHaxeLexer() {;} 
    public InternalHaxeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalHaxeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:11:7: ( '=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:12:7: ( '||' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:13:7: ( '&&' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:13:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:14:7: ( '...' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:14:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:15:7: ( '+' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:16:7: ( '-' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:17:7: ( '*' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:18:7: ( '/' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:19:7: ( '%' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:19:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20:7: ( 'default' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:21:7: ( 'null' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:21:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:22:7: ( 'dynamic' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:22:9: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:23:7: ( 'never' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:23:9: 'never'
            {
            match("never"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:24:7: ( 'super' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:24:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:25:7: ( 'this' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:25:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:26:7: ( '+=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:26:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:27:7: ( '-=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:27:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:28:7: ( '*=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:28:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:29:7: ( '/=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:29:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:30:7: ( '%=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:30:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:31:7: ( '&=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:31:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:32:7: ( '|=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:32:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:33:7: ( '^=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:33:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:34:7: ( '<<=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:34:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:35:7: ( '>>=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:35:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:36:7: ( '>>>=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:36:9: '>>>='
            {
            match(">>>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:37:7: ( '==' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:37:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:38:7: ( '!=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:38:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:39:7: ( '>=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:39:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:40:7: ( '<=' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:40:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:41:7: ( '>' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:41:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:42:7: ( '<' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:43:7: ( '|' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:43:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:44:7: ( '&' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:44:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:45:7: ( '^' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:45:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:46:7: ( '<<' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:46:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:47:7: ( '>>' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:47:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:48:7: ( '>>>' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:48:9: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:49:7: ( '!' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:49:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:50:7: ( '~' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:50:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:51:7: ( '++' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:51:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:52:7: ( '--' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:52:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:53:7: ( 'false' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:53:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:54:7: ( 'public' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:54:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:55:7: ( 'private' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:55:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:56:7: ( 'package' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:56:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:57:7: ( ';' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:57:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:58:7: ( 'import' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:58:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:59:7: ( 'using' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:59:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:60:7: ( 'class' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:60:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:61:7: ( '{' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:61:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:62:7: ( '}' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:62:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:63:7: ( 'extends' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:63:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:64:7: ( ',' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:64:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:65:7: ( 'implements' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:65:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:66:7: ( 'interface' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:66:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:67:7: ( 'enum' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:67:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:68:7: ( '(' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:68:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:69:7: ( ')' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:69:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:70:7: ( 'typedef' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:70:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:71:7: ( ':' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:71:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:72:7: ( 'var' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:72:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:73:7: ( 'function' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:73:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:74:7: ( 'new' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:74:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:75:7: ( '.*' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:75:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:76:7: ( '.' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:76:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:77:7: ( '[' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:77:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:78:7: ( ']' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:78:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:79:7: ( 'if' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:79:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:80:7: ( 'else' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:80:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:81:7: ( 'while' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:81:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:82:7: ( 'do' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:82:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:83:7: ( 'for' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:83:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:84:7: ( 'in' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:84:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:85:7: ( 'return' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:85:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:86:7: ( 'break' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:86:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:87:7: ( 'continue' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:87:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:88:7: ( 'throw' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:88:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:89:7: ( 'try' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:89:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:90:7: ( 'catch' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:90:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:91:7: ( 'switch' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:91:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:92:7: ( 'case' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:92:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:93:7: ( '?' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:93:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:94:7: ( 'static' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:94:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:95:7: ( 'final' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:95:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:96:7: ( 'override' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:96:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:97:8: ( 'inline' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:97:10: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:98:8: ( 'true' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:98:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_EFLOAT"
    public final void mRULE_EFLOAT() throws RecognitionException {
        try {
            int _type = RULE_EFLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20895:13: ( RULE_INT 'e' ( '-' )? RULE_INT )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20895:15: RULE_INT 'e' ( '-' )? RULE_INT
            {
            mRULE_INT(); 
            match('e'); 
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20895:28: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20895:28: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EFLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20897:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20897:11: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20897:39: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20899:10: ( '0x' ( '0' .. '9' | 'A' .. 'F' )+ )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20899:12: '0x' ( '0' .. '9' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20899:17: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20901:10: ( ( '0' .. '9' )+ )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20901:12: ( '0' .. '9' )+
            {
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20901:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20901:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_REGULAR_EXPRESSION"
    public final void mRULE_REGULAR_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:25: ( '~/' ( '\\\\/' | ~ ( '/' ) )+ '/' ( 'i' | 'g' | 'm' | 's' | 'u' )* )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:27: '~/' ( '\\\\/' | ~ ( '/' ) )+ '/' ( 'i' | 'g' | 'm' | 's' | 'u' )*
            {
            match("~/"); 

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:32: ( '\\\\/' | ~ ( '/' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:33: '\\\\/'
            	    {
            	    match("\\/"); 


            	    }
            	    break;
            	case 2 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:39: ~ ( '/' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('/'); 
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20903:52: ( 'i' | 'g' | 'm' | 's' | 'u' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='g'||LA6_0=='i'||LA6_0=='m'||LA6_0=='s'||LA6_0=='u') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:
            	    {
            	    if ( input.LA(1)=='g'||input.LA(1)=='i'||input.LA(1)=='m'||input.LA(1)=='s'||input.LA(1)=='u' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGULAR_EXPRESSION"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20905:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20907:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20907:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20907:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20907:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:41: ( '\\r' )? '\\n'
                    {
                    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20909:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20911:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20911:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20911:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20913:16: ( . )
            // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:20913:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_EFLOAT | RULE_ID | RULE_HEX | RULE_INT | RULE_REGULAR_EXPRESSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=98;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:540: RULE_EFLOAT
                {
                mRULE_EFLOAT(); 

                }
                break;
            case 90 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:552: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 91 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:560: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 92 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:569: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 93 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:578: RULE_REGULAR_EXPRESSION
                {
                mRULE_REGULAR_EXPRESSION(); 

                }
                break;
            case 94 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:602: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 95 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:614: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 96 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:630: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 97 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:646: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 98 :
                // ../ee.xtext.haxe.ui/src-gen/ee/xtext/haxe/ui/contentassist/antlr/internal/InternalHaxe.g:1:654: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA5_eotS =
        "\4\uffff\2\3\1\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\3\1\uffff\1\2\2\uffff\1\1";
    static final String DFA5_specialS =
        "\1\3\1\uffff\1\2\1\uffff\1\1\1\0\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\57\3\1\1\54\3\1\2\uffa3\3",
            "",
            "\57\3\1\4\uffd0\3",
            "",
            "\147\6\1\5\1\6\1\5\3\6\1\5\5\6\1\5\1\6\1\5\uff8a\6",
            "\147\6\1\5\1\6\1\5\3\6\1\5\5\6\1\5\1\6\1\5\uff8a\6",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()+ loopback of 20903:32: ( '\\\\/' | ~ ( '/' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_5 = input.LA(1);

                        s = -1;
                        if ( (LA5_5=='g'||LA5_5=='i'||LA5_5=='m'||LA5_5=='s'||LA5_5=='u') ) {s = 5;}

                        else if ( ((LA5_5>='\u0000' && LA5_5<='f')||LA5_5=='h'||(LA5_5>='j' && LA5_5<='l')||(LA5_5>='n' && LA5_5<='r')||LA5_5=='t'||(LA5_5>='v' && LA5_5<='\uFFFF')) ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_4 = input.LA(1);

                        s = -1;
                        if ( (LA5_4=='g'||LA5_4=='i'||LA5_4=='m'||LA5_4=='s'||LA5_4=='u') ) {s = 5;}

                        else if ( ((LA5_4>='\u0000' && LA5_4<='f')||LA5_4=='h'||(LA5_4>='j' && LA5_4<='l')||(LA5_4>='n' && LA5_4<='r')||LA5_4=='t'||(LA5_4>='v' && LA5_4<='\uFFFF')) ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_2 = input.LA(1);

                        s = -1;
                        if ( (LA5_2=='/') ) {s = 4;}

                        else if ( ((LA5_2>='\u0000' && LA5_2<='.')||(LA5_2>='0' && LA5_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='/') ) {s = 1;}

                        else if ( (LA5_0=='\\') ) {s = 2;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\60\1\63\1\66\1\71\1\74\1\77\1\101\1\105\1\107\4\113"+
        "\1\125\1\130\1\133\1\135\1\137\2\113\1\uffff\3\113\2\uffff\1\113"+
        "\4\uffff\1\113\2\uffff\3\113\1\uffff\1\113\1\u0081\1\uffff\1\u0081"+
        "\2\56\33\uffff\2\113\1\u0088\1\uffff\10\113\2\uffff\1\u0095\2\uffff"+
        "\1\u0098\6\uffff\7\113\1\uffff\1\113\1\u00a3\1\u00a4\4\113\2\uffff"+
        "\3\113\4\uffff\1\113\2\uffff\3\113\1\uffff\1\113\3\uffff\1\u0081"+
        "\2\uffff\2\113\1\uffff\2\113\1\u00b6\6\113\1\u00bd\1\113\3\uffff"+
        "\1\u00c0\1\uffff\2\113\1\u00c3\7\113\2\uffff\10\113\1\u00d4\6\113"+
        "\1\u00db\1\113\1\uffff\3\113\1\u00e0\2\113\1\uffff\1\u00e3\2\uffff"+
        "\2\113\1\uffff\14\113\1\u00f2\1\113\1\u00f4\1\u00f5\1\uffff\6\113"+
        "\1\uffff\1\u00fc\1\u00fd\2\113\1\uffff\1\u0100\1\113\1\uffff\1\u0102"+
        "\1\113\1\u0104\7\113\1\u010c\1\u010d\1\113\1\u010f\1\uffff\1\113"+
        "\2\uffff\1\u0111\1\113\1\u0113\3\113\2\uffff\1\u0117\1\u0118\1\uffff"+
        "\1\113\1\uffff\1\113\1\uffff\1\u011b\2\113\1\u011e\2\113\1\u0121"+
        "\2\uffff\1\113\1\uffff\1\113\1\uffff\1\u0124\1\uffff\1\113\1\u0126"+
        "\1\u0127\2\uffff\1\u0128\1\113\1\uffff\1\u012a\1\u012b\1\uffff\2"+
        "\113\1\uffff\1\113\1\u012f\1\uffff\1\113\3\uffff\1\u0131\2\uffff"+
        "\2\113\1\u0134\1\uffff\1\u0135\1\uffff\1\113\1\u0137\2\uffff\1\u0138"+
        "\2\uffff";
    static final String DFA15_eofS =
        "\u0139\uffff";
    static final String DFA15_minS =
        "\1\0\2\75\1\46\1\52\1\53\1\55\1\75\1\52\1\75\2\145\1\164\1\150"+
        "\1\75\1\74\2\75\1\57\2\141\1\uffff\1\146\1\163\1\141\2\uffff\1\154"+
        "\4\uffff\1\141\2\uffff\1\150\1\145\1\162\1\uffff\1\166\1\60\1\uffff"+
        "\1\60\2\0\33\uffff\1\146\1\156\1\44\1\uffff\1\154\1\166\1\160\1"+
        "\151\1\141\1\151\1\160\1\165\2\uffff\1\75\2\uffff\1\75\6\uffff\1"+
        "\154\1\156\1\162\1\156\1\142\1\151\1\143\1\uffff\1\160\2\44\1\151"+
        "\1\141\1\156\1\163\2\uffff\1\164\1\165\1\163\4\uffff\1\162\2\uffff"+
        "\1\151\1\164\1\145\1\uffff\1\145\3\uffff\1\60\2\uffff\2\141\1\uffff"+
        "\1\154\1\145\1\44\1\145\2\164\1\163\1\157\1\145\1\44\1\145\3\uffff"+
        "\1\75\1\uffff\1\163\1\143\1\44\1\141\1\154\1\166\1\153\1\154\1\145"+
        "\1\151\2\uffff\1\156\1\163\1\164\1\143\2\145\1\155\1\145\1\44\1"+
        "\154\1\165\1\141\1\162\1\165\1\155\1\44\1\162\1\uffff\1\162\1\143"+
        "\1\151\1\44\1\167\1\144\1\uffff\1\44\2\uffff\1\145\1\164\1\uffff"+
        "\1\154\1\151\2\141\1\162\1\145\1\162\1\156\1\147\1\163\1\151\1\150"+
        "\1\44\1\156\2\44\1\uffff\1\145\1\162\1\153\1\162\1\154\1\151\1\uffff"+
        "\2\44\1\150\1\143\1\uffff\1\44\1\145\1\uffff\1\44\1\151\1\44\1\143"+
        "\1\164\1\147\1\164\1\155\1\146\1\145\2\44\1\156\1\44\1\uffff\1\144"+
        "\2\uffff\1\44\1\156\1\44\1\151\1\164\1\143\2\uffff\2\44\1\uffff"+
        "\1\146\1\uffff\1\157\1\uffff\1\44\2\145\1\44\1\145\1\141\1\44\2"+
        "\uffff\1\165\1\uffff\1\163\1\uffff\1\44\1\uffff\1\144\2\44\2\uffff"+
        "\1\44\1\156\1\uffff\2\44\1\uffff\1\156\1\143\1\uffff\1\145\1\44"+
        "\1\uffff\1\145\3\uffff\1\44\2\uffff\1\164\1\145\1\44\1\uffff\1\44"+
        "\1\uffff\1\163\1\44\2\uffff\1\44\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\75\1\174\1\75\1\56\5\75\1\171\1\165\1\167\1\171\2\75"+
        "\1\76\1\75\1\57\2\165\1\uffff\1\156\1\163\1\157\2\uffff\1\170\4"+
        "\uffff\1\141\2\uffff\1\150\1\145\1\162\1\uffff\1\166\1\170\1\uffff"+
        "\1\145\2\uffff\33\uffff\1\146\1\156\1\172\1\uffff\1\154\1\167\1"+
        "\160\1\151\1\141\1\162\1\160\1\171\2\uffff\1\75\2\uffff\1\76\6\uffff"+
        "\1\154\1\156\1\162\1\156\1\142\1\151\1\143\1\uffff\1\160\2\172\1"+
        "\151\1\141\1\156\1\164\2\uffff\1\164\1\165\1\163\4\uffff\1\162\2"+
        "\uffff\1\151\1\164\1\145\1\uffff\1\145\3\uffff\1\145\2\uffff\2\141"+
        "\1\uffff\1\154\1\145\1\172\1\145\2\164\1\163\1\157\1\145\1\172\1"+
        "\145\3\uffff\1\75\1\uffff\1\163\1\143\1\172\1\141\1\154\1\166\1"+
        "\153\1\157\1\145\1\151\2\uffff\1\156\1\163\1\164\1\143\2\145\1\155"+
        "\1\145\1\172\1\154\1\165\1\141\1\162\1\165\1\155\1\172\1\162\1\uffff"+
        "\1\162\1\143\1\151\1\172\1\167\1\144\1\uffff\1\172\2\uffff\1\145"+
        "\1\164\1\uffff\1\154\1\151\2\141\1\162\1\145\1\162\1\156\1\147\1"+
        "\163\1\151\1\150\1\172\1\156\2\172\1\uffff\1\145\1\162\1\153\1\162"+
        "\1\154\1\151\1\uffff\2\172\1\150\1\143\1\uffff\1\172\1\145\1\uffff"+
        "\1\172\1\151\1\172\1\143\1\164\1\147\1\164\1\155\1\146\1\145\2\172"+
        "\1\156\1\172\1\uffff\1\144\2\uffff\1\172\1\156\1\172\1\151\1\164"+
        "\1\143\2\uffff\2\172\1\uffff\1\146\1\uffff\1\157\1\uffff\1\172\2"+
        "\145\1\172\1\145\1\141\1\172\2\uffff\1\165\1\uffff\1\163\1\uffff"+
        "\1\172\1\uffff\1\144\2\172\2\uffff\1\172\1\156\1\uffff\2\172\1\uffff"+
        "\1\156\1\143\1\uffff\1\145\1\172\1\uffff\1\145\3\uffff\1\172\2\uffff"+
        "\1\164\1\145\1\172\1\uffff\1\172\1\uffff\1\163\1\172\2\uffff\1\172"+
        "\2\uffff";
    static final String DFA15_acceptS =
        "\25\uffff\1\57\3\uffff\1\63\1\64\1\uffff\1\66\1\72\1\73\1\75\1"+
        "\uffff\1\103\1\104\3\uffff\1\123\2\uffff\1\132\3\uffff\1\141\1\142"+
        "\1\33\1\1\1\2\1\26\1\41\1\3\1\25\1\42\1\4\1\101\1\102\1\20\1\51"+
        "\1\5\1\21\1\52\1\6\1\22\1\7\1\23\1\137\1\140\1\10\1\24\1\11\3\uffff"+
        "\1\132\10\uffff\1\27\1\43\1\uffff\1\36\1\40\1\uffff\1\35\1\37\1"+
        "\34\1\47\1\135\1\50\7\uffff\1\57\7\uffff\1\63\1\64\3\uffff\1\66"+
        "\1\72\1\73\1\75\1\uffff\1\103\1\104\3\uffff\1\123\1\uffff\1\133"+
        "\1\134\1\131\1\uffff\1\136\1\141\2\uffff\1\110\13\uffff\1\30\1\44"+
        "\1\31\1\uffff\1\45\12\uffff\1\112\1\105\21\uffff\1\100\6\uffff\1"+
        "\117\1\uffff\1\32\1\46\2\uffff\1\111\20\uffff\1\76\6\uffff\1\13"+
        "\4\uffff\1\17\2\uffff\1\130\16\uffff\1\122\1\uffff\1\71\1\106\6"+
        "\uffff\1\15\1\16\2\uffff\1\116\1\uffff\1\53\1\uffff\1\125\7\uffff"+
        "\1\61\1\62\1\uffff\1\120\1\uffff\1\107\1\uffff\1\114\3\uffff\1\121"+
        "\1\124\2\uffff\1\54\2\uffff\1\60\2\uffff\1\127\2\uffff\1\113\1\uffff"+
        "\1\12\1\14\1\74\1\uffff\1\55\1\56\3\uffff\1\65\1\uffff\1\77\2\uffff"+
        "\1\115\1\126\1\uffff\1\70\1\67";
    static final String DFA15_specialS =
        "\1\1\52\uffff\1\0\1\2\u010c\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\21\1\53\1\56\1\51\1\11\1"+
            "\3\1\54\1\35\1\36\1\7\1\5\1\34\1\6\1\4\1\10\1\50\11\52\1\37"+
            "\1\25\1\17\1\1\1\20\1\46\1\56\32\51\1\41\1\56\1\42\1\16\1\51"+
            "\1\56\1\51\1\45\1\30\1\12\1\33\1\23\2\51\1\26\4\51\1\13\1\47"+
            "\1\24\1\51\1\44\1\14\1\15\1\27\1\40\1\43\3\51\1\31\1\2\1\32"+
            "\1\22\uff81\56",
            "\1\57",
            "\1\62\76\uffff\1\61",
            "\1\64\26\uffff\1\65",
            "\1\70\3\uffff\1\67",
            "\1\73\21\uffff\1\72",
            "\1\76\17\uffff\1\75",
            "\1\100",
            "\1\103\4\uffff\1\104\15\uffff\1\102",
            "\1\106",
            "\1\110\11\uffff\1\112\11\uffff\1\111",
            "\1\115\17\uffff\1\114",
            "\1\120\1\116\1\uffff\1\117",
            "\1\121\11\uffff\1\123\6\uffff\1\122",
            "\1\124",
            "\1\126\1\127",
            "\1\132\1\131",
            "\1\134",
            "\1\136",
            "\1\140\7\uffff\1\143\5\uffff\1\142\5\uffff\1\141",
            "\1\146\20\uffff\1\145\2\uffff\1\144",
            "",
            "\1\152\6\uffff\1\150\1\151",
            "\1\153",
            "\1\156\12\uffff\1\154\2\uffff\1\155",
            "",
            "",
            "\1\163\1\uffff\1\162\11\uffff\1\161",
            "",
            "",
            "",
            "",
            "\1\170",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\177",
            "\12\u0083\53\uffff\1\u0082\22\uffff\1\u0080",
            "",
            "\12\u0083\53\uffff\1\u0082",
            "\0\u0084",
            "\0\u0084",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0089",
            "\1\u008a\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\10\uffff\1\u0090",
            "\1\u0091",
            "\1\u0093\3\uffff\1\u0092",
            "",
            "",
            "\1\u0094",
            "",
            "",
            "\1\u0096\1\u0097",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\13\113\1\u00a2\7\113\1\u00a1\6\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a9\1\u00a8",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "",
            "",
            "\12\u0083\53\uffff\1\u0082",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00be",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c9\2\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00f3",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0101",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0103",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u010e",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0110",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0112",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0119",
            "",
            "\1\u011a",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u011c",
            "\1\u011d",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u011f",
            "\1\u0120",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\u0122",
            "",
            "\1\u0123",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0125",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\u0129",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0130",
            "",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "\1\u0136",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            "",
            "\1\113\13\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff"+
            "\32\113",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_EFLOAT | RULE_ID | RULE_HEX | RULE_INT | RULE_REGULAR_EXPRESSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( ((LA15_43>='\u0000' && LA15_43<='\uFFFF')) ) {s = 132;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0=='|') ) {s = 2;}

                        else if ( (LA15_0=='&') ) {s = 3;}

                        else if ( (LA15_0=='.') ) {s = 4;}

                        else if ( (LA15_0=='+') ) {s = 5;}

                        else if ( (LA15_0=='-') ) {s = 6;}

                        else if ( (LA15_0=='*') ) {s = 7;}

                        else if ( (LA15_0=='/') ) {s = 8;}

                        else if ( (LA15_0=='%') ) {s = 9;}

                        else if ( (LA15_0=='d') ) {s = 10;}

                        else if ( (LA15_0=='n') ) {s = 11;}

                        else if ( (LA15_0=='s') ) {s = 12;}

                        else if ( (LA15_0=='t') ) {s = 13;}

                        else if ( (LA15_0=='^') ) {s = 14;}

                        else if ( (LA15_0=='<') ) {s = 15;}

                        else if ( (LA15_0=='>') ) {s = 16;}

                        else if ( (LA15_0=='!') ) {s = 17;}

                        else if ( (LA15_0=='~') ) {s = 18;}

                        else if ( (LA15_0=='f') ) {s = 19;}

                        else if ( (LA15_0=='p') ) {s = 20;}

                        else if ( (LA15_0==';') ) {s = 21;}

                        else if ( (LA15_0=='i') ) {s = 22;}

                        else if ( (LA15_0=='u') ) {s = 23;}

                        else if ( (LA15_0=='c') ) {s = 24;}

                        else if ( (LA15_0=='{') ) {s = 25;}

                        else if ( (LA15_0=='}') ) {s = 26;}

                        else if ( (LA15_0=='e') ) {s = 27;}

                        else if ( (LA15_0==',') ) {s = 28;}

                        else if ( (LA15_0=='(') ) {s = 29;}

                        else if ( (LA15_0==')') ) {s = 30;}

                        else if ( (LA15_0==':') ) {s = 31;}

                        else if ( (LA15_0=='v') ) {s = 32;}

                        else if ( (LA15_0=='[') ) {s = 33;}

                        else if ( (LA15_0==']') ) {s = 34;}

                        else if ( (LA15_0=='w') ) {s = 35;}

                        else if ( (LA15_0=='r') ) {s = 36;}

                        else if ( (LA15_0=='b') ) {s = 37;}

                        else if ( (LA15_0=='?') ) {s = 38;}

                        else if ( (LA15_0=='o') ) {s = 39;}

                        else if ( (LA15_0=='0') ) {s = 40;}

                        else if ( (LA15_0=='$'||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='m')||LA15_0=='q'||(LA15_0>='x' && LA15_0<='z')) ) {s = 41;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 42;}

                        else if ( (LA15_0=='\"') ) {s = 43;}

                        else if ( (LA15_0=='\'') ) {s = 44;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 45;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='#'||LA15_0=='@'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( ((LA15_44>='\u0000' && LA15_44<='\uFFFF')) ) {s = 132;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}