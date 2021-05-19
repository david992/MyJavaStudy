package com.company2;

/**
 * @Program: test
 * @ClassName: Person
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-28 09:41
 * @Version: V1.0
 */
public class Person {
    int age;
    String name;
    double height;

    //封装
    private double weight;
    private int sno;
    private String sex;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }



    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if ( weight >= 100.0 ) {
            this.weight = 99;
        }else{
            this.weight=weight;
        }
    }

    public Person(){
    }
    public Person(int age, String name,double height){
        this.age=age;
        this.height=height;
        this.name=name;
    }
    public Person(int age, String name,String sex){
        this.age=age;
        this.height=height;
        this.setSex(sex);
    }

    public void speak() {
        int age = 10;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println("说我"+this.age+"岁");

    }
}
