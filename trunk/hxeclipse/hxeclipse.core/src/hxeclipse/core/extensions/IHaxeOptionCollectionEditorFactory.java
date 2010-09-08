package hxeclipse.core.extensions;

import org.eclipse.swt.widgets.Composite;

public interface IHaxeOptionCollectionEditorFactory {
	public IHaxeOptionCollectionEditor newInstance(Composite parent);
}
