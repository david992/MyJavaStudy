package com.company;

public class TestMethod01 {
    public static void change(int a, int b){
        int t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args){
        int a=10;
        int b = 20;
        System.out.println(a+"------"+b);
        change(a,b);
        System.out.println(a+"------"+b);

    }
}
