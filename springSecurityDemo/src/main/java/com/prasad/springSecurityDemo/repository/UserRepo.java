package com.prasad.springSecurityDemo.repository;
import com.prasad.springSecurityDemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
