package hxeclipse.core.ui.viewers;

import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.extensions.ITargetDescription;

import org.eclipse.swt.graphics.Image;

public class HaxeTargetTreeLabelProvider extends HaxeTargetLabelProvider {

	private static HaxeTargetTreeLabelProvider _instance;
	
	public static HaxeTargetTreeLabelProvider getInstance() {
		synchronized(HaxeTargetTreeLabelProvider.class) {
			if (_instance == null) {
				_instance = new HaxeTargetTreeLabelProvider();
			}
		}
		
		return _instance;
	}
	
	@Override
	public Image getImage(Object element) {
		
		if (element instanceof ITargetDescription) {
			return super.getImage(((ITargetDescription) element).getHaxeTarget());
		}
		
		return null;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof ITargetDescription) {
			return super.getText(((ITargetDescription) element).getHaxeTarget());
		}
		
		if (element instanceof IOptionCollection)
		{
			return ((IOptionCollection) element).getName();
		}
		
		return null;
	}
}
