package hxeclipse.haxelib.ui.widgets;

import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.viewers.ColumnSorterListener;
import hxeclipse.core.ui.viewers.TableComparator;
import hxeclipse.core.ui.widgets.LabelText;
import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.model.LibraryRelease;
import hxeclipse.haxelib.ui.viewers.LibraryReleaseTableLabelProvider;

import java.net.URL;
import java.util.List;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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

	private Library _library;
	private LabelText _nameDisplay;
	private LabelText _tagsDisplay;
	private Text _descriptionDisplay;
	private Link _websiteDisplay;
	private LabelText _licenseDisplay;
	private LabelText _ownerDisplay;
	private LabelText _versionDisplay;
	private ListViewer _installedVersionList;
	private TableViewer _releaseList;
	protected IStructuredSelection _inStalledVersionSelection;
	
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
		
		_nameDisplay = new LabelText(leftPart, "Name:");
		_tagsDisplay = new LabelText(leftPart, "Tags:");
		_licenseDisplay = new LabelText(leftPart, "License:");
		_ownerDisplay = new LabelText(leftPart, "Owner:");
		_versionDisplay = new LabelText(leftPart, "Latest version:");
		createInstalledVersionList(leftPart);
		
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

	protected ListViewer createInstalledVersionList(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.NONE, SWT.BEGINNING, false, false));
		label.setText("Installed versions:");
		
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		
		_installedVersionList = new ListViewer(parent);
		_installedVersionList.getControl().setLayoutData(layoutData);
		_installedVersionList.setComparator(new WorkbenchViewerComparator());
		_installedVersionList.setContentProvider(ArrayContentProvider.getInstance());
		_installedVersionList.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				LibraryRelease libraryRelease = (LibraryRelease) element;
				return libraryRelease.isInstalled();
			}
		});
		_installedVersionList.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				LibraryRelease libraryRelease = (LibraryRelease) element;
				return super.getText(libraryRelease.getVersion() + (libraryRelease.isCurrent() ? " *" : ""));
			}
			
		});
		_installedVersionList.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_inStalledVersionSelection = (IStructuredSelection) _installedVersionList.getSelection();
			}
		});
		
		return _installedVersionList;
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
	
	public void setLibrary(Library haxeLibrary) {
		_library = haxeLibrary;
		
		_nameDisplay.setText(_library.getName());
		_tagsDisplay.setText(_library.getTags());
		_descriptionDisplay.setText(_library.getDescription());
		_websiteDisplay.setText("<a>" + _library.getWebsite() + "</a>");
		_licenseDisplay.setText(_library.getLicense());
		_ownerDisplay.setText(_library.getOwner());
		_versionDisplay.setText(_library.getLatestVersion());
		
		List<LibraryRelease> releases = _library.getReleases();
		_installedVersionList.setInput(releases);
		_releaseList.setInput(haxeLibrary.getReleases());
		
		_releaseList.getControl().getParent().layout(true);
		
		layout();
	}

	public Library getHaxeLibrary() {
		return _library;
	}

	@Override
	public void setInput(Object input) {
		if (input instanceof Library) {
			setLibrary((Library) input);
		} else
		{
			_clear();
		}
	}

	private void _clear() {
		_library = null;
		
		_nameDisplay.setText("");
		_tagsDisplay.setText("");
		_descriptionDisplay.setText("");
		_websiteDisplay.setText("");
		_licenseDisplay.setText("");
		_ownerDisplay.setText("");
		_versionDisplay.setText("");
		
		_installedVersionList.setInput(null);
		_releaseList.setInput(null);
		
		_releaseList.getControl().getParent().layout(true);
		
		layout();
	}

	public LibraryRelease getSelectedInstalledRelease() {
		IStructuredSelection selection = _inStalledVersionSelection;
		
		LibraryRelease libraryRelease = null;
		if (!selection.isEmpty() && selection.size() == 1) {
			libraryRelease = (LibraryRelease) selection.getFirstElement();
		}
		
		return libraryRelease;
	}
}
