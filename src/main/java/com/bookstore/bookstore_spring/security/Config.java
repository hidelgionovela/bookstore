package com.bookstore.bookstore_spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bookstore.bookstore_spring.service.UserService;


@Configuration
@EnableWebSecurity
public class Config {

     @Autowired
     private UserService userService;

     @Bean
     public BCryptPasswordEncoder passwordEncoder() {
         return new BCryptPasswordEncoder();
     }

     @Bean
     public DaoAuthenticationProvider authenticationProvider(){
         DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
         auth.setUserDetailsService((UserDetailsService) userService);
         auth.setPasswordEncoder(passwordEncoder());
         return auth;
     }

//      @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.authenticationProvider(authenticationProvider());
     }

     @Override
     protected void configure (HttpSecurity htttp) throws Exception{
         htttp.authorizeHttpRequests().
     }

     

}
// 