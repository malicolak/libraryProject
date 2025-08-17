package com.example.library.Business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBooksResponse {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private short pageCount;
    private LocalDate publishDate;
}
