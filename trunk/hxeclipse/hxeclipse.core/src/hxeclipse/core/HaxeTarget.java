package hxeclipse.core;

import hxeclipse.core.extensions.ITargetDescription;

import org.eclipse.jface.resource.ImageDescriptor;

public class HaxeTarget<T extends ITargetDescription> {
	private String _name;
	private ImageDescriptor _icon;
	private T _targetDescription;
	
	public HaxeTarget(String name, ImageDescriptor icon, T targetDescription) {
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

	public void setTargetDescription(T targetDescription) {
		_targetDescription = targetDescription;
	}

	public T getTargetDescription() {
		return _targetDescription;
	}
}
