package com.selfstudy.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> selectUser() {
		return userRepo.findAll();
		
	}

	@Override
	public void delelteUser(String id) {
		userRepo.deleteById(id);
	}

	@Override
	public User insertUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		User updateUser = userRepo.findById(user.getId()).get();
		
		//updateUser.setId(user.getId());
		updateUser.setName(user.getName());
		return userRepo.save(updateUser);
	}

}
