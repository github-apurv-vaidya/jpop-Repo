package com.pop.book.controller;

import com.pop.book.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book/jpop/")
public class BookController {
@GetMapping("/all")
    public List<Book> getAllBookDetail(){
    return null;
}


}

