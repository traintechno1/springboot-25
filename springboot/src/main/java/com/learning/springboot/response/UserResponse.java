package com.learning.springboot.response;

import lombok.Data;

@Data
public class UserResponse {
private int id;
	
	private String first;
	
	private String last;
	
	private String fullName;
	
	private String email;
	
	private long mobile;
	
	private char gender;
	
	private String city;
	
}
