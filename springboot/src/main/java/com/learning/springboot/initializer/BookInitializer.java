package com.learning.springboot.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboot.entity.Book;
import com.learning.springboot.repository.IBookRepository;

@Component
public class BookInitializer implements CommandLineRunner {
	
	private final IBookRepository bookRepository;

	BookInitializer(IBookRepository bookRepository){
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Book b = new Book();
//		
//		b.setTitle("Let Us C");
//		b.setAuthor("Yashavant Kanetkar");
//		b.setIsban("INDIT00234");
//		b.setNoOfPages(245);
//		b.setPrice(300.50f);
//		
//		Book b2 = new Book();
//		
//		b2.setTitle("Let Us C++");
//		b2.setAuthor("Yashavant Kanetkar");
//		b2.setIsban("INDIT00123");
//		b2.setNoOfPages(300);
//		b2.setPrice(500f);
//		
//		bookRepository.save(b);
//		bookRepository.save(b2);
//		
//		bookRepository.findAll().forEach(e-> System.out.println(e.toString()));
		
	}
}
