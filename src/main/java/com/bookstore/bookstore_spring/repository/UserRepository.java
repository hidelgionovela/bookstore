package com.bookstore.bookstore_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore_spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
         
}
