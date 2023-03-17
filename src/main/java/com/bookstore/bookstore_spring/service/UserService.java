package com.bookstore.bookstore_spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bookstore.bookstore_spring.dto.UserRegisterDTO;
import com.bookstore.bookstore_spring.entity.User;

public interface UserService extends UserDetailsService{
         public User save(UserRegisterDTO registroDTO);
}
