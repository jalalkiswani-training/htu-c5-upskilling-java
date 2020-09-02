package edu.htu.upskilling.java.lecture3;

public class Primitives6Casting {
	public static void main(String[] args) {
		//implicit casting
		int i = 100; // 4-bytes
		float f = i; // 4-bytes
		System.out.println(i + " - " + f);

		//------------------------------------------
		//Explicit casting
		float f2=10.2f;
		int i2=(int)f2;//there is a risk of losing fraction
		
		System.out.println(f2+"-"+i2);
	}
}
