package com.company3;

/**
 * @Program: test
 * @ClassName: MyFactoriesSum
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-31 10:58
 * @Version: V1.0
 */
public class MyFactoriesSum {
    public static void main(String[] args) {
        int sum = getSum(100);
    }

    private static int getSum(int i) {
        if (i==1){
            return 1;
        }else{
            return i*getSum(i-1);
        }
    }
}
