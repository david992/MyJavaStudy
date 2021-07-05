package com.manytomany;

import com.bean.Students;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentsMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 15:56
 * @Version: V1.0
 */
public interface StudentsMapper {
    @Select("select distinct s.id,s.name,s.age from students s, stu_cr sc where sc.sid = s.id " )
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(
                    property = "course" ,//被包含对象变量名
                    javaType = List.class,//被包含对象实际数据类型
                    column = "id",//根据查询的student表id查询课程
                    many = @Many(select = "com.manytomany.CourseMapper.selectById")

            )
    })
    public abstract List<Students> selectAll();
}
