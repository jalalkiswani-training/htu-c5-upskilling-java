package edu.htu.upskilling.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class VehicleDao extends GeneralDao {

	/////////////////////////////////////////
	public void add(Vehicle v) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO dmv_vehicles(veh_brand,veh_model,veh_year,veh_vin) VALUES (?,?,?,?)");
			ps.setString(1, v.getVehBrand());
			ps.setString(2, v.getVehModel());
			ps.setInt(3, v.getVehYear());
			ps.setString(4, v.getVehVin());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, con);
		}
	}

	/////////////////////////////////////////
	public Vehicle find(String vin) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("SELECT * FROM dmv_vehicles WHERE veh_vin=?");
			ps.setString(1, vin);
			rs = ps.executeQuery();
			if (rs.next()) {
				return populateVehicle(rs);
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, ps, con);
		}
	}

	/////////////////////////////////////////
	public boolean delete(String vin) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("DELETE FROM dmv_vehicles WHERE veh_vin=?");
			ps.setString(1, vin);
			int count = ps.executeUpdate();
			return count == 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, null);
		}
	}

	/////////////////////////////////////////
	public boolean update(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("UPDATE dmv_vehicles SET veh_brand=?,veh_model=?,veh_year=? WHERE veh_vin=?");
			ps.setString(1, vehicle.getVehBrand());
			ps.setString(2, vehicle.getVehModel());
			ps.setInt(3, vehicle.getVehYear());
			ps.setString(4, vehicle.getVehVin());
			int count = ps.executeUpdate();
			return count == 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, con);
		}
	}

	/////////////////////////////////////////
	public Vector<Vehicle> getAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("SELECT * FROM dmv_vehicles");
			rs = ps.executeQuery();
			Vector<Vehicle> list = new Vector<Vehicle>();
			while (rs.next()) {
				list.add(populateVehicle(rs));
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, ps, con);
		}
	}

	/////////////////////////////////////////////////////////
	protected Vehicle populateVehicle(ResultSet rs) throws SQLException {
		Vehicle v = new Vehicle();
		v.setVehBrand(rs.getString("veh_brand"));
		v.setVehModel(rs.getString("veh_model"));
		v.setVehYear(rs.getInt("veh_year"));
		v.setVehVin(rs.getString("veh_vin"));
		return v;
	}

}
