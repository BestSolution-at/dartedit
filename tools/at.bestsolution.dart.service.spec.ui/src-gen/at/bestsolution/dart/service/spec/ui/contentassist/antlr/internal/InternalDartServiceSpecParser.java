package at.bestsolution.dart.service.spec.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.bestsolution.dart.service.spec.services.DartServiceSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDartServiceSpecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'package'", "'javatype'", "'{'", "'}'", "'extends'", "'enum'", "'('", "')'", "'alias'", "'as'", "'='", "'<'", "'>'", "','", "'service'", "'request'", "'returns'", "'notification'", "'.'", "'cust'", "'optional'", "'[]'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DOC=5;
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
    public String getGrammarFileName() { return "../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g"; }


     
     	private DartServiceSpecGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DartServiceSpecGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleServiceDefs"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:61:1: entryRuleServiceDefs : ruleServiceDefs EOF ;
    public final void entryRuleServiceDefs() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:62:1: ( ruleServiceDefs EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:63:1: ruleServiceDefs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs67);
            ruleServiceDefs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDefs74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServiceDefs"


    // $ANTLR start "ruleServiceDefs"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:70:1: ruleServiceDefs : ( ( rule__ServiceDefs__Group__0 ) ) ;
    public final void ruleServiceDefs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:74:2: ( ( ( rule__ServiceDefs__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:75:1: ( ( rule__ServiceDefs__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:76:1: ( rule__ServiceDefs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:77:1: ( rule__ServiceDefs__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:77:2: rule__ServiceDefs__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__0_in_ruleServiceDefs100);
            rule__ServiceDefs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getGroup()); 
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
    // $ANTLR end "ruleServiceDefs"


    // $ANTLR start "entryRuleDomainElement"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:89:1: entryRuleDomainElement : ruleDomainElement EOF ;
    public final void entryRuleDomainElement() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:90:1: ( ruleDomainElement EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:91:1: ruleDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement127);
            ruleDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:98:1: ruleDomainElement : ( ( rule__DomainElement__Group__0 ) ) ;
    public final void ruleDomainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:102:2: ( ( ( rule__DomainElement__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:103:1: ( ( rule__DomainElement__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:104:1: ( rule__DomainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:105:1: ( rule__DomainElement__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:105:2: rule__DomainElement__Group__0
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__0_in_ruleDomainElement160);
            rule__DomainElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getGroup()); 
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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEnumVal"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:117:1: entryRuleEnumVal : ruleEnumVal EOF ;
    public final void entryRuleEnumVal() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:118:1: ( ruleEnumVal EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:119:1: ruleEnumVal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValRule()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_entryRuleEnumVal187);
            ruleEnumVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumVal194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumVal"


    // $ANTLR start "ruleEnumVal"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:126:1: ruleEnumVal : ( ( rule__EnumVal__Group__0 ) ) ;
    public final void ruleEnumVal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:130:2: ( ( ( rule__EnumVal__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:131:1: ( ( rule__EnumVal__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:132:1: ( rule__EnumVal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:133:1: ( rule__EnumVal__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:133:2: rule__EnumVal__Group__0
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__0_in_ruleEnumVal220);
            rule__EnumVal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumVal"


    // $ANTLR start "entryRuleAttribute"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:145:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:146:1: ( ruleAttribute EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:147:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute247);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:154:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:158:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:159:1: ( ( rule__Attribute__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:160:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:161:1: ( rule__Attribute__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:161:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleGenericTypeArgument"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:173:1: entryRuleGenericTypeArgument : ruleGenericTypeArgument EOF ;
    public final void entryRuleGenericTypeArgument() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:174:1: ( ruleGenericTypeArgument EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:175:1: ruleGenericTypeArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument307);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericTypeArgument314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenericTypeArgument"


    // $ANTLR start "ruleGenericTypeArgument"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:182:1: ruleGenericTypeArgument : ( ( rule__GenericTypeArgument__Group__0 ) ) ;
    public final void ruleGenericTypeArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:186:2: ( ( ( rule__GenericTypeArgument__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:187:1: ( ( rule__GenericTypeArgument__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:188:1: ( rule__GenericTypeArgument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:189:1: ( rule__GenericTypeArgument__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:189:2: rule__GenericTypeArgument__Group__0
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__0_in_ruleGenericTypeArgument340);
            rule__GenericTypeArgument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup()); 
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
    // $ANTLR end "ruleGenericTypeArgument"


    // $ANTLR start "entryRuleServiceDef"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:201:1: entryRuleServiceDef : ruleServiceDef EOF ;
    public final void entryRuleServiceDef() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:202:1: ( ruleServiceDef EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:203:1: ruleServiceDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefRule()); 
            }
            pushFollow(FOLLOW_ruleServiceDef_in_entryRuleServiceDef367);
            ruleServiceDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDef374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleServiceDef"


    // $ANTLR start "ruleServiceDef"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:210:1: ruleServiceDef : ( ( rule__ServiceDef__Group__0 ) ) ;
    public final void ruleServiceDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:214:2: ( ( ( rule__ServiceDef__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:215:1: ( ( rule__ServiceDef__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:215:1: ( ( rule__ServiceDef__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:216:1: ( rule__ServiceDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:217:1: ( rule__ServiceDef__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:217:2: rule__ServiceDef__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__0_in_ruleServiceDef400);
            rule__ServiceDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getGroup()); 
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
    // $ANTLR end "ruleServiceDef"


    // $ANTLR start "entryRuleRequest"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:229:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:230:1: ( ruleRequest EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:231:1: ruleRequest EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestRule()); 
            }
            pushFollow(FOLLOW_ruleRequest_in_entryRuleRequest427);
            ruleRequest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequest434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:238:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:242:2: ( ( ( rule__Request__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:243:1: ( ( rule__Request__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:243:1: ( ( rule__Request__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:244:1: ( rule__Request__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:245:1: ( rule__Request__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:245:2: rule__Request__Group__0
            {
            pushFollow(FOLLOW_rule__Request__Group__0_in_ruleRequest460);
            rule__Request__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getGroup()); 
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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleNotification"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:257:1: entryRuleNotification : ruleNotification EOF ;
    public final void entryRuleNotification() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:258:1: ( ruleNotification EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:259:1: ruleNotification EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationRule()); 
            }
            pushFollow(FOLLOW_ruleNotification_in_entryRuleNotification487);
            ruleNotification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotification494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:266:1: ruleNotification : ( ( rule__Notification__Group__0 ) ) ;
    public final void ruleNotification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:270:2: ( ( ( rule__Notification__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:271:1: ( ( rule__Notification__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:271:1: ( ( rule__Notification__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:272:1: ( rule__Notification__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:273:1: ( rule__Notification__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:273:2: rule__Notification__Group__0
            {
            pushFollow(FOLLOW_rule__Notification__Group__0_in_ruleNotification520);
            rule__Notification__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getGroup()); 
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
    // $ANTLR end "ruleNotification"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:285:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:286:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:287:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName547);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:294:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:298:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:299:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:299:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:300:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:301:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:301:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName580);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__DomainElement__Alternatives_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:313:1: rule__DomainElement__Alternatives_1 : ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) );
    public final void rule__DomainElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:317:1: ( ( ( rule__DomainElement__Group_1_0__0 ) ) | ( ( rule__DomainElement__Group_1_1__0 ) ) | ( ( rule__DomainElement__Group_1_2__0 ) ) | ( ( rule__DomainElement__Group_1_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:318:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:318:1: ( ( rule__DomainElement__Group_1_0__0 ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:319:1: ( rule__DomainElement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_0()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:320:1: ( rule__DomainElement__Group_1_0__0 )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:320:2: rule__DomainElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_0__0_in_rule__DomainElement__Alternatives_1616);
                    rule__DomainElement__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:324:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:324:6: ( ( rule__DomainElement__Group_1_1__0 ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:325:1: ( rule__DomainElement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_1()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:326:1: ( rule__DomainElement__Group_1_1__0 )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:326:2: rule__DomainElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_1__0_in_rule__DomainElement__Alternatives_1634);
                    rule__DomainElement__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:330:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:330:6: ( ( rule__DomainElement__Group_1_2__0 ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:331:1: ( rule__DomainElement__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_2()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:332:1: ( rule__DomainElement__Group_1_2__0 )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:332:2: rule__DomainElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_2__0_in_rule__DomainElement__Alternatives_1652);
                    rule__DomainElement__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:336:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:336:6: ( ( rule__DomainElement__Group_1_3__0 ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:337:1: ( rule__DomainElement__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDomainElementAccess().getGroup_1_3()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:338:1: ( rule__DomainElement__Group_1_3__0 )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:338:2: rule__DomainElement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_3__0_in_rule__DomainElement__Alternatives_1670);
                    rule__DomainElement__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDomainElementAccess().getGroup_1_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DomainElement__Alternatives_1"


    // $ANTLR start "rule__Request__Alternatives_5"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:347:1: rule__Request__Alternatives_5 : ( ( 'void' ) | ( ( ( rule__Request__ReturnValsAssignment_5_1 ) ) ( ( rule__Request__ReturnValsAssignment_5_1 )* ) ) );
    public final void rule__Request__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:351:1: ( ( 'void' ) | ( ( ( rule__Request__ReturnValsAssignment_5_1 ) ) ( ( rule__Request__ReturnValsAssignment_5_1 )* ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DOC)||LA3_0==33) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:352:1: ( 'void' )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:352:1: ( 'void' )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:353:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRequestAccess().getVoidKeyword_5_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Request__Alternatives_5704); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRequestAccess().getVoidKeyword_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:360:6: ( ( ( rule__Request__ReturnValsAssignment_5_1 ) ) ( ( rule__Request__ReturnValsAssignment_5_1 )* ) )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:360:6: ( ( ( rule__Request__ReturnValsAssignment_5_1 ) ) ( ( rule__Request__ReturnValsAssignment_5_1 )* ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:361:1: ( ( rule__Request__ReturnValsAssignment_5_1 ) ) ( ( rule__Request__ReturnValsAssignment_5_1 )* )
                    {
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:361:1: ( ( rule__Request__ReturnValsAssignment_5_1 ) )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:362:1: ( rule__Request__ReturnValsAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRequestAccess().getReturnValsAssignment_5_1()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:363:1: ( rule__Request__ReturnValsAssignment_5_1 )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:363:2: rule__Request__ReturnValsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Request__ReturnValsAssignment_5_1_in_rule__Request__Alternatives_5725);
                    rule__Request__ReturnValsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRequestAccess().getReturnValsAssignment_5_1()); 
                    }

                    }

                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:366:1: ( ( rule__Request__ReturnValsAssignment_5_1 )* )
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:367:1: ( rule__Request__ReturnValsAssignment_5_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRequestAccess().getReturnValsAssignment_5_1()); 
                    }
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:368:1: ( rule__Request__ReturnValsAssignment_5_1 )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:368:2: rule__Request__ReturnValsAssignment_5_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Request__ReturnValsAssignment_5_1_in_rule__Request__Alternatives_5737);
                    	    rule__Request__ReturnValsAssignment_5_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRequestAccess().getReturnValsAssignment_5_1()); 
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rule__Request__Alternatives_5"


    // $ANTLR start "rule__ServiceDefs__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:380:1: rule__ServiceDefs__Group__0 : rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 ;
    public final void rule__ServiceDefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:384:1: ( rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:385:2: rule__ServiceDefs__Group__0__Impl rule__ServiceDefs__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__0__Impl_in_rule__ServiceDefs__Group__0771);
            rule__ServiceDefs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__1_in_rule__ServiceDefs__Group__0774);
            rule__ServiceDefs__Group__1();

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
    // $ANTLR end "rule__ServiceDefs__Group__0"


    // $ANTLR start "rule__ServiceDefs__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:392:1: rule__ServiceDefs__Group__0__Impl : ( 'package' ) ;
    public final void rule__ServiceDefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:396:1: ( ( 'package' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:397:1: ( 'package' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:397:1: ( 'package' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:398:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ServiceDefs__Group__0__Impl802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__0__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:411:1: rule__ServiceDefs__Group__1 : rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 ;
    public final void rule__ServiceDefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:415:1: ( rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:416:2: rule__ServiceDefs__Group__1__Impl rule__ServiceDefs__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__1__Impl_in_rule__ServiceDefs__Group__1833);
            rule__ServiceDefs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__2_in_rule__ServiceDefs__Group__1836);
            rule__ServiceDefs__Group__2();

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
    // $ANTLR end "rule__ServiceDefs__Group__1"


    // $ANTLR start "rule__ServiceDefs__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:423:1: rule__ServiceDefs__Group__1__Impl : ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) ;
    public final void rule__ServiceDefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:427:1: ( ( ( rule__ServiceDefs__PackageNameAssignment_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:428:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:428:1: ( ( rule__ServiceDefs__PackageNameAssignment_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:429:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:430:1: ( rule__ServiceDefs__PackageNameAssignment_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:430:2: rule__ServiceDefs__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceDefs__PackageNameAssignment_1_in_rule__ServiceDefs__Group__1__Impl863);
            rule__ServiceDefs__PackageNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageNameAssignment_1()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__1__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:440:1: rule__ServiceDefs__Group__2 : rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 ;
    public final void rule__ServiceDefs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:444:1: ( rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:445:2: rule__ServiceDefs__Group__2__Impl rule__ServiceDefs__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__2__Impl_in_rule__ServiceDefs__Group__2893);
            rule__ServiceDefs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDefs__Group__3_in_rule__ServiceDefs__Group__2896);
            rule__ServiceDefs__Group__3();

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
    // $ANTLR end "rule__ServiceDefs__Group__2"


    // $ANTLR start "rule__ServiceDefs__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:452:1: rule__ServiceDefs__Group__2__Impl : ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) ;
    public final void rule__ServiceDefs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:456:1: ( ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:457:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:457:1: ( ( rule__ServiceDefs__DomainElementsAssignment_2 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:458:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:459:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:459:2: rule__ServiceDefs__DomainElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDefs__DomainElementsAssignment_2_in_rule__ServiceDefs__Group__2__Impl923);
            	    rule__ServiceDefs__DomainElementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getDomainElementsAssignment_2()); 
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
    // $ANTLR end "rule__ServiceDefs__Group__2__Impl"


    // $ANTLR start "rule__ServiceDefs__Group__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:469:1: rule__ServiceDefs__Group__3 : rule__ServiceDefs__Group__3__Impl ;
    public final void rule__ServiceDefs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:473:1: ( rule__ServiceDefs__Group__3__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:474:2: rule__ServiceDefs__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ServiceDefs__Group__3__Impl_in_rule__ServiceDefs__Group__3954);
            rule__ServiceDefs__Group__3__Impl();

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
    // $ANTLR end "rule__ServiceDefs__Group__3"


    // $ANTLR start "rule__ServiceDefs__Group__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:480:1: rule__ServiceDefs__Group__3__Impl : ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) ) ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) ) ;
    public final void rule__ServiceDefs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:484:1: ( ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) ) ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:485:1: ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) ) ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:485:1: ( ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) ) ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:486:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) ) ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:486:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:487:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:488:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:488:2: rule__ServiceDefs__ServiceDefsAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceDefs__ServiceDefsAssignment_3_in_rule__ServiceDefs__Group__3__Impl983);
            rule__ServiceDefs__ServiceDefsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }

            }

            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:491:1: ( ( rule__ServiceDefs__ServiceDefsAssignment_3 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:492:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:493:1: ( rule__ServiceDefs__ServiceDefsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_DOC||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:493:2: rule__ServiceDefs__ServiceDefsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDefs__ServiceDefsAssignment_3_in_rule__ServiceDefs__Group__3__Impl995);
            	    rule__ServiceDefs__ServiceDefsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getServiceDefsAssignment_3()); 
            }

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
    // $ANTLR end "rule__ServiceDefs__Group__3__Impl"


    // $ANTLR start "rule__DomainElement__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:512:1: rule__DomainElement__Group__0 : rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 ;
    public final void rule__DomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:516:1: ( rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:517:2: rule__DomainElement__Group__0__Impl rule__DomainElement__Group__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__0__Impl_in_rule__DomainElement__Group__01036);
            rule__DomainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group__1_in_rule__DomainElement__Group__01039);
            rule__DomainElement__Group__1();

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
    // $ANTLR end "rule__DomainElement__Group__0"


    // $ANTLR start "rule__DomainElement__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:524:1: rule__DomainElement__Group__0__Impl : ( ( rule__DomainElement__DocAssignment_0 )* ) ;
    public final void rule__DomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:528:1: ( ( ( rule__DomainElement__DocAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:529:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:529:1: ( ( rule__DomainElement__DocAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:530:1: ( rule__DomainElement__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:531:1: ( rule__DomainElement__DocAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOC) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:531:2: rule__DomainElement__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__DocAssignment_0_in_rule__DomainElement__Group__0__Impl1066);
            	    rule__DomainElement__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getDocAssignment_0()); 
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
    // $ANTLR end "rule__DomainElement__Group__0__Impl"


    // $ANTLR start "rule__DomainElement__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:541:1: rule__DomainElement__Group__1 : rule__DomainElement__Group__1__Impl ;
    public final void rule__DomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:545:1: ( rule__DomainElement__Group__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:546:2: rule__DomainElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group__1__Impl_in_rule__DomainElement__Group__11097);
            rule__DomainElement__Group__1__Impl();

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
    // $ANTLR end "rule__DomainElement__Group__1"


    // $ANTLR start "rule__DomainElement__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:552:1: rule__DomainElement__Group__1__Impl : ( ( rule__DomainElement__Alternatives_1 ) ) ;
    public final void rule__DomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:556:1: ( ( ( rule__DomainElement__Alternatives_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:557:1: ( ( rule__DomainElement__Alternatives_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:557:1: ( ( rule__DomainElement__Alternatives_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:558:1: ( rule__DomainElement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:559:1: ( rule__DomainElement__Alternatives_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:559:2: rule__DomainElement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DomainElement__Alternatives_1_in_rule__DomainElement__Group__1__Impl1124);
            rule__DomainElement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DomainElement__Group__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_0__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:573:1: rule__DomainElement__Group_1_0__0 : rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 ;
    public final void rule__DomainElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:577:1: ( rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:578:2: rule__DomainElement__Group_1_0__0__Impl rule__DomainElement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__0__Impl_in_rule__DomainElement__Group_1_0__01158);
            rule__DomainElement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__1_in_rule__DomainElement__Group_1_0__01161);
            rule__DomainElement__Group_1_0__1();

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
    // $ANTLR end "rule__DomainElement__Group_1_0__0"


    // $ANTLR start "rule__DomainElement__Group_1_0__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:585:1: rule__DomainElement__Group_1_0__0__Impl : ( 'javatype' ) ;
    public final void rule__DomainElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:589:1: ( ( 'javatype' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:590:1: ( 'javatype' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:590:1: ( 'javatype' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:591:1: 'javatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__DomainElement__Group_1_0__0__Impl1189); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getJavatypeKeyword_1_0_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_0__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:604:1: rule__DomainElement__Group_1_0__1 : rule__DomainElement__Group_1_0__1__Impl ;
    public final void rule__DomainElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:608:1: ( rule__DomainElement__Group_1_0__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:609:2: rule__DomainElement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_0__1__Impl_in_rule__DomainElement__Group_1_0__11220);
            rule__DomainElement__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__DomainElement__Group_1_0__1"


    // $ANTLR start "rule__DomainElement__Group_1_0__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:615:1: rule__DomainElement__Group_1_0__1__Impl : ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) ;
    public final void rule__DomainElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:619:1: ( ( ( rule__DomainElement__NameAssignment_1_0_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:620:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:620:1: ( ( rule__DomainElement__NameAssignment_1_0_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:621:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:622:1: ( rule__DomainElement__NameAssignment_1_0_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:622:2: rule__DomainElement__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_0_1_in_rule__DomainElement__Group_1_0__1__Impl1247);
            rule__DomainElement__NameAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_0_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:636:1: rule__DomainElement__Group_1_1__0 : rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 ;
    public final void rule__DomainElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:640:1: ( rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:641:2: rule__DomainElement__Group_1_1__0__Impl rule__DomainElement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__0__Impl_in_rule__DomainElement__Group_1_1__01281);
            rule__DomainElement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__1_in_rule__DomainElement__Group_1_1__01284);
            rule__DomainElement__Group_1_1__1();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__0"


    // $ANTLR start "rule__DomainElement__Group_1_1__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:648:1: rule__DomainElement__Group_1_1__0__Impl : ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) ;
    public final void rule__DomainElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:652:1: ( ( ( rule__DomainElement__CustAssignment_1_1_0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:653:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:653:1: ( ( rule__DomainElement__CustAssignment_1_1_0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:654:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:655:1: ( rule__DomainElement__CustAssignment_1_1_0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:655:2: rule__DomainElement__CustAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__DomainElement__CustAssignment_1_1_0_in_rule__DomainElement__Group_1_1__0__Impl1311);
            rule__DomainElement__CustAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustAssignment_1_1_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:665:1: rule__DomainElement__Group_1_1__1 : rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 ;
    public final void rule__DomainElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:669:1: ( rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:670:2: rule__DomainElement__Group_1_1__1__Impl rule__DomainElement__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__1__Impl_in_rule__DomainElement__Group_1_1__11341);
            rule__DomainElement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__2_in_rule__DomainElement__Group_1_1__11344);
            rule__DomainElement__Group_1_1__2();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__1"


    // $ANTLR start "rule__DomainElement__Group_1_1__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:677:1: rule__DomainElement__Group_1_1__1__Impl : ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) ;
    public final void rule__DomainElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:681:1: ( ( ( rule__DomainElement__NameAssignment_1_1_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:682:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:682:1: ( ( rule__DomainElement__NameAssignment_1_1_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:683:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:684:1: ( rule__DomainElement__NameAssignment_1_1_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:684:2: rule__DomainElement__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_1_1_in_rule__DomainElement__Group_1_1__1__Impl1371);
            rule__DomainElement__NameAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_1_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:694:1: rule__DomainElement__Group_1_1__2 : rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 ;
    public final void rule__DomainElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:698:1: ( rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:699:2: rule__DomainElement__Group_1_1__2__Impl rule__DomainElement__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__2__Impl_in_rule__DomainElement__Group_1_1__21401);
            rule__DomainElement__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__3_in_rule__DomainElement__Group_1_1__21404);
            rule__DomainElement__Group_1_1__3();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__2"


    // $ANTLR start "rule__DomainElement__Group_1_1__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:706:1: rule__DomainElement__Group_1_1__2__Impl : ( ( rule__DomainElement__Group_1_1_2__0 )? ) ;
    public final void rule__DomainElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:710:1: ( ( ( rule__DomainElement__Group_1_1_2__0 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:711:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:711:1: ( ( rule__DomainElement__Group_1_1_2__0 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:712:1: ( rule__DomainElement__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:713:1: ( rule__DomainElement__Group_1_1_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:713:2: rule__DomainElement__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__0_in_rule__DomainElement__Group_1_1__2__Impl1431);
                    rule__DomainElement__Group_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getGroup_1_1_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:723:1: rule__DomainElement__Group_1_1__3 : rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 ;
    public final void rule__DomainElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:727:1: ( rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:728:2: rule__DomainElement__Group_1_1__3__Impl rule__DomainElement__Group_1_1__4
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__3__Impl_in_rule__DomainElement__Group_1_1__31462);
            rule__DomainElement__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__4_in_rule__DomainElement__Group_1_1__31465);
            rule__DomainElement__Group_1_1__4();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__3"


    // $ANTLR start "rule__DomainElement__Group_1_1__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:735:1: rule__DomainElement__Group_1_1__3__Impl : ( '{' ) ;
    public final void rule__DomainElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:739:1: ( ( '{' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:740:1: ( '{' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:740:1: ( '{' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:741:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__DomainElement__Group_1_1__3__Impl1493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getLeftCurlyBracketKeyword_1_1_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__3__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:754:1: rule__DomainElement__Group_1_1__4 : rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 ;
    public final void rule__DomainElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:758:1: ( rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:759:2: rule__DomainElement__Group_1_1__4__Impl rule__DomainElement__Group_1_1__5
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__4__Impl_in_rule__DomainElement__Group_1_1__41524);
            rule__DomainElement__Group_1_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__5_in_rule__DomainElement__Group_1_1__41527);
            rule__DomainElement__Group_1_1__5();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__4"


    // $ANTLR start "rule__DomainElement__Group_1_1__4__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:766:1: rule__DomainElement__Group_1_1__4__Impl : ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) ;
    public final void rule__DomainElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:770:1: ( ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:771:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:771:1: ( ( rule__DomainElement__AttributesAssignment_1_1_4 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:772:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:773:1: ( rule__DomainElement__AttributesAssignment_1_1_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_DOC)||LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:773:2: rule__DomainElement__AttributesAssignment_1_1_4
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__AttributesAssignment_1_1_4_in_rule__DomainElement__Group_1_1__4__Impl1554);
            	    rule__DomainElement__AttributesAssignment_1_1_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAttributesAssignment_1_1_4()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__4__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1__5"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:783:1: rule__DomainElement__Group_1_1__5 : rule__DomainElement__Group_1_1__5__Impl ;
    public final void rule__DomainElement__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:787:1: ( rule__DomainElement__Group_1_1__5__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:788:2: rule__DomainElement__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1__5__Impl_in_rule__DomainElement__Group_1_1__51585);
            rule__DomainElement__Group_1_1__5__Impl();

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
    // $ANTLR end "rule__DomainElement__Group_1_1__5"


    // $ANTLR start "rule__DomainElement__Group_1_1__5__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:794:1: rule__DomainElement__Group_1_1__5__Impl : ( '}' ) ;
    public final void rule__DomainElement__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:798:1: ( ( '}' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:799:1: ( '}' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:799:1: ( '}' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:800:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5()); 
            }
            match(input,16,FOLLOW_16_in_rule__DomainElement__Group_1_1__5__Impl1613); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRightCurlyBracketKeyword_1_1_5()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1__5__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:825:1: rule__DomainElement__Group_1_1_2__0 : rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 ;
    public final void rule__DomainElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:829:1: ( rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:830:2: rule__DomainElement__Group_1_1_2__0__Impl rule__DomainElement__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__0__Impl_in_rule__DomainElement__Group_1_1_2__01656);
            rule__DomainElement__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__1_in_rule__DomainElement__Group_1_1_2__01659);
            rule__DomainElement__Group_1_1_2__1();

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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__0"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:837:1: rule__DomainElement__Group_1_1_2__0__Impl : ( 'extends' ) ;
    public final void rule__DomainElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:841:1: ( ( 'extends' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:842:1: ( 'extends' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:842:1: ( 'extends' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:843:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__DomainElement__Group_1_1_2__0__Impl1687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getExtendsKeyword_1_1_2_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:856:1: rule__DomainElement__Group_1_1_2__1 : rule__DomainElement__Group_1_1_2__1__Impl ;
    public final void rule__DomainElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:860:1: ( rule__DomainElement__Group_1_1_2__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:861:2: rule__DomainElement__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_1_2__1__Impl_in_rule__DomainElement__Group_1_1_2__11718);
            rule__DomainElement__Group_1_1_2__1__Impl();

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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__1"


    // $ANTLR start "rule__DomainElement__Group_1_1_2__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:867:1: rule__DomainElement__Group_1_1_2__1__Impl : ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:871:1: ( ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:872:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:872:1: ( ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:873:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:874:1: ( rule__DomainElement__SuperTypeAssignment_1_1_2_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:874:2: rule__DomainElement__SuperTypeAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__DomainElement__SuperTypeAssignment_1_1_2_1_in_rule__DomainElement__Group_1_1_2__1__Impl1745);
            rule__DomainElement__SuperTypeAssignment_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeAssignment_1_1_2_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:888:1: rule__DomainElement__Group_1_2__0 : rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 ;
    public final void rule__DomainElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:892:1: ( rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:893:2: rule__DomainElement__Group_1_2__0__Impl rule__DomainElement__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__0__Impl_in_rule__DomainElement__Group_1_2__01779);
            rule__DomainElement__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__1_in_rule__DomainElement__Group_1_2__01782);
            rule__DomainElement__Group_1_2__1();

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
    // $ANTLR end "rule__DomainElement__Group_1_2__0"


    // $ANTLR start "rule__DomainElement__Group_1_2__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:900:1: rule__DomainElement__Group_1_2__0__Impl : ( 'enum' ) ;
    public final void rule__DomainElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:904:1: ( ( 'enum' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:905:1: ( 'enum' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:905:1: ( 'enum' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:906:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__DomainElement__Group_1_2__0__Impl1810); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumKeyword_1_2_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:919:1: rule__DomainElement__Group_1_2__1 : rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 ;
    public final void rule__DomainElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:923:1: ( rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:924:2: rule__DomainElement__Group_1_2__1__Impl rule__DomainElement__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__1__Impl_in_rule__DomainElement__Group_1_2__11841);
            rule__DomainElement__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__2_in_rule__DomainElement__Group_1_2__11844);
            rule__DomainElement__Group_1_2__2();

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
    // $ANTLR end "rule__DomainElement__Group_1_2__1"


    // $ANTLR start "rule__DomainElement__Group_1_2__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:931:1: rule__DomainElement__Group_1_2__1__Impl : ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) ;
    public final void rule__DomainElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:935:1: ( ( ( rule__DomainElement__NameAssignment_1_2_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:936:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:936:1: ( ( rule__DomainElement__NameAssignment_1_2_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:937:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:938:1: ( rule__DomainElement__NameAssignment_1_2_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:938:2: rule__DomainElement__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_2_1_in_rule__DomainElement__Group_1_2__1__Impl1871);
            rule__DomainElement__NameAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_2_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:948:1: rule__DomainElement__Group_1_2__2 : rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 ;
    public final void rule__DomainElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:952:1: ( rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:953:2: rule__DomainElement__Group_1_2__2__Impl rule__DomainElement__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__2__Impl_in_rule__DomainElement__Group_1_2__21901);
            rule__DomainElement__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__3_in_rule__DomainElement__Group_1_2__21904);
            rule__DomainElement__Group_1_2__3();

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
    // $ANTLR end "rule__DomainElement__Group_1_2__2"


    // $ANTLR start "rule__DomainElement__Group_1_2__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:960:1: rule__DomainElement__Group_1_2__2__Impl : ( '(' ) ;
    public final void rule__DomainElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:964:1: ( ( '(' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:965:1: ( '(' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:965:1: ( '(' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:966:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__DomainElement__Group_1_2__2__Impl1932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getLeftParenthesisKeyword_1_2_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:979:1: rule__DomainElement__Group_1_2__3 : rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 ;
    public final void rule__DomainElement__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:983:1: ( rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:984:2: rule__DomainElement__Group_1_2__3__Impl rule__DomainElement__Group_1_2__4
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__3__Impl_in_rule__DomainElement__Group_1_2__31963);
            rule__DomainElement__Group_1_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__4_in_rule__DomainElement__Group_1_2__31966);
            rule__DomainElement__Group_1_2__4();

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
    // $ANTLR end "rule__DomainElement__Group_1_2__3"


    // $ANTLR start "rule__DomainElement__Group_1_2__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:991:1: rule__DomainElement__Group_1_2__3__Impl : ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) ;
    public final void rule__DomainElement__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:995:1: ( ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:996:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:996:1: ( ( rule__DomainElement__EnumValuesAssignment_1_2_3 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:997:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:998:1: ( rule__DomainElement__EnumValuesAssignment_1_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:998:2: rule__DomainElement__EnumValuesAssignment_1_2_3
            	    {
            	    pushFollow(FOLLOW_rule__DomainElement__EnumValuesAssignment_1_2_3_in_rule__DomainElement__Group_1_2__3__Impl1993);
            	    rule__DomainElement__EnumValuesAssignment_1_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumValuesAssignment_1_2_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__3__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_2__4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1008:1: rule__DomainElement__Group_1_2__4 : rule__DomainElement__Group_1_2__4__Impl ;
    public final void rule__DomainElement__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1012:1: ( rule__DomainElement__Group_1_2__4__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1013:2: rule__DomainElement__Group_1_2__4__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_2__4__Impl_in_rule__DomainElement__Group_1_2__42024);
            rule__DomainElement__Group_1_2__4__Impl();

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
    // $ANTLR end "rule__DomainElement__Group_1_2__4"


    // $ANTLR start "rule__DomainElement__Group_1_2__4__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1019:1: rule__DomainElement__Group_1_2__4__Impl : ( ')' ) ;
    public final void rule__DomainElement__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1023:1: ( ( ')' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1024:1: ( ')' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1024:1: ( ')' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1025:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__DomainElement__Group_1_2__4__Impl2052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRightParenthesisKeyword_1_2_4()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_2__4__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1048:1: rule__DomainElement__Group_1_3__0 : rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 ;
    public final void rule__DomainElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1052:1: ( rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1053:2: rule__DomainElement__Group_1_3__0__Impl rule__DomainElement__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__0__Impl_in_rule__DomainElement__Group_1_3__02093);
            rule__DomainElement__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__1_in_rule__DomainElement__Group_1_3__02096);
            rule__DomainElement__Group_1_3__1();

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
    // $ANTLR end "rule__DomainElement__Group_1_3__0"


    // $ANTLR start "rule__DomainElement__Group_1_3__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1060:1: rule__DomainElement__Group_1_3__0__Impl : ( 'alias' ) ;
    public final void rule__DomainElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1064:1: ( ( 'alias' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1065:1: ( 'alias' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1065:1: ( 'alias' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1066:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__DomainElement__Group_1_3__0__Impl2124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAliasKeyword_1_3_0()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__0__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1079:1: rule__DomainElement__Group_1_3__1 : rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 ;
    public final void rule__DomainElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1083:1: ( rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1084:2: rule__DomainElement__Group_1_3__1__Impl rule__DomainElement__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__1__Impl_in_rule__DomainElement__Group_1_3__12155);
            rule__DomainElement__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__2_in_rule__DomainElement__Group_1_3__12158);
            rule__DomainElement__Group_1_3__2();

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
    // $ANTLR end "rule__DomainElement__Group_1_3__1"


    // $ANTLR start "rule__DomainElement__Group_1_3__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1091:1: rule__DomainElement__Group_1_3__1__Impl : ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) ;
    public final void rule__DomainElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1095:1: ( ( ( rule__DomainElement__NameAssignment_1_3_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1096:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1096:1: ( ( rule__DomainElement__NameAssignment_1_3_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1097:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1098:1: ( rule__DomainElement__NameAssignment_1_3_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1098:2: rule__DomainElement__NameAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__DomainElement__NameAssignment_1_3_1_in_rule__DomainElement__Group_1_3__1__Impl2185);
            rule__DomainElement__NameAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameAssignment_1_3_1()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__1__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1108:1: rule__DomainElement__Group_1_3__2 : rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 ;
    public final void rule__DomainElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1112:1: ( rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1113:2: rule__DomainElement__Group_1_3__2__Impl rule__DomainElement__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__2__Impl_in_rule__DomainElement__Group_1_3__22215);
            rule__DomainElement__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__3_in_rule__DomainElement__Group_1_3__22218);
            rule__DomainElement__Group_1_3__3();

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
    // $ANTLR end "rule__DomainElement__Group_1_3__2"


    // $ANTLR start "rule__DomainElement__Group_1_3__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1120:1: rule__DomainElement__Group_1_3__2__Impl : ( 'as' ) ;
    public final void rule__DomainElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1124:1: ( ( 'as' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1125:1: ( 'as' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1125:1: ( 'as' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1126:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__DomainElement__Group_1_3__2__Impl2246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAsKeyword_1_3_2()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__2__Impl"


    // $ANTLR start "rule__DomainElement__Group_1_3__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1139:1: rule__DomainElement__Group_1_3__3 : rule__DomainElement__Group_1_3__3__Impl ;
    public final void rule__DomainElement__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1143:1: ( rule__DomainElement__Group_1_3__3__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1144:2: rule__DomainElement__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__DomainElement__Group_1_3__3__Impl_in_rule__DomainElement__Group_1_3__32277);
            rule__DomainElement__Group_1_3__3__Impl();

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
    // $ANTLR end "rule__DomainElement__Group_1_3__3"


    // $ANTLR start "rule__DomainElement__Group_1_3__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1150:1: rule__DomainElement__Group_1_3__3__Impl : ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) ;
    public final void rule__DomainElement__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1154:1: ( ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1155:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1155:1: ( ( rule__DomainElement__RealTypeAssignment_1_3_3 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1156:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1157:1: ( rule__DomainElement__RealTypeAssignment_1_3_3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1157:2: rule__DomainElement__RealTypeAssignment_1_3_3
            {
            pushFollow(FOLLOW_rule__DomainElement__RealTypeAssignment_1_3_3_in_rule__DomainElement__Group_1_3__3__Impl2304);
            rule__DomainElement__RealTypeAssignment_1_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRealTypeAssignment_1_3_3()); 
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
    // $ANTLR end "rule__DomainElement__Group_1_3__3__Impl"


    // $ANTLR start "rule__EnumVal__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1175:1: rule__EnumVal__Group__0 : rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 ;
    public final void rule__EnumVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1179:1: ( rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1180:2: rule__EnumVal__Group__0__Impl rule__EnumVal__Group__1
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__0__Impl_in_rule__EnumVal__Group__02342);
            rule__EnumVal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumVal__Group__1_in_rule__EnumVal__Group__02345);
            rule__EnumVal__Group__1();

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
    // $ANTLR end "rule__EnumVal__Group__0"


    // $ANTLR start "rule__EnumVal__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1187:1: rule__EnumVal__Group__0__Impl : ( ( rule__EnumVal__DocAssignment_0 )* ) ;
    public final void rule__EnumVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1191:1: ( ( ( rule__EnumVal__DocAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1192:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1192:1: ( ( rule__EnumVal__DocAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1193:1: ( rule__EnumVal__DocAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1194:1: ( rule__EnumVal__DocAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1194:2: rule__EnumVal__DocAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EnumVal__DocAssignment_0_in_rule__EnumVal__Group__0__Impl2372);
            	    rule__EnumVal__DocAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getDocAssignment_0()); 
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
    // $ANTLR end "rule__EnumVal__Group__0__Impl"


    // $ANTLR start "rule__EnumVal__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1204:1: rule__EnumVal__Group__1 : rule__EnumVal__Group__1__Impl ;
    public final void rule__EnumVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1208:1: ( rule__EnumVal__Group__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1209:2: rule__EnumVal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumVal__Group__1__Impl_in_rule__EnumVal__Group__12403);
            rule__EnumVal__Group__1__Impl();

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
    // $ANTLR end "rule__EnumVal__Group__1"


    // $ANTLR start "rule__EnumVal__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1215:1: rule__EnumVal__Group__1__Impl : ( ( rule__EnumVal__NameAssignment_1 ) ) ;
    public final void rule__EnumVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1219:1: ( ( ( rule__EnumVal__NameAssignment_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1220:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1220:1: ( ( rule__EnumVal__NameAssignment_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1221:1: ( rule__EnumVal__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1222:1: ( rule__EnumVal__NameAssignment_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1222:2: rule__EnumVal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumVal__NameAssignment_1_in_rule__EnumVal__Group__1__Impl2430);
            rule__EnumVal__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EnumVal__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1236:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1240:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1241:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02464);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02467);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1248:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DocumentationAssignment_0 )* ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1252:1: ( ( ( rule__Attribute__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1253:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1253:1: ( ( rule__Attribute__DocumentationAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1254:1: ( rule__Attribute__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1255:1: ( rule__Attribute__DocumentationAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1255:2: rule__Attribute__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__DocumentationAssignment_0_in_rule__Attribute__Group__0__Impl2494);
            	    rule__Attribute__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1265:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1269:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1270:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12525);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12528);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1277:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__OptionalAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1281:1: ( ( ( rule__Attribute__OptionalAssignment_1 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1282:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1282:1: ( ( rule__Attribute__OptionalAssignment_1 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1283:1: ( rule__Attribute__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1284:1: ( rule__Attribute__OptionalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1284:2: rule__Attribute__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__OptionalAssignment_1_in_rule__Attribute__Group__1__Impl2555);
                    rule__Attribute__OptionalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalAssignment_1()); 
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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1294:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1298:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1299:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22586);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22589);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1306:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1310:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1311:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1311:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1312:1: ( rule__Attribute__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1313:1: ( rule__Attribute__TypeAssignment_2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1313:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2616);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1323:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1327:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1328:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32646);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32649);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1335:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1339:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1340:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1340:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1341:1: ( rule__Attribute__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1342:1: ( rule__Attribute__NameAssignment_3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1342:2: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl2676);
            rule__Attribute__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1352:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1356:1: ( rule__Attribute__Group__4__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1357:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42706);
            rule__Attribute__Group__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1363:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1367:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1368:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1368:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1369:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1370:1: ( rule__Attribute__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1370:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl2733);
                    rule__Attribute__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1390:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1394:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1395:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__02774);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__02777);
            rule__Attribute__Group_4__1();

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
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1402:1: rule__Attribute__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1406:1: ( ( '=' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1407:1: ( '=' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1407:1: ( '=' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1408:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Attribute__Group_4__0__Impl2805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1421:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1425:1: ( rule__Attribute__Group_4__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1426:2: rule__Attribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__12836);
            rule__Attribute__Group_4__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1432:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ValueAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1436:1: ( ( ( rule__Attribute__ValueAssignment_4_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1437:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1437:1: ( ( rule__Attribute__ValueAssignment_4_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1438:1: ( rule__Attribute__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1439:1: ( rule__Attribute__ValueAssignment_4_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1439:2: rule__Attribute__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_4_1_in_rule__Attribute__Group_4__1__Impl2863);
            rule__Attribute__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_4_1()); 
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
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1453:1: rule__GenericTypeArgument__Group__0 : rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 ;
    public final void rule__GenericTypeArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1457:1: ( rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1458:2: rule__GenericTypeArgument__Group__0__Impl rule__GenericTypeArgument__Group__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__0__Impl_in_rule__GenericTypeArgument__Group__02897);
            rule__GenericTypeArgument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__1_in_rule__GenericTypeArgument__Group__02900);
            rule__GenericTypeArgument__Group__1();

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
    // $ANTLR end "rule__GenericTypeArgument__Group__0"


    // $ANTLR start "rule__GenericTypeArgument__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1465:1: rule__GenericTypeArgument__Group__0__Impl : ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) ;
    public final void rule__GenericTypeArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1469:1: ( ( ( rule__GenericTypeArgument__TypeAssignment_0 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1470:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1470:1: ( ( rule__GenericTypeArgument__TypeAssignment_0 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1471:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1472:1: ( rule__GenericTypeArgument__TypeAssignment_0 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1472:2: rule__GenericTypeArgument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__TypeAssignment_0_in_rule__GenericTypeArgument__Group__0__Impl2927);
            rule__GenericTypeArgument__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1482:1: rule__GenericTypeArgument__Group__1 : rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 ;
    public final void rule__GenericTypeArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1486:1: ( rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1487:2: rule__GenericTypeArgument__Group__1__Impl rule__GenericTypeArgument__Group__2
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__1__Impl_in_rule__GenericTypeArgument__Group__12957);
            rule__GenericTypeArgument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__2_in_rule__GenericTypeArgument__Group__12960);
            rule__GenericTypeArgument__Group__2();

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
    // $ANTLR end "rule__GenericTypeArgument__Group__1"


    // $ANTLR start "rule__GenericTypeArgument__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1494:1: rule__GenericTypeArgument__Group__1__Impl : ( ( rule__GenericTypeArgument__Group_1__0 )? ) ;
    public final void rule__GenericTypeArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1498:1: ( ( ( rule__GenericTypeArgument__Group_1__0 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1499:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1499:1: ( ( rule__GenericTypeArgument__Group_1__0 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1500:1: ( rule__GenericTypeArgument__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1501:1: ( rule__GenericTypeArgument__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1501:2: rule__GenericTypeArgument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__0_in_rule__GenericTypeArgument__Group__1__Impl2987);
                    rule__GenericTypeArgument__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1511:1: rule__GenericTypeArgument__Group__2 : rule__GenericTypeArgument__Group__2__Impl ;
    public final void rule__GenericTypeArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1515:1: ( rule__GenericTypeArgument__Group__2__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1516:2: rule__GenericTypeArgument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group__2__Impl_in_rule__GenericTypeArgument__Group__23018);
            rule__GenericTypeArgument__Group__2__Impl();

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
    // $ANTLR end "rule__GenericTypeArgument__Group__2"


    // $ANTLR start "rule__GenericTypeArgument__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1522:1: rule__GenericTypeArgument__Group__2__Impl : ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) ;
    public final void rule__GenericTypeArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1526:1: ( ( ( rule__GenericTypeArgument__ListAssignment_2 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1527:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1527:1: ( ( rule__GenericTypeArgument__ListAssignment_2 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1528:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1529:1: ( rule__GenericTypeArgument__ListAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1529:2: rule__GenericTypeArgument__ListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__GenericTypeArgument__ListAssignment_2_in_rule__GenericTypeArgument__Group__2__Impl3045);
                    rule__GenericTypeArgument__ListAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListAssignment_2()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group__2__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1545:1: rule__GenericTypeArgument__Group_1__0 : rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 ;
    public final void rule__GenericTypeArgument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1549:1: ( rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1550:2: rule__GenericTypeArgument__Group_1__0__Impl rule__GenericTypeArgument__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__0__Impl_in_rule__GenericTypeArgument__Group_1__03082);
            rule__GenericTypeArgument__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__1_in_rule__GenericTypeArgument__Group_1__03085);
            rule__GenericTypeArgument__Group_1__1();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__0"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1557:1: rule__GenericTypeArgument__Group_1__0__Impl : ( '<' ) ;
    public final void rule__GenericTypeArgument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1561:1: ( ( '<' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1562:1: ( '<' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1562:1: ( '<' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1563:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GenericTypeArgument__Group_1__0__Impl3113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getLessThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1576:1: rule__GenericTypeArgument__Group_1__1 : rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 ;
    public final void rule__GenericTypeArgument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1580:1: ( rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1581:2: rule__GenericTypeArgument__Group_1__1__Impl rule__GenericTypeArgument__Group_1__2
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__1__Impl_in_rule__GenericTypeArgument__Group_1__13144);
            rule__GenericTypeArgument__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__2_in_rule__GenericTypeArgument__Group_1__13147);
            rule__GenericTypeArgument__Group_1__2();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__1"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1588:1: rule__GenericTypeArgument__Group_1__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1592:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1593:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1593:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1594:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1595:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1595:2: rule__GenericTypeArgument__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_1_in_rule__GenericTypeArgument__Group_1__1__Impl3174);
            rule__GenericTypeArgument__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__1__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1605:1: rule__GenericTypeArgument__Group_1__2 : rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 ;
    public final void rule__GenericTypeArgument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1609:1: ( rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1610:2: rule__GenericTypeArgument__Group_1__2__Impl rule__GenericTypeArgument__Group_1__3
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__2__Impl_in_rule__GenericTypeArgument__Group_1__23204);
            rule__GenericTypeArgument__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__3_in_rule__GenericTypeArgument__Group_1__23207);
            rule__GenericTypeArgument__Group_1__3();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__2"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1617:1: rule__GenericTypeArgument__Group_1__2__Impl : ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) ;
    public final void rule__GenericTypeArgument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1621:1: ( ( ( rule__GenericTypeArgument__Group_1_2__0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1622:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1622:1: ( ( rule__GenericTypeArgument__Group_1_2__0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1623:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1624:1: ( rule__GenericTypeArgument__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1624:2: rule__GenericTypeArgument__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__0_in_rule__GenericTypeArgument__Group_1__2__Impl3234);
            	    rule__GenericTypeArgument__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__2__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1634:1: rule__GenericTypeArgument__Group_1__3 : rule__GenericTypeArgument__Group_1__3__Impl ;
    public final void rule__GenericTypeArgument__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1638:1: ( rule__GenericTypeArgument__Group_1__3__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1639:2: rule__GenericTypeArgument__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1__3__Impl_in_rule__GenericTypeArgument__Group_1__33265);
            rule__GenericTypeArgument__Group_1__3__Impl();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__3"


    // $ANTLR start "rule__GenericTypeArgument__Group_1__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1645:1: rule__GenericTypeArgument__Group_1__3__Impl : ( '>' ) ;
    public final void rule__GenericTypeArgument__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1649:1: ( ( '>' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1650:1: ( '>' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1650:1: ( '>' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1651:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__GenericTypeArgument__Group_1__3__Impl3293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getGreaterThanSignKeyword_1_3()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1__3__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1672:1: rule__GenericTypeArgument__Group_1_2__0 : rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 ;
    public final void rule__GenericTypeArgument__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1676:1: ( rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1677:2: rule__GenericTypeArgument__Group_1_2__0__Impl rule__GenericTypeArgument__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__0__Impl_in_rule__GenericTypeArgument__Group_1_2__03332);
            rule__GenericTypeArgument__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__1_in_rule__GenericTypeArgument__Group_1_2__03335);
            rule__GenericTypeArgument__Group_1_2__1();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__0"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1684:1: rule__GenericTypeArgument__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__GenericTypeArgument__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1688:1: ( ( ',' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1689:1: ( ',' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1689:1: ( ',' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1690:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__GenericTypeArgument__Group_1_2__0__Impl3363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__0__Impl"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1703:1: rule__GenericTypeArgument__Group_1_2__1 : rule__GenericTypeArgument__Group_1_2__1__Impl ;
    public final void rule__GenericTypeArgument__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1707:1: ( rule__GenericTypeArgument__Group_1_2__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1708:2: rule__GenericTypeArgument__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__Group_1_2__1__Impl_in_rule__GenericTypeArgument__Group_1_2__13394);
            rule__GenericTypeArgument__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__1"


    // $ANTLR start "rule__GenericTypeArgument__Group_1_2__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1714:1: rule__GenericTypeArgument__Group_1_2__1__Impl : ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__GenericTypeArgument__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1718:1: ( ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1719:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1719:1: ( ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1720:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1721:1: ( rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1721:2: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_2_1_in_rule__GenericTypeArgument__Group_1_2__1__Impl3421);
            rule__GenericTypeArgument__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__GenericTypeArgument__Group_1_2__1__Impl"


    // $ANTLR start "rule__ServiceDef__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1735:1: rule__ServiceDef__Group__0 : rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 ;
    public final void rule__ServiceDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1739:1: ( rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1740:2: rule__ServiceDef__Group__0__Impl rule__ServiceDef__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__0__Impl_in_rule__ServiceDef__Group__03455);
            rule__ServiceDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__1_in_rule__ServiceDef__Group__03458);
            rule__ServiceDef__Group__1();

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
    // $ANTLR end "rule__ServiceDef__Group__0"


    // $ANTLR start "rule__ServiceDef__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1747:1: rule__ServiceDef__Group__0__Impl : ( ( rule__ServiceDef__DocumentationAssignment_0 )* ) ;
    public final void rule__ServiceDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1751:1: ( ( ( rule__ServiceDef__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1752:1: ( ( rule__ServiceDef__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1752:1: ( ( rule__ServiceDef__DocumentationAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1753:1: ( rule__ServiceDef__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1754:1: ( rule__ServiceDef__DocumentationAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1754:2: rule__ServiceDef__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDef__DocumentationAssignment_0_in_rule__ServiceDef__Group__0__Impl3485);
            	    rule__ServiceDef__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__ServiceDef__Group__0__Impl"


    // $ANTLR start "rule__ServiceDef__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1764:1: rule__ServiceDef__Group__1 : rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 ;
    public final void rule__ServiceDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1768:1: ( rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1769:2: rule__ServiceDef__Group__1__Impl rule__ServiceDef__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__1__Impl_in_rule__ServiceDef__Group__13516);
            rule__ServiceDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__2_in_rule__ServiceDef__Group__13519);
            rule__ServiceDef__Group__2();

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
    // $ANTLR end "rule__ServiceDef__Group__1"


    // $ANTLR start "rule__ServiceDef__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1776:1: rule__ServiceDef__Group__1__Impl : ( 'service' ) ;
    public final void rule__ServiceDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1780:1: ( ( 'service' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1781:1: ( 'service' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1781:1: ( 'service' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1782:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getServiceKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__ServiceDef__Group__1__Impl3547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getServiceKeyword_1()); 
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
    // $ANTLR end "rule__ServiceDef__Group__1__Impl"


    // $ANTLR start "rule__ServiceDef__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1795:1: rule__ServiceDef__Group__2 : rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 ;
    public final void rule__ServiceDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1799:1: ( rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1800:2: rule__ServiceDef__Group__2__Impl rule__ServiceDef__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__2__Impl_in_rule__ServiceDef__Group__23578);
            rule__ServiceDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__3_in_rule__ServiceDef__Group__23581);
            rule__ServiceDef__Group__3();

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
    // $ANTLR end "rule__ServiceDef__Group__2"


    // $ANTLR start "rule__ServiceDef__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1807:1: rule__ServiceDef__Group__2__Impl : ( ( rule__ServiceDef__NameAssignment_2 ) ) ;
    public final void rule__ServiceDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1811:1: ( ( ( rule__ServiceDef__NameAssignment_2 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1812:1: ( ( rule__ServiceDef__NameAssignment_2 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1812:1: ( ( rule__ServiceDef__NameAssignment_2 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1813:1: ( rule__ServiceDef__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1814:1: ( rule__ServiceDef__NameAssignment_2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1814:2: rule__ServiceDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceDef__NameAssignment_2_in_rule__ServiceDef__Group__2__Impl3608);
            rule__ServiceDef__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ServiceDef__Group__2__Impl"


    // $ANTLR start "rule__ServiceDef__Group__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1824:1: rule__ServiceDef__Group__3 : rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 ;
    public final void rule__ServiceDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1828:1: ( rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1829:2: rule__ServiceDef__Group__3__Impl rule__ServiceDef__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__3__Impl_in_rule__ServiceDef__Group__33638);
            rule__ServiceDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__4_in_rule__ServiceDef__Group__33641);
            rule__ServiceDef__Group__4();

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
    // $ANTLR end "rule__ServiceDef__Group__3"


    // $ANTLR start "rule__ServiceDef__Group__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1836:1: rule__ServiceDef__Group__3__Impl : ( '{' ) ;
    public final void rule__ServiceDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1840:1: ( ( '{' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1841:1: ( '{' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1841:1: ( '{' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1842:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ServiceDef__Group__3__Impl3669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ServiceDef__Group__3__Impl"


    // $ANTLR start "rule__ServiceDef__Group__4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1855:1: rule__ServiceDef__Group__4 : rule__ServiceDef__Group__4__Impl rule__ServiceDef__Group__5 ;
    public final void rule__ServiceDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1859:1: ( rule__ServiceDef__Group__4__Impl rule__ServiceDef__Group__5 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1860:2: rule__ServiceDef__Group__4__Impl rule__ServiceDef__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__4__Impl_in_rule__ServiceDef__Group__43700);
            rule__ServiceDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__5_in_rule__ServiceDef__Group__43703);
            rule__ServiceDef__Group__5();

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
    // $ANTLR end "rule__ServiceDef__Group__4"


    // $ANTLR start "rule__ServiceDef__Group__4__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1867:1: rule__ServiceDef__Group__4__Impl : ( ( rule__ServiceDef__RequestsAssignment_4 )* ) ;
    public final void rule__ServiceDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1871:1: ( ( ( rule__ServiceDef__RequestsAssignment_4 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1872:1: ( ( rule__ServiceDef__RequestsAssignment_4 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1872:1: ( ( rule__ServiceDef__RequestsAssignment_4 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1873:1: ( rule__ServiceDef__RequestsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getRequestsAssignment_4()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1874:1: ( rule__ServiceDef__RequestsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1874:2: rule__ServiceDef__RequestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDef__RequestsAssignment_4_in_rule__ServiceDef__Group__4__Impl3730);
            	    rule__ServiceDef__RequestsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getRequestsAssignment_4()); 
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
    // $ANTLR end "rule__ServiceDef__Group__4__Impl"


    // $ANTLR start "rule__ServiceDef__Group__5"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1884:1: rule__ServiceDef__Group__5 : rule__ServiceDef__Group__5__Impl rule__ServiceDef__Group__6 ;
    public final void rule__ServiceDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1888:1: ( rule__ServiceDef__Group__5__Impl rule__ServiceDef__Group__6 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1889:2: rule__ServiceDef__Group__5__Impl rule__ServiceDef__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__5__Impl_in_rule__ServiceDef__Group__53761);
            rule__ServiceDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ServiceDef__Group__6_in_rule__ServiceDef__Group__53764);
            rule__ServiceDef__Group__6();

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
    // $ANTLR end "rule__ServiceDef__Group__5"


    // $ANTLR start "rule__ServiceDef__Group__5__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1896:1: rule__ServiceDef__Group__5__Impl : ( ( rule__ServiceDef__NotificationsAssignment_5 )* ) ;
    public final void rule__ServiceDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1900:1: ( ( ( rule__ServiceDef__NotificationsAssignment_5 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1901:1: ( ( rule__ServiceDef__NotificationsAssignment_5 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1901:1: ( ( rule__ServiceDef__NotificationsAssignment_5 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1902:1: ( rule__ServiceDef__NotificationsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNotificationsAssignment_5()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1903:1: ( rule__ServiceDef__NotificationsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC||LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1903:2: rule__ServiceDef__NotificationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDef__NotificationsAssignment_5_in_rule__ServiceDef__Group__5__Impl3791);
            	    rule__ServiceDef__NotificationsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNotificationsAssignment_5()); 
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
    // $ANTLR end "rule__ServiceDef__Group__5__Impl"


    // $ANTLR start "rule__ServiceDef__Group__6"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1913:1: rule__ServiceDef__Group__6 : rule__ServiceDef__Group__6__Impl ;
    public final void rule__ServiceDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1917:1: ( rule__ServiceDef__Group__6__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1918:2: rule__ServiceDef__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ServiceDef__Group__6__Impl_in_rule__ServiceDef__Group__63822);
            rule__ServiceDef__Group__6__Impl();

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
    // $ANTLR end "rule__ServiceDef__Group__6"


    // $ANTLR start "rule__ServiceDef__Group__6__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1924:1: rule__ServiceDef__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1928:1: ( ( '}' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1929:1: ( '}' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1929:1: ( '}' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1930:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__ServiceDef__Group__6__Impl3850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__ServiceDef__Group__6__Impl"


    // $ANTLR start "rule__Request__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1957:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1961:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1962:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_rule__Request__Group__0__Impl_in_rule__Request__Group__03895);
            rule__Request__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group__1_in_rule__Request__Group__03898);
            rule__Request__Group__1();

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
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1969:1: rule__Request__Group__0__Impl : ( ( rule__Request__DocumentationAssignment_0 )* ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1973:1: ( ( ( rule__Request__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1974:1: ( ( rule__Request__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1974:1: ( ( rule__Request__DocumentationAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1975:1: ( rule__Request__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1976:1: ( rule__Request__DocumentationAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DOC) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1976:2: rule__Request__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Request__DocumentationAssignment_0_in_rule__Request__Group__0__Impl3925);
            	    rule__Request__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1986:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1990:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1991:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_rule__Request__Group__1__Impl_in_rule__Request__Group__13956);
            rule__Request__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group__2_in_rule__Request__Group__13959);
            rule__Request__Group__2();

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
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:1998:1: rule__Request__Group__1__Impl : ( 'request' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2002:1: ( ( 'request' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2003:1: ( 'request' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2003:1: ( 'request' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2004:1: 'request'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getRequestKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Request__Group__1__Impl3987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getRequestKeyword_1()); 
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
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2017:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2021:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2022:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_rule__Request__Group__2__Impl_in_rule__Request__Group__24018);
            rule__Request__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group__3_in_rule__Request__Group__24021);
            rule__Request__Group__3();

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
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2029:1: rule__Request__Group__2__Impl : ( ( rule__Request__NameAssignment_2 ) ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2033:1: ( ( ( rule__Request__NameAssignment_2 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2034:1: ( ( rule__Request__NameAssignment_2 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2034:1: ( ( rule__Request__NameAssignment_2 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2035:1: ( rule__Request__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2036:1: ( rule__Request__NameAssignment_2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2036:2: rule__Request__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Request__NameAssignment_2_in_rule__Request__Group__2__Impl4048);
            rule__Request__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2046:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2050:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2051:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_rule__Request__Group__3__Impl_in_rule__Request__Group__34078);
            rule__Request__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group__4_in_rule__Request__Group__34081);
            rule__Request__Group__4();

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
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2058:1: rule__Request__Group__3__Impl : ( ( rule__Request__Group_3__0 )? ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2062:1: ( ( ( rule__Request__Group_3__0 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2063:1: ( ( rule__Request__Group_3__0 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2063:1: ( ( rule__Request__Group_3__0 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2064:1: ( rule__Request__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getGroup_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2065:1: ( rule__Request__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2065:2: rule__Request__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Request__Group_3__0_in_rule__Request__Group__3__Impl4108);
                    rule__Request__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2075:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2079:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2080:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_rule__Request__Group__4__Impl_in_rule__Request__Group__44139);
            rule__Request__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group__5_in_rule__Request__Group__44142);
            rule__Request__Group__5();

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
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2087:1: rule__Request__Group__4__Impl : ( 'returns' ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2091:1: ( ( 'returns' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2092:1: ( 'returns' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2092:1: ( 'returns' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2093:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getReturnsKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Request__Group__4__Impl4170); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getReturnsKeyword_4()); 
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
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__5"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2106:1: rule__Request__Group__5 : rule__Request__Group__5__Impl ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2110:1: ( rule__Request__Group__5__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2111:2: rule__Request__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Request__Group__5__Impl_in_rule__Request__Group__54201);
            rule__Request__Group__5__Impl();

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
    // $ANTLR end "rule__Request__Group__5"


    // $ANTLR start "rule__Request__Group__5__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2117:1: rule__Request__Group__5__Impl : ( ( rule__Request__Alternatives_5 ) ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2121:1: ( ( ( rule__Request__Alternatives_5 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2122:1: ( ( rule__Request__Alternatives_5 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2122:1: ( ( rule__Request__Alternatives_5 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2123:1: ( rule__Request__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getAlternatives_5()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2124:1: ( rule__Request__Alternatives_5 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2124:2: rule__Request__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Request__Alternatives_5_in_rule__Request__Group__5__Impl4228);
            rule__Request__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__Request__Group__5__Impl"


    // $ANTLR start "rule__Request__Group_3__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2146:1: rule__Request__Group_3__0 : rule__Request__Group_3__0__Impl rule__Request__Group_3__1 ;
    public final void rule__Request__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2150:1: ( rule__Request__Group_3__0__Impl rule__Request__Group_3__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2151:2: rule__Request__Group_3__0__Impl rule__Request__Group_3__1
            {
            pushFollow(FOLLOW_rule__Request__Group_3__0__Impl_in_rule__Request__Group_3__04270);
            rule__Request__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group_3__1_in_rule__Request__Group_3__04273);
            rule__Request__Group_3__1();

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
    // $ANTLR end "rule__Request__Group_3__0"


    // $ANTLR start "rule__Request__Group_3__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2158:1: rule__Request__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Request__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2162:1: ( ( '(' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2163:1: ( '(' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2163:1: ( '(' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2164:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Request__Group_3__0__Impl4301); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getLeftParenthesisKeyword_3_0()); 
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
    // $ANTLR end "rule__Request__Group_3__0__Impl"


    // $ANTLR start "rule__Request__Group_3__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2177:1: rule__Request__Group_3__1 : rule__Request__Group_3__1__Impl rule__Request__Group_3__2 ;
    public final void rule__Request__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2181:1: ( rule__Request__Group_3__1__Impl rule__Request__Group_3__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2182:2: rule__Request__Group_3__1__Impl rule__Request__Group_3__2
            {
            pushFollow(FOLLOW_rule__Request__Group_3__1__Impl_in_rule__Request__Group_3__14332);
            rule__Request__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Request__Group_3__2_in_rule__Request__Group_3__14335);
            rule__Request__Group_3__2();

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
    // $ANTLR end "rule__Request__Group_3__1"


    // $ANTLR start "rule__Request__Group_3__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2189:1: rule__Request__Group_3__1__Impl : ( ( ( rule__Request__AttributesAssignment_3_1 ) ) ( ( rule__Request__AttributesAssignment_3_1 )* ) ) ;
    public final void rule__Request__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2193:1: ( ( ( ( rule__Request__AttributesAssignment_3_1 ) ) ( ( rule__Request__AttributesAssignment_3_1 )* ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2194:1: ( ( ( rule__Request__AttributesAssignment_3_1 ) ) ( ( rule__Request__AttributesAssignment_3_1 )* ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2194:1: ( ( ( rule__Request__AttributesAssignment_3_1 ) ) ( ( rule__Request__AttributesAssignment_3_1 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2195:1: ( ( rule__Request__AttributesAssignment_3_1 ) ) ( ( rule__Request__AttributesAssignment_3_1 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2195:1: ( ( rule__Request__AttributesAssignment_3_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2196:1: ( rule__Request__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getAttributesAssignment_3_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2197:1: ( rule__Request__AttributesAssignment_3_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2197:2: rule__Request__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Request__AttributesAssignment_3_1_in_rule__Request__Group_3__1__Impl4364);
            rule__Request__AttributesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getAttributesAssignment_3_1()); 
            }

            }

            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2200:1: ( ( rule__Request__AttributesAssignment_3_1 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2201:1: ( rule__Request__AttributesAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getAttributesAssignment_3_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2202:1: ( rule__Request__AttributesAssignment_3_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOC)||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2202:2: rule__Request__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Request__AttributesAssignment_3_1_in_rule__Request__Group_3__1__Impl4376);
            	    rule__Request__AttributesAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getAttributesAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__Request__Group_3__1__Impl"


    // $ANTLR start "rule__Request__Group_3__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2213:1: rule__Request__Group_3__2 : rule__Request__Group_3__2__Impl ;
    public final void rule__Request__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2217:1: ( rule__Request__Group_3__2__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2218:2: rule__Request__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Request__Group_3__2__Impl_in_rule__Request__Group_3__24409);
            rule__Request__Group_3__2__Impl();

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
    // $ANTLR end "rule__Request__Group_3__2"


    // $ANTLR start "rule__Request__Group_3__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2224:1: rule__Request__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Request__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2228:1: ( ( ')' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2229:1: ( ')' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2229:1: ( ')' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2230:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Request__Group_3__2__Impl4437); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__Request__Group_3__2__Impl"


    // $ANTLR start "rule__Notification__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2249:1: rule__Notification__Group__0 : rule__Notification__Group__0__Impl rule__Notification__Group__1 ;
    public final void rule__Notification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2253:1: ( rule__Notification__Group__0__Impl rule__Notification__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2254:2: rule__Notification__Group__0__Impl rule__Notification__Group__1
            {
            pushFollow(FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__04474);
            rule__Notification__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__04477);
            rule__Notification__Group__1();

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
    // $ANTLR end "rule__Notification__Group__0"


    // $ANTLR start "rule__Notification__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2261:1: rule__Notification__Group__0__Impl : ( ( rule__Notification__DocumentationAssignment_0 )* ) ;
    public final void rule__Notification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2265:1: ( ( ( rule__Notification__DocumentationAssignment_0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2266:1: ( ( rule__Notification__DocumentationAssignment_0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2266:1: ( ( rule__Notification__DocumentationAssignment_0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2267:1: ( rule__Notification__DocumentationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getDocumentationAssignment_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2268:1: ( rule__Notification__DocumentationAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2268:2: rule__Notification__DocumentationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Notification__DocumentationAssignment_0_in_rule__Notification__Group__0__Impl4504);
            	    rule__Notification__DocumentationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getDocumentationAssignment_0()); 
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
    // $ANTLR end "rule__Notification__Group__0__Impl"


    // $ANTLR start "rule__Notification__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2278:1: rule__Notification__Group__1 : rule__Notification__Group__1__Impl rule__Notification__Group__2 ;
    public final void rule__Notification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2282:1: ( rule__Notification__Group__1__Impl rule__Notification__Group__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2283:2: rule__Notification__Group__1__Impl rule__Notification__Group__2
            {
            pushFollow(FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__14535);
            rule__Notification__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__14538);
            rule__Notification__Group__2();

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
    // $ANTLR end "rule__Notification__Group__1"


    // $ANTLR start "rule__Notification__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2290:1: rule__Notification__Group__1__Impl : ( 'notification' ) ;
    public final void rule__Notification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2294:1: ( ( 'notification' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2295:1: ( 'notification' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2295:1: ( 'notification' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2296:1: 'notification'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getNotificationKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Notification__Group__1__Impl4566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getNotificationKeyword_1()); 
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
    // $ANTLR end "rule__Notification__Group__1__Impl"


    // $ANTLR start "rule__Notification__Group__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2309:1: rule__Notification__Group__2 : rule__Notification__Group__2__Impl rule__Notification__Group__3 ;
    public final void rule__Notification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2313:1: ( rule__Notification__Group__2__Impl rule__Notification__Group__3 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2314:2: rule__Notification__Group__2__Impl rule__Notification__Group__3
            {
            pushFollow(FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__24597);
            rule__Notification__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__24600);
            rule__Notification__Group__3();

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
    // $ANTLR end "rule__Notification__Group__2"


    // $ANTLR start "rule__Notification__Group__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2321:1: rule__Notification__Group__2__Impl : ( ( rule__Notification__NameAssignment_2 ) ) ;
    public final void rule__Notification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2325:1: ( ( ( rule__Notification__NameAssignment_2 ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2326:1: ( ( rule__Notification__NameAssignment_2 ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2326:1: ( ( rule__Notification__NameAssignment_2 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2327:1: ( rule__Notification__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2328:1: ( rule__Notification__NameAssignment_2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2328:2: rule__Notification__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Notification__NameAssignment_2_in_rule__Notification__Group__2__Impl4627);
            rule__Notification__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Notification__Group__2__Impl"


    // $ANTLR start "rule__Notification__Group__3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2338:1: rule__Notification__Group__3 : rule__Notification__Group__3__Impl ;
    public final void rule__Notification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2342:1: ( rule__Notification__Group__3__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2343:2: rule__Notification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__34657);
            rule__Notification__Group__3__Impl();

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
    // $ANTLR end "rule__Notification__Group__3"


    // $ANTLR start "rule__Notification__Group__3__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2349:1: rule__Notification__Group__3__Impl : ( ( rule__Notification__Group_3__0 )? ) ;
    public final void rule__Notification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2353:1: ( ( ( rule__Notification__Group_3__0 )? ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2354:1: ( ( rule__Notification__Group_3__0 )? )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2354:1: ( ( rule__Notification__Group_3__0 )? )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2355:1: ( rule__Notification__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getGroup_3()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2356:1: ( rule__Notification__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2356:2: rule__Notification__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Notification__Group_3__0_in_rule__Notification__Group__3__Impl4684);
                    rule__Notification__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Notification__Group__3__Impl"


    // $ANTLR start "rule__Notification__Group_3__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2374:1: rule__Notification__Group_3__0 : rule__Notification__Group_3__0__Impl rule__Notification__Group_3__1 ;
    public final void rule__Notification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2378:1: ( rule__Notification__Group_3__0__Impl rule__Notification__Group_3__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2379:2: rule__Notification__Group_3__0__Impl rule__Notification__Group_3__1
            {
            pushFollow(FOLLOW_rule__Notification__Group_3__0__Impl_in_rule__Notification__Group_3__04723);
            rule__Notification__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Notification__Group_3__1_in_rule__Notification__Group_3__04726);
            rule__Notification__Group_3__1();

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
    // $ANTLR end "rule__Notification__Group_3__0"


    // $ANTLR start "rule__Notification__Group_3__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2386:1: rule__Notification__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Notification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2390:1: ( ( '(' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2391:1: ( '(' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2391:1: ( '(' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2392:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Notification__Group_3__0__Impl4754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getLeftParenthesisKeyword_3_0()); 
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
    // $ANTLR end "rule__Notification__Group_3__0__Impl"


    // $ANTLR start "rule__Notification__Group_3__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2405:1: rule__Notification__Group_3__1 : rule__Notification__Group_3__1__Impl rule__Notification__Group_3__2 ;
    public final void rule__Notification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2409:1: ( rule__Notification__Group_3__1__Impl rule__Notification__Group_3__2 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2410:2: rule__Notification__Group_3__1__Impl rule__Notification__Group_3__2
            {
            pushFollow(FOLLOW_rule__Notification__Group_3__1__Impl_in_rule__Notification__Group_3__14785);
            rule__Notification__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Notification__Group_3__2_in_rule__Notification__Group_3__14788);
            rule__Notification__Group_3__2();

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
    // $ANTLR end "rule__Notification__Group_3__1"


    // $ANTLR start "rule__Notification__Group_3__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2417:1: rule__Notification__Group_3__1__Impl : ( ( ( rule__Notification__AttributesAssignment_3_1 ) ) ( ( rule__Notification__AttributesAssignment_3_1 )* ) ) ;
    public final void rule__Notification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2421:1: ( ( ( ( rule__Notification__AttributesAssignment_3_1 ) ) ( ( rule__Notification__AttributesAssignment_3_1 )* ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2422:1: ( ( ( rule__Notification__AttributesAssignment_3_1 ) ) ( ( rule__Notification__AttributesAssignment_3_1 )* ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2422:1: ( ( ( rule__Notification__AttributesAssignment_3_1 ) ) ( ( rule__Notification__AttributesAssignment_3_1 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2423:1: ( ( rule__Notification__AttributesAssignment_3_1 ) ) ( ( rule__Notification__AttributesAssignment_3_1 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2423:1: ( ( rule__Notification__AttributesAssignment_3_1 ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2424:1: ( rule__Notification__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getAttributesAssignment_3_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2425:1: ( rule__Notification__AttributesAssignment_3_1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2425:2: rule__Notification__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Notification__AttributesAssignment_3_1_in_rule__Notification__Group_3__1__Impl4817);
            rule__Notification__AttributesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getAttributesAssignment_3_1()); 
            }

            }

            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2428:1: ( ( rule__Notification__AttributesAssignment_3_1 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2429:1: ( rule__Notification__AttributesAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getAttributesAssignment_3_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2430:1: ( rule__Notification__AttributesAssignment_3_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DOC)||LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2430:2: rule__Notification__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Notification__AttributesAssignment_3_1_in_rule__Notification__Group_3__1__Impl4829);
            	    rule__Notification__AttributesAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getAttributesAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__Notification__Group_3__1__Impl"


    // $ANTLR start "rule__Notification__Group_3__2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2441:1: rule__Notification__Group_3__2 : rule__Notification__Group_3__2__Impl ;
    public final void rule__Notification__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2445:1: ( rule__Notification__Group_3__2__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2446:2: rule__Notification__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group_3__2__Impl_in_rule__Notification__Group_3__24862);
            rule__Notification__Group_3__2__Impl();

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
    // $ANTLR end "rule__Notification__Group_3__2"


    // $ANTLR start "rule__Notification__Group_3__2__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2452:1: rule__Notification__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Notification__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2456:1: ( ( ')' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2457:1: ( ')' )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2457:1: ( ')' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2458:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Notification__Group_3__2__Impl4890); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__Notification__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2477:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2481:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2482:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04927);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04930);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2489:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2493:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2494:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2494:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2495:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4957); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2506:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2510:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2511:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14986);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2517:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2521:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2522:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2522:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2523:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2524:1: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2524:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5013);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2538:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2542:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2543:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05048);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05051);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2550:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2554:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2555:1: ( ( '.' ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2555:1: ( ( '.' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2556:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2557:1: ( '.' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2558:2: '.'
            {
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl5080); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2569:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2573:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2574:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15112);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2580:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2584:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2585:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2585:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2586:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ServiceDefs__PackageNameAssignment_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2602:1: rule__ServiceDefs__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ServiceDefs__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2606:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2607:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2607:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2608:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ServiceDefs__PackageNameAssignment_15177);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ServiceDefs__PackageNameAssignment_1"


    // $ANTLR start "rule__ServiceDefs__DomainElementsAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2617:1: rule__ServiceDefs__DomainElementsAssignment_2 : ( ruleDomainElement ) ;
    public final void rule__ServiceDefs__DomainElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2621:1: ( ( ruleDomainElement ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2622:1: ( ruleDomainElement )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2622:1: ( ruleDomainElement )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2623:1: ruleDomainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDomainElement_in_rule__ServiceDefs__DomainElementsAssignment_25208);
            ruleDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getDomainElementsDomainElementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ServiceDefs__DomainElementsAssignment_2"


    // $ANTLR start "rule__ServiceDefs__ServiceDefsAssignment_3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2632:1: rule__ServiceDefs__ServiceDefsAssignment_3 : ( ruleServiceDef ) ;
    public final void rule__ServiceDefs__ServiceDefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2636:1: ( ( ruleServiceDef ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2637:1: ( ruleServiceDef )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2637:1: ( ruleServiceDef )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2638:1: ruleServiceDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleServiceDef_in_rule__ServiceDefs__ServiceDefsAssignment_35239);
            ruleServiceDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefsAccess().getServiceDefsServiceDefParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ServiceDefs__ServiceDefsAssignment_3"


    // $ANTLR start "rule__DomainElement__DocAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2647:1: rule__DomainElement__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__DomainElement__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2651:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2652:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2652:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2653:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__DomainElement__DocAssignment_05270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getDocDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__DomainElement__DocAssignment_0"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_0_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2662:1: rule__DomainElement__NameAssignment_1_0_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2666:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2667:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2667:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2668:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_0_15301);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_0_1"


    // $ANTLR start "rule__DomainElement__CustAssignment_1_1_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2677:1: rule__DomainElement__CustAssignment_1_1_0 : ( ( 'cust' ) ) ;
    public final void rule__DomainElement__CustAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2681:1: ( ( ( 'cust' ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2682:1: ( ( 'cust' ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2682:1: ( ( 'cust' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2683:1: ( 'cust' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2684:1: ( 'cust' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2685:1: 'cust'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__DomainElement__CustAssignment_1_1_05337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getCustCustKeyword_1_1_0_0()); 
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
    // $ANTLR end "rule__DomainElement__CustAssignment_1_1_0"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_1_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2700:1: rule__DomainElement__NameAssignment_1_1_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2704:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2705:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2705:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2706:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_1_15376);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_1_1"


    // $ANTLR start "rule__DomainElement__SuperTypeAssignment_1_1_2_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2715:1: rule__DomainElement__SuperTypeAssignment_1_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DomainElement__SuperTypeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2719:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2720:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2720:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2721:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2722:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2723:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementQualifiedNameParserRuleCall_1_1_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__SuperTypeAssignment_1_1_2_15411);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementQualifiedNameParserRuleCall_1_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getSuperTypeDomainElementCrossReference_1_1_2_1_0()); 
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
    // $ANTLR end "rule__DomainElement__SuperTypeAssignment_1_1_2_1"


    // $ANTLR start "rule__DomainElement__AttributesAssignment_1_1_4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2734:1: rule__DomainElement__AttributesAssignment_1_1_4 : ( ruleAttribute ) ;
    public final void rule__DomainElement__AttributesAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2738:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2739:1: ( ruleAttribute )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2739:1: ( ruleAttribute )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2740:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__DomainElement__AttributesAssignment_1_1_45446);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getAttributesAttributeParserRuleCall_1_1_4_0()); 
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
    // $ANTLR end "rule__DomainElement__AttributesAssignment_1_1_4"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_2_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2749:1: rule__DomainElement__NameAssignment_1_2_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2753:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2754:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2754:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2755:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_2_15477);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_2_1"


    // $ANTLR start "rule__DomainElement__EnumValuesAssignment_1_2_3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2764:1: rule__DomainElement__EnumValuesAssignment_1_2_3 : ( ruleEnumVal ) ;
    public final void rule__DomainElement__EnumValuesAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2768:1: ( ( ruleEnumVal ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2769:1: ( ruleEnumVal )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2769:1: ( ruleEnumVal )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2770:1: ruleEnumVal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumVal_in_rule__DomainElement__EnumValuesAssignment_1_2_35508);
            ruleEnumVal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getEnumValuesEnumValParserRuleCall_1_2_3_0()); 
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
    // $ANTLR end "rule__DomainElement__EnumValuesAssignment_1_2_3"


    // $ANTLR start "rule__DomainElement__NameAssignment_1_3_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2779:1: rule__DomainElement__NameAssignment_1_3_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__NameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2783:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2784:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2784:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2785:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_3_15539);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getNameQualifiedNameParserRuleCall_1_3_1_0()); 
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
    // $ANTLR end "rule__DomainElement__NameAssignment_1_3_1"


    // $ANTLR start "rule__DomainElement__RealTypeAssignment_1_3_3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2794:1: rule__DomainElement__RealTypeAssignment_1_3_3 : ( ruleQualifiedName ) ;
    public final void rule__DomainElement__RealTypeAssignment_1_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2798:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2799:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2799:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2800:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DomainElement__RealTypeAssignment_1_3_35570);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainElementAccess().getRealTypeQualifiedNameParserRuleCall_1_3_3_0()); 
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
    // $ANTLR end "rule__DomainElement__RealTypeAssignment_1_3_3"


    // $ANTLR start "rule__EnumVal__DocAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2809:1: rule__EnumVal__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumVal__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2813:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2814:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2814:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2815:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__EnumVal__DocAssignment_05601); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getDocDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnumVal__DocAssignment_0"


    // $ANTLR start "rule__EnumVal__NameAssignment_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2824:1: rule__EnumVal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumVal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2828:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2829:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2829:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2830:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumVal__NameAssignment_15632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EnumVal__NameAssignment_1"


    // $ANTLR start "rule__Attribute__DocumentationAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2839:1: rule__Attribute__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Attribute__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2843:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2844:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2844:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2845:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Attribute__DocumentationAssignment_05663); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Attribute__DocumentationAssignment_0"


    // $ANTLR start "rule__Attribute__OptionalAssignment_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2854:1: rule__Attribute__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Attribute__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2858:1: ( ( ( 'optional' ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2859:1: ( ( 'optional' ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2859:1: ( ( 'optional' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2860:1: ( 'optional' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2861:1: ( 'optional' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2862:1: 'optional'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Attribute__OptionalAssignment_15699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_1_0()); 
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
    // $ANTLR end "rule__Attribute__OptionalAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2877:1: rule__Attribute__TypeAssignment_2 : ( ruleGenericTypeArgument ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2881:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2882:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2882:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2883:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__Attribute__TypeAssignment_25738);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeGenericTypeArgumentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2892:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2896:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2897:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2897:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2898:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_35769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Attribute__NameAssignment_3"


    // $ANTLR start "rule__Attribute__ValueAssignment_4_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2907:1: rule__Attribute__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2911:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2912:1: ( RULE_STRING )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2912:1: ( RULE_STRING )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2913:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_4_15800); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Attribute__ValueAssignment_4_1"


    // $ANTLR start "rule__GenericTypeArgument__TypeAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2922:1: rule__GenericTypeArgument__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GenericTypeArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2926:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2927:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2927:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2928:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2929:1: ( ruleQualifiedName )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2930:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GenericTypeArgument__TypeAssignment_05835);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getTypeDomainElementCrossReference_0_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__TypeAssignment_0"


    // $ANTLR start "rule__GenericTypeArgument__ArgumentsAssignment_1_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2941:1: rule__GenericTypeArgument__ArgumentsAssignment_1_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2945:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2946:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2946:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2947:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_15870);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__GenericTypeArgument__ArgumentsAssignment_1_2_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2956:1: rule__GenericTypeArgument__ArgumentsAssignment_1_2_1 : ( ruleGenericTypeArgument ) ;
    public final void rule__GenericTypeArgument__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2960:1: ( ( ruleGenericTypeArgument ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2961:1: ( ruleGenericTypeArgument )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2961:1: ( ruleGenericTypeArgument )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2962:1: ruleGenericTypeArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_2_15901);
            ruleGenericTypeArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getArgumentsGenericTypeArgumentParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__GenericTypeArgument__ListAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2971:1: rule__GenericTypeArgument__ListAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__GenericTypeArgument__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2975:1: ( ( ( '[]' ) ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2976:1: ( ( '[]' ) )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2976:1: ( ( '[]' ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2977:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2978:1: ( '[]' )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2979:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__GenericTypeArgument__ListAssignment_25937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericTypeArgumentAccess().getListLeftSquareBracketRightSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__GenericTypeArgument__ListAssignment_2"


    // $ANTLR start "rule__ServiceDef__DocumentationAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2994:1: rule__ServiceDef__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__ServiceDef__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2998:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2999:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:2999:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3000:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__ServiceDef__DocumentationAssignment_05976); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ServiceDef__DocumentationAssignment_0"


    // $ANTLR start "rule__ServiceDef__NameAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3009:1: rule__ServiceDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3013:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3014:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3014:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3015:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceDef__NameAssignment_26007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ServiceDef__NameAssignment_2"


    // $ANTLR start "rule__ServiceDef__RequestsAssignment_4"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3024:1: rule__ServiceDef__RequestsAssignment_4 : ( ruleRequest ) ;
    public final void rule__ServiceDef__RequestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3028:1: ( ( ruleRequest ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3029:1: ( ruleRequest )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3029:1: ( ruleRequest )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3030:1: ruleRequest
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getRequestsRequestParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleRequest_in_rule__ServiceDef__RequestsAssignment_46038);
            ruleRequest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getRequestsRequestParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ServiceDef__RequestsAssignment_4"


    // $ANTLR start "rule__ServiceDef__NotificationsAssignment_5"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3039:1: rule__ServiceDef__NotificationsAssignment_5 : ( ruleNotification ) ;
    public final void rule__ServiceDef__NotificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3043:1: ( ( ruleNotification ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3044:1: ( ruleNotification )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3044:1: ( ruleNotification )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3045:1: ruleNotification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceDefAccess().getNotificationsNotificationParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleNotification_in_rule__ServiceDef__NotificationsAssignment_56069);
            ruleNotification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceDefAccess().getNotificationsNotificationParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__ServiceDef__NotificationsAssignment_5"


    // $ANTLR start "rule__Request__DocumentationAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3054:1: rule__Request__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Request__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3058:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3059:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3059:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3060:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Request__DocumentationAssignment_06100); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Request__DocumentationAssignment_0"


    // $ANTLR start "rule__Request__NameAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3069:1: rule__Request__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Request__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3073:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3074:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3074:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3075:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Request__NameAssignment_26131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Request__NameAssignment_2"


    // $ANTLR start "rule__Request__AttributesAssignment_3_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3084:1: rule__Request__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Request__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3088:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3089:1: ( ruleAttribute )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3089:1: ( ruleAttribute )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3090:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Request__AttributesAssignment_3_16162);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Request__AttributesAssignment_3_1"


    // $ANTLR start "rule__Request__ReturnValsAssignment_5_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3099:1: rule__Request__ReturnValsAssignment_5_1 : ( ruleAttribute ) ;
    public final void rule__Request__ReturnValsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3103:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3104:1: ( ruleAttribute )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3104:1: ( ruleAttribute )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3105:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequestAccess().getReturnValsAttributeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Request__ReturnValsAssignment_5_16193);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequestAccess().getReturnValsAttributeParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Request__ReturnValsAssignment_5_1"


    // $ANTLR start "rule__Notification__DocumentationAssignment_0"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3114:1: rule__Notification__DocumentationAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Notification__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3118:1: ( ( RULE_DOC ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3119:1: ( RULE_DOC )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3119:1: ( RULE_DOC )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3120:1: RULE_DOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Notification__DocumentationAssignment_06224); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getDocumentationDOCTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Notification__DocumentationAssignment_0"


    // $ANTLR start "rule__Notification__NameAssignment_2"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3129:1: rule__Notification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Notification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3133:1: ( ( RULE_ID ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3134:1: ( RULE_ID )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3134:1: ( RULE_ID )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3135:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_26255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Notification__NameAssignment_2"


    // $ANTLR start "rule__Notification__AttributesAssignment_3_1"
    // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3144:1: rule__Notification__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Notification__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3148:1: ( ( ruleAttribute ) )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3149:1: ( ruleAttribute )
            {
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3149:1: ( ruleAttribute )
            // ../at.bestsolution.dart.service.spec.ui/src-gen/at/bestsolution/dart/service/spec/ui/contentassist/antlr/internal/InternalDartServiceSpec.g:3150:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotificationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Notification__AttributesAssignment_3_16286);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotificationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Notification__AttributesAssignment_3_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\1\1\3\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA2_maxS =
        "\1\41\1\uffff\1\41\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\2\12\uffff\1\1\13\uffff\1\1\1\uffff\1\1\2\uffff\1\3",
            "",
            "\1\3\1\2\26\uffff\1\1\1\uffff\1\1\2\uffff\1\3",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 368:1: ( rule__Request__ReturnValsAssignment_5_1 )*";
        }
    }
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\2\5\2\uffff";
    static final String DFA4_maxS =
        "\2\40\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\10\uffff\1\3\3\uffff\1\3\2\uffff\1\3\5\uffff\1\2\4\uffff\1\3",
            "\1\1\10\uffff\1\3\3\uffff\1\3\2\uffff\1\3\5\uffff\1\2\4\uffff\1\3",
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
            return "()* loopback of 459:1: ( rule__ServiceDefs__DomainElementsAssignment_2 )*";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\2\5\2\uffff";
    static final String DFA18_maxS =
        "\2\36\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\12\uffff\1\2\13\uffff\1\3\1\uffff\1\2",
            "\1\1\26\uffff\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1874:1: ( rule__ServiceDef__RequestsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleServiceDefs_in_entryRuleServiceDefs67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDefs74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__0_in_ruleServiceDefs100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__0_in_ruleDomainElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_entryRuleEnumVal187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumVal194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__0_in_ruleEnumVal220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_entryRuleGenericTypeArgument307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericTypeArgument314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__0_in_ruleGenericTypeArgument340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDef_in_entryRuleServiceDef367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDef374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__0_in_ruleServiceDef400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequest_in_entryRuleRequest427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequest434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__0_in_ruleRequest460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0_in_ruleNotification520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__0_in_rule__DomainElement__Alternatives_1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__0_in_rule__DomainElement__Alternatives_1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__0_in_rule__DomainElement__Alternatives_1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__0_in_rule__DomainElement__Alternatives_1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Request__Alternatives_5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__ReturnValsAssignment_5_1_in_rule__Request__Alternatives_5725 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__Request__ReturnValsAssignment_5_1_in_rule__Request__Alternatives_5737 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__0__Impl_in_rule__ServiceDefs__Group__0771 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__1_in_rule__ServiceDefs__Group__0774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ServiceDefs__Group__0__Impl802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__1__Impl_in_rule__ServiceDefs__Group__1833 = new BitSet(new long[]{0x0000000108244020L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__2_in_rule__ServiceDefs__Group__1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__PackageNameAssignment_1_in_rule__ServiceDefs__Group__1__Impl863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__2__Impl_in_rule__ServiceDefs__Group__2893 = new BitSet(new long[]{0x0000000108244020L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__3_in_rule__ServiceDefs__Group__2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__DomainElementsAssignment_2_in_rule__ServiceDefs__Group__2__Impl923 = new BitSet(new long[]{0x0000000100244022L});
    public static final BitSet FOLLOW_rule__ServiceDefs__Group__3__Impl_in_rule__ServiceDefs__Group__3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDefs__ServiceDefsAssignment_3_in_rule__ServiceDefs__Group__3__Impl983 = new BitSet(new long[]{0x0000000108244022L});
    public static final BitSet FOLLOW_rule__ServiceDefs__ServiceDefsAssignment_3_in_rule__ServiceDefs__Group__3__Impl995 = new BitSet(new long[]{0x0000000108244022L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__0__Impl_in_rule__DomainElement__Group__01036 = new BitSet(new long[]{0x0000000100244020L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__1_in_rule__DomainElement__Group__01039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__DocAssignment_0_in_rule__DomainElement__Group__0__Impl1066 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DomainElement__Group__1__Impl_in_rule__DomainElement__Group__11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Alternatives_1_in_rule__DomainElement__Group__1__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__0__Impl_in_rule__DomainElement__Group_1_0__01158 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__1_in_rule__DomainElement__Group_1_0__01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainElement__Group_1_0__0__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_0__1__Impl_in_rule__DomainElement__Group_1_0__11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_0_1_in_rule__DomainElement__Group_1_0__1__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__0__Impl_in_rule__DomainElement__Group_1_1__01281 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__1_in_rule__DomainElement__Group_1_1__01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__CustAssignment_1_1_0_in_rule__DomainElement__Group_1_1__0__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__1__Impl_in_rule__DomainElement__Group_1_1__11341 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__2_in_rule__DomainElement__Group_1_1__11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_1_1_in_rule__DomainElement__Group_1_1__1__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__2__Impl_in_rule__DomainElement__Group_1_1__21401 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__3_in_rule__DomainElement__Group_1_1__21404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__0_in_rule__DomainElement__Group_1_1__2__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__3__Impl_in_rule__DomainElement__Group_1_1__31462 = new BitSet(new long[]{0x0000000200010030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__4_in_rule__DomainElement__Group_1_1__31465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainElement__Group_1_1__3__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__4__Impl_in_rule__DomainElement__Group_1_1__41524 = new BitSet(new long[]{0x0000000200010030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__5_in_rule__DomainElement__Group_1_1__41527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__AttributesAssignment_1_1_4_in_rule__DomainElement__Group_1_1__4__Impl1554 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1__5__Impl_in_rule__DomainElement__Group_1_1__51585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DomainElement__Group_1_1__5__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__0__Impl_in_rule__DomainElement__Group_1_1_2__01656 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__1_in_rule__DomainElement__Group_1_1_2__01659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainElement__Group_1_1_2__0__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_1_2__1__Impl_in_rule__DomainElement__Group_1_1_2__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__SuperTypeAssignment_1_1_2_1_in_rule__DomainElement__Group_1_1_2__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__0__Impl_in_rule__DomainElement__Group_1_2__01779 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__1_in_rule__DomainElement__Group_1_2__01782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DomainElement__Group_1_2__0__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__1__Impl_in_rule__DomainElement__Group_1_2__11841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__2_in_rule__DomainElement__Group_1_2__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_2_1_in_rule__DomainElement__Group_1_2__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__2__Impl_in_rule__DomainElement__Group_1_2__21901 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__3_in_rule__DomainElement__Group_1_2__21904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DomainElement__Group_1_2__2__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__3__Impl_in_rule__DomainElement__Group_1_2__31963 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__4_in_rule__DomainElement__Group_1_2__31966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__EnumValuesAssignment_1_2_3_in_rule__DomainElement__Group_1_2__3__Impl1993 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_2__4__Impl_in_rule__DomainElement__Group_1_2__42024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DomainElement__Group_1_2__4__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__0__Impl_in_rule__DomainElement__Group_1_3__02093 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__1_in_rule__DomainElement__Group_1_3__02096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DomainElement__Group_1_3__0__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__1__Impl_in_rule__DomainElement__Group_1_3__12155 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__2_in_rule__DomainElement__Group_1_3__12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__NameAssignment_1_3_1_in_rule__DomainElement__Group_1_3__1__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__2__Impl_in_rule__DomainElement__Group_1_3__22215 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__3_in_rule__DomainElement__Group_1_3__22218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DomainElement__Group_1_3__2__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Group_1_3__3__Impl_in_rule__DomainElement__Group_1_3__32277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__RealTypeAssignment_1_3_3_in_rule__DomainElement__Group_1_3__3__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__0__Impl_in_rule__EnumVal__Group__02342 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__1_in_rule__EnumVal__Group__02345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__DocAssignment_0_in_rule__EnumVal__Group__0__Impl2372 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EnumVal__Group__1__Impl_in_rule__EnumVal__Group__12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumVal__NameAssignment_1_in_rule__EnumVal__Group__1__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02464 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DocumentationAssignment_0_in_rule__Attribute__Group__0__Impl2494 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12525 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OptionalAssignment_1_in_rule__Attribute__Group__1__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32646 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__02774 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__02777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__Group_4__0__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_4_1_in_rule__Attribute__Group_4__1__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__0__Impl_in_rule__GenericTypeArgument__Group__02897 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__1_in_rule__GenericTypeArgument__Group__02900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__TypeAssignment_0_in_rule__GenericTypeArgument__Group__0__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__1__Impl_in_rule__GenericTypeArgument__Group__12957 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__2_in_rule__GenericTypeArgument__Group__12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__0_in_rule__GenericTypeArgument__Group__1__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group__2__Impl_in_rule__GenericTypeArgument__Group__23018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ListAssignment_2_in_rule__GenericTypeArgument__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__0__Impl_in_rule__GenericTypeArgument__Group_1__03082 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__1_in_rule__GenericTypeArgument__Group_1__03085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GenericTypeArgument__Group_1__0__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__1__Impl_in_rule__GenericTypeArgument__Group_1__13144 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__2_in_rule__GenericTypeArgument__Group_1__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_1_in_rule__GenericTypeArgument__Group_1__1__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__2__Impl_in_rule__GenericTypeArgument__Group_1__23204 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__3_in_rule__GenericTypeArgument__Group_1__23207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__0_in_rule__GenericTypeArgument__Group_1__2__Impl3234 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1__3__Impl_in_rule__GenericTypeArgument__Group_1__33265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GenericTypeArgument__Group_1__3__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__0__Impl_in_rule__GenericTypeArgument__Group_1_2__03332 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__1_in_rule__GenericTypeArgument__Group_1_2__03335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GenericTypeArgument__Group_1_2__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__Group_1_2__1__Impl_in_rule__GenericTypeArgument__Group_1_2__13394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericTypeArgument__ArgumentsAssignment_1_2_1_in_rule__GenericTypeArgument__Group_1_2__1__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__0__Impl_in_rule__ServiceDef__Group__03455 = new BitSet(new long[]{0x0000000108244020L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__1_in_rule__ServiceDef__Group__03458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__DocumentationAssignment_0_in_rule__ServiceDef__Group__0__Impl3485 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__1__Impl_in_rule__ServiceDef__Group__13516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__2_in_rule__ServiceDef__Group__13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ServiceDef__Group__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__2__Impl_in_rule__ServiceDef__Group__23578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__3_in_rule__ServiceDef__Group__23581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__NameAssignment_2_in_rule__ServiceDef__Group__2__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__3__Impl_in_rule__ServiceDef__Group__33638 = new BitSet(new long[]{0x0000000050010020L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__4_in_rule__ServiceDef__Group__33641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ServiceDef__Group__3__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__4__Impl_in_rule__ServiceDef__Group__43700 = new BitSet(new long[]{0x0000000050010020L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__5_in_rule__ServiceDef__Group__43703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__RequestsAssignment_4_in_rule__ServiceDef__Group__4__Impl3730 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__5__Impl_in_rule__ServiceDef__Group__53761 = new BitSet(new long[]{0x0000000050010020L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__6_in_rule__ServiceDef__Group__53764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDef__NotificationsAssignment_5_in_rule__ServiceDef__Group__5__Impl3791 = new BitSet(new long[]{0x0000000040000022L});
    public static final BitSet FOLLOW_rule__ServiceDef__Group__6__Impl_in_rule__ServiceDef__Group__63822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ServiceDef__Group__6__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__0__Impl_in_rule__Request__Group__03895 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Request__Group__1_in_rule__Request__Group__03898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__DocumentationAssignment_0_in_rule__Request__Group__0__Impl3925 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Request__Group__1__Impl_in_rule__Request__Group__13956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Request__Group__2_in_rule__Request__Group__13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Request__Group__1__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__2__Impl_in_rule__Request__Group__24018 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__Request__Group__3_in_rule__Request__Group__24021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__NameAssignment_2_in_rule__Request__Group__2__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__3__Impl_in_rule__Request__Group__34078 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__Request__Group__4_in_rule__Request__Group__34081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group_3__0_in_rule__Request__Group__3__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__4__Impl_in_rule__Request__Group__44139 = new BitSet(new long[]{0x0000000200001030L});
    public static final BitSet FOLLOW_rule__Request__Group__5_in_rule__Request__Group__44142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Request__Group__4__Impl4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group__5__Impl_in_rule__Request__Group__54201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Alternatives_5_in_rule__Request__Group__5__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group_3__0__Impl_in_rule__Request__Group_3__04270 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__Request__Group_3__1_in_rule__Request__Group_3__04273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Request__Group_3__0__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__Group_3__1__Impl_in_rule__Request__Group_3__14332 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Request__Group_3__2_in_rule__Request__Group_3__14335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Request__AttributesAssignment_3_1_in_rule__Request__Group_3__1__Impl4364 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__Request__AttributesAssignment_3_1_in_rule__Request__Group_3__1__Impl4376 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__Request__Group_3__2__Impl_in_rule__Request__Group_3__24409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Request__Group_3__2__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__04474 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__04477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__DocumentationAssignment_0_in_rule__Notification__Group__0__Impl4504 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__14535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__14538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Notification__Group__1__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__24597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__24600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__NameAssignment_2_in_rule__Notification__Group__2__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__34657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__0_in_rule__Notification__Group__3__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__0__Impl_in_rule__Notification__Group_3__04723 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__1_in_rule__Notification__Group_3__04726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Notification__Group_3__0__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__1__Impl_in_rule__Notification__Group_3__14785 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__2_in_rule__Notification__Group_3__14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__AttributesAssignment_3_1_in_rule__Notification__Group_3__1__Impl4817 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__Notification__AttributesAssignment_3_1_in_rule__Notification__Group_3__1__Impl4829 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__Notification__Group_3__2__Impl_in_rule__Notification__Group_3__24862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Notification__Group_3__2__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04927 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5013 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ServiceDefs__PackageNameAssignment_15177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__ServiceDefs__DomainElementsAssignment_25208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDef_in_rule__ServiceDefs__ServiceDefsAssignment_35239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__DomainElement__DocAssignment_05270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_0_15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DomainElement__CustAssignment_1_1_05337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_1_15376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__SuperTypeAssignment_1_1_2_15411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__DomainElement__AttributesAssignment_1_1_45446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_2_15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVal_in_rule__DomainElement__EnumValuesAssignment_1_2_35508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__NameAssignment_1_3_15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DomainElement__RealTypeAssignment_1_3_35570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__EnumVal__DocAssignment_05601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumVal__NameAssignment_15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Attribute__DocumentationAssignment_05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__OptionalAssignment_15699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__Attribute__TypeAssignment_25738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_35769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_4_15800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GenericTypeArgument__TypeAssignment_05835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_15870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericTypeArgument_in_rule__GenericTypeArgument__ArgumentsAssignment_1_2_15901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__GenericTypeArgument__ListAssignment_25937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__ServiceDef__DocumentationAssignment_05976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceDef__NameAssignment_26007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequest_in_rule__ServiceDef__RequestsAssignment_46038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_rule__ServiceDef__NotificationsAssignment_56069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Request__DocumentationAssignment_06100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Request__NameAssignment_26131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Request__AttributesAssignment_3_16162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Request__ReturnValsAssignment_5_16193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Notification__DocumentationAssignment_06224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_26255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Notification__AttributesAssignment_3_16286 = new BitSet(new long[]{0x0000000000000002L});

}