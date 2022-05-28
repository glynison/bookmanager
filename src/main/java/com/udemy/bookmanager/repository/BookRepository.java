package com.udemy.bookmanager.repository;

import com.udemy.bookmanager.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface BookRepository extends JpaRepository<Book, Long>{
    
}
