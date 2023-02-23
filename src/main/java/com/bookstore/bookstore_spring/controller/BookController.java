package com.bookstore.bookstore_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore_spring.entity.Book;
import com.bookstore.bookstore_spring.service.BookService;
import java.util.*;
// import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/book_list")
    public ModelAndView getAllBook() {
        List<Book>list = service.getAllBook();
        ModelAndView m = new ModelAndView();
        m.setViewName("bookList");
        m.addObject("book", list);
        return m;
    }

    @GetMapping("/my_book")
    public String myBook() {
        return "myBook";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        //TODO: process POST request
        
        service.save(b);
        return "redirect:/book_list";
    }
    
}
