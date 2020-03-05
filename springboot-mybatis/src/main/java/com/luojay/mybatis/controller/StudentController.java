package com.luojay.mybatis.controller;

import com.luojay.mybatis.domain.Student;
import com.luojay.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    @GetMapping("/student/getStudent")
    @ResponseBody
    public List<Student> getUser(){
        return studentMapper.findAll();
    }
    @GetMapping("/list")
    public String index(){
        return "list";
    }
}
