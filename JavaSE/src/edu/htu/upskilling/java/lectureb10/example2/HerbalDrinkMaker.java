package edu.htu.upskilling.java.lectureb10.example2;

public class HerbalDrinkMaker extends DrinkMaker implements RemoteDevice, ControllableDevice {
	private int herbal;

	public int getHerbal() {
		return herbal;
	}

	public void setHerbal(int herbal) {
		this.herbal = herbal;
	}

	@Override
	protected void addIngredients() {
		System.out.println("Adding sugar");
		System.out.println("Adding herbal");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}
