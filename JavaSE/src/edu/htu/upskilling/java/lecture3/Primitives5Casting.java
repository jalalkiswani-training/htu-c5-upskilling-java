package edu.htu.upskilling.java.lecture3;

public class Primitives5Casting {
	public static void main(String[] args) {
		//Implicit Casting  
		byte b=10;
		int i=b;//can I put 1 byte into 4 bytes safely?? Yes 
//		int i=20;
		System.out.println(b+" - "+i);
		
		/////////////////////////////////////////////////
		//Explicit Casting : when we believe that the value could fit on the target datatype
		int i2=100;
		byte b2=(byte)i2;//can I put 4 bytes into 1 byte safely?? 
		//Does the compiler check for the value or not?? No, the compiler doesnot check 
		//for the value, why?? Value couldnt be detemined at compile time
		System.out.println(b2+" - "+i2);
		
		
	}
}
