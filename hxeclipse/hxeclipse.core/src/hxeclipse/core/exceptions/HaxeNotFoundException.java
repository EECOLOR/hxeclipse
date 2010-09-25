package hxeclipse.core.exceptions;

public class HaxeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public HaxeNotFoundException() {
	}

	public HaxeNotFoundException(String message) {
		super(message);
	}

	public HaxeNotFoundException(Throwable cause) {
		super(cause);
	}

	public HaxeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
