package hxeclipse.core.model;

import java.io.File;

public class Resource {
	private File _file;
	private String _name;
	
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
