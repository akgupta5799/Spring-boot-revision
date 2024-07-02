package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Books;
import com.api.book.service.BookService;
//since we are creating rest api.
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController  
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// get all books handler
	@GetMapping("/books")
	public List<Books> getBooks() {
		return this.bookService.getAllBooks();
	}
	
	
	// get single book handler
	@GetMapping("/books/{id}")
	public Books getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	// new book handler
	@PostMapping("/books")
	public Books postBooks(@RequestBody Books book) {
		Books b = this.bookService.addBook(book);		
		return b;
	}
	
	// delete book handler
	@DeleteMapping("/books/{bookId}")
	public void delBooks(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}
	
	// update book handler
	@PutMapping("books/{bookId}")
	public Books upBooks(@PathVariable("bookId") int bookId, @RequestBody Books book) {
		this.bookService.updateBook(bookId, book);
		return book;
	}
	
}
