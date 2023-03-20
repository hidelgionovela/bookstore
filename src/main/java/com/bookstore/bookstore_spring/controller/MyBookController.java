package com.bookstore.bookstore_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bookstore.bookstore_spring.service.MyBookListService;

@Controller
public class MyBookController {

         @Autowired
         private MyBookListService service;

         @RequestMapping("/deleteMyList/{id}")
         public String deleteMyList(@PathVariable("id") int id) {
                  service.deleteById(id);
                  return "redirect:/my_book";
                  // return "redirect:/book_list";
         }

}
