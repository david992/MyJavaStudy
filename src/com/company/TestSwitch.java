package com.company;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("分数:");
        int score = sc.nextInt();
        switch(score / 10){
            case 10 :System.out.println("A");break;
            case 9 :System.out.println("B");break;
            case 8 :System.out.println("C");break;
            case 7 :
            case 6 :
            case 5 :
            case 4 :
            case 3 :
            case 2 :
            case 1 :
            case 0 :System.out.println("D");break;
            default:System.out.println("error");
        }

    }
}
