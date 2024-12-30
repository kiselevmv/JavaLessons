
public class Lesson_2612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lesson 1");
		Vehicle vh1 = new Vehicle();
		// vh1.brand = "Mazda";
		vh1.start();
		vh1.stop();
		Car car1 = new Car("Toyota", "RAV4", true);
		Car car2 = new Car("VAZ");
		car1.details();
		car1.start();
		car1.play_music("Radio GaGa");
		car1.stop();
		car2.setModel("2112");
		car2.details();
		car2.start();
		car2.play_music("Radio GaGa");
		car2.stop();
		Motocycle moto1 = new Motocycle("Nintendo", 200);
		moto1.details();
		moto1.start();
		moto1.stop();
		Truck trk1 = new Truck("Man", 16);
		trk1.details();
		trk1.start();
		trk1.stop();
		System.out.println(vh1);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(moto1);
		System.out.println(trk1);
	}

}
