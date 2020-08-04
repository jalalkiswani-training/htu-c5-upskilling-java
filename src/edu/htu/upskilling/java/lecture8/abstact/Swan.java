package edu.htu.upskilling.java.lecture8.abstract;

// Concrete class: first class that add implementation for the abstract method
public class Swan extends Animal{

	// override:  method in super class and sub class with the same signature 
	@Override
	public String getName() {
		System.out.println("Animal name is sia");
		return "sia";
	}

}
