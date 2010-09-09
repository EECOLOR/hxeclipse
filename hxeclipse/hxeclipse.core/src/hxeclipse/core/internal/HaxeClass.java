package hxeclipse.core.internal;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.IHaxeProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

public class HaxeClass implements IHaxeClass {
	private IFile _file;
	private HaxeProject _haxeProject;
	
	public HaxeClass(IFile file) {
		_file = file;
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
		return _file;
	}

	@Override
	public IPath getSourceFolderRelativePath() {
		IHaxeProject haxeProject = (IHaxeProject) _file.getProject().getAdapter(IHaxeProject.class);
		
		return haxeProject.getSourceFolderRelativePath(_file);
	}
}
