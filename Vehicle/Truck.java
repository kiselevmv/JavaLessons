
public class Truck extends Vehicle {
	private int capacity;
	
	Truck() {
		this.setBrand("default");
		this.capacity = 0;
	}
	
	Truck(String brand) {
		this.setBrand(brand);
		this.capacity = 0;
	}
	
	Truck(String brand, int capacity) {
		this.setBrand(brand);
		this.capacity = capacity;
	}
	
	public String toString() {
		//overriding the toString() method 
		return "Truck " + this.getBrand() + " " + this.capacity;
	}
	
	public void details() {
		System.out.print("This is a track made by Company " + this.getBrand() );
		System.out.println(". Truck capacity is " + this.capacity + " metric tons.");
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}
}
