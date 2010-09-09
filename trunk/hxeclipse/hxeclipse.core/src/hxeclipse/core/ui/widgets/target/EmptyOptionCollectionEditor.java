package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Composite;

public class EmptyOptionCollectionEditor extends Composite implements IHaxeOptionCollectionEditor {

	public EmptyOptionCollectionEditor(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public void setOptionCollection(IHaxeOptionCollection optionCollection) {
		//do nothing
	}

	@Override
	public void setProject(IProject project) {
		//do nothing
	}

}
