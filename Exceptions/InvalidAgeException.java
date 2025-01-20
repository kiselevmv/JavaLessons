public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
		System.out.println("Invalid age");
	}
	
}

