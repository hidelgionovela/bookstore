package com.bookstore.bookstore_spring.service;

import com.bookstore.bookstore_spring.dto.UserRegisterDTO;
import com.bookstore.bookstore_spring.entity.User;

public interface UserService {
         public User save(UserRegisterDTO registroDTO);
}
