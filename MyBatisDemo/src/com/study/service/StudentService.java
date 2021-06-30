package com.study.service;

import com.study.demo.Student;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentService
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-28 18:09
 * @Version: V1.0
 */
public interface StudentService {
    /*
    *业务层接口
     */
    public abstract List<Student> selectAll();

    public abstract Student selectById(Integer id);

    public abstract Integer insert(Student stu);

    public abstract Integer update(Student stu);

    public abstract Integer delete(Integer id);

}
