package hxeclipse.core.ui.widgets;

import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.viewers.PatternFilter;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

abstract public class ListDetails extends Composite implements ISelectionProvider, IInputConsumer {

	private ListenerList _selectionChangedListeners = new ListenerList();
	private StructuredViewer _listViewer; 
	private IInputConsumer _details;
	private PatternFilter _filter;
	private Text _filterText;
	
	public ListDetails(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		Composite container = createContainer(this);
		_filter = new PatternFilter();
		
		createListContainer(container);
		_details = createDetails(container);
	}

	protected Composite createContainer(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		container.setLayout(layout);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		return container;
	}
	
	protected void createListContainer(Composite parent) {
		GridData containerLayout = new GridData(SWT.NONE, SWT.FILL, false, true);
		containerLayout.widthHint = 200;
		
		Composite listContainer = new Composite(parent, SWT.NONE);
		listContainer.setLayout(new GridLayout());
		listContainer.setLayoutData(containerLayout);
		
		_filterText = createFilterText(listContainer);
		
		_listViewer = createList(listContainer);
	}

	protected Text createFilterText(Composite listContainer) {
		//filter text
		final Text filterText = new Text(listContainer, SWT.BORDER | SWT.SEARCH);
		filterText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		filterText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//setFilterInput(filterText.getText());
				_filter.setPattern(filterText.getText());
				_listViewer.refresh();
			}
		});
		
		return filterText;
	}

	protected StructuredViewer createList(Composite listContainer) {
		//list viewer
		StructuredViewer listViewer = createViewer(listContainer);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		listViewer.getControl().setLayoutData(layoutData);
		
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				fireSelectionChanged(event);
				updateDetails();
			}
		});
		
		listViewer.addFilter(_filter);
		return listViewer;
	}

	protected StructuredViewer createViewer(Composite container) {
		return  new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	}
	
    protected void fireSelectionChanged(final SelectionChangedEvent event) {
        Object[] listeners = _selectionChangedListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
            SafeRunnable.run(new SafeRunnable() {
                public void run() {
                    l.selectionChanged(event);
                }
            });
        }
    }	
	
	abstract protected IInputConsumer createDetails(Composite parent);
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		_selectionChangedListeners.add(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		_selectionChangedListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		return _listViewer.getSelection();
	}

	@Override
	public void setSelection(ISelection selection) {
		_listViewer.setSelection(selection);		
	}

	public void setInput(Object input) {
		_listViewer.setInput(input);
		layout(true);
	}
	
	public void setContentProvider(IContentProvider provider) {
		_listViewer.setContentProvider(provider);
	}
	
	public void setLabelProvider(IBaseLabelProvider labelProvider) {
		_listViewer.setLabelProvider(labelProvider);
	}
	
	public void setComparator(ViewerComparator comparator) {
		_listViewer.setComparator(comparator);
	}
	
	protected void updateDetails() {
		IStructuredSelection selection = (IStructuredSelection) _listViewer.getSelection();
		
		Object input = null;
		
		if (!selection.isEmpty()) {
			input = selection.getFirstElement();
		}
		
		_details.setInput(input);
	}

	@Override
	public boolean setFocus() {
		return _filterText.setFocus();
	}
	
	public void refresh() {
		_listViewer.refresh();
		_listViewer.setSelection(null);
		_details.setInput(null);
	}
}
