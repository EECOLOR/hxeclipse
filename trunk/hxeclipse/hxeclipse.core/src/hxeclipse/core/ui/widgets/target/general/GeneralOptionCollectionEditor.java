package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.IOptionCollectionEditor;
import hxeclipse.core.model.GeneralOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class GeneralOptionCollectionEditor implements IOptionCollectionEditor {
	
	private TabFolder _tabFolder;
	private SourceBlock _sourceBlock;
	private LibrariesBlock _librariesBlock;
	
	public GeneralOptionCollectionEditor(Composite parent, int style) {
		_tabFolder = new TabFolder(parent, style);
		
		initialize();
	}
	
	protected void initialize() {
		_createSourceTab();
		_createLibrariesTab();
	}

	private void _createSourceTab() {
		_sourceBlock = new SourceBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Source");
		tabItem.setControl(_sourceBlock);
	}
	
	private void _createLibrariesTab() {
		_librariesBlock = new LibrariesBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Libraries");
		tabItem.setControl(_librariesBlock);
	}

	@Override
	public void setOptionCollection(IOptionCollection optionCollection) {
		GeneralOptionCollection generalOptionsCollection = (GeneralOptionCollection) optionCollection;
		_sourceBlock.setGeneralOptionCollection(generalOptionsCollection);
		_librariesBlock.setGeneralOptionCollection(generalOptionsCollection);
	}

	@Override
	public void setProject(IProject project) {
		_sourceBlock.setProject(project);
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
