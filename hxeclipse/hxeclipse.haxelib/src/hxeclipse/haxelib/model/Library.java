package hxeclipse.haxelib.model;

import java.util.List;

public class Library {
	
	private String _name = "";
	private String _tags = "";
	private String _description = "";
	private String _website = "";
	private String _license = "";
	private String _owner = "";
	private String _version = "";
	private List<LibraryRelease> _releases;
	
	/**
	 * Overridden in order to make sure libraries with the same name are considered equal
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Library) && getName().equals(((Library) obj).getName());
	}	
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}

	public void setTags(String tags) {
		_tags = tags;
	}

	public String getTags() {
		return _tags;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDescription() {
		return _description;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getWebsite() {
		return _website;
	}

	public void setLicense(String license) {
		_license = license;
	}

	public String getLicense() {
		return _license;
	}

	public void setOwner(String owner) {
		_owner = owner;
	}

	public String getOwner() {
		return _owner;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public String getLatestVersion() {
		return _version;
	}

	public void setReleases(List<LibraryRelease> releases) {
		_releases = releases;
	}

	public List<LibraryRelease> getReleases() {
		return _releases;
	}
}
