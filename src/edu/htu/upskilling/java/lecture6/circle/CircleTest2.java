package edu.htu.upskilling.java.lecture6.circle;

import javax.swing.JOptionPane;

public class CircleTest2 {
	public static void main(String[] args) {
		Circle_V3 c1=new Circle_V3();
		c1.rad=5;
		JOptionPane.showMessageDialog(null,c1.calculateArea()+"");
		JOptionPane.showMessageDialog(null,c1.calculateRound()+"");
	}
}
