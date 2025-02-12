package dao;

import dao.impl.RestaurantDaoJDBC;
import dao.impl.UserDaoJDBC;
import db.DB;

public class DaoFactory {

	public static UserDao createUserDao() {
		return new UserDaoJDBC(DB.getConnection());
	}
	
	public static RestaurantDao createRestaurantDao() {
		return new RestaurantDaoJDBC(DB.getConnection());
	}
	
}
