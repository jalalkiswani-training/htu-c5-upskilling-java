package edu.htu.upskilling.java.lecture6;

import java.util.Scanner;

public class Test {
	//String[] args: "command-line ARGUMENTS"
	public static void main(String[] args) {
		//this a command-line application (input,out on the console)
		System.out.println("1- Add Student");
		System.out.println("2- Find Student");
		System.out.println("3- Update Student");
		System.out.println("Please Enter your choice:");
		Scanner s=new Scanner(System.in);
		int nextInt = s.nextInt();
	}
}
