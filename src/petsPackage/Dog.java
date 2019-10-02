package petsPackage;

import animalPackage.Animal;

public class Dog extends Animal // In C# : object
{
	public   String name;
	static private int age;
	static int dogCounter=0;

	@Override
	public String toString() {
		return "This object is " + this.name;
		
		
	}
	Dog(){
		dogCounter++;
		System.out.println("dogCounter: " + dogCounter);
	}

	Dog(String name, int age, float weight){
		this.weight = weight;

		this.name = name;
		this.age = age;
		dogCounter++;
		System.out.println("dogCounter: " + dogCounter);
	}
	public int getAge() {
		return age; ///  Getter returns
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRabid() {
		return rabid;
	}

	public void setRabid(boolean rabid) {
		this.rabid = rabid;
	}

	protected boolean rabid;
	float weight;
	float height;

	public void eat(){

	}
	
	@Override
	public void move(){
		System.out.println("Dog::move().......");

		
	}


}