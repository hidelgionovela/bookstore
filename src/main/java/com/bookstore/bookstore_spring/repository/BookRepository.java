package com.bookstore.bookstore_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstore.bookstore_spring.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{
         
}
