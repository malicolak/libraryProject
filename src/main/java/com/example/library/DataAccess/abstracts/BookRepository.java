package com.example.library.DataAccess.abstracts;

import com.example.library.Entity.concretes.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;



public interface BookRepository {
    ArrayList<Book> getAll();
}
