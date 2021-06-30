package com.study.mapper;

import com.study.demo.Student;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-28 18:01
 * @Version: V1.0
 */
public interface StudentMapper {
    /*
    *持久层接口（dao层）
    * */
    public abstract List<Student> selectAll();

    public abstract Student selectById(Integer id);

    public abstract Integer insert(Student stu);

    public abstract Integer update(Student stu);

    public abstract Integer delete(Integer id);

    public abstract List<Student> selectCondition(Student stu);

    public abstract List<Student> selectByIds(List<Integer> ids);


}
