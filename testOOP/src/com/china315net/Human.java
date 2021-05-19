package com.china315net;

/**
 * @Program: test
 * @ClassName: Human
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-28 15:37
 * @Version: V1.0
 */
public class Human {
    private int age;
    private String name;
    private double height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void eat(){
        System.out.println("eat*********************");
    }
    public void sleep(){
        System.out.println("sleep*********************");
    }
    public void speak(){
        System.out.println("speak*********************");
    }
}
