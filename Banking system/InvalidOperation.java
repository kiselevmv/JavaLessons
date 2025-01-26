public class InvalidOperation extends Exception {
	public InvalidOperation(String message) {
		super(message);
		System.out.println("Invalid operation");
	}
	
}