package hxeclipse.core.model;

import hxeclipse.core.HaxeTarget;
import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.ITargetDescription;
import hxeclipse.core.internal.DefaultValues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

abstract public class AbstractTargetDescription implements ITargetDescription {
	private List<IOptionCollection> _optionCollections;
	private GeneralOptionCollection _generalOptionCollection;
	private HaxeTarget<? extends ITargetDescription> _haxeTarget;
	
	public AbstractTargetDescription() {
		
		List<IOptionCollection> optionCollections = new ArrayList<IOptionCollection>(1);
		optionCollections.add(new GeneralOptionCollection());
		
		setOptionCollections(optionCollections);
	}
	
	@Override
	public void setHaxeTarget(HaxeTarget<? extends ITargetDescription> haxeTarget) {
		_haxeTarget = haxeTarget;
	}

	@Override
	public HaxeTarget<? extends ITargetDescription> getHaxeTarget() {
		return _haxeTarget;
	}

	@Override
	public void setDefaultValues(IProject project) {
		
		List<IFolder> sourcePaths = new ArrayList<IFolder>(1);
		sourcePaths.add(project.getFolder(DefaultValues.SOURCE_PATH));
		
		GeneralOptionCollection generalOptionCollection = getGeneralOptionCollection();
		generalOptionCollection.setSourceFolders(sourcePaths );
		generalOptionCollection.setOutputPath(project.getFolder(DefaultValues.OUTPUT_PATH));
	}
	
	@Override
	public ITargetDescription copy() {
		try {
			ITargetDescription newInstance = getClass().newInstance();
			newInstance.setOptionCollections(copyOptionCollections());
			
			return newInstance;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	protected List<IOptionCollection> copyOptionCollections() {
		List<IOptionCollection> optionCollections = new ArrayList<IOptionCollection>(_optionCollections.size());
		
		Iterator<IOptionCollection> iterator = _optionCollections.iterator();
		while (iterator.hasNext()) {
			optionCollections.add(iterator.next().copy());
		}
		
		return optionCollections;
	}
	
	/* (non-Javadoc)
	 * @see hxeclipse.core.model.ITargetDescription#getOptionCollections()
	 */
	@Override
	public List<IOptionCollection> getOptionCollections() {
		return _optionCollections;
	}
	
	public void setOptionCollections(List<IOptionCollection> optionCollections) {
		_optionCollections = optionCollections;
		
		//find the general option collection
		Iterator<IOptionCollection> iterator = _optionCollections.iterator();
		while (iterator.hasNext()) {
			IOptionCollection optionCollection = iterator.next();
			
			if (optionCollection instanceof GeneralOptionCollection) {
				_generalOptionCollection = (GeneralOptionCollection) optionCollection;
				break;
			}
		}
	}
	
	public GeneralOptionCollection getGeneralOptionCollection() {
		return _generalOptionCollection;
	}

	@Override
	public IPath getSourceFolderRelativePath(IResource resource) {
		IPath resourcePath = resource.getFullPath();
		
		Iterator<IFolder> sourceFolders = _generalOptionCollection.getSourceFolders().iterator();
		
		while (sourceFolders.hasNext()) {
			IPath sourceFolderPath = sourceFolders.next().getFullPath();
			if (sourceFolderPath.isPrefixOf(resourcePath)) {
				return resourcePath.makeRelativeTo(sourceFolderPath);
			}
		}
		
		return null;
	}
}
