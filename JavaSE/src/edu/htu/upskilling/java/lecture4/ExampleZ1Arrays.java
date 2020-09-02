package edu.htu.upskilling.java.lecture4;

import java.util.Arrays;
import java.util.Random;

public class ExampleZ1Arrays {
	public static void main(String[] args) {
		int n=10;
		int marks[]=new int[n];
		
		//to fill an array with random numbers
		Random rand = new Random();
		for (int i = 0; i < marks.length; i++) {
			marks[i]=rand.nextInt(65)+35;
		}
		System.out.println("===========================================");
		System.out.println("Array Values: ");
		for (int i = 0; i < marks.length; i++) {
			int value = marks[i];
			System.out.println(value);
		}
		System.out.println("===========================================");
		int sum=0;
		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];
		}
		int avg=sum/marks.length;
		System.out.println("Sum  = "+sum+" || Average = "+avg);
		System.out.println("=========================");
		System.out.println("Sorting array: ");
		//sorting array
		Arrays.sort(marks);
		//for each
		for (int value : marks) {
			System.out.println(value);
		}
		
	}
}
