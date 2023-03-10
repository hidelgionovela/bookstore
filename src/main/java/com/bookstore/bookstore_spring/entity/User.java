package com.bookstore.bookstore_spring.entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "first_name")
        private String first_name;

        @Column(name = "last_name")
        private String last_name;

        // @Column(name = "email")
        private String email;
        // @Column(name = "password")
        private String password;

        // Criando relacao de muito para muito entre as tabela user e rol
        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
        private Collection<Rol> roles;

        public User(int id, String first_name, String last_name, String email, String password,
                        Collection<Rol> roles) {
                this.id = id;
                this.first_name = first_name;
                this.last_name = last_name;
                this.email = email;
                this.password = password;
                this.roles = roles;
        }

        public User(String first_name, String last_name, String email, String password,
                        Collection<Rol> roles) {

                this.first_name = first_name;
                this.last_name = last_name;
                this.email = email;
                this.password = password;
                this.roles = roles;
        }

        public User() {
                super();
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

        public Collection<Rol> getRoles() {
                return roles;
        }

        public void setRoles(Collection<Rol> roles) {
                this.roles = roles;
        }

}
