package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.Book;
import com.org.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	// For All Books
	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepo.findAll();
		return list;
	}

	// Foor Single Books
	public Book getBookById(int id) {
		Book book = null;
		try {
			// book = list.stream().filter(b1 -> b1.getId()==id).findFirst().get();
			book = this.bookRepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	// Add book
	public Book addBook(Book b) {
		Book result = bookRepo.save(b);
		return result;
	}

	// Delete Book
	public void deleteBook(int bid) {
		// list = list.stream().filter(book ->book.getId()
		// !=bid).collect(Collectors.toList());
		bookRepo.deleteById(bid);
	}

	// Update Book
	public void updateBook(Book book, int bid) {
//        list.stream().map(b ->{
//            if(b.getId()==bid){
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
		book.setId(bid);
		bookRepo.save(book);
	}

}
