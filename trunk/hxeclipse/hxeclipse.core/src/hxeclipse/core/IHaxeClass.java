package hxeclipse.core;

import hxeclipse.core.internal.HaxeProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

public interface IHaxeClass {
	public IFile getFile();
	public String getClassPath();
	public IPath getSourceFolderRelativePath();
	public void setHaxeProject(HaxeProject haxeProject);
	public HaxeProject getHaxeProject();
}
