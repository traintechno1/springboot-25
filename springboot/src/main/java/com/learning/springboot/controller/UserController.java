package com.learning.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.entity.User;
import com.learning.springboot.response.AddUserResponse;
import com.learning.springboot.response.OrdersByUserResponse;
import com.learning.springboot.response.OrdersResponse;
import com.learning.springboot.response.UserListResponse;
import com.learning.springboot.response.UserResponse;
import com.learning.springboot.service.interfaces.IUserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "v1/user/")
public class UserController {
	
	private final IUserService iUserService;
	
	@GetMapping("list")
//	@RequestMapping(method = RequestMethod.GET, path = "v1/users")
	public UserListResponse getAllUsers(){
		return iUserService.getUsersList();
	}
	
	@GetMapping("{id}")
	public UserResponse getUserById(@PathVariable("id") Integer id) {
		return iUserService.getUserById(id);
	}
	
	@PostMapping("add")
	public AddUserResponse addUser(@RequestBody() User u ) {
		System.out.println(u.toString());
		return iUserService.addUpdateUser(u);
	}
	
	@PutMapping("update")
	public AddUserResponse updateUser(@RequestBody() User u) {
		System.out.println(u.toString());
		return iUserService.addUpdateUser(u);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		System.out.println("User with " + id +  " is getting deleted");
		iUserService.deleteUser(id);
	}
	
	@GetMapping("orders/{userId}")
	public OrdersResponse getOrdersByUser(@PathVariable("userId") Integer userId) {
		System.out.println("Getting all the orders for userId: " + userId);
		return iUserService.getOrdersByUserId(userId);
	}
	
}
