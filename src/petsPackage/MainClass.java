package petsPackage;
import animalPackage.Animal;
import birdsPackage.Mayna;

public class MainClass {


	public static void main(String[] args) {

		Dog d1 = new Dog();
		
//		Mayna a0 = new Animal();
//		a0.eat();
//		
		Animal a1 = new Animal();
		a1.eat();
		
		//System.out.println(a1.eat());
		
		Animal m1 = new Mayna();
		m1.eat();
	
		Mayna m2 = new Mayna();
		m2.eat();
	
		System.out.println("===========================");
		
		System.out.println(d1);
		System.out.println("======");
		Cat c1 = new Cat();
	//	Animal a1 = new Animal();
		Object o1 = new Object();	
		d1.move();
		
		c1.move();
		
		Mayna m11 = new Mayna();
		m11.move();
		
		 Dog d7 = new Dog(); //  Correct
		 
		 Animal d17 = new Dog(); //  Correct 
		 BlackDog bd1 = new BlackDog();
		 
		 Dog d8 = new Dog(); //  Correct 
//		 Dog d9 = new Cat(); // incorrect 
//		 Cat c7 = new Dog(); // incorrect 
		
//		 Dog d11 = new Animal(); //  incorrect 
		
		 
		 Animal d19 = new Cat(); //  Correct 
		 Cat   c19 = new Cat(); //  Correct 
					
	}
}
