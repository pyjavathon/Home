package com.selfstudy.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepo;
	
	
	//get-read , 조회
	//= @GetMapping(value ="/select", headers = { "Content-type=application/json" })
	@GetMapping(value ="/select", produces = { "application/json" })
	public @ResponseBody List<User> selectUser(){
		  return userService.selectUser();
	}
	
	//delete , 삭제
	@DeleteMapping(value="/delete/{id}")
	public void deleteUser(@RequestBody @PathVariable String id) {
		userService.delelteUser(id);
	}
	
	//post-create, 추가
	@PostMapping(value = "/insert")
	public @ResponseBody User insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	//put - update , 수정
	@PutMapping(value="/update", headers = { "Content-type=application/json" })
	public User updateUser(@RequestBody User user) {
		 return userService.updateUser(user);
	}
	
	
	

	
	
	
}
