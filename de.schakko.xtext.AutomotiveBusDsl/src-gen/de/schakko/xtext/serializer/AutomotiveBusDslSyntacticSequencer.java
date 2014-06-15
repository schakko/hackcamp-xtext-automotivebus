package de.schakko.xtext.serializer;

import com.google.inject.Inject;
import de.schakko.xtext.services.AutomotiveBusDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AutomotiveBusDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AutomotiveBusDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MessageFieldType_CharKeyword_0_1_or_CharKeyword_0_2_or_IntKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AutomotiveBusDslGrammarAccess) access;
		match_MessageFieldType_CharKeyword_0_1_or_CharKeyword_0_2_or_IntKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getMessageFieldTypeAccess().getCharKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getMessageFieldTypeAccess().getIntKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_MessageFieldType_CharKeyword_0_1_or_CharKeyword_0_2_or_IntKeyword_0_0.equals(syntax))
				emit_MessageFieldType_CharKeyword_0_1_or_CharKeyword_0_2_or_IntKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'int' | 'char' | 'char[]'
	 */
	protected void emit_MessageFieldType_CharKeyword_0_1_or_CharKeyword_0_2_or_IntKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
