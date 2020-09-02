package edu.htu.upskilling.java.lecture3;

public class Conditional2 {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		
		int max;
		if (x>y) {
			max=x;
		}
		else if(x>z) {
			max=x;
		}
		else if(y>z && y>x) {
			max =y;
		}
		
		else {
			max=z;
		}
		System.out.println(max);

	}

}
