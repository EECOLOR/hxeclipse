package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.ILibrarySelectorFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

public class LibrarySelectorManager {
															
	private static final String ATTRIBUTE_ID = "id";
	private static final String ATTRIBUTE_CLASS = "class";
	
	private List<ILibrarySelectorFactory> _librarySelectorFactories;
	private Map<String, ILibrarySelectorFactory> _librarySelectorFactoryReference;
	private Map<ILibrarySelectorFactory, String> _idReference;
	
	public LibrarySelectorManager() throws CoreException
	{
		_librarySelectorFactories = new ArrayList<ILibrarySelectorFactory>();
		_librarySelectorFactoryReference = new HashMap<String, ILibrarySelectorFactory>();
		_idReference = new HashMap<ILibrarySelectorFactory, String>();
		
		_processExtensions();
	}
	
	private void _processExtensions() throws CoreException {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] librarySelectorElements = extensionRegistry.getConfigurationElementsFor(HXEclipse.LIBRARY_SELECTORS_EXTENSION);
		
		for (IConfigurationElement librarySelectorElement : librarySelectorElements) {
			String id = librarySelectorElement.getAttribute(ATTRIBUTE_ID);
			ILibrarySelectorFactory librarySelectorFactory = (ILibrarySelectorFactory) librarySelectorElement.createExecutableExtension(ATTRIBUTE_CLASS);
			
			_librarySelectorFactories.add(librarySelectorFactory);
			_librarySelectorFactoryReference.put(id, librarySelectorFactory);
			_idReference.put(librarySelectorFactory, id);
		}
	}
	
	public ILibrarySelectorFactory getCurrentLibrarySelector() {
		IPreferenceStore internalPreferenceStore = HXEclipse.getInternalPreferenceStore();
		String librarySelectorId = internalPreferenceStore.getString(PreferenceConstants.LIBRARY_SELECTOR);
		
		if (_librarySelectorFactoryReference.containsKey(librarySelectorId)) {
			return _librarySelectorFactoryReference.get(librarySelectorId);
		} else if (!_librarySelectorFactories.isEmpty()) {
			return _librarySelectorFactories.get(0);
		} else
		{
			return new DefaultLibrarySelectorFactory();
		}
	}
	
	public void setCurrentLibrarySelector(ILibrarySelectorFactory librarySelectorFactory) {
		String id = getLibrarySelectorId(librarySelectorFactory);
		
		if (id != null) {
			IPreferenceStore internalPreferenceStore = HXEclipse.getInternalPreferenceStore();
			internalPreferenceStore.setValue(PreferenceConstants.LIBRARY_SELECTOR, id);
		}
	}
	
	public String getLibrarySelectorId(ILibrarySelectorFactory librarySelectorFactory) {
		String id = null;
		
		if (_idReference.containsKey(librarySelectorFactory)) {
			id = _idReference.get(librarySelectorFactory);
		}
		
		return id;
	}
	
	public List<ILibrarySelectorFactory> getLibrarySelectorFactories() {
		return _librarySelectorFactories;
	}
}
