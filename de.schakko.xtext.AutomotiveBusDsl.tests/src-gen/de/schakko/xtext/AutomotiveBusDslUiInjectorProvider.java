/*
* generated by Xtext
*/
package de.schakko.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AutomotiveBusDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.schakko.xtext.ui.internal.AutomotiveBusDslActivator.getInstance().getInjector("de.schakko.xtext.AutomotiveBusDsl");
	}
	
}