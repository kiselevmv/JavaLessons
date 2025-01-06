abstract class MediaItem {
	private String title;
	private String rentedBy;
	private boolean isRented;
	private boolean returnItem;


	MediaItem(String title) {
		this.title = title;
		this.isRented = false;
		this.rentedBy = "";
	}

	// MediaItem() {
		// Emperty constructor
	// }
	
	public boolean rent(String name) {
		if (this.isRented == false) {
			this.isRented = true;
			this.rentedBy = name;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean returnItem(String name) {
	
		if (this.isRented == true && this.rentedBy == name) {
			this.isRented = false;
			returnItem = true;
		} else if (this.isRented == true && this.rentedBy != name) {
			System.out.println("Item rented by other customer");
			returnItem = false;
		} else if (this.isRented == false) {
			System.out.println("Item was not rented");
			returnItem = false;
		}
		return returnItem;
	}
	
	public boolean getStatus() {
		if (this.isRented == true) {
			return true;
		} else { 
			return false;
		}
	}

	public String getRented() {
		return rentedBy;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void getDetails() { 
		System.out.println("Details");
	}
}
