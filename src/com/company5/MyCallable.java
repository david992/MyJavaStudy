package com.company5;

import java.util.concurrent.Callable;

/**
 * @Program: test
 * @ClassName: MyCallable
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 17:11
 * @Version: V1.0
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("mycallable-->"+Thread.currentThread().getName()+i);
        }
        return "ok";
    }
}
