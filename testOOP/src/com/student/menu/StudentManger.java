package com.student.menu;

import com.student.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: StudentManger
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-17 15:57
 * @Version: V1.0
 */
public class StudentManger {
    public static void main(String[] args) {

        ArrayList<Student> arrayList=new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        lo :while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.查找学生");
            System.out.println("6.退出系统");
            System.out.println("请输入您的选择：");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(arrayList);
                    break;
                case "2":
                    System.out.println("删除学生");
                    removeStudent(arrayList);
                    break;
                case "3":
                    changeStudent(arrayList);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    catStudent(arrayList);
                    break;
                case "5":
                    System.out.println("查找学生");
                    getStudent(arrayList);
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

    public static void changeStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid =sc.next();
        int index = getIndex(arrayList,sid);
        if (index == -1){
            System.out.println("未找到相关信息学生！");
        }else{
            while(true){
            System.out.println("是否确认修改该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)){
                break;
            }else if("y".equals(con)){
                System.out.println("请输入学生姓名");
                String name = sc.next();
                System.out.println("请输入学生年龄");
                int age = sc.nextInt();
                System.out.println("请输入学生生日");
                String birthday = sc.next();
                Student stu = new Student(age, name, sid, birthday);
                arrayList.set(index,stu);
                System.out.println("修改成功");
                catStudent(arrayList);
                break;
            }else{
                System.out.println("输入有误请重新输入！");
            }
        }}

    }


    public static void removeStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号");
        String sid =sc.next();
        int index = getIndex(arrayList,sid);
        if (index == -1){
            System.out.println("未找到相关信息学生！");
        }else{
            while(true){
                System.out.println("是否确认删除该生信息？ y/n");
            String con = sc.next();
            if ("n".equals(con)){
                break;
            }else if("y".equals(con)){
            arrayList.remove(index);
            System.out.println("成功删除！");
            catStudent(arrayList);
                break;
            }else{
                System.out.println("输入有误请重新输入！");
            }
        }}

    }

    public static int getIndex(ArrayList<Student> arrayList , String sid) {
        int index = -1;
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            String id = stu.getSid();
            if (id.equals(sid)){
                index = i;
            }
        }

        return index;

    }

    public static void getStudent(ArrayList<Student> arrayList) {
        ArrayList<Integer> index = new ArrayList<Integer> ();
        System.out.println("请输入你了解的学生信息：");
        Scanner sca = new Scanner(System.in);
        String sc = sca.next();

        for (int i = 0; i < arrayList.size(); i++) {
            Student stu =arrayList.get(i);
            if(sc.equals(stu.getAge()) || sc.equals(stu.getSid()) || sc.equals(stu.getName()) || sc.equals(stu.getBirthday())){
                index.add(i);
            }
        }
        if (index.size() == 0){
            System.out.println("未找到相关信息学生！");
        }else{
            System.out.println("学号\t姓名\t年龄\t生日");
            for (int i = 0; i < index.size(); i++) {
                int ind = index.get(i);
                Student stu =arrayList.get(ind);
                System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());

            }
        }
    }

    public static void catStudent(ArrayList<Student> arrayList) {
        System.out.println("-*****************-");
        if (arrayList.size()==0){
            System.out.println("无信息，请添加后重新查询！");
            System.out.println("-*****************-");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu=arrayList.get(i);
            System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
        }
        System.out.println("-*****************-");

    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true ) {
            System.out.println("请输入 学号");
            sid = sc.next();
            int index = getIndex(arrayList,sid);
            if (index == -1){
                break;
            }
        }
        System.out.println("请输入 姓名");
        String name = sc.next();
        System.out.println("请输入 年龄");
        int age = sc.nextInt();
        System.out.println("请输入 生日");

        String birthday = sc.next();
        Student stu = new Student(age, name, sid, birthday);
        arrayList.add(stu);
        System.out.println("添加成功");


    }

}
