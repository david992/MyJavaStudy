package com.studentservlet;

import java.util.Arrays;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2021/6/722:46
 */
public class Student {
    private  String username;
    private  String age;
    private  String grade;
    private String[] hobbies;

    public Student(String username, String age, String grade, String[] hobbies) {
        this.username = username;
        this.age = age;
        this.grade = grade;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", grade='" + grade + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Student() {

    }
}

