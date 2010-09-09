package hxeclipse.core.extensions;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.internal.ClassOptionCollectionFactory;
import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.internal.HaxeTarget;
import hxeclipse.core.internal.HaxeTargetManager;
import hxeclipse.core.ui.widgets.target.EmptyOptionCollectionEditorFactory;
import hxeclipse.core.ui.widgets.target.general.GeneralOptionCollectionEditorFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

abstract public class AbstractHaxeTargetDescription implements IHaxeTargetDescription {
	private List<IHaxeOptionCollection> _optionCollections;
	private GeneralOptionCollection _generalOptionCollection;
	private CompilerOptionCollection _compilerOptionCollection;
	private HaxeTarget _haxeTarget;
	
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
		createDefaultOptionCollections();
		
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		
		while (optionCollections.hasNext()) {
			optionCollections.next().setDefaultValues(project);
		}
	}
	
	protected void createDefaultOptionCollections() {
		_optionCollections = new ArrayList<IHaxeOptionCollection>(2);
		
		//general option collection
		_generalOptionCollection = new GeneralOptionCollection();
		_optionCollections.add(_generalOptionCollection);
		registerOptionCollection(_generalOptionCollection, new GeneralOptionCollectionEditorFactory());

		//compiler option collection
		_compilerOptionCollection = new CompilerOptionCollection();
		_optionCollections.add(_compilerOptionCollection);
		registerOptionCollection(_compilerOptionCollection, new EmptyOptionCollectionEditorFactory());
	}
	
	protected void registerOptionCollection(IHaxeOptionCollection optionCollection, IHaxeOptionCollectionEditorFactory optionCollectionEditorFactory) {

		ClassOptionCollectionFactory optionCollectionFactory = new ClassOptionCollectionFactory(optionCollection.getClass());
		
		HaxeTargetManager targetManager = HXEclipse.getTargetManager();
		targetManager.registerOptionCollection(optionCollectionFactory, optionCollectionEditorFactory);
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
		
		Iterator<IHaxeOptionCollection> iterator = _optionCollections.iterator();
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
		
		//find the general option collection
		Iterator<IHaxeOptionCollection> iterator = _optionCollections.iterator();
		while (iterator.hasNext()) {
			IHaxeOptionCollection optionCollection = iterator.next();
			
			if (optionCollection instanceof GeneralOptionCollection) {
				_generalOptionCollection = (GeneralOptionCollection) optionCollection;
			}
			
			if (optionCollection instanceof CompilerOptionCollection) {
				_compilerOptionCollection = (CompilerOptionCollection) optionCollection;
			}
		}
	}
	
	@Override
	public IPath getSourceFolderRelativePath(IResource resource) {
		IPath resourcePath = resource.getFullPath();
		
		Iterator<IFolder> sourceFolders = getGeneralOptionCollection().getSourceFolders().iterator();
		
		while (sourceFolders.hasNext()) {
			IPath sourceFolderPath = sourceFolders.next().getFullPath();
			if (sourceFolderPath.isPrefixOf(resourcePath)) {
				return resourcePath.makeRelativeTo(sourceFolderPath);
			}
		}
		
		return null;
	}

	@Override
	public void save(Preferences preferences) {
		Iterator<IHaxeOptionCollection> optionCollections = _optionCollections.iterator();
		
		while (optionCollections.hasNext()) {
			IHaxeOptionCollection optionCollection = optionCollections.next();
			Preferences optionCollectionPreferences = preferences.node(optionCollection.getClass().getName());
			optionCollection.save(optionCollectionPreferences);

		}
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException, CoreException {
		HaxeTargetManager targetManager = HXEclipse.getTargetManager();
		
		String[] childrenNames = preferences.childrenNames();
		_optionCollections = new ArrayList<IHaxeOptionCollection>();
		
		for (String childName : childrenNames) {
			if (targetManager.hasOptionCollection(childName)) {
				IHaxeOptionCollection optionCollection = targetManager.createOptionCollection(childName);
				optionCollection.load(preferences.node(childName));
				_optionCollections.add(optionCollection);
			}
		}
	}

	public GeneralOptionCollection getGeneralOptionCollection() {
		return _generalOptionCollection;
	}

	public CompilerOptionCollection getCompilerOptionCollection() {
		return _compilerOptionCollection;
	}
}
