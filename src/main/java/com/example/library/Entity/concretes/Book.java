package com.example.library.Entity.concretes;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private short pageCount;
    private LocalDate publishDate;

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, short pageCount, LocalDate publishDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public short getPageCount() {
        return pageCount;
    }
    public void setPageCount(short pageCount) {
        this.pageCount = pageCount;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

}
