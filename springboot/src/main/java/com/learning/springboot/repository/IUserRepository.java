package com.learning.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {

}
