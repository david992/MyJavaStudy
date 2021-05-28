package com.china315net.edu.info.manager.service;

import com.china315net.edu.info.manager.dao.BaseStudentDao;
import com.china315net.edu.info.manager.dao.OtherStudentDao;
import com.china315net.edu.info.manager.dao.StudentDao;
import com.china315net.edu.info.manager.domain.Student;
import com.china315net.edu.info.manager.factory.StudentDaoFactory;

/**
 * @Program: test
 * @ClassName: StudentService
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 15:00
 * @Version: V1.0
 */
public class StudentService {

    //private OtherStudentDao studentDao = new OtherStudentDao();
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();
    public  boolean isExists(String id) {
        Student[] stus = studentDao.findStudent();
        boolean isexists = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null && stu.getId().equals(id)){
                isexists = true;
                break;
            }
        }
        return isexists;

    }

    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);

    }

    public Student[] findStudent() {
        Student[] stus = studentDao.findStudent();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null){
                flag =true;
                break;
            }
        }
        if (flag){
            return stus;
        }else{
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateStudentById(String upId, Student stu) {
        studentDao.updateStudentById(upId,stu);
    }
}
