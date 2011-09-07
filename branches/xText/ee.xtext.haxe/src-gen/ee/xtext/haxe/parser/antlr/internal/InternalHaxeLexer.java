package ee.xtext.haxe.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHaxeLexer extends Lexer {
    public static final int RULE_REGULAR_EXPRESSION=8;
    public static final int RULE_ID=9;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__32=32;
    public static final int RULE_STRING=7;
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
    public String getGrammarFileName() { return "../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:11:7: ( '<' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:11:9: '<'
            {
            match('<'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:12:7: ( ',' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:12:9: ','
            {
            match(','); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:13:7: ( '>' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:13:9: '>'
            {
            match('>'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:14:7: ( '=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:14:9: '='
            {
            match('='); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:15:7: ( '+=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:15:9: '+='
            {
            match("+="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:16:7: ( '-=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:16:9: '-='
            {
            match("-="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:17:7: ( '*=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:17:9: '*='
            {
            match("*="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:18:7: ( '/=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:18:9: '/='
            {
            match("/="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:19:7: ( '%=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:19:9: '%='
            {
            match("%="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:20:7: ( '&=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:20:9: '&='
            {
            match("&="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:21:7: ( '|=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:21:9: '|='
            {
            match("|="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:22:7: ( '^=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:22:9: '^='
            {
            match("^="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:23:7: ( '<<=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:23:9: '<<='
            {
            match("<<="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:24:7: ( '>>=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:24:9: '>>='
            {
            match(">>="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:25:7: ( '>>>=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:25:9: '>>>='
            {
            match(">>>="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:26:7: ( '||' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:26:9: '||'
            {
            match("||"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:27:7: ( '&&' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:27:9: '&&'
            {
            match("&&"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:28:7: ( '...' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:28:9: '...'
            {
            match("..."); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:29:7: ( '==' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:29:9: '=='
            {
            match("=="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:30:7: ( '!=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:30:9: '!='
            {
            match("!="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:31:7: ( '>=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:31:9: '>='
            {
            match(">="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:32:7: ( '<=' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:32:9: '<='
            {
            match("<="); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:33:7: ( '|' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:33:9: '|'
            {
            match('|'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:34:7: ( '&' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:34:9: '&'
            {
            match('&'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:35:7: ( '^' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:35:9: '^'
            {
            match('^'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:36:7: ( '<<' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:36:9: '<<'
            {
            match("<<"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:37:7: ( '>>' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:37:9: '>>'
            {
            match(">>"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:38:7: ( '>>>' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:38:9: '>>>'
            {
            match(">>>"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:39:7: ( '+' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:39:9: '+'
            {
            match('+'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:40:7: ( '-' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:40:9: '-'
            {
            match('-'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:41:7: ( '*' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:41:9: '*'
            {
            match('*'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:42:7: ( '/' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:42:9: '/'
            {
            match('/'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:43:7: ( '%' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:43:9: '%'
            {
            match('%'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:44:7: ( '!' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:44:9: '!'
            {
            match('!'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:45:7: ( '~' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:45:9: '~'
            {
            match('~'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:46:7: ( '++' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:46:9: '++'
            {
            match("++"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:47:7: ( '--' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:47:9: '--'
            {
            match("--"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:48:7: ( '.' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:48:9: '.'
            {
            match('.'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:49:7: ( '(' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:49:9: '('
            {
            match('('); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:50:7: ( ')' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:50:9: ')'
            {
            match(')'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:51:7: ( '{' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:51:9: '{'
            {
            match('{'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:52:7: ( ';' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:52:9: ';'
            {
            match(';'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:53:7: ( '}' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:53:9: '}'
            {
            match('}'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:54:7: ( 'var' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:54:9: 'var'
            {
            match("var"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:55:7: ( ':' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:55:9: ':'
            {
            match(':'); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:56:7: ( 'new' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:56:9: 'new'
            {
            match("new"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:57:7: ( 'super' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:57:9: 'super'
            {
            match("super"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:58:7: ( 'false' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:58:9: 'false'
            {
            match("false"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:59:7: ( 'true' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:59:9: 'true'
            {
            match("true"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:60:7: ( 'null' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:60:9: 'null'
            {
            match("null"); 


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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:61:7: ( '[' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:61:9: '['
            {
            match('['); 

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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:62:7: ( ']' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:62:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3289:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3289:11: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3289:39: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:
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
            	    break loop1;
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

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:12: ( ( RULE_INT 'e' RULE_INT | ( RULE_INT )? '.' RULE_INT ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:14: ( RULE_INT 'e' RULE_INT | ( RULE_INT )? '.' RULE_INT )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:14: ( RULE_INT 'e' RULE_INT | ( RULE_INT )? '.' RULE_INT )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:15: RULE_INT 'e' RULE_INT
                    {
                    mRULE_INT(); 
                    match('e'); 
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:37: ( RULE_INT )? '.' RULE_INT
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:37: ( RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3291:37: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3293:10: ( '0x' ( '0' .. '9' | 'A' .. 'F' )+ )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3293:12: '0x' ( '0' .. '9' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3293:17: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:
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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:12: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:17: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3295:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:25: ( '~/' ( '\\\\/' | ~ ( '/' ) )+ '/' ( 'i' | 'g' | 'm' | 's' | 'u' )* )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:27: '~/' ( '\\\\/' | ~ ( '/' ) )+ '/' ( 'i' | 'g' | 'm' | 's' | 'u' )*
            {
            match("~/"); 

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:32: ( '\\\\/' | ~ ( '/' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:33: '\\\\/'
            	    {
            	    match("\\/"); 


            	    }
            	    break;
            	case 2 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:39: ~ ( '/' )
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('/'); 
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3297:52: ( 'i' | 'g' | 'm' | 's' | 'u' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='g'||LA8_0=='i'||LA8_0=='m'||LA8_0=='s'||LA8_0=='u') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:
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
            	    break loop8;
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3299:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3301:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3301:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3301:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3301:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:41: ( '\\r' )? '\\n'
                    {
                    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3303:41: '\\r'
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3305:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3307:16: ( . )
            // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:3307:18: .
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
        // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_FLOAT | RULE_HEX | RULE_INT | RULE_REGULAR_EXPRESSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=62;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:322: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:330: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 55 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:341: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 56 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:350: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:359: RULE_REGULAR_EXPRESSION
                {
                mRULE_REGULAR_EXPRESSION(); 

                }
                break;
            case 58 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:383: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:395: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:411: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:427: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // ../ee.xtext.haxe/src-gen/ee/xtext/haxe/parser/antlr/internal/InternalHaxe.g:1:435: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA3_eotS =
        "\5\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA3_maxS =
        "\2\71\1\145\2\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2\53\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "3291:14: ( RULE_INT 'e' RULE_INT | ( RULE_INT )? '.' RULE_INT )";
        }
    }
    static final String DFA7_eotS =
        "\4\uffff\2\3\1\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff";
    static final String DFA7_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\3\1\uffff\1\2\2\uffff\1\1";
    static final String DFA7_specialS =
        "\1\3\1\uffff\1\2\1\uffff\1\0\1\1\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\57\3\1\1\54\3\1\2\uffa3\3",
            "",
            "\57\3\1\4\uffd0\3",
            "",
            "\147\6\1\5\1\6\1\5\3\6\1\5\5\6\1\5\1\6\1\5\uff8a\6",
            "\147\6\1\5\1\6\1\5\3\6\1\5\5\6\1\5\1\6\1\5\uff8a\6",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3297:32: ( '\\\\/' | ~ ( '/' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_4 = input.LA(1);

                        s = -1;
                        if ( (LA7_4=='g'||LA7_4=='i'||LA7_4=='m'||LA7_4=='s'||LA7_4=='u') ) {s = 5;}

                        else if ( ((LA7_4>='\u0000' && LA7_4<='f')||LA7_4=='h'||(LA7_4>='j' && LA7_4<='l')||(LA7_4>='n' && LA7_4<='r')||LA7_4=='t'||(LA7_4>='v' && LA7_4<='\uFFFF')) ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_5 = input.LA(1);

                        s = -1;
                        if ( (LA7_5=='g'||LA7_5=='i'||LA7_5=='m'||LA7_5=='s'||LA7_5=='u') ) {s = 5;}

                        else if ( ((LA7_5>='\u0000' && LA7_5<='f')||LA7_5=='h'||(LA7_5>='j' && LA7_5<='l')||(LA7_5>='n' && LA7_5<='r')||LA7_5=='t'||(LA7_5>='v' && LA7_5<='\uFFFF')) ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_2 = input.LA(1);

                        s = -1;
                        if ( (LA7_2=='/') ) {s = 4;}

                        else if ( ((LA7_2>='\u0000' && LA7_2<='.')||(LA7_2>='0' && LA7_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='/') ) {s = 1;}

                        else if ( (LA7_0=='\\') ) {s = 2;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\1\46\1\uffff\1\52\1\54\1\57\1\62\1\65\1\71\1\73\1\76\1"+
        "\101\1\103\1\106\1\110\1\112\5\uffff\1\121\1\uffff\4\121\3\uffff"+
        "\2\133\2\43\2\uffff\1\137\3\uffff\1\142\12\uffff\1\133\34\uffff"+
        "\1\121\2\uffff\5\121\11\uffff\1\152\1\uffff\1\153\1\154\4\121\4"+
        "\uffff\1\161\2\121\1\164\1\uffff\1\165\1\166\3\uffff";
    static final String DFA17_eofS =
        "\167\uffff";
    static final String DFA17_minS =
        "\1\0\1\74\1\uffff\2\75\1\53\1\55\1\75\1\52\1\75\1\46\2\75\1\55"+
        "\1\75\1\57\5\uffff\1\141\1\uffff\1\145\1\165\1\141\1\162\3\uffff"+
        "\2\56\2\0\2\uffff\1\75\3\uffff\1\75\12\uffff\1\56\34\uffff\1\162"+
        "\2\uffff\1\167\1\154\1\160\1\154\1\165\11\uffff\1\75\1\uffff\2\44"+
        "\1\154\1\145\1\163\1\145\4\uffff\1\44\1\162\1\145\1\44\1\uffff\2"+
        "\44\3\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\75\1\uffff\1\76\7\75\1\174\1\75\1\71\1\75\1\57\5\uffff"+
        "\1\141\1\uffff\2\165\1\141\1\162\3\uffff\1\170\1\145\2\uffff\2\uffff"+
        "\1\75\3\uffff\1\76\12\uffff\1\145\34\uffff\1\162\2\uffff\1\167\1"+
        "\154\1\160\1\154\1\165\11\uffff\1\75\1\uffff\2\172\1\154\1\145\1"+
        "\163\1\145\4\uffff\1\172\1\162\1\145\1\172\1\uffff\2\172\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\15\uffff\1\47\1\50\1\51\1\52\1\53\1\uffff\1\55\4\uffff"+
        "\1\63\1\64\1\65\4\uffff\1\75\1\76\1\uffff\1\26\1\1\1\2\1\uffff\1"+
        "\25\1\3\1\23\1\4\1\5\1\44\1\35\1\6\1\45\1\36\1\uffff\1\7\1\37\1"+
        "\10\1\73\1\74\1\40\1\11\1\41\1\12\1\21\1\30\1\13\1\20\1\27\1\14"+
        "\1\31\1\22\1\66\1\46\1\24\1\42\1\71\1\43\1\47\1\50\1\51\1\52\1\53"+
        "\1\uffff\1\65\1\55\5\uffff\1\63\1\64\1\67\1\70\1\72\1\75\1\15\1"+
        "\32\1\16\1\uffff\1\33\6\uffff\1\17\1\34\1\54\1\56\4\uffff\1\62\2"+
        "\uffff\1\61\1\57\1\60";
    static final String DFA17_specialS =
        "\1\0\37\uffff\1\2\1\1\125\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\16\1\40\1\43\1\35\1\11\1"+
            "\12\1\41\1\20\1\21\1\7\1\5\1\2\1\6\1\15\1\10\1\36\11\37\1\26"+
            "\1\23\1\1\1\4\1\3\2\43\32\35\1\33\1\43\1\34\1\14\1\35\1\43\5"+
            "\35\1\31\7\35\1\27\4\35\1\30\1\32\1\35\1\25\4\35\1\22\1\13\1"+
            "\24\1\17\uff81\43",
            "\1\44\1\45",
            "",
            "\1\51\1\50",
            "\1\53",
            "\1\56\21\uffff\1\55",
            "\1\61\2\uffff\12\63\3\uffff\1\60",
            "\1\64",
            "\1\67\4\uffff\1\70\15\uffff\1\66",
            "\1\72",
            "\1\75\26\uffff\1\74",
            "\1\77\76\uffff\1\100",
            "\1\102",
            "\1\105\1\104\1\uffff\12\105",
            "\1\107",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "",
            "\1\123\17\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "\1\105\1\uffff\12\63\53\uffff\1\105\22\uffff\1\132",
            "\1\105\1\uffff\12\63\53\uffff\1\105",
            "\0\134",
            "\0\134",
            "",
            "",
            "\1\136",
            "",
            "",
            "",
            "\1\140\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\1\uffff\12\63\53\uffff\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\162",
            "\1\163",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\13\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_FLOAT | RULE_HEX | RULE_INT | RULE_REGULAR_EXPRESSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='<') ) {s = 1;}

                        else if ( (LA17_0==',') ) {s = 2;}

                        else if ( (LA17_0=='>') ) {s = 3;}

                        else if ( (LA17_0=='=') ) {s = 4;}

                        else if ( (LA17_0=='+') ) {s = 5;}

                        else if ( (LA17_0=='-') ) {s = 6;}

                        else if ( (LA17_0=='*') ) {s = 7;}

                        else if ( (LA17_0=='/') ) {s = 8;}

                        else if ( (LA17_0=='%') ) {s = 9;}

                        else if ( (LA17_0=='&') ) {s = 10;}

                        else if ( (LA17_0=='|') ) {s = 11;}

                        else if ( (LA17_0=='^') ) {s = 12;}

                        else if ( (LA17_0=='.') ) {s = 13;}

                        else if ( (LA17_0=='!') ) {s = 14;}

                        else if ( (LA17_0=='~') ) {s = 15;}

                        else if ( (LA17_0=='(') ) {s = 16;}

                        else if ( (LA17_0==')') ) {s = 17;}

                        else if ( (LA17_0=='{') ) {s = 18;}

                        else if ( (LA17_0==';') ) {s = 19;}

                        else if ( (LA17_0=='}') ) {s = 20;}

                        else if ( (LA17_0=='v') ) {s = 21;}

                        else if ( (LA17_0==':') ) {s = 22;}

                        else if ( (LA17_0=='n') ) {s = 23;}

                        else if ( (LA17_0=='s') ) {s = 24;}

                        else if ( (LA17_0=='f') ) {s = 25;}

                        else if ( (LA17_0=='t') ) {s = 26;}

                        else if ( (LA17_0=='[') ) {s = 27;}

                        else if ( (LA17_0==']') ) {s = 28;}

                        else if ( (LA17_0=='$'||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='r')||LA17_0=='u'||(LA17_0>='w' && LA17_0<='z')) ) {s = 29;}

                        else if ( (LA17_0=='0') ) {s = 30;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 31;}

                        else if ( (LA17_0=='\"') ) {s = 32;}

                        else if ( (LA17_0=='\'') ) {s = 33;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 34;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='#'||(LA17_0>='?' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='\u007F' && LA17_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_33 = input.LA(1);

                        s = -1;
                        if ( ((LA17_33>='\u0000' && LA17_33<='\uFFFF')) ) {s = 92;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\uFFFF')) ) {s = 92;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}