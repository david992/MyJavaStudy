package com.bean;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: Classes
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 15:14
 * @Version: V1.0
 */
public class Classes {
    private Integer id;
    private String name;
    private List<Students> students;

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
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

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public Classes(Integer id, String name, List<Students> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Classes() {
    }
}
