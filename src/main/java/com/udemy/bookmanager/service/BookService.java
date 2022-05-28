package com.udemy.bookmanager.service;

import com.udemy.bookmanager.dto.MessageResponseDTO;
import com.udemy.bookmanager.entity.Book;
import com.udemy.bookmanager.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    } 
        
    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO
                .builder()
                .message("Livro criado com ID " + book.getId())
                .build();
    } 
}
