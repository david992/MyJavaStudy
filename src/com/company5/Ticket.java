package com.company5;

/**
 * @Program: test
 * @ClassName: Ticket
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 19:23
 * @Version: V1.0
 */
public class Ticket implements Runnable{
    private  static int ticket = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true ){
            //synchronized 锁机制 所有操作统一数据的线程使用同一把锁
            synchronized (obj){
                if (ticket ==0){
                    break;
                }else{
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");
                }
            }
        }

    }
}
