package com.study.controller;

import com.study.demo.Student;
import com.study.service.StudentService;
import com.study.service.impl.StudentServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentTest01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-23 11:58
 * @Version: V1.0
 */
public class StudentController {
    /*
    * 控制层测试类
    * */

    //创建业务层对象
    private StudentService service = new StudentServiceImpl();
    @Test
    public void selectAll() {
        List<Student> stus = service.selectAll();
        for (Student student : stus) {
            System.out.println(student);
        }

    }
    @Test
    public void selectById()  {
        Student stu = service.selectById(1);
        System.out.println(stu);

    }
    @Test
    public void insert()  {
        Student hang = new Student(6, "hang", 25);
        Integer insert = service.insert(hang);
        System.out.println(insert);
    }

    @Test
    public void update()  {

        Student hang = new Student(6, "xu----hang", 25);
        Integer update = service.update(hang);
        System.out.println(update);
    }
    @Test
    public void delete()  {
        Integer delete = service.delete(6);
        System.out.println(delete);

    }
}
