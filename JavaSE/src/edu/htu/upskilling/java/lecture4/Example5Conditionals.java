package edu.htu.upskilling.java.lecture4;

public class Example5Conditionals {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 17;

		a = a + 1;// increment by 1 a=11
		a += 2;// Increment by 2 a=13
		a++;// increment by 1 a=14 : post increment
		++a;// increment 1 a=15 : pre-increment

		int s = a++ + --b;

		if (a > b || b > c++) {
			System.out.println("Ok");
		} else {
			System.out.println("Not okay");
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);

	}
}
