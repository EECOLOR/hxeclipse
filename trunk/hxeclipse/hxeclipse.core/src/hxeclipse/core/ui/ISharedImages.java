package hxeclipse.core.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public interface ISharedImages {
	 public final static String IMG_ICON_HAXE = "IMG_ICON_HAXE";
	 
	public Image getImage(String symbolicName);
	public ImageDescriptor getImageDescriptor(String symbolicName);
}
