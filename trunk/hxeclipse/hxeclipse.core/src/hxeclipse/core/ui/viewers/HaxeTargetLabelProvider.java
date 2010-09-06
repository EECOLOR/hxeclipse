package hxeclipse.core.ui.viewers;

import hxeclipse.core.HaxeTarget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class HaxeTargetLabelProvider extends LabelProvider {

	private static HaxeTargetLabelProvider _instance;
	
	public static HaxeTargetLabelProvider getInstance() {
		synchronized(HaxeTargetLabelProvider.class) {
			if (_instance == null) {
				_instance = new HaxeTargetLabelProvider();
			}
		}
		
		return _instance;
	}
	
	private List<Image> _images;
	
	public HaxeTargetLabelProvider() {
		_images = new ArrayList<Image>();
	}
	
	@Override
	public Image getImage(Object element) {
		@SuppressWarnings("rawtypes")
		HaxeTarget target = (HaxeTarget) element;
		
		Image image = target.getIcon().createImage();
		
		if (!_images.contains(image)) {
			_images.add(image);
		}
		
		return image;
	}

	@Override
	public String getText(Object element) {
		@SuppressWarnings("rawtypes")
		HaxeTarget target = (HaxeTarget) element;
		
		return target.getName();
	}

	@Override
	public void dispose() {
		super.dispose();
		
		Iterator<Image> images = _images.iterator();
		while (images.hasNext()) {
			images.next().dispose();
		}
	}

	
}
