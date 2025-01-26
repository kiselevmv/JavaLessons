import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws InvalidOperation {
		Account client = new Account("Mikhail", 1000000);
		int options = 0;
        Scanner scan = new Scanner(System.in); // Capturing the input
        do {
        	printMenu();
        	options = scan.nextInt();
        	scan.nextLine();
            switch (options) {
                case 1:
                    // Make a deposit
                	System.out.println("Enter a deposit amount");
                	double deposit = scan.nextDouble();
                	client.deposit(deposit);
                    break;
                case 2:
                    // Withdraw money
					System.out.println("Enter a withdrawal amount");
					double withdrawal = scan.nextDouble();
					client.withdraw(withdrawal);
                    break;
                case 3:
                    // Show balance
                	System.out.println("Actual balance is ");
                	System.out.printf("%.2f", client.getBalance() );
                    break;
                case 4:
                	// Close session
                	System.out.println("Session cosed.\nBye!");
                	break;
                default:
                	System.out.println("Invalid selection. Try again.");

            }
        } while (options != 4); // quitting the program
    }

    private static void printMenu() {
    	System.out.println("\nBanking srvices");
		System.out.println("1.\tDeposit");
        System.out.println("2.\tWithdraw");
        System.out.println("3.\tShow balance");
        System.out.println("4.\tExit");
    }
}