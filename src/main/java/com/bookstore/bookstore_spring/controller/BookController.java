package com.bookstore.bookstore_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore_spring.entity.Book;
import com.bookstore.bookstore_spring.entity.MyBookList;
import com.bookstore.bookstore_spring.service.BookService;

import com.bookstore.bookstore_spring.service.MyBookListService;

import java.util.*;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private MyBookListService myBookService;

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
        List<Book> list = service.getAllBook();
        ModelAndView m = new ModelAndView();
        m.setViewName("bookList");
        m.addObject("book", list);
        return m;
    }

    @GetMapping("/my_book")
    public String getMyBook(Model model) {
        List<MyBookList> list = myBookService.getAllMyBook();
        model.addAttribute("book", list);
        return "myBook";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        // TODO: process POST request
        service.save(b);
        return "redirect:/book_list";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b = service.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
        myBookService.saveMyBook(mb);
        return "redirect:/my_book";
    }

}
