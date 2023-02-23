package com.bookstore.bookstore_spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstore.bookstore_spring.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{
         
}
