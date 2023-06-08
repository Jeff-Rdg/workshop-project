package com.workshop.projectspring.controllers;

import com.workshop.projectspring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "maria", "maria@gmail.com", "99999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
