package hxeclipse.core.extensions;

import org.osgi.service.prefs.Preferences;

public interface IHaxeLibrary {

	public String getName();

	public String getVersion();

	public void save(Preferences preferences);

}