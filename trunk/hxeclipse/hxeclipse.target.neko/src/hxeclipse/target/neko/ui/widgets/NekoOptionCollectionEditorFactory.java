package hxeclipse.target.neko.ui.widgets;

import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class NekoOptionCollectionEditorFactory implements IHaxeOptionCollectionEditorFactory {

	public NekoOptionCollectionEditorFactory() {
	}

	@Override
	public IHaxeOptionCollectionEditor newInstance(Composite parent) {
		return new NekoOptionCollectionEditor(parent, SWT.NONE);
	}

}
