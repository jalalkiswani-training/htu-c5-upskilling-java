package edu.htu.upskilling.java.lecture7;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Department department; 
	// Composition: 
	//Instance variable from another class type
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
