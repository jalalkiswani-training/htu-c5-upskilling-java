package edu.htu.upskilling.java.lecture8;

public class Employee extends Person{
	public Employee() {
		System.out.println("Employee is constructed");
	}
	private double salary;
	private String department;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	


}
