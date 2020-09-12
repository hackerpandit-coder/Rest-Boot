package com.org.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.entities.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {
	
	public Book findById(int id);
 
}
