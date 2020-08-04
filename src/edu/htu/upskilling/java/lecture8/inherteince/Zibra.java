package edu.htu.upskilling.java.lecture8.inherteince;

public class Zibra extends Animal {
	private String name;
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	// 1- when Zibra object is constructed with new keyword, it implicitly calls the super class
		// constructor - Animal() 
		// 2- the child class consructor will be called, check the parameters number
	public Zibra() {
		super(10);
		System.out.println("Zibra constructor ");
		
	}
	
	
	
	

	public Zibra(String name) {
		// means call another constructor inside the same class
		// with matching the number of parameters
		this(); 
		this.name = name;
		System.out.println("Name is assigned inside Zibra with parameter constructor ");
	}



	public void sayHello() {
		super.sayHello();
		System.out.println("Hello from Zibra");
	}
}
