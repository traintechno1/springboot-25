package com.learning.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.springboot.entity.User;
import com.learning.springboot.repository.IUserRepository;
import com.learning.springboot.response.AddUserResponse;
import com.learning.springboot.response.OrdersByUserResponse;
import com.learning.springboot.response.OrdersResponse;
import com.learning.springboot.response.UserListResponse;
import com.learning.springboot.response.UserResponse;
import com.learning.springboot.service.interfaces.IUserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService implements IUserService {

	private final IUserRepository iUserRepository;
	
	public UserListResponse getUsersList() {
		
		List<User> users = (List<User>) iUserRepository.findAll();
		
		UserListResponse response = new UserListResponse();
		List<UserResponse> usersList = new ArrayList<UserResponse>();
		
		users.forEach(user->{
			UserResponse u = new UserResponse();
			u.setId(user.getId());
			u.setFirst(user.getFirstName());
			u.setLast(user.getLastName());
			u.setFullName(user.getFirstName() + " " + user.getLastName());
			u.setEmail(user.getEmail());
			u.setMobile(user.getMobile());
			u.setGender(user.getGender());
			u.setCity(user.getCity());	
			
			usersList.add(u);
		});
		
		response.setUserList(usersList);
		return response;
	}
	
	public UserResponse getUserById(Integer id) {
		User user = iUserRepository.findById(id).orElse(new User());
		
		UserResponse response = new UserResponse();
		
		response.setId(user.getId());
		response.setFirst(user.getFirstName());
		response.setLast(user.getLastName());
		response.setFullName(user.getFirstName() + " " + user.getLastName());
		response.setEmail(user.getEmail());
		response.setMobile(user.getMobile());
		response.setGender(user.getGender());
		response.setCity(user.getCity());	
		
		return response;
	}

	public AddUserResponse addUpdateUser(User u) {
		AddUserResponse response = new AddUserResponse();
		try {
			User user = iUserRepository.save(u);
			response.setId(user.getId());
			response.setMessage("User Added Successfully in the system!!");
			
		}catch(Exception ex) {
			response.setMessage("Email is already used, use new email");
			response.setId(null);
		}
		
		return response;
	}
	
	public void deleteUser(Integer id) {
		iUserRepository.deleteById(id);
	}

	public OrdersResponse getOrdersByUserId(Integer id) {
		
		OrdersResponse response = new OrdersResponse();
		
		List<OrdersByUserResponse> craftData = new ArrayList<OrdersByUserResponse>();
				
		List<Object[]> data = iUserRepository.getOrdersByUserId(id);
		
		for(Object d[] : data) {
			OrdersByUserResponse order = new OrdersByUserResponse();
			
			order.setId((Integer) d[0]);
			order.setName((String) (d[1]+ " " + d[2]));
			order.setProductName((String) d[3]);
			order.setUnitPrice((Float) d[4]);
			order.setQuantity((Integer) d[5]);
			order.setTotalPrice((Float) d[6]);
			order.setEmail((String) d[7]);
			
			craftData.add(order);
		}
		
		response.setOrders(craftData);
		
		return response;
		
	}
	
}
