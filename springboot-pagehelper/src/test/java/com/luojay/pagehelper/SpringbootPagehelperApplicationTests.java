package com.luojay.pagehelper;

import com.luojay.pagehelper.entity.Student;
import com.luojay.pagehelper.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SpringbootPagehelperApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    void contextLoads() {
        List<Student> students = studentMapper.selectAll();
        log.info("students:{}",students);
    }

}
