package com.china315net.edu.info.manager.controller;

import com.china315net.edu.info.manager.domain.Teacher;
import com.china315net.edu.info.manager.service.TeacherService;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: TeacherController
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-27 11:40
 * @Version: V1.0
 */
public class TeacherController {
    private TeacherService TeacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);
    //开启老师管理系统 展示菜单

    public void start() {

        lo:while (true) {
            System.out.println("-----欢迎来到老师信息管理系统-----");
            System.out.println("请选择-->-- 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.查找老师  6.退出系统");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    System.out.println("修改老师");
                    updateTeacherById();
                    break;
                case "4":
                    System.out.println("查看所有老师");
                    findTeacher();
                    break;
                case "5":
                    System.out.println("查找老师");
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

    public void updateTeacherById() {
        String upId =inputTeacherId();
        while(true){
            System.out.println("是否确认修改该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)){
                break;
            }else if("y".equals(con)){
                Teacher tea = inputTeacherInfo(upId);
                TeacherService.updateTeacherById(upId,tea);
                System.out.println("修改成功");
                break;
            }else{
                System.out.println("输入有误请重新输入！");
            }
        }
    }




    public void deleteTeacherById() {
        String delId = inputTeacherId();
        while(true) {
            System.out.println("是否确认删除该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)) {
                break;
            } else if ("y".equals(con)) {
                TeacherService.deleteTeacherById(delId);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("输入有误请重新输入！");
            }
        }

    }
    public void findTeacher() {
        // 调用业务员的获取方法，得到老师的对象数组
        Teacher[] teas = TeacherService.findTeacher();
        if (teas == null){
            System.out.println("暂无老师信息，请添加后查看");
            return;
        }else{
            System.out.println("学号 \t姓名 \t年龄 \t生日");
            for (int i = 0; i < teas.length; i++) {
                Teacher tea = teas[i];
                if( tea != null){
                    System.out.println(tea.getId()+" \t"+tea.getName()+" \t"+tea.getAge()+" \t"+tea.getBirthday());

                }
            }

        }
    }

    public void addTeacher() {
        String id;
        while (true){
            System.out.println("请输入 老师id:");
            id = sc.next();
            boolean result = TeacherService.isExists(id);
            if(result){
                System.out.println("老师id已经存在！请重新输入老师id:");
            }else{
                break;
            }
        }
        Teacher tea = inputTeacherInfo(id);

        boolean res = TeacherService.addTeacher(tea);
        if (res){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    public String inputTeacherId(){
        String id;
        while (true){
            System.out.println("请输入老师id：");
            id = sc.next();
            boolean exists = TeacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("老师id不存在 请重庆输入！");
            }
        }
        return id;
    }
    public Teacher inputTeacherInfo( String id){
        System.out.println("请输入老师姓名");
        String name = sc.next();
        System.out.println("请输入老师年龄");
        String age = sc.next();
        System.out.println("请输入老师生日");
        String birthday = sc.next();
        Teacher tea = new Teacher(id, name, age, birthday);
        return tea;
    }
}
