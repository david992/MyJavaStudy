package com.china315net.edu.info.manager.factory;

import com.china315net.edu.info.manager.dao.BaseStudentDao;
import com.china315net.edu.info.manager.dao.OtherStudentDao;

/**
 * @Program: test
 * @ClassName: StudentDaoFactory
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-28 16:43
 * @Version: V1.0
 */
public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}
