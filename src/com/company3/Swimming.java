package com.company3;

/**
 * @Program: test
 * @ClassName: Swimming
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-29 09:25
 * @Version: V1.0
 */
public class Swimming {
    public static void main(String[] args) {
        String s1 = "test";
        StringBuilder sb = new StringBuilder("test");
        System.out.println(s1.equals(sb.toString()));
        System.out.println(sb.equals(s1));
        /*
        * 父类引用指向子类
        * 多态*/
        /*
        * 方法1*/
        TestSwimming ts = new TestSwimming(){
            @Override
            public void swim() {
                System.out.println("swimmng");
            }
        };
        //ts.swim();
        goSwimming(ts);

        /*
        * 方法二*/
        goSwimming(new TestSwimming() {
            @Override
            public void swim() {
                System.out.println("swimmng2");

            }
        });
        /*
        * lambda表达式
        * (参数)->{代码块}
        * 参数类型可以省略，多个参数不能只省略一个
        * 只有一个参数可以省略小括号
        * 代码块语句只有一条，可以省略大括号甚至是return
        * */
        goSwimming(()->{System.out.println("lambda表达式！"); });


    }

    /*
    *  使用接口的方法 */
    public static void goSwimming(TestSwimming testswimming){
        testswimming.swim();
    }
}
/*
* 定义接口*/
interface  TestSwimming{
    void swim();
}
