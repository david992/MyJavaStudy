package com.company5;

/**
 * @Program: test
 * @ClassName: MyRunable
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 17:06
 * @Version: V1.0
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunable-->"+i);
        }
    }
}
