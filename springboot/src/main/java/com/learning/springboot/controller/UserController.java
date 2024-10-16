package com.learning.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.entity.User;
import com.learning.springboot.service.interfaces.IUserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	
	private final IUserService iUserService;
	
	@GetMapping("v1/users")
	public List<User> getAllUsers(){
		return iUserService.getUsersList();
	}
	
	@GetMapping("v1/user/{id}")
	public Optional<User> getUserById(@PathVariable("id") Integer id) {
		return iUserService.getUserById(id);
	}
	
}
