package hxeclipse.core.internal;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

abstract public class AbstractHaxeProject implements IHaxeProject {
	
	private IProject _project;
	private HaxeProjectDescription _projectDescription;

	/**
	 * If you use this constructor, you need to call initialize yourself
	 */
	protected AbstractHaxeProject() throws CoreException {
	}
	
	public AbstractHaxeProject(IProject project, HaxeProjectDescription projectDescription) throws CoreException {
		initialize(project, projectDescription);
	}

	protected void initialize(IProject project, HaxeProjectDescription projectDescription) throws CoreException {
		_project = project;
		_projectDescription = projectDescription;
	}
	
	@Override
	public IProject getProject() {
		return _project;
	}

	@Override
	public HaxeProjectDescription getProjectDescription() {
		return _projectDescription;
	}	
	
	@Override
	public IPath getSourceFolderRelativePath(IResource resource) {
		Iterator<IHaxeTargetDescription> targetDescriptions = _projectDescription.getTargetDescriptions().iterator();
		
		while (targetDescriptions.hasNext()) {
			IHaxeTargetDescription target = targetDescriptions.next();
			IPath sourceFolderRelativePath = target.getSourceFolderRelativePath(resource);
			
			if (sourceFolderRelativePath != null) {
				return sourceFolderRelativePath;
			}
		}
		
		return null;
	}

	@Override
	public List<IFolder> getSourceFolders() {
		List<IFolder> sourceFolders = new ArrayList<IFolder>(1);
		
		Iterator<IHaxeTargetDescription> targetDescriptions = _projectDescription.getTargetDescriptions().iterator();
		
		while (targetDescriptions.hasNext()) {
			IHaxeTargetDescription target = targetDescriptions.next();
			List<IFolder> targetSourceFolders = target.getSourceFolders();
			
			if (targetSourceFolders != null) {
				sourceFolders.addAll(targetSourceFolders);
			}
		}
		
		return sourceFolders;
	}

	@Override
	public IFolder getOutputFolder() throws CoreException {
		Iterator<IHaxeTargetDescription> targetDescriptions = _projectDescription.getTargetDescriptions().iterator();
		
		while (targetDescriptions.hasNext()) {
			IHaxeTargetDescription target = targetDescriptions.next();
			IFolder outputFolder = target.getOutputFolder();
			
			if (outputFolder != null) {
				return outputFolder;
			}
		}
		
		return null;
	}
}
