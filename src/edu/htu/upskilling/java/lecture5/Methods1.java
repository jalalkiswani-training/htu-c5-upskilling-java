package edu.htu.upskilling.java.lecture5;

import java.util.Scanner;

public class Methods1 {
	public static void main(String[] args) {
		int number1 = readNumber();
		int number2 = readNumber();
		int number3 = readNumber("Enter last number: ");

		printMessage(number1 + number2 + number3+"");
	}

	/*
	 * public: visibility modifier
	 * static: function could be called directly without class name!!!
	 * int: return value
	 * readNumber(): function name
	 * { ....}  function/method body
	 * 
	 * "public static int readNumber()" : method signature 
	 * method signiture: methodname+paramters+datatypes+returnvalue
	 * 
	 * Methods naming convention: starts with small then camel case +
	 * always verb 
	 */
	public static int readNumber() {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Please enter number: ");
//		int number = s.nextInt();
//		return number;
		return readNumber("Please enter number:");
	}
	
	/*
	 * Method overloading: having the same method name in the same class
	 */
	public static int readNumber(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.print(msg);
		int number = s.nextInt();
		return number;
	}
	
	/*
	 * void: function doesn't return value
	 * (String msg): parameter named msg from type String 
	 * @param msg
	 */
	public static void printMessage(String msg) {
		System.out.println(msg);
	}
}
