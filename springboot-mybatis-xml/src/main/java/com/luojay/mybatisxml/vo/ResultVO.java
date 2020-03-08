package com.luojay.mybatisxml.vo;

import lombok.Data;

/**
 * author:luojay
 * 这是一个VO：ViewObject对象，封装这个对象是为了后面输出JSON对象与LayUI的官方的数据对应格式
 * 其中data封装成泛型是为了灵活处理格式，例如List,Map,Object等对象时都可以灵活处理
 */
@Data
public class ResultVO<T>{
    private String msg;
    private Integer code;
    private T data;//泛型数据
}
