package com.restapi.books.dao;

import org.springframework.data.repository.CrudRepository;

import com.restapi.books.entities.Books;
import java.util.List;


public interface BookRepository extends CrudRepository<Books, Integer>{
	public Books findById(int id);
}
