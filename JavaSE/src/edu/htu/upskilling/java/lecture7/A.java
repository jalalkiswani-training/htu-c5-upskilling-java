package edu.htu.upskilling.java.lecture7;

public class A {
	private C c; // composition: C is instance variable with type from another class 
	
	
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void test() {
		B b=new B(); // Dependency: B is a local variable from another class
		b.m2();
		c.m1();
	}

}
