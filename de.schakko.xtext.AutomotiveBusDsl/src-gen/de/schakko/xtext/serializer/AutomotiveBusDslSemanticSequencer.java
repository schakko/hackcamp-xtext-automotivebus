package de.schakko.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.schakko.xtext.automotiveBusDsl.AutomotiveBusDslPackage;
import de.schakko.xtext.automotiveBusDsl.Bussystem;
import de.schakko.xtext.automotiveBusDsl.Component;
import de.schakko.xtext.automotiveBusDsl.MessageFieldType;
import de.schakko.xtext.automotiveBusDsl.MessageInstance;
import de.schakko.xtext.automotiveBusDsl.MessageType;
import de.schakko.xtext.automotiveBusDsl.Model;
import de.schakko.xtext.automotiveBusDsl.VehicleType;
import de.schakko.xtext.services.AutomotiveBusDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AutomotiveBusDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AutomotiveBusDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AutomotiveBusDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AutomotiveBusDslPackage.BUSSYSTEM:
				if(context == grammarAccess.getBussystemRule()) {
					sequence_Bussystem(context, (Bussystem) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.MESSAGE_FIELD_TYPE:
				if(context == grammarAccess.getMessageFieldTypeRule()) {
					sequence_MessageFieldType(context, (MessageFieldType) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.MESSAGE_INSTANCE:
				if(context == grammarAccess.getMessageInstanceRule()) {
					sequence_MessageInstance(context, (MessageInstance) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.MESSAGE_TYPE:
				if(context == grammarAccess.getMessageTypeRule()) {
					sequence_MessageType(context, (MessageType) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AutomotiveBusDslPackage.VEHICLE_TYPE:
				if(context == grammarAccess.getVehicleTypeRule()) {
					sequence_VehicleType(context, (VehicleType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Bussystem(EObject context, Bussystem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AutomotiveBusDslPackage.Literals.BUSSYSTEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomotiveBusDslPackage.Literals.BUSSYSTEM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBussystemAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID messages+=MessageInstance*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isRequired?='is required'?)
	 */
	protected void sequence_MessageFieldType(EObject context, MessageFieldType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (message=[MessageType|ID] params+=STRING* bus=[Bussystem|ID] target=[Component|ID]?)
	 */
	protected void sequence_MessageInstance(EObject context, MessageInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=MessageFieldType+)
	 */
	protected void sequence_MessageType(EObject context, MessageType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (busses+=Bussystem busses+=Bussystem+ messages+=MessageType+ components+=Component+ vehicles+=VehicleType+)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=[Component|ID]+)
	 */
	protected void sequence_VehicleType(EObject context, VehicleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
