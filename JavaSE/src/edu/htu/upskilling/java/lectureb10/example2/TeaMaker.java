package edu.htu.upskilling.java.lectureb10.example2;

public class TeaMaker extends DrinkMaker {
	private int tea;

	@Override
	protected void addIngredients() {
		System.out.println("Adding sugar...");
		System.out.println("Add tea");
	}
	
	public int getTea() {
		return tea;
	}

	public void setTea(int tea) {
		this.tea = tea;
	}

}
