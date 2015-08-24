/*
 * generated by Xtext
 */
package at.bestsolution.dart.service.spec.serializer;

import at.bestsolution.dart.service.spec.dartServiceSpec.Attribute;
import at.bestsolution.dart.service.spec.dartServiceSpec.DartServiceSpecPackage;
import at.bestsolution.dart.service.spec.dartServiceSpec.DomainElement;
import at.bestsolution.dart.service.spec.dartServiceSpec.EnumVal;
import at.bestsolution.dart.service.spec.dartServiceSpec.GenericTypeArgument;
import at.bestsolution.dart.service.spec.dartServiceSpec.Notification;
import at.bestsolution.dart.service.spec.dartServiceSpec.Request;
import at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDef;
import at.bestsolution.dart.service.spec.dartServiceSpec.ServiceDefs;
import at.bestsolution.dart.service.spec.services.DartServiceSpecGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DartServiceSpecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DartServiceSpecGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DartServiceSpecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DartServiceSpecPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case DartServiceSpecPackage.DOMAIN_ELEMENT:
				sequence_DomainElement(context, (DomainElement) semanticObject); 
				return; 
			case DartServiceSpecPackage.ENUM_VAL:
				sequence_EnumVal(context, (EnumVal) semanticObject); 
				return; 
			case DartServiceSpecPackage.GENERIC_TYPE_ARGUMENT:
				sequence_GenericTypeArgument(context, (GenericTypeArgument) semanticObject); 
				return; 
			case DartServiceSpecPackage.NOTIFICATION:
				sequence_Notification(context, (Notification) semanticObject); 
				return; 
			case DartServiceSpecPackage.REQUEST:
				sequence_Request(context, (Request) semanticObject); 
				return; 
			case DartServiceSpecPackage.SERVICE_DEF:
				sequence_ServiceDef(context, (ServiceDef) semanticObject); 
				return; 
			case DartServiceSpecPackage.SERVICE_DEFS:
				sequence_ServiceDefs(context, (ServiceDefs) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (documentation+=DOC* optional?='optional'? type=GenericTypeArgument name=ID value=STRING?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc+=DOC* 
	 *         (
	 *             name=QualifiedName | 
	 *             (cust?='cust' name=QualifiedName superType=[DomainElement|QualifiedName]? attributes+=Attribute*) | 
	 *             (name=QualifiedName enumValues+=EnumVal*) | 
	 *             (name=QualifiedName realType=QualifiedName)
	 *         )
	 *     )
	 */
	protected void sequence_DomainElement(EObject context, DomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc+=DOC* name=ID)
	 */
	protected void sequence_EnumVal(EObject context, EnumVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[DomainElement|QualifiedName] (arguments+=GenericTypeArgument arguments+=GenericTypeArgument*)? list?='[]'?)
	 */
	protected void sequence_GenericTypeArgument(EObject context, GenericTypeArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation+=DOC* name=ID attributes+=Attribute*)
	 */
	protected void sequence_Notification(EObject context, Notification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation+=DOC* name=ID attributes+=Attribute* returnVals+=Attribute*)
	 */
	protected void sequence_Request(EObject context, Request semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation+=DOC* name=ID requests+=Request* notifications+=Notification*)
	 */
	protected void sequence_ServiceDef(EObject context, ServiceDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName domainElements+=DomainElement* serviceDefs+=ServiceDef+)
	 */
	protected void sequence_ServiceDefs(EObject context, ServiceDefs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}