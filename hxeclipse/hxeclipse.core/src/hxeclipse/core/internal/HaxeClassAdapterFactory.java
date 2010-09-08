package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeClass;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.content.IContentType;

@SuppressWarnings("rawtypes")
public class HaxeClassAdapterFactory implements IAdapterFactory {

	private static final Class HAXE_CLASS = IHaxeClass.class;
	
	private static final Class[] ADAPTER_LIST = new Class[] {
		HAXE_CLASS
	};
	
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		if (adapterType.equals(HAXE_CLASS)) {
			if (adaptableObject instanceof IFile) {
				IFile file = (IFile) adaptableObject;
				
				try {
					//check the content type to determine if this is actually a haxe class file
					IContentType contentType = file.getContentDescription().getContentType();
					
					if (HXEclipse.HAXE_FILE_TYPE.equals(contentType.getId())) {
						return  new HaxeClass(file.getProjectRelativePath());
					}
				} catch (CoreException e) {
					e.printStackTrace();
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
