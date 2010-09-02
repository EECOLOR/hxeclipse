package hxeclipse.core.ui;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TableComparator extends ViewerComparator {
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		
		TableViewer tableViewer = (TableViewer) viewer;
		Table table = tableViewer.getTable();
		TableColumn sortColumn = table.getSortColumn();
		int sortDirection = table.getSortDirection();
		
		//find the column index
		int columnIndex = 0;
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			if (columns[i] == sortColumn) {
				columnIndex = i;
				break;
			}
		}

		int direction = sortDirection == SWT.UP ? 1 : -1;
		
		return direction * compareColumn(tableViewer, e1, e2, columnIndex);
	}
	
	protected int compareColumn(TableViewer tableViewer, Object e1, Object e2, int columnIndex) {
		ITableLabelProvider labelProvider = (ITableLabelProvider) tableViewer.getLabelProvider();
		String label1 = labelProvider.getColumnText(e1, columnIndex);
		String label2 = labelProvider.getColumnText(e2, columnIndex);
		
		return super.compare(tableViewer, label1, label2);
	}
}
