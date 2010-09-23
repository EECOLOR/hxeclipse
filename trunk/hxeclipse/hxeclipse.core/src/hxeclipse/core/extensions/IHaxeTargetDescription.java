package hxeclipse.core.extensions;


import hxeclipse.core.IHaxeProject;
import hxeclipse.core.internal.HaxeTarget;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public interface IHaxeTargetDescription {
	
	public void initializeProject(IHaxeProject haxeProject) throws CoreException;
	public void setDefaultValues(IProject project);
	public IHaxeTargetDescription copy();
	public List<IHaxeOptionCollection> getOptionCollections();
	public void setOptionCollections(List<IHaxeOptionCollection> copyOptionCollections);
	public HaxeTarget getHaxeTarget();
	public void setHaxeTarget(HaxeTarget haxeTarget);
	public IPath getSourceFolderRelativePath(IResource resource);
	public void save(Preferences preferences);
	public void load(Preferences preferences) throws BackingStoreException, CoreException;
	public List<IFolder> getSourceFolders();
	public IFolder getOutputFolder() throws CoreException;
}