package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.ui.ISharedImages;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class SharedImages implements ISharedImages {

	public SharedImages() {
		super();
	}

	@Override
	public Image getImage(String symbolicName) {
		return HXEclipse.getInternalImageRegistry().get(symbolicName);
	}

	@Override
	public ImageDescriptor getImageDescriptor(String symbolicName) {
		return HXEclipse.getInternalImageRegistry().getDescriptor(symbolicName);
	}

}
