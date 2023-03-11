package com.bookstore.bookstore_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.bookstore.bookstore_spring.service.*;
import com.bookstore.bookstore_spring.dto.*;

@Controller
@RequestMapping("/userRegister")
public class UserController {

     private UserService userService;

     public UserController(UserService userService) {
          this.userService = userService;
     }

     @ModelAttribute("user")
     public UserRegisterDTO returnNrUserRegisterDTO() {
          return new UserRegisterDTO();

     }

     @GetMapping
     public String showFormUser() {
          return "register";
     }

     @PostMapping
     public String registerUser(@ModelAttribute("user") UserRegisterDTO registerDTO) {
          userService.save(registerDTO);
          return "redirect:/userRegister?sucess";
     }

}
