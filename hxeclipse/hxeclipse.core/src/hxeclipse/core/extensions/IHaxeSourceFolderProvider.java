package hxeclipse.core.extensions;

import java.util.List;

import org.eclipse.core.resources.IFolder;

public interface IHaxeSourceFolderProvider {
	public List<IFolder> getSourceFolders();
}
