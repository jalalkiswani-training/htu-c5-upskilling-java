package edu.htu.upskilling.java.lectureb13;

import java.util.Vector;

public class Collections3 {
	public static void main(String[] args) {
		//Collections with Generics, started with Java 5
		Vector<Person> persons=new Vector<Person>();
		persons.add(new Person(101,"Ata"));
		persons.add(new Person(102,"Essa"));
		persons.add(new Person(103,"Jameel"));
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
	}
}
