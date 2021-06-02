package com.company3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @Program: test
 * @ClassName: MyBubbleSort
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-31 10:39
 * @Version: V1.0
 */
public class MyBubbleSort {
    /**
     * 冒泡排序*/
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        //次数限制
        //bubbleSort(arr);
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right){
            return ;
        }
        int left0 = left;
        int right0 = right;
        int baseNumber = arr[left0];
        while(left != right){
            //从右边找比基数小的
            while(arr[right] >= baseNumber && right >left){
                right--;
            }
            //从左边找比基数大的
            while (arr[left] <= baseNumber && right > left){
                left++;
            }

            //交换位置
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
        quickSort(arr,left0,left-1);
        quickSort(arr,left+1,right0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for(int j = 0; j< arr.length-1; j++){
            //索引不超过长度
            for (int i = 0; i < arr.length - 1-j; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
