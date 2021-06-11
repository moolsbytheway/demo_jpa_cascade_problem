package com.example.demo;
import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book,Serializable> {
	public Book findByBookId(int bookId);
}