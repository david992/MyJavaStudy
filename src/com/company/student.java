package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        System.out.print("age:");
        int age = sc.nextInt();
        System.out.print("hight:");
        double height = sc.nextDouble();
        System.out.print("name:");
        String name = sc.next();
        System.out.print("sex");
        String SexChar = sc.next();
        char sex = SexChar.charAt(0);
        System.out.print(MessageFormat.format("学生{0}身高{1}性别{2}年龄{3}",name,height,sex,age));

    }

}
