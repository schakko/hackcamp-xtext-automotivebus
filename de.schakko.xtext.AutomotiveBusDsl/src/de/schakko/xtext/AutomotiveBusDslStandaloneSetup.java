/*
* generated by Xtext
*/
package de.schakko.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AutomotiveBusDslStandaloneSetup extends AutomotiveBusDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AutomotiveBusDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

