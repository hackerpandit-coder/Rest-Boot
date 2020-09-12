package com.org.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

	@Id
	private int autherId;

	private String firstName;
	private String lastName;
	private String language;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAutherId() {
		return autherId;
	}

	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Author [autherId=" + autherId + ", firstName=" + firstName + ", language=" + language + ", lastName="
				+ lastName + "]";
	}

	public Author(int autherId, String firstName, String lastName, String language) {
		this.autherId = autherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
	}

}
