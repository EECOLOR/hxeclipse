package hxeclipse.core;

import hxeclipse.core.preferences.HaxePreferencePage;

public class HaxePreferences {
	static public String getHaxePath() {
		String haxePath = Activator.getDefault().getPreferenceStore().getString(HaxePreferencePage.HAXE_PATH);
		
		if (haxePath == null) {
			//TODO make sure an error is displayed as long as this thing is not filled
		}
		
		return haxePath;
	}
}
