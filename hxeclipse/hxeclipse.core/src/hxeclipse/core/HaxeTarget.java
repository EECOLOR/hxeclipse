package hxeclipse.core;

import hxeclipse.core.model.TargetDescription;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public class HaxeTarget<T extends TargetDescription> {
	private String _name;
	private Image _image;
	//TODO change class to an appropriate interface
	private Composite _targetEditor;
	private T _targetDescription;
	
	public HaxeTarget(String name, Image image) {
		_name = name;
		_image = image;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}

	public void setImage(Image image) {
		_image = image;
	}

	public Image getImage() {
		return _image;
	}

	public void setTargetEditor(Composite targetEditor) {
		_targetEditor = targetEditor;
	}

	public Composite getTargetEditor() {
		return _targetEditor;
	}

	public void setTargetDescription(T targetDescription) {
		_targetDescription = targetDescription;
	}

	public T getTargetDescription() {
		return _targetDescription;
	}
}
