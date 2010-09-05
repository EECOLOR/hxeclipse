package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.model.TargetDescription;
import hxeclipse.core.ui.IInputConsumer;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class TargetDetails extends Composite implements IInputConsumer {

	public TargetDetails(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		createDetails();
	}
	
	protected void createDetails() {
		
	}

	public void setTarget(TargetDescription targetDescription) {
		// TODO Auto-generated method stub
		targetDescription.getMain();
	}

	private void _clear() {
		// TODO Auto-generated method stub
	}	
	
	@Override
	public void setInput(Object input) {
		if (input instanceof TargetDescription) {
			setTarget((TargetDescription) input);
		} else
		{
			_clear();
		}
	}
}
