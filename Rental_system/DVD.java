public class DVD extends MediaItem {

	private int runtime;	

	DVD(String title, int runtime) {
		super(title);
		this.runtime = runtime;
	}

	@Override public void getDetails() {
		System.out.println("DVD details");
		System.out.println("DVD \"" + this.getTitle() + "\" is " + this.runtime + " minutes long.");
		if (getStatus() == true) {
			System.out.println("DVD is rented by " + this.getRented());
		} else {
			System.out.println("DVD is not rented");
		}
		System.out.println("===========================");
	}
}
