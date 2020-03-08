package com.luojay.mybatisxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author：luojay
 * 注意我注释掉的@MapperScan，它的作用是告知mybatis构建SqlSessionFactory要去哪里扫描mapper
 * 因为我这里只有一个StudentMapper接口，所以我在StudentMapper接口使用@Mapper也可以实现mapper扫描功能
 * 但当XXXMapper接口有多个时候，建议在SpringBoot启动类使用@MapperScan防止出错
 */
//@MapperScan("com.luojay.mybatisxml.mapper.StudentMapper")
@SpringBootApplication
public class SpringbootMybatisXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisXmlApplication.class, args);
    }

}
