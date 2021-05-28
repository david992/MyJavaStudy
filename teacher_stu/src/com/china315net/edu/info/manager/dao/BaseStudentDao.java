package com.china315net.edu.info.manager.dao;

import com.china315net.edu.info.manager.domain.Student;

import java.util.ArrayList;

/**
 * @Program: test
 * @ClassName: StudentDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 14:57
 * @Version: V1.0
 */
public interface BaseStudentDao {


    public abstract boolean addStudent(Student student);

    public abstract Student[] findStudent() ;

    public abstract void deleteStudentById(String delId) ;
    public abstract int getIndex(String id);

    public abstract void updateStudentById(String upId, Student stu) ;
}
