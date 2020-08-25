package edu.htu.upskilling.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SimpleJdbcExample {
	public static void main(String[] args) {
		String name="Ata";
		int age=20;
		String email="ata@ata.com";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/upskilling_java", "root", "123456");
			System.out.println("Connected successfully");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO driver (name,age,email) VALUES (?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, email);
			ps.executeUpdate();
			System.out.println("Saved successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
