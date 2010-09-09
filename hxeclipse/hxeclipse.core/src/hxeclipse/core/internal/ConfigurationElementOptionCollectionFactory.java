package hxeclipse.core.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionFactory;

public class ConfigurationElementOptionCollectionFactory implements IHaxeOptionCollectionFactory {
	private IConfigurationElement _configurationElement;
	private String _attributeName;
	
	public ConfigurationElementOptionCollectionFactory(IConfigurationElement configurationElement, String attributeName) {
		_configurationElement = configurationElement;
		_attributeName = attributeName;
	}
	
	@Override
	public IHaxeOptionCollection newInstance() throws CoreException {
		return (IHaxeOptionCollection) _configurationElement.createExecutableExtension(_attributeName);
	}

	@Override
	public String getClassName() {
		return _configurationElement.getAttribute(_attributeName);
	}
}
