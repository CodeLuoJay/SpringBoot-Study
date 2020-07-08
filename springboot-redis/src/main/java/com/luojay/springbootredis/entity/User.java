package com.luojay.springbootredis.entity;

import lombok.Data;

@Data
public class User {
    /**
     *姓名
     */
    private String name;

    /**
     * 编号
     */
    private String id;

    /**
     * 年龄
     */
    private String age;
}
