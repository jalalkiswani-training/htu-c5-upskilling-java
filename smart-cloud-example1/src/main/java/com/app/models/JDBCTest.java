package com.app.models;

import com.jk.db.dataaccess.core.JKDataAccessService;
import com.jk.db.datasource.JKDataSourceFactory;

public class JDBCTest {
	public static void main(String[] args) {
		JKDataAccessService service=JKDataSourceFactory.getDataAccessService();
		
		//service.execute("UPDATE student SET name=?,avg=? WHERE id=?", "Ata",100,2);
		//service.execute("DELETE FROM student WHERE id=?", 2);
		int count = service.executeQueryAsInteger("SELECT COUNT(*) FROM hr_employees");
		System.out.println(count);
	}
}
