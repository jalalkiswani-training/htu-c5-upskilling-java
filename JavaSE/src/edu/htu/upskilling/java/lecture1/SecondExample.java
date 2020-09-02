//package name: convention, all small 
package edu.htu.upskilling.java.lecture1;

import javax.swing.JOptionPane;

/* Multi-line comment: 
 * SecondClass: class name, should match the file name
 * Convention class name: CamelCase with Caps first. Class name is always noun
 * 
 */
public class SecondExample {

	/*
	 * main: startup point Java application
	 * function/method: convention: camel case with small first, convention method name is a very
	 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please Enter you name");// name is a local variable of data type String
		// JOptionPane.showMessageDialog(null, "Hello from First Swing Message"); Single line comment
		String msg = "Hello, " + name + "!";

		JOptionPane.showMessageDialog(null, msg);

		System.exit(0);
	}
}
