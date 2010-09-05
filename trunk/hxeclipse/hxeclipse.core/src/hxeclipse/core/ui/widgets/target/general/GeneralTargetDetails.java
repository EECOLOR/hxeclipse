package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.model.TargetDescription;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class GeneralTargetDetails extends TabFolder {
	
	private SourcePathBlock _sourcePathBlock;
	private TargetDescription _targetDescription;
	
	public GeneralTargetDetails(Composite parent, int style, TargetDescription targetDescription) {
		super(parent, style);
		
		_targetDescription = targetDescription;
		
		initialize();
	}
	
	protected void initialize() {
		setLayout(new FillLayout());
		
		createSourcePathTab();
	}

	protected Composite createSourcePathTab() {
		TabItem tabItem = new TabItem(this, SWT.NONE);
		tabItem.setText("Source");
		
		_sourcePathBlock = new SourcePathBlock(this, SWT.NONE, _targetDescription);
		return _sourcePathBlock;
	}
}
