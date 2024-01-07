package exception.handling;

public class MyCustomNumberFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5493468133679385482L;

	public MyCustomNumberFormatException(NumberFormatException t) {
		super(t);
	}

	@Override
	public String getMessage() {
		return "My custom number format exception - " + super.getMessage();
	}
}
