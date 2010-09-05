package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxePreferences;
import hxeclipse.core.preferences.HaxePreferencePage;

public class HaxePreferences implements IHaxePreferences {
	@Override
	public String getHaxePath() {
		String haxePath = HXEclipse.getDefault().getPreferenceStore().getString(HaxePreferencePage.HAXE_PATH);
		
		if (haxePath == null) {
			//TODO make sure an error is displayed as long as this thing is not filled
		}
		
		return haxePath;
	}
}
