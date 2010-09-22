package hxeclipse.core.ui.widgets.target.compiler;

import hxeclipse.core.internal.CompilerOptionCollection;
import hxeclipse.core.ui.widgets.target.compiler.options.ConditionalCompilationFlagsOption;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ConditionalCompilationFlagsBlock extends Composite {

	private ConditionalCompilationFlagsOption _conditionalCompilationFlagsOption;

	public ConditionalCompilationFlagsBlock(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createLibrariesOption();
	}

	private void _createLibrariesOption() {
		_conditionalCompilationFlagsOption = new ConditionalCompilationFlagsOption(this, SWT.NONE);
		_conditionalCompilationFlagsOption.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	public void setCompilerOptionCollection(CompilerOptionCollection compilerOptionsCollection) {
		_conditionalCompilationFlagsOption.setCompilerOptionCollection(compilerOptionsCollection);
	}
}
