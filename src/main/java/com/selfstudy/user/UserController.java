package com.selfstudy.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value ="/select", headers = { "Content-type=application/json" })
	public @ResponseBody List<User> selectUser(){
		  return userService.selectUser();
	}

	
	
	
}
