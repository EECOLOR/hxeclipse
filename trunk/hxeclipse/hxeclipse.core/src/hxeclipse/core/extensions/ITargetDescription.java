package hxeclipse.core.extensions;


import hxeclipse.core.HaxeTarget;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

public interface ITargetDescription {

	public void setDefaultValues(IProject project);
	public ITargetDescription copy();
	public List<IOptionCollection> getOptionCollections();
	public void setOptionCollections(List<IOptionCollection> copyOptionCollections);
	public HaxeTarget<? extends ITargetDescription> getHaxeTarget();
	public void setHaxeTarget(HaxeTarget<? extends ITargetDescription> haxeTarget);
	public IPath getSourceFolderRelativePath(IResource resource);
}