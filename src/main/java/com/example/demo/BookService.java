package com.example.demo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Book saveBook(Book book) {
		book = bookRepository.save(book);
		return book;
	}

	@Transactional
	public Book deleteBook(Book book) {
		bookRepository.delete(book);
		return book;
	}

	public Book findByBookId(int bookId) {
		Optional<Book> bookResponse = bookRepository.findById(bookId);
		Book book = bookResponse.get();
		return book;
	}
}