/*
* generated by Xtext
*/
package de.schakko.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AutomotiveBusDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/schakko/xtext/parser/antlr/internal/InternalAutomotiveBusDsl.tokens");
	}
}