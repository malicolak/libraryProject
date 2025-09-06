package com.example.library.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.Entity.concretes.Book;

import java.time.LocalDate;

public interface BookRepository extends JpaRepository<Book,Integer> {
    boolean existsByTitleAndAuthorAndPublisherAndPageCountAndPublishDate(String title, String author, String publisher, short pageCount, LocalDate publishedDate);
}
