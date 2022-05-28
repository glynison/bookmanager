package com.udemy.bookmanager.controller;

import com.udemy.bookmanager.dto.MessageResponseDTO;
import com.udemy.bookmanager.entity.Book;
import com.udemy.bookmanager.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    

    @PostMapping
    public MessageResponseDTO create(Book book) {
        return bookService.create(book);      

    }
}
