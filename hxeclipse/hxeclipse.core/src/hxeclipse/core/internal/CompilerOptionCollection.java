package hxeclipse.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class CompilerOptionCollection implements IHaxeOptionCollection {

	private List<String> _conditionalCompilationFlags;
	private boolean _includeDebugInformation;
	private boolean _noOptimalisation;
	private boolean _noTraces;
	private boolean _noInlining;
	
	@Override
	public String getName() {
		return "Compiler";
	}

	@Override
	public IHaxeOptionCollection copy() {
		CompilerOptionCollection compilerOptionCollection = new CompilerOptionCollection();
		compilerOptionCollection._conditionalCompilationFlags = _conditionalCompilationFlags;
		compilerOptionCollection._includeDebugInformation = _includeDebugInformation;
		compilerOptionCollection._noOptimalisation = _noOptimalisation;
		compilerOptionCollection._noTraces = _noTraces;
		compilerOptionCollection._noInlining = _noInlining;

		return compilerOptionCollection;
	}

	@Override
	public void save(Preferences preferences) {
		int counter = 0;
		
		if (_conditionalCompilationFlags != null) {
			Preferences conditionalCompilationFlagsPreferences = preferences.node("conditionalCompilationFlags");
			Iterator<String> conditionalCompilationFlags = _conditionalCompilationFlags.iterator();
			counter = 0;
			while (conditionalCompilationFlags.hasNext()) {
				conditionalCompilationFlagsPreferences.put("conditionalCompilationFlag" + counter++, conditionalCompilationFlags.next());
			}
		}
		
		preferences.putBoolean("includeDebugInformation", _includeDebugInformation);
		preferences.putBoolean("noOptimalisation", _noOptimalisation);
		preferences.putBoolean("noTraces", _noTraces);
		preferences.putBoolean("noInlining", _noInlining);
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		String[] childrenNames;
		Preferences conditionalCompilationFlagsPreferences = preferences.node("conditionalCompilationFlags");
		childrenNames = conditionalCompilationFlagsPreferences.childrenNames();
		_conditionalCompilationFlags = new ArrayList<String>();
		for (String childName : childrenNames) {
			_conditionalCompilationFlags.add(conditionalCompilationFlagsPreferences.get(childName, null));
		}
		
		_includeDebugInformation = preferences.getBoolean("includeDebugInformation", false);
		_noOptimalisation = preferences.getBoolean("noOptimalisation", false);
		_noTraces = preferences.getBoolean("noTraces", false);
		_noInlining = preferences.getBoolean("noInlining", false);
	}

	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		//nothing to initialize
	}

	@Override
	public void setDefaultValues(IProject project) {
		//no default values
	}

	public void setConditionalCompilationFlags(
			List<String> conditionalCompilationFlags) {
		_conditionalCompilationFlags = conditionalCompilationFlags;
	}

	public List<String> getConditionalCompilationFlags() {
		return _conditionalCompilationFlags;
	}
	
	public void setIncludeDebugInformation(boolean includeDebugInformation) {
		_includeDebugInformation = includeDebugInformation;
	}

	public boolean getIncludeDebugInformation() {
		return _includeDebugInformation;
	}

	public void setNoOptimalisation(boolean noOptimalisation) {
		_noOptimalisation = noOptimalisation;
	}

	public boolean getNoOptimalisation() {
		return _noOptimalisation;
	}

	public void setNoTraces(boolean noTraces) {
		_noTraces = noTraces;
	}

	public boolean getNoTraces() {
		return _noTraces;
	}

	public void setNoInlining(boolean noInlining) {
		_noInlining = noInlining;
	}

	public boolean getNoInlining() {
		return _noInlining;
	}
	
}
