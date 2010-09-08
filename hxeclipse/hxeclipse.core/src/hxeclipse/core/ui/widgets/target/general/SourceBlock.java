package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.ui.widgets.FolderSelectionField;
import hxeclipse.core.ui.widgets.target.options.ClassPathOption;
import hxeclipse.core.ui.widgets.target.options.MainOption;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.AdaptableList;

public class SourceBlock extends Composite {

	private MainOption _mainOption;
	private ClassPathOption _classPathOption;
	private FolderSelectionField _outputPathOption;
	private GeneralOptionCollection _generalOptionCollection;
	
	public SourceBlock(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createMain();
		_createClassPaths();
		_createOutputPath();
	}

	private void _createMain() {
		_mainOption = new MainOption(this, SWT.NONE);
		_mainOption.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_mainOption.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) _mainOption.getSelection();
				_generalOptionCollection.setMain((IHaxeClass) selection.getFirstElement());
			}
		});
	}

	private void _createClassPaths() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		
		_classPathOption = new ClassPathOption(this, SWT.NONE);
		_classPathOption.setLayoutData(layoutData);
	}
	
	private void _createOutputPath() {
		_outputPathOption = new FolderSelectionField(this, SWT.NONE);
		_outputPathOption.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_outputPathOption.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) _outputPathOption.getSelection();
				_generalOptionCollection.setOutputFolder((IFolder) selection.getFirstElement());
			}
		});
	}

	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionCollection) {
		_generalOptionCollection = generalOptionCollection;
		
		//add all source paths to the adaptable list
		AdaptableList adaptableList = new AdaptableList(_generalOptionCollection.getSourceFolders());
		_mainOption.setInput(adaptableList);
		
		_classPathOption.setInput(_generalOptionCollection.getSourceFolders());

		_outputPathOption.setInput(_generalOptionCollection.getOutputFolder());
		
		layout();
	}

	public void setProject(IProject project) {
		_classPathOption.setProject(project);
	}
}
