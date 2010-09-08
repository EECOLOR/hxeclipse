package hxeclipse.core;

import hxeclipse.core.extensions.IHaxeOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class TestOptionCollection implements IHaxeOptionCollection {

	@Override
	public String getName() {
		return "testOptionCollection";
	}

	@Override
	public IHaxeOptionCollection copy() {
		return new TestOptionCollection();
	}

	@Override
	public void save(Preferences preferences) {
		//nothing to save
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		//nothing to load
	}

	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		//nothing to initialize
	}

	@Override
	public void setDefaultValues(IProject project) {
		//nothing to default
	}


}
