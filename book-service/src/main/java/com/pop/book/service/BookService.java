package com.pop.book.service;

import com.pop.book.entity.Book;
import com.pop.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	public Book getBookDetailsByID(Integer bookId) {
		return bookRepository.findById(bookId).get();
	}

	public void deleteBookById(Integer bookId) {
		bookRepository.deleteById(bookId);
	}
}
