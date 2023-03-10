package com.bookstore.bookstore_spring.dto;

/**
 * UserRegisterDTO
 */
public class UserRegisterDTO {

         private int id;

         private String first_name;

         private String last_name;

         private String email;

         private String password;

         public UserRegisterDTO() {
         }

         public UserRegisterDTO(String email) {
                  this.email = email;
         }

         public UserRegisterDTO(String first_name, String last_name, String email, String password) {
                  this.first_name = first_name;
                  this.last_name = last_name;
                  this.email = email;
                  this.password = password;
         }

         public UserRegisterDTO(int id, String first_name, String last_name, String email, String password) {
                  this.id = id;
                  this.first_name = first_name;
                  this.last_name = last_name;
                  this.email = email;
                  this.password = password;
         }

         public int getId() {
                  return id;
         }

         public void setId(int id) {
                  this.id = id;
         }

         public String getFirst_name() {
                  return first_name;
         }

         public void setFirst_name(String first_name) {
                  this.first_name = first_name;
         }

         public String getLast_name() {
                  return last_name;
         }

         public void setLast_name(String last_name) {
                  this.last_name = last_name;
         }

         public String getEmail() {
                  return email;
         }

         public void setEmail(String email) {
                  this.email = email;
         }

         public String getPassword() {
                  return password;
         }

         public void setPassword(String password) {
                  this.password = password;
         }

}
