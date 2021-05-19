package com.company;

import java.util.Scanner;

public class Main{
    public static void  main(String[] args){
        int num1=18;
        System.out.println(num1);
        int num2 =017;
        System.out.println(num2);
        int num3 = 0xA;
        System.out.println(num3);
        char ch = 20013;
        System.out.println(ch);
        final double PI = 3.14;
        //拿到一个扫描器
        Scanner sc = new Scanner(System.in);
        //让扫描器扫描键盘录入的int数据
        System.out.print("请输入半径：");
        int  i = sc.nextInt();
        double c = 2 * PI * i;
        System.out.println(c);
    }

}
//class main1{
//    public static void main1(String[] args){
//        double c = 3.14*2*5;
//        System.out.println(c);
//    }
//}

