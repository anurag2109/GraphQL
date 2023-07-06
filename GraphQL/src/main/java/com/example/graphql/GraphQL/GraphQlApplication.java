package com.example.graphql.GraphQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.graphql.GraphQL.services.BookService;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setAuthor("xyz");
		b1.setDesc("For Learning Java");
		b1.setPages(200);
		b1.setPrice(200.89);
		
		
		Book b2 = new Book();
		b2.setTitle("Head First to Java");
		b2.setAuthor("ANurag");
		b2.setDesc("For Beginner Learning Java");
		b2.setPages(300);
		b2.setPrice(700.89);
		
		this.bookService.create(b1);
		this.bookService.create(b2);
	}

}
