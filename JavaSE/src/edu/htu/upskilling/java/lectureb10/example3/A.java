package edu.htu.upskilling.java.lectureb10.example3;

public interface A {
	public default void mA1() {
		System.out.println("m1 from A");
	}
	
	public default void mA2() {
		System.out.println("m2 from A");
	}
	
	public default void mA3() {
		System.out.println("m3 from A");
	}
	
	public void m4();
}
