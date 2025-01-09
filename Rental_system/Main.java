import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
		boolean status;
		// TODO Auto-generated method stub
		// MediaItem item1 = new MediaItem("Getting thing complicated and unusable");
		// MediaItem item2 = new MediaItem("Whale songs");
		Book book1 = new Book("How to loose all your money", 300);
		DVD dvd1 = new DVD("60 minutes of superlaud scream", 60);
		book1.rent("Shlomo");
		status = book1.returnItem("Itzik");
		book1.getDetails();
		dvd1.getDetails();
		
		Scanner scan = new Scanner(System.in);
		printOptions();
		String answer = scan.nextLine();
		while(!answer.equalsIgnoreCase("exit")) {
			switch(answer) {
				case "1":
					printItems();
					break;

				case "2":
					rentItem();
					break;

				case "3":
					returnItem();
					break;

				case "4":

					break;
			}
			printOptions();
			answer = scan.nextLine();
		}
	}

	private static void printOptions() {
		System.out.println("Welcome to rentals! \n \t 1. Print all the items. \n \t 2. Rent an item \n \t 3. Return an item \n \t 4. Exit");
	}

}
