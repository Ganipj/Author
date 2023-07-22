package com.author.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.entity.Author;
import com.author.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	public AuthorService authorService;
	
	
	@PostMapping("/author")
	public ResponseEntity<Author> createAuthor(@RequestBody Author author){
		Author authr = authorService.createAuthor(author);
		
		return  new ResponseEntity<Author>(authr, HttpStatus.CREATED);
	}
	
	@GetMapping("/author")
	public ResponseEntity<List<Author>> getAllAuthor(){
		List<Author> authorList = authorService.getAllAuthor();
	   return new ResponseEntity<List<Author>>(authorList,HttpStatus.OK);
	}
	@PutMapping("/updateAuthor")
	public ResponseEntity<Author> updateAuthor(Author auhor){
		Author updateAuthor = authorService.updateAuthor(auhor);
	    return new ResponseEntity<Author>(updateAuthor, HttpStatus.OK);
	}
//	
//	@GetMapping("/author/{id}")
//	public ResponseEntity<Author> getByAuthorId(Long id){
//		Author getByIdAuth = authorService.getByAuthorId(id);
//		
//		return new ResponseEntity<Author>(getByIdAuth,HttpStatus.OK);
//	}
//	@DeleteMapping("/author/{id}")
//	public void deleteAuthor(Long id) {
//		authorService.deleteAuthor(id);
//	}
}
