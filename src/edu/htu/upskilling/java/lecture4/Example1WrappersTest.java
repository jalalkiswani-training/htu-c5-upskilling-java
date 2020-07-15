package edu.htu.upskilling.java.lecture4;

public class Example1WrappersTest {
	public static void main(String[] args) {
		int i=10;
		String str=Integer.toString(i);
		String str3=i+"";
		
		String str2="100";
		int i2=Integer.parseInt(str2);

		String str4="110.2";
		double d=Double.parseDouble(str4);
		
		System.out.println(i2);
	}
}
