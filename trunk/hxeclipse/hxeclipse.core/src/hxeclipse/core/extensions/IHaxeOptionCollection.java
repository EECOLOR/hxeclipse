package hxeclipse.core.extensions;

import hxeclipse.core.IHaxeProject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public interface IHaxeOptionCollection {
	public String getName();
	public IHaxeOptionCollection copy();
	public void save(Preferences preferences);
	public void load(Preferences preferences) throws BackingStoreException;
	public void initializeProject(IHaxeProject haxeProject) throws CoreException;
	public void setDefaultValues(IProject project);
}
