package com.author.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.author.entity.Author;
import com.author.repositry.AuthorRepositry;

@Service

public class AuthorService {
	
	@Autowired
	public AuthorRepositry authorRepositry;
	
	
	
	public Author createAuthor(Author author) {
		return authorRepositry.save(author);
		
	}
	
	public List<Author> getAllAuthor(){
		return authorRepositry.findAll();
		
	}
	
	public Author updateAuthor(Author author) {
		return authorRepositry.save(author);
	}
	
	public Author getByAuthorId(Long id) {
		return authorRepositry.getById(id);
	}

	public void deleteAuthor(Long id) {
		authorRepositry.deleteById(id);
	}
	
	
	
}
