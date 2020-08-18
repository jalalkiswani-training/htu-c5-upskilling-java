package edu.htu.upskilling.java.lectureb13;

import java.util.Scanner;

public class Collections1 {
	public static void main(String[] args) {
		int[] marks=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<marks.length;i++) {
			System.out.print("Please enter mark "+(i+1)+" :");
			marks[i]=s.nextInt();
		}
		int sum=0;
		for (int mark : marks) {
			sum+=mark;
		}
		
		int avg=sum/marks.length;
		System.out.println("Average : "+avg+" , Sum :"+sum);
		
		
	}
}
