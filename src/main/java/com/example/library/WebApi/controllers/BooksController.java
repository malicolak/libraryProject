package com.example.library.WebApi.controllers;


import com.example.library.Business.abstracts.BookService;
import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.requests.UpdateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;
import com.example.library.Business.responses.GetByIdBookResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
public class BooksController {

    private BookService bookService;

    @GetMapping("/getall")
    @ResponseStatus(code = HttpStatus.OK)
    public List<GetAllBooksResponse> getAll(){
        return this.bookService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid @RequestBody CreateBookRequest request){
        this.bookService.add(request);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable int id){
        this.bookService.delete(id);
    }

    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@Valid @RequestBody UpdateBookRequest request){
        this.bookService.update(request);
    }

    @GetMapping("/getbyid/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public GetByIdBookResponse getById(@PathVariable int id){
        return this.bookService.getById(id);
    }
}
