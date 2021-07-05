package com.bean;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: Students
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 15:14
 * @Version: V1.0
 */
public class Students {
    private Integer id;
    private Integer age;
    private String name;

    private List<Course> course; //学生所选课程集合

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public Students(Integer id, Integer age, String name, List<Course> course) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public Students(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Students() {
    }
}
