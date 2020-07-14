package edu.htu.upskilling.java.lecture3;

public class Conditional {

	public static void main(String[] args) {
		
		int x=50;
		int y=200;
		// true && true = true
		// true && false = false
		// false && false = false
		
		if(x==y && y==20) {
			System.out.println("x is less than y");
			
		}
		else {
			System.out.println("y is less than x");
		}
		System.out.println("x is equal to "+ x);
		System.out.println("y is equal to "+ y);

	}
	
	// comparison operators
	// < , > ,<= , >= ,==, != 
	// logical operators
	// && || ! 

}
