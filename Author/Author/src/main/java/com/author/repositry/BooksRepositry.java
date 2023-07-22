package com.author.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.entity.Books;

public interface BooksRepositry  extends JpaRepository<Books, Long>{

}
