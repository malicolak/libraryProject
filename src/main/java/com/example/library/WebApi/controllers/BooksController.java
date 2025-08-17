package com.example.library.WebApi.controllers;


import com.example.library.Business.abstracts.BookService;
import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private BookService bookService;
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getall")
    public List<GetAllBooksResponse> getAll(){
        return bookService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBookRequest request){
        bookService.add(request);
    }
}
