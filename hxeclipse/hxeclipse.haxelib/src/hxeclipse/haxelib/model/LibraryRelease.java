package hxeclipse.haxelib.model;

import java.util.Date;

public class LibraryRelease {
	
	private Date _date;
	private String _version;
	private String _description;
	private boolean _isInstalled; 
	private boolean _isCurrent;
	private Library _haxeLibrary; 
	
	public LibraryRelease(Library haxeLibrary) {
		_haxeLibrary = haxeLibrary;
	}
	
	/**
	 * Overridden in order to make sure libraries from the same HaxeLibrary with the same version 
	 * are considered equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LibraryRelease) {
			LibraryRelease haxeLibraryRelease = (LibraryRelease) obj;
			return getVersion().equals(haxeLibraryRelease.getVersion()) && 
				   getLibrary().equals(haxeLibraryRelease.getLibrary());
		} else
		{
			return false;
		}
	}	
	
	public void setDate(Date date) {
		_date = date;
	}
	
	public Date getDate() {
		return _date;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public String getVersion() {
		return _version;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDescription() {
		return _description;
	}

	public void setInstalled(boolean isInstalled) {
		_isInstalled = isInstalled;
	}

	public boolean isInstalled() {
		return _isInstalled;
	}

	public void setCurrent(boolean isCurrent) {
		_isCurrent = isCurrent;
	}

	public boolean isCurrent() {
		return _isCurrent;
	}

	public Library getLibrary() {
		return _haxeLibrary;
	}
	
	
}
