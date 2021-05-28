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
public class OtherStudentDao implements BaseStudentDao {

    private static  ArrayList <Student> stus = new ArrayList<>();
    static {
        Student david = new Student("0001", "david", "25", "1995-8-4");
        Student Jinx = new Student("0002", "jinx", "18", "2001-8-4");
        stus.add(david);
        stus.add(Jinx);
    }
    public boolean addStudent(Student student) {
        stus.add(student);
        return true;

    }

    public Student[] findStudent()  {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i]=stus.get(i);
        }
        return students;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stus.remove(index);
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu =stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudentById(String upId, Student stu) {
        int index = getIndex(upId);
        stus.set(index,stu);
    }
}
