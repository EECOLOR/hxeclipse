package hxeclipse.core.ui;

import hxeclipse.core.HXEclipse;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class SharedImages implements ISharedImages {

	public SharedImages() {
		super();
	}

	@Override
	public Image getImage(String symbolicName) {
		return HXEclipse.getDefault().getImageRegistry().get(symbolicName);
	}

	@Override
	public ImageDescriptor getImageDescriptor(String symbolicName) {
		return HXEclipse.getDefault().getImageRegistry().getDescriptor(symbolicName);
	}

}
