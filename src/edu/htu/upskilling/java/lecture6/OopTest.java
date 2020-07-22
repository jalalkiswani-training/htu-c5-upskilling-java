package edu.htu.upskilling.java.lecture6;

public class OopTest {
	public static void main(String[] args) {
		//Person: class name
		//p: reference
		//new Person(): construction
		Person p1=new Person();
		p1.name="Ata";
		p1.age=20;
		p1.sayHello();//hello my name is Ata
		
		Person p2=new Person();
		p2.name="Essa";
		p2.age=30;
		p2.sayHello();//hello my name is Essa
		
		p1.sayHello();//hello my name is Ata
		
	}
}
