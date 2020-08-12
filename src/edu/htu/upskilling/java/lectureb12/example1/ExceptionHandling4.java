package edu.htu.upskilling.java.lectureb12.example1;

import javax.swing.JOptionPane;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");
		if (name != null) {
			System.out.println("Length = " + name.length());
		}else {
			System.out.println("No Input");
		}
	}
}
