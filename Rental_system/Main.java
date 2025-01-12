import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		boolean status;

		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<DVD> dvdList = new ArrayList<DVD>();
		bookList.add(new Book("How to loose all your money", 300));
		bookList.add(new Book("Catch me, if you can", 229));
		bookList.add(new Book("Leaving things undone", 3));
		dvdList.add(new DVD("60 minutes of superlaud screams", 60));
		dvdList.add(new DVD("Endless sufferting of listener", 6666));
		dvdList.add(new DVD("Collection of stone age songs", 1));
		

		Scanner scan = new Scanner(System.in);
		printOptions();
		System.out.println("Choose item");
		int answer = scan.nextInt();
		while(answer != 4) {
			switch(answer) {
				case 1:
					printItems(bookList, dvdList);
					break;

				case 2:
					rentItem(bookList, dvdList);
					break;

				case 3:
					returnItem(bookList, dvdList);
					break;

				case 4:
					System.out.println("Quit.");
					break;
			}
			printOptions();
			answer = scan.nextInt();
		}
		scan.close();
		System.out.println("Bye");
	}

	public static void printItems(ArrayList<Book> books, ArrayList<DVD> dvds) {
		System.out.println("List of available books:");
		int j = 0;
		for (Book i : books) {
			System.out.print(j+". ");
			j++;
			i.getDetails();
		}
		System.out.println("List of available DVDs:");
		j = 0;
		for (DVD i : dvds) {
			System.out.print(j+". ");
			j++;
			i.getDetails();
		}
	}

	public static void returnItem(ArrayList<Book> books, ArrayList<DVD> dvds) {
		Book book;
		DVD dvd;
		boolean returnStatus;
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you rent a book (1) or DVD (2)? ");
		int answer = scan.nextInt();
		scan.nextLine();

		System.out.println("Input a number of an item.");
		int num = scan.nextInt();
		scan.nextLine();

		System.out.println("Input a name of a client.");
		String name = scan.nextLine();

		switch(answer) {
				case 1:
					book = books.get(num);
					returnStatus = book.returnItem(name);
					if (returnStatus == false) {
							System.out.println("Book was not rented or it was rented by other client.");
						};
					break;

				case 2:
					dvd = dvds.get(num);
					returnStatus = dvd.returnItem(name);
					if (returnStatus == false) {
							System.out.println("DVD was not rented or it was rented by other client.");
						};
					break;
			}
	}

	public static void rentItem(ArrayList<Book> books, ArrayList<DVD> dvds) {
		Book book;
		DVD dvd;
		Scanner scan = new Scanner(System.in);
		// scan.useDelimiter(System.lineSeparator());

		System.out.println("Do you rent a book (1) or DVD (2)? ");
		int answer = scan.nextInt();
		scan.nextLine();

		System.out.println("Input a number of an item.");
		int num = scan.nextInt();
		scan.nextLine();

		System.out.println("Input a name of a client.");
		String name = scan.nextLine();

		switch(answer) {
				case 1:
					book = books.get(num);
					book.rent(name);
					break;

				case 2:
					dvd = dvds.get(num);
					dvd.rent(name);
					break;
			}

		// scan.close();
		}

	private static void printOptions() {
		System.out.println("Welcome to rentals! \n \t 1. Print all the items. \n \t 2. Rent an item \n \t 3. Return an item \n \t 4. Exit");
	}

}
