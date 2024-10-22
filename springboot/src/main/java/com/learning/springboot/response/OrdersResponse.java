package com.learning.springboot.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdersResponse {

	List<OrdersByUserResponse> orders;
	
}
