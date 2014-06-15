package de.schakko.xtext.ui.contentassist.antlr.internal; 

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
import de.schakko.xtext.services.AutomotiveBusDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutomotiveBusDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'as broadcast'", "'int'", "'char'", "'char[]'", "'Busses'", "'Messages'", "'{'", "'}'", "'Components'", "'Vehicles'", "','", "'has components'", "'sends messages'", "'has fields'", "'of type'", "'over'", "'('", "')'", "'to'", "'is required'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_CHAR=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalAutomotiveBusDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAutomotiveBusDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAutomotiveBusDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g"; }


     
     	private AutomotiveBusDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AutomotiveBusDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:61:1: ( ruleModel EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:76:1: ( rule__Model__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVehicleType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:88:1: entryRuleVehicleType : ruleVehicleType EOF ;
    public final void entryRuleVehicleType() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:89:1: ( ruleVehicleType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:90:1: ruleVehicleType EOF
            {
             before(grammarAccess.getVehicleTypeRule()); 
            pushFollow(FOLLOW_ruleVehicleType_in_entryRuleVehicleType121);
            ruleVehicleType();

            state._fsp--;

             after(grammarAccess.getVehicleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVehicleType128); 

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
    // $ANTLR end "entryRuleVehicleType"


    // $ANTLR start "ruleVehicleType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:97:1: ruleVehicleType : ( ( rule__VehicleType__Group__0 ) ) ;
    public final void ruleVehicleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:101:2: ( ( ( rule__VehicleType__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:102:1: ( ( rule__VehicleType__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:102:1: ( ( rule__VehicleType__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:103:1: ( rule__VehicleType__Group__0 )
            {
             before(grammarAccess.getVehicleTypeAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:104:1: ( rule__VehicleType__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:104:2: rule__VehicleType__Group__0
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__0_in_ruleVehicleType154);
            rule__VehicleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVehicleTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleVehicleType"


    // $ANTLR start "entryRuleBussystem"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:116:1: entryRuleBussystem : ruleBussystem EOF ;
    public final void entryRuleBussystem() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:117:1: ( ruleBussystem EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:118:1: ruleBussystem EOF
            {
             before(grammarAccess.getBussystemRule()); 
            pushFollow(FOLLOW_ruleBussystem_in_entryRuleBussystem181);
            ruleBussystem();

            state._fsp--;

             after(grammarAccess.getBussystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBussystem188); 

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
    // $ANTLR end "entryRuleBussystem"


    // $ANTLR start "ruleBussystem"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:125:1: ruleBussystem : ( ( rule__Bussystem__NameAssignment ) ) ;
    public final void ruleBussystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:129:2: ( ( ( rule__Bussystem__NameAssignment ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:130:1: ( ( rule__Bussystem__NameAssignment ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:130:1: ( ( rule__Bussystem__NameAssignment ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:131:1: ( rule__Bussystem__NameAssignment )
            {
             before(grammarAccess.getBussystemAccess().getNameAssignment()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:132:1: ( rule__Bussystem__NameAssignment )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:132:2: rule__Bussystem__NameAssignment
            {
            pushFollow(FOLLOW_rule__Bussystem__NameAssignment_in_ruleBussystem214);
            rule__Bussystem__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBussystemAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleBussystem"


    // $ANTLR start "entryRuleComponent"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:144:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:145:1: ( ruleComponent EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:146:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent241);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent248); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:153:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:157:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:158:1: ( ( rule__Component__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:158:1: ( ( rule__Component__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:159:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:160:1: ( rule__Component__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:160:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent274);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleMessageType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:172:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:173:1: ( ruleMessageType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:174:1: ruleMessageType EOF
            {
             before(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_ruleMessageType_in_entryRuleMessageType301);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageType308); 

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
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:181:1: ruleMessageType : ( ( rule__MessageType__Group__0 ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:185:2: ( ( ( rule__MessageType__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:186:1: ( ( rule__MessageType__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:186:1: ( ( rule__MessageType__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:187:1: ( rule__MessageType__Group__0 )
            {
             before(grammarAccess.getMessageTypeAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:188:1: ( rule__MessageType__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:188:2: rule__MessageType__Group__0
            {
            pushFollow(FOLLOW_rule__MessageType__Group__0_in_ruleMessageType334);
            rule__MessageType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleMessageInstance"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:200:1: entryRuleMessageInstance : ruleMessageInstance EOF ;
    public final void entryRuleMessageInstance() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:201:1: ( ruleMessageInstance EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:202:1: ruleMessageInstance EOF
            {
             before(grammarAccess.getMessageInstanceRule()); 
            pushFollow(FOLLOW_ruleMessageInstance_in_entryRuleMessageInstance361);
            ruleMessageInstance();

            state._fsp--;

             after(grammarAccess.getMessageInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageInstance368); 

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
    // $ANTLR end "entryRuleMessageInstance"


    // $ANTLR start "ruleMessageInstance"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:209:1: ruleMessageInstance : ( ( rule__MessageInstance__Group__0 ) ) ;
    public final void ruleMessageInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:213:2: ( ( ( rule__MessageInstance__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:214:1: ( ( rule__MessageInstance__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:214:1: ( ( rule__MessageInstance__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:215:1: ( rule__MessageInstance__Group__0 )
            {
             before(grammarAccess.getMessageInstanceAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:216:1: ( rule__MessageInstance__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:216:2: rule__MessageInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__0_in_ruleMessageInstance394);
            rule__MessageInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleMessageInstance"


    // $ANTLR start "entryRuleMessageFieldType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:228:1: entryRuleMessageFieldType : ruleMessageFieldType EOF ;
    public final void entryRuleMessageFieldType() throws RecognitionException {
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:229:1: ( ruleMessageFieldType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:230:1: ruleMessageFieldType EOF
            {
             before(grammarAccess.getMessageFieldTypeRule()); 
            pushFollow(FOLLOW_ruleMessageFieldType_in_entryRuleMessageFieldType421);
            ruleMessageFieldType();

            state._fsp--;

             after(grammarAccess.getMessageFieldTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageFieldType428); 

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
    // $ANTLR end "entryRuleMessageFieldType"


    // $ANTLR start "ruleMessageFieldType"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:237:1: ruleMessageFieldType : ( ( rule__MessageFieldType__Group__0 ) ) ;
    public final void ruleMessageFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:241:2: ( ( ( rule__MessageFieldType__Group__0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:242:1: ( ( rule__MessageFieldType__Group__0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:242:1: ( ( rule__MessageFieldType__Group__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:243:1: ( rule__MessageFieldType__Group__0 )
            {
             before(grammarAccess.getMessageFieldTypeAccess().getGroup()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:244:1: ( rule__MessageFieldType__Group__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:244:2: rule__MessageFieldType__Group__0
            {
            pushFollow(FOLLOW_rule__MessageFieldType__Group__0_in_ruleMessageFieldType454);
            rule__MessageFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMessageFieldType"


    // $ANTLR start "rule__MessageInstance__Alternatives_5"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:256:1: rule__MessageInstance__Alternatives_5 : ( ( 'as broadcast' ) | ( ( rule__MessageInstance__Group_5_1__0 ) ) );
    public final void rule__MessageInstance__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:260:1: ( ( 'as broadcast' ) | ( ( rule__MessageInstance__Group_5_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:261:1: ( 'as broadcast' )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:261:1: ( 'as broadcast' )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:262:1: 'as broadcast'
                    {
                     before(grammarAccess.getMessageInstanceAccess().getAsBroadcastKeyword_5_0()); 
                    match(input,12,FOLLOW_12_in_rule__MessageInstance__Alternatives_5491); 
                     after(grammarAccess.getMessageInstanceAccess().getAsBroadcastKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:269:6: ( ( rule__MessageInstance__Group_5_1__0 ) )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:269:6: ( ( rule__MessageInstance__Group_5_1__0 ) )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:270:1: ( rule__MessageInstance__Group_5_1__0 )
                    {
                     before(grammarAccess.getMessageInstanceAccess().getGroup_5_1()); 
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:271:1: ( rule__MessageInstance__Group_5_1__0 )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:271:2: rule__MessageInstance__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageInstance__Group_5_1__0_in_rule__MessageInstance__Alternatives_5510);
                    rule__MessageInstance__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageInstanceAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__MessageInstance__Alternatives_5"


    // $ANTLR start "rule__MessageFieldType__Alternatives_0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:280:1: rule__MessageFieldType__Alternatives_0 : ( ( 'int' ) | ( 'char' ) | ( 'char[]' ) );
    public final void rule__MessageFieldType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:284:1: ( ( 'int' ) | ( 'char' ) | ( 'char[]' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:285:1: ( 'int' )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:285:1: ( 'int' )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:286:1: 'int'
                    {
                     before(grammarAccess.getMessageFieldTypeAccess().getIntKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__MessageFieldType__Alternatives_0544); 
                     after(grammarAccess.getMessageFieldTypeAccess().getIntKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:293:6: ( 'char' )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:293:6: ( 'char' )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:294:1: 'char'
                    {
                     before(grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__MessageFieldType__Alternatives_0564); 
                     after(grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:301:6: ( 'char[]' )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:301:6: ( 'char[]' )
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:302:1: 'char[]'
                    {
                     before(grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__MessageFieldType__Alternatives_0584); 
                     after(grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_2()); 

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
    // $ANTLR end "rule__MessageFieldType__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:316:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:320:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:321:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0616);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0619);
            rule__Model__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:328:1: rule__Model__Group__0__Impl : ( 'Busses' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:332:1: ( ( 'Busses' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:333:1: ( 'Busses' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:333:1: ( 'Busses' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:334:1: 'Busses'
            {
             before(grammarAccess.getModelAccess().getBussesKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl647); 
             after(grammarAccess.getModelAccess().getBussesKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:347:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:351:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:352:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1678);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1681);
            rule__Model__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:359:1: rule__Model__Group__1__Impl : ( ( rule__Model__BussesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:363:1: ( ( ( rule__Model__BussesAssignment_1 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:364:1: ( ( rule__Model__BussesAssignment_1 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:364:1: ( ( rule__Model__BussesAssignment_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:365:1: ( rule__Model__BussesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getBussesAssignment_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:366:1: ( rule__Model__BussesAssignment_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:366:2: rule__Model__BussesAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__BussesAssignment_1_in_rule__Model__Group__1__Impl708);
            rule__Model__BussesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBussesAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:376:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:380:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:381:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2738);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2741);
            rule__Model__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:388:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__Group_2__0 ) ) ( ( rule__Model__Group_2__0 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:392:1: ( ( ( ( rule__Model__Group_2__0 ) ) ( ( rule__Model__Group_2__0 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:393:1: ( ( ( rule__Model__Group_2__0 ) ) ( ( rule__Model__Group_2__0 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:393:1: ( ( ( rule__Model__Group_2__0 ) ) ( ( rule__Model__Group_2__0 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:394:1: ( ( rule__Model__Group_2__0 ) ) ( ( rule__Model__Group_2__0 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:394:1: ( ( rule__Model__Group_2__0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:395:1: ( rule__Model__Group_2__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:396:1: ( rule__Model__Group_2__0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:396:2: rule__Model__Group_2__0
            {
            pushFollow(FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl770);
            rule__Model__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:399:1: ( ( rule__Model__Group_2__0 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:400:1: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:401:1: ( rule__Model__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:401:2: rule__Model__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl782);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:412:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:416:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:417:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3815);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3818);
            rule__Model__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:424:1: rule__Model__Group__3__Impl : ( 'Messages' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:428:1: ( ( 'Messages' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:429:1: ( 'Messages' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:429:1: ( 'Messages' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:430:1: 'Messages'
            {
             before(grammarAccess.getModelAccess().getMessagesKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group__3__Impl846); 
             after(grammarAccess.getModelAccess().getMessagesKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:443:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:447:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:448:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4877);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4880);
            rule__Model__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:455:1: rule__Model__Group__4__Impl : ( '{' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:459:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:460:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:460:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:461:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__4__Impl908); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:474:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:478:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:479:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5939);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5942);
            rule__Model__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:486:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__MessagesAssignment_5 ) ) ( ( rule__Model__MessagesAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:490:1: ( ( ( ( rule__Model__MessagesAssignment_5 ) ) ( ( rule__Model__MessagesAssignment_5 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:491:1: ( ( ( rule__Model__MessagesAssignment_5 ) ) ( ( rule__Model__MessagesAssignment_5 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:491:1: ( ( ( rule__Model__MessagesAssignment_5 ) ) ( ( rule__Model__MessagesAssignment_5 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:492:1: ( ( rule__Model__MessagesAssignment_5 ) ) ( ( rule__Model__MessagesAssignment_5 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:492:1: ( ( rule__Model__MessagesAssignment_5 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:493:1: ( rule__Model__MessagesAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getMessagesAssignment_5()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:494:1: ( rule__Model__MessagesAssignment_5 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:494:2: rule__Model__MessagesAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__MessagesAssignment_5_in_rule__Model__Group__5__Impl971);
            rule__Model__MessagesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMessagesAssignment_5()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:497:1: ( ( rule__Model__MessagesAssignment_5 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:498:1: ( rule__Model__MessagesAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getMessagesAssignment_5()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:499:1: ( rule__Model__MessagesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:499:2: rule__Model__MessagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__MessagesAssignment_5_in_rule__Model__Group__5__Impl983);
            	    rule__Model__MessagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMessagesAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:510:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:514:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:515:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61016);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61019);
            rule__Model__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:522:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:526:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:527:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:527:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:528:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__6__Impl1047); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:541:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:545:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:546:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71078);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71081);
            rule__Model__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:553:1: rule__Model__Group__7__Impl : ( 'Components' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:557:1: ( ( 'Components' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:558:1: ( 'Components' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:558:1: ( 'Components' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:559:1: 'Components'
            {
             before(grammarAccess.getModelAccess().getComponentsKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__7__Impl1109); 
             after(grammarAccess.getModelAccess().getComponentsKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:572:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:576:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:577:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81140);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81143);
            rule__Model__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:584:1: rule__Model__Group__8__Impl : ( '{' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:588:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:589:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:589:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:590:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__8__Impl1171); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:603:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:607:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:608:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91202);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91205);
            rule__Model__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:615:1: rule__Model__Group__9__Impl : ( ( ( rule__Model__ComponentsAssignment_9 ) ) ( ( rule__Model__ComponentsAssignment_9 )* ) ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:619:1: ( ( ( ( rule__Model__ComponentsAssignment_9 ) ) ( ( rule__Model__ComponentsAssignment_9 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:620:1: ( ( ( rule__Model__ComponentsAssignment_9 ) ) ( ( rule__Model__ComponentsAssignment_9 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:620:1: ( ( ( rule__Model__ComponentsAssignment_9 ) ) ( ( rule__Model__ComponentsAssignment_9 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:621:1: ( ( rule__Model__ComponentsAssignment_9 ) ) ( ( rule__Model__ComponentsAssignment_9 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:621:1: ( ( rule__Model__ComponentsAssignment_9 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:622:1: ( rule__Model__ComponentsAssignment_9 )
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_9()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:623:1: ( rule__Model__ComponentsAssignment_9 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:623:2: rule__Model__ComponentsAssignment_9
            {
            pushFollow(FOLLOW_rule__Model__ComponentsAssignment_9_in_rule__Model__Group__9__Impl1234);
            rule__Model__ComponentsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getComponentsAssignment_9()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:626:1: ( ( rule__Model__ComponentsAssignment_9 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:627:1: ( rule__Model__ComponentsAssignment_9 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_9()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:628:1: ( rule__Model__ComponentsAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:628:2: rule__Model__ComponentsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Model__ComponentsAssignment_9_in_rule__Model__Group__9__Impl1246);
            	    rule__Model__ComponentsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentsAssignment_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:639:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:643:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:644:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101279);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__11_in_rule__Model__Group__101282);
            rule__Model__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:651:1: rule__Model__Group__10__Impl : ( '}' ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:655:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:656:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:656:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:657:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__10__Impl1310); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:670:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:674:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:675:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_rule__Model__Group__11__Impl_in_rule__Model__Group__111341);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__12_in_rule__Model__Group__111344);
            rule__Model__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:682:1: rule__Model__Group__11__Impl : ( 'Vehicles' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:686:1: ( ( 'Vehicles' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:687:1: ( 'Vehicles' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:687:1: ( 'Vehicles' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:688:1: 'Vehicles'
            {
             before(grammarAccess.getModelAccess().getVehiclesKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__11__Impl1372); 
             after(grammarAccess.getModelAccess().getVehiclesKeyword_11()); 

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
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:701:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:705:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:706:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_rule__Model__Group__12__Impl_in_rule__Model__Group__121403);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__13_in_rule__Model__Group__121406);
            rule__Model__Group__13();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:713:1: rule__Model__Group__12__Impl : ( '{' ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:717:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:718:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:718:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:719:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__12__Impl1434); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:732:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:736:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:737:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_rule__Model__Group__13__Impl_in_rule__Model__Group__131465);
            rule__Model__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__14_in_rule__Model__Group__131468);
            rule__Model__Group__14();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:744:1: rule__Model__Group__13__Impl : ( ( ( rule__Model__VehiclesAssignment_13 ) ) ( ( rule__Model__VehiclesAssignment_13 )* ) ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:748:1: ( ( ( ( rule__Model__VehiclesAssignment_13 ) ) ( ( rule__Model__VehiclesAssignment_13 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:749:1: ( ( ( rule__Model__VehiclesAssignment_13 ) ) ( ( rule__Model__VehiclesAssignment_13 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:749:1: ( ( ( rule__Model__VehiclesAssignment_13 ) ) ( ( rule__Model__VehiclesAssignment_13 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:750:1: ( ( rule__Model__VehiclesAssignment_13 ) ) ( ( rule__Model__VehiclesAssignment_13 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:750:1: ( ( rule__Model__VehiclesAssignment_13 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:751:1: ( rule__Model__VehiclesAssignment_13 )
            {
             before(grammarAccess.getModelAccess().getVehiclesAssignment_13()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:752:1: ( rule__Model__VehiclesAssignment_13 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:752:2: rule__Model__VehiclesAssignment_13
            {
            pushFollow(FOLLOW_rule__Model__VehiclesAssignment_13_in_rule__Model__Group__13__Impl1497);
            rule__Model__VehiclesAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVehiclesAssignment_13()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:755:1: ( ( rule__Model__VehiclesAssignment_13 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:756:1: ( rule__Model__VehiclesAssignment_13 )*
            {
             before(grammarAccess.getModelAccess().getVehiclesAssignment_13()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:757:1: ( rule__Model__VehiclesAssignment_13 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:757:2: rule__Model__VehiclesAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__Model__VehiclesAssignment_13_in_rule__Model__Group__13__Impl1509);
            	    rule__Model__VehiclesAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVehiclesAssignment_13()); 

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
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Model__Group__14"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:768:1: rule__Model__Group__14 : rule__Model__Group__14__Impl ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:772:1: ( rule__Model__Group__14__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:773:2: rule__Model__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__14__Impl_in_rule__Model__Group__141542);
            rule__Model__Group__14__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__14"


    // $ANTLR start "rule__Model__Group__14__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:779:1: rule__Model__Group__14__Impl : ( '}' ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:783:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:784:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:784:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:785:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__14__Impl1570); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Model__Group__14__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:828:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:832:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:833:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01631);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01634);
            rule__Model__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:840:1: rule__Model__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:844:1: ( ( ',' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:845:1: ( ',' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:845:1: ( ',' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:846:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group_2__0__Impl1662); 
             after(grammarAccess.getModelAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:859:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:863:1: ( rule__Model__Group_2__1__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:864:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11693);
            rule__Model__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:870:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__BussesAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:874:1: ( ( ( rule__Model__BussesAssignment_2_1 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:875:1: ( ( rule__Model__BussesAssignment_2_1 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:875:1: ( ( rule__Model__BussesAssignment_2_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:876:1: ( rule__Model__BussesAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getBussesAssignment_2_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:877:1: ( rule__Model__BussesAssignment_2_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:877:2: rule__Model__BussesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Model__BussesAssignment_2_1_in_rule__Model__Group_2__1__Impl1720);
            rule__Model__BussesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBussesAssignment_2_1()); 

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
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__VehicleType__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:891:1: rule__VehicleType__Group__0 : rule__VehicleType__Group__0__Impl rule__VehicleType__Group__1 ;
    public final void rule__VehicleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:895:1: ( rule__VehicleType__Group__0__Impl rule__VehicleType__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:896:2: rule__VehicleType__Group__0__Impl rule__VehicleType__Group__1
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__0__Impl_in_rule__VehicleType__Group__01754);
            rule__VehicleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VehicleType__Group__1_in_rule__VehicleType__Group__01757);
            rule__VehicleType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__VehicleType__Group__0"


    // $ANTLR start "rule__VehicleType__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:903:1: rule__VehicleType__Group__0__Impl : ( ( rule__VehicleType__NameAssignment_0 ) ) ;
    public final void rule__VehicleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:907:1: ( ( ( rule__VehicleType__NameAssignment_0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:908:1: ( ( rule__VehicleType__NameAssignment_0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:908:1: ( ( rule__VehicleType__NameAssignment_0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:909:1: ( rule__VehicleType__NameAssignment_0 )
            {
             before(grammarAccess.getVehicleTypeAccess().getNameAssignment_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:910:1: ( rule__VehicleType__NameAssignment_0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:910:2: rule__VehicleType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VehicleType__NameAssignment_0_in_rule__VehicleType__Group__0__Impl1784);
            rule__VehicleType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVehicleTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__VehicleType__Group__0__Impl"


    // $ANTLR start "rule__VehicleType__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:920:1: rule__VehicleType__Group__1 : rule__VehicleType__Group__1__Impl rule__VehicleType__Group__2 ;
    public final void rule__VehicleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:924:1: ( rule__VehicleType__Group__1__Impl rule__VehicleType__Group__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:925:2: rule__VehicleType__Group__1__Impl rule__VehicleType__Group__2
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__1__Impl_in_rule__VehicleType__Group__11814);
            rule__VehicleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VehicleType__Group__2_in_rule__VehicleType__Group__11817);
            rule__VehicleType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__VehicleType__Group__1"


    // $ANTLR start "rule__VehicleType__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:932:1: rule__VehicleType__Group__1__Impl : ( 'has components' ) ;
    public final void rule__VehicleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:936:1: ( ( 'has components' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:937:1: ( 'has components' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:937:1: ( 'has components' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:938:1: 'has components'
            {
             before(grammarAccess.getVehicleTypeAccess().getHasComponentsKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__VehicleType__Group__1__Impl1845); 
             after(grammarAccess.getVehicleTypeAccess().getHasComponentsKeyword_1()); 

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
    // $ANTLR end "rule__VehicleType__Group__1__Impl"


    // $ANTLR start "rule__VehicleType__Group__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:951:1: rule__VehicleType__Group__2 : rule__VehicleType__Group__2__Impl rule__VehicleType__Group__3 ;
    public final void rule__VehicleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:955:1: ( rule__VehicleType__Group__2__Impl rule__VehicleType__Group__3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:956:2: rule__VehicleType__Group__2__Impl rule__VehicleType__Group__3
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__2__Impl_in_rule__VehicleType__Group__21876);
            rule__VehicleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VehicleType__Group__3_in_rule__VehicleType__Group__21879);
            rule__VehicleType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__VehicleType__Group__2"


    // $ANTLR start "rule__VehicleType__Group__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:963:1: rule__VehicleType__Group__2__Impl : ( '{' ) ;
    public final void rule__VehicleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:967:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:968:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:968:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:969:1: '{'
            {
             before(grammarAccess.getVehicleTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__VehicleType__Group__2__Impl1907); 
             after(grammarAccess.getVehicleTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__VehicleType__Group__2__Impl"


    // $ANTLR start "rule__VehicleType__Group__3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:982:1: rule__VehicleType__Group__3 : rule__VehicleType__Group__3__Impl rule__VehicleType__Group__4 ;
    public final void rule__VehicleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:986:1: ( rule__VehicleType__Group__3__Impl rule__VehicleType__Group__4 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:987:2: rule__VehicleType__Group__3__Impl rule__VehicleType__Group__4
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__3__Impl_in_rule__VehicleType__Group__31938);
            rule__VehicleType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VehicleType__Group__4_in_rule__VehicleType__Group__31941);
            rule__VehicleType__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__VehicleType__Group__3"


    // $ANTLR start "rule__VehicleType__Group__3__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:994:1: rule__VehicleType__Group__3__Impl : ( ( ( rule__VehicleType__ComponentsAssignment_3 ) ) ( ( rule__VehicleType__ComponentsAssignment_3 )* ) ) ;
    public final void rule__VehicleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:998:1: ( ( ( ( rule__VehicleType__ComponentsAssignment_3 ) ) ( ( rule__VehicleType__ComponentsAssignment_3 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:999:1: ( ( ( rule__VehicleType__ComponentsAssignment_3 ) ) ( ( rule__VehicleType__ComponentsAssignment_3 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:999:1: ( ( ( rule__VehicleType__ComponentsAssignment_3 ) ) ( ( rule__VehicleType__ComponentsAssignment_3 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1000:1: ( ( rule__VehicleType__ComponentsAssignment_3 ) ) ( ( rule__VehicleType__ComponentsAssignment_3 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1000:1: ( ( rule__VehicleType__ComponentsAssignment_3 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1001:1: ( rule__VehicleType__ComponentsAssignment_3 )
            {
             before(grammarAccess.getVehicleTypeAccess().getComponentsAssignment_3()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1002:1: ( rule__VehicleType__ComponentsAssignment_3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1002:2: rule__VehicleType__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_rule__VehicleType__ComponentsAssignment_3_in_rule__VehicleType__Group__3__Impl1970);
            rule__VehicleType__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVehicleTypeAccess().getComponentsAssignment_3()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1005:1: ( ( rule__VehicleType__ComponentsAssignment_3 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1006:1: ( rule__VehicleType__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getVehicleTypeAccess().getComponentsAssignment_3()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1007:1: ( rule__VehicleType__ComponentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1007:2: rule__VehicleType__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__VehicleType__ComponentsAssignment_3_in_rule__VehicleType__Group__3__Impl1982);
            	    rule__VehicleType__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getVehicleTypeAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__VehicleType__Group__3__Impl"


    // $ANTLR start "rule__VehicleType__Group__4"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1018:1: rule__VehicleType__Group__4 : rule__VehicleType__Group__4__Impl ;
    public final void rule__VehicleType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1022:1: ( rule__VehicleType__Group__4__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1023:2: rule__VehicleType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VehicleType__Group__4__Impl_in_rule__VehicleType__Group__42015);
            rule__VehicleType__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__VehicleType__Group__4"


    // $ANTLR start "rule__VehicleType__Group__4__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1029:1: rule__VehicleType__Group__4__Impl : ( '}' ) ;
    public final void rule__VehicleType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1033:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1034:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1034:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1035:1: '}'
            {
             before(grammarAccess.getVehicleTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__VehicleType__Group__4__Impl2043); 
             after(grammarAccess.getVehicleTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__VehicleType__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1058:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1062:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1063:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02084);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02087);
            rule__Component__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1070:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1074:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1075:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1075:1: ( ( rule__Component__NameAssignment_0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1076:1: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1077:1: ( rule__Component__NameAssignment_0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1077:2: rule__Component__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_0_in_rule__Component__Group__0__Impl2114);
            rule__Component__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1087:1: rule__Component__Group__1 : rule__Component__Group__1__Impl ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1091:1: ( rule__Component__Group__1__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1092:2: rule__Component__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12144);
            rule__Component__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1098:1: rule__Component__Group__1__Impl : ( ( rule__Component__Group_1__0 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1102:1: ( ( ( rule__Component__Group_1__0 )? ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1103:1: ( ( rule__Component__Group_1__0 )? )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1103:1: ( ( rule__Component__Group_1__0 )? )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1104:1: ( rule__Component__Group_1__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1105:1: ( rule__Component__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1105:2: rule__Component__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_1__0_in_rule__Component__Group__1__Impl2171);
                    rule__Component__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group_1__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1119:1: rule__Component__Group_1__0 : rule__Component__Group_1__0__Impl rule__Component__Group_1__1 ;
    public final void rule__Component__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1123:1: ( rule__Component__Group_1__0__Impl rule__Component__Group_1__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1124:2: rule__Component__Group_1__0__Impl rule__Component__Group_1__1
            {
            pushFollow(FOLLOW_rule__Component__Group_1__0__Impl_in_rule__Component__Group_1__02206);
            rule__Component__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_1__1_in_rule__Component__Group_1__02209);
            rule__Component__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_1__0"


    // $ANTLR start "rule__Component__Group_1__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1131:1: rule__Component__Group_1__0__Impl : ( 'sends messages' ) ;
    public final void rule__Component__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1135:1: ( ( 'sends messages' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1136:1: ( 'sends messages' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1136:1: ( 'sends messages' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1137:1: 'sends messages'
            {
             before(grammarAccess.getComponentAccess().getSendsMessagesKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Component__Group_1__0__Impl2237); 
             after(grammarAccess.getComponentAccess().getSendsMessagesKeyword_1_0()); 

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
    // $ANTLR end "rule__Component__Group_1__0__Impl"


    // $ANTLR start "rule__Component__Group_1__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1150:1: rule__Component__Group_1__1 : rule__Component__Group_1__1__Impl rule__Component__Group_1__2 ;
    public final void rule__Component__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1154:1: ( rule__Component__Group_1__1__Impl rule__Component__Group_1__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1155:2: rule__Component__Group_1__1__Impl rule__Component__Group_1__2
            {
            pushFollow(FOLLOW_rule__Component__Group_1__1__Impl_in_rule__Component__Group_1__12268);
            rule__Component__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_1__2_in_rule__Component__Group_1__12271);
            rule__Component__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_1__1"


    // $ANTLR start "rule__Component__Group_1__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1162:1: rule__Component__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1166:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1167:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1167:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1168:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group_1__1__Impl2299); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Component__Group_1__1__Impl"


    // $ANTLR start "rule__Component__Group_1__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1181:1: rule__Component__Group_1__2 : rule__Component__Group_1__2__Impl rule__Component__Group_1__3 ;
    public final void rule__Component__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1185:1: ( rule__Component__Group_1__2__Impl rule__Component__Group_1__3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1186:2: rule__Component__Group_1__2__Impl rule__Component__Group_1__3
            {
            pushFollow(FOLLOW_rule__Component__Group_1__2__Impl_in_rule__Component__Group_1__22330);
            rule__Component__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_1__3_in_rule__Component__Group_1__22333);
            rule__Component__Group_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_1__2"


    // $ANTLR start "rule__Component__Group_1__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1193:1: rule__Component__Group_1__2__Impl : ( ( ( rule__Component__MessagesAssignment_1_2 ) ) ( ( rule__Component__MessagesAssignment_1_2 )* ) ) ;
    public final void rule__Component__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1197:1: ( ( ( ( rule__Component__MessagesAssignment_1_2 ) ) ( ( rule__Component__MessagesAssignment_1_2 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1198:1: ( ( ( rule__Component__MessagesAssignment_1_2 ) ) ( ( rule__Component__MessagesAssignment_1_2 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1198:1: ( ( ( rule__Component__MessagesAssignment_1_2 ) ) ( ( rule__Component__MessagesAssignment_1_2 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1199:1: ( ( rule__Component__MessagesAssignment_1_2 ) ) ( ( rule__Component__MessagesAssignment_1_2 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1199:1: ( ( rule__Component__MessagesAssignment_1_2 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1200:1: ( rule__Component__MessagesAssignment_1_2 )
            {
             before(grammarAccess.getComponentAccess().getMessagesAssignment_1_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1201:1: ( rule__Component__MessagesAssignment_1_2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1201:2: rule__Component__MessagesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Component__MessagesAssignment_1_2_in_rule__Component__Group_1__2__Impl2362);
            rule__Component__MessagesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMessagesAssignment_1_2()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1204:1: ( ( rule__Component__MessagesAssignment_1_2 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1205:1: ( rule__Component__MessagesAssignment_1_2 )*
            {
             before(grammarAccess.getComponentAccess().getMessagesAssignment_1_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1206:1: ( rule__Component__MessagesAssignment_1_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1206:2: rule__Component__MessagesAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Component__MessagesAssignment_1_2_in_rule__Component__Group_1__2__Impl2374);
            	    rule__Component__MessagesAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMessagesAssignment_1_2()); 

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
    // $ANTLR end "rule__Component__Group_1__2__Impl"


    // $ANTLR start "rule__Component__Group_1__3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1217:1: rule__Component__Group_1__3 : rule__Component__Group_1__3__Impl ;
    public final void rule__Component__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1221:1: ( rule__Component__Group_1__3__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1222:2: rule__Component__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_1__3__Impl_in_rule__Component__Group_1__32407);
            rule__Component__Group_1__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_1__3"


    // $ANTLR start "rule__Component__Group_1__3__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1228:1: rule__Component__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Component__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1232:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1233:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1233:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1234:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__Component__Group_1__3__Impl2435); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Component__Group_1__3__Impl"


    // $ANTLR start "rule__MessageType__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1255:1: rule__MessageType__Group__0 : rule__MessageType__Group__0__Impl rule__MessageType__Group__1 ;
    public final void rule__MessageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1259:1: ( rule__MessageType__Group__0__Impl rule__MessageType__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1260:2: rule__MessageType__Group__0__Impl rule__MessageType__Group__1
            {
            pushFollow(FOLLOW_rule__MessageType__Group__0__Impl_in_rule__MessageType__Group__02474);
            rule__MessageType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__1_in_rule__MessageType__Group__02477);
            rule__MessageType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MessageType__Group__0"


    // $ANTLR start "rule__MessageType__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1267:1: rule__MessageType__Group__0__Impl : ( ( rule__MessageType__NameAssignment_0 ) ) ;
    public final void rule__MessageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1271:1: ( ( ( rule__MessageType__NameAssignment_0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1272:1: ( ( rule__MessageType__NameAssignment_0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1272:1: ( ( rule__MessageType__NameAssignment_0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1273:1: ( rule__MessageType__NameAssignment_0 )
            {
             before(grammarAccess.getMessageTypeAccess().getNameAssignment_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1274:1: ( rule__MessageType__NameAssignment_0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1274:2: rule__MessageType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageType__NameAssignment_0_in_rule__MessageType__Group__0__Impl2504);
            rule__MessageType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MessageType__Group__0__Impl"


    // $ANTLR start "rule__MessageType__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1284:1: rule__MessageType__Group__1 : rule__MessageType__Group__1__Impl rule__MessageType__Group__2 ;
    public final void rule__MessageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1288:1: ( rule__MessageType__Group__1__Impl rule__MessageType__Group__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1289:2: rule__MessageType__Group__1__Impl rule__MessageType__Group__2
            {
            pushFollow(FOLLOW_rule__MessageType__Group__1__Impl_in_rule__MessageType__Group__12534);
            rule__MessageType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__2_in_rule__MessageType__Group__12537);
            rule__MessageType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MessageType__Group__1"


    // $ANTLR start "rule__MessageType__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1296:1: rule__MessageType__Group__1__Impl : ( 'has fields' ) ;
    public final void rule__MessageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1300:1: ( ( 'has fields' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1301:1: ( 'has fields' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1301:1: ( 'has fields' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1302:1: 'has fields'
            {
             before(grammarAccess.getMessageTypeAccess().getHasFieldsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MessageType__Group__1__Impl2565); 
             after(grammarAccess.getMessageTypeAccess().getHasFieldsKeyword_1()); 

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
    // $ANTLR end "rule__MessageType__Group__1__Impl"


    // $ANTLR start "rule__MessageType__Group__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1315:1: rule__MessageType__Group__2 : rule__MessageType__Group__2__Impl rule__MessageType__Group__3 ;
    public final void rule__MessageType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1319:1: ( rule__MessageType__Group__2__Impl rule__MessageType__Group__3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1320:2: rule__MessageType__Group__2__Impl rule__MessageType__Group__3
            {
            pushFollow(FOLLOW_rule__MessageType__Group__2__Impl_in_rule__MessageType__Group__22596);
            rule__MessageType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__3_in_rule__MessageType__Group__22599);
            rule__MessageType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__MessageType__Group__2"


    // $ANTLR start "rule__MessageType__Group__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1327:1: rule__MessageType__Group__2__Impl : ( '{' ) ;
    public final void rule__MessageType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1331:1: ( ( '{' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1332:1: ( '{' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1332:1: ( '{' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1333:1: '{'
            {
             before(grammarAccess.getMessageTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__MessageType__Group__2__Impl2627); 
             after(grammarAccess.getMessageTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MessageType__Group__2__Impl"


    // $ANTLR start "rule__MessageType__Group__3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1346:1: rule__MessageType__Group__3 : rule__MessageType__Group__3__Impl rule__MessageType__Group__4 ;
    public final void rule__MessageType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1350:1: ( rule__MessageType__Group__3__Impl rule__MessageType__Group__4 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1351:2: rule__MessageType__Group__3__Impl rule__MessageType__Group__4
            {
            pushFollow(FOLLOW_rule__MessageType__Group__3__Impl_in_rule__MessageType__Group__32658);
            rule__MessageType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__4_in_rule__MessageType__Group__32661);
            rule__MessageType__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__MessageType__Group__3"


    // $ANTLR start "rule__MessageType__Group__3__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1358:1: rule__MessageType__Group__3__Impl : ( ( ( rule__MessageType__FieldsAssignment_3 ) ) ( ( rule__MessageType__FieldsAssignment_3 )* ) ) ;
    public final void rule__MessageType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1362:1: ( ( ( ( rule__MessageType__FieldsAssignment_3 ) ) ( ( rule__MessageType__FieldsAssignment_3 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1363:1: ( ( ( rule__MessageType__FieldsAssignment_3 ) ) ( ( rule__MessageType__FieldsAssignment_3 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1363:1: ( ( ( rule__MessageType__FieldsAssignment_3 ) ) ( ( rule__MessageType__FieldsAssignment_3 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1364:1: ( ( rule__MessageType__FieldsAssignment_3 ) ) ( ( rule__MessageType__FieldsAssignment_3 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1364:1: ( ( rule__MessageType__FieldsAssignment_3 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1365:1: ( rule__MessageType__FieldsAssignment_3 )
            {
             before(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1366:1: ( rule__MessageType__FieldsAssignment_3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1366:2: rule__MessageType__FieldsAssignment_3
            {
            pushFollow(FOLLOW_rule__MessageType__FieldsAssignment_3_in_rule__MessageType__Group__3__Impl2690);
            rule__MessageType__FieldsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1369:1: ( ( rule__MessageType__FieldsAssignment_3 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1370:1: ( rule__MessageType__FieldsAssignment_3 )*
            {
             before(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1371:1: ( rule__MessageType__FieldsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1371:2: rule__MessageType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MessageType__FieldsAssignment_3_in_rule__MessageType__Group__3__Impl2702);
            	    rule__MessageType__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3()); 

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
    // $ANTLR end "rule__MessageType__Group__3__Impl"


    // $ANTLR start "rule__MessageType__Group__4"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1382:1: rule__MessageType__Group__4 : rule__MessageType__Group__4__Impl ;
    public final void rule__MessageType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1386:1: ( rule__MessageType__Group__4__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1387:2: rule__MessageType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MessageType__Group__4__Impl_in_rule__MessageType__Group__42735);
            rule__MessageType__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MessageType__Group__4"


    // $ANTLR start "rule__MessageType__Group__4__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1393:1: rule__MessageType__Group__4__Impl : ( '}' ) ;
    public final void rule__MessageType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1397:1: ( ( '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1398:1: ( '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1398:1: ( '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1399:1: '}'
            {
             before(grammarAccess.getMessageTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__MessageType__Group__4__Impl2763); 
             after(grammarAccess.getMessageTypeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MessageType__Group__4__Impl"


    // $ANTLR start "rule__MessageInstance__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1422:1: rule__MessageInstance__Group__0 : rule__MessageInstance__Group__0__Impl rule__MessageInstance__Group__1 ;
    public final void rule__MessageInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1426:1: ( rule__MessageInstance__Group__0__Impl rule__MessageInstance__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1427:2: rule__MessageInstance__Group__0__Impl rule__MessageInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__0__Impl_in_rule__MessageInstance__Group__02804);
            rule__MessageInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group__1_in_rule__MessageInstance__Group__02807);
            rule__MessageInstance__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__0"


    // $ANTLR start "rule__MessageInstance__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1434:1: rule__MessageInstance__Group__0__Impl : ( 'of type' ) ;
    public final void rule__MessageInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1438:1: ( ( 'of type' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1439:1: ( 'of type' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1439:1: ( 'of type' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1440:1: 'of type'
            {
             before(grammarAccess.getMessageInstanceAccess().getOfTypeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__MessageInstance__Group__0__Impl2835); 
             after(grammarAccess.getMessageInstanceAccess().getOfTypeKeyword_0()); 

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
    // $ANTLR end "rule__MessageInstance__Group__0__Impl"


    // $ANTLR start "rule__MessageInstance__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1453:1: rule__MessageInstance__Group__1 : rule__MessageInstance__Group__1__Impl rule__MessageInstance__Group__2 ;
    public final void rule__MessageInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1457:1: ( rule__MessageInstance__Group__1__Impl rule__MessageInstance__Group__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1458:2: rule__MessageInstance__Group__1__Impl rule__MessageInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__1__Impl_in_rule__MessageInstance__Group__12866);
            rule__MessageInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group__2_in_rule__MessageInstance__Group__12869);
            rule__MessageInstance__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__1"


    // $ANTLR start "rule__MessageInstance__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1465:1: rule__MessageInstance__Group__1__Impl : ( ( rule__MessageInstance__MessageAssignment_1 ) ) ;
    public final void rule__MessageInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1469:1: ( ( ( rule__MessageInstance__MessageAssignment_1 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1470:1: ( ( rule__MessageInstance__MessageAssignment_1 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1470:1: ( ( rule__MessageInstance__MessageAssignment_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1471:1: ( rule__MessageInstance__MessageAssignment_1 )
            {
             before(grammarAccess.getMessageInstanceAccess().getMessageAssignment_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1472:1: ( rule__MessageInstance__MessageAssignment_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1472:2: rule__MessageInstance__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageInstance__MessageAssignment_1_in_rule__MessageInstance__Group__1__Impl2896);
            rule__MessageInstance__MessageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getMessageAssignment_1()); 

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
    // $ANTLR end "rule__MessageInstance__Group__1__Impl"


    // $ANTLR start "rule__MessageInstance__Group__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1482:1: rule__MessageInstance__Group__2 : rule__MessageInstance__Group__2__Impl rule__MessageInstance__Group__3 ;
    public final void rule__MessageInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1486:1: ( rule__MessageInstance__Group__2__Impl rule__MessageInstance__Group__3 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1487:2: rule__MessageInstance__Group__2__Impl rule__MessageInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__2__Impl_in_rule__MessageInstance__Group__22926);
            rule__MessageInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group__3_in_rule__MessageInstance__Group__22929);
            rule__MessageInstance__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__2"


    // $ANTLR start "rule__MessageInstance__Group__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1494:1: rule__MessageInstance__Group__2__Impl : ( ( rule__MessageInstance__Group_2__0 )? ) ;
    public final void rule__MessageInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1498:1: ( ( ( rule__MessageInstance__Group_2__0 )? ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1499:1: ( ( rule__MessageInstance__Group_2__0 )? )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1499:1: ( ( rule__MessageInstance__Group_2__0 )? )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1500:1: ( rule__MessageInstance__Group_2__0 )?
            {
             before(grammarAccess.getMessageInstanceAccess().getGroup_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1501:1: ( rule__MessageInstance__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1501:2: rule__MessageInstance__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MessageInstance__Group_2__0_in_rule__MessageInstance__Group__2__Impl2956);
                    rule__MessageInstance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageInstanceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MessageInstance__Group__2__Impl"


    // $ANTLR start "rule__MessageInstance__Group__3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1511:1: rule__MessageInstance__Group__3 : rule__MessageInstance__Group__3__Impl rule__MessageInstance__Group__4 ;
    public final void rule__MessageInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1515:1: ( rule__MessageInstance__Group__3__Impl rule__MessageInstance__Group__4 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1516:2: rule__MessageInstance__Group__3__Impl rule__MessageInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__3__Impl_in_rule__MessageInstance__Group__32987);
            rule__MessageInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group__4_in_rule__MessageInstance__Group__32990);
            rule__MessageInstance__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__3"


    // $ANTLR start "rule__MessageInstance__Group__3__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1523:1: rule__MessageInstance__Group__3__Impl : ( 'over' ) ;
    public final void rule__MessageInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1527:1: ( ( 'over' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1528:1: ( 'over' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1528:1: ( 'over' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1529:1: 'over'
            {
             before(grammarAccess.getMessageInstanceAccess().getOverKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__MessageInstance__Group__3__Impl3018); 
             after(grammarAccess.getMessageInstanceAccess().getOverKeyword_3()); 

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
    // $ANTLR end "rule__MessageInstance__Group__3__Impl"


    // $ANTLR start "rule__MessageInstance__Group__4"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1542:1: rule__MessageInstance__Group__4 : rule__MessageInstance__Group__4__Impl rule__MessageInstance__Group__5 ;
    public final void rule__MessageInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1546:1: ( rule__MessageInstance__Group__4__Impl rule__MessageInstance__Group__5 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1547:2: rule__MessageInstance__Group__4__Impl rule__MessageInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__4__Impl_in_rule__MessageInstance__Group__43049);
            rule__MessageInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group__5_in_rule__MessageInstance__Group__43052);
            rule__MessageInstance__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__4"


    // $ANTLR start "rule__MessageInstance__Group__4__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1554:1: rule__MessageInstance__Group__4__Impl : ( ( rule__MessageInstance__BusAssignment_4 ) ) ;
    public final void rule__MessageInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1558:1: ( ( ( rule__MessageInstance__BusAssignment_4 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1559:1: ( ( rule__MessageInstance__BusAssignment_4 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1559:1: ( ( rule__MessageInstance__BusAssignment_4 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1560:1: ( rule__MessageInstance__BusAssignment_4 )
            {
             before(grammarAccess.getMessageInstanceAccess().getBusAssignment_4()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1561:1: ( rule__MessageInstance__BusAssignment_4 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1561:2: rule__MessageInstance__BusAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageInstance__BusAssignment_4_in_rule__MessageInstance__Group__4__Impl3079);
            rule__MessageInstance__BusAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getBusAssignment_4()); 

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
    // $ANTLR end "rule__MessageInstance__Group__4__Impl"


    // $ANTLR start "rule__MessageInstance__Group__5"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1571:1: rule__MessageInstance__Group__5 : rule__MessageInstance__Group__5__Impl ;
    public final void rule__MessageInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1575:1: ( rule__MessageInstance__Group__5__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1576:2: rule__MessageInstance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group__5__Impl_in_rule__MessageInstance__Group__53109);
            rule__MessageInstance__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group__5"


    // $ANTLR start "rule__MessageInstance__Group__5__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1582:1: rule__MessageInstance__Group__5__Impl : ( ( rule__MessageInstance__Alternatives_5 ) ) ;
    public final void rule__MessageInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1586:1: ( ( ( rule__MessageInstance__Alternatives_5 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1587:1: ( ( rule__MessageInstance__Alternatives_5 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1587:1: ( ( rule__MessageInstance__Alternatives_5 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1588:1: ( rule__MessageInstance__Alternatives_5 )
            {
             before(grammarAccess.getMessageInstanceAccess().getAlternatives_5()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1589:1: ( rule__MessageInstance__Alternatives_5 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1589:2: rule__MessageInstance__Alternatives_5
            {
            pushFollow(FOLLOW_rule__MessageInstance__Alternatives_5_in_rule__MessageInstance__Group__5__Impl3136);
            rule__MessageInstance__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__MessageInstance__Group__5__Impl"


    // $ANTLR start "rule__MessageInstance__Group_2__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1611:1: rule__MessageInstance__Group_2__0 : rule__MessageInstance__Group_2__0__Impl rule__MessageInstance__Group_2__1 ;
    public final void rule__MessageInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1615:1: ( rule__MessageInstance__Group_2__0__Impl rule__MessageInstance__Group_2__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1616:2: rule__MessageInstance__Group_2__0__Impl rule__MessageInstance__Group_2__1
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group_2__0__Impl_in_rule__MessageInstance__Group_2__03178);
            rule__MessageInstance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group_2__1_in_rule__MessageInstance__Group_2__03181);
            rule__MessageInstance__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group_2__0"


    // $ANTLR start "rule__MessageInstance__Group_2__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1623:1: rule__MessageInstance__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MessageInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1627:1: ( ( '(' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1628:1: ( '(' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1628:1: ( '(' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1629:1: '('
            {
             before(grammarAccess.getMessageInstanceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__MessageInstance__Group_2__0__Impl3209); 
             after(grammarAccess.getMessageInstanceAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__MessageInstance__Group_2__0__Impl"


    // $ANTLR start "rule__MessageInstance__Group_2__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1642:1: rule__MessageInstance__Group_2__1 : rule__MessageInstance__Group_2__1__Impl rule__MessageInstance__Group_2__2 ;
    public final void rule__MessageInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1646:1: ( rule__MessageInstance__Group_2__1__Impl rule__MessageInstance__Group_2__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1647:2: rule__MessageInstance__Group_2__1__Impl rule__MessageInstance__Group_2__2
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group_2__1__Impl_in_rule__MessageInstance__Group_2__13240);
            rule__MessageInstance__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group_2__2_in_rule__MessageInstance__Group_2__13243);
            rule__MessageInstance__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group_2__1"


    // $ANTLR start "rule__MessageInstance__Group_2__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1654:1: rule__MessageInstance__Group_2__1__Impl : ( ( ( rule__MessageInstance__ParamsAssignment_2_1 ) ) ( ( rule__MessageInstance__ParamsAssignment_2_1 )* ) ) ;
    public final void rule__MessageInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1658:1: ( ( ( ( rule__MessageInstance__ParamsAssignment_2_1 ) ) ( ( rule__MessageInstance__ParamsAssignment_2_1 )* ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1659:1: ( ( ( rule__MessageInstance__ParamsAssignment_2_1 ) ) ( ( rule__MessageInstance__ParamsAssignment_2_1 )* ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1659:1: ( ( ( rule__MessageInstance__ParamsAssignment_2_1 ) ) ( ( rule__MessageInstance__ParamsAssignment_2_1 )* ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1660:1: ( ( rule__MessageInstance__ParamsAssignment_2_1 ) ) ( ( rule__MessageInstance__ParamsAssignment_2_1 )* )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1660:1: ( ( rule__MessageInstance__ParamsAssignment_2_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1661:1: ( rule__MessageInstance__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getMessageInstanceAccess().getParamsAssignment_2_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1662:1: ( rule__MessageInstance__ParamsAssignment_2_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1662:2: rule__MessageInstance__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MessageInstance__ParamsAssignment_2_1_in_rule__MessageInstance__Group_2__1__Impl3272);
            rule__MessageInstance__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getParamsAssignment_2_1()); 

            }

            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1665:1: ( ( rule__MessageInstance__ParamsAssignment_2_1 )* )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1666:1: ( rule__MessageInstance__ParamsAssignment_2_1 )*
            {
             before(grammarAccess.getMessageInstanceAccess().getParamsAssignment_2_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1667:1: ( rule__MessageInstance__ParamsAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1667:2: rule__MessageInstance__ParamsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__MessageInstance__ParamsAssignment_2_1_in_rule__MessageInstance__Group_2__1__Impl3284);
            	    rule__MessageInstance__ParamsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMessageInstanceAccess().getParamsAssignment_2_1()); 

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
    // $ANTLR end "rule__MessageInstance__Group_2__1__Impl"


    // $ANTLR start "rule__MessageInstance__Group_2__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1678:1: rule__MessageInstance__Group_2__2 : rule__MessageInstance__Group_2__2__Impl ;
    public final void rule__MessageInstance__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1682:1: ( rule__MessageInstance__Group_2__2__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1683:2: rule__MessageInstance__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group_2__2__Impl_in_rule__MessageInstance__Group_2__23317);
            rule__MessageInstance__Group_2__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group_2__2"


    // $ANTLR start "rule__MessageInstance__Group_2__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1689:1: rule__MessageInstance__Group_2__2__Impl : ( ')' ) ;
    public final void rule__MessageInstance__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1693:1: ( ( ')' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1694:1: ( ')' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1694:1: ( ')' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1695:1: ')'
            {
             before(grammarAccess.getMessageInstanceAccess().getRightParenthesisKeyword_2_2()); 
            match(input,29,FOLLOW_29_in_rule__MessageInstance__Group_2__2__Impl3345); 
             after(grammarAccess.getMessageInstanceAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__MessageInstance__Group_2__2__Impl"


    // $ANTLR start "rule__MessageInstance__Group_5_1__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1714:1: rule__MessageInstance__Group_5_1__0 : rule__MessageInstance__Group_5_1__0__Impl rule__MessageInstance__Group_5_1__1 ;
    public final void rule__MessageInstance__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1718:1: ( rule__MessageInstance__Group_5_1__0__Impl rule__MessageInstance__Group_5_1__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1719:2: rule__MessageInstance__Group_5_1__0__Impl rule__MessageInstance__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group_5_1__0__Impl_in_rule__MessageInstance__Group_5_1__03382);
            rule__MessageInstance__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageInstance__Group_5_1__1_in_rule__MessageInstance__Group_5_1__03385);
            rule__MessageInstance__Group_5_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group_5_1__0"


    // $ANTLR start "rule__MessageInstance__Group_5_1__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1726:1: rule__MessageInstance__Group_5_1__0__Impl : ( 'to' ) ;
    public final void rule__MessageInstance__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1730:1: ( ( 'to' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1731:1: ( 'to' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1731:1: ( 'to' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1732:1: 'to'
            {
             before(grammarAccess.getMessageInstanceAccess().getToKeyword_5_1_0()); 
            match(input,30,FOLLOW_30_in_rule__MessageInstance__Group_5_1__0__Impl3413); 
             after(grammarAccess.getMessageInstanceAccess().getToKeyword_5_1_0()); 

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
    // $ANTLR end "rule__MessageInstance__Group_5_1__0__Impl"


    // $ANTLR start "rule__MessageInstance__Group_5_1__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1745:1: rule__MessageInstance__Group_5_1__1 : rule__MessageInstance__Group_5_1__1__Impl ;
    public final void rule__MessageInstance__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1749:1: ( rule__MessageInstance__Group_5_1__1__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1750:2: rule__MessageInstance__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageInstance__Group_5_1__1__Impl_in_rule__MessageInstance__Group_5_1__13444);
            rule__MessageInstance__Group_5_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MessageInstance__Group_5_1__1"


    // $ANTLR start "rule__MessageInstance__Group_5_1__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1756:1: rule__MessageInstance__Group_5_1__1__Impl : ( ( rule__MessageInstance__TargetAssignment_5_1_1 ) ) ;
    public final void rule__MessageInstance__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1760:1: ( ( ( rule__MessageInstance__TargetAssignment_5_1_1 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1761:1: ( ( rule__MessageInstance__TargetAssignment_5_1_1 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1761:1: ( ( rule__MessageInstance__TargetAssignment_5_1_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1762:1: ( rule__MessageInstance__TargetAssignment_5_1_1 )
            {
             before(grammarAccess.getMessageInstanceAccess().getTargetAssignment_5_1_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1763:1: ( rule__MessageInstance__TargetAssignment_5_1_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1763:2: rule__MessageInstance__TargetAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__MessageInstance__TargetAssignment_5_1_1_in_rule__MessageInstance__Group_5_1__1__Impl3471);
            rule__MessageInstance__TargetAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageInstanceAccess().getTargetAssignment_5_1_1()); 

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
    // $ANTLR end "rule__MessageInstance__Group_5_1__1__Impl"


    // $ANTLR start "rule__MessageFieldType__Group__0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1777:1: rule__MessageFieldType__Group__0 : rule__MessageFieldType__Group__0__Impl rule__MessageFieldType__Group__1 ;
    public final void rule__MessageFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1781:1: ( rule__MessageFieldType__Group__0__Impl rule__MessageFieldType__Group__1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1782:2: rule__MessageFieldType__Group__0__Impl rule__MessageFieldType__Group__1
            {
            pushFollow(FOLLOW_rule__MessageFieldType__Group__0__Impl_in_rule__MessageFieldType__Group__03505);
            rule__MessageFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldType__Group__1_in_rule__MessageFieldType__Group__03508);
            rule__MessageFieldType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MessageFieldType__Group__0"


    // $ANTLR start "rule__MessageFieldType__Group__0__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1789:1: rule__MessageFieldType__Group__0__Impl : ( ( rule__MessageFieldType__Alternatives_0 ) ) ;
    public final void rule__MessageFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1793:1: ( ( ( rule__MessageFieldType__Alternatives_0 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1794:1: ( ( rule__MessageFieldType__Alternatives_0 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1794:1: ( ( rule__MessageFieldType__Alternatives_0 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1795:1: ( rule__MessageFieldType__Alternatives_0 )
            {
             before(grammarAccess.getMessageFieldTypeAccess().getAlternatives_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1796:1: ( rule__MessageFieldType__Alternatives_0 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1796:2: rule__MessageFieldType__Alternatives_0
            {
            pushFollow(FOLLOW_rule__MessageFieldType__Alternatives_0_in_rule__MessageFieldType__Group__0__Impl3535);
            rule__MessageFieldType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldTypeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__MessageFieldType__Group__0__Impl"


    // $ANTLR start "rule__MessageFieldType__Group__1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1806:1: rule__MessageFieldType__Group__1 : rule__MessageFieldType__Group__1__Impl rule__MessageFieldType__Group__2 ;
    public final void rule__MessageFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1810:1: ( rule__MessageFieldType__Group__1__Impl rule__MessageFieldType__Group__2 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1811:2: rule__MessageFieldType__Group__1__Impl rule__MessageFieldType__Group__2
            {
            pushFollow(FOLLOW_rule__MessageFieldType__Group__1__Impl_in_rule__MessageFieldType__Group__13565);
            rule__MessageFieldType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldType__Group__2_in_rule__MessageFieldType__Group__13568);
            rule__MessageFieldType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MessageFieldType__Group__1"


    // $ANTLR start "rule__MessageFieldType__Group__1__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1818:1: rule__MessageFieldType__Group__1__Impl : ( ( rule__MessageFieldType__NameAssignment_1 ) ) ;
    public final void rule__MessageFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1822:1: ( ( ( rule__MessageFieldType__NameAssignment_1 ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1823:1: ( ( rule__MessageFieldType__NameAssignment_1 ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1823:1: ( ( rule__MessageFieldType__NameAssignment_1 ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1824:1: ( rule__MessageFieldType__NameAssignment_1 )
            {
             before(grammarAccess.getMessageFieldTypeAccess().getNameAssignment_1()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1825:1: ( rule__MessageFieldType__NameAssignment_1 )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1825:2: rule__MessageFieldType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageFieldType__NameAssignment_1_in_rule__MessageFieldType__Group__1__Impl3595);
            rule__MessageFieldType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MessageFieldType__Group__1__Impl"


    // $ANTLR start "rule__MessageFieldType__Group__2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1835:1: rule__MessageFieldType__Group__2 : rule__MessageFieldType__Group__2__Impl ;
    public final void rule__MessageFieldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1839:1: ( rule__MessageFieldType__Group__2__Impl )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1840:2: rule__MessageFieldType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageFieldType__Group__2__Impl_in_rule__MessageFieldType__Group__23625);
            rule__MessageFieldType__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MessageFieldType__Group__2"


    // $ANTLR start "rule__MessageFieldType__Group__2__Impl"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1846:1: rule__MessageFieldType__Group__2__Impl : ( ( rule__MessageFieldType__IsRequiredAssignment_2 )? ) ;
    public final void rule__MessageFieldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1850:1: ( ( ( rule__MessageFieldType__IsRequiredAssignment_2 )? ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1851:1: ( ( rule__MessageFieldType__IsRequiredAssignment_2 )? )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1851:1: ( ( rule__MessageFieldType__IsRequiredAssignment_2 )? )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1852:1: ( rule__MessageFieldType__IsRequiredAssignment_2 )?
            {
             before(grammarAccess.getMessageFieldTypeAccess().getIsRequiredAssignment_2()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1853:1: ( rule__MessageFieldType__IsRequiredAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1853:2: rule__MessageFieldType__IsRequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MessageFieldType__IsRequiredAssignment_2_in_rule__MessageFieldType__Group__2__Impl3652);
                    rule__MessageFieldType__IsRequiredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageFieldTypeAccess().getIsRequiredAssignment_2()); 

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
    // $ANTLR end "rule__MessageFieldType__Group__2__Impl"


    // $ANTLR start "rule__Model__BussesAssignment_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1870:1: rule__Model__BussesAssignment_1 : ( ruleBussystem ) ;
    public final void rule__Model__BussesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1874:1: ( ( ruleBussystem ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1875:1: ( ruleBussystem )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1875:1: ( ruleBussystem )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1876:1: ruleBussystem
            {
             before(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBussystem_in_rule__Model__BussesAssignment_13694);
            ruleBussystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__BussesAssignment_1"


    // $ANTLR start "rule__Model__BussesAssignment_2_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1885:1: rule__Model__BussesAssignment_2_1 : ( ruleBussystem ) ;
    public final void rule__Model__BussesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1889:1: ( ( ruleBussystem ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1890:1: ( ruleBussystem )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1890:1: ( ruleBussystem )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1891:1: ruleBussystem
            {
             before(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBussystem_in_rule__Model__BussesAssignment_2_13725);
            ruleBussystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Model__BussesAssignment_2_1"


    // $ANTLR start "rule__Model__MessagesAssignment_5"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1900:1: rule__Model__MessagesAssignment_5 : ( ruleMessageType ) ;
    public final void rule__Model__MessagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1904:1: ( ( ruleMessageType ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1905:1: ( ruleMessageType )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1905:1: ( ruleMessageType )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1906:1: ruleMessageType
            {
             before(grammarAccess.getModelAccess().getMessagesMessageTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMessageType_in_rule__Model__MessagesAssignment_53756);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMessagesMessageTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__MessagesAssignment_5"


    // $ANTLR start "rule__Model__ComponentsAssignment_9"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1915:1: rule__Model__ComponentsAssignment_9 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1919:1: ( ( ruleComponent ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1920:1: ( ruleComponent )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1920:1: ( ruleComponent )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1921:1: ruleComponent
            {
             before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Model__ComponentsAssignment_93787);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Model__ComponentsAssignment_9"


    // $ANTLR start "rule__Model__VehiclesAssignment_13"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1930:1: rule__Model__VehiclesAssignment_13 : ( ruleVehicleType ) ;
    public final void rule__Model__VehiclesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1934:1: ( ( ruleVehicleType ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1935:1: ( ruleVehicleType )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1935:1: ( ruleVehicleType )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1936:1: ruleVehicleType
            {
             before(grammarAccess.getModelAccess().getVehiclesVehicleTypeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleVehicleType_in_rule__Model__VehiclesAssignment_133818);
            ruleVehicleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVehiclesVehicleTypeParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Model__VehiclesAssignment_13"


    // $ANTLR start "rule__VehicleType__NameAssignment_0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1945:1: rule__VehicleType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VehicleType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1949:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1950:1: ( RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1950:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1951:1: RULE_ID
            {
             before(grammarAccess.getVehicleTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VehicleType__NameAssignment_03849); 
             after(grammarAccess.getVehicleTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VehicleType__NameAssignment_0"


    // $ANTLR start "rule__VehicleType__ComponentsAssignment_3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1960:1: rule__VehicleType__ComponentsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__VehicleType__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1964:1: ( ( ( RULE_ID ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1965:1: ( ( RULE_ID ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1965:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1966:1: ( RULE_ID )
            {
             before(grammarAccess.getVehicleTypeAccess().getComponentsComponentCrossReference_3_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1967:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1968:1: RULE_ID
            {
             before(grammarAccess.getVehicleTypeAccess().getComponentsComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VehicleType__ComponentsAssignment_33884); 
             after(grammarAccess.getVehicleTypeAccess().getComponentsComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getVehicleTypeAccess().getComponentsComponentCrossReference_3_0()); 

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
    // $ANTLR end "rule__VehicleType__ComponentsAssignment_3"


    // $ANTLR start "rule__Bussystem__NameAssignment"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1979:1: rule__Bussystem__NameAssignment : ( RULE_ID ) ;
    public final void rule__Bussystem__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1983:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1984:1: ( RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1984:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1985:1: RULE_ID
            {
             before(grammarAccess.getBussystemAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bussystem__NameAssignment3919); 
             after(grammarAccess.getBussystemAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Bussystem__NameAssignment"


    // $ANTLR start "rule__Component__NameAssignment_0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1994:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1998:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1999:1: ( RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:1999:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2000:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_03950); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_0"


    // $ANTLR start "rule__Component__MessagesAssignment_1_2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2009:1: rule__Component__MessagesAssignment_1_2 : ( ruleMessageInstance ) ;
    public final void rule__Component__MessagesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2013:1: ( ( ruleMessageInstance ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2014:1: ( ruleMessageInstance )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2014:1: ( ruleMessageInstance )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2015:1: ruleMessageInstance
            {
             before(grammarAccess.getComponentAccess().getMessagesMessageInstanceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMessageInstance_in_rule__Component__MessagesAssignment_1_23981);
            ruleMessageInstance();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMessagesMessageInstanceParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Component__MessagesAssignment_1_2"


    // $ANTLR start "rule__MessageType__NameAssignment_0"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2024:1: rule__MessageType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2028:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2029:1: ( RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2029:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2030:1: RULE_ID
            {
             before(grammarAccess.getMessageTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageType__NameAssignment_04012); 
             after(grammarAccess.getMessageTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MessageType__NameAssignment_0"


    // $ANTLR start "rule__MessageType__FieldsAssignment_3"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2039:1: rule__MessageType__FieldsAssignment_3 : ( ruleMessageFieldType ) ;
    public final void rule__MessageType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2043:1: ( ( ruleMessageFieldType ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2044:1: ( ruleMessageFieldType )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2044:1: ( ruleMessageFieldType )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2045:1: ruleMessageFieldType
            {
             before(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMessageFieldType_in_rule__MessageType__FieldsAssignment_34043);
            ruleMessageFieldType();

            state._fsp--;

             after(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MessageType__FieldsAssignment_3"


    // $ANTLR start "rule__MessageInstance__MessageAssignment_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2054:1: rule__MessageInstance__MessageAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MessageInstance__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2058:1: ( ( ( RULE_ID ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2059:1: ( ( RULE_ID ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2059:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2060:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageInstanceAccess().getMessageMessageTypeCrossReference_1_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2061:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2062:1: RULE_ID
            {
             before(grammarAccess.getMessageInstanceAccess().getMessageMessageTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageInstance__MessageAssignment_14078); 
             after(grammarAccess.getMessageInstanceAccess().getMessageMessageTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMessageInstanceAccess().getMessageMessageTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__MessageInstance__MessageAssignment_1"


    // $ANTLR start "rule__MessageInstance__ParamsAssignment_2_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2073:1: rule__MessageInstance__ParamsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MessageInstance__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2077:1: ( ( RULE_STRING ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2078:1: ( RULE_STRING )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2078:1: ( RULE_STRING )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2079:1: RULE_STRING
            {
             before(grammarAccess.getMessageInstanceAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MessageInstance__ParamsAssignment_2_14113); 
             after(grammarAccess.getMessageInstanceAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MessageInstance__ParamsAssignment_2_1"


    // $ANTLR start "rule__MessageInstance__BusAssignment_4"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2088:1: rule__MessageInstance__BusAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MessageInstance__BusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2092:1: ( ( ( RULE_ID ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2093:1: ( ( RULE_ID ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2093:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2094:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageInstanceAccess().getBusBussystemCrossReference_4_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2095:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2096:1: RULE_ID
            {
             before(grammarAccess.getMessageInstanceAccess().getBusBussystemIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageInstance__BusAssignment_44148); 
             after(grammarAccess.getMessageInstanceAccess().getBusBussystemIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMessageInstanceAccess().getBusBussystemCrossReference_4_0()); 

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
    // $ANTLR end "rule__MessageInstance__BusAssignment_4"


    // $ANTLR start "rule__MessageInstance__TargetAssignment_5_1_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2107:1: rule__MessageInstance__TargetAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MessageInstance__TargetAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2111:1: ( ( ( RULE_ID ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2112:1: ( ( RULE_ID ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2112:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2113:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageInstanceAccess().getTargetComponentCrossReference_5_1_1_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2114:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2115:1: RULE_ID
            {
             before(grammarAccess.getMessageInstanceAccess().getTargetComponentIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageInstance__TargetAssignment_5_1_14187); 
             after(grammarAccess.getMessageInstanceAccess().getTargetComponentIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getMessageInstanceAccess().getTargetComponentCrossReference_5_1_1_0()); 

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
    // $ANTLR end "rule__MessageInstance__TargetAssignment_5_1_1"


    // $ANTLR start "rule__MessageFieldType__NameAssignment_1"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2126:1: rule__MessageFieldType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageFieldType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2130:1: ( ( RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2131:1: ( RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2131:1: ( RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2132:1: RULE_ID
            {
             before(grammarAccess.getMessageFieldTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageFieldType__NameAssignment_14222); 
             after(grammarAccess.getMessageFieldTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MessageFieldType__NameAssignment_1"


    // $ANTLR start "rule__MessageFieldType__IsRequiredAssignment_2"
    // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2141:1: rule__MessageFieldType__IsRequiredAssignment_2 : ( ( 'is required' ) ) ;
    public final void rule__MessageFieldType__IsRequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2145:1: ( ( ( 'is required' ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2146:1: ( ( 'is required' ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2146:1: ( ( 'is required' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2147:1: ( 'is required' )
            {
             before(grammarAccess.getMessageFieldTypeAccess().getIsRequiredIsRequiredKeyword_2_0()); 
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2148:1: ( 'is required' )
            // ../de.schakko.xtext.AutomotiveBusDsl.ui/src-gen/de/schakko/xtext/ui/contentassist/antlr/internal/InternalAutomotiveBusDsl.g:2149:1: 'is required'
            {
             before(grammarAccess.getMessageFieldTypeAccess().getIsRequiredIsRequiredKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__MessageFieldType__IsRequiredAssignment_24258); 
             after(grammarAccess.getMessageFieldTypeAccess().getIsRequiredIsRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getMessageFieldTypeAccess().getIsRequiredIsRequiredKeyword_2_0()); 

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
    // $ANTLR end "rule__MessageFieldType__IsRequiredAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVehicleType_in_entryRuleVehicleType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVehicleType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__0_in_ruleVehicleType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBussystem_in_entryRuleBussystem181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBussystem188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bussystem__NameAssignment_in_ruleBussystem214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_entryRuleMessageType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__0_in_ruleMessageType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInstance_in_entryRuleMessageInstance361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageInstance368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__0_in_ruleMessageInstance394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldType_in_entryRuleMessageFieldType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageFieldType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__0_in_ruleMessageFieldType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MessageInstance__Alternatives_5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_5_1__0_in_rule__MessageInstance__Alternatives_5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MessageFieldType__Alternatives_0544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MessageFieldType__Alternatives_0564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MessageFieldType__Alternatives_0584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1678 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BussesAssignment_1_in_rule__Model__Group__1__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl770 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl782 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group__3__Impl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__4__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MessagesAssignment_5_in_rule__Model__Group__5__Impl971 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__MessagesAssignment_5_in_rule__Model__Group__5__Impl983 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61016 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__6__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71078 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__7__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__8__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ComponentsAssignment_9_in_rule__Model__Group__9__Impl1234 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__ComponentsAssignment_9_in_rule__Model__Group__9__Impl1246 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101279 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__11_in_rule__Model__Group__101282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__10__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__11__Impl_in_rule__Model__Group__111341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__12_in_rule__Model__Group__111344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__11__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__12__Impl_in_rule__Model__Group__121403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__13_in_rule__Model__Group__121406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__12__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__13__Impl_in_rule__Model__Group__131465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__14_in_rule__Model__Group__131468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VehiclesAssignment_13_in_rule__Model__Group__13__Impl1497 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__VehiclesAssignment_13_in_rule__Model__Group__13__Impl1509 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__14__Impl_in_rule__Model__Group__141542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__14__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group_2__0__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BussesAssignment_2_1_in_rule__Model__Group_2__1__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__0__Impl_in_rule__VehicleType__Group__01754 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__1_in_rule__VehicleType__Group__01757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__NameAssignment_0_in_rule__VehicleType__Group__0__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__1__Impl_in_rule__VehicleType__Group__11814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__2_in_rule__VehicleType__Group__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VehicleType__Group__1__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__2__Impl_in_rule__VehicleType__Group__21876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__3_in_rule__VehicleType__Group__21879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VehicleType__Group__2__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__3__Impl_in_rule__VehicleType__Group__31938 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__4_in_rule__VehicleType__Group__31941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VehicleType__ComponentsAssignment_3_in_rule__VehicleType__Group__3__Impl1970 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VehicleType__ComponentsAssignment_3_in_rule__VehicleType__Group__3__Impl1982 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VehicleType__Group__4__Impl_in_rule__VehicleType__Group__42015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VehicleType__Group__4__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02084 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_0_in_rule__Component__Group__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1__0_in_rule__Component__Group__1__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1__0__Impl_in_rule__Component__Group_1__02206 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group_1__1_in_rule__Component__Group_1__02209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Component__Group_1__0__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1__1__Impl_in_rule__Component__Group_1__12268 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Component__Group_1__2_in_rule__Component__Group_1__12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group_1__1__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1__2__Impl_in_rule__Component__Group_1__22330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Component__Group_1__3_in_rule__Component__Group_1__22333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__MessagesAssignment_1_2_in_rule__Component__Group_1__2__Impl2362 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Component__MessagesAssignment_1_2_in_rule__Component__Group_1__2__Impl2374 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1__3__Impl_in_rule__Component__Group_1__32407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Component__Group_1__3__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__0__Impl_in_rule__MessageType__Group__02474 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__1_in_rule__MessageType__Group__02477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__NameAssignment_0_in_rule__MessageType__Group__0__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__1__Impl_in_rule__MessageType__Group__12534 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__2_in_rule__MessageType__Group__12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MessageType__Group__1__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__2__Impl_in_rule__MessageType__Group__22596 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__3_in_rule__MessageType__Group__22599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MessageType__Group__2__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__3__Impl_in_rule__MessageType__Group__32658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__4_in_rule__MessageType__Group__32661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__FieldsAssignment_3_in_rule__MessageType__Group__3__Impl2690 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__MessageType__FieldsAssignment_3_in_rule__MessageType__Group__3__Impl2702 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__4__Impl_in_rule__MessageType__Group__42735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MessageType__Group__4__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__0__Impl_in_rule__MessageInstance__Group__02804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__1_in_rule__MessageInstance__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MessageInstance__Group__0__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__1__Impl_in_rule__MessageInstance__Group__12866 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__2_in_rule__MessageInstance__Group__12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__MessageAssignment_1_in_rule__MessageInstance__Group__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__2__Impl_in_rule__MessageInstance__Group__22926 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__3_in_rule__MessageInstance__Group__22929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__0_in_rule__MessageInstance__Group__2__Impl2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__3__Impl_in_rule__MessageInstance__Group__32987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__4_in_rule__MessageInstance__Group__32990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MessageInstance__Group__3__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__4__Impl_in_rule__MessageInstance__Group__43049 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__5_in_rule__MessageInstance__Group__43052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__BusAssignment_4_in_rule__MessageInstance__Group__4__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group__5__Impl_in_rule__MessageInstance__Group__53109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Alternatives_5_in_rule__MessageInstance__Group__5__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__0__Impl_in_rule__MessageInstance__Group_2__03178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__1_in_rule__MessageInstance__Group_2__03181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageInstance__Group_2__0__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__1__Impl_in_rule__MessageInstance__Group_2__13240 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__2_in_rule__MessageInstance__Group_2__13243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__ParamsAssignment_2_1_in_rule__MessageInstance__Group_2__1__Impl3272 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MessageInstance__ParamsAssignment_2_1_in_rule__MessageInstance__Group_2__1__Impl3284 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_2__2__Impl_in_rule__MessageInstance__Group_2__23317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MessageInstance__Group_2__2__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_5_1__0__Impl_in_rule__MessageInstance__Group_5_1__03382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_5_1__1_in_rule__MessageInstance__Group_5_1__03385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageInstance__Group_5_1__0__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__Group_5_1__1__Impl_in_rule__MessageInstance__Group_5_1__13444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInstance__TargetAssignment_5_1_1_in_rule__MessageInstance__Group_5_1__1__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__0__Impl_in_rule__MessageFieldType__Group__03505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__1_in_rule__MessageFieldType__Group__03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Alternatives_0_in_rule__MessageFieldType__Group__0__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__1__Impl_in_rule__MessageFieldType__Group__13565 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__2_in_rule__MessageFieldType__Group__13568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__NameAssignment_1_in_rule__MessageFieldType__Group__1__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__Group__2__Impl_in_rule__MessageFieldType__Group__23625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldType__IsRequiredAssignment_2_in_rule__MessageFieldType__Group__2__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBussystem_in_rule__Model__BussesAssignment_13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBussystem_in_rule__Model__BussesAssignment_2_13725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_rule__Model__MessagesAssignment_53756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Model__ComponentsAssignment_93787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVehicleType_in_rule__Model__VehiclesAssignment_133818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VehicleType__NameAssignment_03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VehicleType__ComponentsAssignment_33884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bussystem__NameAssignment3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_03950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInstance_in_rule__Component__MessagesAssignment_1_23981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageType__NameAssignment_04012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldType_in_rule__MessageType__FieldsAssignment_34043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageInstance__MessageAssignment_14078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MessageInstance__ParamsAssignment_2_14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageInstance__BusAssignment_44148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageInstance__TargetAssignment_5_1_14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageFieldType__NameAssignment_14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MessageFieldType__IsRequiredAssignment_24258 = new BitSet(new long[]{0x0000000000000002L});

}