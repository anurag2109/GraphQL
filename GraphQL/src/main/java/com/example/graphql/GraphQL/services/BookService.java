package com.example.graphql.GraphQL.services;

import java.util.List;

import com.example.graphql.GraphQL.Book;

public interface BookService {
	
	// create
	Book create(Book book);
	
	// list all
	List<Book> getAll();
	
	// get single book
	Book get(int bookId);
	
}
