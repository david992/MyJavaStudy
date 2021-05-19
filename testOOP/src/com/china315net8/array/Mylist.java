package com.china315net8.array;

import com.china315net8.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: Mylist
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-17 11:52
 * @Version: V1.0
 */
public class Mylist {
    public static void main(String[] args) {

        Myremove();
        //Myset();
        //Myget();



        // getStudentArrayList();
        //Mysize();
    }

    private static void Mysize() {
        ArrayList<Student> stus = new ArrayList<>();

        Student stu1 = new Student("aaa", 12);
        Student stu2 = new Student("bbb", 12);
        Student stu3 = new Student("ccc", 12);
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        for(int i = 0 ;i<stus.size();i++){
            Student stu = stus.get(i);
            System.out.println(stu.getName()+"-****-"+stu.getAge());
         }
    }

    private static void getStudentArrayList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int i1 = sc.nextInt();
        ArrayList<Student> stus = new ArrayList<>();
        for (int i = 0; i < i1; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生姓名：");
            String name = sc.next();
            System.out.print("请输入第" + (i + 1) + "个学生年龄：");
            int i2 = sc.nextInt();
            Student stu = new Student(name, i2);
            stus.add(stu);
            System.out.println("第" + (i + 1 )+ "个学生姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
    }

    private static void Myget() {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("0000");
        arr.add("1111");
        arr.add("2222");
        arr.add("3333");
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            System.out.println(s);
        }
        String s = arr.get(1);//返回索引出元素值
        System.out.println(s);
        int size = arr.size();//返回集合中元素的个数
        System.out.println(size);
    }

    private static void Myset() {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("0000");
        arr.add("1111");
        arr.add("2222");
        arr.add("3333");
        String S = arr.set(1, "qqqqqqqqqqqqqqqqq");//返回修改前的元素
        System.out.println(arr);
        System.out.println(S);
    }

    private static void Myremove() {
        // <> 泛型 指定集合里面数据类型 不写的话就不限制类型
        ArrayList <String> arr = new ArrayList<>();
        arr.add("0000");
        arr.add("1111");
        arr.add("test");
        arr.add("test");
        arr.add("test");
        arr.add("2222");
        arr.add("3333");
        arr.add("4444");
        arr.add("test");
        arr.add("5555");
        arr.add("6666");
        arr.add("test");
        System.out.println(arr);
        arr.add(2,"adddddddd");
        System.out.println(arr);
        String  s  =  arr.remove(3);//返回被删除的元素
        boolean tf = arr.remove("2222");//返回是否有元素被删除
        for (int i = 0; i < arr.size(); i++) {
            String s1 = arr.get(i);
            if ("test".equals(s1)){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
