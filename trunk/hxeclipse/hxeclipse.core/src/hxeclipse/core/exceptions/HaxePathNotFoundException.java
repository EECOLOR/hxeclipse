package hxeclipse.core.exceptions;

public class HaxePathNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public HaxePathNotFoundException() {
	}

	public HaxePathNotFoundException(String message) {
		super(message);
	}

	public HaxePathNotFoundException(Throwable cause) {
		super(cause);
	}

	public HaxePathNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
