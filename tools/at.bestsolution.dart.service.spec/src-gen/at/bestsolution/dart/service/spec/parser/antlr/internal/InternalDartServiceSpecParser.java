package at.bestsolution.dart.service.spec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.dart.service.spec.services.DartServiceSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDartServiceSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'javatype'", "'cust'", "'extends'", "'{'", "'}'", "'enum'", "'('", "')'", "'alias'", "'as'", "'optional'", "'='", "'<'", "','", "'>'", "'[]'", "'service'", "'request'", "'returns'", "'void'", "'notification'", "'.'"
    };
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


        public InternalDartServiceSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDartServiceSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDartServiceSpecParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g"; }



     	private DartServiceSpecGrammarAccess grammarAccess;
     	
        public InternalDartServiceSpecParser(TokenStream input, DartServiceSpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServiceDefs";	
       	}
       	
       	@Override
       	protected DartServiceSpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleServiceDefs"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:67:1: entryRuleServiceDefs returns [EObject current=null] : iv_ruleServiceDefs= ruleServiceDefs EOF ;
    public final EObject entryRuleServiceDefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefs = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:68:2: (iv_ruleServiceDefs= ruleServiceDefs EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:69:2: iv_ruleServiceDefs= ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs75);
            iv_ruleServiceDefs=ruleServiceDefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceDefs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDefs85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServiceDefs"


    // $ANTLR start "ruleServiceDefs"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:76:1: ruleServiceDefs returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )+ ) ;
    public final EObject ruleServiceDefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_domainElements_2_0 = null;

        EObject lv_serviceDefs_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )+ ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )+ )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )+ )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_domainElements_2_0= ruleDomainElement ) )* ( (lv_serviceDefs_3_0= ruleServiceDef ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleServiceDefs122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceDefsAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleServiceDefs143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:102:2: ( (lv_domainElements_2_0= ruleDomainElement ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:103:1: (lv_domainElements_2_0= ruleDomainElement )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:104:3: lv_domainElements_2_0= ruleDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleServiceDefs164);
            	    lv_domainElements_2_0=ruleDomainElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"domainElements",
            	              		lv_domainElements_2_0, 
            	              		"DomainElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:120:3: ( (lv_serviceDefs_3_0= ruleServiceDef ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:121:1: (lv_serviceDefs_3_0= ruleServiceDef )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:121:1: (lv_serviceDefs_3_0= ruleServiceDef )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:122:3: lv_serviceDefs_3_0= ruleServiceDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleServiceDef_in_ruleServiceDefs186);
            	    lv_serviceDefs_3_0=ruleServiceDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"serviceDefs",
            	              		lv_serviceDefs_3_0, 
            	              		"ServiceDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleServiceDefs"


    // $ANTLR start "entryRuleDomainElement"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:146:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:147:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:148:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement223);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:155:1: ruleDomainElement returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_cust_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_8_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_enumValues_13_0 = null;

        AntlrDatatypeRuleToken lv_name_16_0 = null;

        AntlrDatatypeRuleToken lv_realType_18_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:158:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:159:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:159:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:159:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:159:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:160:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:160:1: (lv_doc_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:161:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleDomainElement275); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_doc_0_0, grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDomainElementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"doc",
            	              		lv_doc_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:177:3: ( (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) ) | ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) | (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' ) | (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:177:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:177:4: (otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:177:6: otherlv_1= 'javatype' ( (lv_name_2_0= ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDomainElement295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:181:1: ( (lv_name_2_0= ruleQualifiedName ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:182:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:182:1: (lv_name_2_0= ruleQualifiedName )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:183:3: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement316);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:200:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:200:6: ( ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:200:7: ( (lv_cust_3_0= 'cust' ) ) ( (lv_name_4_0= ruleQualifiedName ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:200:7: ( (lv_cust_3_0= 'cust' ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:201:1: (lv_cust_3_0= 'cust' )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:201:1: (lv_cust_3_0= 'cust' )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:202:3: lv_cust_3_0= 'cust'
                    {
                    lv_cust_3_0=(Token)match(input,14,FOLLOW_14_in_ruleDomainElement342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cust_3_0, grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDomainElementRule());
                      	        }
                             		setWithLastConsumed(current, "cust", true, "cust");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:215:2: ( (lv_name_4_0= ruleQualifiedName ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:216:1: (lv_name_4_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:216:1: (lv_name_4_0= ruleQualifiedName )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:217:3: lv_name_4_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement376);
                    lv_name_4_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:233:2: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:233:4: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDomainElement389); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0());
                                  
                            }
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:237:1: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:238:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:238:1: ( ruleQualifiedName )
                            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:239:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getDomainElementRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement412);
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

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDomainElement426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:256:1: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_DOC && LA5_0<=RULE_ID)||LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:257:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:257:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:258:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleDomainElement447);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_8_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleDomainElement460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:279:6: (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:279:6: (otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')' )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:279:8: otherlv_10= 'enum' ( (lv_name_11_0= ruleQualifiedName ) ) otherlv_12= '(' ( (lv_enumValues_13_0= ruleEnumVal ) )* otherlv_14= ')'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDomainElement480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:283:1: ( (lv_name_11_0= ruleQualifiedName ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:284:1: (lv_name_11_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:284:1: (lv_name_11_0= ruleQualifiedName )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:285:3: lv_name_11_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement501);
                    lv_name_11_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_11_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleDomainElement513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:305:1: ( (lv_enumValues_13_0= ruleEnumVal ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_DOC && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:306:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:306:1: (lv_enumValues_13_0= ruleEnumVal )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:307:3: lv_enumValues_13_0= ruleEnumVal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEnumVal_in_ruleDomainElement534);
                    	    lv_enumValues_13_0=ruleEnumVal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"enumValues",
                    	              		lv_enumValues_13_0, 
                    	              		"EnumVal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleDomainElement547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:328:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:328:6: (otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:328:8: otherlv_15= 'alias' ( (lv_name_16_0= ruleQualifiedName ) ) otherlv_17= 'as' ( (lv_realType_18_0= ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleDomainElement567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:332:1: ( (lv_name_16_0= ruleQualifiedName ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:333:1: (lv_name_16_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:333:1: (lv_name_16_0= ruleQualifiedName )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:334:3: lv_name_16_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement588);
                    lv_name_16_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_16_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleDomainElement600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:354:1: ( (lv_realType_18_0= ruleQualifiedName ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:355:1: (lv_realType_18_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:355:1: (lv_realType_18_0= ruleQualifiedName )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:356:3: lv_realType_18_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainElement621);
                    lv_realType_18_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"realType",
                              		lv_realType_18_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEnumVal"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:380:1: entryRuleEnumVal returns [EObject current=null] : iv_ruleEnumVal= ruleEnumVal EOF ;
    public final EObject entryRuleEnumVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumVal = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:381:2: (iv_ruleEnumVal= ruleEnumVal EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:382:2: iv_ruleEnumVal= ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_entryRuleEnumVal659);
            iv_ruleEnumVal=ruleEnumVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumVal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumVal669); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumVal"


    // $ANTLR start "ruleEnumVal"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:389:1: ruleEnumVal returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumVal() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:392:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:393:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:393:1: ( ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:393:2: ( (lv_doc_0_0= RULE_DOC ) )* ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:393:2: ( (lv_doc_0_0= RULE_DOC ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOC) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:394:1: (lv_doc_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:394:1: (lv_doc_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:395:3: lv_doc_0_0= RULE_DOC
            	    {
            	    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumVal711); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_doc_0_0, grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEnumValRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"doc",
            	              		lv_doc_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:412:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:412:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:413:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumVal734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumValRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleEnumVal"


    // $ANTLR start "entryRuleAttribute"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:437:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:438:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:439:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute775);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute785); if (state.failed) return current;

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
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:446:1: ruleAttribute returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_optional_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:449:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:450:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:450:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:450:2: ( (lv_documentation_0_0= RULE_DOC ) )* ( (lv_optional_1_0= 'optional' ) )? ( (lv_type_2_0= ruleGenericTypeArgument ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:450:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOC) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:451:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:451:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:452:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAttribute827); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAttributeRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:468:3: ( (lv_optional_1_0= 'optional' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:469:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:469:1: (lv_optional_1_0= 'optional' )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:470:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,23,FOLLOW_23_in_ruleAttribute851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_1_0, grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:483:3: ( (lv_type_2_0= ruleGenericTypeArgument ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:484:1: (lv_type_2_0= ruleGenericTypeArgument )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:484:1: (lv_type_2_0= ruleGenericTypeArgument )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:485:3: lv_type_2_0= ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleAttribute886);
            lv_type_2_0=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"GenericTypeArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:501:2: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:502:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:502:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:503:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:519:2: (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:519:4: otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAttribute921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:523:1: ( (lv_value_5_0= RULE_STRING ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:524:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:524:1: (lv_value_5_0= RULE_STRING )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:525:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleGenericTypeArgument"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:549:1: entryRuleGenericTypeArgument returns [EObject current=null] : iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF ;
    public final EObject entryRuleGenericTypeArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTypeArgument = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:550:2: (iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:551:2: iv_ruleGenericTypeArgument= ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument981);
            iv_ruleGenericTypeArgument=ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericTypeArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericTypeArgument991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenericTypeArgument"


    // $ANTLR start "ruleGenericTypeArgument"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:558:1: ruleGenericTypeArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) ;
    public final EObject ruleGenericTypeArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_list_6_0=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:561:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:562:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:562:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )? )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:562:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )? ( (lv_list_6_0= '[]' ) )?
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:562:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:563:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:563:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:564:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGenericTypeArgumentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericTypeArgument1039);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:577:2: (otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:577:4: otherlv_1= '<' ( (lv_arguments_2_0= ruleGenericTypeArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleGenericTypeArgument1052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:581:1: ( (lv_arguments_2_0= ruleGenericTypeArgument ) )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:582:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:582:1: (lv_arguments_2_0= ruleGenericTypeArgument )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:583:3: lv_arguments_2_0= ruleGenericTypeArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1073);
                    lv_arguments_2_0=ruleGenericTypeArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGenericTypeArgumentRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"GenericTypeArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:599:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==26) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:599:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleGenericTypeArgument1086); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:603:1: ( (lv_arguments_4_0= ruleGenericTypeArgument ) )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:604:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:604:1: (lv_arguments_4_0= ruleGenericTypeArgument )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:605:3: lv_arguments_4_0= ruleGenericTypeArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1107);
                    	    lv_arguments_4_0=ruleGenericTypeArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGenericTypeArgumentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"GenericTypeArgument");
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

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleGenericTypeArgument1121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:625:3: ( (lv_list_6_0= '[]' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:626:1: (lv_list_6_0= '[]' )
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:626:1: (lv_list_6_0= '[]' )
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:627:3: lv_list_6_0= '[]'
                    {
                    lv_list_6_0=(Token)match(input,28,FOLLOW_28_in_ruleGenericTypeArgument1141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_list_6_0, grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGenericTypeArgumentRule());
                      	        }
                             		setWithLastConsumed(current, "list", true, "[]");
                      	    
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
    // $ANTLR end "ruleGenericTypeArgument"


    // $ANTLR start "entryRuleServiceDef"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:648:1: entryRuleServiceDef returns [EObject current=null] : iv_ruleServiceDef= ruleServiceDef EOF ;
    public final EObject entryRuleServiceDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDef = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:649:2: (iv_ruleServiceDef= ruleServiceDef EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:650:2: iv_ruleServiceDef= ruleServiceDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceDefRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDef_in_entryRuleServiceDef1191);
            iv_ruleServiceDef=ruleServiceDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDef1201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleServiceDef"


    // $ANTLR start "ruleServiceDef"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:657:1: ruleServiceDef returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requests_4_0= ruleRequest ) )* ( (lv_notifications_5_0= ruleNotification ) )* otherlv_6= '}' ) ;
    public final EObject ruleServiceDef() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_requests_4_0 = null;

        EObject lv_notifications_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:660:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requests_4_0= ruleRequest ) )* ( (lv_notifications_5_0= ruleNotification ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:661:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requests_4_0= ruleRequest ) )* ( (lv_notifications_5_0= ruleNotification ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:661:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requests_4_0= ruleRequest ) )* ( (lv_notifications_5_0= ruleNotification ) )* otherlv_6= '}' )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:661:2: ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requests_4_0= ruleRequest ) )* ( (lv_notifications_5_0= ruleNotification ) )* otherlv_6= '}'
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:661:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_DOC) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:662:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:662:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:663:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleServiceDef1243); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getServiceDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getServiceDefRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleServiceDef1261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getServiceDefAccess().getServiceKeyword_1());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:683:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:684:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:684:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:685:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceDef1278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getServiceDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleServiceDef1295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:705:1: ( (lv_requests_4_0= ruleRequest ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:706:1: (lv_requests_4_0= ruleRequest )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:706:1: (lv_requests_4_0= ruleRequest )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:707:3: lv_requests_4_0= ruleRequest
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefAccess().getRequestsRequestParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRequest_in_ruleServiceDef1316);
            	    lv_requests_4_0=ruleRequest();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"requests",
            	              		lv_requests_4_0, 
            	              		"Request");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:723:3: ( (lv_notifications_5_0= ruleNotification ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOC||LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:724:1: (lv_notifications_5_0= ruleNotification )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:724:1: (lv_notifications_5_0= ruleNotification )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:725:3: lv_notifications_5_0= ruleNotification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceDefAccess().getNotificationsNotificationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotification_in_ruleServiceDef1338);
            	    lv_notifications_5_0=ruleNotification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"notifications",
            	              		lv_notifications_5_0, 
            	              		"Notification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleServiceDef1351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleServiceDef"


    // $ANTLR start "entryRuleRequest"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:753:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:754:2: (iv_ruleRequest= ruleRequest EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:755:2: iv_ruleRequest= ruleRequest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequestRule()); 
            }
            pushFollow(FOLLOW_ruleRequest_in_entryRuleRequest1387);
            iv_ruleRequest=ruleRequest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequest1397); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:762:1: ruleRequest returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'request' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? otherlv_6= 'returns' (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ ) ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_returnVals_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:765:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'request' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? otherlv_6= 'returns' (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ ) ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:766:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'request' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? otherlv_6= 'returns' (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ ) )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:766:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'request' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? otherlv_6= 'returns' (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:766:2: ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'request' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? otherlv_6= 'returns' (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:766:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOC) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:767:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:767:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:768:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleRequest1439); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getRequestAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequestRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleRequest1457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getRequestKeyword_1());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:788:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:789:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:789:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:790:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequest1474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getRequestAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequestRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:806:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:806:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRequest1492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRequestAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:810:1: ( (lv_attributes_4_0= ruleAttribute ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_DOC && LA19_0<=RULE_ID)||LA19_0==23) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:811:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:811:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:812:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRequestAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleRequest1513);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRequestRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_4_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleRequest1526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRequestAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleRequest1540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRequestAccess().getReturnsKeyword_4());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:836:1: (otherlv_7= 'void' | ( (lv_returnVals_8_0= ruleAttribute ) )+ )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_DOC && LA22_0<=RULE_ID)||LA22_0==23) ) {
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
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:836:3: otherlv_7= 'void'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleRequest1553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRequestAccess().getVoidKeyword_5_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:841:6: ( (lv_returnVals_8_0= ruleAttribute ) )+
                    {
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:841:6: ( (lv_returnVals_8_0= ruleAttribute ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        alt21 = dfa21.predict(input);
                        switch (alt21) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:842:1: (lv_returnVals_8_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:842:1: (lv_returnVals_8_0= ruleAttribute )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:843:3: lv_returnVals_8_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRequestAccess().getReturnValsAttributeParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleRequest1580);
                    	    lv_returnVals_8_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRequestRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"returnVals",
                    	              		lv_returnVals_8_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleNotification"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:867:1: entryRuleNotification returns [EObject current=null] : iv_ruleNotification= ruleNotification EOF ;
    public final EObject entryRuleNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotification = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:868:2: (iv_ruleNotification= ruleNotification EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:869:2: iv_ruleNotification= ruleNotification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotificationRule()); 
            }
            pushFollow(FOLLOW_ruleNotification_in_entryRuleNotification1618);
            iv_ruleNotification=ruleNotification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotification1628); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:876:1: ruleNotification returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? ) ;
    public final EObject ruleNotification() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:879:28: ( ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:880:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:880:1: ( ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )? )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:880:2: ( (lv_documentation_0_0= RULE_DOC ) )* otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )?
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:880:2: ( (lv_documentation_0_0= RULE_DOC ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:881:1: (lv_documentation_0_0= RULE_DOC )
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:881:1: (lv_documentation_0_0= RULE_DOC )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:882:3: lv_documentation_0_0= RULE_DOC
            	    {
            	    lv_documentation_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleNotification1670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_documentation_0_0, grammarAccess.getNotificationAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNotificationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"documentation",
            	              		lv_documentation_0_0, 
            	              		"DOC");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleNotification1688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotificationAccess().getNotificationKeyword_1());
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:902:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:903:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:903:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:904:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotification1705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNotificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:920:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:920:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNotification1723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNotificationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:924:1: ( (lv_attributes_4_0= ruleAttribute ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_DOC && LA24_0<=RULE_ID)||LA24_0==23) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:925:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:925:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:926:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNotificationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleNotification1744);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNotificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_4_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleNotification1757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNotificationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleNotification"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:954:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:955:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:956:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1796);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1807); if (state.failed) return current;

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
    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:963:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:966:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:967:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:967:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:967:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:974:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) && (synpred1_InternalDartServiceSpec())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:974:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:974:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:974:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleQualifiedName1875); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1891); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // $ANTLR start synpred1_InternalDartServiceSpec
    public final void synpred1_InternalDartServiceSpec_fragment() throws RecognitionException {   
        // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:974:3: ( '.' )
        // ../at.bestsolution.dart.service.spec/src-gen/at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.g:975:2: '.'
        {
        match(input,34,FOLLOW_34_in_synpred1_InternalDartServiceSpec1866); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDartServiceSpec

    // Delegated rules

    public final boolean synpred1_InternalDartServiceSpec() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDartServiceSpec_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\4\uffff";
    static final String DFA1_minS =
        "\2\4\2\uffff";
    static final String DFA1_maxS =
        "\2\35\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\10\uffff\2\3\3\uffff\1\3\2\uffff\1\3\7\uffff\1\2",
            "\1\1\10\uffff\2\3\3\uffff\1\3\2\uffff\1\3\7\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:2: ( (lv_domainElements_2_0= ruleDomainElement ) )*";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\4\uffff";
    static final String DFA16_minS =
        "\2\4\2\uffff";
    static final String DFA16_maxS =
        "\2\41\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\14\uffff\1\2\14\uffff\1\3\2\uffff\1\2",
            "\1\1\31\uffff\1\3\2\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 705:1: ( (lv_requests_4_0= ruleRequest ) )*";
        }
    }
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\1\2\3\uffff";
    static final String DFA21_minS =
        "\2\4\2\uffff";
    static final String DFA21_maxS =
        "\2\41\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\3\13\uffff\1\2\5\uffff\1\3\6\uffff\1\2\2\uffff\1\2",
            "\1\1\1\3\21\uffff\1\3\6\uffff\1\2\2\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()+ loopback of 841:6: ( (lv_returnVals_8_0= ruleAttribute ) )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDefs85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleServiceDefs122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleServiceDefs143 = new BitSet(new long[]{0x0000000020246010L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleServiceDefs164 = new BitSet(new long[]{0x0000000020246010L});
    public static final BitSet FOLLOW_ruleServiceDef_in_ruleServiceDefs186 = new BitSet(new long[]{0x0000000020246012L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleDomainElement275 = new BitSet(new long[]{0x0000000000246010L});
    public static final BitSet FOLLOW_13_in_ruleDomainElement295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainElement342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement376 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDomainElement389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement412 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDomainElement426 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDomainElement447 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_17_in_ruleDomainElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDomainElement480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDomainElement513 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleEnumVal_in_ruleDomainElement534 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_20_in_ruleDomainElement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDomainElement567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDomainElement600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainElement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_entryRuleEnumVal659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumVal669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumVal711 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumVal734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAttribute827 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_23_in_ruleAttribute851 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleAttribute886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute903 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute921 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericTypeArgument991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericTypeArgument1039 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_25_in_ruleGenericTypeArgument1052 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1073 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleGenericTypeArgument1086 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_ruleGenericTypeArgument1107 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleGenericTypeArgument1121 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleGenericTypeArgument1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDef_in_entryRuleServiceDef1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDef1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleServiceDef1243 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleServiceDef1261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceDef1278 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleServiceDef1295 = new BitSet(new long[]{0x0000000240020010L});
    public static final BitSet FOLLOW_ruleRequest_in_ruleServiceDef1316 = new BitSet(new long[]{0x0000000240020010L});
    public static final BitSet FOLLOW_ruleNotification_in_ruleServiceDef1338 = new BitSet(new long[]{0x0000000200020010L});
    public static final BitSet FOLLOW_17_in_ruleServiceDef1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequest_in_entryRuleRequest1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequest1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleRequest1439 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_ruleRequest1457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequest1474 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleRequest1492 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRequest1513 = new BitSet(new long[]{0x0000000000900030L});
    public static final BitSet FOLLOW_20_in_ruleRequest1526 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRequest1540 = new BitSet(new long[]{0x0000000100800030L});
    public static final BitSet FOLLOW_32_in_ruleRequest1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRequest1580 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification1618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleNotification1670 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleNotification1688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotification1705 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleNotification1723 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleNotification1744 = new BitSet(new long[]{0x0000000000900030L});
    public static final BitSet FOLLOW_20_in_ruleNotification1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1847 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleQualifiedName1875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1891 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_synpred1_InternalDartServiceSpec1866 = new BitSet(new long[]{0x0000000000000002L});

}