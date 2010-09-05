package hxeclipse.core.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

import hxeclipse.core.IHaxeClass;

public class HaxeClass implements IHaxeClass {
	private IFile _file;
	
	public HaxeClass(IFile file) {
		_file = file;
	}
	
	@Override
	public String getClassPath() {
		IPath projectRelativePath = _file.getProjectRelativePath();
		String path = projectRelativePath.toString();
		
		path = path.replaceFirst("\\.hx", "");
		path = path.replaceAll("/", ".");
		
		return null;
	}	
	
	@Override
	public IFile getFile() {
		return _file;
	}
}
