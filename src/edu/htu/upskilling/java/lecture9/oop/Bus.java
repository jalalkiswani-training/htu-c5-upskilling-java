package edu.htu.upskilling.java.lecture9.oop;

public class Bus extends Vehicle {
	private int level;
	
	@Override
	public void turnOn() {
		System.out.println("Truning on switch and press the brake padddle");
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
