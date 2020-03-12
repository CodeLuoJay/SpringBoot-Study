package com.luojay.pagehelper.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luojay.pagehelper.entity.Student;
import com.luojay.pagehelper.mapper.StudentMapper;
import com.luojay.pagehelper.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudentList() {
        return studentMapper.selectAll();
    }

    @Override
    public List<Student> getAllStudentListByPage(int pageNum, int pageSize) {
        Page<Student> startPage = PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc");
        List<Student> studentList = studentMapper.selectAll();
        final PageInfo<Student> studentPageInfo = new PageInfo<>(this.studentMapper.selectAll());
        log.info("-------------studentPageInfo-----------");
        log.info("studentPageInfo--------{}",studentPageInfo);
        return studentList;
    }
}
