package com.company;

import java.text.MessageFormat;

public class ChengFa {
    public static void main(String[] args){
        int i = 1;
        int j ;
//        for(i = 1;i<=9;i++){
        while (i <= 9) {
            j=1;
            while (j <= i) {
                System.out.printf(MessageFormat.format("{0}*{1}={2} ", i,j,i*j));
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("__________________________");
        for(int m = 9;m>=1;m--){
            for (int n = 1;n<=m;n++){
//                System.out.print(m +"*"+n+"="+m*n+" " );
                System.out.print(MessageFormat.format("{0}*{1}={2} ",m,n,m*n));
            }
            System.out.println();
        }
        System.out.println("__________________________");
        for(int p=1;p<=5;p++) {
            for (int b = 1; b <= (9 - p); b++) {
                System.out.print(" ");
            }
            for (int b=1;b<=(2*p-1);b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("__________________________");
        int size = 9;
        int start = size/2+1;
        int end = size/2+1;
        boolean  flag = true;
        for (int jj=1;jj<=size;jj++){
            for (int ii = 1;ii<=size;ii++){
                if ( ii ==start || ii==end){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (end == size){
                flag = false;
            }
            if(flag){
                start--;
                end++;
            }else{
                end--;
                start++;
            }
        }
    }
}
