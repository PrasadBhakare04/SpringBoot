package com.prasad.springSecurityDemo.controller;

import com.prasad.springSecurityDemo.model.Student;
import com.prasad.springSecurityDemo.service.StudentService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }
}
