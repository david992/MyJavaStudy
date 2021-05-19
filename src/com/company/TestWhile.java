package com.company;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("上限");
    int len = sc.nextInt();
    int i=0;
    int sum = 0;
    while (i<=len){
        sum += i;
        i++;
    }
    System.out.println(sum);
    }
}
