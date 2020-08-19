package edu.htu.upskilling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jk.util.JK;

public class JdbcExample1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// mysql driver name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upskilling_java", "root", "123456");// url,username,password

			System.out.println("Deleting all previous records");
			PreparedStatement ps2 = con.prepareStatement("DELETE FROM hr_employees");
			ps2.execute();

			System.out.println("Inserting record 1");
			PreparedStatement ps = con.prepareStatement("INSERT INTO hr_employees VALUES(?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "Ata");
			ps.setDouble(3, 100);
			ps.execute();

			System.out.println("Inserting record 2");
			ps.setInt(1, 2);
			ps.setString(2, "Jamal");
			ps.setDouble(3, 200);
			ps.execute();

			System.out.println("Updating record");
			PreparedStatement ps3 = con.prepareStatement("UPDATE hr_employees SET emp_salary=? WHERE emp_id=?");
			ps3.setInt(1, 500);
			ps3.setInt(2, 2);
			ps3.execute();

			PreparedStatement ps4 = con.prepareStatement("SELECT emp_id,emp_name,emp_salary FROM hr_employees");
			ResultSet rs = ps4.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				double salary = rs.getDouble("emp_salary");
				JK.print(id, name, salary);
			}

			ps.close();
			ps2.close();
			ps3.close();
			ps4.close();
			rs.close();
			con.close();
			System.out.println("Done!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
