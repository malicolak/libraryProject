package com.example.library.Business.abstracts;

import com.example.library.Business.requests.CreateBookRequest;
import com.example.library.Business.responses.GetAllBooksResponse;

import java.util.List;


public interface BookService {
    List<GetAllBooksResponse> getAll();
    void add(CreateBookRequest request);
}
