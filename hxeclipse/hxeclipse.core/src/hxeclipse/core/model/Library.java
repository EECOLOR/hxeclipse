package hxeclipse.core.model;

import hxeclipse.core.extensions.ILibrary;

public class Library implements ILibrary {
	private String _name;
	private String _version;
	
	public Library(String name) {
		this(name, null);
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