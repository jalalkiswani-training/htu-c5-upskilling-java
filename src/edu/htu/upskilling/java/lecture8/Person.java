package edu.htu.upskilling.java.lecture8;

public class Person {
	protected int age;
	protected String name;
	
	public Person() {
		System.out.println("Person is constructed");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Person eats");
	}
	
	public void walk() {
		System.out.println("Person eats");
	}


}
