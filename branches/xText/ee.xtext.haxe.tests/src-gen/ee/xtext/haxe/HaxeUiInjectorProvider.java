/*
* generated by Xtext
*/
package ee.xtext.haxe;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HaxeUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return ee.xtext.haxe.ui.internal.HaxeActivator.getInstance().getInjector("ee.xtext.haxe.Haxe");
	}
	
}
