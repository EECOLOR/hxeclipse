package hxeclipse.core.internal;

import hxeclipse.core.extensions.IHaxeTargetDescription;

import org.eclipse.jface.resource.ImageDescriptor;

public class HaxeTarget {
	private String _name;
	private ImageDescriptor _icon;
	private IHaxeTargetDescription _targetDescription;
	
	public HaxeTarget(String name, ImageDescriptor icon, IHaxeTargetDescription targetDescription) {
		_name = name;
		_icon = icon;
		_targetDescription = targetDescription;
		_targetDescription.setHaxeTarget(this);
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}

	public void setIcon(ImageDescriptor icon) {
		_icon = icon;
	}

	public ImageDescriptor getIcon() {
		return _icon;
	}

	public IHaxeTargetDescription getTargetDescription() {
		return _targetDescription;
	}
}
