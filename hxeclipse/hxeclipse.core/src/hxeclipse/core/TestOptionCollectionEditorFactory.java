package hxeclipse.core;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditorFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TestOptionCollectionEditorFactory implements IHaxeOptionCollectionEditorFactory {

	@Override
	public IHaxeOptionCollectionEditor newInstance(Composite parent) {
		return new TestOptionCollectionEditor(parent, SWT.NONE);
	}

	class TestOptionCollectionEditor extends Composite implements IHaxeOptionCollectionEditor {

		private Text _text;

		public TestOptionCollectionEditor(Composite parent, int style) {
			super(parent, style);
			
			_text = new Text(parent, SWT.NONE);
		}

		@Override
		public void setOptionCollection(IHaxeOptionCollection optionCollection) {
			TestOptionCollection testOptionCollection = (TestOptionCollection) optionCollection;
			_text.setText(testOptionCollection.getTest());
		}

		@Override
		public void setProject(IProject project) {
		}
		
	}
	
}
