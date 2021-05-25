package com.china315net.edu.info.manager.entry;

import com.china315net.edu.info.manager.controller.StudentController;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: InforManagerEntry
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 14:56
 * @Version: V1.0
 */
public class InforManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lo:while (true){
        System.out.println("-----欢迎来到师生信息管理系统-----");
        System.out.println("请选择-->-- 1.学生管理  2.老师管理  3.退出");

        String choice = sc.next();
        switch (choice) {
            case "1":
                System.out.println("学生管理");
                StudentController studentController = new StudentController();
                studentController.start();
                break;
            case "2":
                System.out.println("老师管理");
                break;
            case "3":
                System.out.println("您已经退出系统，感谢您的使用");
                //退出当前正在运行的虚拟机
                System.exit(0);
                break lo;
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
    }
    }
}
