package edu.htu.upskilling.java.lecture8.inherteince;

public class Animal {
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(int age) {
		super();
		this.age = age;
		System.out.println("Age is assigned inside Animal with age parameter constructor ");
	}

	public Animal() {
		System.out.println("no parameter Animal constructor is called");
	}
	
	public void sayHello() {
		System.out.println("Hello from Animal class");
	}

}
