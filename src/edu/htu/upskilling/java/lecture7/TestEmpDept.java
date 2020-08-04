package edu.htu.upskilling.java.lecture7;

public class TestEmpDept {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmployeeId(1);
		e.setEmployeeName("Ahmad");
		
		// composition "has a"
	/*	Department department=new Department();
		department.setDeptId(2);
		department.setDeptName("IT");
		department.setDeptLocation("Amman");
		e.setDepartment(department);*/
		
		
		Department department2=new Department(2, "HR", "Amman");
		Employee employee2=new Employee(1, "mohamad", department2);
		System.out.println(employee2.getDepartment().getDeptName());
		
		/*
		 * System.out.println(e.getEmployeeId());
		 * System.out.println(e.getEmployeeName());
		 * System.out.println(e.getDepartment().getDeptId());
		 * System.out.println(e.getDepartment().getDeptName());
		 * System.out.println(e.getDepartment().getDeptLocation());
		 * 
		 * System.out.println(department.getDeptId());
		 * System.out.println(department.getDeptId());
		 * 
		 */
		/*
		 * System.out.println("Using toString method");
		 * System.out.println(e.getDepartment()); System.out.println(e);
		 */
		

	}

}
