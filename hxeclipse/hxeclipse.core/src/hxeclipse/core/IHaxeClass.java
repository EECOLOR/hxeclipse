package hxeclipse.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

public interface IHaxeClass {
	public IFile getFile();
	public String getClassPath();
	public IPath getSourceFolderRelativePath();
}
