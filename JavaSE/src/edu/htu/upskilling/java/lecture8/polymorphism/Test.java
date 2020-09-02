package edu.htu.upskilling.java.lecture8.polymorphism;

public class Test {

	public static void main(String[] args) {
		// polymorphism 
		// super class is Animal 
		// sub class is Fish 
		// super reference  points to an object of sub class 
		Animal fish=new Fish();
		Animal dog=new Dog();
		fish.sayHello();
		dog.sayHello();
		
		// implict casting
		Animal animal=fish;
		
		
		// explict casting
		Fish fish1=(Fish) fish;
		

	}

}
