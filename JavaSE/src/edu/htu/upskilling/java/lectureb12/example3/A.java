package edu.htu.upskilling.java.lectureb12.example3;

import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			B b=new B();
			b.m1();
			System.out.println("File processed succ..");
		} catch (IOException e) {
			System.out.println("Error processing file..");
//			e.printStackTrace();
		}
	}
}
