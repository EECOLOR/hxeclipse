package hxeclipse.core.ui;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ColumnSorterListener extends SelectionAdapter {

	private TableViewer _tableViewer;
	
	public ColumnSorterListener(TableViewer tableViewer) {
		_tableViewer = tableViewer;
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		TableColumn tableColumn = (TableColumn) e.widget;
		Table table = tableColumn.getParent();
		
		if (_tableViewer.getTable() == table) {
			
			int direction = table.getSortDirection();
			
			if (table.getSortColumn() == tableColumn) {
				//swtich direction
				direction = direction == SWT.UP ? SWT.DOWN : SWT.UP;
			} else
			{
				//default to down
				direction = SWT.DOWN;
				//set the new sort column
				table.setSortColumn(tableColumn);
			}
			table.setSortDirection(direction);
			
			//refresh the viewer
			_tableViewer.refresh();
		}
	}

}
