package edu.htu.upskilling.java.lecture1;

import java.util.Scanner;

public class ThirdExample {
	
	public static void main(String[] args) {
		//The following applies for "Primitives" & "String"
		// int : data type
		// i: variable name
		//10 initial value
		int i=10;
		
		//Scanner: class name
		//s: variable name/ reference
		//new Scanner(System.in) : construction
	
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter value: ");
		int value=s.nextInt();
		
		int result = value*2;
		System.out.println(result);		
	}
}
