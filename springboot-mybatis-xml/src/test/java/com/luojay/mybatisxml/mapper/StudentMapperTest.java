package com.luojay.mybatisxml.mapper;

import com.luojay.mybatisxml.domain.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/***
 * @SpringBootTest 新版的Junit5单元测试中不用再写Runwith(SpringRunner.class),只要写这个注解即可
 * @Transactional与@Rollback 注解配合使用，是在测试不污染数据库，测试通过不会往数据库添加数据
 * 如果需要往数据库添加数据，可以去掉这两个注解
 */
@SpringBootTest
@Transactional
class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;
    @Rollback
    @Test
    void findAllStudent() {
        List<Student> studentList = studentMapper.findAllStudent();
        for (Student student:studentList){
            System.out.println(student);
        }
    }
    @Rollback
    @Test
    public void insertStudent(){
        Student student = new Student();
        student.setName("简书CodeLuoJay");
        student.setAge(23);
        Integer rowResult = studentMapper.insertStudent(student);
        Assertions.assertEquals(1,rowResult);//junit5的新断言
    }
    @Rollback
    @Test
    public void updateStudent(){
        Student student = new Student();
        student.setId(8);
        student.setName("博客园CodeLuoJay");
        student.setAge(23);
        Integer rowResult = studentMapper.updateStudent(student);
        Assertions.assertEquals(1,rowResult);//junit5的新断言
    }
    @Rollback
    @Test
    public void deleteStudent(){
        Integer rowResult = studentMapper.deleteStudentById(5);
    }
}