package com.example.library.Business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBookRequest {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private short pageCount;
    private LocalDate publishDate;
}
