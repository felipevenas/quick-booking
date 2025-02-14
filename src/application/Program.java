package application;

import java.util.Date;
import java.util.List;

import dao.DaoFactory;
import dao.UserDao;
import entities.User;

public class Program {

	public static void main(String[] args) {

		UserDao userDao = DaoFactory.createUserDao();
		
		/*
		System.out.println("=== Test 1: User - Insert ======");
		User user = new User("Felipe", "felipe@gmail.com", new Date(), 0);
		userDao.insert(user);
		System.out.println("Sucess! New user was inserted.");
				
		System.out.println("=== Test 2: User - Update ======");
		user = userDao.findById(2);
		user.setName("Gabriel");
		user.setEmail("gabriel@gmail.com");
		userDao.update(user);
		System.out.println("Sucess! The user was updated.");
				
		System.out.println("=== Test 3: User - DeleteById ======");
		userDao.deleteById(7);
		System.out.println("Sucess! The user was deleted.");
		
		System.out.println("=== Test 4: User - FindById ======");
		User user = userDao.findById(2);
		System.out.println(user);
		
		System.out.println("=== Test 4: User - FindById ======");
		User user = userDao.findById(2);
		System.out.println(user);
		
		System.out.println("=== Test 5: User - ListAll ======");
		List<User> list = userDao.findAll();
		for (User user : list) {
			System.out.println(user);		
		}
		*/
		
	}

}
