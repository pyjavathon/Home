package com.selfstudy.user;

import java.util.List;

public interface UserService {
	
	List<User> selectUser();
	
	void delelteUser(String id);
	
	void insertUser(User user);
	
	void updateUser(User user);
	
}
