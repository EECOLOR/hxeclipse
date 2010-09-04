package hxeclipse.core.ui;

import hxeclipse.core.Activator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class SharedImages implements ISharedImages {

	public SharedImages() {
		super();
	}

	@Override
	public Image getImage(String symbolicName) {
		return Activator.getDefault().getImageRegistry().get(symbolicName);
	}

	@Override
	public ImageDescriptor getImageDescriptor(String symbolicName) {
		return Activator.getDefault().getImageRegistry().getDescriptor(symbolicName);
	}

}
