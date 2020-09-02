package edu.htu.upskilling.java.lecture6.circle;

public class Circle_V5 {
	// static: allocated on on the class level
	// final: value is constant and cannt be changed
	// naming convension for the constants
	// all caps with under scores
	public static final double PI = (double) 22 / 7;

	private int rad;
	public double calculateRound() {
		// 3.14: hard-coded value, and thats bad!!!!!
		return 2 * rad * PI;
		// System.out.println("Round =" + round);
	}

	public double calculateArea() {
		return rad * rad * PI;
//		System.out.println("Area =  " + area);
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int r) {
		//validation: to ensure that the user passed
		//a valid value
		if (r >= 0) {
			rad = r;
		}
	}

}
