package hxeclipse.core.extensions;

import org.eclipse.core.resources.IProject;

public interface IOptionCollectionEditor {
	public void setOptionCollection(IOptionCollection optionCollection);
	public void setProject(IProject project);
	public void dispose();
	public void setLayoutData(Object layoutData);
}
