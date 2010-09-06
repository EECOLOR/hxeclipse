package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.HaxeTarget;
import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.IOptionCollectionEditorFactory;
import hxeclipse.core.model.AbstractTargetDescription;
import hxeclipse.core.model.GeneralOptionCollection;
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

public class TargetManager {
	
	private static final String ELEMENT_OPTION_COLLECTION = "option-collection";
	private static final String ATTRIBUTE_NAME = "name";
	private static final String ATTRIBUTE_CLASS = "class";
	private static final String ATTRIBUTE_ICON = "icon";
	private static final String ATTRIBUTE_EDITOR = "editor";
	
	private List<HaxeTarget<? extends AbstractTargetDescription>> _targets;
	private Map<Class<? extends IOptionCollection>, IOptionCollectionEditorFactory> _optionCollectionEditors;
	
	public TargetManager() throws CoreException {
		_targets = new ArrayList<HaxeTarget<? extends AbstractTargetDescription>>();
		_optionCollectionEditors = new HashMap<Class<? extends IOptionCollection>, IOptionCollectionEditorFactory>();
		
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
			
			AbstractTargetDescription targetDescription = (AbstractTargetDescription) targetElement.createExecutableExtension(ATTRIBUTE_CLASS);
			
			HaxeTarget<AbstractTargetDescription> target = new HaxeTarget<AbstractTargetDescription>(name, icon, targetDescription);
			target.setTargetDescription(targetDescription);
			_targets.add(target);
			
			IConfigurationElement[] optionCollectionElements = targetElement.getChildren(ELEMENT_OPTION_COLLECTION);
			
			List<IOptionCollection> optionCollections = targetDescription.getOptionCollections();
			
			for (IConfigurationElement optionCollectionElement : optionCollectionElements) {
				IOptionCollection optionCollection = (IOptionCollection) optionCollectionElement.createExecutableExtension(ATTRIBUTE_CLASS);
				IOptionCollectionEditorFactory optionCollectionEditorFactory = (IOptionCollectionEditorFactory) optionCollectionElement.createExecutableExtension(ATTRIBUTE_EDITOR);

				optionCollections.add(optionCollection);
				
				Class<? extends IOptionCollection> optionCollectionClass = optionCollection.getClass();
				
				if (_optionCollectionEditors.containsKey(optionCollectionClass)) {
					_optionCollectionEditors.put(optionCollectionClass, optionCollectionEditorFactory);
				}
			}
		}
	}

	public List<HaxeTarget<? extends AbstractTargetDescription>> getTargets() {
		return _targets;
	}
	
	public IOptionCollectionEditorFactory getOptionCollectionEditorFactory(IOptionCollection optionCollection) {
		return _optionCollectionEditors.get(optionCollection.getClass());
	}
}
