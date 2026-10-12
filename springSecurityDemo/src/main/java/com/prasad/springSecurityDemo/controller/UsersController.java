package com.prasad.springSecurityDemo.controller;

import com.prasad.springSecurityDemo.model.Users;
import com.prasad.springSecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UsersController {
    @Autowired
    UserService service;

    @PostMapping("/register")
    public String addUser(@RequestBody Users user){
        service.addUser(user);
        return ("User added " + user.getUsername() + " " + user.getPassword());
    }
}
