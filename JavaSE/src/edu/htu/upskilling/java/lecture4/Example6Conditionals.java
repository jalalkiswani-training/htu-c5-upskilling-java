package edu.htu.upskilling.java.lecture4;

import java.util.Scanner;

public class Example6Conditionals {
	public static void main(String[] args) {
		int n1;
		int n2;
		int ch;
		Scanner s = new Scanner(System.in);
		System.out.print("Number 1:");
		n1 = s.nextInt();
		System.out.print("Number 2: ");
		n2 = s.nextInt();
		boolean finished = false;
		while (!finished) {
			System.out.println("\n\n\n=====================");
			System.out.println("1- Add.");
			System.out.println("2- Sub.");
			System.out.println("3- Mul.");
			System.out.println("4- Div.");
			System.out.println("5- Quit.");
			System.out.println("=====================");
			System.out.print("Please enter your choice: ");
			ch = s.nextInt();
			switch (ch) {
			case 1:
			case 10:
			case 100: 
				System.out.println(n1 + n2);
				break;
			case 2:
				System.out.println(n1 - n2);
				break;
			case 3:
				System.out.println(n1 * n2);
				break;
			case 4:
				System.out.println(n1 / n2);
				break;
			case 5:
				finished = true;
				System.out.println("Thank you,  bye!!");
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
