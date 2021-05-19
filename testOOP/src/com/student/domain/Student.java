package com.student.domain;

/**
 * @Program: test
 * @ClassName: Student
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-17 15:52
 * @Version: V1.0
 */
public class Student {
    private int age;
    private String name;
    private String sid;
    private String birthday;

    public Student() {
    }

    public Student(int age, String name, String sid, String birthday) {
        this.age = age;
        this.name = name;
        this.sid = sid;
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
