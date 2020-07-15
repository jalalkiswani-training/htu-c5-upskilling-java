package edu.htu.upskilling.java.lecture4;

public class Example8Loop {
	public static void main(String[] args) {
		// basic loop
		int counter = 0;
		while (counter < 10) {
			System.out.println("Hello " + (counter + 1));
			counter++;
		}
		System.out.println("=======================");
		// Alternative loop
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + (i + 1));
		}
		System.out.println("=======================");
	}
}
