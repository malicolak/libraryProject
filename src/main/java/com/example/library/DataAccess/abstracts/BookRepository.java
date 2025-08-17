package com.example.library.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.Entity.concretes.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
