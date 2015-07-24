package at.bestsolution.dart.service.spec.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDartServiceSpecLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DOC=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDartServiceSpecLexer() {;} 
    public InternalDartServiceSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDartServiceSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:11:7: ( 'package' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:12:7: ( 'javatype' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:12:9: 'javatype'
            {
            match("javatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:13:7: ( 'cust' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:13:9: 'cust'
            {
            match("cust"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:14:7: ( 'extends' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:14:9: 'extends'
            {
            match("extends"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:15:7: ( '{' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:15:9: '{'
            {
            match('{'); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:16:7: ( '}' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:16:9: '}'
            {
            match('}'); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:17:7: ( 'enum' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:17:9: 'enum'
            {
            match("enum"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:18:7: ( '(' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:18:9: '('
            {
            match('('); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:19:7: ( ')' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:19:9: ')'
            {
            match(')'); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:20:7: ( 'alias' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:20:9: 'alias'
            {
            match("alias"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:21:7: ( 'as' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:21:9: 'as'
            {
            match("as"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:22:7: ( 'optional' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:22:9: 'optional'
            {
            match("optional"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:23:7: ( '=' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:23:9: '='
            {
            match('='); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:24:7: ( '<' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:24:9: '<'
            {
            match('<'); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:25:7: ( ',' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:25:9: ','
            {
            match(','); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:26:7: ( '>' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:26:9: '>'
            {
            match('>'); 

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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:27:7: ( '[]' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:27:9: '[]'
            {
            match("[]"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:28:7: ( 'service' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:28:9: 'service'
            {
            match("service"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:29:7: ( 'request' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:29:9: 'request'
            {
            match("request"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:30:7: ( 'returns' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:30:9: 'returns'
            {
            match("returns"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:31:7: ( 'void' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:31:9: 'void'
            {
            match("void"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:32:7: ( 'notification' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:32:9: 'notification'
            {
            match("notification"); 


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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:33:7: ( '.' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DOC"
    public final void mRULE_DOC() throws RecognitionException {
        try {
            int _type = RULE_DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:10: ( '##' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:12: '##' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("##"); 

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:17: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:17: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:33: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:34: ( '\\r' )? '\\n'
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:34: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:996:34: '\\r'
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
    // $ANTLR end "RULE_DOC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:998:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:998:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:998:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:998:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:998:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1000:10: ( ( '0' .. '9' )+ )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1000:12: ( '0' .. '9' )+
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1000:12: ( '0' .. '9' )+
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
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1000:13: '0' .. '9'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1002:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1004:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1004:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1004:24: ( options {greedy=false; } : . )*
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
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1004:52: .
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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:41: ( '\\r' )? '\\n'
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1006:41: '\\r'
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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1008:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:
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
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1010:16: ( . )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1010:18: .
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
        // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DOC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=31;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:148: RULE_DOC
                {
                mRULE_DOC(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:157: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:165: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:174: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:186: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:202: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:218: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:1:226: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\4\37\4\uffff\2\37\4\uffff\1\35\4\37\1\uffff\2\35\2\uffff\3\35\2\uffff\1\37\1\uffff\4\37\4\uffff\1\37\1\101\1\37\5\uffff\4\37\7\uffff\6\37\1\uffff\10\37\1\126\1\37\1\130\5\37\1\136\3\37\1\uffff\1\37\1\uffff\1\143\4\37\1\uffff\4\37\1\uffff\5\37\1\161\1\37\1\163\1\37\1\165\1\166\1\167\1\37\1\uffff\1\171\1\uffff\1\172\3\uffff\1\37\2\uffff\3\37\1\177\1\uffff";
    static final String DFA15_eofS =
        "\u0080\uffff";
    static final String DFA15_minS =
        "\1\0\2\141\1\165\1\156\4\uffff\1\154\1\160\4\uffff\1\135\2\145\2\157\1\uffff\1\43\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\uffff\1\166\1\163\1\164\1\165\4\uffff\1\151\1\60\1\164\5\uffff\1\162\1\161\1\151\1\164\7\uffff\1\153\1\141\1\164\1\145\1\155\1\141\1\uffff\1\151\1\166\2\165\1\144\1\151\1\141\1\164\1\60\1\156\1\60\1\163\1\157\1\151\1\145\1\162\1\60\1\146\1\147\1\171\1\uffff\1\144\1\uffff\1\60\1\156\1\143\1\163\1\156\1\uffff\1\151\1\145\1\160\1\163\1\uffff\1\141\1\145\1\164\1\163\1\143\1\60\1\145\1\60\1\154\3\60\1\141\1\uffff\1\60\1\uffff\1\60\3\uffff\1\164\2\uffff\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\141\1\165\1\170\4\uffff\1\163\1\160\4\uffff\1\135\2\145\2\157\1\uffff\1\43\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\uffff\1\166\1\163\1\164\1\165\4\uffff\1\151\1\172\1\164\5\uffff\1\162\1\164\1\151\1\164\7\uffff\1\153\1\141\1\164\1\145\1\155\1\141\1\uffff\1\151\1\166\2\165\1\144\1\151\1\141\1\164\1\172\1\156\1\172\1\163\1\157\1\151\1\145\1\162\1\172\1\146\1\147\1\171\1\uffff\1\144\1\uffff\1\172\1\156\1\143\1\163\1\156\1\uffff\1\151\1\145\1\160\1\163\1\uffff\1\141\1\145\1\164\1\163\1\143\1\172\1\145\1\172\1\154\3\172\1\141\1\uffff\1\172\1\uffff\1\172\3\uffff\1\164\2\uffff\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\5\uffff\1\5\1\6\1\10\1\11\2\uffff\1\15\1\16\1\17\1\20\5\uffff\1\27\2\uffff\1\31\1\32\3\uffff\1\36\1\37\1\uffff\1\31\4\uffff\1\5\1\6\1\10\1\11\3\uffff\1\15\1\16\1\17\1\20\1\21\4\uffff\1\27\1\30\1\32\1\33\1\34\1\35\1\36\6\uffff\1\13\24\uffff\1\3\1\uffff\1\7\5\uffff\1\25\4\uffff\1\12\15\uffff\1\1\1\uffff\1\4\1\uffff\1\22\1\23\1\24\1\uffff\1\2\1\14\4\uffff\1\26";
    static final String DFA15_specialS =
        "\1\2\30\uffff\1\1\1\0\145\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\1\25\3\35\1\32\1\7\1\10\2\35\1\15\1\35\1\24\1\33\12\30\2\35\1\14\1\13\1\16\2\35\32\27\1\17\2\35\1\26\1\27\1\35\1\11\1\27\1\3\1\27\1\4\4\27\1\2\3\27\1\23\1\12\1\1\1\27\1\21\1\20\2\27\1\22\4\27\1\5\1\35\1\6\uff82\35",
            "\1\36",
            "\1\40",
            "\1\41",
            "\1\43\11\uffff\1\42",
            "",
            "",
            "",
            "",
            "\1\50\6\uffff\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\65",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "\1\100",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104\2\uffff\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\170",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\173",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DOC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_26 = input.LA(1);

                        s = -1;
                        if ( ((LA15_26>='\u0000' && LA15_26<='\uFFFF')) ) {s = 55;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='\u0000' && LA15_25<='\uFFFF')) ) {s = 55;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='p') ) {s = 1;}

                        else if ( (LA15_0=='j') ) {s = 2;}

                        else if ( (LA15_0=='c') ) {s = 3;}

                        else if ( (LA15_0=='e') ) {s = 4;}

                        else if ( (LA15_0=='{') ) {s = 5;}

                        else if ( (LA15_0=='}') ) {s = 6;}

                        else if ( (LA15_0=='(') ) {s = 7;}

                        else if ( (LA15_0==')') ) {s = 8;}

                        else if ( (LA15_0=='a') ) {s = 9;}

                        else if ( (LA15_0=='o') ) {s = 10;}

                        else if ( (LA15_0=='=') ) {s = 11;}

                        else if ( (LA15_0=='<') ) {s = 12;}

                        else if ( (LA15_0==',') ) {s = 13;}

                        else if ( (LA15_0=='>') ) {s = 14;}

                        else if ( (LA15_0=='[') ) {s = 15;}

                        else if ( (LA15_0=='s') ) {s = 16;}

                        else if ( (LA15_0=='r') ) {s = 17;}

                        else if ( (LA15_0=='v') ) {s = 18;}

                        else if ( (LA15_0=='n') ) {s = 19;}

                        else if ( (LA15_0=='.') ) {s = 20;}

                        else if ( (LA15_0=='#') ) {s = 21;}

                        else if ( (LA15_0=='^') ) {s = 22;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='d'||(LA15_0>='f' && LA15_0<='i')||(LA15_0>='k' && LA15_0<='m')||LA15_0=='q'||(LA15_0>='t' && LA15_0<='u')||(LA15_0>='w' && LA15_0<='z')) ) {s = 23;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 24;}

                        else if ( (LA15_0=='\"') ) {s = 25;}

                        else if ( (LA15_0=='\'') ) {s = 26;}

                        else if ( (LA15_0=='/') ) {s = 27;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 28;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='-'||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='\\' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 29;}

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