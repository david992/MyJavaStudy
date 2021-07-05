package com.bean;

/**
 * @Program: MyJavaStudy
 * @ClassName: Person
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 11:39
 * @Version: V1.0
 */
public class Person {
    private Integer id;
    private Integer age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
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

    public Person(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
}
