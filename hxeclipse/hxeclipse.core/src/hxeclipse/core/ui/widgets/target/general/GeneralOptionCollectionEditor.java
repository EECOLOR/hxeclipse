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
	private MappingsBlock _mappingsBlock;
	
	public GeneralOptionCollectionEditor(Composite parent, int style) {
		_tabFolder = new TabFolder(parent, style);
		
		initialize();
	}
	
	protected void initialize() {
		_createSourceTab();
		_createLibrariesTab();
		_createResourcesTab();
		_createMappingsTab();
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
	
	private void _createMappingsTab() {
		_mappingsBlock = new MappingsBlock(_tabFolder, SWT.NONE);
		
		TabItem tabItem = new TabItem(_tabFolder, SWT.NONE);
		tabItem.setText("Mappings");
		tabItem.setControl(_mappingsBlock);
	}

	@Override
	public void setOptionCollection(IHaxeOptionCollection optionCollection) {
		GeneralOptionCollection generalOptionCollection = (GeneralOptionCollection) optionCollection;
		_sourceBlock.setGeneralOptionCollection(generalOptionCollection);
		_librariesBlock.setGeneralOptionCollection(generalOptionCollection);
		_resourcesBlock.setGeneralOptionCollection(generalOptionCollection);
		_mappingsBlock.setGeneralOptionCollection(generalOptionCollection);
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
