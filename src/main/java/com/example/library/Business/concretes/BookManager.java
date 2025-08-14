package com.example.library.Business.concretes;

import com.example.library.Business.abstracts.BookService;
import com.example.library.DataAccess.abstracts.BookRepository;
import com.example.library.Entity.concretes.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookManager implements BookService {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public ArrayList<Book> getAll() {
        return bookRepository.getAll();
    }
}
