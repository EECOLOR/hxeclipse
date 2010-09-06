package hxeclipse.core.model;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.extensions.ILibrary;
import hxeclipse.core.extensions.IOptionCollection;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.osgi.service.prefs.Preferences;

public class GeneralOptionCollection implements IOptionCollection {
	private IHaxeClass _main;
	private List<ILibrary> _libraries;
	private List<String> _conditionalCompilationFlags;
	private List<Resource> _resources;
	private List<String> _excludes;
	private List<Mapping> _mappings;
	private List<IFolder> _sourceFolders;
	private IFolder _outputFolder;	
	private boolean _includeDebugInformation;
	private boolean _noOptimalisation;
	private boolean _noTraces;
	private boolean _noInlining;
	
	@Override
	public String getName() {
		return "General";
	}
	
	@Override
	public IOptionCollection copy() {
		GeneralOptionCollection generalOptionCollection = new GeneralOptionCollection();
		generalOptionCollection._main = _main;
		generalOptionCollection._libraries = _libraries;
		generalOptionCollection._conditionalCompilationFlags = _conditionalCompilationFlags;
		generalOptionCollection._resources = _resources;
		generalOptionCollection._excludes = _excludes;
		generalOptionCollection._includeDebugInformation = _includeDebugInformation;
		generalOptionCollection._noOptimalisation = _noOptimalisation;
		generalOptionCollection._noTraces = _noTraces;
		generalOptionCollection._noInlining = _noInlining;
		generalOptionCollection._mappings = _mappings;
		generalOptionCollection._sourceFolders = _sourceFolders;
		generalOptionCollection._outputFolder = _outputFolder;
		
		return generalOptionCollection;
	}
	
	@Override
	public void save(Preferences preferences) {
		int counter = 0;
		
		if (_main != null) {
			String main = _main.getFile().getFullPath().toString();
			preferences.put("main", main);
		}
		
		if (_libraries != null) {
			Preferences librariesPreferences = preferences.node("libraries");
			Iterator<ILibrary> libraries = _libraries.iterator();
			counter = 0;
			while (libraries.hasNext()) {
				Preferences libraryPreferences = librariesPreferences.node("library" + counter++);
				libraries.next().save(libraryPreferences);
			}
		}
		
		if (_conditionalCompilationFlags != null) {
			Preferences conditionalCompilationFlagsPreferences = preferences.node("conditionalCompilationFlags");
			Iterator<String> conditionalCompilationFlags = _conditionalCompilationFlags.iterator();
			counter = 0;
			while (conditionalCompilationFlags.hasNext()) {
				conditionalCompilationFlagsPreferences.put("conditionalCompilationFlag" + counter++, conditionalCompilationFlags.next());
			}
		}
		
		if (_resources != null) {
			Preferences resourcesPreferences = preferences.node("resources");
			Iterator<Resource> resources = _resources.iterator();
			counter = 0;
			while (resources.hasNext()) {
				Preferences resourcePreferences = resourcesPreferences.node("resource" + counter++);
				resources.next().save(resourcePreferences);
			}
		}
		
		if (_excludes != null) {
			Preferences excludesPreferences = preferences.node("excludes");
			Iterator<String> excludes = _excludes.iterator();
			counter = 0;
			while (excludes.hasNext()) {
				excludesPreferences.put("exclude" + counter++, excludes.next());
			}
		}
		
		if (_mappings != null) {
			Preferences mappingsPreferences = preferences.node("mappings");
			Iterator<Mapping> mappings = _mappings.iterator();
			counter = 0;
			while (mappings.hasNext()) {
				Preferences mappingPreferences = mappingsPreferences.node("mapping" + counter++);
				mappings.next().save(mappingPreferences);
			}
		}
		
		if (_sourceFolders != null) {
			Preferences sourceFoldersPreferences = preferences.node("sourceFolders");
			Iterator<IFolder> iterator = _sourceFolders.iterator();
			counter = 0;
			while (iterator.hasNext()) {
				sourceFoldersPreferences.put("sourceFolder" + counter++, iterator.next().getFullPath().toString());
			}
		}
		
		if (_outputFolder != null) preferences.put("outputFolder", _outputFolder.getFullPath().toString());
		
		//TODO move these preferences to another option collection
		preferences.putBoolean("includeDebugInformation", _includeDebugInformation);
		preferences.putBoolean("noOptimalisation", _noOptimalisation);
		preferences.putBoolean("noTraces", _noTraces);
		preferences.putBoolean("noInlining", _noInlining);
	}

	public void setMain(IHaxeClass main) {
		_main = main;
	}
	
	public IHaxeClass getMain() {
		return _main;
	}

	public void setLibraries(List<ILibrary> libraries) {
		_libraries = libraries;
	}

	public List<ILibrary> getLibraries() {
		return _libraries;
	}

	public void setConditionalCompilationFlags(
			List<String> conditionalCompilationFlags) {
		_conditionalCompilationFlags = conditionalCompilationFlags;
	}

	public List<String> getConditionalCompilationFlags() {
		return _conditionalCompilationFlags;
	}

	public void setResources(List<Resource> resources) {
		_resources = resources;
	}

	public List<Resource> getResources() {
		return _resources;
	}

	public void setExcludes(List<String> excludes) {
		_excludes = excludes;
	}

	public List<String> getExcludes() {
		return _excludes;
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

	public void setMappings(List<Mapping> mappings) {
		_mappings = mappings;
	}

	public List<Mapping> getMappings() {
		return _mappings;
	}

	public void setSourceFolders(List<IFolder> sourceFolders) {
		_sourceFolders = sourceFolders;
	}

	public List<IFolder> getSourceFolders() {
		return _sourceFolders;
	}

	public void setOutputFolder(IFolder outputFolder) {
		_outputFolder = outputFolder;
	}

	public IFolder getOutputFolder() {
		return _outputFolder;
	}
}
