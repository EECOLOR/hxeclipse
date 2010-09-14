package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;

@SuppressWarnings("rawtypes")
public class HaxeProjectAdapterFactory implements IAdapterFactory {

	private static final Class HAXE_PROJECT = IHaxeProject.class;
	
	private static final Class[] ADAPTER_LIST = new Class[] {
		HAXE_PROJECT
	};
	
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType.equals(HAXE_PROJECT)) {
			if (adaptableObject instanceof IProject) {
				IProject project = (IProject) adaptableObject;
				try {
					return HXEclipse.getProjectManager().getHaxeProject(project);
				} catch (CoreException e) {
					//fail silently
				}
			}
		}
		
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return ADAPTER_LIST;
	}
}
