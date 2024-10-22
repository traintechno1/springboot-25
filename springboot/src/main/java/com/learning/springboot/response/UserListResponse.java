package com.learning.springboot.response;

import java.util.List;

import lombok.Data;

@Data
public class UserListResponse {
	
	private List<UserResponse> userList; 
}
