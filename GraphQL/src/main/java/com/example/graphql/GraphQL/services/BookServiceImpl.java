package com.example.graphql.GraphQL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql.GraphQL.Book;
import com.example.graphql.GraphQL.repositories.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	private BookRepo bookRepo;
	
	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		// TODO Auto-generated constructor stub
		this.bookRepo = bookRepo;
	}

	@Override
	public Book create(Book book) {
		// TODO Auto-generated method stub
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		// TODO Auto-generated method stub
		return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking is not found"));
	}

}
