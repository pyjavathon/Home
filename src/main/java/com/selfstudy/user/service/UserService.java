package com.selfstudy.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.selfstudy.user.entity.User;


public interface UserService {
	
	List<User> selectUser();
	
	void delelteUser(String id);
	
	void insertUser(User user);
	
	void updateUser(User user);
	
	//---------------------------------------
	
	Optional<User> mapperSelectOne(String id);

	List<User> mapperSelectAll();
	
}
