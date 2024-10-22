package com.learning.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.springboot.entity.User;
import com.learning.springboot.response.OrdersByUserResponse;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT o.id, u.firstName, u.lastName, o.productName, o.unitPrice, o.quantity, o.totalPrice, u.email FROM Orders"
			+ " o INNER JOIN o.user u WHERE u.id = :userId")
	List<Object[]> getOrdersByUserId(@Param("userId") Integer userId);

}
