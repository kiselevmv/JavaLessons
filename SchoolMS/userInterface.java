import java.util.Scanner;

public class userInterface {

	static Scanner scan = new Scanner(System.in); // Capturing the input;
	private String mainMenu = "Main menu \n" +
    		"1.\tAdd Student \n" +	
    		"2.\tAdd Course \n" +
    		"3.\tAssign Grade \n" + 
    		"4.\tSearch Student by Name \n" +
    		"5.\tList All Students \n" +
    		"6.\tList All Courses \n" +
    		"7.\tShow Failing Students \n" +
    		"8.\tFind Top-Performing Student \n" +
    		"9.\tFind Most Popular Course \n" +
    		"10.\tQuit\n";

	userInterface() {
		// printMenu();
	}

	public int options() {
		int answer = scan.nextInt();
		scan.nextLine();
		return answer;
	}

	public void printMenu() {
    	System.out.println(mainMenu);
    }

}