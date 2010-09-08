package hxeclipse.core.ui.widgets.target.general;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;

public class GeneralOptionCollectionEditorFactory implements IHaxeOptionCollectionEditorFactory {

	@Override
	public IHaxeOptionCollectionEditor newInstance(Composite parent) {
		return new GeneralOptionCollectionEditor(parent, SWT.NONE);
	}

}
