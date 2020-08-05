package edu.htu.upskilling.java.lectureb10.example2;

public abstract class DrinkMaker {
	private int water;
	private int sugar;
	
	public void makeDrink() {
		addWater();
		boil();
		addIngredients();
		serve();
	}

	private void serve() {
		System.out.println("Serving...");
	}

	protected abstract void addIngredients() ;//{
//		System.out.println("Adding sugar...");
//	}

	private void boil() {
		System.out.println("Boiling...");
	}

	private void addWater() {
		System.out.println("Adding water...");
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

}
