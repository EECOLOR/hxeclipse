package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.model.TargetDescription;
import hxeclipse.core.ui.widgets.options.MainSelector;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.AdaptableList;

public class SourcePathBlock extends Composite {

	private MainSelector _mainSelector;
	private TargetDescription _targetDescription;
	
	public SourcePathBlock(Composite parent, int style, TargetDescription targetDescription) {
		super(parent, style);
		
		_targetDescription = targetDescription;
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		createMain();
	}

	protected void createMain() {
		//add all source paths to the adaptable list
		AdaptableList adaptableList = new AdaptableList(_targetDescription.getSourcePaths());
		
		_mainSelector = new MainSelector(this, SWT.NONE);
		_mainSelector.setInput(adaptableList);
		_mainSelector.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) _mainSelector.getSelection();
				_targetDescription.setMain((IHaxeClass) selection.getFirstElement());
			}
		});
	}

	
}
