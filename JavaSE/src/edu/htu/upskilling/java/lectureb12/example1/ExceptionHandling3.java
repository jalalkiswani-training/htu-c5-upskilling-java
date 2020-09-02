package edu.htu.upskilling.java.lectureb12.example1;

import javax.swing.JOptionPane;

public class ExceptionHandling3 {
	public static void main(String[] args) {
//		try {
		// Happy Scenario
		String str = JOptionPane.showInputDialog("Please enter a number 1");
		String str2 = JOptionPane.showInputDialog("Please enter a number 2");

		if (isValidNumber(str) && isValidNumber(str2)) {

			int number1 = Integer.parseInt(str);
			int number2 = Integer.parseInt(str2);
			int result = number1 + number2;
			System.out.println(result);
		}
		else {
			System.out.println("Please enter valid numbers");
		}
//		} catch (NumberFormatException e) {
//			System.out.println("Invalid Number");
//			e.printStackTrace();
//		}
	}

	public static boolean isValidNumber(String num) {
		char[] charArray = num.toCharArray();
		for (char c : charArray) {
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

}
