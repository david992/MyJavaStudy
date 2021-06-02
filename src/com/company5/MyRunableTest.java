package com.company5;

/**
 * @Program: test
 * @ClassName: MyRunableTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 20:13
 * @Version: V1.0
 */
public class MyRunableTest {
    public static void main(String[] args) {
        MyRunableSynchronized myrun = new MyRunableSynchronized();
        Thread th1 = new Thread(myrun);
        Thread th2 = new Thread(myrun);
        th1.setName("窗口1");
        th2.setName("窗口2");

        th1.start();
        th2.start();
    }
}
