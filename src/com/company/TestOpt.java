package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

public class TestOpt {
    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.print("请输入整数:");
//        if(sc.hasNextInt()==true){
//        try{
//            int num = sc.nextInt();
//            int count = 0;
//            while (num != 0  ){
//              num = num / 10;
//              count++;
//            }
//            System.out.print(MessageFormat.format("输入的是:{0}",count));
//        }
//        catch (Exception e){
//            System.out.print("重新输入:");
//            e.printStackTrace();
//        };}else{
//            System.out.print("请输入整数！");
//        }
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入小朋友年纪：");
    int age = sc.nextInt();
    if (age > 7 ){
        System.out.println("ok");
    }else if (age >5){
//        System.out.print("请输入性别： 男孩：1，女孩：2");
//        int sex =sc.nextInt();
        System.out.print("请输入性别： 男孩：男，女孩：女");
        String str =sc.next();
        char sex = str.charAt(0);
        if (sex == 1){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
    }else{
        System.out.println("你还是太小了");
    }

    }
}
