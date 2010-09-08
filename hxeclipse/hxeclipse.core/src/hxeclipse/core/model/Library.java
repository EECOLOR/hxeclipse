package hxeclipse.core.model;

import org.osgi.service.prefs.Preferences;

import hxeclipse.core.extensions.IHaxeLibrary;

public class Library implements IHaxeLibrary {
	private String _name;
	private String _version;
	
	public Library(Preferences preferences)
	{
		load(preferences);
	}
	
	public Library(String name) {
		this(name, null);
	}
	
	@Override
	public void save(Preferences preferences) {
		if (_name != null) preferences.put("name", _name);
		if (_version != null) preferences.put("version", _version);
	}
	
	public void load(Preferences preferences) {
		_name = preferences.get("name", null);
		_version = preferences.get("version", null);
	}

	public Library(String name, String version) {
		_name = name;
		_version = version;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	@Override
	public String getName() {
		return _name;
	}

	public void setVersion(String version) {
		_version = version;
	}

	@Override
	public String getVersion() {
		return _version;
	}
}
