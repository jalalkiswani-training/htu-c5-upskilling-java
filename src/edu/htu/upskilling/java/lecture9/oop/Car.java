package edu.htu.upskilling.java.lecture9.oop;

//Car: subclass (child)
//vehicle: superclass (parent) 
public class Car extends Vehicle {
	
	@Override
	public void turnOn() {
		System.out.println("turning on the switch");
	}
}
