package com.luojay.swagger2.controller;

import com.luojay.swagger2.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(value = "学生Controller",tags = "学生相关接口")
@RequestMapping("/Student")
public class StudentController {


    @ApiIgnore
    @GetMapping("hello")
    public @ResponseBody String hello() {
        return "hello";
    }

    @ApiOperation(value = "获取学生信息", notes = "根据学生id获取学生信息")
    @ApiImplicitParam(name = "id", value = "学生id", required = true, dataType = "Long", paramType = "path",example = "1")
    @GetMapping("/{id}")
    public @ResponseBody Student getStudentById(@PathVariable(value = "id") Long id) {
        Student student = new Student();
        student.setId(id);
        student.setName("CodeLuoJay");
        student.setAge(25);
        return student;
    }

    @ApiOperation(value = "获取学生列表", notes = "获取学生列表")
    @GetMapping("/list")
    public @ResponseBody
    List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1l);
        student1.setName("CodeLuoJay");
        student1.setAge(25);
        list.add(student1);
        Student student2 = new Student();
        student2.setId(2l);
        student2.setName("scott");
        student2.setAge(29);
        list.add(student2);
        return list;
    }

    @ApiOperation(value = "新增学生", notes = "根据学生实体创建学生")
    @ApiImplicitParam(name = "student", value = "学生实体", required = true, dataType = "Student")
    @PostMapping("/add")
    public @ResponseBody
    Map<String, Object> addStudent(@RequestBody Student student) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @ApiOperation(value = "删除学生", notes = "根据学生id删除学生")
    @ApiImplicitParam(name = "id", value = "学生id", required = true, dataType = "Long", paramType = "path",example = "1")
    @DeleteMapping("/{id}")
    public @ResponseBody Map<String, Object> deleteStudent(@PathVariable(value = "id") Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @ApiOperation(value = "更新学生", notes = "根据学生id更新学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生id", required = true, dataType = "Long", paramType = "path",example = "1"),
            @ApiImplicitParam(name = "student", value = "学生实体", required = true, dataType = "Student") })
    @PutMapping("/{id}")
    public @ResponseBody Map<String, Object> updateStudent(@PathVariable(value = "id") Long id, @RequestBody Student student) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}
