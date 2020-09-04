package a;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralDao {
	private static String driver = System.getProperty("db-driver", "com.mysql.cj.jdbc.Driver");
	private static final String DB_URL = System.getProperty("db-url", "jdbc:mysql://localhost:3306/app");
	private static final String DB_USERNAME = System.getProperty("db-username", "root");
	private static final String DB_PASSWORD = System.getProperty("db-password", "123456");

	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found, system will exit: " + driver);
			System.exit(-1);
		}
	}

	/////////////////////////////////////////////////////////
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}

	/////////////////////////////////////////////////////////
	protected void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	/////////////////////////////////////////////////////////
	protected void close(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
			}
		}
	}

	/////////////////////////////////////////////////////////
	protected void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
	}

	/////////////////////////////////////////////////////////
	protected void close(PreparedStatement ps, Connection con) {
		close(null, ps, con);
	}

	/////////////////////////////////////////////////////////
	protected void close(ResultSet rs, PreparedStatement ps, Connection con) {
		close(rs);
		close(ps);
		close(con);
	}
}
