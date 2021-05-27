package com.china315net.edu.info.manager.controller;

import com.china315net.edu.info.manager.domain.Student;
import com.china315net.edu.info.manager.service.StudentService;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: StudentController
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 14:57
 * @Version: V1.0
 */
public class OtherStudentController extends BaseStudentController{

    private Scanner sc = new Scanner(System.in);

    @Override
    public Student inputStudentInfo( String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        Student stu = new Student(id, name, age, birthday);
        return stu;
    }
}
