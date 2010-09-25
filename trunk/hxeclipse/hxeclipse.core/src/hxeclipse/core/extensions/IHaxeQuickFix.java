package hxeclipse.core.extensions;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

public interface IHaxeQuickFix {
	public boolean canHandle(int problemType);
	public IMarkerResolution[] getResolutions(IMarker marker);
}
