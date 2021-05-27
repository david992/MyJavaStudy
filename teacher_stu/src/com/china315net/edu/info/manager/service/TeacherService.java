package com.china315net.edu.info.manager.service;

import com.china315net.edu.info.manager.dao.StudentDao;
import com.china315net.edu.info.manager.dao.TeacherDao;
import com.china315net.edu.info.manager.domain.Student;
import com.china315net.edu.info.manager.domain.Teacher;

/**
 * @Program: test
 * @ClassName: TeacherService
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-27 11:41
 * @Version: V1.0
 */
public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean isExists(String id) {
        boolean isexists = false;
        Teacher[] teas = teacherDao.findTeacher();
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if (tea != null && tea.getId().equals(id)){
                isexists = true;
                break;
            }
        }
        return isexists;
    }

    public boolean addTeacher(Teacher stu) {
        return teacherDao.addStudent(stu);

    }

    public Teacher[] findTeacher() {
        Teacher[] teas = teacherDao.findTeacher();
        boolean flag = false;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if (tea != null){
                flag =true;
                break;
            }
        }
        if (flag){
            return teas;
        }else{
            return null;
        }
    }

    public void deleteTeacherById(String delId) {
        teacherDao.deleteTeacherById(delId);

    }

    public void updateTeacherById(String upId, Teacher tea) {
        teacherDao.updateTeacherById(upId,tea);

    }
}
