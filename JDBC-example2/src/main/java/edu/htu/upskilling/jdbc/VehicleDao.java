package edu.htu.upskilling.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

//DAO: Data Access Object
public class VehicleDao {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/upskilling_java";
	private static final String DB_PASSWORD = "123456";
	private static final String DB_USERNAME = "root";

	/////////////////////////////////////////
	public Vector<Vehicle> getAll() throws SQLException {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM dmv_vehicles");
			ResultSet rs = ps.executeQuery();
			Vector<Vehicle> list = new Vector<Vehicle>();
			while (rs.next()) {
				list.add(fillVehicle(rs));
			}
			ps.close();
			rs.close();// should be closed in reliable way
			return list;
		} finally {
			connection.close();
		}
	}

	/////////////////////////////////////////
	public Vehicle find(String vin) throws SQLException {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM dmv_vehicles WHERE veh_vin=?");
			ps.setString(1, vin);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Vehicle v = fillVehicle(rs);
				return v;
			}
			rs.close();
			ps.close();
			return null;
		} finally {
			connection.close();
		}
	}

	/////////////////////////////////////////
	public boolean delete(String vin) throws SQLException {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM dmv_vehicles WHERE veh_vin=?");
			ps.setString(1, vin);
			int count = ps.executeUpdate();
			ps.close();
			return count == 1;
		} finally {
			connection.close();
		}
	}

	/////////////////////////////////////////
	public boolean update(Vehicle vehicle) throws SQLException {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE dmv_vehicles SET veh_brand=?,veh_model=?,veh_year=? WHERE veh_vin=?");
			ps.setString(1, vehicle.getVehBrand());
			ps.setString(2, vehicle.getVehModel());
			ps.setInt(3, vehicle.getVehYear());
			ps.setString(4, vehicle.getVehVin());
			int count = ps.executeUpdate();
			ps.close();
			return count == 1;
		} finally {
			connection.close();
		}
	}

	/////////////////////////////////////////
	public void add(Vehicle v) throws SQLException {
		Connection connection = getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO dmv_vehicles(veh_brand,veh_model,veh_year,veh_vin) VALUES (?,?,?,?)");
			ps.setString(1, v.getVehBrand());
			ps.setString(2, v.getVehModel());
			ps.setInt(3, v.getVehYear());
			ps.setString(4, v.getVehVin());
			ps.executeUpdate();
			ps.close();
		} finally {
			connection.close();
		}
	}

	/////////////////////////////////////////////////////////
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}

	/////////////////////////////////////////////////////////
	private Vehicle fillVehicle(ResultSet rs) throws SQLException {
		Vehicle v = new Vehicle();
		v.setVehBrand(rs.getString("veh_brand"));
		v.setVehModel(rs.getString("veh_model"));
		v.setVehYear(rs.getInt("veh_year"));
		v.setVehVin(rs.getString("veh_vin"));
		return v;
	}

}
