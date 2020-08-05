package com.pop.book.controller;

import com.pop.book.entity.Book;
import com.pop.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/user/v1/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBookDetail() {
        return ResponseEntity.ok(bookService.getAllBook());
    }

    @GetMapping("/{book_id}")
    public ResponseEntity<List<Book>> getBookDetailById(@PathVariable("book_id") Integer bookId) {
        return null;
    }

    @PostMapping
    public ResponseEntity<List<Book>> saveBook(@RequestBody Book book) {
        return null;
    }

    @DeleteMapping("{book_id}")
    public ResponseEntity<List<Book>> deleteBookById(@PathVariable("book_id") Integer bookId) {
        return null;
    }

    @PutMapping
    public ResponseEntity<List<Book>> deleteBookById(@RequestBody Book book) {
        return null;
    }

    @PostMapping("/upload")
    public ResponseEntity<List<Book>> saveBookByCSVFile(@PathVariable("file") MultipartFile csvFile) {
        return null;
    }

}

