
public class Car extends Vehicle {
	private  String model;
	private boolean hasMusic;
	
	Car() {
		this.setBrand("default");
		this.model = "default";
		this.hasMusic = false;
	}
	
	Car (String brand) {
		this.setBrand(brand);
		this.model = "default";
		this.hasMusic = false;
	}
	
	Car (String brand, boolean Music) {
		this.setBrand(brand);
		this.model = "default";
		this.hasMusic = Music;
	}
	
	Car (String brand, String set_model, boolean Music) {
		this.setBrand(brand);
		this.model = set_model;
		this.hasMusic = Music;
	}
	
	void play_music(String title) {
		if (this.hasMusic == true) { 
			System.out.println("Song " + title + " is playing at " + this.getBrand() + " car.");
		}
		else {
			System.out.println("Can't play music. No audio system is installed.");
		}
	}
	void details() {
		System.out.print("This is a car of model " + this.model + " made by Company " + this.getBrand() );
		if (this.hasMusic == true) {
			System.out.println(". Audio system is installed.");
		}
		else {
			System.out.println(". No audio system installed.");
		}
	}
	
	public String toString() {
		//overriding the toString() method 
		return "Car " + this.getBrand() + " model " + this.model ;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public String getModel() {
		return this.model;
	}
}
