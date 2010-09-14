package hxeclipse.core.internal;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

public class TempHaxeProject implements IHaxeProject {

	private IProject _project;
	private HaxeProjectDescription _projectDescription;

	public TempHaxeProject(IProject project, HaxeProjectDescription projectDescription) {
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
	public void save() {
		throw new RuntimeException("Can not save a temporary Haxe project");
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

}
