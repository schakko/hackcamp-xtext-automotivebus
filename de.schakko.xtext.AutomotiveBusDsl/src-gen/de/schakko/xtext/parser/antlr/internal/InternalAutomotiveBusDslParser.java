package de.schakko.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.schakko.xtext.services.AutomotiveBusDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutomotiveBusDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Busses'", "','", "'Messages'", "'{'", "'}'", "'Components'", "'Vehicles'", "'has components'", "'sends messages'", "'has fields'", "'of type'", "'('", "')'", "'over'", "'as broadcast'", "'to'", "'int'", "'char'", "'char[]'", "'is required'"
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
    public String getGrammarFileName() { return "../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g"; }



     	private AutomotiveBusDslGrammarAccess grammarAccess;
     	
        public InternalAutomotiveBusDslParser(TokenStream input, AutomotiveBusDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AutomotiveBusDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Busses' ( (lv_busses_1_0= ruleBussystem ) ) (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+ otherlv_4= 'Messages' otherlv_5= '{' ( (lv_messages_6_0= ruleMessageType ) )+ otherlv_7= '}' otherlv_8= 'Components' otherlv_9= '{' ( (lv_components_10_0= ruleComponent ) )+ otherlv_11= '}' otherlv_12= 'Vehicles' otherlv_13= '{' ( (lv_vehicles_14_0= ruleVehicleType ) )+ otherlv_15= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_busses_1_0 = null;

        EObject lv_busses_3_0 = null;

        EObject lv_messages_6_0 = null;

        EObject lv_components_10_0 = null;

        EObject lv_vehicles_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:79:28: ( (otherlv_0= 'Busses' ( (lv_busses_1_0= ruleBussystem ) ) (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+ otherlv_4= 'Messages' otherlv_5= '{' ( (lv_messages_6_0= ruleMessageType ) )+ otherlv_7= '}' otherlv_8= 'Components' otherlv_9= '{' ( (lv_components_10_0= ruleComponent ) )+ otherlv_11= '}' otherlv_12= 'Vehicles' otherlv_13= '{' ( (lv_vehicles_14_0= ruleVehicleType ) )+ otherlv_15= '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:80:1: (otherlv_0= 'Busses' ( (lv_busses_1_0= ruleBussystem ) ) (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+ otherlv_4= 'Messages' otherlv_5= '{' ( (lv_messages_6_0= ruleMessageType ) )+ otherlv_7= '}' otherlv_8= 'Components' otherlv_9= '{' ( (lv_components_10_0= ruleComponent ) )+ otherlv_11= '}' otherlv_12= 'Vehicles' otherlv_13= '{' ( (lv_vehicles_14_0= ruleVehicleType ) )+ otherlv_15= '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:80:1: (otherlv_0= 'Busses' ( (lv_busses_1_0= ruleBussystem ) ) (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+ otherlv_4= 'Messages' otherlv_5= '{' ( (lv_messages_6_0= ruleMessageType ) )+ otherlv_7= '}' otherlv_8= 'Components' otherlv_9= '{' ( (lv_components_10_0= ruleComponent ) )+ otherlv_11= '}' otherlv_12= 'Vehicles' otherlv_13= '{' ( (lv_vehicles_14_0= ruleVehicleType ) )+ otherlv_15= '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:80:3: otherlv_0= 'Busses' ( (lv_busses_1_0= ruleBussystem ) ) (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+ otherlv_4= 'Messages' otherlv_5= '{' ( (lv_messages_6_0= ruleMessageType ) )+ otherlv_7= '}' otherlv_8= 'Components' otherlv_9= '{' ( (lv_components_10_0= ruleComponent ) )+ otherlv_11= '}' otherlv_12= 'Vehicles' otherlv_13= '{' ( (lv_vehicles_14_0= ruleVehicleType ) )+ otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getBussesKeyword_0());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:84:1: ( (lv_busses_1_0= ruleBussystem ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:85:1: (lv_busses_1_0= ruleBussystem )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:85:1: (lv_busses_1_0= ruleBussystem )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:86:3: lv_busses_1_0= ruleBussystem
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBussystem_in_ruleModel143);
            lv_busses_1_0=ruleBussystem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"busses",
                    		lv_busses_1_0, 
                    		"Bussystem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:102:2: (otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:102:4: otherlv_2= ',' ( (lv_busses_3_0= ruleBussystem ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel156); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:106:1: ( (lv_busses_3_0= ruleBussystem ) )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:107:1: (lv_busses_3_0= ruleBussystem )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:107:1: (lv_busses_3_0= ruleBussystem )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:108:3: lv_busses_3_0= ruleBussystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBussesBussystemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBussystem_in_ruleModel177);
            	    lv_busses_3_0=ruleBussystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"busses",
            	            		lv_busses_3_0, 
            	            		"Bussystem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel191); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getMessagesKeyword_3());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleModel203); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:132:1: ( (lv_messages_6_0= ruleMessageType ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:133:1: (lv_messages_6_0= ruleMessageType )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:133:1: (lv_messages_6_0= ruleMessageType )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:134:3: lv_messages_6_0= ruleMessageType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMessagesMessageTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageType_in_ruleModel224);
            	    lv_messages_6_0=ruleMessageType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_6_0, 
            	            		"MessageType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleModel237); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleModel249); 

                	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getComponentsKeyword_7());
                
            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleModel261); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:162:1: ( (lv_components_10_0= ruleComponent ) )+
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
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:163:1: (lv_components_10_0= ruleComponent )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:163:1: (lv_components_10_0= ruleComponent )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:164:3: lv_components_10_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleModel282);
            	    lv_components_10_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_10_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleModel295); 

                	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleModel307); 

                	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getVehiclesKeyword_11());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleModel319); 

                	newLeafNode(otherlv_13, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_12());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:192:1: ( (lv_vehicles_14_0= ruleVehicleType ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:193:1: (lv_vehicles_14_0= ruleVehicleType )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:193:1: (lv_vehicles_14_0= ruleVehicleType )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:194:3: lv_vehicles_14_0= ruleVehicleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getVehiclesVehicleTypeParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVehicleType_in_ruleModel340);
            	    lv_vehicles_14_0=ruleVehicleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vehicles",
            	            		lv_vehicles_14_0, 
            	            		"VehicleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleModel353); 

                	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVehicleType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:222:1: entryRuleVehicleType returns [EObject current=null] : iv_ruleVehicleType= ruleVehicleType EOF ;
    public final EObject entryRuleVehicleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicleType = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:223:2: (iv_ruleVehicleType= ruleVehicleType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:224:2: iv_ruleVehicleType= ruleVehicleType EOF
            {
             newCompositeNode(grammarAccess.getVehicleTypeRule()); 
            pushFollow(FOLLOW_ruleVehicleType_in_entryRuleVehicleType389);
            iv_ruleVehicleType=ruleVehicleType();

            state._fsp--;

             current =iv_ruleVehicleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVehicleType399); 

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
    // $ANTLR end "entryRuleVehicleType"


    // $ANTLR start "ruleVehicleType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:231:1: ruleVehicleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has components' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' ) ;
    public final EObject ruleVehicleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:234:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has components' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:235:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has components' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:235:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has components' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:235:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has components' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}'
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:235:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:236:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:236:1: (lv_name_0_0= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:237:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVehicleType441); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVehicleTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVehicleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleVehicleType458); 

                	newLeafNode(otherlv_1, grammarAccess.getVehicleTypeAccess().getHasComponentsKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVehicleType470); 

                	newLeafNode(otherlv_2, grammarAccess.getVehicleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:261:1: ( (otherlv_3= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:262:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:262:1: (otherlv_3= RULE_ID )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:263:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVehicleTypeRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVehicleType490); 

            	    		newLeafNode(otherlv_3, grammarAccess.getVehicleTypeAccess().getComponentsComponentCrossReference_3_0()); 
            	    	

            	    }


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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleVehicleType503); 

                	newLeafNode(otherlv_4, grammarAccess.getVehicleTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVehicleType"


    // $ANTLR start "entryRuleBussystem"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:286:1: entryRuleBussystem returns [EObject current=null] : iv_ruleBussystem= ruleBussystem EOF ;
    public final EObject entryRuleBussystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBussystem = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:287:2: (iv_ruleBussystem= ruleBussystem EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:288:2: iv_ruleBussystem= ruleBussystem EOF
            {
             newCompositeNode(grammarAccess.getBussystemRule()); 
            pushFollow(FOLLOW_ruleBussystem_in_entryRuleBussystem539);
            iv_ruleBussystem=ruleBussystem();

            state._fsp--;

             current =iv_ruleBussystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBussystem549); 

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
    // $ANTLR end "entryRuleBussystem"


    // $ANTLR start "ruleBussystem"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:295:1: ruleBussystem returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBussystem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:298:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:299:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:299:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:300:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:300:1: (lv_name_0_0= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:301:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBussystem590); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBussystemAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBussystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBussystem"


    // $ANTLR start "entryRuleComponent"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:325:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:326:2: (iv_ruleComponent= ruleComponent EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:327:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent630);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent640); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:334:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:337:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )? ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:338:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )? )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:338:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )? )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:338:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )?
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:338:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:339:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:339:1: (lv_name_0_0= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:340:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent682); 

            			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:356:2: (otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:356:4: otherlv_1= 'sends messages' otherlv_2= '{' ( (lv_messages_3_0= ruleMessageInstance ) )+ otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleComponent700); 

                        	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getSendsMessagesKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleComponent712); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:364:1: ( (lv_messages_3_0= ruleMessageInstance ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:365:1: (lv_messages_3_0= ruleMessageInstance )
                    	    {
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:365:1: (lv_messages_3_0= ruleMessageInstance )
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:366:3: lv_messages_3_0= ruleMessageInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getMessagesMessageInstanceParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessageInstance_in_ruleComponent733);
                    	    lv_messages_3_0=ruleMessageInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"messages",
                    	            		lv_messages_3_0, 
                    	            		"MessageInstance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleComponent746); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleMessageType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:394:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:395:2: (iv_ruleMessageType= ruleMessageType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:396:2: iv_ruleMessageType= ruleMessageType EOF
            {
             newCompositeNode(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_ruleMessageType_in_entryRuleMessageType784);
            iv_ruleMessageType=ruleMessageType();

            state._fsp--;

             current =iv_ruleMessageType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageType794); 

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
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:403:1: ruleMessageType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has fields' otherlv_2= '{' ( (lv_fields_3_0= ruleMessageFieldType ) )+ otherlv_4= '}' ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:406:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has fields' otherlv_2= '{' ( (lv_fields_3_0= ruleMessageFieldType ) )+ otherlv_4= '}' ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:407:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has fields' otherlv_2= '{' ( (lv_fields_3_0= ruleMessageFieldType ) )+ otherlv_4= '}' )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:407:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has fields' otherlv_2= '{' ( (lv_fields_3_0= ruleMessageFieldType ) )+ otherlv_4= '}' )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:407:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'has fields' otherlv_2= '{' ( (lv_fields_3_0= ruleMessageFieldType ) )+ otherlv_4= '}'
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:407:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:408:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:408:1: (lv_name_0_0= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:409:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageType836); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMessageTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMessageType853); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageTypeAccess().getHasFieldsKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMessageType865); 

                	newLeafNode(otherlv_2, grammarAccess.getMessageTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:433:1: ( (lv_fields_3_0= ruleMessageFieldType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:434:1: (lv_fields_3_0= ruleMessageFieldType )
            	    {
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:434:1: (lv_fields_3_0= ruleMessageFieldType )
            	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:435:3: lv_fields_3_0= ruleMessageFieldType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageFieldType_in_ruleMessageType886);
            	    lv_fields_3_0=ruleMessageFieldType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"MessageFieldType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMessageType899); 

                	newLeafNode(otherlv_4, grammarAccess.getMessageTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleMessageInstance"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:463:1: entryRuleMessageInstance returns [EObject current=null] : iv_ruleMessageInstance= ruleMessageInstance EOF ;
    public final EObject entryRuleMessageInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInstance = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:464:2: (iv_ruleMessageInstance= ruleMessageInstance EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:465:2: iv_ruleMessageInstance= ruleMessageInstance EOF
            {
             newCompositeNode(grammarAccess.getMessageInstanceRule()); 
            pushFollow(FOLLOW_ruleMessageInstance_in_entryRuleMessageInstance935);
            iv_ruleMessageInstance=ruleMessageInstance();

            state._fsp--;

             current =iv_ruleMessageInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageInstance945); 

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
    // $ANTLR end "entryRuleMessageInstance"


    // $ANTLR start "ruleMessageInstance"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:472:1: ruleMessageInstance returns [EObject current=null] : (otherlv_0= 'of type' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )? otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) ) ) ;
    public final EObject ruleMessageInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_params_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:475:28: ( (otherlv_0= 'of type' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )? otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:476:1: (otherlv_0= 'of type' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )? otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) ) )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:476:1: (otherlv_0= 'of type' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )? otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:476:3: otherlv_0= 'of type' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )? otherlv_5= 'over' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleMessageInstance982); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInstanceAccess().getOfTypeKeyword_0());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:480:1: ( (otherlv_1= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:481:1: (otherlv_1= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:481:1: (otherlv_1= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:482:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageInstanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageInstance1002); 

            		newLeafNode(otherlv_1, grammarAccess.getMessageInstanceAccess().getMessageMessageTypeCrossReference_1_0()); 
            	

            }


            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:493:2: (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:493:4: otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMessageInstance1015); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageInstanceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:497:1: ( (lv_params_3_0= RULE_STRING ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:498:1: (lv_params_3_0= RULE_STRING )
                    	    {
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:498:1: (lv_params_3_0= RULE_STRING )
                    	    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:499:3: lv_params_3_0= RULE_STRING
                    	    {
                    	    lv_params_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMessageInstance1032); 

                    	    			newLeafNode(lv_params_3_0, grammarAccess.getMessageInstanceAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMessageInstanceRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_3_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMessageInstance1050); 

                        	newLeafNode(otherlv_4, grammarAccess.getMessageInstanceAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMessageInstance1064); 

                	newLeafNode(otherlv_5, grammarAccess.getMessageInstanceAccess().getOverKeyword_3());
                
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:523:1: ( (otherlv_6= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:524:1: (otherlv_6= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:524:1: (otherlv_6= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:525:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageInstanceRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageInstance1084); 

            		newLeafNode(otherlv_6, grammarAccess.getMessageInstanceAccess().getBusBussystemCrossReference_4_0()); 
            	

            }


            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:536:2: (otherlv_7= 'as broadcast' | (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:536:4: otherlv_7= 'as broadcast'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleMessageInstance1097); 

                        	newLeafNode(otherlv_7, grammarAccess.getMessageInstanceAccess().getAsBroadcastKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:541:6: (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:541:6: (otherlv_8= 'to' ( (otherlv_9= RULE_ID ) ) )
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:541:8: otherlv_8= 'to' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleMessageInstance1116); 

                        	newLeafNode(otherlv_8, grammarAccess.getMessageInstanceAccess().getToKeyword_5_1_0());
                        
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:545:1: ( (otherlv_9= RULE_ID ) )
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:546:1: (otherlv_9= RULE_ID )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:546:1: (otherlv_9= RULE_ID )
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:547:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageInstanceRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageInstance1136); 

                    		newLeafNode(otherlv_9, grammarAccess.getMessageInstanceAccess().getTargetComponentCrossReference_5_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageInstance"


    // $ANTLR start "entryRuleMessageFieldType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:566:1: entryRuleMessageFieldType returns [EObject current=null] : iv_ruleMessageFieldType= ruleMessageFieldType EOF ;
    public final EObject entryRuleMessageFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageFieldType = null;


        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:567:2: (iv_ruleMessageFieldType= ruleMessageFieldType EOF )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:568:2: iv_ruleMessageFieldType= ruleMessageFieldType EOF
            {
             newCompositeNode(grammarAccess.getMessageFieldTypeRule()); 
            pushFollow(FOLLOW_ruleMessageFieldType_in_entryRuleMessageFieldType1174);
            iv_ruleMessageFieldType=ruleMessageFieldType();

            state._fsp--;

             current =iv_ruleMessageFieldType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageFieldType1184); 

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
    // $ANTLR end "entryRuleMessageFieldType"


    // $ANTLR start "ruleMessageFieldType"
    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:575:1: ruleMessageFieldType returns [EObject current=null] : ( (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_isRequired_4_0= 'is required' ) )? ) ;
    public final EObject ruleMessageFieldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_isRequired_4_0=null;

         enterRule(); 
            
        try {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:578:28: ( ( (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_isRequired_4_0= 'is required' ) )? ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:579:1: ( (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_isRequired_4_0= 'is required' ) )? )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:579:1: ( (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_isRequired_4_0= 'is required' ) )? )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:579:2: (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_isRequired_4_0= 'is required' ) )?
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:579:2: (otherlv_0= 'int' | otherlv_1= 'char' | otherlv_2= 'char[]' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:579:4: otherlv_0= 'int'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMessageFieldType1222); 

                        	newLeafNode(otherlv_0, grammarAccess.getMessageFieldTypeAccess().getIntKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:584:7: otherlv_1= 'char'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMessageFieldType1240); 

                        	newLeafNode(otherlv_1, grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:589:7: otherlv_2= 'char[]'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleMessageFieldType1258); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_2());
                        

                    }
                    break;

            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:593:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:594:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:594:1: (lv_name_3_0= RULE_ID )
            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:595:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageFieldType1276); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMessageFieldTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageFieldTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:611:2: ( (lv_isRequired_4_0= 'is required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:612:1: (lv_isRequired_4_0= 'is required' )
                    {
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:612:1: (lv_isRequired_4_0= 'is required' )
                    // ../de.schakko.xtext.AutomotiveBusDsl/src-gen/de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.g:613:3: lv_isRequired_4_0= 'is required'
                    {
                    lv_isRequired_4_0=(Token)match(input,31,FOLLOW_31_in_ruleMessageFieldType1299); 

                            newLeafNode(lv_isRequired_4_0, grammarAccess.getMessageFieldTypeAccess().getIsRequiredIsRequiredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBussystem_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBussystem_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleModel191 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModel203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageType_in_ruleModel224 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModel237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModel249 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModel261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleModel282 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModel295 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModel307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModel319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVehicleType_in_ruleModel340 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModel353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVehicleType_in_entryRuleVehicleType389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVehicleType399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVehicleType441 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVehicleType458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVehicleType470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVehicleType490 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleVehicleType503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBussystem_in_entryRuleBussystem539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBussystem549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBussystem590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent682 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleComponent700 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleMessageInstance_in_ruleComponent733 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleComponent746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_entryRuleMessageType784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageType836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMessageType853 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageType865 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleMessageFieldType_in_ruleMessageType886 = new BitSet(new long[]{0x0000000070010000L});
    public static final BitSet FOLLOW_16_in_ruleMessageType899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInstance_in_entryRuleMessageInstance935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageInstance945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMessageInstance982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageInstance1002 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleMessageInstance1015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMessageInstance1032 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleMessageInstance1050 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMessageInstance1064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageInstance1084 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleMessageInstance1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMessageInstance1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageInstance1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldType_in_entryRuleMessageFieldType1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageFieldType1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMessageFieldType1222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleMessageFieldType1240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30_in_ruleMessageFieldType1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageFieldType1276 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleMessageFieldType1299 = new BitSet(new long[]{0x0000000000000002L});

}