package com.selfstudy.user;

import java.util.List;

public interface UserService {
	
	List<User> selectUser();
	
	void delelteUser(String id);
	
	User insertUser(User user);
	
	User updateUser(User user);
	
}
