package com.learning.springboot.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.springboot.entity.User;
import com.learning.springboot.response.AddUserResponse;
import com.learning.springboot.response.OrdersByUserResponse;
import com.learning.springboot.response.OrdersResponse;
import com.learning.springboot.response.UserListResponse;
import com.learning.springboot.response.UserResponse;

@Service
public interface IUserService {
	UserListResponse getUsersList();
	
	UserResponse getUserById(Integer id);
	
	AddUserResponse addUpdateUser(User u);
	
	void deleteUser(Integer id);
	
	OrdersResponse getOrdersByUserId(Integer id);
}
