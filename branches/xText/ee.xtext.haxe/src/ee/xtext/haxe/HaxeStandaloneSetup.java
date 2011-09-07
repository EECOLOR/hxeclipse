
package ee.xtext.haxe;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HaxeStandaloneSetup extends HaxeStandaloneSetupGenerated{

	public static void doSetup() {
		new HaxeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

