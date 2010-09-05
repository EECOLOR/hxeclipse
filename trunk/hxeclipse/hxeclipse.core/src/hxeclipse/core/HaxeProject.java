package hxeclipse.core;

import hxeclipse.core.model.ProjectDescription;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class HaxeProject {
	private IProject _project;
	private ProjectDescription _projectDescription;
	
	public HaxeProject(IProject project) throws CoreException {
		_project = project;
		
		HXEclipse.addHaxeNature(project);
	}
	
	public void setProject(IProject project) {
		_project = project;
	}

	public IProject getProject() {
		return _project;
	}

	public void setProjectDescription(ProjectDescription projectDescription) {
		_projectDescription = projectDescription;
	}

	public ProjectDescription getProjectDescription() {
		return _projectDescription;
	}
}
