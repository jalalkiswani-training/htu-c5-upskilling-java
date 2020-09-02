package edu.htu.upskilling.java.lecture6.circle;

public class Circle_V2 {
	int rad;
	
	public void calculateRound() {
		double round = 2 * rad * 3.14;
		System.out.println("Round =" + round);
	}

	public void calculateArea() {
		double area = rad * rad * 3.14;
		System.out.println("Area =  " + area);
	}
}
