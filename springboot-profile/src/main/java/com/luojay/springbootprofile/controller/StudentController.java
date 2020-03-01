package com.luojay.springbootprofile.controller;

import com.luojay.springbootprofile.pojo.Student;
import com.luojay.springbootprofile.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/profile")
@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllUsers() {

        return studentRepository.findAll();
    }
}
