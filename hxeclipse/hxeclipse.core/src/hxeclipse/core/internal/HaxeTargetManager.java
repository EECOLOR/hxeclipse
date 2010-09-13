package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;
import hxeclipse.core.extensions.IHaxeOptionCollectionFactory;
import hxeclipse.core.extensions.IHaxeTargetDescription;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;

public class HaxeTargetManager {
	
	private static final String ELEMENT_TARGET = "target";
	private static final String ELEMENT_OPTION_COLLECTION = "option-collection";
	private static final String ELEMENT_OPTION_COLLECTION_REFERENCE = "option-collection-reference";
	private static final String ATTRIBUTE_NAME = "name";
	private static final String ATTRIBUTE_CLASS = "class";
	private static final String ATTRIBUTE_ICON = "icon";
	private static final String ATTRIBUTE_EDITOR_FACTORY = "editor-factory";
	private static final String ATTRIBUTE_REFERENCE = "reference";
	private static final String ATTRIBUTE_ID = "id";
	
	private List<HaxeTarget> _targets;
	private Map<String, IHaxeOptionCollectionEditorFactory> _optionCollectionEditors;
	private Map<String, IHaxeTargetDescription> _availableTargetDescriptions;
	private Map<String, IHaxeOptionCollectionFactory> _availableOptionCollections;
	private Map<String, IHaxeOptionCollection> _optionCollectionReference;
	
	public HaxeTargetManager() throws CoreException {
		_targets = new ArrayList<HaxeTarget>();
		_optionCollectionEditors = new HashMap<String, IHaxeOptionCollectionEditorFactory>();
		_availableTargetDescriptions = new HashMap<String, IHaxeTargetDescription>();
		_availableOptionCollections = new HashMap<String, IHaxeOptionCollectionFactory>();
		_optionCollectionReference = new HashMap<String, IHaxeOptionCollection>();
		
		_processExtensions();
	}
	
	private void _processOptionCollection(IConfigurationElement optionCollectionElement) throws CoreException {
		String id = optionCollectionElement.getAttribute(ATTRIBUTE_ID);
		IHaxeOptionCollection optionCollection = (IHaxeOptionCollection) optionCollectionElement.createExecutableExtension(ATTRIBUTE_CLASS);
		
		_optionCollectionReference.put(id, optionCollection);
		
		IHaxeOptionCollectionEditorFactory optionCollectionEditorFactory = (IHaxeOptionCollectionEditorFactory) optionCollectionElement.createExecutableExtension(ATTRIBUTE_EDITOR_FACTORY);
		ConfigurationElementOptionCollectionFactory optionCollectionFactory = new ConfigurationElementOptionCollectionFactory(optionCollectionElement, ATTRIBUTE_CLASS);
			
		registerOptionCollection(optionCollectionFactory, optionCollectionEditorFactory);
	}
	
	private void _processExtensions() throws CoreException {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] elements = extensionRegistry.getConfigurationElementsFor(HXEclipse.TARGETS_EXTENSION);
		
		List<IConfigurationElement> targetElements = new ArrayList<IConfigurationElement>();
		
		for (IConfigurationElement element : elements) {
			if (element.getName().equals(ELEMENT_TARGET)) {
				//save for later
				targetElements.add(element);
			} else if (element.getName().equals(ELEMENT_OPTION_COLLECTION))
			{
				_processOptionCollection(element);
			}
		}
		
		//process the targets that were found
		Iterator<IConfigurationElement> iterator = targetElements.iterator();
		
		while (iterator.hasNext()) {
			IConfigurationElement targetElement = iterator.next();
			
			Bundle bundle = Platform.getBundle(targetElement.getNamespaceIdentifier());
			
			String name = targetElement.getAttribute(ATTRIBUTE_NAME);
			URL iconURL = bundle.getResource(targetElement.getAttribute(ATTRIBUTE_ICON));
			ImageDescriptor icon = ImageDescriptor.createFromURL(iconURL);
			
			IHaxeTargetDescription targetDescription = (IHaxeTargetDescription) targetElement.createExecutableExtension(ATTRIBUTE_CLASS);
			String className = targetElement.getAttribute(ATTRIBUTE_CLASS);
			if (_availableTargetDescriptions.containsKey(className)) {
				throw new RuntimeException("Double class name in different targets. Targets should be stored in another fasion to make sure we can distinguish between same named classes from different plugins");
			} else {
				_availableTargetDescriptions.put(className, targetDescription);
			}
			
			HaxeTarget target = new HaxeTarget(name, icon, targetDescription);
			_targets.add(target);
			targetDescription.setHaxeTarget(target);
			
			IConfigurationElement[] optionCollectionReferenceElements = targetElement.getChildren(ELEMENT_OPTION_COLLECTION_REFERENCE);
			
			List<IHaxeOptionCollection> optionCollections = targetDescription.getOptionCollections();
			
			if (optionCollections == null) {
				optionCollections = new ArrayList<IHaxeOptionCollection>();
				targetDescription.setOptionCollections(optionCollections);
			}
			
			for (IConfigurationElement optionCollectionReferenceElement : optionCollectionReferenceElements) {
				
				String reference = optionCollectionReferenceElement.getAttribute(ATTRIBUTE_REFERENCE);
				
				if (!_optionCollectionReference.containsKey(reference)) {
					throw new RuntimeException("Could not find option collection with id '" + reference + "'");
				}
				
				optionCollections.add(_optionCollectionReference.get(reference));
			}
		}
	}

	public List<HaxeTarget> getTargets() {
		return _targets;
	}
	
	public IHaxeOptionCollectionEditorFactory getOptionCollectionEditorFactory(IHaxeOptionCollection optionCollection) {
		return _optionCollectionEditors.get(optionCollection.getClass().getName());
	}
	
	public boolean hasTargetDescription(String className) {
		return _availableTargetDescriptions.containsKey(className);
	}
	
	public IHaxeTargetDescription createTargetDescription(String className) throws CoreException {
		IHaxeTargetDescription targetDescription = null;
		
		if (hasTargetDescription(className)) {
			targetDescription = _availableTargetDescriptions.get(className).copy();
		}
		
		return targetDescription;
	}
	
	public boolean hasOptionCollection(String className) {
		return _availableOptionCollections.containsKey(className);
	}
	
	public IHaxeOptionCollection createOptionCollection(String className) throws CoreException {
		IHaxeOptionCollection optionCollection = null;
		
		if (hasOptionCollection(className)) {
			optionCollection = _availableOptionCollections.get(className).newInstance();
		}
		
		return optionCollection;
	}
	
	public void registerOptionCollection(IHaxeOptionCollectionFactory optionCollectionFactory, IHaxeOptionCollectionEditorFactory optionCollectionEditorFactory) {
		String className = optionCollectionFactory.getClassName();
		
		_availableOptionCollections.put(className, optionCollectionFactory);
		_optionCollectionEditors.put(className, optionCollectionEditorFactory);

	}
}
