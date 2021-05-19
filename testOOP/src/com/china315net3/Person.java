package com.china315net3;

/**
 * @Program: test
 * @ClassName: Person
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-08 14:23
 * @Version: V1.0
 */
public abstract class Person {
    //不需要重写的方法
    public void eat(){
        System.out.println("一顿不吃饿得慌");
    }
    //需要重写的方法 去掉方法体 用abstract修饰
    public abstract void sleep();
    public abstract void speak();
}

//抽象类可以被其他类继承
//一个类继承一个抽象类 那么这个类可以变成抽象类
//子类如果没有全部重写抽象方法  那么可以用abstract修饰
 abstract class  Teacher extends Person{

}
//子类继承抽象类 就必须重写父类所有的抽象方法
//一般子类不加abstract修饰 会让子类重写所有父类中的抽象方法

class Student extends Person {
     @Override
     public void sleep() {
         System.out.println("东北人睡大炕");
     }

    @Override
    public void speak() {
        System.out.println("东北人说东北话");

    }
}
class demo{
    public static void main(String[] args) {
        //抽象类不可以创建对象
        //创建子类对象
        Student stu = new Student();
        stu.sleep();
        stu.speak();
    }
}