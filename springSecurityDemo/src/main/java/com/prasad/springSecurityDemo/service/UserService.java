package com.prasad.springSecurityDemo.service;

import com.prasad.springSecurityDemo.model.Users;
import com.prasad.springSecurityDemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public void addUser(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
    }
}
