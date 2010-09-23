package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.AbstractOutputOptionCollection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class OutputFileOption extends Composite {

	private Text _outputFileText;
	private AbstractOutputOptionCollection _abstractOutputOptionCollection;
	private IHaxeProject _haxeProject;

	public OutputFileOption(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_createOutputFile();
	}

	private void _createOutputFile() {
		new Label(this, SWT.NONE).setText("Output file:");
		
		_outputFileText = new Text(this, SWT.BORDER);
		_outputFileText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				IFile outputFile = _haxeProject.getOutputFolder().getFile(_outputFileText.getText());
				_abstractOutputOptionCollection.setOutputFile(outputFile);
			}
		});
	}

	public void setAbstractOutputOptionCollection(AbstractOutputOptionCollection abstractOutputOptionCollection) {
		_abstractOutputOptionCollection = abstractOutputOptionCollection;
		
		String outputFile = abstractOutputOptionCollection.getOutputFile().getName();
		
		_outputFileText.setText(outputFile);
	}
	
	public void setProject(IProject project) {
		_haxeProject = (IHaxeProject) project.getAdapter(IHaxeProject.class);
	}
}
