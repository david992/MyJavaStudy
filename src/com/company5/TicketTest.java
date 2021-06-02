package com.company5;

/**
 * @Program: test
 * @ClassName: TicketTEST
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-02 19:28
 * @Version: V1.0
 */
public class TicketTest {
    public static void main(String[] args) {
        //创建myrunable对象
        Ticket tk = new Ticket();
        Thread th1 = new Thread(tk);
        Thread th2 = new Thread(tk);
        th1.setName("窗口1");
        th2.setName("窗口2");
        th1.start();
        th2.start();
    }
}
