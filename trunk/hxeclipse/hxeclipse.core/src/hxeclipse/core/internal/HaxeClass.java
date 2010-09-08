package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeClass;
import hxeclipse.core.IHaxeProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class HaxeClass implements IHaxeClass {
	private IPath _path;
	private HaxeProject _haxeProject;
	
	public HaxeClass(IPath path) {
		_path = path;
	}
	
	@Override
	public HaxeProject getHaxeProject() {
		return _haxeProject;
	}
	
	@Override
	public void setHaxeProject(HaxeProject haxeProject) {
		_haxeProject = haxeProject;
	}
	
	@Override
	public String getClassPath() {
		
		IPath sourceFolderRelativePath = getSourceFolderRelativePath();
		String path = sourceFolderRelativePath.toString();
		
		path = path.replaceFirst("\\.hx", "");
		path = path.replaceAll("/", ".");
		
		return path;
	}	
	
	@Override
	public IFile getFile() {
		IProject project = _haxeProject.getProject();
		return project.getFile(_path);
	}

	@Override
	public IPath getSourceFolderRelativePath() {
		IHaxeProject haxeProject;
		try {
			haxeProject = HXEclipse.getProjectManager().getHaxeProject(_haxeProject.getProject());
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		
		return haxeProject.getSourceFolderRelativePath(getFile());
	}
}
