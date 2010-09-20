package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollectionEditor;
import hxeclipse.core.internal.GeneralOptionCollection;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class GeneralOptionCollectionEditor implements IHaxeOptionCollectionEditor {
	
	private TabFolder _tabFolder;
	private SourceBlock _sourceBlock;
	private LibrariesBlock _librariesBlock;
	private ResourcesBlock _resourcesBlock;
	
	public GeneralOptionCollectionEditor(Composite parent, int style) {
		_tabFolder = new TabFolder(parent, style);
		
		initialize();
	}
	
	protected void initialize() {
		_createSourceTab();
		_createLibrariesTab();
		_createResourcesTab();
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

	private void _createResourcesTab() {
		_resourcesBlock = new ResourcesBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Resources");
		tabItem.setControl(_resourcesBlock);
	}

	@Override
	public void setOptionCollection(IHaxeOptionCollection optionCollection) {
		GeneralOptionCollection generalOptionsCollection = (GeneralOptionCollection) optionCollection;
		_sourceBlock.setGeneralOptionCollection(generalOptionsCollection);
		_librariesBlock.setGeneralOptionCollection(generalOptionsCollection);
		_resourcesBlock.setGeneralOptionCollection(generalOptionsCollection);
	}

	@Override
	public void setProject(IProject project) {
		_sourceBlock.setProject(project);
		_resourcesBlock.setProject(project);
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
