package hxeclipse.core.model;

import java.io.File;

import org.osgi.service.prefs.Preferences;

public class Resource {
	private File _file;
	private String _name;
	
	public Resource(Preferences preferences) {
		load(preferences);
	}

	public Resource(File file) {
		_file = file;
	}
	
	public void save(Preferences preferences) {
		if (_file != null) preferences.put("file", _file.getAbsolutePath());
		if (_name != null) preferences.put("name", _name);
	}
	
	public void load(Preferences preferences) {
		String file = preferences.get("file", null);
		if (file != null) {
			_file = new File(file);
		}
		_name = preferences.get("name", null);
	}
	
	public void setFile(File file) {
		_file = file;
	}
	
	public File getFile() {
		return _file;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}
}
