package com.learning.springboot.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learning.springboot.entity.User;

@Service
public interface IUserService {
	List<User> getUsersList();
	
	Optional<User> getUserById(Integer id);
}
