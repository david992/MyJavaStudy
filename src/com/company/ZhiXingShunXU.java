package com.company;

import java.util.Arrays;

/**
 * @Program: test
 * @ClassName: ZhiXingShunXU
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 14:43
 * @Version: V1.0
 */
public class ZhiXingShunXU {
/*
首先加载Test类，因此会执行Test类中的static块。
接着执行new MyClass()，而MyClass类还没有被加载，因此需要加载MyClass类。
在加载MyClass类的时候，发现MyClass类继承自Test类，但是由于Test类已经被加载了，
所以只需要加载MyClass类，那么就会执行MyClass类的中的static块。
在加载完之后，就通过构造器来生成对象。
-***********************-
而在生成对象的时候，必须先初始化父类的成员变量，因此会执行Test中的Person person = new Person()，
-***********************-
而Person类还没有被加载过，因此会先加载Person类并执行Person类中的static块，
接着执行父类的构造器，完成了父类的初始化，然后就来初始化自身了，
因此会接着执行MyClass中的Person person = new Person()，最后执行MyClass的构造器。
* */

}
class test2{
    static{
        System.out.println("test2");
    }
    public void test2(){
        System.out.println("test2构造方法");
    }

}
 class Test {
     {int [] arr = {1,2,3};//静态初始化=
     int [] arr3 = new int[]{1,2};
     String[] arr2 = new String[3];
     arr2[0] = "10";
     arr2[1] = "20";
     arr2[2] = "30";
         System.out.println(Arrays.toString(arr2));}
    // 3先初始化父类的成员变量 创建peson对象时候先加载person类
    Person person = new Person("Test");
    // 111111111
    static{
        System.out.println("父类Test静态块");
    }
    // 6 new MyClass();先初始化父类Test类 调用Test构造方法  6666
    public Test() {
        System.out.println("父类Test构造方法");
    }
     public static void main(String[] args) {
         new MyClass();
     }


}

class Person{
    // 4  444444
    static{
        System.out.println("Person 静态块 ");
    }
    // 5 new Person("Test");person构造方法创建对象 55555  Person 构造方法 Test
    // 8 new Person("MyClass") person构造方法创建对象 8888  Person 构造方法 MyClass
    public Person(String str) {
        System.out.println("Person 构造方法 "+str);
    }
}


class MyClass extends Test {
    // 7 进入这个类的时候创建person对象
    Person person = new Person("MyClass");
    // 22222
    static{
        System.out.println("子类MyClass 静态块");
    }
    //  9  最后调用MyClass类构造方法 创建MyClass对象
    public MyClass() {
        System.out.println("子类MyCclass 构造方法");
    }
}
