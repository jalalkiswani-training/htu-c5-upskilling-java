package edu.htu.upskilling.java.lecture8.abstacttest;

public class Test {

	public static void main(String[] args) {
		// abstract class cannot be instantiated using new keyword
		// sub class class
		//Animal animal1=new Animal();
		Animal animal2=new Swan();
		animal2.age=5;
		System.out.println(animal2.age);
		animal2.eat(); // Inherited from Animal class 
		animal2.getName(); // the implementation is defined in the sub class
		// reference of type super class Animal 
		// Animal is a super class
		// swan is an object of sub class 
		Animal animal3=new Swan();

	}

}
