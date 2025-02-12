package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dao.UserDao;
import db.DB;
import db.DbException;
import entities.User;

public class UserDaoJDBC implements UserDao {

	private Connection conn;
	
	public UserDaoJDBC(Connection conn) {}

	@Override
	public void insert(User obj) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(
					"INSERT INTO tbl_user "
					+ "(id_user, name_user, email_user, date_booking) "
					+ "VALUES "
					+ "(?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, obj.getId());
			ps.setString(2, obj.getName());
			ps.setString(3, obj.getEmail());
			ps.setDate(4, new java.sql.Date(obj.getBooking().getTime()));
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0) {
				rs = ps.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
			}
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void update(User obj) {
		
		PreparedStatement ps = null;
		
		try {
			
			ps = conn.prepareStatement(
					"UPDATE tbl_user "
					+ "SET name_user = ?, email_user = ?, date_booking = ? "
					+ "WHERE id_user = ?");
			
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getBooking().getTime()));
			ps.setInt(4, obj.getId());

			
			ps.executeUpdate();
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(
					"DELE FROM tbl_user "
					+ "WHERE id_user = ?");
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public User findById(Integer id) {
		return null;
	}

	@Override
	public List<User> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
