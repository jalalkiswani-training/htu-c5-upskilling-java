package edu.htu.upskilling.java.lectureb13;

import java.util.Vector;

public class Collections4 {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(new Integer(5));//Integer: wrapper class of int
		v.add(10);//AutoBoxing: 10 ==> new Integre(10)
		v.add(new Integer(20));
		v.add(100);//Auto boxing
		v.add(new Integer(100));
		int n=(Integer) v.get(0);//Auto unboxing: extract int value from the wrapper class
		
		Vector<Double> doubles=new Vector<>();
		doubles.add(10.0);//new Double(10.0)
		doubles.add(11.4);//new Double(11.4)
		doubles.add(12.8);//new Double(12.8)
		
		for (double d: doubles) {
			System.out.println(d);
		}

		Integer i=null;
		int n2=i;//i.intValue();
		
		System.out.println(n2);
		
	}
}
