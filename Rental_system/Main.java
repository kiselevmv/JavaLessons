package "Rental system";
import "Rental system".MediaItem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaItem item1 = new MediaItem("Getting thing complicated and unusable");
		MediaItem item2 = new MediaItem("Whale songs");
		boolean status;
		item1.rent("Itzik");
		if (item1.getStatus() == true) {
			System.out.println("Item 1 is rented");
		} else {
			System.out.println("Item 1 is not rented");
		}
		status = item2.returnItem("Shlomo");
		
	}

}
