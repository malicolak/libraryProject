package com.example.library.Business.concretes;

import com.example.library.Business.abstracts.BookService;
import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;
import com.example.library.DataAccess.abstracts.BookRepository;
import com.example.library.Entity.concretes.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookManager implements BookService {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<GetAllBooksResponse> getAll() {
        List<Book> books = bookRepository.findAll();

        List<GetAllBooksResponse> getAllBooksResponses = new ArrayList<GetAllBooksResponse>();

        for (Book book : books) {
            GetAllBooksResponse response = new GetAllBooksResponse();
            response.setId(book.getId());
            response.setTitle(book.getTitle());
            response.setAuthor(book.getAuthor());
            response.setPublisher(book.getPublisher());
            response.setPageCount(book.getPageCount());
            response.setPublishDate(book.getPublishDate());
            getAllBooksResponses.add(response);
        }
        return getAllBooksResponses;
    }

    @Override
    public void add(CreateBookRequest request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPublisher(request.getPublisher());
        book.setPageCount(request.getPageCount());
        book.setPublishDate(request.getPublishDate());
        bookRepository.save(book);
    }
}
