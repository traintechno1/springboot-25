package com.learning.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.entity.Book;

@RestController
public class SimpleAPI {
	
	@GetMapping("getMessage")
	String getmessage() {
		return "Hello, Good Morning";
	}
	
	
	@GetMapping("v1/getAreaOfCircle/{radius}")
	Float getValue(@PathVariable("radius") Integer radius) {
		return (float) 3.14 * radius * radius;
	}
	
	
	@GetMapping("v1/getAreaOfRectangle/{length}/{breadth}")
	Integer getAreaOfRectangle(
				@PathVariable("length") Integer length, 
				@PathVariable("breadth") Integer breadth) {
		System.out.println("Get Area Of Rectangle is called with length = " + length + " breadth = " + breadth);
		return length * breadth;
	}

	
	@GetMapping("v1/getAreaOfRectangle")
	Integer getAreaOfRectangle(
				@RequestParam("length") int length, 
				@RequestParam("breadth") int breadth) {
		System.out.println("Get Area Of Rectangle is called with Request Params length = " + length + " breadth = " + breadth);
		return length * breadth;
	}
	
	@GetMapping("v1/getBookDetails")
	List<Book> getBookDetails() {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book(101, "How to influence people", "Dale Careige", "US982121", 300, 600));
		books.add(new Book(102, "How to stop worring and start living", "Dale Careige", "US982121", 250, 500));
		
		return books;
	}
}