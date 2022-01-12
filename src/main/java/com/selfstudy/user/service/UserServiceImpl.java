package com.selfstudy.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfstudy.mapper.UserMapper;
import com.selfstudy.user.entity.User;
import com.selfstudy.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> selectUser() {
		return userRepo.findAll();
		
	}

	@Override
	public void delelteUser(String id) {
		userRepo.deleteById(id);
	}

	@Override
	public void insertUser(User user) {
		
		userRepo.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepo.save(user);
	}
//-------------------------------------------------------------
	@Override
	public Optional<User> mapperSelectOne(String id) {
		Optional<User> result = userMapper.mapperSelectOne(id);
		return result;
	}

	@Override
	public List<User> mapperSelectAll() {
		List<User> user = userMapper.selectAll();
		return user;
	}

}
