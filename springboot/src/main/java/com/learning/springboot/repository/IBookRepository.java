package com.learning.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.entity.Book;

@Repository
public interface IBookRepository extends CrudRepository<Book, Integer> {

}
