package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeLibrarySelectorFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

public class HaxeLibrarySelectorManager {
															
	private static final String ATTRIBUTE_ID = "id";
	private static final String ATTRIBUTE_CLASS = "class";
	
	private List<IHaxeLibrarySelectorFactory> _librarySelectorFactories;
	private Map<String, IHaxeLibrarySelectorFactory> _librarySelectorFactoryReference;
	private Map<IHaxeLibrarySelectorFactory, String> _idReference;
	
	public HaxeLibrarySelectorManager() throws CoreException
	{
		_librarySelectorFactories = new ArrayList<IHaxeLibrarySelectorFactory>();
		_librarySelectorFactoryReference = new HashMap<String, IHaxeLibrarySelectorFactory>();
		_idReference = new HashMap<IHaxeLibrarySelectorFactory, String>();
		
		_processExtensions();
	}
	
	private void _processExtensions() throws CoreException {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] librarySelectorElements = extensionRegistry.getConfigurationElementsFor(HXEclipse.LIBRARY_SELECTORS_EXTENSION);
		
		for (IConfigurationElement librarySelectorElement : librarySelectorElements) {
			String id = librarySelectorElement.getAttribute(ATTRIBUTE_ID);
			IHaxeLibrarySelectorFactory librarySelectorFactory = (IHaxeLibrarySelectorFactory) librarySelectorElement.createExecutableExtension(ATTRIBUTE_CLASS);
			
			_librarySelectorFactories.add(librarySelectorFactory);
			_librarySelectorFactoryReference.put(id, librarySelectorFactory);
			_idReference.put(librarySelectorFactory, id);
		}
	}
	
	public IHaxeLibrarySelectorFactory getCurrentLibrarySelector() {
		IPreferenceStore internalPreferenceStore = HXEclipse.getInternalPreferenceStore();
		String librarySelectorId = internalPreferenceStore.getString(HaxePreferenceConstants.LIBRARY_SELECTOR);
		
		if (_librarySelectorFactoryReference.containsKey(librarySelectorId)) {
			return _librarySelectorFactoryReference.get(librarySelectorId);
		} else if (!_librarySelectorFactories.isEmpty()) {
			return _librarySelectorFactories.get(0);
		} else
		{
			return new DefaultLibrarySelectorFactory();
		}
	}
	
	public void setCurrentLibrarySelector(IHaxeLibrarySelectorFactory librarySelectorFactory) {
		String id = getLibrarySelectorId(librarySelectorFactory);
		
		if (id != null) {
			IPreferenceStore internalPreferenceStore = HXEclipse.getInternalPreferenceStore();
			internalPreferenceStore.setValue(HaxePreferenceConstants.LIBRARY_SELECTOR, id);
		}
	}
	
	public String getLibrarySelectorId(IHaxeLibrarySelectorFactory librarySelectorFactory) {
		String id = null;
		
		if (_idReference.containsKey(librarySelectorFactory)) {
			id = _idReference.get(librarySelectorFactory);
		}
		
		return id;
	}
	
	public List<IHaxeLibrarySelectorFactory> getLibrarySelectorFactories() {
		return _librarySelectorFactories;
	}
}
