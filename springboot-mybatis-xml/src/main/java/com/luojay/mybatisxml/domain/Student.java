package com.luojay.mybatisxml.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * author：luojay
 * 学生实体类
 * @Data Lombok注解，简化JavaBean的getter，setter等方法
 * @NoArgsConstructor 生成无参构造器
 */
@Data
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
