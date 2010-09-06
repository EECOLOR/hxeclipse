package hxeclipse.core.ui.widgets.target.general;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import hxeclipse.core.extensions.IOptionCollectionEditor;
import hxeclipse.core.extensions.IOptionCollectionEditorFactory;

public class GeneralOptionCollectionEditorFactory implements IOptionCollectionEditorFactory {

	@Override
	public IOptionCollectionEditor newInstance(Composite parent) {
		return new GeneralOptionCollectionEditor(parent, SWT.NONE);
	}

}
