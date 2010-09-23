package hxeclipse.core;


import hxeclipse.core.model.HaxeProjectDescription;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public interface IHaxeProject {

	public IProject getProject();

	public HaxeProjectDescription getProjectDescription();

	public void save();
	
	public List<IFolder> getSourceFolders();
	public IPath getSourceFolderRelativePath(IResource resource);
	public IFolder getOutputFolder() throws CoreException;
}