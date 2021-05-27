package com.china315net.edu.info.manager.dao;

import com.china315net.edu.info.manager.domain.Student;
import com.china315net.edu.info.manager.domain.Teacher;

/**
 * @Program: test
 * @ClassName: TeacherDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-27 11:41
 * @Version: V1.0
 */
public class TeacherDao {
    private static Teacher[] teas = new Teacher[5];

    public static Teacher[] findTeacher() {
        return teas;
    }

    public boolean addStudent(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if(tea == null){
                index = i ;
                break;
            }
        }
        if (index == -1){
            //添加失败  装满了 5个
            return false;
        }else{
            teas[index] = teacher;
            return true;
        }
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea =teas[i];
            if(tea != null && tea.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteTeacherById(String delId) {
        int index = getIndex(delId);
        teas[index] = null;
    }

    public void updateTeacherById(String upId, Teacher tea) {
        int index = getIndex(upId);
        teas[index] = tea;
    }
}
