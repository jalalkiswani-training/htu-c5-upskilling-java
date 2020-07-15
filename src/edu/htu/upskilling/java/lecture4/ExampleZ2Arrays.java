package edu.htu.upskilling.java.lecture4;

import java.util.Arrays;
import java.util.Random;

public class ExampleZ2Arrays {
	public static void main(String[] args) {
		System.out.println("Starting...");
		long startTime = System.nanoTime();
		int n = 3_000_000;
		int marks[] = new int[n];

		// to fill an array with random numbers
		Random rand = new Random();
		for (int i = 0; i < marks.length; i++) {
			marks[i] = rand.nextInt(65) + 35;
		}
		Arrays.sort(marks);
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		int avg = sum / marks.length;
		System.out.println("Sum  = " + sum + " || Average = " + avg);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000 ;
		System.out.println("Ending with duration : " + duration);
	}
}
