package hxeclipse.haxelib.ui;

import java.text.SimpleDateFormat;
import java.util.Date;

import hxeclipse.haxelib.model.LibraryRelease;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class LibraryReleaseTableLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		LibraryRelease haxeLibraryRelease = (LibraryRelease) element;
		
		switch (columnIndex)
		{
			case 0: 
				Date date = haxeLibraryRelease.getDate();
				if (date == null) {
					return "";
				} else {
					return SimpleDateFormat.getDateInstance().format(date);
				}
			case 1: return haxeLibraryRelease.getVersion();
			case 2: 
				String description = haxeLibraryRelease.getDescription();
				if (description == null) {
					return "";
				} else
				{
					return description.trim();
				}
		}
		throw new RuntimeException("This should not happen");
	}

}
