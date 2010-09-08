package hxeclipse.core.extensions;

import org.eclipse.core.resources.IProject;

public interface IHaxeOptionCollectionEditor {
	public void setOptionCollection(IHaxeOptionCollection optionCollection);
	public void setProject(IProject project);
	public void dispose();
	public void setLayoutData(Object layoutData);
}
