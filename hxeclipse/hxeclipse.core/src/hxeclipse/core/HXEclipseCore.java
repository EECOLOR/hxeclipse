package hxeclipse.core;

import hxeclipse.core.ui.ISharedImages;
import hxeclipse.core.ui.SharedImages;

public class HXEclipseCore {
	private static HaxePreferences _haxePreferences;
	private static SharedImages _sharedImages;
	
	static public HaxePreferences getHaxePreferences() {
		if (_haxePreferences == null) {
			_haxePreferences = new HaxePreferences();
		}
		
		return _haxePreferences;
	}
	
	static public ISharedImages getSharedImages() {
		if (_sharedImages == null) {
			_sharedImages = new SharedImages();
		}
		
		return _sharedImages;
	}
}
