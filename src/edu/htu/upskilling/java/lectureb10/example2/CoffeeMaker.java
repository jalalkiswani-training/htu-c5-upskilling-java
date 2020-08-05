package edu.htu.upskilling.java.lectureb10.example2;

public class CoffeeMaker extends DrinkMaker {
	private int coffee;

	@Override // annotation
	protected void addIngredients() {
		System.out.println("Adding sugar...");
		System.out.println("Adding coffee...");
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

}
