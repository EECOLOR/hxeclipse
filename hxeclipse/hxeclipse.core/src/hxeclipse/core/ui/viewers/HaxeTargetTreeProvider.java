package hxeclipse.core.ui.viewers;

import java.util.List;

import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.ITargetDescription;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class HaxeTargetTreeProvider extends ArrayContentProvider implements ITreeContentProvider {

	private static HaxeTargetTreeProvider _instance;

	public static HaxeTargetTreeProvider getInstance() {
		synchronized(HaxeTargetTreeProvider.class) {
			if (_instance == null) {
				_instance = new HaxeTargetTreeProvider();
			}
			return _instance;
		}
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ITargetDescription) {
			return _getOptionCollection(parentElement).toArray();
		}
		return new Object[0];
	}

	private List<IOptionCollection> _getOptionCollection(Object element) {
		if (element instanceof ITargetDescription) {
			return ((ITargetDescription) element).getOptionCollections();
		} 
		
		return null;
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ITargetDescription) {
			return !_getOptionCollection(element).isEmpty();
		}
		return false;
	}

	@Override
	public Object getParent(Object element) {
		//not implemented
		return null;
	}
	
	@Override
	public void dispose() {
		//not implemented
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//not implemented
	}

}
