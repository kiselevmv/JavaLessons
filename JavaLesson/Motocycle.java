
public class Motocycle extends Vehicle {
	private int cc;
	
	Motocycle (String brand) {
		this.setBrand(brand);
		this.cc = 0;
	}
	
	Motocycle (int capacity) {
		this.setBrand("default");
		this.cc = capacity;
	}
	
	Motocycle (String brand, int capacity) {
		this.setBrand(brand);
		this.cc = capacity;
	}
	
	void details() {
		System.out.print("This is a motocycle made by Company " + this.getBrand() );
		System.out.println(". Engine capacity is " + this.cc + " cubic santimeters.");
	}
	
	public String toString() {
		//overriding the toString() method 
		return "Motocycle " + this.getBrand() + " " + this.cc ;
	}
	
	public void setCapacity(int newCapacity) {
		this.cc = newCapacity;
	}
	
	public int getCapacity() {
		return this.cc;
	}
	
}
