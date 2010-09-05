package hxeclipse.haxelib.ui.preference;

import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.eclipse.jface.preference.ListEditor;

public class LibraryEditor extends ListEditor {

	@Override
	protected String createList(String[] items) {
		StringBuffer libraries = new StringBuffer();
		
		for (int i = 0; i < items.length; i++) {
			libraries.append(items[i]);
			libraries.append(File.pathSeparator);
		}
		return libraries.toString();
	}

	@Override
	protected String getNewInputObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] parseString(String stringList) {
		StringTokenizer tokenizer = new StringTokenizer(stringList, File.pathSeparator);
		ArrayList<String> libraries = new ArrayList<String>();
		while (tokenizer.hasMoreElements()) {
		    libraries.add(tokenizer.nextToken());
		}
		return libraries.toArray(new String[libraries.size()]);
	}

}
