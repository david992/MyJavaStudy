package com.china315net.edu.info.manager.dao;

import com.china315net.edu.info.manager.domain.Student;

/**
 * @Program: test
 * @ClassName: StudentDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 14:57
 * @Version: V1.0
 */
public class StudentDao {

    private static Student[] stus = new Student[5];
    static {
        Student david = new Student("0001", "david", "25", "1995-8-4");
        Student Jinx = new Student("0002", "jinx", "18", "2001-8-4");
        stus[0]=david;
        stus[1]=Jinx;
    }
    public boolean addStudent(Student student) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu == null){
                index = i ;
                break;
            }
        }
        if (index == -1){
            //添加失败  装满了 5个
            return false;
        }else{
            stus[index] = student;
            return true;
        }

    }

    public Student[] findStudent()  {
        return stus;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stus[index] = null;
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu =stus[i];
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudentById(String upId, Student stu) {
        int index = getIndex(upId);
        stus[index] = stu;
    }
}
