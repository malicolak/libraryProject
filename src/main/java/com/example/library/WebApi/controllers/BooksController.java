package com.example.library.WebApi.controllers;


import com.example.library.Business.abstracts.BookService;
import com.example.library.Entity.concretes.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private BookService bookService;
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getall")
    public ArrayList<Book> getAll(){
        return bookService.getAll();
    }

}
