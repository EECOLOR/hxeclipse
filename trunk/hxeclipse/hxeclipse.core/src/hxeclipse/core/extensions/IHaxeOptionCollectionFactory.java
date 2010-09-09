package hxeclipse.core.extensions;


import org.eclipse.core.runtime.CoreException;

public interface IHaxeOptionCollectionFactory {

	public String getClassName();
	public IHaxeOptionCollection newInstance() throws CoreException;

}