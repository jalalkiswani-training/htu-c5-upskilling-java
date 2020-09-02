package edu.htu.upskilling.java.lectureb12.example1;

import javax.swing.JOptionPane;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			//Happy Scenario
			String str = JOptionPane.showInputDialog("Please enter a number 1");
			int number1 = Integer.parseInt(str);
			
			String str2 = JOptionPane.showInputDialog("Please enter a number 2");
			int number2 = Integer.parseInt(str2);
			
			int result = number1 + number2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number");
			e.printStackTrace();
		}
	}

}
