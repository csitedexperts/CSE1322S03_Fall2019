package staticModifier;


class Car {
	private int id; 
	public String color;
	public String make;
	public static String model;
	public void setID() {}
	public static void setModel() {}
}

public class Fall2019Test1_StaticMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		Car.setModel(); 	// A
		c1.setModel(); 	// A
//		Car.id = 91010;
//		setModel();
//		c1.id = 81010;
//		Car.setID();
		c1.setID();			// F
//		setID();
		c1.color = "red";  // H
//		color = "green";
		Car.model = "Ford";  // J
		c1.make = "mustang";  // K
	}

}
