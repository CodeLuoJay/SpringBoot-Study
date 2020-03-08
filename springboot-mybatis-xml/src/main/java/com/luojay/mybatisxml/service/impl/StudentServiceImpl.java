package com.luojay.mybatisxml.service.impl;

import com.luojay.mybatisxml.domain.Student;
import com.luojay.mybatisxml.mapper.StudentMapper;
import com.luojay.mybatisxml.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }
}
