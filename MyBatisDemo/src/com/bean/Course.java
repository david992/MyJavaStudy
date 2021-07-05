package com.bean;

/**
 * @Program: MyJavaStudy
 * @ClassName: Course
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-02 09:50
 * @Version: V1.0
 */
public class Course {
    //课程表
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }
}
