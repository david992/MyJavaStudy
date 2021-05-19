package com.china315net4;

/**
 * @Program: test
 * @ClassName: TestInterface
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-08 17:11
 * @Version: V1.0
 */

/**
 *            ._
 *       .___（.）<
 *        \___）
 *  ~~~~~~~~~~~~~~~~~~~__>
 * 类是类  接口是接口 同一层次的概念
 * 接口没有构造器
 * 使用interface申明
 * jdk1.8之前 接口之中只有两部分
 *           ：常量 public static final
 *           ：抽象方法 public abstract
 * */

//实现  has-a
public interface TestInterface {
    //常量
    public static final int NUM = 10;
    //抽象方法
    public abstract int a( String name);
    public abstract void eat();
    public abstract void sleep(int num);
}
interface TestInterface02{
    public abstract int b(String name);
    public abstract void shut();
}
class Person{

}
//用类实现接口
//一旦实现一个接口 这个类就要重写接口中全部的抽象方法
//如果没有重写全部抽象方法 那么可以将类变成抽象类
//java单继承  但是有多实现
//      一个类继承其他类，只能直接继承一个父类
//      但是实现接口的话 可以实现多个接口
//      先继承  在实现

class Student extends Person implements TestInterface , TestInterface02{
    @Override
    public int a(String name) {
        return 0;
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep(int num) {
        System.out.println("sleep");
    }

    @Override
    public int b(String name) {
        return 0;
    }

    @Override
    public void shut() {
        System.out.println("shut");
    }
}
class Test{
    public static void main(String[] args) {

        //接口不能创建对象 用类实现接口
        TestInterface t = new Student();
        t.eat();
        System.out.println(TestInterface.NUM);
        Student stu = new Student();
        stu.shut();
    }
}