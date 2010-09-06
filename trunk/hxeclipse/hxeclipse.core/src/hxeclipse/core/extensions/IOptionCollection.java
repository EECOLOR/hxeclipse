package hxeclipse.core.extensions;

import org.osgi.service.prefs.Preferences;

public interface IOptionCollection {
	public String getName();
	public IOptionCollection copy();
	public void save(Preferences preferences);
}
