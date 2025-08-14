package com.example.library.Business.abstracts;

import com.example.library.Entity.concretes.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



public interface BookService {
    ArrayList<Book> getAll();
}
