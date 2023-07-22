package com.author.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.author.entity.Author;

public interface AuthorRepositry extends JpaRepository<Author, Long> {

	

	
	
}
