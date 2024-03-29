/*
 * generated by Xtext
 */
package de.schakko.xtext.generator

import de.schakko.xtext.automotiveBusDsl.Component
import de.schakko.xtext.automotiveBusDsl.MessageFieldType
import de.schakko.xtext.automotiveBusDsl.MessageInstance
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AutomotiveBusDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile("target.txt", resource.createContent)
	}
	
	def createContent(Resource resource) {
		'''
		«FOR msg : resource.allContents.filter(typeof(MessageInstance)).toIterable»
		«(msg.eContainer as Component).name»[«msg.bus.name»] -> «msg.toPacket» -> «IF msg.target != null»«msg.target.name»«ELSE»*«ENDIF»
		«ENDFOR»
		'''
	}	
	
	def toPacket(MessageInstance msg) {
		val maxIndex = msg.message.fields.size - 1
		
		'''«msg.message.name»(«FOR i:0..maxIndex»«msg.message.fields.get(i).fieldToPacket(i, msg)» «ENDFOR»)'''
	}
	
	def fieldToPacket(MessageFieldType field, int idx, MessageInstance instance) {
		var relativeRequiredIndex = instance.message.fields.filter([ it.isRequired ]).toList.indexOf(field)
		
		var value = "null"
		
		if (relativeRequiredIndex >= 0) {
			value = instance.params.get(relativeRequiredIndex)
		}
		
		'''«field.name»:"«value»"'''
	}
}
