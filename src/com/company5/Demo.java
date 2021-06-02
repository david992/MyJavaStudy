package com.company5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Program: test
 * @ClassName: Demo
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 16:59
 * @Version: V1.0
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //获得当前线程的对象
        String name = Thread.currentThread().getName();

        System.out.println(name);

//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//        my2.start();
//        my1.start();

//        //创建参数对象
//        MyRunable mr = new MyRunable();
//        //创建线程对象并且将参数对象传入
//        Thread tr = new Thread(mr);
//        tr.start();
//
//        MyRunable mr2 = new MyRunable();
//        Thread tr2 = new Thread(mr2);
//        tr2.start();

        MyCallable myCallable = new MyCallable();
        //线程执行之后的类型
        FutureTask<String> ft1 = new FutureTask<>(myCallable);
        Thread thread = new Thread(ft1);


        MyCallable myCallable2 = new MyCallable();
        //线程执行之后的类型
        FutureTask<String> ft2 = new FutureTask<>(myCallable2);
        Thread thread2 = new Thread(ft2);

        //普通线程结束后，守护线程没有继续执行的必要
        thread2.setDaemon(true);
        thread.setName("跑");
        thread2.setName("飞");
        thread.setPriority(1);
        thread2.setPriority(9);

        thread.start();
        thread2.start();



        System.out.println(ft1.get());
        System.out.println(ft2.get());
    }
}
