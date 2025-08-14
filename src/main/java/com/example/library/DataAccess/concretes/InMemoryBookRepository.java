package com.example.library.DataAccess.concretes;

import com.example.library.DataAccess.abstracts.BookRepository;
import com.example.library.Entity.concretes.Book;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public class InMemoryBookRepository implements BookRepository {


    ArrayList<Book> books;

    public InMemoryBookRepository() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book(1,"Sefiller","Victor Hugo", "Bloomsbury", (short) 350, LocalDate.of(2021,12,15)));
        this.books.add(new Book(2,"Olasılıksız","Adam Fawer", "Yakamoz", (short) 423, LocalDate.of(2019,6,24)));
        this.books.add(new Book(3,"Aklından Bir Sayı Tut","John Verdon", "Koridor", (short) 486, LocalDate.of(2018,10,7)));
    }
    @Override
    public ArrayList<Book> getAll() {
        return this.books;
    }
}
