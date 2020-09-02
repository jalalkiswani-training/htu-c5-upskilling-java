package edu.htu.upskilling.java.lecture9.oop;

import java.awt.Color;

public abstract class Vehicle {
	private Brand brand;
	private int year;
	private Color color;

	public abstract void turnOn() ;

	public String getInfo() {
		return getBrand() + "/" + getColor() + "/" + getYear();
	}

	public void turnOff() {
		System.out.println("Turning off...");
	}

	public void stop() {
		System.out.println("Stopping...");
	}

	public void move() {
		System.out.println("Moving...");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
