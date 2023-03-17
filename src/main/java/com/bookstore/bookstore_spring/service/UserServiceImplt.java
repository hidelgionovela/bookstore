package com.bookstore.bookstore_spring.service;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore_spring.dto.UserRegisterDTO;
import com.bookstore.bookstore_spring.entity.Rol;
import com.bookstore.bookstore_spring.entity.User;
import com.bookstore.bookstore_spring.repository.UserRepository;

/**
 * UsuarioServiceImplemets
 */
@Service
public class UserServiceImplt implements UserService {

         private UserRepository userRepository;

         public UserServiceImplt(UserRepository userRepository) {
                  this.userRepository = userRepository;
         }

         @Override
         public User save(UserRegisterDTO registroDTO) {
                  // TODO Auto-generated method stub

                  User usuario = new User(registroDTO.getFirst_name(),
                                    registroDTO.getLast_name(),
                                    registroDTO.getEmail(),
                                    registroDTO.getPassword(),
                                    Arrays.asList(new Rol("ROLE_USER")));

                  return userRepository.save(usuario);
         }

         @Override
         public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                  // TODO Auto-generated method stub
                  throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
         }

}