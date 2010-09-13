package hxeclipse.core;

import hxeclipse.core.extensions.IHaxeOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class TestOptionCollection implements IHaxeOptionCollection {

	private String _test;
	
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
		if (_test != null) preferences.put("test", _test);
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		_test = preferences.get("test", null);
	}

	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		//nothing to initialize
	}

	@Override
	public void setDefaultValues(IProject project) {
		_test = "test";
	}

	public void setTest(String test) {
		_test = test;
	}

	public String getTest() {
		return _test;
	}


}
