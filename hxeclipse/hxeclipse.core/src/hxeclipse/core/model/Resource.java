package hxeclipse.core.model;

import java.io.File;

import org.osgi.service.prefs.Preferences;

public class Resource {
	private File _file;
	private String _name;
	
	public void save(Preferences preferences) {
		if (_file != null) preferences.put("file", _file.getAbsolutePath());
		if (_name != null) preferences.put("name", _name);
	}
	
	public Resource(File file) {
		_file = file;
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
