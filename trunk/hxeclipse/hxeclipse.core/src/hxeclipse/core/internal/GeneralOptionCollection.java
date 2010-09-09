package hxeclipse.core.internal;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeLibrary;
import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.model.Library;
import hxeclipse.core.model.Mapping;
import hxeclipse.core.model.Resource;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class GeneralOptionCollection implements IHaxeOptionCollection {
	private IHaxeClass _main;
	private List<IHaxeLibrary> _libraries;
	private List<Resource> _resources;
	private List<String> _excludes;
	private List<Mapping> _mappings;
	private List<IFolder> _sourceFolders;
	private IFolder _outputFolder;	
	
	@Override
	public String getName() {
		return "General";
	}
	
	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		//create source folders
		Iterator<IFolder> sourceFolders = _sourceFolders.iterator();
		while (sourceFolders.hasNext()) {
			IFolder sourceFolder = sourceFolders.next();
			if (!sourceFolder.exists()) {
				sourceFolder.create(false, true, null);
			}
		}

		//create main file
		if (_main != null) {
			IFile file = _main.getFile();
			if (!file.exists()) {
				ByteArrayInputStream source = new ByteArrayInputStream(DefaultValues.MAIN_SOURCE.getBytes(Charset.forName("UTF-8")));
				file.create(source, false, null);
			}
		}
		
		//create output folder
		if (_outputFolder != null) {
			_outputFolder.create(false, true, null);
		}
	}

	@Override
	public void setDefaultValues(IProject project) {
		IFolder sourceFolder = project.getFolder(DefaultValues.SOURCE_PATH);
		_main = new HaxeClass(sourceFolder.getFile(DefaultValues.MAIN));
		
		_sourceFolders = new ArrayList<IFolder>(1);
		_sourceFolders.add(sourceFolder);
		
		_outputFolder = project.getFolder(DefaultValues.OUTPUT_PATH);		
	}

	@Override
	public IHaxeOptionCollection copy() {
		GeneralOptionCollection generalOptionCollection = new GeneralOptionCollection();
		generalOptionCollection._main = _main;
		generalOptionCollection._libraries = _libraries;
		generalOptionCollection._resources = _resources;
		generalOptionCollection._excludes = _excludes;
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
			Iterator<IHaxeLibrary> libraries = _libraries.iterator();
			counter = 0;
			while (libraries.hasNext()) {
				Preferences libraryPreferences = librariesPreferences.node("library" + counter++);
				libraries.next().save(libraryPreferences);
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
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		String[] childrenNames;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		String main = preferences.get("main", null);
		if (main != null) {
			IFile file = root.getFile(new Path(main));
			_main = (IHaxeClass) file.getAdapter(IHaxeClass.class);
		}
		
		Preferences librariesPreferences = preferences.node("libraries");
		childrenNames = librariesPreferences.childrenNames();
		_libraries = new ArrayList<IHaxeLibrary>();
		for (String childName : childrenNames) {
			Preferences libraryPreferences = librariesPreferences.node(childName);
			Library library = new Library(libraryPreferences);
			_libraries.add(library);
		}
		
		Preferences resourcesPreferences = preferences.node("resources");
		childrenNames = resourcesPreferences.childrenNames();
		_resources = new ArrayList<Resource>();
		for (String childName : childrenNames) {
			Preferences resourcePreferences = resourcesPreferences.node(childName);
			Resource resource = new Resource(resourcePreferences);
			_resources.add(resource);
		}
		
		Preferences excludesPreferences = preferences.node("excludes");
		childrenNames = excludesPreferences.childrenNames();
		_excludes = new ArrayList<String>();
		for (String childName : childrenNames) {
			_excludes.add(excludesPreferences.get(childName, null));
		}
		
		Preferences mappingsPreferences = preferences.node("mappings");
		childrenNames = mappingsPreferences.childrenNames();
		_mappings = new ArrayList<Mapping>();
		for (String childName : childrenNames) {
			Preferences mappingPreferences = mappingsPreferences.node(childName);
			Mapping mapping = new Mapping(mappingPreferences);
			_mappings.add(mapping);
		}
		
		Preferences sourceFoldersPreferences = preferences.node("sourceFolders");
		childrenNames = sourceFoldersPreferences.childrenNames();
		_sourceFolders = new ArrayList<IFolder>();
		for (String childName : childrenNames) {
			IFolder folder = root.getFolder(new Path(sourceFoldersPreferences.get(childName, null)));
			_sourceFolders.add(folder);
		}
		
		String outputFolder = preferences.get("outputFolder", null);
		if (outputFolder != null) {
			_outputFolder = root.getFolder(new Path(outputFolder));
		}
		
	}

	public void setMain(IHaxeClass main) {
		_main = main;
	}
	
	public IHaxeClass getMain() {
		return _main;
	}

	public void setLibraries(List<IHaxeLibrary> libraries) {
		_libraries = libraries;
	}

	public List<IHaxeLibrary> getLibraries() {
		return _libraries;
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
