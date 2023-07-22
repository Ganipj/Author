package com.author.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.entity.Author;
import com.author.entity.Books;
import com.author.repositry.BooksRepositry;

@Service
public class BooksService  {

	@Autowired
	public BooksRepositry booksRepositry;
	
	
	
	
	
	public Books createbook(Books book) {
		 return booksRepositry.save(book);
	}
	
	public List<Books> getAllbooks() {
		return booksRepositry.findAll();
	}
	
	
	public Books updateAuthor(Books books) {
		return booksRepositry.save(books);
	}
	
	public Books getByAuthorId(Long id) {
		return booksRepositry.getById(id);
	}

	public void deleteAuthor(Long id) {
		booksRepositry.deleteById(id);
	}
	
	
}
