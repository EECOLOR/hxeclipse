package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.AbstractHaxeTargetDescription;
import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.ui.widgets.target.general.GeneralOptionCollectionEditorFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;

public class HaxeTargetManager {
	
	private static final String ELEMENT_OPTION_COLLECTION = "option-collection";
	private static final String ATTRIBUTE_NAME = "name";
	private static final String ATTRIBUTE_CLASS = "class";
	private static final String ATTRIBUTE_ICON = "icon";
	private static final String ATTRIBUTE_EDITOR = "editor";
	
	private List<HaxeTarget> _targets;
	private Map<Class<? extends IHaxeOptionCollection>, IHaxeOptionCollectionEditorFactory> _optionCollectionEditors;
	private Map<String, IConfigurationElement> _availableTargetDescriptions;
	private Map<String, IConfigurationElement> _availableOptionCollections;
	
	public HaxeTargetManager() throws CoreException {
		_targets = new ArrayList<HaxeTarget>();
		_optionCollectionEditors = new HashMap<Class<? extends IHaxeOptionCollection>, IHaxeOptionCollectionEditorFactory>();
		_availableTargetDescriptions = new HashMap<String, IConfigurationElement>();
		_availableOptionCollections = new HashMap<String, IConfigurationElement>();
		
		_optionCollectionEditors.put(GeneralOptionCollection.class, new GeneralOptionCollectionEditorFactory());
		
		_processExtensions();
	}
	
	private void _processExtensions() throws CoreException {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] targetElements = extensionRegistry.getConfigurationElementsFor(HXEclipse.TARGETS_EXTENSION);
		
		for (IConfigurationElement targetElement : targetElements) {
			Bundle bundle = Platform.getBundle(targetElement.getNamespaceIdentifier());
			
			String name = targetElement.getAttribute(ATTRIBUTE_NAME);
			URL iconURL = bundle.getResource(targetElement.getAttribute(ATTRIBUTE_ICON));
			ImageDescriptor icon = ImageDescriptor.createFromURL(iconURL);
			
			AbstractHaxeTargetDescription targetDescription = (AbstractHaxeTargetDescription) targetElement.createExecutableExtension(ATTRIBUTE_CLASS);
			String className = targetElement.getAttribute(ATTRIBUTE_CLASS);
			if (_availableTargetDescriptions.containsKey(className)) {
				throw new RuntimeException("Double class name in different targets. Targets should be stored in another fasion to make sure we can distinguish between same named classes from different plugins");
			} else {
				_availableTargetDescriptions.put(className, targetElement);
			}
			
			HaxeTarget target = new HaxeTarget(name, icon, targetDescription);
			_targets.add(target);
			
			IConfigurationElement[] optionCollectionElements = targetElement.getChildren(ELEMENT_OPTION_COLLECTION);
			
			List<IHaxeOptionCollection> optionCollections = targetDescription.getOptionCollections();
			
			for (IConfigurationElement optionCollectionElement : optionCollectionElements) {
				IHaxeOptionCollection optionCollection = (IHaxeOptionCollection) optionCollectionElement.createExecutableExtension(ATTRIBUTE_CLASS);
				IHaxeOptionCollectionEditorFactory optionCollectionEditorFactory = (IHaxeOptionCollectionEditorFactory) optionCollectionElement.createExecutableExtension(ATTRIBUTE_EDITOR);

				optionCollections.add(optionCollection);
				
				Class<? extends IHaxeOptionCollection> optionCollectionClass = optionCollection.getClass();
				
				_availableOptionCollections.put(optionCollectionClass.getName(), optionCollectionElement);
				
				if (!_optionCollectionEditors.containsKey(optionCollectionClass)) {
					_optionCollectionEditors.put(optionCollectionClass, optionCollectionEditorFactory);
				}
			}
		}
	}

	public List<HaxeTarget> getTargets() {
		return _targets;
	}
	
	public IHaxeOptionCollectionEditorFactory getOptionCollectionEditorFactory(IHaxeOptionCollection optionCollection) {
		return _optionCollectionEditors.get(optionCollection.getClass());
	}
	
	public boolean hasTargetDescription(String className) {
		return _availableTargetDescriptions.containsKey(className);
	}
	
	public IHaxeTargetDescription createTargetDescription(String className) throws CoreException {
		IHaxeTargetDescription targetDescription = null;
		
		if (hasTargetDescription(className)) {
			targetDescription = (IHaxeTargetDescription) _availableTargetDescriptions.get(className).createExecutableExtension(ATTRIBUTE_CLASS);
		}
		
		return targetDescription;
	}
	
	public boolean hasOptionCollection(String className) {
		return _availableOptionCollections.containsKey(className);
	}
	
	public IHaxeOptionCollection createOptionCollection(String className) throws CoreException {
		IHaxeOptionCollection optionCollection = null;
		
		if (hasOptionCollection(className)) {
			optionCollection = (IHaxeOptionCollection) _availableOptionCollections.get(className).createExecutableExtension(ATTRIBUTE_CLASS);
		}
		
		return optionCollection;
	}
}
