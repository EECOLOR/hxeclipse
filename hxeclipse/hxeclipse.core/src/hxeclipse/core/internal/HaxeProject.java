package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class HaxeProject implements IHaxeProject {
	
	private IProject _project;
	private HaxeProjectDescription _projectDescription;
	
	public HaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		initialize(project, haxeProjectDescription);
	}
	
	public HaxeProject(IProject project, Preferences projectPreferences) throws CoreException, BackingStoreException {
		HaxeProjectDescription haxeProjectDescription = new HaxeProjectDescription();
		haxeProjectDescription.load(projectPreferences.node("projectDescription"));
		initialize(project, haxeProjectDescription);
	}
	
	protected void initialize(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		_project = project;
		_projectDescription = haxeProjectDescription;
		
		HXEclipse.getProjectManager().addHaxeNature(project);
	}
	
	public void save(Preferences projectPreferences) {
		Preferences preferences = projectPreferences.node("projectDescription");
		_projectDescription.save(preferences);
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
		Iterator<IHaxeTargetDescription> targets = _projectDescription.getTargets().iterator();
		
		while (targets.hasNext()) {
			IHaxeTargetDescription target = targets.next();
			IPath sourceFolderRelativePath = target.getSourceFolderRelativePath(resource);
			
			if (sourceFolderRelativePath != null) {
				return sourceFolderRelativePath;
			}
		}
		
		return null;
	}
}
