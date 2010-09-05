package hxeclipse.core;

import org.eclipse.core.resources.IFile;

public interface IHaxeClass {
	public IFile getFile();
	
	public String getClassPath();
}
