package dogPackage;

public class MainClass {


	public static void main(String[] args) {

		Dog j1 = new Dog();

		j1.name = "Tom"; // name of j1 is Tom
		j1.rabid = true;
		j1.weight = 23F;
		j1.legCount = 4;
		j1.setAge(14);
		// USA.president = "B. Obama";

		System.out.println("j1.name = " + j1.name);
		System.out.println("j1.rabid= " + j1.rabid);
		System.out.println("j1.age ===== = " + j1.getAge());

		Dog j2 = new Dog("Jerremy", 5, 120);
		Dog j3 = new Dog("Terremy", 15, 150);

		System.out.println("j2.name = " + j2.name);
		//		System.out.println("j2.age = " + j2.age);
		System.out.println("j2.weight = " + j2.weight);

		System.out.println("j3.name = " + j3.name);
		//		System.out.println("j3.age = " + j3.age);
		System.out.println("j3.weight = " + j3.weight);

		Dog j4 = new Dog();
		j4.legCount = 3;
		System.out.println("j4.legCount:" + j4.legCount);
			
		System.out.println("j4.getClass():" + j4.getClass());

		
		Cat c1 = new Cat();
		System.out.println("c1.getClass():" + c1.getClass());
		c1.legCount = 4;
		System.out.println("c1.legCount:" + c1.legCount);
		

	}
}
