package com.app.models;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccessImpl;

public class JPATest {
	public static void main(String[] args) {
		JKObjectDataAccess dao = new JKObjectDataAccessImpl();
		Student student = new Student();
		student.setNumber("121212");
		student.setName("Jalal");
		student.setPhone("123456789");
		student.setAvg(90.0);

		dao.insert(student);
		
		List<Student> list = dao.getList(Student.class);
		for (Student std : list) {
			System.out.println(std);
		}
		
		Student std = dao.find(Student.class, 1);
		std.setName("Updated Jalal");
		dao.update(std);
		
		dao.delete(Student.class, 1);		
	}


}
