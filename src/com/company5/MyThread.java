package com.company5;

/**
 * @Program: test
 * @ClassName: MyThread
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 16:58
 * @Version: V1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@@@@"+i);
        }
    }
}
