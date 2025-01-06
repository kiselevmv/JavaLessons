package Rental_system;

public class MediaItem {
	public String title;
	public String rentedBy;
	private boolean isRented;


	public MediaItem(String title) {
		this.title = title;
		this.isRented = false;
		this.rentedBy = "";
	}
	
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
			return true;
		} else if (this.isRented == true && this.rentedBy != name) {
			System.out.println("Item rented by other customer");
			return false;
		} else if (this.isRented == false) {
			System.out.println("Item was not rented");
			return false;
		}
	}
	
	public boolean getStatus() {
		if (this.isRented == true) {
			return true;
		} else { 
			return false;
		}
	}
}
