package com.luojay.mybatisxml.service;

import com.luojay.mybatisxml.domain.Student;

import java.util.List;

public interface StudentService {
    /***
     * 查询所有学生
     * @return
     */
    List<Student> findAllStudent();
}
