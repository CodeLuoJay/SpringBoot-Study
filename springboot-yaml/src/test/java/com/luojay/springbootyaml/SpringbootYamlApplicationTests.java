package com.luojay.springbootyaml;

import com.luojay.springbootyaml.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootYamlApplicationTests {
    @Autowired
    private Student student;
    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
