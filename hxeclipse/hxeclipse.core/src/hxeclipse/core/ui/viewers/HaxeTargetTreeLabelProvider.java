package hxeclipse.core.ui.viewers;

import hxeclipse.core.extensions.IHaxeOptionCollection;
import hxeclipse.core.extensions.IHaxeTargetDescription;

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
		
		if (element instanceof IHaxeTargetDescription) {
			return super.getImage(((IHaxeTargetDescription) element).getHaxeTarget());
		}
		
		return null;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof IHaxeTargetDescription) {
			return super.getText(((IHaxeTargetDescription) element).getHaxeTarget());
		}
		
		if (element instanceof IHaxeOptionCollection)
		{
			return ((IHaxeOptionCollection) element).getName();
		}
		
		return null;
	}
}
