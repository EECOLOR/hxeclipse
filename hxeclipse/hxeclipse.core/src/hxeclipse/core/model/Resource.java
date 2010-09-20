package hxeclipse.core.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.osgi.service.prefs.Preferences;

public class Resource {
	private IFile _file;
	private String _name;
	
	public Resource(Preferences preferences) {
		load(preferences);
	}

	public Resource(IFile file) {
		_file = file;
	}
	
	public void save(Preferences preferences) {
		if (_file != null) preferences.put("file", _file.getFullPath().toString());
		if (_name != null) preferences.put("name", _name);
	}
	
	public void load(Preferences preferences) {
		String file = preferences.get("file", null);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		if (file != null) _file = root.getFile(new Path(file));
		
		_name = preferences.get("name", null);
	}
	
	public void setFile(IFile file) {
		_file = file;
	}
	
	public IFile getFile() {
		return _file;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	@Override
	public String toString() {
		return _file.getName() + (_name == null ? "" : "@" + _name);
	}
}
