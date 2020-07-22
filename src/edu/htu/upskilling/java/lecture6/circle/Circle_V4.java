package edu.htu.upskilling.java.lecture6.circle;

public class Circle_V4 {
	int rad;
	//static: allocated on on the class level
	//final: value is constant and cannt be changed
	//naming convension for the constants
	//all caps with under scores
	static final double PI=(double)22/7;
	
	public double calculateRound() {
		//3.14: hard-coded value, and thats bad!!!!!
		return 2 * rad * PI;
		//System.out.println("Round =" + round);
	}

	public double calculateArea() {
		return rad * rad * PI;
//		System.out.println("Area =  " + area);
	}
}
