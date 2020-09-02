package edu.htu.upskilling.java.lecture4;

public class Example2Conditionals {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		/*
		 * Conditional operators: > < <= >= != == 
		 */
		if (a > b) { // if (condition){
			System.out.println("Ok");
		} else if (b > a) {
			System.out.println("Not ok");
		} else {
			System.out.println("Eq");
		}
	}
}
