package edu.htu.upskilling.java.lecture3;

public class Primitives7Casting {
	public static void main(String[] args) {
		//implicit casting
		float f=10;
		double d=f;
		
		System.out.println(f+" - "+d);
		//-------------------------------
		double d2=10.2;
		float f2=(float)d2;
		System.out.println(f2+" - "+d2);
		//----------------------
		float f3=100.7f;//by default any real-number is 
		//save in double value first
	}
}
