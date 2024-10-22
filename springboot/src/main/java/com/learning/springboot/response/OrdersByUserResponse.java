package com.learning.springboot.response;

import lombok.Data;

@Data
public class OrdersByUserResponse {

	private Integer id;
	
	private String name;
	
	private String productName;
	
	private Float unitPrice;
	
	private Integer quantity;
	
	private Float totalPrice;
	
	private String email;
	
}
