package hxeclipse.core.ui.widgets.target.compiler;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;

public class CompilerOptionCollectionEditorFactory implements IHaxeOptionCollectionEditorFactory {

	@Override
	public IHaxeOptionCollectionEditor newInstance(Composite parent) {
		return new CompilerOptionCollectionEditor(parent, SWT.NONE);
	}

}
