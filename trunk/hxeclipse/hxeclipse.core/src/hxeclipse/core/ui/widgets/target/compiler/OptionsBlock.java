package hxeclipse.core.ui.widgets.target.compiler;

import hxeclipse.core.internal.CompilerOptionCollection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class OptionsBlock extends Composite {

	private CompilerOptionCollection _compilerOptionCollection;
	
	private Button _includeDebugInformation;

	private Button _noInlining;

	private Button _noOptimalisation;

	private Button _noTraces;

	public OptionsBlock(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createOptions();
	}
	
	private void _createOptions() {
		_includeDebugInformation = new Button(this, SWT.CHECK);
		_includeDebugInformation.setText("Include debug information");
		_includeDebugInformation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_compilerOptionCollection.setIncludeDebugInformation(_includeDebugInformation.getGrayed());
			}
		});
		
		_noInlining = new Button(this, SWT.CHECK);
		_noInlining.setText("No inlining");
		_noInlining.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_compilerOptionCollection.setIncludeDebugInformation(_noInlining.getGrayed());
			}
		});
		
		_noOptimalisation = new Button(this, SWT.CHECK);
		_noOptimalisation.setText("No optimalisation");
		_noOptimalisation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_compilerOptionCollection.setIncludeDebugInformation(_noOptimalisation.getGrayed());
			}
		});
		
		_noTraces = new Button(this, SWT.CHECK);
		_noTraces.setText("No traces");
		_noTraces.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_compilerOptionCollection.setIncludeDebugInformation(_noTraces.getGrayed());
			}
		});
	}

	public void setCompilerOptionCollection(CompilerOptionCollection compilerOptionCollection) {
		_compilerOptionCollection = compilerOptionCollection;
		
		_includeDebugInformation.setGrayed(compilerOptionCollection.getIncludeDebugInformation());
		_noInlining.setGrayed(compilerOptionCollection.getNoInlining());
		_noOptimalisation.setGrayed(compilerOptionCollection.getNoOptimalisation());
		_noTraces.setGrayed(compilerOptionCollection.getNoTraces());
	}

}
