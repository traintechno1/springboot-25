package com.learning.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learning.springboot.entity.User;
import com.learning.springboot.repository.IUserRepository;
import com.learning.springboot.service.interfaces.IUserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService implements IUserService {

	private final IUserRepository iUserRepository;
	
	public List<User> getUsersList() {
		return (List<User>) iUserRepository.findAll();
	}
	
	public Optional<User> getUserById(Integer id) {
		return iUserRepository.findById(id);
	}
	
}
