package dao;

import java.util.List;

import entities.Restaurant;

public interface RestaurantDao {

	void insert(Restaurant obj);
	void update(Restaurant obj);
	void deleteById(Integer id);
	Restaurant findById(Integer id);
	List<Restaurant> findAll();
	
}
