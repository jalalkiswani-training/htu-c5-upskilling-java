package edu.htu.upskilling.java.lecture6;

public class Employee {
	int id;
	String name;
	int basic;
	int deductions;
	int allownces;
	
	public int calculateFinalSalary() {
		return basic-deductions+allownces;
	}
}
