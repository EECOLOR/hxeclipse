package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeClass;
import hxeclipse.core.IHaxeProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class HaxeClass implements IHaxeClass {
	private IFile _file;
	
	public HaxeClass(IFile file) {
		_file = file;
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
		IHaxeProject haxeProject;
		try {
			haxeProject = HXEclipse.getHaxeProject(_file.getProject(), null);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		
		return haxeProject.getSourceFolderRelativePath(_file);
	}
}
