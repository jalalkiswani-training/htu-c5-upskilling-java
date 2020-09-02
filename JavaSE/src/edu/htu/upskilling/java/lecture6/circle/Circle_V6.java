package edu.htu.upskilling.java.lecture6.circle;

public class Circle_V6 {
	// static: allocated on on the class level
	// final: value is constant and cannot be changed
	// naming convention for the constants
	// all caps with under scores
	public static final double PI = (double) 22 / 7;

	private int rad;

	// constructor: method has the same name of the class
	// doesnot have a return datatype
	// could be only called with the keyword "new"
	// normally the constructor is used to init instance variables
	public Circle_V6(int rad) {
		setRad(rad);
	}

	// default constructor: constructor overloading
	public Circle_V6() {
	}

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

	//shadowing
	public void setRad(int rad) {
		// validation: to ensure that the user passed
		// a valid value
		if (rad >= 0) {
			this.rad = rad;
		}
	}

}
