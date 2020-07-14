package edu.htu.upskilling.java.lecture2;

import javax.swing.JOptionPane;

public class ReadInputFromUser {

	public static void main(String[] args) {
	
		String operator= JOptionPane.showInputDialog(null,"please Enter an opertor");
		System.out.println(operator);
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "please enter first operand"));
		
		int op=Integer.parseInt(operator);
		System.out.println(op);
		
		switch (op) {
		case 1: System.out.println();
			
		}
		
		
		// int  ---> Wrapper class Integer
		// float --> Wrapper class Float
		// double--> Wrapper class Double
		
	}

}
