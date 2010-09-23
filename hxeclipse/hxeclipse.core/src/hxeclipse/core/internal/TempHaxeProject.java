package hxeclipse.core.internal;

import hxeclipse.core.model.HaxeProjectDescription;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class TempHaxeProject extends AbstractHaxeProject {

	public TempHaxeProject(IProject project, HaxeProjectDescription projectDescription) throws CoreException {
		super(project, projectDescription);
	}

	@Override
	public void save() {
		throw new RuntimeException("Can not save a temporary Haxe project");
	}
}
