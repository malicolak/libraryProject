package com.example.library.Business.concretes;

import com.example.library.Business.abstracts.BookService;
import com.example.library.Business.core.utilities.mappers.ModelMapperService;
import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.requests.UpdateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;
import com.example.library.Business.responses.GetByIdBookResponse;
import com.example.library.Business.rules.BookBusinessRules;
import com.example.library.DataAccess.abstracts.BookRepository;
import com.example.library.Entity.concretes.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookManager implements BookService {

    private BookRepository bookRepository;
    private ModelMapperService modelMapperService;
    private BookBusinessRules bookBusinessRules;

    @Override
    public List<GetAllBooksResponse> getAll() {
        List<Book> books = this.bookRepository.findAll();
        List<GetAllBooksResponse> responses = books.stream().map(book ->
                this.modelMapperService.forResponse().map(book,GetAllBooksResponse.class)).toList();
        return responses;
    }

    @Override
    public void add(CreateBookRequest request) {

        this.bookBusinessRules.checkIfBookExists(
                request.getTitle(), request.getAuthor(), request.getPublisher(), request.getPageCount(), request.getPublishDate());

        Book book = this.modelMapperService.forRequest().map(request,Book.class);
        this.bookRepository.save(book);
    }

    @Override
    public void delete(int id) {
        this.bookRepository.deleteById(id);
    }

    @Override
    public void update(UpdateBookRequest request) {


        this.bookBusinessRules.checkIfBookExists(
                request.getTitle(), request.getAuthor(), request.getPublisher(), request.getPageCount(), request.getPublishDate()
        );

        Book book = this.modelMapperService.forRequest().map(request,Book.class);
        this.bookRepository.save(book);
    }

    @Override
    public GetByIdBookResponse getById(int id) {
        Book book = this.bookRepository.findById(id).orElseThrow();
        GetByIdBookResponse response = this.modelMapperService.forResponse().map(book,GetByIdBookResponse.class);
        return response;
    }
}
