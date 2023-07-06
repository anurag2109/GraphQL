package com.example.graphql.GraphQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.graphql.GraphQL.Book;
import com.example.graphql.GraphQL.BookInput;
//import com.example.graphql.GraphQL.BookInput;
import com.example.graphql.GraphQL.services.BookService;

import lombok.Getter;
import lombok.Setter;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	// create
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = new Book();
		b.setAuthor(book.getAuthor());
		b.setDesc(book.getDesc());
		b.setPages(book.getPages());
		b.setPrice(book.getPrice());
		b.setTitle(book.getTitle());
		
		return this.bookService.create(b);
	}
	
	// get all
	@QueryMapping("allBooks")
	public List<Book> getAll(){
		return this.bookService.getAll();
	}
	
	// get single book
	@QueryMapping("getBook")
	public Book get(@Argument int bookId) {
		return this.bookService.get(bookId);
	}

}

