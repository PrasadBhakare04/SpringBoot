package com.prasad.springbootrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserResource {
	
	@Autowired
	UserRepository repo;
	
	@GetMapping
	public User getUser() {
		User u = new User();
		u.setId(0);
		u.setName("John");
		u.setPoints(230);
		
		return u;
	}
	
	@GetMapping("list")
	public List<User> getUsers(){
		List<User> list = (List<User>) repo.findAll();
;		
		return list;
	}
}
