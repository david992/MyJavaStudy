package com.company5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Program: test
 * @ClassName: MyLock
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 20:21
 * @Version: V1.0
 */
public class MyLock implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if (ticket <=0 ){
                    break;
                }else {
                        Thread.sleep(10);
                    ticket --;
                    System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
