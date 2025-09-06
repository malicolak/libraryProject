package com.example.library.Business.rules;

import com.example.library.Business.core.utilities.exceptions.BusinessException;
import com.example.library.DataAccess.abstracts.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@AllArgsConstructor
@Service
public class BookBusinessRules {

    private BookRepository bookRepository;

    public void checkIfBookExists(String title, String author, String publisher, short pageCount, LocalDate publishDate){
        if(this.bookRepository.existsByTitleAndAuthorAndPublisherAndPageCountAndPublishDate(title,author,publisher,pageCount,publishDate)){
            throw new BusinessException("Bu kitap zaten mevcut!");
        }
    }
}
