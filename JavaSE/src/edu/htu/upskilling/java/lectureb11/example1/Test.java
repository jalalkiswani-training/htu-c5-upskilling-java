package edu.htu.upskilling.java.lectureb11.example1;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();// M1 from A

		B b1 = new B();
		b1.m2();// M2 from B

		b1.m1();// M1 from B
		b1.m0();

		A a2 = b1;
		// a reference from super class
		// can point to reference from
		// a subclass without problem
		// Implicit casting
		a2.m0();// M0 from A

		a2.m1();// M1 from B
		// Polymorphism:

		/*
		 * Polymoprhism Rules: 1- A Super-class reference can point to a subclass
		 * reference with implicit casting 2- A subclass referencecan point to a super
		 * class reference with explicty casting. NOTE: explicit casting can cause a
		 * runtime exception if the actual object is not from the subclass type
		 * 
		 * 
		 */

		if (a1 instanceof B) {
			B b2 = (B) a1;// explicit casting: ClassCastException
			b2.m2();
		}

		B b3 = (B) a2;
		b3.m2();//

		// Having a reference from a superclass
		// points to an Object from a subclass
		// , in this case, calling a method
		// that is overriden in the subclass
		// will cause overriden method to be called
		// instead of the super method

	}
}
