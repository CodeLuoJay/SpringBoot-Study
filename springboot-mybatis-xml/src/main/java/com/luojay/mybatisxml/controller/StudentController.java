package com.luojay.mybatisxml.controller;

import com.luojay.mybatisxml.domain.Student;
import com.luojay.mybatisxml.service.StudentService;
import com.luojay.mybatisxml.utils.ResultVOUtil;
import com.luojay.mybatisxml.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 成功输出的所有学生结果
     * @return
     */
    @ResponseBody
    @GetMapping("/getStudents")
    public ResultVO getAllStudents(){
        List<Student> studentList = studentService.findAllStudent();
        return ResultVOUtil.success(studentList);
    }

    /**
     * 跳转到所有学生的列表页面
     * @return
     */
    @GetMapping("/list")
    public String index(){
        return "list";
    }

    /**
     * 跳转到后台管理员首页
     * @return
     */
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
