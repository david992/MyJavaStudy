package com.one2more;

import com.bean.Classes;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: ClassesMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 15:18
 * @Version: V1.0
 */
public interface ClassesMapper {
    @Select("select * from classes")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name" ,property = "name"),
            @Result(
                    property = "students" ,//被包含对象变量名
                    javaType = List.class,//被包含对象实际数据类型
                    column = "id" ,//根绝查询出的classes的id字段查询学生表
                    /*
                    * many = @Many 一对多固定属性
                    * select 指定调用哪个接口中哪个方法
                    * */
                    many = @Many(select="com.one2more.StudentMapper.selectById")

            )

    })
    public  abstract List<Classes> selectAll();
}
