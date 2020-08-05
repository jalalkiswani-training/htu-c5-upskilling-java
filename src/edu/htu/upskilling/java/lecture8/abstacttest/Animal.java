package edu.htu.upskilling.java.lecture8.abstacttest;

// abstract class can't be instaniated using new keyword
// abstract class may have abstract methods 
// but a class with abstract method must abstract
public abstract class Animal {
	protected int age;

	public void eat() {
		System.out.println("Animal is eating");
	}

	public abstract String getName();

}
