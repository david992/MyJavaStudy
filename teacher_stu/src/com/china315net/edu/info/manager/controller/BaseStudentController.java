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
public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    //开启学生管理系统 展示菜单

    public void start() {

        lo:while (true) {
            System.out.println("-----欢迎来到学生信息管理系统-----");
            System.out.println("请选择-->-- 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.查找学生  6.退出系统");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudentById();
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findStudent();
                    break;
                case "5":
                    System.out.println("查找学生");
                    break;
                case "6":
                    System.out.println("您已经退出系统，感谢您的使用");
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    public final void updateStudentById() {
        String upId =inputStudentId();
        while(true){
            System.out.println("是否确认修改该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)){
                break;
            }else if("y".equals(con)){
                Student stu = inputStudentInfo(upId);
                studentService.updateStudentById(upId,stu);
                System.out.println("修改成功");
                break;
            }else{
                System.out.println("输入有误请重新输入！");
            }
        }
    }




    public final void deleteStudentById() {
        String delId = inputStudentId();
        while(true) {
            System.out.println("是否确认删除该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)) {
                break;
            } else if ("y".equals(con)) {
                studentService.deleteStudentById(delId);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("输入有误请重新输入！");
            }
        }

    }
    public final void findStudent() {
        // 调用业务员的获取方法，得到学生的对象数组
        Student[] stus = studentService.findStudent();
        if (stus == null){
            System.out.println("暂无学生信息，请添加后查看");
            return;
        }else{
            System.out.println("学号 \t姓名 \t年龄 \t生日");
            for (int i = 0; i < stus.length; i++) {
                Student stu = stus[i];
                if( stu != null){
                    System.out.println(stu.getId()+" \t"+stu.getName()+" \t"+stu.getAge()+" \t"+stu.getBirthday());

                }
            }

        }
    }

    public final void addStudent() {
        String id;
        while (true){
            System.out.println("请输入 学号:");
            id = sc.next();
            boolean result = studentService.isExists(id);
            if(result){
                System.out.println("学号已经存在！请重新输入学号:");
            }else{
                break;
            }
        }
        Student stu = inputStudentInfo(id);

        boolean res = studentService.addStudent(stu);
        if (res){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    public final String inputStudentId(){
        String id;
        while (true){
            System.out.println("请输入学生的学号：");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("学号不存在 请重庆输入！");
            }
        }
        return id;
    }
    public abstract Student inputStudentInfo( String id);
}
