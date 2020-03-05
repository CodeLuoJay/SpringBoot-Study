package com.luojay.mybatis.mapper;

import com.luojay.mybatis.domain.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void findStudentById() {
        Student student = studentMapper.findStudentById(1);
        Assert.assertEquals(20, student.getAge().intValue());
    }

    @Test
    public void insertStudent() {
        Student student = new Student();
        student.setName("bobiStudent");
        student.setAge(24);
        studentMapper.insertStudent(student);
    }
    @Test
    public void updateStudent(){
        Student student = new Student();
        student.setId(2);
        student.setName("bobi8344Student");
        student.setAge(23);
        studentMapper.updateStudent(student);
    }
    @Test
    public void deleteStudent(){
        studentMapper.deleteStudentById(3);
    }
    @Test
    public void findStudentByName(){
        Student student = studentMapper.findStudentByName("bobi8344");
        Assert.assertEquals("bobi8344", student.getName());
    }
    @Test
    public void findAll(){
        List<Student> studentList = studentMapper.findAll();
        for(Student student : studentList){
            System.out.println(student);
        }
    }
    @Test
    public void insertStudentByMap(){
        HashMap<String, Object> userMap = new HashMap<>();
        userMap.put("name","公众号CodeLuoJay");
        userMap.put("age",21);
        int row = studentMapper.insertStudentByMap(userMap);
        Assert.assertEquals(1,row);
    }
}