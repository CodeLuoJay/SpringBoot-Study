package com.luojay.mybatisxml.mapper;

import com.luojay.mybatisxml.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author：luojay
 * 关注公众号：CodeLuoJay可以获取更多Spring2.X系列教程和视频资料
 * 写完StudentMapper的方法后，可以使用CTRL+SHIFT+T快速生成测试方法，测试通过再编写service和controller层
 */
@Mapper//这里切记要加Mapper注解，不然Spring不能实现注入
public interface StudentMapper {
    /***
     * 查询所有学生
     * @return
     */
    List<Student> findAllStudent();

    /**
     * 添加学生
     * @param student
     * @return 插入记录行数rowResult
     */
    Integer insertStudent(Student student);

    /**
     * 更新学生
     * @param student
     * @return 更新记录行数rowResult
     */
    Integer updateStudent(Student student);


    /**
     * 根据ID删除学生
     * @param id
     * @return
     */
    Integer deleteStudentById(Integer id);
}
