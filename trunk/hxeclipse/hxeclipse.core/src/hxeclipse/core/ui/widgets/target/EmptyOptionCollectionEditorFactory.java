package hxeclipse.core.ui.widgets.target;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;

public class EmptyOptionCollectionEditorFactory implements IHaxeOptionCollectionEditorFactory {

	@Override
	public IHaxeOptionCollectionEditor newInstance(Composite parent) {
		return new EmptyOptionCollectionEditor(parent, SWT.NONE);
	}

}
