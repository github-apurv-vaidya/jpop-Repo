package com.pop.book.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pop.book.entity.Book;
import com.pop.book.service.BookService;

@RestController
@RequestMapping("/api/user/v1/books")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping
	@HystrixCommand(fallbackMethod = "getFallBackBookDetails")
	public ResponseEntity<List<Book>> getAllBookDetail() throws InterruptedException {
		return ResponseEntity.ok(bookService.getAllBook());
	}

	public ResponseEntity<List<Book>> getFallBackBookDetails(){
    return new ResponseEntity<List<Book>>(Arrays.asList(new Book(0,"No Found","Not Available","no author")), HttpStatus.NOT_FOUND);
    }

	@GetMapping("/{book_id}")
	public ResponseEntity<Book> getBookDetailById(@PathVariable("book_id") Integer bookId) {
		return ResponseEntity.ok(bookService.getBookDetailsByID(bookId));
	}

	@PostMapping
	public ResponseEntity<List<Book>> saveBook(@RequestBody Book book) {
		return null;
	}

	@DeleteMapping("{book_id}")
	public void deleteBookById(@PathVariable("book_id") Integer bookId) {
		 bookService.deleteBookById(bookId);
	}


	@PostMapping("/upload")
	public ResponseEntity<List<Book>> saveBookByCSVFile(@PathVariable("file") MultipartFile csvFile) {
		return null;
	}

}
