package exception.handling;

public class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5493468133679385482L;

	public MyCustomException() {
		super();
	}

	public MyCustomException(Throwable t) {
		super(t);
	}

	public MyCustomException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "In my program, I'm getting this custom message - " + super.getMessage();
	}
}
