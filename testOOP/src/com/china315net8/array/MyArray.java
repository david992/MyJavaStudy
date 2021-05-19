package com.china315net8.array;


import com.china315net8.domain.Student;

/**
 * @Program: test
 * @ClassName: MyArray
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-17 11:32
 * @Version: V1.0
 */
public class MyArray {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1= new Student("张三",17);
        Student stu2= new Student("张三",17);
        Student stu3= new Student("张三",17);
        arr[0]=stu1;
        arr[1]=stu2;
        arr[3]=stu3;
        for (int i=0 ;i<arr.length;i++){
            Student temp =  arr[i];
            System.out.println(temp.getName());

        }
    }
}
