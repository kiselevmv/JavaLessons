public class Book extends MediaItem {

	private int pages;

	Book(String title, int pages) {
		super(title);
		this.pages = pages;
	}


	@Override public void getDetails() {
		System.out.println("Book details");
		System.out.println("Book \"" + this.getTitle() + "\" is " + this.pages + " pages long.");
		if (getStatus() == true) {
			System.out.println("Book is rented by " + this.getRented());
		} else {
			System.out.println("Book is not rented");
		}
		System.out.println("===========================");
	}

}