package com.bookstore.bookstore_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {
         
         @GetMapping("/")
         public String home() {
             return "home";
         }
         
}
