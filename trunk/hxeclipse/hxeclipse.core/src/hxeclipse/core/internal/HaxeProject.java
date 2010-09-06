package hxeclipse.core.internal;

import java.util.Iterator;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.ITargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class HaxeProject implements IHaxeProject {
	
	private IProject _project;
	private HaxeProjectDescription _projectDescription;
	
	public HaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		initialize(project, haxeProjectDescription);
	}
	
	public HaxeProject(IProject project, IFile file) throws CoreException {
		//TODO load all project information from the file
		HaxeProjectDescription haxeProjectDescription = new HaxeProjectDescription();
		initialize(project, haxeProjectDescription);
	}
	
	protected void initialize(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		_project = project;
		_projectDescription = haxeProjectDescription;
		
		_addNature();
	}
	
	public void save() {
		//TODO save to file
	}
	
	private void _addNature() throws CoreException {
		HXEclipse.addHaxeNature(_project);
	}
	
	public void setProject(IProject project) {
		_project = project;
	}

	@Override
	public IProject getProject() {
		return _project;
	}

	@Override
	public void setProjectDescription(HaxeProjectDescription projectDescription) {
		_projectDescription = projectDescription;
	}

	@Override
	public HaxeProjectDescription getProjectDescription() {
		return _projectDescription;
	}

	@Override
	public IPath getSourceFolderRelativePath(IResource resource) {
		Iterator<ITargetDescription> targets = _projectDescription.getTargets().iterator();
		
		while (targets.hasNext()) {
			ITargetDescription target = targets.next();
			IPath sourceFolderRelativePath = target.getSourceFolderRelativePath(resource);
			
			if (sourceFolderRelativePath != null) {
				return sourceFolderRelativePath;
			}
		}
		
		return null;
	}
}
