
public class Vehicle {
	private  String brand;

	Vehicle() {
		this.brand = "default";
	}
	
	Vehicle(String brand) {
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void start() {
		System.out.println("Starting " + this.brand + " engine");
	}
	
	public void stop() {
		System.out.println("Stopping " + this.brand + " engine");
	}
	
	public String toString() {
		//overriding the toString() method  
		return "Vehicle " + this.brand; 
	}
}
