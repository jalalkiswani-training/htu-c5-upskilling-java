package edu.htu.upskilling.java.lectureb10.example1;

public class CoffeeMaker_V1 {
	private int sugar;
	private int water;
	private int coffee;

	public CoffeeMaker_V1() {
	}

	public CoffeeMaker_V1(int coffee, int water, int sugar) {
		this.coffee = coffee;
		this.water = water;
		this.sugar = sugar;
	}

	public void makeCoffee() {
		addWater();
		boil();
		addCoffee();
		addSugar();
		serve();
	}

	private void addWater() {
		System.out.println("Adding water");
	}

	private void boil() {
		System.out.println("Boiling...");
	}

	private void addCoffee() {
		System.out.println("Adding Coffeee");
	}

	private void addSugar() {
		System.out.println("Adding sugar");
	}

	
	private void serve() {
		System.out.println("Serving Coffee..");
	}
	
	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

}
