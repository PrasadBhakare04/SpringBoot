package com.prasad.springSecurityDemo.repository;

import com.prasad.springSecurityDemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "John", 50),
            new Student(2, "Alice", 80),
            new Student(3, "Bob", 70)
    ));

    public List<Student> getStudents(){
        return students;
    }

    public Student createStudent(Student student){
        students.add(student);
        return student;
    }
}
