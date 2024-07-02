package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.api.book.entities.Books;
@Service
public class BookService {
	private static List<Books> list = new ArrayList<>();
	static {
		list.add(new Books(11, "Java Reference Guide", "Addy"));
		list.add(new Books(12, "Spring Boot", "XYZ"));
		list.add(new Books(13, "C++", "PQR"));
	}
	
	// get all books
	public List<Books> getAllBooks(){
		return list;
	}
	
	// get single book by id
	public Books getBookById(int id) {
		Books books = null;
		books = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return books;
	}
	
	// adding book
	public Books addBook(Books b) {
		list.add(b);
		return b;
	}
	
	// deleting book
	public void deleteBook(int id) {
		list = list.stream().filter(book -> book.getId()!=id).collect(Collectors.toList());
	}
	
	// update book
	public void updateBook(int bookId, Books book) {
		 list = list.stream().map(b ->{
			if(b.getId() == bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}
}
