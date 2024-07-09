package com.restapi.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.books.dao.BookRepository;
import com.restapi.books.entities.Books;
@Service
public class BookService {
//	private static List<Books> list = new ArrayList<>();
//	static {
//		list.add(new Books(11, "Java Reference Guide", "Addy"));
//		list.add(new Books(12, "Spring Boot", "XYZ"));
//		list.add(new Books(13, "C++", "PQR"));
//	}
	
	@Autowired
	BookRepository bookRepository;
	
	// get all books
	public List<Books> getAllBooks(){
		List<Books> list = (List<Books>)this.bookRepository.findAll();
		return list;
	}
	
	// get single book by id
	public Books getBookById(int id) {
		Books books = null;
		try {
			//books = list.stream().filter(e -> e.getId() == id).findFirst().get();
		    books = this.bookRepository.findById(id);
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}
	
	// adding book
	public Books addBook(Books b) {
		//list.add(b);
		Books res = this.bookRepository.save(b);
		return res;
	}
	
	// deleting book
	public void deleteBook(int id) {
		//list = list.stream().filter(book -> book.getId()!=id).collect(Collectors.toList());
		this.bookRepository.deleteById(id);
	}
	
	// update book
	public void updateBook(int bookId, Books book) {
//		 list = list.stream().map(b ->{
//			if(b.getId() == bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(bookId);
		this.bookRepository.save(book);
	}
}
