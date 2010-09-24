package hxeclipse.core.exceptions;

public class NekoPathNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NekoPathNotFoundException() {
	}

	public NekoPathNotFoundException(String message) {
		super(message);
	}

	public NekoPathNotFoundException(Throwable cause) {
		super(cause);
	}

	public NekoPathNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
