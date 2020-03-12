package com.luojay.pagehelper.mapper;

import com.luojay.pagehelper.common.CommonMapper;
import com.luojay.pagehelper.entity.Student;
import org.apache.ibatis.annotations.Mapper;


/**
 * author：luojay
 * 关注公众号：CodeLuoJay可以获取更多Spring2.X系列教程和视频资料
 *
 */
@Mapper//这里切记要加Mapper注解，不然Spring不能实现注入
public interface StudentMapper extends CommonMapper<Student> {

}
