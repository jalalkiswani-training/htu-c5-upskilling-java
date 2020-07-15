package edu.htu.upskilling.java.lecture4;

public class Example9Arrays {
	public static void main(String[] args) {
		int n=10;
		//int : datatype
		//marks: reference/variable
		//new int[n]: construction, allocate space for 10 variables
		int marks[]=new int[n];
		marks[0]=10;//[0] is the index at location 0
		marks[1]=20;//1 is the index at location 1
		marks[2]=30;
		
		System.out.println(marks.length);
		
		System.out.println(marks[1]);
		
		System.out.println(marks[11]);//ArrayIndexOutofBoundException
		
		
//		int mark1 = 50;
//		int mark2 = 60;
//		int mark3 = 70;
//		int mark4 = 80;
//
//		int sum = mark1 + mark2 + mark3 + mark4;
//		int avg = sum / 4;
	}
}
