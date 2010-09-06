package hxeclipse.core;


import hxeclipse.core.model.HaxeProjectDescription;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.osgi.service.prefs.Preferences;

public interface IHaxeProject {

	public IProject getProject();

	public HaxeProjectDescription getProjectDescription();

	public void save(Preferences projectPreferences);
	
	public IPath getSourceFolderRelativePath(IResource resource);
}