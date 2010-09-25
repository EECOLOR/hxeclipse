package hxeclipse.core.extensions;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.internal.HaxeTarget;
import hxeclipse.core.internal.HaxeTargetManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

abstract public class AbstractHaxeTargetDescription implements IHaxeTargetDescription {
	private List<IHaxeOptionCollection> _optionCollections;
	private HaxeTarget _haxeTarget;
	private List<IHaxeSourceFolderProvider> _sourceFolderProviders;
	private IHaxeOutputFolderProvider _outputFolderProvider;
	
	public AbstractHaxeTargetDescription() {
	}
	
	@Override
	public void setHaxeTarget(HaxeTarget haxeTarget) {
		_haxeTarget = haxeTarget;
	}

	@Override
	public HaxeTarget getHaxeTarget() {
		return _haxeTarget;
	}

	@Override
	public void setDefaultValues(IProject project) {
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		
		while (optionCollections.hasNext()) {
			optionCollections.next().setDefaultValues(project);
		}
	}
	
	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		
		while (optionCollections.hasNext()) {
			optionCollections.next().initializeProject(haxeProject);
		}
	}

	@Override
	public IHaxeTargetDescription copy() {
		try {
			IHaxeTargetDescription newInstance = getClass().newInstance();
			newInstance.setHaxeTarget(_haxeTarget);
			newInstance.setOptionCollections(copyOptionCollections());
			
			return newInstance;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	protected List<IHaxeOptionCollection> copyOptionCollections() {
		List<IHaxeOptionCollection> optionCollections = new ArrayList<IHaxeOptionCollection>(_optionCollections.size());
		
		Iterator<IHaxeOptionCollection> iterator = _optionCollections.listIterator();
		while (iterator.hasNext()) {
			optionCollections.add(iterator.next().copy());
		}
		
		return optionCollections;
	}
	
	@Override
	public List<IHaxeOptionCollection> getOptionCollections() {
		return _optionCollections;
	}
	
	public void setOptionCollections(List<IHaxeOptionCollection> optionCollections) {
		_optionCollections = optionCollections;
	}
	
	public List<IFolder> getSourceFolders()
	{
		if (_sourceFolderProviders == null) {
			_sourceFolderProviders = new ArrayList<IHaxeSourceFolderProvider>(1);
			
			//find source folder providers
			Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
			
			while (optionCollections.hasNext()) {
				IHaxeOptionCollection optionCollection = optionCollections.next();
				if (optionCollection instanceof IHaxeSourceFolderProvider) {
					_sourceFolderProviders.add((IHaxeSourceFolderProvider) optionCollection);
				}
			}
		}
		
		List<IFolder> sourceFolders = new ArrayList<IFolder>(1);
		Iterator<IHaxeSourceFolderProvider> sourceFolderProviders = _sourceFolderProviders.iterator();
		
		while (sourceFolderProviders.hasNext()) {
			IHaxeSourceFolderProvider sourceFolderProvider = sourceFolderProviders.next();
			sourceFolders.addAll(sourceFolderProvider.getSourceFolders());
		}
		
		return sourceFolders;
	}
	
	@Override
	public IPath getSourceFolderRelativePath(IResource resource) {
		IPath resourcePath = resource.getFullPath();
		
		Iterator<IFolder> sourceFolders = getSourceFolders().iterator();
		
		while (sourceFolders.hasNext()) {
			IPath sourceFolderPath = sourceFolders.next().getFullPath();
			if (sourceFolderPath.isPrefixOf(resourcePath)) {
				return resourcePath.makeRelativeTo(sourceFolderPath);
			}
		}
		
		return null;
	}

	@Override
	public IFolder getOutputFolder() throws CoreException {
		if (_outputFolderProvider == null) {
			
			//find output folder provider
			Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
			
			while (optionCollections.hasNext()) {
				IHaxeOptionCollection optionCollection = optionCollections.next();
				if (optionCollection instanceof IHaxeOutputFolderProvider) {
					_outputFolderProvider = (IHaxeOutputFolderProvider) optionCollection;
				}
			}
		}
		
		if (_outputFolderProvider == null) {
			IStatus status = new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, "Could not find output folder");
			throw new CoreException(status);
		} else {
			return _outputFolderProvider.getOutputFolder();
		}
	}

	@Override
	public void save(Preferences preferences) {
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		
		while (optionCollections.hasNext()) {
			IHaxeOptionCollection optionCollection = optionCollections.next();
			System.out.println("saving " + optionCollection.getClass().getName());
			Preferences optionCollectionPreferences = preferences.node(optionCollection.getClass().getName());
			optionCollection.save(optionCollectionPreferences);

		}
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException, CoreException {
		HaxeTargetManager targetManager = HXEclipse.getTargetManager();
		
		String[] childrenNames = preferences.childrenNames();
		_optionCollections = new ArrayList<IHaxeOptionCollection>(childrenNames.length);
		
		for (String childName : childrenNames) {
			System.out.println("trying to load " + childName);
			if (targetManager.hasOptionCollection(childName)) {
				IHaxeOptionCollection optionCollection = targetManager.createOptionCollection(childName);
				System.out.println("loading " + childName);
				optionCollection.load(preferences.node(childName));
				_optionCollections.add(optionCollection);
			}
		}
	}

	@Override
	public List<String> getCommandLineArguments(IHaxeProject haxeProject) {
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		List<String> commandLineArguments = new ArrayList<String>();
		
		while (optionCollections.hasNext()) {
			commandLineArguments.addAll(optionCollections.next().getCommandLineArguments(haxeProject));
		}
		
		return commandLineArguments;
	}
}
