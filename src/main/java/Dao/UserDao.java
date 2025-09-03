package Dao;

import java.util.List;

import Model.User;

public interface UserDao {
	List<User> findAll();
	
	User findById(int id);
	
	void insert(User user);
	
	User findByUserName(String username);
}
