package edu.htu.upskilling.java.lecture4;

public class Example3Conditionals {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && a > c) { // &&: and , ||: or
			System.out.println("Ok");
		} else if (b > a) {
			System.out.println("Not ok");
		} else {
			System.out.println("Eq");
		}
	}
}
