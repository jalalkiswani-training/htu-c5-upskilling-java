package edu.htu.upskilling.java.lecture8.polymorphism;

public class Animal {
	
	private int age;
	private String name;
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
	
	public void sayHello() {
		System.out.println("hello from animal class");
	}
	
	

}
