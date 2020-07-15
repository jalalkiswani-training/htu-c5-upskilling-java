package edu.htu.upskilling.java.lecture4;

import javax.swing.JOptionPane;

public class Example7Conditionals {
	public static void main(String[] args) {
		String ageStr = JOptionPane.showInputDialog("Please enter your age:");
		int age=Integer.parseInt(ageStr);
		
		if(age<40) {
			System.out.println("Hello young man");
		}else {
			System.out.println("Hello old man");
		}
		
		String msg=age<40?"Young man":"Old man";//ternary operator
		System.out.println("Hello "+msg);
		
	}
}
