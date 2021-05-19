package com.china315net5;

/**
 * @Program: test
 * @ClassName: TestInterface2
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-11 14:29
 * @Version: V1.0
 */
public interface TestInterface2 {
    //常量
    public static final int NUM =10;
    //抽象方法
    public abstract  void a();
    //public default 修饰的非抽象方法
    public default void b(){
        System.out.println("bbbbbb");
    }
    //静态方法
    public static void d(){
        System.out.println("静态方法");
    };
}
class Test implements TestInterface2 {
    public void c(){
        b();
        TestInterface2.super.b();
    }

    public void a(){
        System.out.println("重写a方法");
    }
    public void b(){

    }
}