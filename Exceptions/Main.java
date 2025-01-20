import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void checkAge(int age) throws InvalidAgeException {
		try {
			if (age < 18) { throw new InvalidAgeException("Invalid age"); }
		}
		catch (InvalidAgeException e) {
			e.printStackTrace();
			e.getMessage();
		}
		finally { System.out.println("Cleaning resources"); }
		
	}

	public static void main(String[] args) throws Exception{
		try {
 			int result = 10 / 0; // Throws ArithmeticException
		} catch (ArithmeticException e) {
 			System.out.println("Arithmetic exeption!");
		}
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		checkAge(age);
	}


}