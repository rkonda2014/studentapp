package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.studentapp.service.StudentService;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);

    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);

    }
}
