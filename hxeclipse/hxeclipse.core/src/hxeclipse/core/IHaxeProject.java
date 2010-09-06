package hxeclipse.core;

import hxeclipse.core.model.HaxeProjectDescription;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

public interface IHaxeProject {

	public IProject getProject();

	public void setProjectDescription(HaxeProjectDescription projectDescription);

	public HaxeProjectDescription getProjectDescription();

	public void save();
	
	public IPath getSourceFolderRelativePath(IResource resource);
}