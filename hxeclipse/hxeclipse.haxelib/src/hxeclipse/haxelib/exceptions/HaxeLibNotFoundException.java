package hxeclipse.haxelib.exceptions;

public class HaxeLibNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public HaxeLibNotFoundException() {
	}

	public HaxeLibNotFoundException(String message) {
		super(message);
	}

	public HaxeLibNotFoundException(Throwable cause) {
		super(cause);
	}

	public HaxeLibNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
