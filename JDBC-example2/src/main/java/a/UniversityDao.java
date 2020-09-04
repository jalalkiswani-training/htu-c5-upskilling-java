package a;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import edu.htu.upskilling.jdbc.University;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class UniversityDao extends GeneralDao {

	/////////////////////////////////////////
	public void add(University university) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO university (name field_2 field_3 field_4 field_5 field_6 field_7) VALUES (?,?,?,?,?,?,?)";
			con = getConnection();
			ps = con.prepareStatement(sql);
			int counter = 1;
			ps.setObject(counter++, university.getName());
			ps.setObject(counter++, university.getField2());
			ps.setObject(counter++, university.getField3());
			ps.setObject(counter++, university.getField4());
			ps.setObject(counter++, university.getField5());
			ps.setObject(counter++, university.getField6());
			ps.setObject(counter++, university.getField7());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, con);
		}
	}

	/////////////////////////////////////////
	public University find(int id) {	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("SELECT * FROM university WHERE id=?");
			ps.setObject(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				return populateUniversity(rs);
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, ps, con);
		}
	}

	/////////////////////////////////////////
	public boolean delete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("DELETE FROM university WHERE id=?");
			ps.setObject(1, id);
			int count = ps.executeUpdate();
			return count == 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, null);
		}
	}

	/////////////////////////////////////////
	public boolean update(University university) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			String sql = "UPDATE university SET name=?,field_2=?,field_3=?,field_4=?,field_5=?,field_6=?,field_7=? WHERE id=?";
			ps = con.prepareStatement(sql);
			int counter = 1;
			ps.setObject(counter++, university.getName());
			ps.setObject(counter++, university.getField2());
			ps.setObject(counter++, university.getField3());
			ps.setObject(counter++, university.getField4());
			ps.setObject(counter++, university.getField5());
			ps.setObject(counter++, university.getField6());
			ps.setObject(counter++, university.getField7());
			ps.setObject(counter++, university.getId());
			int count = ps.executeUpdate();
			return count == 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(ps, con);
		}
	}

	/////////////////////////////////////////
	public Vector<University> getAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("SELECT * FROM university");
			rs = ps.executeQuery();
			Vector<University> list = new Vector<>();
			while (rs.next()) {
				list.add(populateUniversity(rs));
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, ps, con);
		}
	}

	/////////////////////////////////////////////////////////
	protected University populateUniversity(ResultSet rs) throws SQLException {
		University university = new University();
		university.setId(rs.getInt("id"));
		university.setName(rs.getString("name"));
		university.setField2(rs.getString("field_2"));
		university.setField3(rs.getString("field_3"));
		university.setField4(rs.getString("field_4"));
		university.setField5(rs.getString("field_5"));
		university.setField6(rs.getString("field_6"));
		university.setField7(rs.getString("field_7"));
		return university;
	}

}