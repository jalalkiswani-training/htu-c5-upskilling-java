package edu.htu.upskilling.java.lecture7;

public class Test {
public static void main(String[] args) {
	Department department=new Department();// null
	department.setDeptId(1);
	department.setDeptName("IT");
	department.setDeptLocation("Jordan");
	Employee e=new Employee(1, "Hana", department);
	System.out.println(e.getDepartment().getDeptName());
	
}
}
