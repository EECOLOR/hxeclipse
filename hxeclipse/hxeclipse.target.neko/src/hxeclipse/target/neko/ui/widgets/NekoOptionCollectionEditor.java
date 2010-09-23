package hxeclipse.target.neko.ui.widgets;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.ui.widgets.target.options.OutputFileOption;
import hxeclipse.target.neko.extensions.NekoOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class NekoOptionCollectionEditor extends Composite implements IHaxeOptionCollectionEditor {

	private Button _outputSourceButton;
	private NekoOptionCollection _nekoOptionCollection;
	private OutputFileOption _outputFileOption;

	public NekoOptionCollectionEditor(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createOutputFileOption();
		_createOutputSourceOption();
	}

	private void _createOutputFileOption() {
		_outputFileOption = new OutputFileOption(this, SWT.NONE);
		_outputFileOption.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
	}

	private void _createOutputSourceOption() {
		_outputSourceButton = new Button(this, SWT.CHECK);
		_outputSourceButton.setText("Output source");
		_outputSourceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_nekoOptionCollection.setOutputSource(_outputSourceButton.getGrayed());
			}
		});
	}

	@Override
	public void setOptionCollection(IHaxeOptionCollection optionCollection) {
		_nekoOptionCollection = (NekoOptionCollection) optionCollection;
		
		_outputSourceButton.setGrayed(_nekoOptionCollection.getOutputSource());
		_outputFileOption.setAbstractOutputOptionCollection(_nekoOptionCollection);
	}

	@Override
	public void setProject(IProject project) {
		_outputFileOption.setProject(project);
	}

}
