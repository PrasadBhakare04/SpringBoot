package com.prasad.springSecurityDemo.service;

import com.prasad.springSecurityDemo.model.Student;
import com.prasad.springSecurityDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getStudents(){
        return repo.getStudents();
    }

    public Student createStudent(Student student){
        return repo.createStudent(student);
    }
}
