package com.luojay.pagehelper.service;

import com.luojay.pagehelper.entity.Student;

import java.util.List;

public interface StudentService {
    /***
     * 查询所有学生
     * @return
     */
    List<Student> getAllStudentList();
    /***
     * 分页查询所有学生
     * @return
     */
    List<Student> getAllStudentListByPage(int pageNum , int pageSize);
}
