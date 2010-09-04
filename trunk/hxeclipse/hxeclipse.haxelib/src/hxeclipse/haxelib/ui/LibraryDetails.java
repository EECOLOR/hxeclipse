package hxeclipse.haxelib.ui;

import hxeclipse.core.ui.ColumnSorterListener;
import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.TableComparator;
import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.model.LibraryRelease;

import java.net.URL;
import java.util.List;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchViewerComparator;

public class LibraryDetails extends Composite implements IInputConsumer {

	private Library _haxeLibrary;
	private Text _nameDisplay;
	private Text _tagsDisplay;
	private Text _descriptionDisplay;
	private Link _websiteDisplay;
	private Text _licenseDisplay;
	private Text _ownerDisplay;
	private Text _versionDisplay;
	private ListViewer _versionList;
	private TableViewer _releaseList;
	
	public LibraryDetails(Composite parent, int style) {
		super(parent, style);
		
		_initialize();
		createDetails();
		createReleasePart();
	}
	
	private void _initialize() {
		GridLayout layout = new GridLayout(1, false);
		setLayout(layout);
	}
	
	protected Composite createDetails() {
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		
		Composite details = new Composite(this, SWT.NONE);
		details.setLayout(gridLayout);
		details.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		createDetailsLeftPart(details);
		
		createDetailsRightPart(details);
		
		return details;
	}

	protected Composite createDetailsLeftPart(Composite details) {
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		
		Composite leftPart = new Composite(details, SWT.NONE);
		leftPart.setLayout(layout);
		leftPart.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		_nameDisplay = _createText("Name:", leftPart);
		_tagsDisplay = _createText("Tags:", leftPart);
		_licenseDisplay = _createText("License:", leftPart);
		_ownerDisplay = _createText("Owner:", leftPart);
		_versionDisplay = _createText("Latest version:", leftPart);
		createVersionList(leftPart);
		
		return leftPart;
	}

	protected Composite createDetailsRightPart(Composite details) {
		Composite rightPart = new Composite(details, SWT.NONE);
		rightPart.setLayout(new GridLayout());
		rightPart.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Link link = new Link(rightPart, SWT.SINGLE);
		link.setFont(getFont());
		link.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					PlatformUI.getWorkbench().getBrowserSupport().createBrowser(null).openURL(new URL(event.text));
				} catch (Exception e) {
					//ignore any errors
				}
			}
		});
		_websiteDisplay = link;
		
		Text text = new Text(rightPart, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		text.setFont(getFont());
		text.setEditable(false);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 60;
		layoutData.widthHint = 100;
		text.setLayoutData(layoutData);
		_descriptionDisplay = text;		
		
		return rightPart;
	}

	protected ListViewer createVersionList(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.NONE, SWT.BEGINNING, false, false));
		label.setText("Installed versions:");
		
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		
		_versionList = new ListViewer(parent);
		_versionList.getControl().setLayoutData(layoutData);
		_versionList.setComparator(new WorkbenchViewerComparator());
		_versionList.setContentProvider(ArrayContentProvider.getInstance());
		_versionList.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				LibraryRelease libraryRelease = (LibraryRelease) element;
				return libraryRelease.isInstalled();
			}
		});
		_versionList.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				LibraryRelease libraryRelease = (LibraryRelease) element;
				return super.getText(libraryRelease.getVersion() + (libraryRelease.isCurrent() ? " *" : ""));
			}
			
		});
		
		return _versionList;
	}	

	protected Composite createReleasePart() {
		Label label = new Label(this, SWT.NONE);
		label.setText("Releases:");
		
		TableColumnLayout tableLayout = new TableColumnLayout();
		
		//this composite allows us to manage the table columns through tableLayour
		Composite composite = new Composite(this, SWT.NONE);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		composite.setLayoutData(layoutData);
		composite.setLayout(tableLayout);
		
		createReleaseTable(composite, tableLayout);
		
		return composite;
	}

	protected TableViewer createReleaseTable(Composite parent, TableColumnLayout tableLayout) {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		
		_releaseList = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		_releaseList.getControl().setLayoutData(layoutData);
		
		//columns
		String[] titles = {"Date", "Version", "Description"};
		int[] weights = {1, 1, 4};
		
		for (int i = 0; i < titles.length; i++) {
			TableViewerColumn tableViewerColumn = new TableViewerColumn(_releaseList, SWT.NONE);
			TableColumn column = tableViewerColumn.getColumn();
			column.setText(titles[i]);
			column.addSelectionListener(new ColumnSorterListener(_releaseList));
			
			//give the column it's layout properties
			tableLayout.setColumnData(column, new ColumnWeightData(weights[i], 100, true));
		}
		
		//table properties
		Table table = _releaseList.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		TableColumn defaultSortColumn = table.getColumn(1);
		table.setSortColumn(defaultSortColumn);
		table.setSortDirection(SWT.DOWN);
		
		_releaseList.setComparator(new TableComparator());
		_releaseList.setContentProvider(ArrayContentProvider.getInstance());
		_releaseList.setLabelProvider(new LibraryReleaseTableLabelProvider());
		
		return _releaseList;
	}
	
	private Text _createText(String labelText, Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(labelText);
		
		Text text = new Text(parent, SWT.SINGLE | SWT.BORDER);
		text.setFont(this.getFont());
		text.setEditable(false);
		GridData layoutData = new GridData(SWT.FILL, SWT.NONE, true, false);
		//layoutData.widthHint = 100;
		text.setLayoutData(layoutData);

		return text;
	}
	
	public void setHaxeLibrary(Library haxeLibrary) {
		_haxeLibrary = haxeLibrary;
		
		_nameDisplay.setText(_haxeLibrary.getName());
		_tagsDisplay.setText(_haxeLibrary.getTags());
		_descriptionDisplay.setText(_haxeLibrary.getDescription());
		_websiteDisplay.setText("<a>" + _haxeLibrary.getWebsite() + "</a>");
		_licenseDisplay.setText(_haxeLibrary.getLicense());
		_ownerDisplay.setText(_haxeLibrary.getOwner());
		_versionDisplay.setText(_haxeLibrary.getLatestVersion());
		
		List<LibraryRelease> releases = _haxeLibrary.getReleases();
		_versionList.setInput(releases);
		_releaseList.setInput(haxeLibrary.getReleases());
		
		_releaseList.getControl().getParent().layout(true);
		
		layout();
	}

	public Library getHaxeLibrary() {
		return _haxeLibrary;
	}

	@Override
	public void setInput(Object input) {
		if (input instanceof Library) {
			setHaxeLibrary((Library) input);
		} else
		{
			_clear();
		}
	}

	private void _clear() {
		_haxeLibrary = null;
		
		_nameDisplay.setText("");
		_tagsDisplay.setText("");
		_descriptionDisplay.setText("");
		_websiteDisplay.setText("");
		_licenseDisplay.setText("");
		_ownerDisplay.setText("");
		_versionDisplay.setText("");
		
		_versionList.setInput(null);
		_releaseList.setInput(null);
		
		_releaseList.getControl().getParent().layout(true);
		
		layout();
	}
}
