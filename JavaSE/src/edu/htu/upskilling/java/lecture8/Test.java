package edu.htu.upskilling.java.lecture8;

public class Test {

	public static void main(String[] args) {
	Person person1=new Person();
	person1.eat();
	person1.setName("Ahmad");
	person1.setAge(25);
	System.out.println("-----------------");
	
	Employee emp1=new Employee();
	emp1.eat();

	emp1.setAge(12);
	emp1.setName("khaled");
	System.out.println(emp1.getAge());
	System.out.println(emp1.getName());
	
	System.out.println("-----------------");
	
	Student s1=new Student();
	s1.setAge(30);
	s1.setName("jamal");
	System.out.println(s1.getAge());
	System.out.println(s1.getName());
	s1.age=2;
	s1.eat();
	}

}
