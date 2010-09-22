package hxeclipse.core.model;

import org.osgi.service.prefs.Preferences;

public class Mapping {
	private String _sourcePackage;
	private String _targetPackage;
	
	public Mapping(Preferences preferences) {
		load(preferences);
	}

	public Mapping(String sourcePackage, String targetPackage) {
		_sourcePackage = sourcePackage;
		_targetPackage = targetPackage;
	}
	
	public void save(Preferences preferences) {
		if (_sourcePackage != null) preferences.put("sourcePackage", _sourcePackage);
		if (_targetPackage != null) preferences.put("targetPackage", _targetPackage);
	}	
	
	public void load(Preferences preferences) {
		_sourcePackage = preferences.get("sourcePackage", null);
		_targetPackage = preferences.get("targetPackage", null);
	}
	
	public void setSourcePackage(String sourcePackage) {
		_sourcePackage = sourcePackage;
	}
	
	public String getSourcePackage() {
		return _sourcePackage;
	}

	public void setTargetPackage(String targetPackage) {
		_targetPackage = targetPackage;
	}

	public String getTargetPackage() {
		return _targetPackage;
	}
	
	public String toString() {
		return _sourcePackage + " > " + _targetPackage;
	}
}
