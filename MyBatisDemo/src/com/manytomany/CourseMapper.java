package com.manytomany;

import com.bean.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: CourseMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 15:55
 * @Version: V1.0
 */
public interface CourseMapper {
    @Select("select c.id,c.name from stu_cr sc,course c where sc.cid=c.id and sc.sid = #{id}")
    public abstract List<Course> selectById(Integer id);
}
