package edu.htu.upskilling.java.lectureb13;

import java.util.ArrayList;
import java.util.Vector;

public class Collections2 {
	public static void main(String[] args) {
		ArrayList v2=new ArrayList();

		v2.add(new Person(101,"Ata"));
		v2.add(new Person(102,"Essa"));
		v2.add(new Person(103,"Jameel"));
		v2.add("Kamal");
		
		Person p1=(Person) v2.get(1);//object 
		v2.remove(2);
		
		
		Vector v=new Vector();//no size , ArrayList
		v.add("Jalal");//index 0
		v.add("Ata");//index: 1
		v.add("Kamal");//index: 2
		
		for (Object name: v) {
			System.out.println(name);
		}
		
//		System.out.println(v.get(0));
//		System.out.println(v.get(1));
//		System.out.println(v.get(2));
		System.out.println(v.size());
	}
}
