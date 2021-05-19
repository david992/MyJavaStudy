package com.china315net8.domain;

/**
 * @Program: test
 * @ClassName: Studen
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-17 11:34
 * @Version: V1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
