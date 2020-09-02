package edu.htu.upskilling.java.lecture6;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=103;
		emp.name="Kamal";
		emp.basic=1000;
		emp.deductions=100;
		emp.allownces=50;
		
		int n1=readNumber();
	
		int finalSalary = emp.calculateFinalSalary();
		System.out.println("Final Salary = "+finalSalary);
		
		Employee emp2=new Employee();
		emp2.id=205;
		emp2.name="Jameel";
		
		System.out.println(emp2.id);//205
		System.out.println(emp.id);//103
		
		Employee emp3=emp;
		System.out.println(emp.id);//103
		System.out.println(emp3.id);//103
		emp3.name="Abdallah";
		
		System.out.println(emp.name);//Abdallah
		
	}

	private static int readNumber() {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		return n;
	}
}
