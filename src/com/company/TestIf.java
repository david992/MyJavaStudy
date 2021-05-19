package com.company;

public class TestIf {
    public static void main(String[] args){
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        int num3 = (int)(Math.random()*6)+1;

        int sum = 0;
        sum +=num1;
        sum +=num2;
        sum +=num3;

        if(sum >= 14){
            System.out.println("一等奖");
        }
        else if( 8< sum && sum < 14){
            System.out.println("二等奖");
        }
        else{
            System.out.println("幸运奖");
        }
    }
}
