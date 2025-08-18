package com.example.library.Business.abstracts;

import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.requests.UpdateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;
import com.example.library.Business.responses.GetByIdBookResponse;

import java.util.List;


public interface BookService {
    List<GetAllBooksResponse> getAll();
    void add(CreateBookRequest request);
    void delete(int id);
    void update(UpdateBookRequest request);
    GetByIdBookResponse getById(int id);
}
