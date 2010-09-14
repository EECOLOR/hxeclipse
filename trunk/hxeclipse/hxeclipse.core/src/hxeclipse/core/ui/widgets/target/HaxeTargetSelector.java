package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.internal.HaxeTarget;
import hxeclipse.core.ui.viewers.HaxeTargetLabelProvider;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class HaxeTargetSelector extends Dialog {

	private TableViewer _tableViewer;
	private HaxeTarget _haxeTarget;
	
	public HaxeTargetSelector(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite dialogArea = (Composite) super.createDialogArea(parent);
		
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		layoutData.heightHint = 200;
		
		_tableViewer = new TableViewer(dialogArea, SWT.SINGLE | SWT.BORDER);
		_tableViewer.getControl().setLayoutData(layoutData);
		_tableViewer.setComparator(new ViewerComparator());
		_tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		_tableViewer.setLabelProvider(HaxeTargetLabelProvider.getInstance());
		_tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_tableViewerSelectionChanged();
			}
		});
		
		_tableViewer.setInput(HXEclipse.getTargetManager().getTargets());
		
		return dialogArea;
	}
	
	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);
		
		if (id == IDialogConstants.OK_ID) {
			button.setEnabled(false);
		}
		
		return button;
	}

	private void _tableViewerSelectionChanged() {
		IStructuredSelection selection = (IStructuredSelection) _tableViewer.getSelection();
		
		boolean empty = selection.isEmpty();
		
		Button okButton = getButton(IDialogConstants.OK_ID);
		okButton.setEnabled(!empty);
		
		if (empty) {
			_haxeTarget = null;
		} else
		{
			_haxeTarget = (HaxeTarget) selection.getFirstElement();
		}
	}

	public HaxeTarget getSelectedHaxeTarget()
	{
		return _haxeTarget;
	}
}
