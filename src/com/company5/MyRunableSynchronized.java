package com.company5;

/**
 * @Program: test
 * @ClassName: Ticket
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 19:23
 * @Version: V1.0
 */
public class  MyRunableSynchronized implements Runnable{
    private  static int ticket = 100;
    @Override
    public void run() {
        while(true ){
            if("窗口1".equals(Thread.currentThread().getName())){
                //synchronized 锁机制 所有操作统一数据的线程使用同一把锁
                synchronized (MyRunableSynchronized.class){
                    if (ticket ==0){
                        break;
                    }else{
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");
                    }
                }
            }
            if("窗口2".equals(Thread.currentThread().getName())){
                Boolean res = synchronizedMethod();
                if(res){
                    break;
                }
            }

        }

    }

    private static synchronized Boolean synchronizedMethod() {
        if(ticket==0){
            return true;
        }else{
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");

            return false;
        }
    }
}
