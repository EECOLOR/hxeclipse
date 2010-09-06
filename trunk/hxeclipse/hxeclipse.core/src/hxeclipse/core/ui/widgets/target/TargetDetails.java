package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.IOptionCollectionEditor;
import hxeclipse.core.extensions.IOptionCollectionEditorFactory;
import hxeclipse.core.internal.TargetManager;
import hxeclipse.core.ui.IInputConsumer;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class TargetDetails extends Composite implements IInputConsumer {

	private IProject _project;
	private IOptionCollectionEditor _optionCollectionEditor;

	public TargetDetails(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
	}
	
	private void setOptionCollection(IOptionCollection optionCollection) {
		TargetManager targetManager = HXEclipse.getTargetManager();
		
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		layoutData.heightHint = 100;
		
		IOptionCollectionEditorFactory optionCollectionEditorFactory = targetManager.getOptionCollectionEditorFactory(optionCollection);
		_optionCollectionEditor = optionCollectionEditorFactory.newInstance(this);
		_optionCollectionEditor.setProject(_project);
		_optionCollectionEditor.setOptionCollection(optionCollection);
		_optionCollectionEditor.setLayoutData(layoutData);
		layout(true);
	}

	private void _clear() {
		if (_optionCollectionEditor != null) {
			_optionCollectionEditor.dispose();
			layout(true);
		}
	}	
	
	@Override
	public void setInput(Object input) {
		_clear();
		
		if (input instanceof IOptionCollection) {
			setOptionCollection((IOptionCollection) input);
		}
	}
	
	public void setProject(IProject project) {
		_project = project;
	}
}
