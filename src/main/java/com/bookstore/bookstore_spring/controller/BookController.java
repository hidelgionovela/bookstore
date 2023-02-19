package com.bookstore.bookstore_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {
         
         @GetMapping("/")
         public String home() {
             return "home";
         }

         @GetMapping("/book_register")
         public String bookRegister() {
            return "bookRegister";
        }

        @GetMapping("/book_list")
         public String bookList() {
            return "bookList";
        }

        @GetMapping("/my_book")
         public String myBook() {
            return "myBook";
        }
}
