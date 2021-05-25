package com.china315net.edu.info.manager.domain;

/**
 * @Program: test
 * @ClassName: Student
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-19 14:56
 * @Version: V1.0
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
