package com.company5;

/**
 * @Program: test
 * @ClassName: MyLockTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 20:28
 * @Version: V1.0
 */
public class MyLockTest {
    public static void main(String[] args) {
        MyLock lock =new MyLock();
        Thread th1 = new Thread(lock);
        Thread th2 = new Thread(lock);
        th1.setName("窗口1");
        th2.setName("窗口2");

        th1.start();
        th2.start();

    }
}
