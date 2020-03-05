package com.luojay.mybatis.mapper;

import com.luojay.mybatis.domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    @Select("select * from student where id=#{id}")
    Student findStudentById(Integer id);

    @Insert("insert into student(name,age)values(#{name},#{age})")
    void insertStudent(Student student);

    @Update("update student set name=#{name} where id=#{id}")
    void updateStudent(Student student);

    @Delete("delete from student where id=#{id}")
    void deleteStudentById(Integer id);

    @Select("select * from student where name=#{name}")
    Student findStudentByName(String name);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("select id,name, age from student")
    List<Student> findAll();

    @Insert("insert into student(name, age) values(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertStudentByMap(Map<String, Object> map);
}
