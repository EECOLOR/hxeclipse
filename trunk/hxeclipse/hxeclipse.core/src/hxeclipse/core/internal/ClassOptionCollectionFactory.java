package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionFactory;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ClassOptionCollectionFactory implements IHaxeOptionCollectionFactory {

	private Class<? extends IHaxeOptionCollection> _optionCollectionClass;
	
	public ClassOptionCollectionFactory(Class<? extends IHaxeOptionCollection> optionCollectionClass) {
		_optionCollectionClass = optionCollectionClass;
	}
	
	@Override
	public String getClassName() {
		return _optionCollectionClass.getName();
	}

	@Override
	public IHaxeOptionCollection newInstance() throws CoreException {
		try {
			return _optionCollectionClass.newInstance();
		} catch (InstantiationException e) {
			_throwCoreException(e);
		} catch (IllegalAccessException e) {
			_throwCoreException(e);
		}
		return null;
	}

	private void _throwCoreException(Exception e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, "Could not create a new '" + getClassName() + "'", e));		
	}

}
