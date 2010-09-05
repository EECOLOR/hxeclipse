package hxeclipse.core.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import hxeclipse.core.model.TargetDescription;

public class DefaultTargetDescription extends TargetDescription {
	
	public static DefaultTargetDescription newInstance(IProject project) {
		return new DefaultTargetDescription(project);
	}
	
	private DefaultTargetDescription(IProject project) {
		List<IFolder> sourcePaths = new ArrayList<IFolder>(1);
		sourcePaths.add(project.getFolder("src"));
		
		setSourcePaths(sourcePaths );
	}
}
