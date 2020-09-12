package com.org.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@Column(name = "book_Id")
	private int id;

	private String title;

	@OneToOne(cascade = CascadeType.ALL)
	private Author author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {

	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", id=" + id + ", title=" + title + "]";
	}

	public Book(int id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

}
