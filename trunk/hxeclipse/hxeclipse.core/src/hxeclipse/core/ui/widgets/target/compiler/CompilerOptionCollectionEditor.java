package hxeclipse.core.ui.widgets.target.compiler;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.internal.CompilerOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CompilerOptionCollectionEditor implements IHaxeOptionCollectionEditor {
	
	private TabFolder _tabFolder;
	private OptionsBlock _optionsBlock;
	private ConditionalCompilationFlagsBlock _conditionalCompilerFlagsBlock;
	
	public CompilerOptionCollectionEditor(Composite parent, int style) {
		_tabFolder = new TabFolder(parent, style);
		
		initialize();
	}
	
	protected void initialize() {
		_createSourceTab();
		_createLibrariesTab();
	}

	private void _createSourceTab() {
		_optionsBlock = new OptionsBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Options");
		tabItem.setControl(_optionsBlock);
	}
	
	private void _createLibrariesTab() {
		_conditionalCompilerFlagsBlock = new ConditionalCompilationFlagsBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Conditional compiler flags");
		tabItem.setControl(_conditionalCompilerFlagsBlock);
	}

	@Override
	public void setOptionCollection(IHaxeOptionCollection optionCollection) {
		CompilerOptionCollection compilerOptionCollection = (CompilerOptionCollection) optionCollection;
		_optionsBlock.setCompilerOptionCollection(compilerOptionCollection);
		_conditionalCompilerFlagsBlock.setCompilerOptionCollection(compilerOptionCollection);
	}

	@Override
	public void setProject(IProject project) {
	}

	@Override
	public void dispose() {
		_tabFolder.dispose();
	}

	@Override
	public void setLayoutData(Object layoutData) {
		_tabFolder.setLayoutData(layoutData);
	}
}
