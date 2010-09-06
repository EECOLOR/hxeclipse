package hxeclipse.core.internal;

import hxeclipse.core.IHaxePreferences;

import org.eclipse.jface.preference.IPreferenceStore;

public class HaxePreferences implements IHaxePreferences {
	
	private IPreferenceStore _preferenceStore;
	
	public HaxePreferences(IPreferenceStore preferenceStore)
	{
		_preferenceStore = preferenceStore;
	}
	
	@Override
	public String getHaxePath() {
		String haxePath = _preferenceStore.getString(PreferenceConstants.HAXE_PATH);
		
		if (haxePath == null) {
			//TODO make sure an error is displayed as long as this thing is not filled
		}
		
		return haxePath;
	}
}
