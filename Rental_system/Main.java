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
		
	}

}
