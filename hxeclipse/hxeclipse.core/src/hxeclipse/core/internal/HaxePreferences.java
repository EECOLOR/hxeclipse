package hxeclipse.core.internal;

import hxeclipse.core.IHaxePreferences;
import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.exceptions.NekoPathNotFoundException;

import org.eclipse.jface.preference.IPreferenceStore;

public class HaxePreferences implements IHaxePreferences {
	
	private IPreferenceStore _preferenceStore;
	
	public HaxePreferences(IPreferenceStore preferenceStore)
	{
		_preferenceStore = preferenceStore;
	}
	
	@Override
	public String getHaxePath() throws HaxePathNotFoundException {
		String haxePath = _preferenceStore.getString(HaxePreferenceConstants.HAXE_PATH);
		
		if (haxePath == null || haxePath.length() == 0) {
			throw new HaxePathNotFoundException("No Haxe path has been set in the preferences");
		}
		
		return haxePath;
	}
	
	@Override
	public String getNekoPath() throws NekoPathNotFoundException {
		String nekoPath = _preferenceStore.getString(HaxePreferenceConstants.NEKO_PATH);
		
		if (nekoPath == null || nekoPath.length() == 0) {
			throw new NekoPathNotFoundException("No Neko path has been set in the preferences");
		}
		
		return nekoPath;
	}
}
