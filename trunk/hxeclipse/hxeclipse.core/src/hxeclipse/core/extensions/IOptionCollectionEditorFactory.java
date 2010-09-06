package hxeclipse.core.extensions;

import org.eclipse.swt.widgets.Composite;

public interface IOptionCollectionEditorFactory {
	public IOptionCollectionEditor newInstance(Composite parent);
}
