package com.app.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.app.models.Employee;
import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;
import com.jk.util.JK;
import com.jk.web.faces.mb.JKManagedBean;

@ManagedBean(name = "mbEmployee")
public class MBEmployee extends JKManagedBean {
	private JKObjectDataAccess dao = JKDataAccessFactory.getObjectDataAccess();
	private Employee employee;

	public Employee getEmployee() {
		if (employee == null) {
			employee = new Employee();
		}
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String save() {
		dao.insert(employee);
		success("Record added successfully");
		return null;
	}

	public List<Employee> getEmployees() {
		return dao.getList(Employee.class);
	}

	// For unit testing purposes
	public static void main(String[] args) {
		MBEmployee mb = new MBEmployee();
		List<Employee> employees = mb.getEmployees();
		for (Employee employee : employees) {
			JK.print(employee);
		}
	}

	public String reset() {
		employee = null;
		return null;
	}

	public String update() {
		dao.update(employee);
		success("Updated Successfully");
		return null;
	}

	public String delete() {
		dao.delete(employee);
		employee=null;
		success("Deleted Successfully");
		return null;
	}

}
