package com.study.controller;

/**
 * @Program: MyJavaStudy
 * @ClassName: MyTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-06-06 14:17
 * @Version: V1.0
 */
public class MyTest {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //快速排序


    }
}
